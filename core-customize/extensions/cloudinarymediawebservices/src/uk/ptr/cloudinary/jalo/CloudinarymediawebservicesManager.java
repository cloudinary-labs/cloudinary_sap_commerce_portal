package uk.ptr.cloudinary.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;
import uk.ptr.cloudinary.constants.CloudinarymediawebservicesConstants;

public class CloudinarymediawebservicesManager extends GeneratedCloudinarymediawebservicesManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( CloudinarymediawebservicesManager.class.getName() );
	
	public static final CloudinarymediawebservicesManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (CloudinarymediawebservicesManager) em.getExtension(CloudinarymediawebservicesConstants.EXTENSIONNAME);
	}
	
}
