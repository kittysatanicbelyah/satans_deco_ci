package net.satan.deco_ci.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import net.satan.deco_ci.datagen.util.CISupGen;
import net.satan.deco_ci.register.CIBlocks;
import net.satan.deco_ci.satans_deco_ci;

public class CIItemModelProvider extends ItemModelProvider {
    public CIItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, satans_deco_ci.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
    //curtains
    curtainBlockItem(CIBlocks.CURTAIN_BLACK);
    curtainBlockItem(CIBlocks.CURTAIN_BLUE);
    curtainBlockItem(CIBlocks.CURTAIN_BROWN);
    curtainBlockItem(CIBlocks.CURTAIN_CYAN);
    curtainBlockItem(CIBlocks.CURTAIN_GRAY);
    curtainBlockItem(CIBlocks.CURTAIN_GREEN);
    curtainBlockItem(CIBlocks.CURTAIN_LIGHT_BLUE);
    curtainBlockItem(CIBlocks.CURTAIN_LIGHT_GRAY);
    curtainBlockItem(CIBlocks.CURTAIN_LIME);
    curtainBlockItem(CIBlocks.CURTAIN_MAGENTA);
    curtainBlockItem(CIBlocks.CURTAIN_ORANGE);
    curtainBlockItem(CIBlocks.CURTAIN_PINK);
    curtainBlockItem(CIBlocks.CURTAIN_PURPLE);
    curtainBlockItem(CIBlocks.CURTAIN_RED);
    curtainBlockItem(CIBlocks.CURTAIN_WHITE);
    curtainBlockItem(CIBlocks.CURTAIN_YELLOW);

    curtain1BlockItem(CIBlocks.CURTAIN_DEFAULT_BLACK);
        curtain1BlockItem(CIBlocks.CURTAIN_DEFAULT_BLUE);
        curtain1BlockItem(CIBlocks.CURTAIN_DEFAULT_BROWN);
        curtain1BlockItem(CIBlocks.CURTAIN_DEFAULT_CYAN);
        curtain1BlockItem(CIBlocks.CURTAIN_DEFAULT_GRAY);
        curtain1BlockItem(CIBlocks.CURTAIN_DEFAULT_GREEN);
        curtain1BlockItem(CIBlocks.CURTAIN_DEFAULT_LIGHT_BLUE);
        curtain1BlockItem(CIBlocks.CURTAIN_DEFAULT_LIGHT_GRAY);
        curtain1BlockItem(CIBlocks.CURTAIN_DEFAULT_LIME);
        curtain1BlockItem(CIBlocks.CURTAIN_DEFAULT_MAGENTA);
        curtain1BlockItem(CIBlocks.CURTAIN_DEFAULT_ORANGE);
        curtain1BlockItem(CIBlocks.CURTAIN_DEFAULT_PINK);
        curtain1BlockItem(CIBlocks.CURTAIN_DEFAULT_PURPLE);
        curtain1BlockItem(CIBlocks.CURTAIN_DEFAULT_RED);
        curtain1BlockItem(CIBlocks.CURTAIN_DEFAULT_WHITE);
        curtain1BlockItem(CIBlocks.CURTAIN_DEFAULT_YELLOW);

        curtain1BlockItem(CIBlocks.CURTAIN_BLINDS_BLACK);
        curtain1BlockItem(CIBlocks.CURTAIN_BLINDS_BLUE);
        curtain1BlockItem(CIBlocks.CURTAIN_BLINDS_BROWN);
        curtain1BlockItem(CIBlocks.CURTAIN_BLINDS_CYAN);
        curtain1BlockItem(CIBlocks.CURTAIN_BLINDS_GRAY);
        curtain1BlockItem(CIBlocks.CURTAIN_BLINDS_GREEN);
        curtain1BlockItem(CIBlocks.CURTAIN_BLINDS_LIGHT_BLUE);
        curtain1BlockItem(CIBlocks.CURTAIN_BLINDS_LIGHT_GRAY);
        curtain1BlockItem(CIBlocks.CURTAIN_BLINDS_LIME);
        curtain1BlockItem(CIBlocks.CURTAIN_BLINDS_MAGENTA);
        curtain1BlockItem(CIBlocks.CURTAIN_BLINDS_ORANGE);
        curtain1BlockItem(CIBlocks.CURTAIN_BLINDS_PINK);
        curtain1BlockItem(CIBlocks.CURTAIN_BLINDS_PURPLE);
        curtain1BlockItem(CIBlocks.CURTAIN_BLINDS_RED);
        curtain1BlockItem(CIBlocks.CURTAIN_BLINDS_WHITE);
        curtain1BlockItem(CIBlocks.CURTAIN_BLINDS_YELLOW);

