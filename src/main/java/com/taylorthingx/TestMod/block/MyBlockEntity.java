package com.taylorthingx.TestMod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class MyBlockEntity extends BlockEntity {
    public MyBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.TEST_BLOCK_ENTITY.get(), pos, state);
    }
}