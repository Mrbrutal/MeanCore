/*******************************************************************************
 * Copyright (c) 2014 Mrbrutal. All rights reserved.
 * Do not modify or redistribute without written permission.
 *
 * @author Mrbrutal
 ******************************************************************************/

package si.meansoft.meancore.event;

import cpw.mods.fml.common.event.FMLFingerprintViolationEvent;
import org.apache.logging.log4j.Level;
import si.meansoft.meancore.common.library.InfoMC;
import si.meansoft.meancore.common.util.LogUtil;

public class Fingerprint {

    public void init(FMLFingerprintViolationEvent evt, String fingerprint) {
        if(fingerprint.equals("@FINGERPRINT@")) {
            LogUtil.log(Level.INFO, "Fingerprint ok", InfoMC.MOD);
        }
        else {
            LogUtil.log(Level.FATAL, "The .jar file has been tempered with", InfoMC.MOD);
        }
    }
}
