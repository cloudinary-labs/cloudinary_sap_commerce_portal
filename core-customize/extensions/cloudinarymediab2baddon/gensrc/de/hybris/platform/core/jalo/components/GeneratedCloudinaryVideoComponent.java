/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 11 Mar 2025, 13:09:50                       ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2025 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.core.jalo.components;

import de.hybris.platform.cms2.jalo.contents.components.SimpleCMSComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.media.Media;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import uk.ptr.cloudinary.constants.Cloudinarymediab2baddonConstants;

/**
 * Generated class for type {@link de.hybris.platform.core.jalo.components.CloudinaryVideoComponent CloudinaryVideoComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedCloudinaryVideoComponent extends SimpleCMSComponent
{
	/** Qualifier of the <code>CloudinaryVideoComponent.cloudinaryVideo</code> attribute **/
	public static final String CLOUDINARYVIDEO = "cloudinaryVideo";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(SimpleCMSComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(CLOUDINARYVIDEO, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryVideoComponent.cloudinaryVideo</code> attribute.
	 * @return the cloudinaryVideo - Cloudinary Video
	 */
	public Media getCloudinaryVideo(final SessionContext ctx)
	{
		return (Media)getProperty( ctx, CLOUDINARYVIDEO);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryVideoComponent.cloudinaryVideo</code> attribute.
	 * @return the cloudinaryVideo - Cloudinary Video
	 */
	public Media getCloudinaryVideo()
	{
		return getCloudinaryVideo( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryVideoComponent.cloudinaryVideo</code> attribute. 
	 * @param value the cloudinaryVideo - Cloudinary Video
	 */
	public void setCloudinaryVideo(final SessionContext ctx, final Media value)
	{
		setProperty(ctx, CLOUDINARYVIDEO,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryVideoComponent.cloudinaryVideo</code> attribute. 
	 * @param value the cloudinaryVideo - Cloudinary Video
	 */
	public void setCloudinaryVideo(final Media value)
	{
		setCloudinaryVideo( getSession().getSessionContext(), value );
	}
	
}