        simpleBlockItem(CIBlocks.CURTAIN_BEADED_BLACK);
        simpleBlockItem(CIBlocks.CURTAIN_BEADED_BLUE);
        simpleBlockItem(CIBlocks.CURTAIN_BEADED_BROWN);
        simpleBlockItem(CIBlocks.CURTAIN_BEADED_CYAN);
        simpleBlockItem(CIBlocks.CURTAIN_BEADED_GRAY);
        simpleBlockItem(CIBlocks.CURTAIN_BEADED_GREEN);
        simpleBlockItem(CIBlocks.CURTAIN_BEADED_LIGHT_BLUE);
        simpleBlockItem(CIBlocks.CURTAIN_BEADED_LIGHT_GRAY);
        simpleBlockItem(CIBlocks.CURTAIN_BEADED_LIME);
        simpleBlockItem(CIBlocks.CURTAIN_BEADED_MAGENTA);
        simpleBlockItem(CIBlocks.CURTAIN_BEADED_ORANGE);
        simpleBlockItem(CIBlocks.CURTAIN_BEADED_PINK);
        simpleBlockItem(CIBlocks.CURTAIN_BEADED_PURPLE);
        simpleBlockItem(CIBlocks.CURTAIN_BEADED_RED);
        simpleBlockItem(CIBlocks.CURTAIN_BEADED_WHITE);
        simpleBlockItem(CIBlocks.CURTAIN_BEADED_YELLOW);

        //pelmets
       pelmetSolidBlockItem(CIBlocks.PELMET_SOLID_ACACIA);
       pelmetSolidBlockItem(CIBlocks.PELMET_SOLID_OAK);
       pelmetSolidBlockItem(CIBlocks.PELMET_SOLID_DARK_OAK);
       pelmetSolidBlockItem(CIBlocks.PELMET_SOLID_SPRUCE);
       pelmetSolidBlockItem(CIBlocks.PELMET_SOLID_BAMBOO);
       pelmetSolidBlockItem(CIBlocks.PELMET_SOLID_BIRCH);
       pelmetSolidBlockItem(CIBlocks.PELMET_SOLID_CRIMSON);
       pelmetSolidBlockItem(CIBlocks.PELMET_SOLID_WARPED);
       pelmetSolidBlockItem(CIBlocks.PELMET_SOLID_JUNGLE);
        pelmetSolidBlockItem(CIBlocks.PELMET_SOLID_CHERRY);
        pelmetSolidBlockItem(CIBlocks.PELMET_SOLID_MANGROVE);

       pelmetCarvedBlockItem(CIBlocks.PELMET_CARVED_ACACIA);
       pelmetCarvedBlockItem(CIBlocks.PELMET_CARVED_OAK);
       pelmetCarvedBlockItem(CIBlocks.PELMET_CARVED_DARK_OAK);
       pelmetCarvedBlockItem(CIBlocks.PELMET_CARVED_SPRUCE);
       pelmetCarvedBlockItem(CIBlocks.PELMET_CARVED_BAMBOO);
       pelmetCarvedBlockItem(CIBlocks.PELMET_CARVED_BIRCH);
       pelmetCarvedBlockItem(CIBlocks.PELMET_CARVED_CRIMSON);
       pelmetCarvedBlockItem(CIBlocks.PELMET_CARVED_WARPED);
       pelmetCarvedBlockItem(CIBlocks.PELMET_CARVED_JUNGLE);
        pelmetCarvedBlockItem(CIBlocks.PELMET_CARVED_CHERRY);
        pelmetCarvedBlockItem(CIBlocks.PELMET_CARVED_MANGROVE);

