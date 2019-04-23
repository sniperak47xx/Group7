package dk.sdu.mmmi.cbse.osgicommonplayer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

    @Override
    public void start(BundleContext bc) throws Exception {
        System.out.println("Common Start");
    }

    @Override
    public void stop(BundleContext bc) throws Exception {
        System.out.println("common stop");
    }

}
