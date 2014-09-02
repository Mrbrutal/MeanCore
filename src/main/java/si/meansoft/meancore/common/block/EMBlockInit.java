/*******************************************************************************
 * Copyright (c) 2014 Mrbrutal. All rights reserved.
 * Do not modify or redistribute without written permission.
 *
 * @author Mrbrutal
 ******************************************************************************/

package si.meansoft.meancore.common.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import si.meansoft.meancore.common.handler.BlockHandler;
import si.meansoft.meancore.common.library.MCBlocks;
import si.meansoft.meancore.common.library.InfoMC;
import si.meansoft.meancore.event.Localize;

public class EMBlockInit {

    public static void init() {
        loadBlocks();
        registerBlocks();
        nameBlocks();
        setHarvestLevels();
    }

    public static void loadBlocks() {
        for(MCBlocks blocks : MCBlocks.values()) {
            try {
                BlockHandler b = blocks.get();
                blocks.block = (Block) blocks.clazz.newInstance();
                if(blocks.get() != null) {
                    blocks.block.setHardness(b.getHardness()).setStepSound(b.getStepSound()).setResistance(b.getResistance()).setLightLevel(b.getLightLevel());
                }
            }catch(Exception e) {
                //Not found?
            }
        }
    }

    public static void registerBlocks() {
        for(MCBlocks blocks : MCBlocks.values()) {
            BlockHandler b = blocks.get();
            if(blocks.block != null) {
                GameRegistry.registerBlock(blocks.block, blocks.name());
            }
            if(blocks.block != null && b != null && b.getItemBlock() != null) {
                GameRegistry.registerBlock(blocks.block, b.getItemBlock(), blocks.name());
            }
        }
    }

    public static void nameBlocks() {
        for(MCBlocks blocks : MCBlocks.values()) {
            if(blocks.block != null) {
                blocks.block.setBlockName(InfoMC.MODID.toLowerCase() + ":" + blocks.name());
                Localize.addLocEntry(blocks.block.getUnlocalizedName(), Localize.BLOCK);
            }
        }
    }

    public static void setHarvestLevels() {

    }
}
