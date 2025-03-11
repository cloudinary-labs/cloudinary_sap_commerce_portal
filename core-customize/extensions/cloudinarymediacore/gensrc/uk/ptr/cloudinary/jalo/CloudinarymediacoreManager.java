/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 11 Mar 2025, 13:09:50                       ---
 * ----------------------------------------------------------------
 */
package uk.ptr.cloudinary.jalo;

import de.hybris.platform.catalog.jalo.CatalogVersion;
import de.hybris.platform.category.jalo.Category;
import de.hybris.platform.core.model.CloudinaryMediaTagUpdateJob;
import de.hybris.platform.core.model.CloudinaryMediaTransformationJob;
import de.hybris.platform.core.model.CloudinaryMediaUploadSyncJob;
import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloInvalidParameterException;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.extension.ExtensionManager;
import de.hybris.platform.jalo.link.Link;
import de.hybris.platform.jalo.media.AbstractMedia;
import de.hybris.platform.jalo.media.Media;
import de.hybris.platform.jalo.media.MediaFormat;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.mediaconversion.jalo.ConversionErrorLog;
import de.hybris.platform.mediaconversion.jalo.ConversionGroup;
import de.hybris.platform.util.Utilities;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import uk.ptr.cloudinary.constants.CloudinarymediacoreConstants;
import uk.ptr.cloudinary.jalo.CloudinaryConfig;
import uk.ptr.cloudinary.jalo.Preset;

/**
 * Generated class for type <code>CloudinarymediacoreManager</code>.
 */
