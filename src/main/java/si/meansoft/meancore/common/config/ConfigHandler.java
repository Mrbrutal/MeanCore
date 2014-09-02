/*******************************************************************************
 * Copyright (c) 2014 Mrbrutal. All rights reserved.
 * Do not modify or redistribute without written permission.
 *
 * @author Mrbrutal
 ******************************************************************************/

package si.meansoft.meancore.common.config;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;
import si.meansoft.meancore.common.library.InfoMC;

import java.io.File;

public class ConfigHandler {

    public static Configuration config;
    public static boolean configValue;

    public static void init(File file) {
        if(config == null) {
            config = new Configuration(file);
            loadConfig();
        }
    }

    private static void loadConfig() {
        configValue = config.get(Configuration.CATEGORY_GENERAL, "configValue", true, "Test config value").getBoolean(true);
        if(config.hasChanged()) {
            config.save();
        }
    }

    @SubscribeEvent
    public void onConfigChangeEvt(ConfigChangedEvent.OnConfigChangedEvent evt) {
        if(evt.modID.equalsIgnoreCase(InfoMC.MODID)) {
            loadConfig();
        }
    }
}
