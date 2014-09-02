/*******************************************************************************
 * Copyright (c) 2014 Mrbrutal. All rights reserved.
 * Do not modify or redistribute without written permission.
 *
 * @author Mrbrutal
 ******************************************************************************/

package si.meansoft.meancore.common.library;

import net.minecraft.block.Block;
import si.meansoft.meancore.common.block.BlockExample;
import si.meansoft.meancore.common.block.BlockExampleMod;
import si.meansoft.meancore.common.handler.BlockHandler;

public enum MCBlocks {

    exampleBlock(BlockExample.class);

    public Block block = null;
    private BlockHandler handler = null;
    public Class clazz = null;

    MCBlocks() {
        this.clazz = BlockExampleMod.class;
    }

    MCBlocks(BlockHandler handler) {
        this.clazz = BlockExampleMod.class;
        this.handler = handler;
    }

    MCBlocks(Class<? extends BlockExampleMod> clazz) {
        this.clazz = clazz;
    }

    MCBlocks(Class<? extends BlockExampleMod> clazz, BlockHandler handler) {
        this.clazz = clazz;
        this.handler = handler;
    }

    public BlockHandler get(){
        return handler;
    }
}
