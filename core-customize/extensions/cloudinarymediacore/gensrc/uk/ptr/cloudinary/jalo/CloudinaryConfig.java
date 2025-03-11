/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 11 Mar 2025, 13:09:50                       ---
 * ----------------------------------------------------------------
 */
package uk.ptr.cloudinary.jalo;

import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import uk.ptr.cloudinary.jalo.Preset;

/**
 * Generated class for type CloudinaryConfig.
 */
@SLDSafe
@SuppressWarnings({"unused","cast"})
public class CloudinaryConfig extends GenericItem
{
	/** Qualifier of the <code>CloudinaryConfig.cloudinaryURL</code> attribute **/
	public static final String CLOUDINARYURL = "cloudinaryURL";
	/** Qualifier of the <code>CloudinaryConfig.cloudinaryFolderPath</code> attribute **/
	public static final String CLOUDINARYFOLDERPATH = "cloudinaryFolderPath";
	/** Qualifier of the <code>CloudinaryConfig.enableCloudinary</code> attribute **/
	public static final String ENABLECLOUDINARY = "enableCloudinary";
	/** Qualifier of the <code>CloudinaryConfig.mediaUploadPreset</code> attribute **/
	public static final String MEDIAUPLOADPRESET = "mediaUploadPreset";
	/** Qualifier of the <code>CloudinaryConfig.cloudinaryMaxBreakPoints</code> attribute **/
	public static final String CLOUDINARYMAXBREAKPOINTS = "cloudinaryMaxBreakPoints";
	/** Qualifier of the <code>CloudinaryConfig.cloudinaryImageFormat</code> attribute **/
	public static final String CLOUDINARYIMAGEFORMAT = "cloudinaryImageFormat";
	/** Qualifier of the <code>CloudinaryConfig.cloudinaryQuality</code> attribute **/
	public static final String CLOUDINARYQUALITY = "cloudinaryQuality";
	/** Qualifier of the <code>CloudinaryConfig.cloudinaryResponsive</code> attribute **/
	public static final String CLOUDINARYRESPONSIVE = "cloudinaryResponsive";
	/** Qualifier of the <code>CloudinaryConfig.cloudinaryByteStep</code> attribute **/
	public static final String CLOUDINARYBYTESTEP = "cloudinaryByteStep";
	/** Qualifier of the <code>CloudinaryConfig.cloudinaryImageWidthLimitMax</code> attribute **/
	public static final String CLOUDINARYIMAGEWIDTHLIMITMAX = "cloudinaryImageWidthLimitMax";
	/** Qualifier of the <code>CloudinaryConfig.cloudinaryImageWidthLimitMin</code> attribute **/
	public static final String CLOUDINARYIMAGEWIDTHLIMITMIN = "cloudinaryImageWidthLimitMin";
	/** Qualifier of the <code>CloudinaryConfig.enableCloudinaryGalleryWidget</code> attribute **/
	public static final String ENABLECLOUDINARYGALLERYWIDGET = "enableCloudinaryGalleryWidget";
	/** Qualifier of the <code>CloudinaryConfig.cloudinaryGlobalImageTransformation</code> attribute **/
	public static final String CLOUDINARYGLOBALIMAGETRANSFORMATION = "cloudinaryGlobalImageTransformation";
	/** Qualifier of the <code>CloudinaryConfig.cloudinaryGlobalVideoTransformation</code> attribute **/
	public static final String CLOUDINARYGLOBALVIDEOTRANSFORMATION = "cloudinaryGlobalVideoTransformation";
	/** Qualifier of the <code>CloudinaryConfig.cloudinaryCname</code> attribute **/
	public static final String CLOUDINARYCNAME = "cloudinaryCname";
	/** Qualifier of the <code>CloudinaryConfig.enableOptimizeImage</code> attribute **/
	public static final String ENABLEOPTIMIZEIMAGE = "enableOptimizeImage";
	/** Qualifier of the <code>CloudinaryConfig.enableOptimizeVideo</code> attribute **/
	public static final String ENABLEOPTIMIZEVIDEO = "enableOptimizeVideo";
	/** Qualifier of the <code>CloudinaryConfig.cloudinaryVideoFormat</code> attribute **/
	public static final String CLOUDINARYVIDEOFORMAT = "cloudinaryVideoFormat";
	/** Qualifier of the <code>CloudinaryConfig.cloudinaryVideoQuality</code> attribute **/
	public static final String CLOUDINARYVIDEOQUALITY = "cloudinaryVideoQuality";
	/** Qualifier of the <code>CloudinaryConfig.cloudinaryGalleryConfigJsonString</code> attribute **/
	public static final String CLOUDINARYGALLERYCONFIGJSONSTRING = "cloudinaryGalleryConfigJsonString";
	/** Qualifier of the <code>CloudinaryConfig.cloudinaryContentImageFormat</code> attribute **/
	public static final String CLOUDINARYCONTENTIMAGEFORMAT = "cloudinaryContentImageFormat";
	/** Qualifier of the <code>CloudinaryConfig.cloudinaryContentImageQuality</code> attribute **/
	public static final String CLOUDINARYCONTENTIMAGEQUALITY = "cloudinaryContentImageQuality";
	/** Qualifier of the <code>CloudinaryConfig.cloudinaryContentGlobalImageTransformation</code> attribute **/
	public static final String CLOUDINARYCONTENTGLOBALIMAGETRANSFORMATION = "cloudinaryContentGlobalImageTransformation";
	/** Qualifier of the <code>CloudinaryConfig.enableOptimizeContentImage</code> attribute **/
	public static final String ENABLEOPTIMIZECONTENTIMAGE = "enableOptimizeContentImage";
	/** Qualifier of the <code>CloudinaryConfig.enableOptimizeContentVideo</code> attribute **/
	public static final String ENABLEOPTIMIZECONTENTVIDEO = "enableOptimizeContentVideo";
	/** Qualifier of the <code>CloudinaryConfig.cloudinaryContentVideoFormat</code> attribute **/
	public static final String CLOUDINARYCONTENTVIDEOFORMAT = "cloudinaryContentVideoFormat";
	/** Qualifier of the <code>CloudinaryConfig.cloudinaryContentVideoQuality</code> attribute **/
	public static final String CLOUDINARYCONTENTVIDEOQUALITY = "cloudinaryContentVideoQuality";
	/** Qualifier of the <code>CloudinaryConfig.cloudinaryGlobalContentVideoTransformation</code> attribute **/
	public static final String CLOUDINARYGLOBALCONTENTVIDEOTRANSFORMATION = "cloudinaryGlobalContentVideoTransformation";
	/** Qualifier of the <code>CloudinaryConfig.enableCloudinaryVideoPlayer</code> attribute **/
	public static final String ENABLECLOUDINARYVIDEOPLAYER = "enableCloudinaryVideoPlayer";
	/** Qualifier of the <code>CloudinaryConfig.videoPlayerTransformation</code> attribute **/
	public static final String VIDEOPLAYERTRANSFORMATION = "videoPlayerTransformation";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(CLOUDINARYURL, AttributeMode.INITIAL);
		tmp.put(CLOUDINARYFOLDERPATH, AttributeMode.INITIAL);
		tmp.put(ENABLECLOUDINARY, AttributeMode.INITIAL);
		tmp.put(MEDIAUPLOADPRESET, AttributeMode.INITIAL);
		tmp.put(CLOUDINARYMAXBREAKPOINTS, AttributeMode.INITIAL);
		tmp.put(CLOUDINARYIMAGEFORMAT, AttributeMode.INITIAL);
		tmp.put(CLOUDINARYQUALITY, AttributeMode.INITIAL);
		tmp.put(CLOUDINARYRESPONSIVE, AttributeMode.INITIAL);
		tmp.put(CLOUDINARYBYTESTEP, AttributeMode.INITIAL);
		tmp.put(CLOUDINARYIMAGEWIDTHLIMITMAX, AttributeMode.INITIAL);
		tmp.put(CLOUDINARYIMAGEWIDTHLIMITMIN, AttributeMode.INITIAL);
		tmp.put(ENABLECLOUDINARYGALLERYWIDGET, AttributeMode.INITIAL);
		tmp.put(CLOUDINARYGLOBALIMAGETRANSFORMATION, AttributeMode.INITIAL);
		tmp.put(CLOUDINARYGLOBALVIDEOTRANSFORMATION, AttributeMode.INITIAL);
		tmp.put(CLOUDINARYCNAME, AttributeMode.INITIAL);
		tmp.put(ENABLEOPTIMIZEIMAGE, AttributeMode.INITIAL);
		tmp.put(ENABLEOPTIMIZEVIDEO, AttributeMode.INITIAL);
		tmp.put(CLOUDINARYVIDEOFORMAT, AttributeMode.INITIAL);
		tmp.put(CLOUDINARYVIDEOQUALITY, AttributeMode.INITIAL);
		tmp.put(CLOUDINARYGALLERYCONFIGJSONSTRING, AttributeMode.INITIAL);
		tmp.put(CLOUDINARYCONTENTIMAGEFORMAT, AttributeMode.INITIAL);
		tmp.put(CLOUDINARYCONTENTIMAGEQUALITY, AttributeMode.INITIAL);
		tmp.put(CLOUDINARYCONTENTGLOBALIMAGETRANSFORMATION, AttributeMode.INITIAL);
		tmp.put(ENABLEOPTIMIZECONTENTIMAGE, AttributeMode.INITIAL);
		tmp.put(ENABLEOPTIMIZECONTENTVIDEO, AttributeMode.INITIAL);
		tmp.put(CLOUDINARYCONTENTVIDEOFORMAT, AttributeMode.INITIAL);
		tmp.put(CLOUDINARYCONTENTVIDEOQUALITY, AttributeMode.INITIAL);
		tmp.put(CLOUDINARYGLOBALCONTENTVIDEOTRANSFORMATION, AttributeMode.INITIAL);
		tmp.put(ENABLECLOUDINARYVIDEOPLAYER, AttributeMode.INITIAL);
		tmp.put(VIDEOPLAYERTRANSFORMATION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryByteStep</code> attribute.
	 * @return the cloudinaryByteStep - Cloudinary Byte Step
	 */
	public Integer getCloudinaryByteStep(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, "cloudinaryByteStep".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryByteStep</code> attribute.
	 * @return the cloudinaryByteStep - Cloudinary Byte Step
	 */
	public Integer getCloudinaryByteStep()
	{
		return getCloudinaryByteStep( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryByteStep</code> attribute. 
	 * @return the cloudinaryByteStep - Cloudinary Byte Step
	 */
	public int getCloudinaryByteStepAsPrimitive(final SessionContext ctx)
	{
		Integer value = getCloudinaryByteStep( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryByteStep</code> attribute. 
	 * @return the cloudinaryByteStep - Cloudinary Byte Step
	 */
	public int getCloudinaryByteStepAsPrimitive()
	{
		return getCloudinaryByteStepAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryByteStep</code> attribute. 
	 * @param value the cloudinaryByteStep - Cloudinary Byte Step
	 */
	public void setCloudinaryByteStep(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, "cloudinaryByteStep".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryByteStep</code> attribute. 
	 * @param value the cloudinaryByteStep - Cloudinary Byte Step
	 */
	public void setCloudinaryByteStep(final Integer value)
	{
		setCloudinaryByteStep( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryByteStep</code> attribute. 
	 * @param value the cloudinaryByteStep - Cloudinary Byte Step
	 */
	public void setCloudinaryByteStep(final SessionContext ctx, final int value)
	{
		setCloudinaryByteStep( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryByteStep</code> attribute. 
	 * @param value the cloudinaryByteStep - Cloudinary Byte Step
	 */
	public void setCloudinaryByteStep(final int value)
	{
		setCloudinaryByteStep( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryCname</code> attribute.
	 * @return the cloudinaryCname - Cloudinary Name
	 */
	public String getCloudinaryCname(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "cloudinaryCname".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryCname</code> attribute.
	 * @return the cloudinaryCname - Cloudinary Name
	 */
	public String getCloudinaryCname()
	{
		return getCloudinaryCname( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryCname</code> attribute. 
	 * @param value the cloudinaryCname - Cloudinary Name
	 */
	public void setCloudinaryCname(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "cloudinaryCname".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryCname</code> attribute. 
	 * @param value the cloudinaryCname - Cloudinary Name
	 */
	public void setCloudinaryCname(final String value)
	{
		setCloudinaryCname( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryContentGlobalImageTransformation</code> attribute.
	 * @return the cloudinaryContentGlobalImageTransformation - Cloudinary Content Global Image Transformation
	 */
	public String getCloudinaryContentGlobalImageTransformation(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "cloudinaryContentGlobalImageTransformation".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryContentGlobalImageTransformation</code> attribute.
	 * @return the cloudinaryContentGlobalImageTransformation - Cloudinary Content Global Image Transformation
	 */
	public String getCloudinaryContentGlobalImageTransformation()
	{
		return getCloudinaryContentGlobalImageTransformation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryContentGlobalImageTransformation</code> attribute. 
	 * @param value the cloudinaryContentGlobalImageTransformation - Cloudinary Content Global Image Transformation
	 */
	public void setCloudinaryContentGlobalImageTransformation(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "cloudinaryContentGlobalImageTransformation".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryContentGlobalImageTransformation</code> attribute. 
	 * @param value the cloudinaryContentGlobalImageTransformation - Cloudinary Content Global Image Transformation
	 */
	public void setCloudinaryContentGlobalImageTransformation(final String value)
	{
		setCloudinaryContentGlobalImageTransformation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryContentImageFormat</code> attribute.
	 * @return the cloudinaryContentImageFormat - Cloudinary Content Image Format
	 */
	public EnumerationValue getCloudinaryContentImageFormat(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, "cloudinaryContentImageFormat".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryContentImageFormat</code> attribute.
	 * @return the cloudinaryContentImageFormat - Cloudinary Content Image Format
	 */
	public EnumerationValue getCloudinaryContentImageFormat()
	{
		return getCloudinaryContentImageFormat( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryContentImageFormat</code> attribute. 
	 * @param value the cloudinaryContentImageFormat - Cloudinary Content Image Format
	 */
	public void setCloudinaryContentImageFormat(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, "cloudinaryContentImageFormat".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryContentImageFormat</code> attribute. 
	 * @param value the cloudinaryContentImageFormat - Cloudinary Content Image Format
	 */
	public void setCloudinaryContentImageFormat(final EnumerationValue value)
	{
		setCloudinaryContentImageFormat( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryContentImageQuality</code> attribute.
	 * @return the cloudinaryContentImageQuality - Cloudinary Content Image Quality
	 */
	public EnumerationValue getCloudinaryContentImageQuality(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, "cloudinaryContentImageQuality".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryContentImageQuality</code> attribute.
	 * @return the cloudinaryContentImageQuality - Cloudinary Content Image Quality
	 */
	public EnumerationValue getCloudinaryContentImageQuality()
	{
		return getCloudinaryContentImageQuality( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryContentImageQuality</code> attribute. 
	 * @param value the cloudinaryContentImageQuality - Cloudinary Content Image Quality
	 */
	public void setCloudinaryContentImageQuality(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, "cloudinaryContentImageQuality".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryContentImageQuality</code> attribute. 
	 * @param value the cloudinaryContentImageQuality - Cloudinary Content Image Quality
	 */
	public void setCloudinaryContentImageQuality(final EnumerationValue value)
	{
		setCloudinaryContentImageQuality( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryContentVideoFormat</code> attribute.
	 * @return the cloudinaryContentVideoFormat - Cloudinary Content Video Format
	 */
	public EnumerationValue getCloudinaryContentVideoFormat(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, "cloudinaryContentVideoFormat".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryContentVideoFormat</code> attribute.
	 * @return the cloudinaryContentVideoFormat - Cloudinary Content Video Format
	 */
	public EnumerationValue getCloudinaryContentVideoFormat()
	{
		return getCloudinaryContentVideoFormat( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryContentVideoFormat</code> attribute. 
	 * @param value the cloudinaryContentVideoFormat - Cloudinary Content Video Format
	 */
	public void setCloudinaryContentVideoFormat(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, "cloudinaryContentVideoFormat".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryContentVideoFormat</code> attribute. 
	 * @param value the cloudinaryContentVideoFormat - Cloudinary Content Video Format
	 */
	public void setCloudinaryContentVideoFormat(final EnumerationValue value)
	{
		setCloudinaryContentVideoFormat( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryContentVideoQuality</code> attribute.
	 * @return the cloudinaryContentVideoQuality - Cloudinary Content Video Quality
	 */
	public EnumerationValue getCloudinaryContentVideoQuality(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, "cloudinaryContentVideoQuality".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryContentVideoQuality</code> attribute.
	 * @return the cloudinaryContentVideoQuality - Cloudinary Content Video Quality
	 */
	public EnumerationValue getCloudinaryContentVideoQuality()
	{
		return getCloudinaryContentVideoQuality( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryContentVideoQuality</code> attribute. 
	 * @param value the cloudinaryContentVideoQuality - Cloudinary Content Video Quality
	 */
	public void setCloudinaryContentVideoQuality(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, "cloudinaryContentVideoQuality".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryContentVideoQuality</code> attribute. 
	 * @param value the cloudinaryContentVideoQuality - Cloudinary Content Video Quality
	 */
	public void setCloudinaryContentVideoQuality(final EnumerationValue value)
	{
		setCloudinaryContentVideoQuality( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryFolderPath</code> attribute.
	 * @return the cloudinaryFolderPath - Cloudinary Folder Path
	 */
	public String getCloudinaryFolderPath(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "cloudinaryFolderPath".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryFolderPath</code> attribute.
	 * @return the cloudinaryFolderPath - Cloudinary Folder Path
	 */
	public String getCloudinaryFolderPath()
	{
		return getCloudinaryFolderPath( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryFolderPath</code> attribute. 
	 * @param value the cloudinaryFolderPath - Cloudinary Folder Path
	 */
	public void setCloudinaryFolderPath(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "cloudinaryFolderPath".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryFolderPath</code> attribute. 
	 * @param value the cloudinaryFolderPath - Cloudinary Folder Path
	 */
	public void setCloudinaryFolderPath(final String value)
	{
		setCloudinaryFolderPath( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryGalleryConfigJsonString</code> attribute.
	 * @return the cloudinaryGalleryConfigJsonString - Cloudinary Gallery Config Json String
	 */
	public String getCloudinaryGalleryConfigJsonString(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "cloudinaryGalleryConfigJsonString".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryGalleryConfigJsonString</code> attribute.
	 * @return the cloudinaryGalleryConfigJsonString - Cloudinary Gallery Config Json String
	 */
	public String getCloudinaryGalleryConfigJsonString()
	{
		return getCloudinaryGalleryConfigJsonString( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryGalleryConfigJsonString</code> attribute. 
	 * @param value the cloudinaryGalleryConfigJsonString - Cloudinary Gallery Config Json String
	 */
	public void setCloudinaryGalleryConfigJsonString(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "cloudinaryGalleryConfigJsonString".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryGalleryConfigJsonString</code> attribute. 
	 * @param value the cloudinaryGalleryConfigJsonString - Cloudinary Gallery Config Json String
	 */
	public void setCloudinaryGalleryConfigJsonString(final String value)
	{
		setCloudinaryGalleryConfigJsonString( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryGlobalContentVideoTransformation</code> attribute.
	 * @return the cloudinaryGlobalContentVideoTransformation - Cloudinary Global Content Video Transformation
	 */
	public String getCloudinaryGlobalContentVideoTransformation(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "cloudinaryGlobalContentVideoTransformation".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryGlobalContentVideoTransformation</code> attribute.
	 * @return the cloudinaryGlobalContentVideoTransformation - Cloudinary Global Content Video Transformation
	 */
	public String getCloudinaryGlobalContentVideoTransformation()
	{
		return getCloudinaryGlobalContentVideoTransformation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryGlobalContentVideoTransformation</code> attribute. 
	 * @param value the cloudinaryGlobalContentVideoTransformation - Cloudinary Global Content Video Transformation
	 */
	public void setCloudinaryGlobalContentVideoTransformation(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "cloudinaryGlobalContentVideoTransformation".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryGlobalContentVideoTransformation</code> attribute. 
	 * @param value the cloudinaryGlobalContentVideoTransformation - Cloudinary Global Content Video Transformation
	 */
	public void setCloudinaryGlobalContentVideoTransformation(final String value)
	{
		setCloudinaryGlobalContentVideoTransformation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryGlobalImageTransformation</code> attribute.
	 * @return the cloudinaryGlobalImageTransformation - Cloudinary Image Transformation
	 */
	public String getCloudinaryGlobalImageTransformation(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "cloudinaryGlobalImageTransformation".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryGlobalImageTransformation</code> attribute.
	 * @return the cloudinaryGlobalImageTransformation - Cloudinary Image Transformation
	 */
	public String getCloudinaryGlobalImageTransformation()
	{
		return getCloudinaryGlobalImageTransformation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryGlobalImageTransformation</code> attribute. 
	 * @param value the cloudinaryGlobalImageTransformation - Cloudinary Image Transformation
	 */
	public void setCloudinaryGlobalImageTransformation(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "cloudinaryGlobalImageTransformation".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryGlobalImageTransformation</code> attribute. 
	 * @param value the cloudinaryGlobalImageTransformation - Cloudinary Image Transformation
	 */
	public void setCloudinaryGlobalImageTransformation(final String value)
	{
		setCloudinaryGlobalImageTransformation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryGlobalVideoTransformation</code> attribute.
	 * @return the cloudinaryGlobalVideoTransformation - Cloudinary Video Transformation
	 */
	public String getCloudinaryGlobalVideoTransformation(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "cloudinaryGlobalVideoTransformation".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryGlobalVideoTransformation</code> attribute.
	 * @return the cloudinaryGlobalVideoTransformation - Cloudinary Video Transformation
	 */
	public String getCloudinaryGlobalVideoTransformation()
	{
		return getCloudinaryGlobalVideoTransformation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryGlobalVideoTransformation</code> attribute. 
	 * @param value the cloudinaryGlobalVideoTransformation - Cloudinary Video Transformation
	 */
	public void setCloudinaryGlobalVideoTransformation(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "cloudinaryGlobalVideoTransformation".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryGlobalVideoTransformation</code> attribute. 
	 * @param value the cloudinaryGlobalVideoTransformation - Cloudinary Video Transformation
	 */
	public void setCloudinaryGlobalVideoTransformation(final String value)
	{
		setCloudinaryGlobalVideoTransformation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryImageFormat</code> attribute.
	 * @return the cloudinaryImageFormat - Cloudinary Image Format
	 */
	public EnumerationValue getCloudinaryImageFormat(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, "cloudinaryImageFormat".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryImageFormat</code> attribute.
	 * @return the cloudinaryImageFormat - Cloudinary Image Format
	 */
	public EnumerationValue getCloudinaryImageFormat()
	{
		return getCloudinaryImageFormat( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryImageFormat</code> attribute. 
	 * @param value the cloudinaryImageFormat - Cloudinary Image Format
	 */
	public void setCloudinaryImageFormat(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, "cloudinaryImageFormat".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryImageFormat</code> attribute. 
	 * @param value the cloudinaryImageFormat - Cloudinary Image Format
	 */
	public void setCloudinaryImageFormat(final EnumerationValue value)
	{
		setCloudinaryImageFormat( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryImageWidthLimitMax</code> attribute.
	 * @return the cloudinaryImageWidthLimitMax - Cloudinary Image Width Limit Maximum
	 */
	public Integer getCloudinaryImageWidthLimitMax(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, "cloudinaryImageWidthLimitMax".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryImageWidthLimitMax</code> attribute.
	 * @return the cloudinaryImageWidthLimitMax - Cloudinary Image Width Limit Maximum
	 */
	public Integer getCloudinaryImageWidthLimitMax()
	{
		return getCloudinaryImageWidthLimitMax( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryImageWidthLimitMax</code> attribute. 
	 * @return the cloudinaryImageWidthLimitMax - Cloudinary Image Width Limit Maximum
	 */
	public int getCloudinaryImageWidthLimitMaxAsPrimitive(final SessionContext ctx)
	{
		Integer value = getCloudinaryImageWidthLimitMax( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryImageWidthLimitMax</code> attribute. 
	 * @return the cloudinaryImageWidthLimitMax - Cloudinary Image Width Limit Maximum
	 */
	public int getCloudinaryImageWidthLimitMaxAsPrimitive()
	{
		return getCloudinaryImageWidthLimitMaxAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryImageWidthLimitMax</code> attribute. 
	 * @param value the cloudinaryImageWidthLimitMax - Cloudinary Image Width Limit Maximum
	 */
	public void setCloudinaryImageWidthLimitMax(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, "cloudinaryImageWidthLimitMax".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryImageWidthLimitMax</code> attribute. 
	 * @param value the cloudinaryImageWidthLimitMax - Cloudinary Image Width Limit Maximum
	 */
	public void setCloudinaryImageWidthLimitMax(final Integer value)
	{
		setCloudinaryImageWidthLimitMax( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryImageWidthLimitMax</code> attribute. 
	 * @param value the cloudinaryImageWidthLimitMax - Cloudinary Image Width Limit Maximum
	 */
	public void setCloudinaryImageWidthLimitMax(final SessionContext ctx, final int value)
	{
		setCloudinaryImageWidthLimitMax( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryImageWidthLimitMax</code> attribute. 
	 * @param value the cloudinaryImageWidthLimitMax - Cloudinary Image Width Limit Maximum
	 */
	public void setCloudinaryImageWidthLimitMax(final int value)
	{
		setCloudinaryImageWidthLimitMax( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryImageWidthLimitMin</code> attribute.
	 * @return the cloudinaryImageWidthLimitMin - Cloudinary Image width Limit Minimum
	 */
	public Integer getCloudinaryImageWidthLimitMin(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, "cloudinaryImageWidthLimitMin".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryImageWidthLimitMin</code> attribute.
	 * @return the cloudinaryImageWidthLimitMin - Cloudinary Image width Limit Minimum
	 */
	public Integer getCloudinaryImageWidthLimitMin()
	{
		return getCloudinaryImageWidthLimitMin( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryImageWidthLimitMin</code> attribute. 
	 * @return the cloudinaryImageWidthLimitMin - Cloudinary Image width Limit Minimum
	 */
	public int getCloudinaryImageWidthLimitMinAsPrimitive(final SessionContext ctx)
	{
		Integer value = getCloudinaryImageWidthLimitMin( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryImageWidthLimitMin</code> attribute. 
	 * @return the cloudinaryImageWidthLimitMin - Cloudinary Image width Limit Minimum
	 */
	public int getCloudinaryImageWidthLimitMinAsPrimitive()
	{
		return getCloudinaryImageWidthLimitMinAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryImageWidthLimitMin</code> attribute. 
	 * @param value the cloudinaryImageWidthLimitMin - Cloudinary Image width Limit Minimum
	 */
	public void setCloudinaryImageWidthLimitMin(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, "cloudinaryImageWidthLimitMin".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryImageWidthLimitMin</code> attribute. 
	 * @param value the cloudinaryImageWidthLimitMin - Cloudinary Image width Limit Minimum
	 */
	public void setCloudinaryImageWidthLimitMin(final Integer value)
	{
		setCloudinaryImageWidthLimitMin( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryImageWidthLimitMin</code> attribute. 
	 * @param value the cloudinaryImageWidthLimitMin - Cloudinary Image width Limit Minimum
	 */
	public void setCloudinaryImageWidthLimitMin(final SessionContext ctx, final int value)
	{
		setCloudinaryImageWidthLimitMin( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryImageWidthLimitMin</code> attribute. 
	 * @param value the cloudinaryImageWidthLimitMin - Cloudinary Image width Limit Minimum
	 */
	public void setCloudinaryImageWidthLimitMin(final int value)
	{
		setCloudinaryImageWidthLimitMin( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryMaxBreakPoints</code> attribute.
	 * @return the cloudinaryMaxBreakPoints - Cloudinary Max BreakPoints
	 */
	public Integer getCloudinaryMaxBreakPoints(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, "cloudinaryMaxBreakPoints".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryMaxBreakPoints</code> attribute.
	 * @return the cloudinaryMaxBreakPoints - Cloudinary Max BreakPoints
	 */
	public Integer getCloudinaryMaxBreakPoints()
	{
		return getCloudinaryMaxBreakPoints( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryMaxBreakPoints</code> attribute. 
	 * @return the cloudinaryMaxBreakPoints - Cloudinary Max BreakPoints
	 */
	public int getCloudinaryMaxBreakPointsAsPrimitive(final SessionContext ctx)
	{
		Integer value = getCloudinaryMaxBreakPoints( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryMaxBreakPoints</code> attribute. 
	 * @return the cloudinaryMaxBreakPoints - Cloudinary Max BreakPoints
	 */
	public int getCloudinaryMaxBreakPointsAsPrimitive()
	{
		return getCloudinaryMaxBreakPointsAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryMaxBreakPoints</code> attribute. 
	 * @param value the cloudinaryMaxBreakPoints - Cloudinary Max BreakPoints
	 */
	public void setCloudinaryMaxBreakPoints(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, "cloudinaryMaxBreakPoints".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryMaxBreakPoints</code> attribute. 
	 * @param value the cloudinaryMaxBreakPoints - Cloudinary Max BreakPoints
	 */
	public void setCloudinaryMaxBreakPoints(final Integer value)
	{
		setCloudinaryMaxBreakPoints( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryMaxBreakPoints</code> attribute. 
	 * @param value the cloudinaryMaxBreakPoints - Cloudinary Max BreakPoints
	 */
	public void setCloudinaryMaxBreakPoints(final SessionContext ctx, final int value)
	{
		setCloudinaryMaxBreakPoints( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryMaxBreakPoints</code> attribute. 
	 * @param value the cloudinaryMaxBreakPoints - Cloudinary Max BreakPoints
	 */
	public void setCloudinaryMaxBreakPoints(final int value)
	{
		setCloudinaryMaxBreakPoints( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryQuality</code> attribute.
	 * @return the cloudinaryQuality - Cloudinary Quality
	 */
	public EnumerationValue getCloudinaryQuality(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, "cloudinaryQuality".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryQuality</code> attribute.
	 * @return the cloudinaryQuality - Cloudinary Quality
	 */
	public EnumerationValue getCloudinaryQuality()
	{
		return getCloudinaryQuality( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryQuality</code> attribute. 
	 * @param value the cloudinaryQuality - Cloudinary Quality
	 */
	public void setCloudinaryQuality(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, "cloudinaryQuality".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryQuality</code> attribute. 
	 * @param value the cloudinaryQuality - Cloudinary Quality
	 */
	public void setCloudinaryQuality(final EnumerationValue value)
	{
		setCloudinaryQuality( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryResponsive</code> attribute.
	 * @return the cloudinaryResponsive - Enable Cloudinary Responsive Breakpoint
	 */
	public Boolean isCloudinaryResponsive(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, "cloudinaryResponsive".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryResponsive</code> attribute.
	 * @return the cloudinaryResponsive - Enable Cloudinary Responsive Breakpoint
	 */
	public Boolean isCloudinaryResponsive()
	{
		return isCloudinaryResponsive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryResponsive</code> attribute. 
	 * @return the cloudinaryResponsive - Enable Cloudinary Responsive Breakpoint
	 */
	public boolean isCloudinaryResponsiveAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isCloudinaryResponsive( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryResponsive</code> attribute. 
	 * @return the cloudinaryResponsive - Enable Cloudinary Responsive Breakpoint
	 */
	public boolean isCloudinaryResponsiveAsPrimitive()
	{
		return isCloudinaryResponsiveAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryResponsive</code> attribute. 
	 * @param value the cloudinaryResponsive - Enable Cloudinary Responsive Breakpoint
	 */
	public void setCloudinaryResponsive(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, "cloudinaryResponsive".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryResponsive</code> attribute. 
	 * @param value the cloudinaryResponsive - Enable Cloudinary Responsive Breakpoint
	 */
	public void setCloudinaryResponsive(final Boolean value)
	{
		setCloudinaryResponsive( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryResponsive</code> attribute. 
	 * @param value the cloudinaryResponsive - Enable Cloudinary Responsive Breakpoint
	 */
	public void setCloudinaryResponsive(final SessionContext ctx, final boolean value)
	{
		setCloudinaryResponsive( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryResponsive</code> attribute. 
	 * @param value the cloudinaryResponsive - Enable Cloudinary Responsive Breakpoint
	 */
	public void setCloudinaryResponsive(final boolean value)
	{
		setCloudinaryResponsive( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryURL</code> attribute.
	 * @return the cloudinaryURL - Cloudinary API url
	 */
	public String getCloudinaryURL(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "cloudinaryURL".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryURL</code> attribute.
	 * @return the cloudinaryURL - Cloudinary API url
	 */
	public String getCloudinaryURL()
	{
		return getCloudinaryURL( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryURL</code> attribute. 
	 * @param value the cloudinaryURL - Cloudinary API url
	 */
	public void setCloudinaryURL(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "cloudinaryURL".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryURL</code> attribute. 
	 * @param value the cloudinaryURL - Cloudinary API url
	 */
	public void setCloudinaryURL(final String value)
	{
		setCloudinaryURL( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryVideoFormat</code> attribute.
	 * @return the cloudinaryVideoFormat - Cloudinary Video Format
	 */
	public EnumerationValue getCloudinaryVideoFormat(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, "cloudinaryVideoFormat".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryVideoFormat</code> attribute.
	 * @return the cloudinaryVideoFormat - Cloudinary Video Format
	 */
	public EnumerationValue getCloudinaryVideoFormat()
	{
		return getCloudinaryVideoFormat( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryVideoFormat</code> attribute. 
	 * @param value the cloudinaryVideoFormat - Cloudinary Video Format
	 */
	public void setCloudinaryVideoFormat(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, "cloudinaryVideoFormat".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryVideoFormat</code> attribute. 
	 * @param value the cloudinaryVideoFormat - Cloudinary Video Format
	 */
	public void setCloudinaryVideoFormat(final EnumerationValue value)
	{
		setCloudinaryVideoFormat( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryVideoQuality</code> attribute.
	 * @return the cloudinaryVideoQuality - Cloudinary VideoQuality
	 */
	public EnumerationValue getCloudinaryVideoQuality(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, "cloudinaryVideoQuality".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.cloudinaryVideoQuality</code> attribute.
	 * @return the cloudinaryVideoQuality - Cloudinary VideoQuality
	 */
	public EnumerationValue getCloudinaryVideoQuality()
	{
		return getCloudinaryVideoQuality( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryVideoQuality</code> attribute. 
	 * @param value the cloudinaryVideoQuality - Cloudinary VideoQuality
	 */
	public void setCloudinaryVideoQuality(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, "cloudinaryVideoQuality".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.cloudinaryVideoQuality</code> attribute. 
	 * @param value the cloudinaryVideoQuality - Cloudinary VideoQuality
	 */
	public void setCloudinaryVideoQuality(final EnumerationValue value)
	{
		setCloudinaryVideoQuality( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.enableCloudinary</code> attribute.
	 * @return the enableCloudinary - Enable Cloudinary Boolean Field
	 */
	public Boolean isEnableCloudinary(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, "enableCloudinary".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.enableCloudinary</code> attribute.
	 * @return the enableCloudinary - Enable Cloudinary Boolean Field
	 */
	public Boolean isEnableCloudinary()
	{
		return isEnableCloudinary( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.enableCloudinary</code> attribute. 
	 * @return the enableCloudinary - Enable Cloudinary Boolean Field
	 */
	public boolean isEnableCloudinaryAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isEnableCloudinary( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.enableCloudinary</code> attribute. 
	 * @return the enableCloudinary - Enable Cloudinary Boolean Field
	 */
	public boolean isEnableCloudinaryAsPrimitive()
	{
		return isEnableCloudinaryAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.enableCloudinary</code> attribute. 
	 * @param value the enableCloudinary - Enable Cloudinary Boolean Field
	 */
	public void setEnableCloudinary(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, "enableCloudinary".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.enableCloudinary</code> attribute. 
	 * @param value the enableCloudinary - Enable Cloudinary Boolean Field
	 */
	public void setEnableCloudinary(final Boolean value)
	{
		setEnableCloudinary( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.enableCloudinary</code> attribute. 
	 * @param value the enableCloudinary - Enable Cloudinary Boolean Field
	 */
	public void setEnableCloudinary(final SessionContext ctx, final boolean value)
	{
		setEnableCloudinary( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.enableCloudinary</code> attribute. 
	 * @param value the enableCloudinary - Enable Cloudinary Boolean Field
	 */
	public void setEnableCloudinary(final boolean value)
	{
		setEnableCloudinary( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.enableCloudinaryGalleryWidget</code> attribute.
	 * @return the enableCloudinaryGalleryWidget - Enable Cloudinary Gallery Widget
	 */
	public Boolean isEnableCloudinaryGalleryWidget(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, "enableCloudinaryGalleryWidget".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.enableCloudinaryGalleryWidget</code> attribute.
	 * @return the enableCloudinaryGalleryWidget - Enable Cloudinary Gallery Widget
	 */
	public Boolean isEnableCloudinaryGalleryWidget()
	{
		return isEnableCloudinaryGalleryWidget( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.enableCloudinaryGalleryWidget</code> attribute. 
	 * @return the enableCloudinaryGalleryWidget - Enable Cloudinary Gallery Widget
	 */
	public boolean isEnableCloudinaryGalleryWidgetAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isEnableCloudinaryGalleryWidget( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.enableCloudinaryGalleryWidget</code> attribute. 
	 * @return the enableCloudinaryGalleryWidget - Enable Cloudinary Gallery Widget
	 */
	public boolean isEnableCloudinaryGalleryWidgetAsPrimitive()
	{
		return isEnableCloudinaryGalleryWidgetAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.enableCloudinaryGalleryWidget</code> attribute. 
	 * @param value the enableCloudinaryGalleryWidget - Enable Cloudinary Gallery Widget
	 */
	public void setEnableCloudinaryGalleryWidget(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, "enableCloudinaryGalleryWidget".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.enableCloudinaryGalleryWidget</code> attribute. 
	 * @param value the enableCloudinaryGalleryWidget - Enable Cloudinary Gallery Widget
	 */
	public void setEnableCloudinaryGalleryWidget(final Boolean value)
	{
		setEnableCloudinaryGalleryWidget( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.enableCloudinaryGalleryWidget</code> attribute. 
	 * @param value the enableCloudinaryGalleryWidget - Enable Cloudinary Gallery Widget
	 */
	public void setEnableCloudinaryGalleryWidget(final SessionContext ctx, final boolean value)
	{
		setEnableCloudinaryGalleryWidget( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.enableCloudinaryGalleryWidget</code> attribute. 
	 * @param value the enableCloudinaryGalleryWidget - Enable Cloudinary Gallery Widget
	 */
	public void setEnableCloudinaryGalleryWidget(final boolean value)
	{
		setEnableCloudinaryGalleryWidget( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.enableCloudinaryVideoPlayer</code> attribute.
	 * @return the enableCloudinaryVideoPlayer - Enable Cloudinary Video Player
	 */
	public Boolean isEnableCloudinaryVideoPlayer(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, "enableCloudinaryVideoPlayer".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.enableCloudinaryVideoPlayer</code> attribute.
	 * @return the enableCloudinaryVideoPlayer - Enable Cloudinary Video Player
	 */
	public Boolean isEnableCloudinaryVideoPlayer()
	{
		return isEnableCloudinaryVideoPlayer( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.enableCloudinaryVideoPlayer</code> attribute. 
	 * @return the enableCloudinaryVideoPlayer - Enable Cloudinary Video Player
	 */
	public boolean isEnableCloudinaryVideoPlayerAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isEnableCloudinaryVideoPlayer( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.enableCloudinaryVideoPlayer</code> attribute. 
	 * @return the enableCloudinaryVideoPlayer - Enable Cloudinary Video Player
	 */
	public boolean isEnableCloudinaryVideoPlayerAsPrimitive()
	{
		return isEnableCloudinaryVideoPlayerAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.enableCloudinaryVideoPlayer</code> attribute. 
	 * @param value the enableCloudinaryVideoPlayer - Enable Cloudinary Video Player
	 */
	public void setEnableCloudinaryVideoPlayer(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, "enableCloudinaryVideoPlayer".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.enableCloudinaryVideoPlayer</code> attribute. 
	 * @param value the enableCloudinaryVideoPlayer - Enable Cloudinary Video Player
	 */
	public void setEnableCloudinaryVideoPlayer(final Boolean value)
	{
		setEnableCloudinaryVideoPlayer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.enableCloudinaryVideoPlayer</code> attribute. 
	 * @param value the enableCloudinaryVideoPlayer - Enable Cloudinary Video Player
	 */
	public void setEnableCloudinaryVideoPlayer(final SessionContext ctx, final boolean value)
	{
		setEnableCloudinaryVideoPlayer( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.enableCloudinaryVideoPlayer</code> attribute. 
	 * @param value the enableCloudinaryVideoPlayer - Enable Cloudinary Video Player
	 */
	public void setEnableCloudinaryVideoPlayer(final boolean value)
	{
		setEnableCloudinaryVideoPlayer( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.enableOptimizeContentImage</code> attribute.
	 * @return the enableOptimizeContentImage - Enable Optimize Content Images
	 */
	public Boolean isEnableOptimizeContentImage(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, "enableOptimizeContentImage".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.enableOptimizeContentImage</code> attribute.
	 * @return the enableOptimizeContentImage - Enable Optimize Content Images
	 */
	public Boolean isEnableOptimizeContentImage()
	{
		return isEnableOptimizeContentImage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.enableOptimizeContentImage</code> attribute. 
	 * @return the enableOptimizeContentImage - Enable Optimize Content Images
	 */
	public boolean isEnableOptimizeContentImageAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isEnableOptimizeContentImage( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.enableOptimizeContentImage</code> attribute. 
	 * @return the enableOptimizeContentImage - Enable Optimize Content Images
	 */
	public boolean isEnableOptimizeContentImageAsPrimitive()
	{
		return isEnableOptimizeContentImageAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.enableOptimizeContentImage</code> attribute. 
	 * @param value the enableOptimizeContentImage - Enable Optimize Content Images
	 */
	public void setEnableOptimizeContentImage(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, "enableOptimizeContentImage".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.enableOptimizeContentImage</code> attribute. 
	 * @param value the enableOptimizeContentImage - Enable Optimize Content Images
	 */
	public void setEnableOptimizeContentImage(final Boolean value)
	{
		setEnableOptimizeContentImage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.enableOptimizeContentImage</code> attribute. 
	 * @param value the enableOptimizeContentImage - Enable Optimize Content Images
	 */
	public void setEnableOptimizeContentImage(final SessionContext ctx, final boolean value)
	{
		setEnableOptimizeContentImage( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.enableOptimizeContentImage</code> attribute. 
	 * @param value the enableOptimizeContentImage - Enable Optimize Content Images
	 */
	public void setEnableOptimizeContentImage(final boolean value)
	{
		setEnableOptimizeContentImage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.enableOptimizeContentVideo</code> attribute.
	 * @return the enableOptimizeContentVideo - Enable Optimize Content Videos
	 */
	public Boolean isEnableOptimizeContentVideo(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, "enableOptimizeContentVideo".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.enableOptimizeContentVideo</code> attribute.
	 * @return the enableOptimizeContentVideo - Enable Optimize Content Videos
	 */
	public Boolean isEnableOptimizeContentVideo()
	{
		return isEnableOptimizeContentVideo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.enableOptimizeContentVideo</code> attribute. 
	 * @return the enableOptimizeContentVideo - Enable Optimize Content Videos
	 */
	public boolean isEnableOptimizeContentVideoAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isEnableOptimizeContentVideo( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.enableOptimizeContentVideo</code> attribute. 
	 * @return the enableOptimizeContentVideo - Enable Optimize Content Videos
	 */
	public boolean isEnableOptimizeContentVideoAsPrimitive()
	{
		return isEnableOptimizeContentVideoAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.enableOptimizeContentVideo</code> attribute. 
	 * @param value the enableOptimizeContentVideo - Enable Optimize Content Videos
	 */
	public void setEnableOptimizeContentVideo(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, "enableOptimizeContentVideo".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.enableOptimizeContentVideo</code> attribute. 
	 * @param value the enableOptimizeContentVideo - Enable Optimize Content Videos
	 */
	public void setEnableOptimizeContentVideo(final Boolean value)
	{
		setEnableOptimizeContentVideo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.enableOptimizeContentVideo</code> attribute. 
	 * @param value the enableOptimizeContentVideo - Enable Optimize Content Videos
	 */
	public void setEnableOptimizeContentVideo(final SessionContext ctx, final boolean value)
	{
		setEnableOptimizeContentVideo( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.enableOptimizeContentVideo</code> attribute. 
	 * @param value the enableOptimizeContentVideo - Enable Optimize Content Videos
	 */
	public void setEnableOptimizeContentVideo(final boolean value)
	{
		setEnableOptimizeContentVideo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.enableOptimizeImage</code> attribute.
	 * @return the enableOptimizeImage - Enable Optimize Images
	 */
	public Boolean isEnableOptimizeImage(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, "enableOptimizeImage".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.enableOptimizeImage</code> attribute.
	 * @return the enableOptimizeImage - Enable Optimize Images
	 */
	public Boolean isEnableOptimizeImage()
	{
		return isEnableOptimizeImage( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.enableOptimizeImage</code> attribute. 
	 * @return the enableOptimizeImage - Enable Optimize Images
	 */
	public boolean isEnableOptimizeImageAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isEnableOptimizeImage( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.enableOptimizeImage</code> attribute. 
	 * @return the enableOptimizeImage - Enable Optimize Images
	 */
	public boolean isEnableOptimizeImageAsPrimitive()
	{
		return isEnableOptimizeImageAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.enableOptimizeImage</code> attribute. 
	 * @param value the enableOptimizeImage - Enable Optimize Images
	 */
	public void setEnableOptimizeImage(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, "enableOptimizeImage".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.enableOptimizeImage</code> attribute. 
	 * @param value the enableOptimizeImage - Enable Optimize Images
	 */
	public void setEnableOptimizeImage(final Boolean value)
	{
		setEnableOptimizeImage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.enableOptimizeImage</code> attribute. 
	 * @param value the enableOptimizeImage - Enable Optimize Images
	 */
	public void setEnableOptimizeImage(final SessionContext ctx, final boolean value)
	{
		setEnableOptimizeImage( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.enableOptimizeImage</code> attribute. 
	 * @param value the enableOptimizeImage - Enable Optimize Images
	 */
	public void setEnableOptimizeImage(final boolean value)
	{
		setEnableOptimizeImage( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.enableOptimizeVideo</code> attribute.
	 * @return the enableOptimizeVideo - Enable Optimize Videos
	 */
	public Boolean isEnableOptimizeVideo(final SessionContext ctx)
	{
		return (Boolean)getProperty( ctx, "enableOptimizeVideo".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.enableOptimizeVideo</code> attribute.
	 * @return the enableOptimizeVideo - Enable Optimize Videos
	 */
	public Boolean isEnableOptimizeVideo()
	{
		return isEnableOptimizeVideo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.enableOptimizeVideo</code> attribute. 
	 * @return the enableOptimizeVideo - Enable Optimize Videos
	 */
	public boolean isEnableOptimizeVideoAsPrimitive(final SessionContext ctx)
	{
		Boolean value = isEnableOptimizeVideo( ctx );
		return value != null ? value.booleanValue() : false;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.enableOptimizeVideo</code> attribute. 
	 * @return the enableOptimizeVideo - Enable Optimize Videos
	 */
	public boolean isEnableOptimizeVideoAsPrimitive()
	{
		return isEnableOptimizeVideoAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.enableOptimizeVideo</code> attribute. 
	 * @param value the enableOptimizeVideo - Enable Optimize Videos
	 */
	public void setEnableOptimizeVideo(final SessionContext ctx, final Boolean value)
	{
		setProperty(ctx, "enableOptimizeVideo".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.enableOptimizeVideo</code> attribute. 
	 * @param value the enableOptimizeVideo - Enable Optimize Videos
	 */
	public void setEnableOptimizeVideo(final Boolean value)
	{
		setEnableOptimizeVideo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.enableOptimizeVideo</code> attribute. 
	 * @param value the enableOptimizeVideo - Enable Optimize Videos
	 */
	public void setEnableOptimizeVideo(final SessionContext ctx, final boolean value)
	{
		setEnableOptimizeVideo( ctx,Boolean.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.enableOptimizeVideo</code> attribute. 
	 * @param value the enableOptimizeVideo - Enable Optimize Videos
	 */
	public void setEnableOptimizeVideo(final boolean value)
	{
		setEnableOptimizeVideo( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.mediaUploadPreset</code> attribute.
	 * @return the mediaUploadPreset - Selected preset for media upload
	 */
	public Preset getMediaUploadPreset(final SessionContext ctx)
	{
		return (Preset)getProperty( ctx, "mediaUploadPreset".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.mediaUploadPreset</code> attribute.
	 * @return the mediaUploadPreset - Selected preset for media upload
	 */
	public Preset getMediaUploadPreset()
	{
		return getMediaUploadPreset( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.mediaUploadPreset</code> attribute. 
	 * @param value the mediaUploadPreset - Selected preset for media upload
	 */
	public void setMediaUploadPreset(final SessionContext ctx, final Preset value)
	{
		setProperty(ctx, "mediaUploadPreset".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.mediaUploadPreset</code> attribute. 
	 * @param value the mediaUploadPreset - Selected preset for media upload
	 */
	public void setMediaUploadPreset(final Preset value)
	{
		setMediaUploadPreset( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.videoPlayerTransformation</code> attribute.
	 * @return the videoPlayerTransformation - Cloudinary Video Transformation Json String
	 */
	public String getVideoPlayerTransformation(final SessionContext ctx)
	{
		return (String)getProperty( ctx, "videoPlayerTransformation".intern());
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryConfig.videoPlayerTransformation</code> attribute.
	 * @return the videoPlayerTransformation - Cloudinary Video Transformation Json String
	 */
	public String getVideoPlayerTransformation()
	{
		return getVideoPlayerTransformation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.videoPlayerTransformation</code> attribute. 
	 * @param value the videoPlayerTransformation - Cloudinary Video Transformation Json String
	 */
	public void setVideoPlayerTransformation(final SessionContext ctx, final String value)
	{
		setProperty(ctx, "videoPlayerTransformation".intern(),value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryConfig.videoPlayerTransformation</code> attribute. 
	 * @param value the videoPlayerTransformation - Cloudinary Video Transformation Json String
	 */
	public void setVideoPlayerTransformation(final String value)
	{
		setVideoPlayerTransformation( getSession().getSessionContext(), value );
	}
	
}
