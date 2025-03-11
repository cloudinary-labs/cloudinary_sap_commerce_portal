/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 11 Mar 2025, 13:09:50                       ---
 * ----------------------------------------------------------------
 *  
 * Copyright (c) 2025 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.core.model;

import de.hybris.platform.catalog.constants.CatalogConstants;
import de.hybris.platform.catalog.jalo.CatalogVersion;
import de.hybris.platform.cronjob.jalo.CronJob;
import de.hybris.platform.directpersistence.annotation.SLDSafe;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type CloudinaryMediaUploadSyncJob.
 */
@SLDSafe
@SuppressWarnings({"unused","cast"})
public class CloudinaryMediaUploadSyncJob extends CronJob
{
	/** Qualifier of the <code>CloudinaryMediaUploadSyncJob.catalogVersion</code> attribute **/
	public static final String CATALOGVERSION = "catalogVersion";
	/**
	* {@link OneToManyHandler} for handling 1:n CATALOGVERSION's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<CatalogVersion> CATALOGVERSIONHANDLER = new OneToManyHandler<CatalogVersion>(
	CatalogConstants.TC.CATALOGVERSION,
	false,
	"cloudinaryMediaUploadSyncJob",
	null,
	false,
	true,
	CollectionType.COLLECTION
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(CronJob.DEFAULT_INITIAL_ATTRIBUTES);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryMediaUploadSyncJob.catalogVersion</code> attribute.
	 * @return the catalogVersion
	 */
	public Collection<CatalogVersion> getCatalogVersion(final SessionContext ctx)
	{
		return CATALOGVERSIONHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryMediaUploadSyncJob.catalogVersion</code> attribute.
	 * @return the catalogVersion
	 */
	public Collection<CatalogVersion> getCatalogVersion()
	{
		return getCatalogVersion( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryMediaUploadSyncJob.catalogVersion</code> attribute. 
	 * @param value the catalogVersion
	 */
	public void setCatalogVersion(final SessionContext ctx, final Collection<CatalogVersion> value)
	{
		CATALOGVERSIONHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryMediaUploadSyncJob.catalogVersion</code> attribute. 
	 * @param value the catalogVersion
	 */
	public void setCatalogVersion(final Collection<CatalogVersion> value)
	{
		setCatalogVersion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to catalogVersion. 
	 * @param value the item to add to catalogVersion
	 */
	public void addToCatalogVersion(final SessionContext ctx, final CatalogVersion value)
	{
		CATALOGVERSIONHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to catalogVersion. 
	 * @param value the item to add to catalogVersion
	 */
	public void addToCatalogVersion(final CatalogVersion value)
	{
		addToCatalogVersion( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from catalogVersion. 
	 * @param value the item to remove from catalogVersion
	 */
	public void removeFromCatalogVersion(final SessionContext ctx, final CatalogVersion value)
	{
		CATALOGVERSIONHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from catalogVersion. 
	 * @param value the item to remove from catalogVersion
	 */
	public void removeFromCatalogVersion(final CatalogVersion value)
	{
		removeFromCatalogVersion( getSession().getSessionContext(), value );
	}
	
}
