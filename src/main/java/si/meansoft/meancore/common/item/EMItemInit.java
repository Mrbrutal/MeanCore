/*******************************************************************************
 * Copyright (c) 2014 Mrbrutal. All rights reserved.
 * Do not modify or redistribute without written permission.
 *
 * @author Mrbrutal
 ******************************************************************************/

package si.meansoft.meancore.common.item;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import si.meansoft.meancore.common.library.MCItems;
import si.meansoft.meancore.common.library.InfoMC;
import si.meansoft.meancore.event.Localize;

public class EMItemInit {

    public static void init() {
        loadItems();
        nameItems();
    }

    public static void loadItems() {
        for(MCItems items : MCItems.values()) {
            try {
                items.item = (Item) items.clazz.newInstance();
            }catch(Exception e) {
                //Not found?
            }
        }
    }

    public static void nameItems() {
        for(MCItems items : MCItems.values()) {
            if(items != null) {
                items.item.setUnlocalizedName(InfoMC.MODID.toLowerCase() + ":" + items.name());
                GameRegistry.registerItem(items.item, items.name());
                Localize.addLocEntry(items.item.getUnlocalizedName(), Localize.ITEM);
            }
        }
    }
}
