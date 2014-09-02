/*******************************************************************************
 * Copyright (c) 2014 Mrbrutal. All rights reserved.
 * Do not modify or redistribute without written permission.
 *
 * @author Mrbrutal
 ******************************************************************************/

package si.meansoft.meancore.common.util;

import cpw.mods.fml.common.FMLLog;
import org.apache.logging.log4j.Level;
import si.meansoft.meancore.common.library.InfoMC;

public class LogUtil {

    /**
     * Log with specific level as object
     *
     * @param logLevel level of log
     * @param obj object to log
     * @param modID mod name(ID) of logger
     */
    public static void log(Level logLevel, Object obj, String modID) {
        FMLLog.log(modID, logLevel, String.valueOf(obj));
    }

    /**
     * Log with specific level as string
     *
     * @param logLevel level of log
     * @param str string to log
     * @param modID mod name(ID) of logger
     */
    public static void log(Level logLevel, String str, String modID) {
        FMLLog.log(modID, logLevel, str);
    }

    public static void all(Object obj, String id) { log(Level.ALL, obj, id); }

    public static void debug(Object obj, String id) { log(Level.DEBUG, obj, id); }

    public static void error(Object obj, String id) { log(Level.ERROR, obj, id); }

    public static void fatal(Object obj, String id) { log(Level.FATAL, obj, id); }

    public static void info(Object obj, String id) { log(Level.INFO, obj, id); }

    public static void off(Object obj, String id) { log(Level.OFF, obj, id); }

    public static void trace(Object obj, String id) { log(Level.TRACE, obj, id); }

    public static void warn(Object obj, String id) { log(Level.WARN, obj, id); }
}