       pelmetSolidBlockItem(CIBlocks.PELMET_SOLID_BLACK);
       pelmetSolidBlockItem(CIBlocks.PELMET_SOLID_BLUE);
       pelmetSolidBlockItem(CIBlocks.PELMET_SOLID_YELLOW);
       pelmetSolidBlockItem(CIBlocks.PELMET_SOLID_WHITE);
       pelmetSolidBlockItem(CIBlocks.PELMET_SOLID_RED);
       pelmetSolidBlockItem(CIBlocks.PELMET_SOLID_CYAN);
       pelmetSolidBlockItem(CIBlocks.PELMET_SOLID_PINK);
       pelmetSolidBlockItem(CIBlocks.PELMET_SOLID_LIME);
       pelmetSolidBlockItem(CIBlocks.PELMET_SOLID_GREEN);
       pelmetSolidBlockItem(CIBlocks.PELMET_SOLID_MAGENTA);
       pelmetSolidBlockItem(CIBlocks.PELMET_SOLID_PURPLE);
       pelmetSolidBlockItem(CIBlocks.PELMET_SOLID_ORANGE);
       pelmetSolidBlockItem(CIBlocks.PELMET_SOLID_LIGHT_BLUE);
       pelmetSolidBlockItem(CIBlocks.PELMET_SOLID_BROWN);
       pelmetSolidBlockItem(CIBlocks.PELMET_SOLID_GRAY);
       pelmetSolidBlockItem(CIBlocks.PELMET_SOLID_LIGHT_GRAY);

       pelmetSoftBlockItem(CIBlocks.PELMET_SOFT_BLACK);
       pelmetSoftBlockItem(CIBlocks.PELMET_SOFT_BLUE);
       pelmetSoftBlockItem(CIBlocks.PELMET_SOFT_YELLOW);
       pelmetSoftBlockItem(CIBlocks.PELMET_SOFT_WHITE);
       pelmetSoftBlockItem(CIBlocks.PELMET_SOFT_RED);
       pelmetSoftBlockItem(CIBlocks.PELMET_SOFT_CYAN);
       pelmetSoftBlockItem(CIBlocks.PELMET_SOFT_PINK);
       pelmetSoftBlockItem(CIBlocks.PELMET_SOFT_LIME);
       pelmetSoftBlockItem(CIBlocks.PELMET_SOFT_GREEN);
       pelmetSoftBlockItem(CIBlocks.PELMET_SOFT_MAGENTA);
       pelmetSoftBlockItem(CIBlocks.PELMET_SOFT_PURPLE);
       pelmetSoftBlockItem(CIBlocks.PELMET_SOFT_ORANGE);
       pelmetSoftBlockItem(CIBlocks.PELMET_SOFT_LIGHT_BLUE);
       pelmetSoftBlockItem(CIBlocks.PELMET_SOFT_BROWN);
       pelmetSoftBlockItem(CIBlocks.PELMET_SOFT_GRAY);
       pelmetSoftBlockItem(CIBlocks.PELMET_SOFT_LIGHT_GRAY);

       pelmetOrnateBlockItem(CIBlocks.PELMET_ORNATE_GOLD_BLACK);
       pelmetOrnateBlockItem(CIBlocks.PELMET_ORNATE_GOLD_BLUE);
       pelmetOrnateBlockItem(CIBlocks.PELMET_ORNATE_GOLD_YELLOW);
       pelmetOrnateBlockItem(CIBlocks.PELMET_ORNATE_GOLD_WHITE);
       pelmetOrnateBlockItem(CIBlocks.PELMET_ORNATE_GOLD_RED);
       pelmetOrnateBlockItem(CIBlocks.PELMET_ORNATE_GOLD_CYAN);
       pelmetOrnateBlockItem(CIBlocks.PELMET_ORNATE_GOLD_PINK);
       pelmetOrnateBlockItem(CIBlocks.PELMET_ORNATE_GOLD_LIME);
       pelmetOrnateBlockItem(CIBlocks.PELMET_ORNATE_GOLD_GREEN);
       pelmetOrnateBlockItem(CIBlocks.PELMET_ORNATE_GOLD_MAGENTA);
       pelmetOrnateBlockItem(CIBlocks.PELMET_ORNATE_GOLD_PURPLE);
       pelmetOrnateBlockItem(CIBlocks.PELMET_ORNATE_GOLD_ORANGE);
       pelmetOrnateBlockItem(CIBlocks.PELMET_ORNATE_GOLD_LIGHT_BLUE);
       pelmetOrnateBlockItem(CIBlocks.PELMET_ORNATE_GOLD_BROWN);
       pelmetOrnateBlockItem(CIBlocks.PELMET_ORNATE_GOLD_GRAY);
       pelmetOrnateBlockItem(CIBlocks.PELMET_ORNATE_GOLD_LIGHT_GRAY);