@SuppressWarnings({"unused","cast"})
@SLDSafe
public class CloudinarymediacoreManager extends Extension
{
	/** Relation ordering override parameter constants for ConversionGroupToMediaFormatRel from ((cloudinarymediacore))*/
	protected static String CONVERSIONGROUPTOMEDIAFORMATREL_SRC_ORDERED = "relation.ConversionGroupToMediaFormatRel.source.ordered";
	protected static String CONVERSIONGROUPTOMEDIAFORMATREL_TGT_ORDERED = "relation.ConversionGroupToMediaFormatRel.target.ordered";
	/** Relation disable markmodifed parameter constants for ConversionGroupToMediaFormatRel from ((cloudinarymediacore))*/
	protected static String CONVERSIONGROUPTOMEDIAFORMATREL_MARKMODIFIED = "relation.ConversionGroupToMediaFormatRel.markmodified";
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("cloudinaryResourceType", AttributeMode.INITIAL);
		tmp.put("cloudinaryType", AttributeMode.INITIAL);
		tmp.put("cloudinaryTransformation", AttributeMode.INITIAL);
		tmp.put("cloudinaryPublicId", AttributeMode.INITIAL);
		tmp.put("cloudinaryVersion", AttributeMode.INITIAL);
		tmp.put("cloudinaryFetchURL", AttributeMode.INITIAL);
		tmp.put("cloudinaryMediaFormat", AttributeMode.INITIAL);
		tmp.put("isCloudinaryFetch", AttributeMode.INITIAL);
		tmp.put("isCloudinaryOverride", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.media.Media", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("targetMediaFormat", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.mediaconversion.jalo.ConversionErrorLog", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("cloudinaryImageTransformation", AttributeMode.INITIAL);
		tmp.put("cloudinaryVideoTransformation", AttributeMode.INITIAL);
		tmp.put("isCloudinaryOverride", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.category.jalo.Category", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("cloudinaryImageTransformation", AttributeMode.INITIAL);
		tmp.put("cloudinaryVideoTransformation", AttributeMode.INITIAL);
		tmp.put("isCloudinaryOverride", AttributeMode.INITIAL);
		tmp.put("cloudinaryImageSpinTag", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("mediaMimeType", AttributeMode.INITIAL);
		tmp.put("transformation", AttributeMode.INITIAL);
		tmp.put("transformationStrategy", AttributeMode.INITIAL);
		tmp.put("inputMediaFormat", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.media.MediaFormat", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("cloudinaryMediaUploadSyncJob", AttributeMode.INITIAL);
		tmp.put("cloudinaryMediaTransformationJob", AttributeMode.INITIAL);
		tmp.put("cloudinaryMediaTagUpdateJob", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.catalog.jalo.CatalogVersion", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.cloudinaryFetchURL</code> attribute.
	 * @return the cloudinaryFetchURL
	 */
	public String getCloudinaryFetchURL(final SessionContext ctx, final Media item)
	{
		return (String)item.getProperty( ctx, CloudinarymediacoreConstants.Attributes.Media.CLOUDINARYFETCHURL);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.cloudinaryFetchURL</code> attribute.
	 * @return the cloudinaryFetchURL
	 */
	public String getCloudinaryFetchURL(final Media item)
	{
		return getCloudinaryFetchURL( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.cloudinaryFetchURL</code> attribute. 
	 * @param value the cloudinaryFetchURL
	 */
	public void setCloudinaryFetchURL(final SessionContext ctx, final Media item, final String value)
	{
		item.setProperty(ctx, CloudinarymediacoreConstants.Attributes.Media.CLOUDINARYFETCHURL,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.cloudinaryFetchURL</code> attribute. 
	 * @param value the cloudinaryFetchURL
	 */
	public void setCloudinaryFetchURL(final Media item, final String value)
	{
		setCloudinaryFetchURL( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.cloudinaryImageSpinTag</code> attribute.
	 * @return the cloudinaryImageSpinTag
	 */
	public String getCloudinaryImageSpinTag(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, CloudinarymediacoreConstants.Attributes.Product.CLOUDINARYIMAGESPINTAG);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.cloudinaryImageSpinTag</code> attribute.
	 * @return the cloudinaryImageSpinTag
	 */
	public String getCloudinaryImageSpinTag(final Product item)
	{
		return getCloudinaryImageSpinTag( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.cloudinaryImageSpinTag</code> attribute. 
	 * @param value the cloudinaryImageSpinTag
	 */
	public void setCloudinaryImageSpinTag(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, CloudinarymediacoreConstants.Attributes.Product.CLOUDINARYIMAGESPINTAG,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.cloudinaryImageSpinTag</code> attribute. 
	 * @param value the cloudinaryImageSpinTag
	 */
	public void setCloudinaryImageSpinTag(final Product item, final String value)
	{
		setCloudinaryImageSpinTag( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Category.cloudinaryImageTransformation</code> attribute.
	 * @return the cloudinaryImageTransformation
	 */
	public String getCloudinaryImageTransformation(final SessionContext ctx, final Category item)
	{
		return (String)item.getProperty( ctx, CloudinarymediacoreConstants.Attributes.Category.CLOUDINARYIMAGETRANSFORMATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Category.cloudinaryImageTransformation</code> attribute.
	 * @return the cloudinaryImageTransformation
	 */
	public String getCloudinaryImageTransformation(final Category item)
	{
		return getCloudinaryImageTransformation( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Category.cloudinaryImageTransformation</code> attribute. 
	 * @param value the cloudinaryImageTransformation
	 */
	public void setCloudinaryImageTransformation(final SessionContext ctx, final Category item, final String value)
	{
		item.setProperty(ctx, CloudinarymediacoreConstants.Attributes.Category.CLOUDINARYIMAGETRANSFORMATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Category.cloudinaryImageTransformation</code> attribute. 
	 * @param value the cloudinaryImageTransformation
	 */
	public void setCloudinaryImageTransformation(final Category item, final String value)
	{
		setCloudinaryImageTransformation( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.cloudinaryImageTransformation</code> attribute.
	 * @return the cloudinaryImageTransformation
	 */
	public String getCloudinaryImageTransformation(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, CloudinarymediacoreConstants.Attributes.Product.CLOUDINARYIMAGETRANSFORMATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.cloudinaryImageTransformation</code> attribute.
	 * @return the cloudinaryImageTransformation
	 */
	public String getCloudinaryImageTransformation(final Product item)
	{
		return getCloudinaryImageTransformation( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.cloudinaryImageTransformation</code> attribute. 
	 * @param value the cloudinaryImageTransformation
	 */
	public void setCloudinaryImageTransformation(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, CloudinarymediacoreConstants.Attributes.Product.CLOUDINARYIMAGETRANSFORMATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.cloudinaryImageTransformation</code> attribute. 
	 * @param value the cloudinaryImageTransformation
	 */
	public void setCloudinaryImageTransformation(final Product item, final String value)
	{
		setCloudinaryImageTransformation( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.cloudinaryMediaFormat</code> attribute.
	 * @return the cloudinaryMediaFormat
	 */
	public String getCloudinaryMediaFormat(final SessionContext ctx, final Media item)
	{
		return (String)item.getProperty( ctx, CloudinarymediacoreConstants.Attributes.Media.CLOUDINARYMEDIAFORMAT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.cloudinaryMediaFormat</code> attribute.
	 * @return the cloudinaryMediaFormat
	 */
	public String getCloudinaryMediaFormat(final Media item)
	{
		return getCloudinaryMediaFormat( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.cloudinaryMediaFormat</code> attribute. 
	 * @param value the cloudinaryMediaFormat
	 */
	public void setCloudinaryMediaFormat(final SessionContext ctx, final Media item, final String value)
	{
		item.setProperty(ctx, CloudinarymediacoreConstants.Attributes.Media.CLOUDINARYMEDIAFORMAT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.cloudinaryMediaFormat</code> attribute. 
	 * @param value the cloudinaryMediaFormat
	 */
	public void setCloudinaryMediaFormat(final Media item, final String value)
	{
		setCloudinaryMediaFormat( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CatalogVersion.cloudinaryMediaTagUpdateJob</code> attribute.
	 * @return the cloudinaryMediaTagUpdateJob
	 */
	public CloudinaryMediaTagUpdateJob getCloudinaryMediaTagUpdateJob(final SessionContext ctx, final CatalogVersion item)
	{
		return (CloudinaryMediaTagUpdateJob)item.getProperty( ctx, CloudinarymediacoreConstants.Attributes.CatalogVersion.CLOUDINARYMEDIATAGUPDATEJOB);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CatalogVersion.cloudinaryMediaTagUpdateJob</code> attribute.
	 * @return the cloudinaryMediaTagUpdateJob
	 */
	public CloudinaryMediaTagUpdateJob getCloudinaryMediaTagUpdateJob(final CatalogVersion item)
	{
		return getCloudinaryMediaTagUpdateJob( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CatalogVersion.cloudinaryMediaTagUpdateJob</code> attribute. 
	 * @param value the cloudinaryMediaTagUpdateJob
	 */
	public void setCloudinaryMediaTagUpdateJob(final SessionContext ctx, final CatalogVersion item, final CloudinaryMediaTagUpdateJob value)
	{
		item.setProperty(ctx, CloudinarymediacoreConstants.Attributes.CatalogVersion.CLOUDINARYMEDIATAGUPDATEJOB,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CatalogVersion.cloudinaryMediaTagUpdateJob</code> attribute. 
	 * @param value the cloudinaryMediaTagUpdateJob
	 */
	public void setCloudinaryMediaTagUpdateJob(final CatalogVersion item, final CloudinaryMediaTagUpdateJob value)
	{
		setCloudinaryMediaTagUpdateJob( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CatalogVersion.cloudinaryMediaTransformationJob</code> attribute.
	 * @return the cloudinaryMediaTransformationJob
	 */
	public CloudinaryMediaTransformationJob getCloudinaryMediaTransformationJob(final SessionContext ctx, final CatalogVersion item)
	{
		return (CloudinaryMediaTransformationJob)item.getProperty( ctx, CloudinarymediacoreConstants.Attributes.CatalogVersion.CLOUDINARYMEDIATRANSFORMATIONJOB);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CatalogVersion.cloudinaryMediaTransformationJob</code> attribute.
	 * @return the cloudinaryMediaTransformationJob
	 */
	public CloudinaryMediaTransformationJob getCloudinaryMediaTransformationJob(final CatalogVersion item)
	{
		return getCloudinaryMediaTransformationJob( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CatalogVersion.cloudinaryMediaTransformationJob</code> attribute. 
	 * @param value the cloudinaryMediaTransformationJob
	 */
	public void setCloudinaryMediaTransformationJob(final SessionContext ctx, final CatalogVersion item, final CloudinaryMediaTransformationJob value)
	{
		item.setProperty(ctx, CloudinarymediacoreConstants.Attributes.CatalogVersion.CLOUDINARYMEDIATRANSFORMATIONJOB,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CatalogVersion.cloudinaryMediaTransformationJob</code> attribute. 
	 * @param value the cloudinaryMediaTransformationJob
	 */
	public void setCloudinaryMediaTransformationJob(final CatalogVersion item, final CloudinaryMediaTransformationJob value)
	{
		setCloudinaryMediaTransformationJob( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CatalogVersion.cloudinaryMediaUploadSyncJob</code> attribute.
	 * @return the cloudinaryMediaUploadSyncJob
	 */
	public CloudinaryMediaUploadSyncJob getCloudinaryMediaUploadSyncJob(final SessionContext ctx, final CatalogVersion item)
	{
		return (CloudinaryMediaUploadSyncJob)item.getProperty( ctx, CloudinarymediacoreConstants.Attributes.CatalogVersion.CLOUDINARYMEDIAUPLOADSYNCJOB);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CatalogVersion.cloudinaryMediaUploadSyncJob</code> attribute.
	 * @return the cloudinaryMediaUploadSyncJob
	 */
	public CloudinaryMediaUploadSyncJob getCloudinaryMediaUploadSyncJob(final CatalogVersion item)
	{
		return getCloudinaryMediaUploadSyncJob( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CatalogVersion.cloudinaryMediaUploadSyncJob</code> attribute. 
	 * @param value the cloudinaryMediaUploadSyncJob
	 */
	public void setCloudinaryMediaUploadSyncJob(final SessionContext ctx, final CatalogVersion item, final CloudinaryMediaUploadSyncJob value)
	{
		item.setProperty(ctx, CloudinarymediacoreConstants.Attributes.CatalogVersion.CLOUDINARYMEDIAUPLOADSYNCJOB,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CatalogVersion.cloudinaryMediaUploadSyncJob</code> attribute. 
	 * @param value the cloudinaryMediaUploadSyncJob
	 */
	public void setCloudinaryMediaUploadSyncJob(final CatalogVersion item, final CloudinaryMediaUploadSyncJob value)
	{
		setCloudinaryMediaUploadSyncJob( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.cloudinaryPublicId</code> attribute.
	 * @return the cloudinaryPublicId
	 */
	public String getCloudinaryPublicId(final SessionContext ctx, final Media item)
	{
		return (String)item.getProperty( ctx, CloudinarymediacoreConstants.Attributes.Media.CLOUDINARYPUBLICID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.cloudinaryPublicId</code> attribute.
	 * @return the cloudinaryPublicId
	 */
	public String getCloudinaryPublicId(final Media item)
	{
		return getCloudinaryPublicId( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.cloudinaryPublicId</code> attribute. 
	 * @param value the cloudinaryPublicId
	 */
	public void setCloudinaryPublicId(final SessionContext ctx, final Media item, final String value)
	{
		item.setProperty(ctx, CloudinarymediacoreConstants.Attributes.Media.CLOUDINARYPUBLICID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.cloudinaryPublicId</code> attribute. 
	 * @param value the cloudinaryPublicId
	 */
	public void setCloudinaryPublicId(final Media item, final String value)
	{
		setCloudinaryPublicId( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.cloudinaryResourceType</code> attribute.
	 * @return the cloudinaryResourceType
	 */
	public String getCloudinaryResourceType(final SessionContext ctx, final Media item)
	{
		return (String)item.getProperty( ctx, CloudinarymediacoreConstants.Attributes.Media.CLOUDINARYRESOURCETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.cloudinaryResourceType</code> attribute.
	 * @return the cloudinaryResourceType
	 */
	public String getCloudinaryResourceType(final Media item)
	{
		return getCloudinaryResourceType( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.cloudinaryResourceType</code> attribute. 
	 * @param value the cloudinaryResourceType
	 */
	public void setCloudinaryResourceType(final SessionContext ctx, final Media item, final String value)
	{
		item.setProperty(ctx, CloudinarymediacoreConstants.Attributes.Media.CLOUDINARYRESOURCETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.cloudinaryResourceType</code> attribute. 
	 * @param value the cloudinaryResourceType
	 */
	public void setCloudinaryResourceType(final Media item, final String value)
	{
		setCloudinaryResourceType( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.cloudinaryTransformation</code> attribute.
	 * @return the cloudinaryTransformation
	 */
	public String getCloudinaryTransformation(final SessionContext ctx, final Media item)
	{
		return (String)item.getProperty( ctx, CloudinarymediacoreConstants.Attributes.Media.CLOUDINARYTRANSFORMATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.cloudinaryTransformation</code> attribute.
	 * @return the cloudinaryTransformation
	 */
	public String getCloudinaryTransformation(final Media item)
	{
		return getCloudinaryTransformation( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.cloudinaryTransformation</code> attribute. 
	 * @param value the cloudinaryTransformation
	 */
	public void setCloudinaryTransformation(final SessionContext ctx, final Media item, final String value)
	{
		item.setProperty(ctx, CloudinarymediacoreConstants.Attributes.Media.CLOUDINARYTRANSFORMATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.cloudinaryTransformation</code> attribute. 
	 * @param value the cloudinaryTransformation
	 */
	public void setCloudinaryTransformation(final Media item, final String value)
	{
		setCloudinaryTransformation( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.cloudinaryType</code> attribute.
	 * @return the cloudinaryType
	 */
	public String getCloudinaryType(final SessionContext ctx, final Media item)
	{
		return (String)item.getProperty( ctx, CloudinarymediacoreConstants.Attributes.Media.CLOUDINARYTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.cloudinaryType</code> attribute.
	 * @return the cloudinaryType
	 */
	public String getCloudinaryType(final Media item)
	{
		return getCloudinaryType( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.cloudinaryType</code> attribute. 
	 * @param value the cloudinaryType
	 */
	public void setCloudinaryType(final SessionContext ctx, final Media item, final String value)
	{
		item.setProperty(ctx, CloudinarymediacoreConstants.Attributes.Media.CLOUDINARYTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.cloudinaryType</code> attribute. 
	 * @param value the cloudinaryType
	 */
	public void setCloudinaryType(final Media item, final String value)
	{
		setCloudinaryType( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.cloudinaryVersion</code> attribute.
	 * @return the cloudinaryVersion
	 */
	public String getCloudinaryVersion(final SessionContext ctx, final Media item)
	{
		return (String)item.getProperty( ctx, CloudinarymediacoreConstants.Attributes.Media.CLOUDINARYVERSION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.cloudinaryVersion</code> attribute.
	 * @return the cloudinaryVersion
	 */
	public String getCloudinaryVersion(final Media item)
	{
		return getCloudinaryVersion( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.cloudinaryVersion</code> attribute. 
	 * @param value the cloudinaryVersion
	 */
	public void setCloudinaryVersion(final SessionContext ctx, final Media item, final String value)
	{
		item.setProperty(ctx, CloudinarymediacoreConstants.Attributes.Media.CLOUDINARYVERSION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.cloudinaryVersion</code> attribute. 
	 * @param value the cloudinaryVersion
	 */
	public void setCloudinaryVersion(final Media item, final String value)
	{
		setCloudinaryVersion( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Category.cloudinaryVideoTransformation</code> attribute.
	 * @return the cloudinaryVideoTransformation
	 */
	public String getCloudinaryVideoTransformation(final SessionContext ctx, final Category item)
	{
		return (String)item.getProperty( ctx, CloudinarymediacoreConstants.Attributes.Category.CLOUDINARYVIDEOTRANSFORMATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Category.cloudinaryVideoTransformation</code> attribute.
	 * @return the cloudinaryVideoTransformation
	 */
	public String getCloudinaryVideoTransformation(final Category item)
	{
		return getCloudinaryVideoTransformation( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Category.cloudinaryVideoTransformation</code> attribute. 
	 * @param value the cloudinaryVideoTransformation
	 */
	public void setCloudinaryVideoTransformation(final SessionContext ctx, final Category item, final String value)
	{
		item.setProperty(ctx, CloudinarymediacoreConstants.Attributes.Category.CLOUDINARYVIDEOTRANSFORMATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Category.cloudinaryVideoTransformation</code> attribute. 
	 * @param value the cloudinaryVideoTransformation
	 */
	public void setCloudinaryVideoTransformation(final Category item, final String value)
	{
		setCloudinaryVideoTransformation( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.cloudinaryVideoTransformation</code> attribute.
	 * @return the cloudinaryVideoTransformation
	 */
	public String getCloudinaryVideoTransformation(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, CloudinarymediacoreConstants.Attributes.Product.CLOUDINARYVIDEOTRANSFORMATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.cloudinaryVideoTransformation</code> attribute.
	 * @return the cloudinaryVideoTransformation
	 */
	public String getCloudinaryVideoTransformation(final Product item)
	{
		return getCloudinaryVideoTransformation( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.cloudinaryVideoTransformation</code> attribute. 
	 * @param value the cloudinaryVideoTransformation
	 */
	public void setCloudinaryVideoTransformation(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, CloudinarymediacoreConstants.Attributes.Product.CLOUDINARYVIDEOTRANSFORMATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.cloudinaryVideoTransformation</code> attribute. 
	 * @param value the cloudinaryVideoTransformation
	 */
	public void setCloudinaryVideoTransformation(final Product item, final String value)
	{
		setCloudinaryVideoTransformation( getSession().getSessionContext(), item, value );
	}
	
	public CloudinaryConfig createCloudinaryConfig(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType("CloudinaryConfig");
			return (CloudinaryConfig)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CloudinaryConfig : "+e.getMessage(), 0 );
		}
	}
	
	public CloudinaryConfig createCloudinaryConfig(final Map attributeValues)
	{
		return createCloudinaryConfig( getSession().getSessionContext(), attributeValues );
	}
	
	public CloudinaryMediaTagUpdateJob createCloudinaryMediaTagUpdateJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType("CloudinaryMediaTagUpdateJob");
			return (CloudinaryMediaTagUpdateJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CloudinaryMediaTagUpdateJob : "+e.getMessage(), 0 );
		}
	}
	
	public CloudinaryMediaTagUpdateJob createCloudinaryMediaTagUpdateJob(final Map attributeValues)
	{
		return createCloudinaryMediaTagUpdateJob( getSession().getSessionContext(), attributeValues );
	}
	
	public CloudinaryMediaTransformationJob createCloudinaryMediaTransformationJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType("CloudinaryMediaTransformationJob");
			return (CloudinaryMediaTransformationJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CloudinaryMediaTransformationJob : "+e.getMessage(), 0 );
		}
	}
	
	public CloudinaryMediaTransformationJob createCloudinaryMediaTransformationJob(final Map attributeValues)
	{
		return createCloudinaryMediaTransformationJob( getSession().getSessionContext(), attributeValues );
	}
	
	public CloudinaryMediaUploadSyncJob createCloudinaryMediaUploadSyncJob(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType("CloudinaryMediaUploadSyncJob");
			return (CloudinaryMediaUploadSyncJob)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating CloudinaryMediaUploadSyncJob : "+e.getMessage(), 0 );
		}
	}
	
	public CloudinaryMediaUploadSyncJob createCloudinaryMediaUploadSyncJob(final Map attributeValues)
	{
		return createCloudinaryMediaUploadSyncJob( getSession().getSessionContext(), attributeValues );
	}
	
	public Preset createPreset(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType("Preset");
			return (Preset)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Preset : "+e.getMessage(), 0 );
		}
	}
	
	public Preset createPreset(final Map attributeValues)
	{
		return createPreset( getSession().getSessionContext(), attributeValues );
	}
	
	public static final CloudinarymediacoreManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (CloudinarymediacoreManager) em.getExtension(CloudinarymediacoreConstants.EXTENSIONNAME);
	}
	
	@Override
	public String getName()
	{
		return CloudinarymediacoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MediaFormat.inputMediaFormat</code> attribute.
	 * @return the inputMediaFormat - Media format to take as input for the conversion (optional).
	 */
	public MediaFormat getInputMediaFormat(final SessionContext ctx, final MediaFormat item)
	{
		return (MediaFormat)item.getProperty( ctx, CloudinarymediacoreConstants.Attributes.MediaFormat.INPUTMEDIAFORMAT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MediaFormat.inputMediaFormat</code> attribute.
	 * @return the inputMediaFormat - Media format to take as input for the conversion (optional).
	 */
	public MediaFormat getInputMediaFormat(final MediaFormat item)
	{
		return getInputMediaFormat( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MediaFormat.inputMediaFormat</code> attribute. 
	 * @param value the inputMediaFormat - Media format to take as input for the conversion (optional).
	 */
	public void setInputMediaFormat(final SessionContext ctx, final MediaFormat item, final MediaFormat value)
	{
		item.setProperty(ctx, CloudinarymediacoreConstants.Attributes.MediaFormat.INPUTMEDIAFORMAT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MediaFormat.inputMediaFormat</code> attribute. 
	 * @param value the inputMediaFormat - Media format to take as input for the conversion (optional).
	 */
	public void setInputMediaFormat(final MediaFormat item, final MediaFormat value)
	{
		setInputMediaFormat( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.isCloudinaryFetch</code> attribute.
	 * @return the isCloudinaryFetch
	 */
	public Boolean isIsCloudinaryFetch(final SessionContext ctx, final Media item)
	{
		return (Boolean)item.getProperty( ctx, CloudinarymediacoreConstants.Attributes.Media.ISCLOUDINARYFETCH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.isCloudinaryFetch</code> attribute.
	 * @return the isCloudinaryFetch
	 */
	public Boolean isIsCloudinaryFetch(final Media item)
	{
		return isIsCloudinaryFetch( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.isCloudinaryFetch</code> attribute. 
	 * @return the isCloudinaryFetch
	 */
	public boolean isIsCloudinaryFetchAsPrimitive(final SessionContext ctx, final Media item)
	{
		Boolean value = isIsCloudinaryFetch( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.isCloudinaryFetch</code> attribute. 
	 * @return the isCloudinaryFetch
	 */
	public boolean isIsCloudinaryFetchAsPrimitive(final Media item)
	{
		return isIsCloudinaryFetchAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.isCloudinaryFetch</code> attribute. 
	 * @param value the isCloudinaryFetch
	 */
	public void setIsCloudinaryFetch(final SessionContext ctx, final Media item, final Boolean value)
	{
		item.setProperty(ctx, CloudinarymediacoreConstants.Attributes.Media.ISCLOUDINARYFETCH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.isCloudinaryFetch</code> attribute. 
	 * @param value the isCloudinaryFetch
	 */
	public void setIsCloudinaryFetch(final Media item, final Boolean value)
	{
		setIsCloudinaryFetch( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.isCloudinaryFetch</code> attribute. 
	 * @param value the isCloudinaryFetch
	 */
	public void setIsCloudinaryFetch(final SessionContext ctx, final Media item, final boolean value)
	{
		setIsCloudinaryFetch( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.isCloudinaryFetch</code> attribute. 
	 * @param value the isCloudinaryFetch
	 */
	public void setIsCloudinaryFetch(final Media item, final boolean value)
	{
		setIsCloudinaryFetch( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.isCloudinaryOverride</code> attribute.
	 * @return the isCloudinaryOverride
	 */
	public Boolean isIsCloudinaryOverride(final SessionContext ctx, final Media item)
	{
		return (Boolean)item.getProperty( ctx, CloudinarymediacoreConstants.Attributes.Media.ISCLOUDINARYOVERRIDE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.isCloudinaryOverride</code> attribute.
	 * @return the isCloudinaryOverride
	 */
	public Boolean isIsCloudinaryOverride(final Media item)
	{
		return isIsCloudinaryOverride( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.isCloudinaryOverride</code> attribute. 
	 * @return the isCloudinaryOverride
	 */
	public boolean isIsCloudinaryOverrideAsPrimitive(final SessionContext ctx, final Media item)
	{
		Boolean value = isIsCloudinaryOverride( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Media.isCloudinaryOverride</code> attribute. 
	 * @return the isCloudinaryOverride
	 */
	public boolean isIsCloudinaryOverrideAsPrimitive(final Media item)
	{
		return isIsCloudinaryOverrideAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.isCloudinaryOverride</code> attribute. 
	 * @param value the isCloudinaryOverride
	 */
	public void setIsCloudinaryOverride(final SessionContext ctx, final Media item, final Boolean value)
	{
		item.setProperty(ctx, CloudinarymediacoreConstants.Attributes.Media.ISCLOUDINARYOVERRIDE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.isCloudinaryOverride</code> attribute. 
	 * @param value the isCloudinaryOverride
	 */
	public void setIsCloudinaryOverride(final Media item, final Boolean value)
	{
		setIsCloudinaryOverride( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.isCloudinaryOverride</code> attribute. 
	 * @param value the isCloudinaryOverride
	 */
	public void setIsCloudinaryOverride(final SessionContext ctx, final Media item, final boolean value)
	{
		setIsCloudinaryOverride( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Media.isCloudinaryOverride</code> attribute. 
	 * @param value the isCloudinaryOverride
	 */
	public void setIsCloudinaryOverride(final Media item, final boolean value)
	{
		setIsCloudinaryOverride( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Category.isCloudinaryOverride</code> attribute.
	 * @return the isCloudinaryOverride
	 */
	public Boolean isIsCloudinaryOverride(final SessionContext ctx, final Category item)
	{
		return (Boolean)item.getProperty( ctx, CloudinarymediacoreConstants.Attributes.Category.ISCLOUDINARYOVERRIDE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Category.isCloudinaryOverride</code> attribute.
	 * @return the isCloudinaryOverride
	 */
	public Boolean isIsCloudinaryOverride(final Category item)
	{
		return isIsCloudinaryOverride( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Category.isCloudinaryOverride</code> attribute. 
	 * @return the isCloudinaryOverride
	 */
	public boolean isIsCloudinaryOverrideAsPrimitive(final SessionContext ctx, final Category item)
	{
		Boolean value = isIsCloudinaryOverride( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Category.isCloudinaryOverride</code> attribute. 
	 * @return the isCloudinaryOverride
	 */
	public boolean isIsCloudinaryOverrideAsPrimitive(final Category item)
	{
		return isIsCloudinaryOverrideAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Category.isCloudinaryOverride</code> attribute. 
	 * @param value the isCloudinaryOverride
	 */
	public void setIsCloudinaryOverride(final SessionContext ctx, final Category item, final Boolean value)
	{
		item.setProperty(ctx, CloudinarymediacoreConstants.Attributes.Category.ISCLOUDINARYOVERRIDE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Category.isCloudinaryOverride</code> attribute. 
	 * @param value the isCloudinaryOverride
	 */
	public void setIsCloudinaryOverride(final Category item, final Boolean value)
	{
		setIsCloudinaryOverride( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Category.isCloudinaryOverride</code> attribute. 
	 * @param value the isCloudinaryOverride
	 */
	public void setIsCloudinaryOverride(final SessionContext ctx, final Category item, final boolean value)
	{
		setIsCloudinaryOverride( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Category.isCloudinaryOverride</code> attribute. 
	 * @param value the isCloudinaryOverride
	 */
	public void setIsCloudinaryOverride(final Category item, final boolean value)
	{
		setIsCloudinaryOverride( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.isCloudinaryOverride</code> attribute.
	 * @return the isCloudinaryOverride
	 */
	public Boolean isIsCloudinaryOverride(final SessionContext ctx, final Product item)
	{
		return (Boolean)item.getProperty( ctx, CloudinarymediacoreConstants.Attributes.Product.ISCLOUDINARYOVERRIDE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.isCloudinaryOverride</code> attribute.
	 * @return the isCloudinaryOverride
	 */
	public Boolean isIsCloudinaryOverride(final Product item)
	{
		return isIsCloudinaryOverride( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.isCloudinaryOverride</code> attribute. 
	 * @return the isCloudinaryOverride
	 */
	public boolean isIsCloudinaryOverrideAsPrimitive(final SessionContext ctx, final Product item)
	{
		Boolean value = isIsCloudinaryOverride( ctx,item );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.isCloudinaryOverride</code> attribute. 
	 * @return the isCloudinaryOverride
	 */
	public boolean isIsCloudinaryOverrideAsPrimitive(final Product item)
	{
		return isIsCloudinaryOverrideAsPrimitive( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.isCloudinaryOverride</code> attribute. 
	 * @param value the isCloudinaryOverride
	 */
	public void setIsCloudinaryOverride(final SessionContext ctx, final Product item, final Boolean value)
	{
		item.setProperty(ctx, CloudinarymediacoreConstants.Attributes.Product.ISCLOUDINARYOVERRIDE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.isCloudinaryOverride</code> attribute. 
	 * @param value the isCloudinaryOverride
	 */
	public void setIsCloudinaryOverride(final Product item, final Boolean value)
	{
		setIsCloudinaryOverride( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.isCloudinaryOverride</code> attribute. 
	 * @param value the isCloudinaryOverride
	 */
	public void setIsCloudinaryOverride(final SessionContext ctx, final Product item, final boolean value)
	{
		setIsCloudinaryOverride( ctx, item, Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.isCloudinaryOverride</code> attribute. 
	 * @param value the isCloudinaryOverride
	 */
	public void setIsCloudinaryOverride(final Product item, final boolean value)
	{
		setIsCloudinaryOverride( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MediaFormat.mediaMimeType</code> attribute.
	 * @return the mediaMimeType - Mime type of this format.
	 */
	public String getMediaMimeType(final SessionContext ctx, final MediaFormat item)
	{
		return (String)item.getProperty( ctx, CloudinarymediacoreConstants.Attributes.MediaFormat.MEDIAMIMETYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MediaFormat.mediaMimeType</code> attribute.
	 * @return the mediaMimeType - Mime type of this format.
	 */
	public String getMediaMimeType(final MediaFormat item)
	{
		return getMediaMimeType( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MediaFormat.mediaMimeType</code> attribute. 
	 * @param value the mediaMimeType - Mime type of this format.
	 */
	public void setMediaMimeType(final SessionContext ctx, final MediaFormat item, final String value)
	{
		item.setProperty(ctx, CloudinarymediacoreConstants.Attributes.MediaFormat.MEDIAMIMETYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MediaFormat.mediaMimeType</code> attribute. 
	 * @param value the mediaMimeType - Mime type of this format.
	 */
	public void setMediaMimeType(final MediaFormat item, final String value)
	{
		setMediaMimeType( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConversionGroup.supportedMediaFormats</code> attribute.
	 * @return the supportedMediaFormats - All supported formats, i.e. all formats to convert the original media to.
	 */
	public Set<MediaFormat> getSupportedMediaFormats(final SessionContext ctx, final ConversionGroup item)
	{
		final List<MediaFormat> items = item.getLinkedItems( 
			ctx,
			true,
			CloudinarymediacoreConstants.Relations.CONVERSIONGROUPTOMEDIAFORMATREL,
			"MediaFormat",
			null,
			false,
			false
		);
		return new LinkedHashSet<MediaFormat>(items);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConversionGroup.supportedMediaFormats</code> attribute.
	 * @return the supportedMediaFormats - All supported formats, i.e. all formats to convert the original media to.
	 */
	public Set<MediaFormat> getSupportedMediaFormats(final ConversionGroup item)
	{
		return getSupportedMediaFormats( getSession().getSessionContext(), item );
	}
	
	public long getSupportedMediaFormatsCount(final SessionContext ctx, final ConversionGroup item)
	{
		return item.getLinkedItemsCount(
			ctx,
			true,
			CloudinarymediacoreConstants.Relations.CONVERSIONGROUPTOMEDIAFORMATREL,
			"MediaFormat",
			null
		);
	}
	
	public long getSupportedMediaFormatsCount(final ConversionGroup item)
	{
		return getSupportedMediaFormatsCount( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ConversionGroup.supportedMediaFormats</code> attribute. 
	 * @param value the supportedMediaFormats - All supported formats, i.e. all formats to convert the original media to.
	 */
	public void setSupportedMediaFormats(final SessionContext ctx, final ConversionGroup item, final Set<MediaFormat> value)
	{
		item.setLinkedItems( 
			ctx,
			true,
			CloudinarymediacoreConstants.Relations.CONVERSIONGROUPTOMEDIAFORMATREL,
			null,
			value,
			false,
			false,
			Utilities.getMarkModifiedOverride(CONVERSIONGROUPTOMEDIAFORMATREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ConversionGroup.supportedMediaFormats</code> attribute. 
	 * @param value the supportedMediaFormats - All supported formats, i.e. all formats to convert the original media to.
	 */
	public void setSupportedMediaFormats(final ConversionGroup item, final Set<MediaFormat> value)
	{
		setSupportedMediaFormats( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to supportedMediaFormats. 
	 * @param value the item to add to supportedMediaFormats - All supported formats, i.e. all formats to convert the original media to.
	 */
	public void addToSupportedMediaFormats(final SessionContext ctx, final ConversionGroup item, final MediaFormat value)
	{
		item.addLinkedItems( 
			ctx,
			true,
			CloudinarymediacoreConstants.Relations.CONVERSIONGROUPTOMEDIAFORMATREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CONVERSIONGROUPTOMEDIAFORMATREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to supportedMediaFormats. 
	 * @param value the item to add to supportedMediaFormats - All supported formats, i.e. all formats to convert the original media to.
	 */
	public void addToSupportedMediaFormats(final ConversionGroup item, final MediaFormat value)
	{
		addToSupportedMediaFormats( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from supportedMediaFormats. 
	 * @param value the item to remove from supportedMediaFormats - All supported formats, i.e. all formats to convert the original media to.
	 */
	public void removeFromSupportedMediaFormats(final SessionContext ctx, final ConversionGroup item, final MediaFormat value)
	{
		item.removeLinkedItems( 
			ctx,
			true,
			CloudinarymediacoreConstants.Relations.CONVERSIONGROUPTOMEDIAFORMATREL,
			null,
			Collections.singletonList(value),
			false,
			false,
			Utilities.getMarkModifiedOverride(CONVERSIONGROUPTOMEDIAFORMATREL_MARKMODIFIED)
		);
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from supportedMediaFormats. 
	 * @param value the item to remove from supportedMediaFormats - All supported formats, i.e. all formats to convert the original media to.
	 */
	public void removeFromSupportedMediaFormats(final ConversionGroup item, final MediaFormat value)
	{
		removeFromSupportedMediaFormats( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConversionErrorLog.targetMediaFormat</code> attribute.
	 * @return the targetMediaFormat - The targeted format, for which the conversion failed.
	 */
	public MediaFormat getTargetMediaFormat(final SessionContext ctx, final ConversionErrorLog item)
	{
		return (MediaFormat)item.getProperty( ctx, CloudinarymediacoreConstants.Attributes.ConversionErrorLog.TARGETMEDIAFORMAT);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>ConversionErrorLog.targetMediaFormat</code> attribute.
	 * @return the targetMediaFormat - The targeted format, for which the conversion failed.
	 */
	public MediaFormat getTargetMediaFormat(final ConversionErrorLog item)
	{
		return getTargetMediaFormat( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ConversionErrorLog.targetMediaFormat</code> attribute. 
	 * @param value the targetMediaFormat - The targeted format, for which the conversion failed.
	 */
	protected void setTargetMediaFormat(final SessionContext ctx, final ConversionErrorLog item, final MediaFormat value)
	{
		if ( ctx == null) 
		{
			throw new JaloInvalidParameterException( "ctx is null", 0 );
		}
		// initial-only attribute: make sure this attribute can be set during item creation only
		if ( ctx.getAttribute( "core.types.creation.initial") != Boolean.TRUE )
		{
			throw new JaloInvalidParameterException( "attribute '"+CloudinarymediacoreConstants.Attributes.ConversionErrorLog.TARGETMEDIAFORMAT+"' is not changeable", 0 );
		}
		item.setProperty(ctx, CloudinarymediacoreConstants.Attributes.ConversionErrorLog.TARGETMEDIAFORMAT,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>ConversionErrorLog.targetMediaFormat</code> attribute. 
	 * @param value the targetMediaFormat - The targeted format, for which the conversion failed.
	 */
	protected void setTargetMediaFormat(final ConversionErrorLog item, final MediaFormat value)
	{
		setTargetMediaFormat( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MediaFormat.transformation</code> attribute.
	 * @return the transformation - Transformation command
	 */
	public String getTransformation(final SessionContext ctx, final MediaFormat item)
	{
		return (String)item.getProperty( ctx, CloudinarymediacoreConstants.Attributes.MediaFormat.TRANSFORMATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MediaFormat.transformation</code> attribute.
	 * @return the transformation - Transformation command
	 */
	public String getTransformation(final MediaFormat item)
	{
		return getTransformation( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MediaFormat.transformation</code> attribute. 
	 * @param value the transformation - Transformation command
	 */
	public void setTransformation(final SessionContext ctx, final MediaFormat item, final String value)
	{
		item.setProperty(ctx, CloudinarymediacoreConstants.Attributes.MediaFormat.TRANSFORMATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MediaFormat.transformation</code> attribute. 
	 * @param value the transformation - Transformation command
	 */
	public void setTransformation(final MediaFormat item, final String value)
	{
		setTransformation( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MediaFormat.transformationStrategy</code> attribute.
	 * @return the transformationStrategy - Bean name of the conversion strategy to use.
	 */
	public String getTransformationStrategy(final SessionContext ctx, final MediaFormat item)
	{
		return (String)item.getProperty( ctx, CloudinarymediacoreConstants.Attributes.MediaFormat.TRANSFORMATIONSTRATEGY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MediaFormat.transformationStrategy</code> attribute.
	 * @return the transformationStrategy - Bean name of the conversion strategy to use.
	 */
	public String getTransformationStrategy(final MediaFormat item)
	{
		return getTransformationStrategy( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MediaFormat.transformationStrategy</code> attribute. 
	 * @param value the transformationStrategy - Bean name of the conversion strategy to use.
	 */
	public void setTransformationStrategy(final SessionContext ctx, final MediaFormat item, final String value)
	{
		item.setProperty(ctx, CloudinarymediacoreConstants.Attributes.MediaFormat.TRANSFORMATIONSTRATEGY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MediaFormat.transformationStrategy</code> attribute. 
	 * @param value the transformationStrategy - Bean name of the conversion strategy to use.
	 */
	public void setTransformationStrategy(final MediaFormat item, final String value)
	{
		setTransformationStrategy( getSession().getSessionContext(), item, value );
	}
	
}
