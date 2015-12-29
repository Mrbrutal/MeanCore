/*
 * Copyright (c) 2014 Mrbrutal. All rights reserved.
 * Do not modify or redistribute without written permission.
 *
 * @author Mrbrutal
 */

package si.meansoft.meancore.common.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import si.meansoft.meancore.common.library.InfoMC;
import si.meansoft.meancore.common.library.MCBlocks;
import si.meansoft.meancore.common.library.MCItems;
import sun.org.mozilla.javascript.internal.ast.Block;

public class TabsMC {

    public static CreativeTabs BLOCK = new CreativeTabs(InfoMC.MODID.toLowerCase() + ".block") {
        @Override
        public Item getTabIconItem() {
            if(MCBlocks.values() != null && MCBlocks.values().length != 0) {
                return Item.getItemFromBlock(MCBlocks.values()[0].block);
            }
            else{
                return Item.getItemFromBlock(Blocks.diamond_block);
            }
        }
    };

    public static CreativeTabs ITEM = new CreativeTabs(InfoMC.MODID.toLowerCase() + ".item") {
        @Override
        public Item getTabIconItem() {
            if(MCItems.values() != null && MCItems.values().length != 0) {
                return MCItems.values()[0].item;
            }
            else {
                return Items.golden_apple;
            }
        }
    };
}
