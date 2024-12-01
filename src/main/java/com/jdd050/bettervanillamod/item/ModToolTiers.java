package com.jdd050.bettervanillamod.item;

import com.jdd050.bettervanillamod.util.ModTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModToolTiers {
    public static final Tier NETHERRACK = new ForgeTier(150, 4.0f, 1.0f, 5,
            ModTags.Blocks.NEEDS_NETHERRACK_TOOL, () -> Ingredient.of(Items.NETHERRACK), ModTags.Blocks.INCORRECT_FOR_NETHERRACK_TOOL);
    public static final Tier COPPER = new ForgeTier(200, 5.5f, 1.5f, 18,
            ModTags.Blocks.NEEDS_COPPER_TOOL, () -> Ingredient.of(Items.COPPER_INGOT), ModTags.Blocks.INCORRECT_FOR_COPPER_TOOL);
    public static final Tier AMETHYST = new ForgeTier(656, 7.5f, 2.75f, 9,
            ModTags.Blocks.NEEDS_AMETHYST_TOOL, () -> Ingredient.of(ModItems.AMETHYST_GEM.get()), ModTags.Blocks.INCORRECT_FOR_AMETHYST_TOOL);
    public static final Tier QUARTZ = new ForgeTier(656, 7.5f, 2.75f, 9,
            ModTags.Blocks.NEEDS_QUARTZ_TOOL, () -> Ingredient.of(Items.QUARTZ), ModTags.Blocks.INCORRECT_FOR_QUARTZ_TOOL);
    public static final Tier EMERALD = new ForgeTier(1900, 7.8f, 3.25f, 10,
            ModTags.Blocks.NEEDS_EMERALD_TOOL, () -> Ingredient.of(Items.EMERALD), ModTags.Blocks.INCORRECT_FOR_EMERALD_TOOL);
}
