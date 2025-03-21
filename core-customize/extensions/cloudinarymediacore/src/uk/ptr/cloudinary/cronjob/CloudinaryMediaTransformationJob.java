package uk.ptr.cloudinary.cronjob;

import de.hybris.platform.catalog.CatalogVersionService;
import de.hybris.platform.catalog.model.CatalogVersionModel;
import de.hybris.platform.catalog.model.classification.ClassificationSystemModel;
import de.hybris.platform.catalog.synchronization.CatalogSynchronizationService;
import de.hybris.platform.core.model.media.MediaContainerModel;
import de.hybris.platform.core.model.media.MediaFormatModel;
import de.hybris.platform.core.model.media.MediaModel;
import de.hybris.platform.core.model.model.CloudinaryMediaTransformationJobModel;
import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.mediaconversion.MediaConversionService;
import de.hybris.platform.mediaconversion.model.ConversionGroupModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.BooleanUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.ObjectUtils;
import uk.ptr.cloudinary.constants.CloudinarymediacoreConstants;
import uk.ptr.cloudinary.dao.CloudinaryConfigDao;
import uk.ptr.cloudinary.dao.CloudinaryMediaContainerDao;
import uk.ptr.cloudinary.model.CloudinaryConfigModel;

import javax.annotation.Resource;
import java.util.*;


public class CloudinaryMediaTransformationJob extends AbstractJobPerformable<CloudinaryMediaTransformationJobModel> {

    private static final Logger LOG = LoggerFactory.getLogger(CloudinaryMediaTransformationJob.class);

    @Resource
    private CloudinaryConfigDao cloudinaryConfigDao;

    @Resource
    private CatalogVersionService catalogVersionService;

    @Resource
    private CloudinaryMediaContainerDao cloudinaryMediaContainerDao;

    @Resource
    private CatalogSynchronizationService catalogSynchronizationService;

    @Resource
    private MediaConversionService mediaConversionService;

    @Override
    public PerformResult perform(CloudinaryMediaTransformationJobModel cloudinaryMediaTransformationJobModel) {

     Collection<CatalogVersionModel> catalogVersions = cloudinaryMediaTransformationJobModel.getCatalogVersions();
      try {
          if (CollectionUtils.isNotEmpty(catalogVersions)) {
              CloudinaryConfigModel cloudinaryConfigModel = cloudinaryConfigDao.getCloudinaryConfigModel();

              if (!ObjectUtils.isEmpty(cloudinaryConfigModel) && BooleanUtils.isTrue(cloudinaryConfigModel.getEnableCloudinary())) {
                  catalogVersions.forEach(catalogVersion -> {

                      List<MediaContainerModel> mediaContainerModels = cloudinaryMediaContainerDao.findMediaContainerByCatalogVersion(catalogVersion);
                      if (CollectionUtils.isNotEmpty(mediaContainerModels)) {
                          mediaContainerModels.forEach(this::updateMedia);
                      }
                      if (!(catalogVersion.getCatalog() instanceof ClassificationSystemModel)) {
                          CatalogVersionModel onlineVersion = catalogVersionService.getCatalogVersion(
                                  catalogVersion.getCatalog().getId(), CloudinarymediacoreConstants.VERSION_ONLINE);
                          catalogSynchronizationService.synchronizeFullyInBackground(catalogVersion, onlineVersion);
                      }
                  });
              }
          }
          return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
      }
      catch (Exception e) {
                LOG.error("Exception occurred while running job " + e.getMessage() , e);
                return new PerformResult(CronJobResult.ERROR, CronJobStatus.ABORTED);
            }
        }

    private void updateMedia(MediaContainerModel mediaContainer) {
        MediaModel mediaModel = getMasterImage(mediaContainer);

        if(mediaModel != null)
        {
            Set<MediaFormatModel> mediaFormats = new HashSet<>();
            for (MediaModel medias : mediaContainer.getMedias()) {
                if (medias.getMediaFormat() != null)
                    mediaFormats.add(medias.getMediaFormat());
            }

            ConversionGroupModel conversionGroupModel;
            if (mediaContainer.getConversionGroup() == null) {
                conversionGroupModel = this.modelService.create(ConversionGroupModel.class);
                conversionGroupModel.setCode(UUID.randomUUID().toString());
            } else {
                conversionGroupModel = mediaContainer.getConversionGroup();
                mediaFormats.addAll(conversionGroupModel.getSupportedMediaFormats());
            }

            conversionGroupModel.setSupportedMediaFormats(mediaFormats);
            modelService.save(conversionGroupModel);
            mediaContainer.setConversionGroup(conversionGroupModel);

            modelService.save(mediaContainer);


            mediaConversionService.convertMedias(mediaContainer);

        }
    }

    private MediaModel getMasterImage(MediaContainerModel mediaContainerModel){

        Collection<MediaModel> medias  = mediaContainerModel.getMedias();
        for (MediaModel media : medias) {
            if(media.getMediaFormat() == null && media.getCloudinaryURL()!=null)
            {
                return media;
            }
        }
        return null;
    }

    @Override
    public boolean isAbortable() {
        return true;
    }

}

