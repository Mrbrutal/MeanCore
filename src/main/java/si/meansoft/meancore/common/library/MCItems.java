/*******************************************************************************
 * Copyright (c) 2014 Mrbrutal. All rights reserved.
 * Do not modify or redistribute without written permission.
 *
 * @author Mrbrutal
 ******************************************************************************/

package si.meansoft.meancore.common.library;

import net.minecraft.item.Item;
import si.meansoft.meancore.common.item.ItemExample;
import si.meansoft.meancore.common.item.ItemExampleMod;

public enum MCItems {

    exampleItem(ItemExample.class);

    public Item item;
    public Class<?> clazz;

    MCItems() {
        this.clazz = ItemExampleMod.class;
    }

    MCItems(Class clazz) {
        this.clazz = clazz;
    }
}
