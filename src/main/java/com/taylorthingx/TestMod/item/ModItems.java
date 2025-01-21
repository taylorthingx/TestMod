package com.taylorthingx.TestMod.item;

import com.taylorthingx.TestMod.TestMod;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    // Create a Deferred Register to hold Items which will all be registered under the "testmod" namespace
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TestMod.MODID);

    // Creates a new food item with the id "testmod:example_id", nutrition 1 and saturation 2
    public static final DeferredItem<Item> TEST_ITEM = ITEMS.registerSimpleItem("test_item", new Item.Properties().food(new FoodProperties.Builder()
            .alwaysEdible().nutrition(1).saturationModifier(2f).build()));
}
