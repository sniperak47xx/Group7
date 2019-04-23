package dk.sdu.mmmi.cbse.osgiplayer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

    public void start(BundleContext context) throws Exception {
        // TODO add activation code here
        System.out.println("Player start");
    }

    public void stop(BundleContext context) throws Exception {
        // TODO add deactivation code here
        System.out.println("Player stop");
    }

}
