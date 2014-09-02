/*******************************************************************************
 * Copyright (c) 2014 Mrbrutal. All rights reserved.
 * Do not modify or redistribute without written permission.
 *
 * @author Mrbrutal
 ******************************************************************************/

package si.meansoft.meancore.common.block;

import net.minecraft.block.material.Material;
import si.meansoft.meancore.common.creativetab.TabsMC;


public class BlockExample extends BlockExampleMod {

    public BlockExample() {
        super(Material.rock);
        setCreativeTab(TabsMC.BLOCK);
    }

}
