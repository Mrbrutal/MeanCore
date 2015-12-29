/*
 * Copyright (c) 2015 Mrbrutal. All rights reserved.
 * Do not modify or redistribute without written permission.
 *
 * @author Mrbrutal
 */

package si.meansoft.meancore.update;

public class UpdateThread extends Thread {

    private final String URL;
    private final IUpdate MOD;

    private boolean isComplete = false;
    private boolean newVerAvailable = false;
    private boolean criticalUpdate = false;
    private UpdateVersion newVer;

    public UpdateThread(IUpdate mod) {
        this(mod, null);
    }

    public UpdateThread(IUpdate mod, String url) {
        super("MCore Upater: " + mod.getModId());
        MOD = mod;
        if (url == null) {
            url = "http://meansoft.si/traincraft/versions/VERSION.dat";    //TODO find the right location to store version file
        }
        URL = url;
    }

    @Override
    public void run() {
        super.run();
        isComplete = true;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public boolean isCriticalUpdate() {
        return criticalUpdate;
    }

    public boolean newVersionAvailable() {
        return newVerAvailable;
    }

    public UpdateVersion newVersion() {
        return newVer;
    }
}
