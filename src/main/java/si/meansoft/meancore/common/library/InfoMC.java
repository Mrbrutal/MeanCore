/*******************************************************************************
 * Copyright (c) 2014 Mrbrutal. All rights reserved.
 * Do not modify or redistribute without written permission.
 *
 * @author Mrbrutal
 ******************************************************************************/

package si.meansoft.meancore.common.library;

public class InfoMC {

    public static final String MOD = "MC";
    public static final String MODID = "meancore";
    public static final String MODNAME = "MeanCore";

    public static final String FINGERPRINT = "@FINGERPRINT@";
    public static final String VERSION = "@VERSION@";

    public static final String SERVER_PROXY = "si.meansoft.meancore.proxy.ServerProxy";
    public static final String CLIENT_PROXY = "si.meansoft.meancore.proxy.ClientProxy";
    public static final String GUI_FACTORY = "si.meansoft.meancore.client.core.GuiFactory";

    //TODO check and update version numbers for forge and FML
    public static final String FML_REQ = "10.12.2.1147";
    public static final String FML_REQ_MAX = "10.12.2.1147";
    public static final String FORGE_REQ = "";
    public static final String FORGE_REQ_MAX = "";
    public static final String DEPENDENCIES = "required-after:FML@[" + FML_REQ + "," + FML_REQ_MAX + ");" + "required-after:Forge@[" + FORGE_REQ + "," + FORGE_REQ_MAX + ");";
}
