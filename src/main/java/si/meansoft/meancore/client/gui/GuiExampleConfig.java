/*******************************************************************************
 * Copyright (c) 2014 Mrbrutal. All rights reserved.
 * Do not modify or redistribute without written permission.
 *
 * @author Mrbrutal
 ******************************************************************************/

package si.meansoft.meancore.client.gui;

import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import si.meansoft.meancore.common.config.ConfigHandler;
import si.meansoft.meancore.common.library.InfoMC;

public class GuiExampleConfig extends GuiConfig {

    public GuiExampleConfig(GuiScreen parentScreen) {
        super(parentScreen, new ConfigElement(ConfigHandler.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(), InfoMC.MODID, false, false, GuiConfig.getAbridgedConfigPath(ConfigHandler.config.toString()));
    }
}
