package com.jdd050.bettervanillamod.item;

import com.jdd050.bettervanillamod.BetterVanillaMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    // Deferred register (list) of all custom items
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BetterVanillaMod.MODID);

    /* Custom items - Materials */
    public static final RegistryObject<Item> LAPIS_INGOT = ITEMS.register("lapis_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> REDSTONE_INGOT = ITEMS.register("redstone_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_GEM = ITEMS.register("amethyst_gem", () -> new Item(new Item.Properties()));

    /* Custom Equipment - Wood Tier */
    public static final RegistryObject<Item> WOOD_HELMET;
    public static final RegistryObject<Item> WOOD_CHESTPLATE;
    public static final RegistryObject<Item> WOOD_LEGGINGS;
    public static final RegistryObject<Item> WOOD_BOOTS;
}
