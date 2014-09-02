/*******************************************************************************
 * Copyright (c) 2014 Mrbrutal. All rights reserved.
 * Do not modify or redistribute without written permission.
 *
 * @author Mrbrutal
 ******************************************************************************/

package si.meansoft.meancore.event;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class Localize {

    private static Map<String,String> modLandData = new HashMap<String, String>();

    public static String BLOCK = "Block localizations";
    public static String ITEM = "Item localizations";
    public static String ENT = "Entity localizations";
    public static String GUI = "GUI localizations";
    public static String TAB = "Creative tab localizations";
    public static String EXTRA = "Extra localizations";
    public static String ACH = "Achievement localizations";
    public static String COMM = "Command localizations";
    public static String VER = "Version localizations";
    public static String KEY = "Key localizations";

    public static boolean init(String locale) {
        parse(locale);
        return true;
    }

    public static void parse(String locale) {
        InputStream is = Localize.class.getResourceAsStream("/resources/assets/examplemod/lang/" + locale + ".lang");
    }

    public static void addLocEntry(String entry, String key) {
        modLandData.put(entry + ".name=", key);
    }

    public static void printMap() {
        for(Map.Entry<String, String> map : modLandData.entrySet()) {
            System.out.println("Key: " + map.getKey() + " Value: " + map.getValue());
        }
    }
}
