package com.taylorthingx.TestMod.block;

import com.mojang.serialization.MapCodec;
import com.taylorthingx.TestMod.TestMod;
import com.taylorthingx.TestMod.item.ModItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {

    // Create a Deferred Register to hold Blocks which will all be registered under the "testmod" namespace
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(TestMod.MODID);

    // Creates a new Block with the id "testmod:example_block", combining the namespace and path
    public static final DeferredBlock<Block> TEST_BLOCK = BLOCKS.registerSimpleBlock("test_block", BlockBehaviour.Properties.of().mapColor(MapColor.STONE));
    // Creates a new BlockItem with the id "testmod:example_block", combining the namespace and path
    public static final DeferredItem<BlockItem> TEST_BLOCK_ITEM = ModItems.ITEMS.registerSimpleBlockItem("test_block", TEST_BLOCK);

    public static final DeferredRegister<MapCodec<? extends Block>> REGISTRAR = DeferredRegister.create(BuiltInRegistries.BLOCK_TYPE, "testmod");

    public static final Supplier<MapCodec<TestBlock>> SIMPLE_CODEC = REGISTRAR.register(
            "simple",
            () -> BlockBehaviour.simpleCodec(TestBlock::new)
    );
}
