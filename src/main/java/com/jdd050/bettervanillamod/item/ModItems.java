package com.jdd050.bettervanillamod.item;

import com.jdd050.bettervanillamod.BetterVanillaMod;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    // fields
    public static final int SWORD_ATK_DMG = 3;
    public static final float SWORD_ATK_SPD = -2.4f;
    public static final int PICKAXE_ATK_DMG = 1;
    public static final float PICKAXE_ATK_SPD = -2.8f;
    public static final int AXE_ATK_DMG = 6;
    public static final float AXE_ATK_SPD = -3.2f;
    public static final float SHOVEL_ATK_DMG = 1.5f;
    public static final float SHOVEL_ATK_SPD = -3.0f;
    public static final int HOE_ATK_DMG = 0;
    public static final float HOE_ATK_SPD = -3.0f;
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
    public static final RegistryObject<Item> WOOD_HELMET = ITEMS.register("wood_helmet",
            () -> new ArmorItem(ModArmorMaterials.WOOD_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Properties()
                            .durability(ArmorItem.Type.HELMET.getDurability(4))));
    public static final RegistryObject<Item> WOOD_CHESTPLATE = ITEMS.register("wood_chestplate",
            () -> new ArmorItem(ModArmorMaterials.WOOD_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties()
                            .durability(ArmorItem.Type.CHESTPLATE.getDurability(4))));
    public static final RegistryObject<Item> WOOD_LEGGINGS = ITEMS.register("wood_leggings",
            () -> new ArmorItem(ModArmorMaterials.WOOD_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Properties()
                            .durability(ArmorItem.Type.LEGGINGS.getDurability(4))));
    public static final RegistryObject<Item> WOOD_BOOTS = ITEMS.register("wood_boots",
            () -> new ArmorItem(ModArmorMaterials.WOOD_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Properties()
                            .durability((ArmorItem.Type.BOOTS.getDurability(4)))));

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
    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword",
            () -> new SwordItem(ModToolTiers.COPPER, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.COPPER, SWORD_ATK_DMG, SWORD_ATK_SPD)))
    );
    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
            () -> new PickaxeItem(ModToolTiers.COPPER, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.COPPER, PICKAXE_ATK_DMG, PICKAXE_ATK_SPD)))
    );
    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe",
            () -> new AxeItem(ModToolTiers.COPPER, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.COPPER, AXE_ATK_DMG, AXE_ATK_SPD)))
    );
    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel",
            () -> new ShovelItem(ModToolTiers.COPPER, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.COPPER, SHOVEL_ATK_DMG, SHOVEL_ATK_SPD)))
    );
    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe",
            () -> new HoeItem(ModToolTiers.COPPER, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.COPPER, HOE_ATK_DMG, HOE_ATK_SPD)))
    );

    /* Custom Equipment - Amethyst Tier */
    public static final RegistryObject<Item> AMETHYST_HELMET;
    public static final RegistryObject<Item> AMETHYST_CHESTPLATE;
    public static final RegistryObject<Item> AMETHYST_LEGGINGS;
    public static final RegistryObject<Item> AMETHYST_BOOTS;
    public static final RegistryObject<Item> AMETHYST_SWORD = ITEMS.register("amethyst_sword",
            () -> new SwordItem(ModToolTiers.AMETHYST, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.AMETHYST, SWORD_ATK_DMG, SWORD_ATK_SPD)))
    );
    public static final RegistryObject<Item> AMETHYST_PICKAXE = ITEMS.register("amethyst_pickaxe",
            () -> new PickaxeItem(ModToolTiers.AMETHYST, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.AMETHYST, PICKAXE_ATK_DMG, PICKAXE_ATK_SPD)))
    );
    public static final RegistryObject<Item> AMETHYST_AXE = ITEMS.register("amethyst_axe",
            () -> new AxeItem(ModToolTiers.AMETHYST, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.AMETHYST, SWORD_ATK_DMG, SWORD_ATK_SPD)))
    );
    public static final RegistryObject<Item> AMETHYST_SHOVEL = ITEMS.register("amethyst_shovel",
            () -> new ShovelItem(ModToolTiers.AMETHYST, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.AMETHYST, SHOVEL_ATK_DMG, SHOVEL_ATK_SPD)))
    );
    public static final RegistryObject<Item> AMETHYST_HOE = ITEMS.register("amethyst_hoe",
            () -> new HoeItem(ModToolTiers.AMETHYST, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.AMETHYST, HOE_ATK_DMG, HOE_ATK_SPD)))
    );

    /* Custom Equipment - Quartz Tier */
    public static final RegistryObject<Item> QUARTZ_HELMET;
    public static final RegistryObject<Item> QUARTZ_CHESTPLATE;
    public static final RegistryObject<Item> QUARTZ_LEGGINGS;
    public static final RegistryObject<Item> QUARTZ_BOOTS;
    public static final RegistryObject<Item> QUARTZ_SWORD = ITEMS.register("quartz_sword",
            () -> new SwordItem(ModToolTiers.QUARTZ, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.QUARTZ, SWORD_ATK_DMG, SWORD_ATK_SPD)))
    );
    public static final RegistryObject<Item> QUARTZ_PICKAXE = ITEMS.register("quartz_pickaxe",
            () -> new PickaxeItem(ModToolTiers.QUARTZ, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.QUARTZ, PICKAXE_ATK_DMG, PICKAXE_ATK_SPD)))
    );
    public static final RegistryObject<Item> QUARTZ_AXE = ITEMS.register("quartz_axe",
            () -> new AxeItem(ModToolTiers.QUARTZ, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.QUARTZ, AXE_ATK_DMG, AXE_ATK_SPD)))
    );
    public static final RegistryObject<Item> QUARTZ_SHOVEL = ITEMS.register("quartz_shovel",
            () -> new ShovelItem(ModToolTiers.QUARTZ, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.QUARTZ, SHOVEL_ATK_DMG, SHOVEL_ATK_SPD)))
        );
    public static final RegistryObject<Item> QUARTZ_HOE = ITEMS.register("quartz_hoe",
            () -> new HoeItem(ModToolTiers.QUARTZ, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.QUARTZ, HOE_ATK_DMG, HOE_ATK_SPD)))
    );

    /* Custom Equipment - Emerald */
    public static final RegistryObject<Item> EMERALD_HELMET;
    public static final RegistryObject<Item> EMERALD_CHESTPLATE;
    public static final RegistryObject<Item> EMERALD_LEGGINGS;
    public static final RegistryObject<Item> EMERALD_BOOTS;
    public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword",
            () -> new SwordItem(ModToolTiers.EMERALD, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.EMERALD, SWORD_ATK_DMG, SWORD_ATK_SPD)))
    );
    public static final RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe",
            () -> new PickaxeItem(ModToolTiers.EMERALD, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(ModToolTiers.EMERALD, PICKAXE_ATK_DMG, PICKAXE_ATK_SPD)))
    );
    public static final RegistryObject<Item> EMERALD_AXE = ITEMS.register("emerald_axe",
            () -> new AxeItem(ModToolTiers.EMERALD, new Item.Properties()
                    .attributes(AxeItem.createAttributes(ModToolTiers.EMERALD, AXE_ATK_DMG, AXE_ATK_SPD)))
    );
    public static final RegistryObject<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel",
            () -> new ShovelItem(ModToolTiers.EMERALD, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(ModToolTiers.EMERALD, SHOVEL_ATK_DMG, SHOVEL_ATK_SPD)))
    );
    public static final RegistryObject<Item> EMERALD_HOE = ITEMS.register("emerald_hoe",
            () -> new HoeItem(ModToolTiers.EMERALD, new Item.Properties()
                    .attributes(HoeItem.createAttributes(ModToolTiers.EMERALD, HOE_ATK_DMG, HOE_ATK_SPD)))
    );

}
