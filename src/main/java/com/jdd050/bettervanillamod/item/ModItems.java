package com.jdd050.bettervanillamod.item;

import com.jdd050.bettervanillamod.BetterVanillaMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
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

    // Item registration method
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    /* Custom Equipment - Wood Tier */
    public static final RegistryObject<Item> WOOD_HELMET;
    public static final RegistryObject<Item> WOOD_CHESTPLATE;
    public static final RegistryObject<Item> WOOD_LEGGINGS;
    public static final RegistryObject<Item> WOOD_BOOTS;

    /* Custom Equipment - Stone Tier */
    public static final RegistryObject<Item> STONE_HELMET;
    public static final RegistryObject<Item> STONE_CHESTPLATE;
    public static final RegistryObject<Item> STONE_LEGGINGS;
    public static final RegistryObject<Item> STONE_BOOTS;

    /* Custom Equipment - Copper Tier */
    public static final RegistryObject<Item> COPPER_HELMET;
    public static final RegistryObject<Item> COPPER_CHESTPLATE;
    public static final RegistryObject<Item> COPPER_LEGGINGS;
    public static final RegistryObject<Item> COPPER_BOOTS;
    public static final RegistryObject<Item> COPPER_SWORD;
    public static final RegistryObject<Item> COPPER_PICKAXE;
    public static final RegistryObject<Item> COPPER_AXE;
    public static final RegistryObject<Item> COPPER_SHOVEL;
    public static final RegistryObject<Item> COPPER_HOE;

    /* Custom Equipment - Amethyst Tier */
    public static final RegistryObject<Item> AMETHYST_HELMET;
    public static final RegistryObject<Item> AMETHYST_CHESTPLATE;
    public static final RegistryObject<Item> AMETHYST_LEGGINGS;
    public static final RegistryObject<Item> AMETHYST_BOOTS;
    public static final RegistryObject<Item> AMETHYST_SWORD;
    public static final RegistryObject<Item> AMETHYST_PICKAXE;
    public static final RegistryObject<Item> AMETHYST_AXE;
    public static final RegistryObject<Item> AMETHYST_SHOVEL;
    public static final RegistryObject<Item> AMETHYST_HOE;

    /* Custom Equipment - Quartz Tier */
    public static final RegistryObject<Item> QUARTZ_HELMET;
    public static final RegistryObject<Item> QUARTZ_CHESTPLATE;
    public static final RegistryObject<Item> QUARTZ_LEGGINGS;
    public static final RegistryObject<Item> QUARTZ_BOOTS;
    public static final RegistryObject<Item> QUARTZ_SWORD;
    public static final RegistryObject<Item> QUARTZ_PICKAXE;
    public static final RegistryObject<Item> QUARTZ_AXE;
    public static final RegistryObject<Item> QUARTZ_SHOVEL;
    public static final RegistryObject<Item> QUARTZ_HOE;

    /* Custom Equipment - Emerald */
    public static final RegistryObject<Item> EMERALD_HELMET;
    public static final RegistryObject<Item> EMERALD_CHESTPLATE;
    public static final RegistryObject<Item> EMERALD_LEGGINGS;
    public static final RegistryObject<Item> EMERALD_BOOTS;
    public static final RegistryObject<Item> EMERALD_SWORD;
    public static final RegistryObject<Item> EMERALD_PICKAXE;
    public static final RegistryObject<Item> EMERALD_AXE;
    public static final RegistryObject<Item> EMERALD_SHOVEL;
    public static final RegistryObject<Item> EMERALD_HOE;

}
