package com.taylorthingx.TestMod.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class TestBlock extends Block {

    public TestBlock(Properties properties) {
        super(properties);
    }

    @Override
    public MapCodec<TestBlock> codec() {
        return ModBlocks.SIMPLE_CODEC.get();
    }
}
