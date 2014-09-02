/*******************************************************************************
 * Copyright (c) 2014 Mrbrutal. All rights reserved.
 * Do not modify or redistribute without written permission.
 *
 * @author Mrbrutal
 ******************************************************************************/

package si.meansoft.meancore.event;

import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.event.FMLServerStoppingEvent;
import si.meansoft.meancore.common.command.CommEMClient;
import si.meansoft.meancore.common.command.CommEMServer;

public class Server {

    public void initStart(FMLServerStartingEvent evt) {
        evt.registerServerCommand(new CommEMClient());
        evt.registerServerCommand(new CommEMServer());
    }

    public void initStop(FMLServerStoppingEvent evt) {

    }
}
