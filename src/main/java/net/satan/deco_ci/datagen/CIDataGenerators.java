package net.satan.deco_ci.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;


import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.satan.deco_ci.satans_deco_ci;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = satans_deco_ci.MODID, bus = EventBusSubscriber.Bus.MOD)
public class CIDataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new CIRecipeProvider(lookupProvider, packOutput));
        generator.addProvider(event.includeServer(), CILootTableProvider.create(packOutput, lookupProvider));

        generator.addProvider(event.includeClient(), new CIBlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new CIBlockModelProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new CIItemModelProvider(packOutput, existingFileHelper));
    }
}