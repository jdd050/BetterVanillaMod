package com.jdd050.bettervanillamod.datagen;

import com.jdd050.bettervanillamod.BetterVanillaMod;
import com.jdd050.bettervanillamod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    private static void makeHelmetRecipe(RecipeOutput pRecipeOutput, Item result, Item material, String unlockRequirement) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .pattern("XXX")
                .pattern("X X")
                .pattern("   ")
                .define('X', material)
                .unlockedBy(unlockRequirement, has(material)).save(pRecipeOutput);
    }

    private static void makeHelmetRecipe(RecipeOutput pRecipeOutput, Item result, TagKey<Item> material, String unlockRequirement) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .pattern("XXX")
                .pattern("X X")
                .pattern("   ")
                .define('X', material)
                .unlockedBy(unlockRequirement, has(material)).save(pRecipeOutput);
    }

    private static void makeChestplateRecipe(RecipeOutput pRecipeOutput, Item result, Item material, String unlockRequirement) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', material)
                .unlockedBy(unlockRequirement, has(material)).save(pRecipeOutput);
    }

    private static void makeChestplateRecipe(RecipeOutput pRecipeOutput, Item result, TagKey<Item> material, String unlockRequirement) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .define('X', material)
                .unlockedBy(unlockRequirement, has(material)).save(pRecipeOutput);
    }

    private static void makeLeggingRecipe(RecipeOutput pRecipeOutput, Item result, Item material, String unlockRequirement) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .define('X', material)
                .unlockedBy(unlockRequirement, has(material)).save(pRecipeOutput);
    }

    private static void makeLeggingRecipe(RecipeOutput pRecipeOutput, Item result, TagKey<Item> material, String unlockRequirement) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .define('X', material)
                .unlockedBy(unlockRequirement, has(material)).save(pRecipeOutput);
    }

    private static void makeBootsRecipe(RecipeOutput pRecipeOutput, Item result, Item material, String unlockRequirement) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .pattern("   ")
                .pattern("X X")
                .pattern("X X")
                .define('X', material)
                .unlockedBy(unlockRequirement, has(material)).save(pRecipeOutput);
    }

    private static void makeBootsRecipe(RecipeOutput pRecipeOutput, Item result, TagKey<Item> material, String unlockRequirement) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .pattern("   ")
                .pattern("X X")
                .pattern("X X")
                .define('X', material)
                .unlockedBy(unlockRequirement, has(material)).save(pRecipeOutput);
    }

    private static void makeSwordRecipe(RecipeOutput pRecipeOutput, Item result, Item material, String unlockRequirement) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .pattern(" X ")
                .pattern(" X ")
                .pattern(" Y ")
                .define('X', material)
                .define('Y', Items.STICK)
                .unlockedBy(unlockRequirement, has(material)).save(pRecipeOutput);
    }

    private static void makeSwordRecipe(RecipeOutput pRecipeOutput, Item result, TagKey<Item> material, String unlockRequirement) {
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, result)
                .pattern(" X ")
                .pattern(" X ")
                .pattern(" Y ")
                .define('X', material)
                .define('Y', Items.STICK)
                .unlockedBy(unlockRequirement, has(material)).save(pRecipeOutput);
    }

    private static void makePickaxeRecipe(RecipeOutput pRecipeOutput, Item result, Item material, String unlockRequirement) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, result)
                .pattern("XXX")
                .pattern(" Y ")
                .pattern(" Y ")
                .define('X', material)
                .define('Y', Items.STICK)
                .unlockedBy(unlockRequirement, has(material)).save(pRecipeOutput);
    }

    private static void makePickaxeRecipe(RecipeOutput pRecipeOutput, Item result, TagKey<Item> material, String unlockRequirement) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, result)
                .pattern("XXX")
                .pattern(" Y ")
                .pattern(" Y ")
                .define('X', material)
                .define('Y', Items.STICK)
                .unlockedBy(unlockRequirement, has(material)).save(pRecipeOutput);
    }

    private static void makeShovelRecipe(RecipeOutput pRecipeOutput, Item result, Item material, String unlockRequirement) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, result)
                .pattern(" X ")
                .pattern(" Y ")
                .pattern(" Y ")
                .define('X', material)
                .define('Y', Items.STICK)
                .unlockedBy(unlockRequirement, has(material)).save(pRecipeOutput);
    }

    private static void makeShovelRecipe(RecipeOutput pRecipeOutput, Item result, TagKey<Item> material, String unlockRequirement) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, result)
                .pattern(" X ")
                .pattern(" Y ")
                .pattern(" Y ")
                .define('X', material)
                .define('Y', Items.STICK)
                .unlockedBy(unlockRequirement, has(material)).save(pRecipeOutput);
    }

    private static void makeAxeRecipe(RecipeOutput pRecipeOutput, Item result, Item material, String unlockRequirement) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, result)
                .pattern("XX ")
                .pattern("XY ")
                .pattern(" Y ")
                .define('X', material)
                .define('Y', Items.STICK)
                .unlockedBy(unlockRequirement, has(material)).save(pRecipeOutput);
    }

    private static void makeAxeRecipe(RecipeOutput pRecipeOutput, Item result, TagKey<Item> material, String unlockRequirement) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, result)
                .pattern("XX ")
                .pattern("XY ")
                .pattern(" Y ")
                .define('X', material)
                .define('Y', Items.STICK)
                .unlockedBy(unlockRequirement, has(material)).save(pRecipeOutput);
    }

    private static void makeHoeRecipe(RecipeOutput pRecipeOutput, Item result, Item material, String unlockRequirement) {
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, result)
                .pattern("XX ")
                .pattern(" Y ")
                .pattern(" Y ")
                .define('X', material)
                .define('Y', Items.STICK)
                .unlockedBy(unlockRequirement, has(material)).save(pRecipeOutput);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        // smelting list
        List<ItemLike> SMELTABLES = List.of();

        /* MATERIAL RECIPES */
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.AMETHYST_GEM.get())
                .requires(Items.AMETHYST_SHARD, 2)
                .unlockedBy("has_amethyst_shard", has(Items.AMETHYST_SHARD)).save(pRecipeOutput);

        /* WOOD TIER RECIPES */
        makeHelmetRecipe(pRecipeOutput, ModItems.WOOD_HELMET.get(), ItemTags.PLANKS, "has_planks");
        makeChestplateRecipe(pRecipeOutput, ModItems.WOOD_CHESTPLATE.get(), ItemTags.PLANKS, "has_planks");
        makeLeggingRecipe(pRecipeOutput, ModItems.WOOD_LEGGINGS.get(), ItemTags.PLANKS, "has_planks");
        makeBootsRecipe(pRecipeOutput, ModItems.WOOD_BOOTS.get(), ItemTags.PLANKS, "has_planks");

        /* STONE TIER RECIPES */
        makeHelmetRecipe(pRecipeOutput, ModItems.STONE_HELMET.get(), Items.STONE, "has_stone");
        makeChestplateRecipe(pRecipeOutput, ModItems.STONE_CHESTPLATE.get(), Items.STONE, "has_stone");
        makeLeggingRecipe(pRecipeOutput, ModItems.STONE_LEGGINGS.get(), Items.STONE, "has_stone");
        makeBootsRecipe(pRecipeOutput, ModItems.STONE_BOOTS.get(), Items.STONE, "has_stone");


        /* NETHERRACK TIER RECIPES */
        // armor
        makeHelmetRecipe(pRecipeOutput, ModItems.NETHERRACK_HELMET.get(), Items.NETHERRACK, "has_netherrack");
        makeChestplateRecipe(pRecipeOutput, ModItems.NETHERRACK_CHESTPLATE.get(), Items.NETHERRACK, "has_netherrack");
        makeLeggingRecipe(pRecipeOutput, ModItems.NETHERRACK_LEGGINGS.get(), Items.NETHERRACK, "has_netherrack");
        makeBootsRecipe(pRecipeOutput, ModItems.NETHERRACK_BOOTS.get(), Items.NETHERRACK, "has_netherrack");

        // tools
        makeSwordRecipe(pRecipeOutput, ModItems.NETHERRACK_SWORD.get(), Items.NETHERRACK, "has_netherrack");
        makePickaxeRecipe(pRecipeOutput, ModItems.NETHERRACK_PICKAXE.get(), Items.NETHERRACK, "has_netherrack");
        makeShovelRecipe(pRecipeOutput, ModItems.NETHERRACK_SHOVEL.get(), Items.NETHERRACK, "has_netherrack");
        makeAxeRecipe(pRecipeOutput, ModItems.NETHERRACK_AXE.get(), Items.NETHERRACK, "has_netherrack");
        makeHoeRecipe(pRecipeOutput, ModItems.NETHERRACK_HOE.get(), Items.NETHERRACK, "has_netherrack");

        /* COPPER TIER RECIPES */
        // armor
        makeHelmetRecipe(pRecipeOutput, ModItems.COPPER_HELMET.get(), Items.COPPER_INGOT, "has_copper_ingot");
        makeChestplateRecipe(pRecipeOutput, ModItems.COPPER_CHESTPLATE.get(), Items.COPPER_INGOT, "has_copper_ingot");
        makeLeggingRecipe(pRecipeOutput, ModItems.COPPER_LEGGINGS.get(), Items.COPPER_INGOT, "has_copper_ingot");
        makeBootsRecipe(pRecipeOutput, ModItems.COPPER_BOOTS.get(), Items.COPPER_INGOT, "has_copper_ingot");

        // tools
        makeSwordRecipe(pRecipeOutput, ModItems.COPPER_SWORD.get(), Items.COPPER_INGOT, "has_copper_ingot");
        makePickaxeRecipe(pRecipeOutput, ModItems.COPPER_PICKAXE.get(), Items.COPPER_INGOT, "has_copper_ingot");
        makeShovelRecipe(pRecipeOutput, ModItems.COPPER_SHOVEL.get(), Items.COPPER_INGOT, "has_copper_ingot");
        makeAxeRecipe(pRecipeOutput, ModItems.COPPER_AXE.get(), Items.COPPER_INGOT, "has_copper_ingot");
        makeHoeRecipe(pRecipeOutput, ModItems.COPPER_HOE.get(), Items.COPPER_INGOT, "has_copper_ingot");

        /* AMETHYST TIER RECIPES */
        // armor
        makeHelmetRecipe(pRecipeOutput, ModItems.AMETHYST_HELMET.get(), ModItems.AMETHYST_GEM.get(), "has_amethyst_gem");
        makeChestplateRecipe(pRecipeOutput, ModItems.AMETHYST_CHESTPLATE.get(), ModItems.AMETHYST_GEM.get(), "has_amethyst_gem");
        makeLeggingRecipe(pRecipeOutput, ModItems.AMETHYST_LEGGINGS.get(), ModItems.AMETHYST_GEM.get(), "has_amethyst_gem");
        makeBootsRecipe(pRecipeOutput, ModItems.AMETHYST_BOOTS.get(), ModItems.AMETHYST_GEM.get(), "has_amethyst_gem");

        // tools
        makeSwordRecipe(pRecipeOutput, ModItems.AMETHYST_SWORD.get(), ModItems.AMETHYST_GEM.get(), "has_amethyst_gem");
        makePickaxeRecipe(pRecipeOutput, ModItems.AMETHYST_PICKAXE.get(), ModItems.AMETHYST_GEM.get(), "has_amethyst_gem");
        makeShovelRecipe(pRecipeOutput, ModItems.AMETHYST_SHOVEL.get(), ModItems.AMETHYST_GEM.get(), "has_amethyst_gem");
        makeAxeRecipe(pRecipeOutput, ModItems.AMETHYST_AXE.get(), ModItems.AMETHYST_GEM.get(), "has_amethyst_gem");
        makeHoeRecipe(pRecipeOutput, ModItems.AMETHYST_HOE.get(), ModItems.AMETHYST_GEM.get(), "has_amethyst_gem");

        /* QUARTZ TIER RECIPES */
        // armor
        makeHelmetRecipe(pRecipeOutput, ModItems.QUARTZ_HELMET.get(), Items.QUARTZ, "has_quartz");
        makeChestplateRecipe(pRecipeOutput, ModItems.QUARTZ_CHESTPLATE.get(), Items.QUARTZ, "has_quartz");
        makeLeggingRecipe(pRecipeOutput, ModItems.QUARTZ_LEGGINGS.get(), Items.QUARTZ, "has_quartz");
        makeBootsRecipe(pRecipeOutput, ModItems.QUARTZ_BOOTS.get(), Items.QUARTZ, "has_quartz");

        // tools
        makeSwordRecipe(pRecipeOutput, ModItems.QUARTZ_SWORD.get(), Items.QUARTZ, "has_quartz");
        makePickaxeRecipe(pRecipeOutput, ModItems.QUARTZ_PICKAXE.get(), Items.QUARTZ, "has_quartz");
        makeShovelRecipe(pRecipeOutput, ModItems.QUARTZ_SHOVEL.get(), Items.QUARTZ, "has_quartz");
        makeAxeRecipe(pRecipeOutput, ModItems.QUARTZ_AXE.get(), Items.QUARTZ, "has_quartz");
        makeHoeRecipe(pRecipeOutput, ModItems.QUARTZ_HOE.get(), Items.QUARTZ, "has_quartz");

        /* EMERALD TIER RECIPES */
        // armor
        makeHelmetRecipe(pRecipeOutput, ModItems.EMERALD_HELMET.get(), Items.EMERALD, "has_emerald");
        makeChestplateRecipe(pRecipeOutput, ModItems.EMERALD_CHESTPLATE.get(), Items.EMERALD, "has_emerald");
        makeLeggingRecipe(pRecipeOutput, ModItems.EMERALD_LEGGINGS.get(), Items.EMERALD, "has_emerald");
        makeBootsRecipe(pRecipeOutput, ModItems.EMERALD_BOOTS.get(), Items.EMERALD, "has_emerald");

        // tools
        makeSwordRecipe(pRecipeOutput, ModItems.EMERALD_SWORD.get(), Items.EMERALD, "has_emerald");
        makePickaxeRecipe(pRecipeOutput, ModItems.EMERALD_PICKAXE.get(), Items.EMERALD, "has_emerald");
        makeShovelRecipe(pRecipeOutput, ModItems.EMERALD_SHOVEL.get(), Items.EMERALD, "has_emerald");
        makeAxeRecipe(pRecipeOutput, ModItems.EMERALD_AXE.get(), Items.EMERALD, "has_emerald");
        makeHoeRecipe(pRecipeOutput, ModItems.EMERALD_HOE.get(), Items.EMERALD, "has_emerald");
    }

    /*
     * OVERRIDDEN METHODS FOR GENERATING JSON FILES IN CORRECT LOCATION
     * CREDIT: Kaupenjoe (https://github.com/Tutorials-By-Kaupenjoe/Forge-Tutorial-1.21.X)
     */
    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, BetterVanillaMod.MODID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
