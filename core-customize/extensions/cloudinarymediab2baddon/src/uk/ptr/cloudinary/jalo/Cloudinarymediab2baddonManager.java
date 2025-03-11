package uk.ptr.cloudinary.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;
import uk.ptr.cloudinary.constants.Cloudinarymediab2baddonConstants;

public class Cloudinarymediab2baddonManager extends GeneratedCloudinarymediab2baddonManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( Cloudinarymediab2baddonManager.class.getName() );
	
	public static final Cloudinarymediab2baddonManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (Cloudinarymediab2baddonManager) em.getExtension(Cloudinarymediab2baddonConstants.EXTENSIONNAME);
	}
	
}
