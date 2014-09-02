/*
 * Copyright (c) 2014 Mrbrutal. All rights reserved.
 * Do not modify or redistribute without written permission.
 *
 * @author Mrbrutal
 */

package si.meansoft.meancore.common.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import si.meansoft.meancore.common.library.InfoMC;
import si.meansoft.meancore.common.library.MCBlocks;
import si.meansoft.meancore.common.library.MCItems;

public class TabsMC {

    public static CreativeTabs BLOCK = new CreativeTabs(InfoMC.MODID.toLowerCase() + ".block") {
        @Override
        public Item getTabIconItem() {
            return Item.getItemFromBlock(MCBlocks.exampleBlock.block);
        }
    };

    public static CreativeTabs ITEM = new CreativeTabs(InfoMC.MODID.toLowerCase() + ".item") {
        @Override
        public Item getTabIconItem() {
            return MCItems.exampleItem.item;
        }
    };
}
