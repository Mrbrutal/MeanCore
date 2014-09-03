/*******************************************************************************
 * Copyright (c) 2014 Mrbrutal. All rights reserved.
 * Do not modify or redistribute without written permission.
 *
 * @author Mrbrutal
 ******************************************************************************/

package si.meansoft.meancore.common.config;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler {

    public static Configuration config;
    public static boolean configValue;
    private static String modid;

    public static void init(File file, String id) {
        modid = id;
        if(config == null) {
            config = new Configuration(file);
        }
    }

    public static boolean loadBoolean(boolean defalt, String category, String confValue, String name) {
        boolean value = config.get(category, confValue, defalt, name).getBoolean(defalt);
        hasChanged();
        return value;
    }

    public static int loadInt(int defalt, String category, String confValue, String name) {
        int value = config.get(category, confValue, defalt, name).getInt(defalt);
        hasChanged();
        return value;
    }

    public static String loadString(String defalt, String category, String confValue, String name) {
        String value = config.get(category, confValue, defalt, name).getString();
        hasChanged();
        return value;
    }

    private static void hasChanged() {
        if(config.hasChanged()) {
            config.save();
        }
    }
}