        pelmetOrnateTinselBlockItem(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_BLACK);
        pelmetOrnateTinselBlockItem(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_BLUE);
        pelmetOrnateTinselBlockItem(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_YELLOW);
        pelmetOrnateTinselBlockItem(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_WHITE);
        pelmetOrnateTinselBlockItem(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_RED);
        pelmetOrnateTinselBlockItem(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_CYAN);
        pelmetOrnateTinselBlockItem(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_PINK);
        pelmetOrnateTinselBlockItem(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_LIME);
        pelmetOrnateTinselBlockItem(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_GREEN);
        pelmetOrnateTinselBlockItem(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_MAGENTA);
        pelmetOrnateTinselBlockItem(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_PURPLE);
        pelmetOrnateTinselBlockItem(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_ORANGE);
        pelmetOrnateTinselBlockItem(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_LIGHT_BLUE);
        pelmetOrnateTinselBlockItem(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_BROWN);
        pelmetOrnateTinselBlockItem(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_GRAY);
        pelmetOrnateTinselBlockItem(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_LIGHT_GRAY);
}

    private ItemModelBuilder curtainBlockItem(RegistryObject<Block> block) {
        return withExistingParent(block.getId().getPath(),
                new ResourceLocation("item/generated"))
                .texture("layer0", new ResourceLocation(satans_deco_ci.MODID, "block/" + block.getId().getPath() + "_single_lower"));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> block) {
        return withExistingParent(block.getId().getPath(),
                new ResourceLocation("item/generated"))
                .texture("layer0", new ResourceLocation(satans_deco_ci.MODID, "block/" + block.getId().getPath()));
    }

    private ItemModelBuilder curtain1BlockItem(RegistryObject<Block> block) {
        return withExistingParent(block.getId().getPath(),
                new ResourceLocation("item/generated"))
                .texture("layer0", new ResourceLocation(satans_deco_ci.MODID, "block/" + block.getId().getPath() + "_lower"));
    }

    private ItemModelBuilder pelmetSolidBlockItem(RegistryObject<Block> block){
        ResourceLocation pelmet = CISupGen.matchTexture(block.getId().getPath(), CISupGen.isWooden(block));
        return withExistingParent(block.getId().getPath(),
                new ResourceLocation(satans_deco_ci.MODID, "block/pelmet/pelmet_solid")).texture("pelmet", pelmet);
    }

    private ItemModelBuilder pelmetCarvedBlockItem(RegistryObject<Block> block){
        ResourceLocation pelmet = CISupGen.matchTexture(block.getId().getPath(), true);
        return withExistingParent(block.getId().getPath(),
                new ResourceLocation(satans_deco_ci.MODID, "block/pelmet/pelmet_carved")).texture("pelmet", pelmet);
    }

    private ItemModelBuilder pelmetSoftBlockItem(RegistryObject<Block> block){
        ResourceLocation pelmet = CISupGen.matchCurtain(block.getId().getPath(), false);
        return withExistingParent(block.getId().getPath(),
                new ResourceLocation(satans_deco_ci.MODID, "block/pelmet/pelmet_soft")).texture("pelmet", pelmet);
    }

    private ItemModelBuilder pelmetOrnateBlockItem(RegistryObject<Block> block){
        ResourceLocation pelmet = CISupGen.matchCurtain(block.getId().getPath(), true);
        ResourceLocation metal = CISupGen.matchOrnament(block.getId().getPath(), true);
        ResourceLocation ornament = CISupGen.matchOrnament(block.getId().getPath(), false);
        return withExistingParent(block.getId().getPath(),
                new ResourceLocation(satans_deco_ci.MODID, "block/pelmet/pelmet_ornate")).texture("pelmet", pelmet)
                .texture("metal", metal).texture("ornament", ornament);
    }

    private ItemModelBuilder pelmetOrnateTinselBlockItem(RegistryObject<Block> block){
        ResourceLocation pelmet = CISupGen.matchCurtain(block.getId().getPath(), true);
        ResourceLocation metal = CISupGen.matchOrnament(block.getId().getPath(), true);
        ResourceLocation ornament = CISupGen.matchOrnament(block.getId().getPath(), false);
        ResourceLocation tinsel = CISupGen.matchTinsel(block.getId().getPath(), true);
        return withExistingParent(block.getId().getPath(),
                new ResourceLocation(satans_deco_ci.MODID, "block/pelmet/pelmet_ornate_tinsel")).texture("pelmet", pelmet)
                .texture("metal", metal).texture("ornament", ornament).texture("tinsel", tinsel);
    }

}

