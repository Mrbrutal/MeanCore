/*
 * Copyright (c) 2015 Mrbrutal. All rights reserved.
 * Do not modify or redistribute without written permission.
 *
 * @author Mrbrutal
 */

package si.meansoft.meancore.update;

import org.apache.logging.log4j.Logger;

public interface IUpdate {

    public String getModId();

    public String getModName();

    public String getModVersion();

    public Logger getLogger();

}
