/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 11 Mar 2025, 13:09:50                       ---
 * ----------------------------------------------------------------
 */
package uk.ptr.cloudinary.jalo;

import de.hybris.platform.core.jalo.components.CloudinaryGalleryComponent;
import de.hybris.platform.core.jalo.components.CloudinaryVideoComponent;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.HashMap;
import java.util.Map;
import uk.ptr.cloudinary.constants.Cloudinarymediab2baddonConstants;

/**
 * Generated class for type <code>Cloudinarymediab2baddonManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedCloudinarymediab2baddonManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
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
	
	public CloudinaryGalleryComponent createCloudinaryGalleryComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Cloudinarymediab2baddonConstants.TC.CLOUDINARYGALLERYCOMPONENT );
			return (CloudinaryGalleryComponent)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CloudinaryGalleryComponent : "+e.getMessage(), 0 );
		}
	}
	
	public CloudinaryGalleryComponent createCloudinaryGalleryComponent(final Map attributeValues)
	{
		return createCloudinaryGalleryComponent( getSession().getSessionContext(), attributeValues );
	}
	
	public CloudinaryVideoComponent createCloudinaryVideoComponent(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( Cloudinarymediab2baddonConstants.TC.CLOUDINARYVIDEOCOMPONENT );
			return (CloudinaryVideoComponent)type.newInstance( ctx, attributeValues );
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
			throw new JaloSystemException( e ,"error creating CloudinaryVideoComponent : "+e.getMessage(), 0 );
		}
	}
	
	public CloudinaryVideoComponent createCloudinaryVideoComponent(final Map attributeValues)
	{
		return createCloudinaryVideoComponent( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return Cloudinarymediab2baddonConstants.EXTENSIONNAME;
	}
	
}
