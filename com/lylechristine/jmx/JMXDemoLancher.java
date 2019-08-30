package com.lylechristine.jmx;

import javax.management.*;
import java.lang.management.ManagementFactory;

public class JMXDemoLancher {

    public static void main(String[] args) {

        ObjectName objectName = null;
        try {
            objectName = new ObjectName("com.lylechristine.jmx:type=basic,name=game");
        } catch (MalformedObjectNameException e) {
            e.printStackTrace();
        }
        MBeanServer server = ManagementFactory.getPlatformMBeanServer();
        Game gameObj = new Game();
        try {
            server.registerMBean(gameObj, objectName);
        } catch (InstanceAlreadyExistsException | MBeanRegistrationException | NotCompliantMBeanException e) {
            e.printStackTrace();
        }

        while (true) {
            // to ensure application does not terminate
        }
    }
}

