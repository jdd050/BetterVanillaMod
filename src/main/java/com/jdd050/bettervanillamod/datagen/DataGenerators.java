package com.jdd050.bettervanillamod.datagen;

import com.jdd050.bettervanillamod.BetterVanillaMod;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = BetterVanillaMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        // Mod block loot table provider
        generator.addProvider(event.includeServer(), new LootTableProvider(packOutput, Collections.emptySet(),
                List.of(new LootTableProvider.SubProviderEntry(ModBlockLootTableProvider::new, LootContextParamSets.BLOCK)), lookupProvider));
        // Mod item model provider
        generator.addProvider(event.includeClient(), new ModItemModelProvider(packOutput, existingFileHelper));
        // Mod block state provider
        generator.addProvider(event.includeClient(), new ModBlockStateProvider(packOutput, existingFileHelper));
        // Block tags provider
        BlockTagsProvider blockTagsProvider = new ModBlockTagProvider(packOutput, lookupProvider, existingFileHelper);
        generator.addProvider(event.includeServer(), blockTagsProvider);
        // Item tags provider
        generator.addProvider(event.includeServer(), new ModItemTagProvider(packOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));
        // Mod recipe provider
        generator.addProvider(event.includeServer(), new ModRecipeProvider(packOutput, lookupProvider));
    }
}