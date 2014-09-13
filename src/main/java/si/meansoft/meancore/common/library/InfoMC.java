/*******************************************************************************
 * Copyright (c) 2014 Mrbrutal. All rights reserved.
 * Do not modify or redistribute without written permission.
 *
 * @author Mrbrutal
 ******************************************************************************/

package si.meansoft.meancore.common.library;

public class InfoMC {

    public static final String MOD = "MC";
    public static final String MODID = "MCore";
    public static final String MODNAME = "MeanCore";

    public static final String FINGERPRINT = "@FINGERPRINT@";
    public static final String VERSION = "@VERSION@";

    public static final String SERVER_PROXY = "si.meansoft.meancore.proxy.ServerProxy";
    public static final String CLIENT_PROXY = "si.meansoft.meancore.proxy.ClientProxy";
    public static final String GUI_FACTORY = "si.meansoft.meancore.client.core.GuiFactory";

    public static final String FML_REQ = "@FML@";
    public static final String FML_REQ_MAX = "@FML-MAX@";
    public static final String FORGE_REQ = "@FORGE@";
    public static final String FORGE_REQ_MAX = "@FORGE-MAX@";
    public static final String DEPENDENCIES = "required-after:FML@[" + FML_REQ + "," + FML_REQ_MAX + ");" + "required-after:Forge@[" + FORGE_REQ + "," + FORGE_REQ_MAX + ");";
}
