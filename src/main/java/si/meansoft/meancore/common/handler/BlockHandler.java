/*******************************************************************************
 * Copyright (c) 2014 Mrbrutal. All rights reserved.
 * Do not modify or redistribute without written permission.
 *
 * @author Mrbrutal
 ******************************************************************************/

package si.meansoft.meancore.common.handler;

import net.minecraft.block.Block;
import net.minecraft.block.Block.SoundType;
import net.minecraft.item.ItemBlock;

public class BlockHandler {

    private float hardness = 1.5f;
    private float resistance = 10.0f;
    private float lightLevel = 0.0f;
    private SoundType stepSound = Block.soundTypeStone;
    private Class itemBlock = null;

    public float getResistance() {
        return resistance;
    }

    public BlockHandler setResistance(float resistance) {
        this.resistance = resistance;
        return this;
    }

    public float getLightLevel() {
        return lightLevel;
    }

    public BlockHandler setLightLevel(float lightLevel) {
        this.lightLevel = lightLevel;
        return this;
    }

    public float getHardness() {
        return hardness;
    }

    public BlockHandler setHardness(float hardness) {
        this.hardness = hardness;
        return this;
    }

    public SoundType getStepSound() {
        return stepSound;
    }

    public BlockHandler setStepSound(SoundType stepSound) {
        this.stepSound = stepSound;
        return this;
    }

    public Class<? extends ItemBlock> getItemBlock() {
        return itemBlock;
    }

    public BlockHandler setItemBlock(Class<? extends ItemBlock> itemBlock) {
        this.itemBlock = itemBlock;
        return this;
    }
}
