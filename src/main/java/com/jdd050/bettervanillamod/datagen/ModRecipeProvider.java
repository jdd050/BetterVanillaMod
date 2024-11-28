package com.jdd050.bettervanillamod.datagen;

import com.jdd050.bettervanillamod.BetterVanillaMod;
import com.jdd050.bettervanillamod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
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

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        // smelting list
        List<ItemLike> SMELTABLES = List.of();

        /* MATERIAL RECIPES */
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.AMETHYST_GEM.get())
                        .requires(Items.AMETHYST_SHARD, 2)
                                .unlockedBy("has_amethyst_shard", has(Items.AMETHYST_SHARD)).save(pRecipeOutput);

        /* WOOD TIER RECIPES */
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.WOOD_HELMET.get())
                .pattern("PPP")
                .pattern("P P")
                .pattern("   ")
                .define('P', ItemTags.PLANKS)
                .unlockedBy("has_planks", has(ItemTags.PLANKS)).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.WOOD_CHESTPLATE.get())
                .pattern("P P")
                .pattern("PPP")
                .pattern("PPP")
                .define('P', ItemTags.PLANKS)
                .unlockedBy("has_planks", has(ItemTags.PLANKS)).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.WOOD_LEGGINGS.get())
                .pattern("PPP")
                .pattern("P P")
                .pattern("P P")
                .define('P', ItemTags.PLANKS)
                .unlockedBy("has_planks", has(ItemTags.PLANKS)).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.WOOD_BOOTS.get())
                .pattern("   ")
                .pattern("P P")
                .pattern("P P")
                .define('P', ItemTags.PLANKS)
                .unlockedBy("has_planks", has(ItemTags.PLANKS)).save(pRecipeOutput);

        /* STONE TIER RECIPES */
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.STONE_HELMET.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("   ")
                .define('S', Items.STONE)
                .unlockedBy("has_stone", has(Items.STONE)).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.STONE_CHESTPLATE.get())
                .pattern("S S")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', Items.STONE)
                .unlockedBy("has_stone", has(Items.STONE)).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.STONE_LEGGINGS.get())
                .pattern("SSS")
                .pattern("S S")
                .pattern("S S")
                .define('S', Items.STONE)
                .unlockedBy("has_stone", has(Items.STONE)).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.STONE_BOOTS.get())
                .pattern("   ")
                .pattern("S S")
                .pattern("S S")
                .define('S', Items.STONE)
                .unlockedBy("has_stone", has(Items.STONE)).save(pRecipeOutput);

        /* COPPER TIER RECIPES */
        // armor
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.COPPER_HELMET.get())
                .pattern("CCC")
                .pattern("C C")
                .pattern("   ")
                .define('C', Items.COPPER_INGOT)
                .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT)).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.COPPER_CHESTPLATE.get())
                .pattern("C C")
                .pattern("CCC")
                .pattern("CCC")
                .define('C', Items.COPPER_INGOT)
                .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT)).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.COPPER_LEGGINGS.get())
                .pattern("CCC")
                .pattern("C C")
                .pattern("C C")
                .define('C', Items.COPPER_INGOT)
                .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT)).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.COPPER_BOOTS.get())
                .pattern("   ")
                .pattern("C C")
                .pattern("C C")
                .define('C', Items.COPPER_INGOT)
                .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT)).save(pRecipeOutput);

        // tools
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.COPPER_SWORD.get())
                .pattern(" C ")
                .pattern(" C ")
                .pattern(" S ")
                .define('C', Items.COPPER_INGOT)
                .define('S', Items.STICK)
                .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT)).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.COPPER_PICKAXE.get())
                .pattern("CCC")
                .pattern(" S ")
                .pattern(" S ")
                .define('C', Items.COPPER_INGOT)
                .define('S', Items.STICK)
                .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT)).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.COPPER_SHOVEL.get())
                .pattern(" C ")
                .pattern(" S ")
                .pattern(" S ")
                .define('C', Items.COPPER_INGOT)
                .define('S', Items.STICK)
                .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT)).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.COPPER_AXE.get())
                .pattern("CC ")
                .pattern("CS ")
                .pattern(" S ")
                .define('C', Items.COPPER_INGOT)
                .define('S', Items.STICK)
                .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT)).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.COPPER_HOE.get())
                .pattern("CC ")
                .pattern(" S ")
                .pattern(" S ")
                .define('C', Items.COPPER_INGOT)
                .define('S', Items.STICK)
                .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT)).save(pRecipeOutput);


        /* AMETHYST TIER RECIPES */
        // Armor
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.AMETHYST_HELMET.get())
                .pattern("AAA")
                .pattern("A A")
                .pattern("   ")
                .define('A', ModItems.AMETHYST_GEM.get())
                .unlockedBy("has_amethyst_gem", has(ModItems.AMETHYST_GEM.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.AMETHYST_CHESTPLATE.get())
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.AMETHYST_GEM.get())
                .unlockedBy("has_amethyst_gem", has(ModItems.AMETHYST_GEM.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.AMETHYST_LEGGINGS.get())
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.AMETHYST_GEM.get())
                .unlockedBy("has_amethyst_gem", has(ModItems.AMETHYST_GEM.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.AMETHYST_BOOTS.get())
                .pattern("   ")
                .pattern("A A")
                .pattern("A A")
                .define('A', ModItems.AMETHYST_GEM.get())
                .unlockedBy("has_amethyst_gem", has(ModItems.AMETHYST_GEM.get())).save(pRecipeOutput);

        // tools
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.AMETHYST_SWORD.get())
                .pattern(" A ")
                .pattern(" A ")
                .pattern(" S ")
                .define('A', ModItems.AMETHYST_GEM.get())
                .define('S', Items.STICK)
                .unlockedBy("has_amethyst_gem", has(ModItems.AMETHYST_GEM.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.AMETHYST_PICKAXE.get())
                .pattern("AAA")
                .pattern(" S ")
                .pattern(" S ")
                .define('A', ModItems.AMETHYST_GEM.get())
                .define('S', Items.STICK)
                .unlockedBy("has_amethyst_gem", has(ModItems.AMETHYST_GEM.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.AMETHYST_SHOVEL.get())
                .pattern(" A ")
                .pattern(" S ")
                .pattern(" S ")
                .define('A', ModItems.AMETHYST_GEM.get())
                .define('S', Items.STICK)
                .unlockedBy("has_amethyst_gem", has(ModItems.AMETHYST_GEM.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.AMETHYST_AXE.get())
                .pattern("AA ")
                .pattern("AS ")
                .pattern(" S ")
                .define('A', ModItems.AMETHYST_GEM.get())
                .define('S', Items.STICK)
                .unlockedBy("has_amethyst_gem", has(ModItems.AMETHYST_GEM.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.AMETHYST_HOE.get())
                .pattern("AA ")
                .pattern(" S ")
                .pattern(" S ")
                .define('A', ModItems.AMETHYST_GEM.get())
                .define('S', Items.STICK)
                .unlockedBy("has_amethyst_gem", has(ModItems.AMETHYST_GEM.get())).save(pRecipeOutput);

        /* QUARTZ TIER RECIPES */
        // Armor
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.QUARTZ_HELMET.get())
                .pattern("QQQ")
                .pattern("Q Q")
                .pattern("   ")
                .define('Q', Items.QUARTZ)
                .unlockedBy("has_quartz", has(Items.QUARTZ)).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.QUARTZ_CHESTPLATE.get())
                .pattern("Q Q")
                .pattern("QQQ")
                .pattern("QQQ")
                .define('Q', Items.QUARTZ)
                .unlockedBy("has_quartz", has(Items.QUARTZ)).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.QUARTZ_LEGGINGS.get())
                .pattern("QQQ")
                .pattern("Q Q")
                .pattern("Q Q")
                .define('Q', Items.QUARTZ)
                .unlockedBy("has_quartz", has(Items.QUARTZ)).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.QUARTZ_BOOTS.get())
                .pattern("   ")
                .pattern("Q Q")
                .pattern("Q Q")
                .define('Q', Items.QUARTZ)
                .unlockedBy("has_quartz", has(Items.QUARTZ)).save(pRecipeOutput);

        // Tools
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.QUARTZ_SWORD.get())
                .pattern(" Q ")
                .pattern(" Q ")
                .pattern(" S ")
                .define('Q', Items.QUARTZ)
                .define('S', Items.STICK)
                .unlockedBy("has_quartz", has(Items.QUARTZ)).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.QUARTZ_PICKAXE.get())
                .pattern("QQQ")
                .pattern(" S ")
                .pattern(" S ")
                .define('Q', Items.QUARTZ)
                .define('S', Items.STICK)
                .unlockedBy("has_quartz", has(Items.QUARTZ)).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.QUARTZ_SHOVEL.get())
                .pattern(" Q ")
                .pattern(" S ")
                .pattern(" S ")
                .define('Q', Items.QUARTZ)
                .define('S', Items.STICK)
                .unlockedBy("has_quartz", has(Items.QUARTZ)).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.QUARTZ_AXE.get())
                .pattern("QQ ")
                .pattern("QS ")
                .pattern(" S ")
                .define('Q', Items.QUARTZ)
                .define('S', Items.STICK)
                .unlockedBy("has_quartz", has(Items.QUARTZ)).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.QUARTZ_HOE.get())
                .pattern("QQ ")
                .pattern(" S ")
                .pattern(" S ")
                .define('Q', Items.QUARTZ)
                .define('S', Items.STICK)
                .unlockedBy("has_quartz", has(Items.QUARTZ)).save(pRecipeOutput);

        /* EMERALD TIER RECIPES */
        // Armor
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.EMERALD_HELMET.get())
                .pattern("EEE")
                .pattern("E E")
                .pattern("   ")
                .define('E', Items.EMERALD)
                .unlockedBy("has_emerald", has(Items.EMERALD)).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.EMERALD_CHESTPLATE.get())
                .pattern("E E")
                .pattern("EEE")
                .pattern("EEE")
                .define('E', Items.EMERALD)
                .unlockedBy("has_emerald", has(Items.EMERALD)).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.EMERALD_LEGGINGS.get())
                .pattern("EEE")
                .pattern("E E")
                .pattern("E E")
                .define('E', Items.EMERALD)
                .unlockedBy("has_emerald", has(Items.EMERALD)).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.EMERALD_BOOTS.get())
                .pattern("   ")
                .pattern("E E")
                .pattern("E E")
                .define('E', Items.EMERALD)
                .unlockedBy("has_emerald", has(Items.EMERALD)).save(pRecipeOutput);

        // Tools
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.EMERALD_SWORD.get())
                .pattern(" E ")
                .pattern(" E ")
                .pattern(" S ")
                .define('E', Items.EMERALD)
                .define('S', Items.STICK)
                .unlockedBy("has_emerald", has(Items.EMERALD)).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.EMERALD_PICKAXE.get())
                .pattern("EEE")
                .pattern(" E ")
                .pattern(" S ")
                .define('E', Items.EMERALD)
                .define('S', Items.STICK)
                .unlockedBy("has_emerald", has(Items.EMERALD)).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.EMERALD_SHOVEL.get())
                .pattern(" E ")
                .pattern(" S ")
                .pattern(" S ")
                .define('E', Items.EMERALD)
                .define('S', Items.STICK)
                .unlockedBy("has_emerald", has(Items.EMERALD)).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.EMERALD_AXE.get())
                .pattern("EE ")
                .pattern("ES ")
                .pattern(" S ")
                .define('E', Items.EMERALD)
                .define('S', Items.STICK)
                .unlockedBy("has_emerald", has(Items.EMERALD)).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.EMERALD_HOE.get())
                .pattern("EE ")
                .pattern(" S ")
                .pattern(" S ")
                .define('E', Items.EMERALD)
                .define('S', Items.STICK)
                .unlockedBy("has_emerald", has(Items.EMERALD)).save(pRecipeOutput);
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
