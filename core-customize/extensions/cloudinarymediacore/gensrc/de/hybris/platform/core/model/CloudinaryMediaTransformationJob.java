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
 * Generated class for type CloudinaryMediaTransformationJob.
 */
@SLDSafe
@SuppressWarnings({"unused","cast"})
public class CloudinaryMediaTransformationJob extends CronJob
{
	/** Qualifier of the <code>CloudinaryMediaTransformationJob.catalogVersions</code> attribute **/
	public static final String CATALOGVERSIONS = "catalogVersions";
	/**
	* {@link OneToManyHandler} for handling 1:n CATALOGVERSIONS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<CatalogVersion> CATALOGVERSIONSHANDLER = new OneToManyHandler<CatalogVersion>(
	CatalogConstants.TC.CATALOGVERSION,
	false,
	"cloudinaryMediaTransformationJob",
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
	 * <i>Generated method</i> - Getter of the <code>CloudinaryMediaTransformationJob.catalogVersions</code> attribute.
	 * @return the catalogVersions
	 */
	public Collection<CatalogVersion> getCatalogVersions(final SessionContext ctx)
	{
		return CATALOGVERSIONSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CloudinaryMediaTransformationJob.catalogVersions</code> attribute.
	 * @return the catalogVersions
	 */
	public Collection<CatalogVersion> getCatalogVersions()
	{
		return getCatalogVersions( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryMediaTransformationJob.catalogVersions</code> attribute. 
	 * @param value the catalogVersions
	 */
	public void setCatalogVersions(final SessionContext ctx, final Collection<CatalogVersion> value)
	{
		CATALOGVERSIONSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CloudinaryMediaTransformationJob.catalogVersions</code> attribute. 
	 * @param value the catalogVersions
	 */
	public void setCatalogVersions(final Collection<CatalogVersion> value)
	{
		setCatalogVersions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to catalogVersions. 
	 * @param value the item to add to catalogVersions
	 */
	public void addToCatalogVersions(final SessionContext ctx, final CatalogVersion value)
	{
		CATALOGVERSIONSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to catalogVersions. 
	 * @param value the item to add to catalogVersions
	 */
	public void addToCatalogVersions(final CatalogVersion value)
	{
		addToCatalogVersions( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from catalogVersions. 
	 * @param value the item to remove from catalogVersions
	 */
	public void removeFromCatalogVersions(final SessionContext ctx, final CatalogVersion value)
	{
		CATALOGVERSIONSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from catalogVersions. 
	 * @param value the item to remove from catalogVersions
	 */
	public void removeFromCatalogVersions(final CatalogVersion value)
	{
		removeFromCatalogVersions( getSession().getSessionContext(), value );
	}
	
}
