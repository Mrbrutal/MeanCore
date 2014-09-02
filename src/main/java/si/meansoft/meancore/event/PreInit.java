/*******************************************************************************
 * Copyright (c) 2014 Mrbrutal. All rights reserved.
 * Do not modify or redistribute without written permission.
 *
 * @author Mrbrutal
 ******************************************************************************/

package si.meansoft.meancore.event;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import si.meansoft.meancore.common.block.EMBlockInit;
import si.meansoft.meancore.common.config.ConfigHandler;
import si.meansoft.meancore.common.creativetab.TabsMC;
import si.meansoft.meancore.common.item.EMItemInit;

public class PreInit {

    public void init(FMLPreInitializationEvent evt) {
        //Localize tests TODO remove
        System.out.println(evt.getModConfigurationDirectory());
        Localize.init("en_US");

        ConfigHandler.init(evt.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigHandler());

        EMItemInit.init();
        EMBlockInit.init();
    }
}
