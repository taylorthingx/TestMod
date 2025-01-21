package com.taylorthingx.TestMod.block;

import com.taylorthingx.TestMod.TestMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlockEntities {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES =
            DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, TestMod.MODID);

    public static final Supplier<BlockEntityType<MyBlockEntity>> TEST_BLOCK_ENTITY = BLOCK_ENTITY_TYPES.register(
            "my_block_entity",
            // The block entity type, created using a builder.
            () -> BlockEntityType.Builder.of(
                            // The supplier to use for constructing the block entity instances.
                            MyBlockEntity::new,
                            // A vararg of blocks that can have this block entity.
                            // This assumes the existence of the referenced blocks as DeferredBlock<Block>s.
                            ModBlocks.TEST_BLOCK.get()
                    )
                    // Build using null; vanilla does some datafixer shenanigans with the parameter that we don't need.
                    .build(null)
    );
}
