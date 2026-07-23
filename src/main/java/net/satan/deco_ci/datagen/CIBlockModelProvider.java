package net.satan.deco_ci.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

import net.neoforged.neoforge.client.model.generators.BlockModelBuilder;
import net.neoforged.neoforge.client.model.generators.BlockModelProvider;

import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.satan.deco_ci.datagen.util.CISupGen;
import net.satan.deco_ci.register.CIBlocks;
import net.satan.deco_ci.satans_deco_ci;

import java.util.Arrays;

public class CIBlockModelProvider extends BlockModelProvider {
    public CIBlockModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, satans_deco_ci.MODID, existingFileHelper);
    }
    
    @Override
    protected void registerModels() {
        //blocks go here
    //curtains
    curtainModels(CIBlocks.CURTAIN_YELLOW);
    curtainModels(CIBlocks.CURTAIN_WHITE);
    curtainModels(CIBlocks.CURTAIN_RED);
    curtainModels(CIBlocks.CURTAIN_PURPLE);
    curtainModels(CIBlocks.CURTAIN_LIME);
    curtainModels(CIBlocks.CURTAIN_PINK);
    curtainModels(CIBlocks.CURTAIN_ORANGE);
    curtainModels(CIBlocks.CURTAIN_MAGENTA);
    curtainModels(CIBlocks.CURTAIN_LIGHT_GRAY);
    curtainModels(CIBlocks.CURTAIN_LIGHT_BLUE);
    curtainModels(CIBlocks.CURTAIN_GREEN);
    curtainModels(CIBlocks.CURTAIN_GRAY);
    curtainModels(CIBlocks.CURTAIN_CYAN);
    curtainModels(CIBlocks.CURTAIN_BROWN);
    curtainModels(CIBlocks.CURTAIN_BLUE);
    curtainModels(CIBlocks.CURTAIN_BLACK);

        curtainDefaultModels(CIBlocks.CURTAIN_DEFAULT_YELLOW);
        curtainDefaultModels(CIBlocks.CURTAIN_DEFAULT_WHITE);
        curtainDefaultModels(CIBlocks.CURTAIN_DEFAULT_RED);
        curtainDefaultModels(CIBlocks.CURTAIN_DEFAULT_PURPLE);
        curtainDefaultModels(CIBlocks.CURTAIN_DEFAULT_LIME);
        curtainDefaultModels(CIBlocks.CURTAIN_DEFAULT_PINK);
        curtainDefaultModels(CIBlocks.CURTAIN_DEFAULT_ORANGE);
        curtainDefaultModels(CIBlocks.CURTAIN_DEFAULT_MAGENTA);
        curtainDefaultModels(CIBlocks.CURTAIN_DEFAULT_LIGHT_GRAY);
        curtainDefaultModels(CIBlocks.CURTAIN_DEFAULT_LIGHT_BLUE);
        curtainDefaultModels(CIBlocks.CURTAIN_DEFAULT_GREEN);
        curtainDefaultModels(CIBlocks.CURTAIN_DEFAULT_GRAY);
        curtainDefaultModels(CIBlocks.CURTAIN_DEFAULT_CYAN);
        curtainDefaultModels(CIBlocks.CURTAIN_DEFAULT_BROWN);
        curtainDefaultModels(CIBlocks.CURTAIN_DEFAULT_BLUE);
        curtainDefaultModels(CIBlocks.CURTAIN_DEFAULT_BLACK);

        curtainBeadedModels(CIBlocks.CURTAIN_BEADED_YELLOW);
        curtainBeadedModels(CIBlocks.CURTAIN_BEADED_WHITE);
        curtainBeadedModels(CIBlocks.CURTAIN_BEADED_RED);
        curtainBeadedModels(CIBlocks.CURTAIN_BEADED_PURPLE);
        curtainBeadedModels(CIBlocks.CURTAIN_BEADED_LIME);
        curtainBeadedModels(CIBlocks.CURTAIN_BEADED_PINK);
        curtainBeadedModels(CIBlocks.CURTAIN_BEADED_ORANGE);
        curtainBeadedModels(CIBlocks.CURTAIN_BEADED_MAGENTA);
        curtainBeadedModels(CIBlocks.CURTAIN_BEADED_LIGHT_GRAY);
        curtainBeadedModels(CIBlocks.CURTAIN_BEADED_LIGHT_BLUE);
        curtainBeadedModels(CIBlocks.CURTAIN_BEADED_GREEN);
        curtainBeadedModels(CIBlocks.CURTAIN_BEADED_GRAY);
        curtainBeadedModels(CIBlocks.CURTAIN_BEADED_CYAN);
        curtainBeadedModels(CIBlocks.CURTAIN_BEADED_BROWN);
        curtainBeadedModels(CIBlocks.CURTAIN_BEADED_BLUE);
        curtainBeadedModels(CIBlocks.CURTAIN_BEADED_BLACK);

        curtainBlindsModels(CIBlocks.CURTAIN_BLINDS_YELLOW);
        curtainBlindsModels(CIBlocks.CURTAIN_BLINDS_WHITE);
        curtainBlindsModels(CIBlocks.CURTAIN_BLINDS_RED);
        curtainBlindsModels(CIBlocks.CURTAIN_BLINDS_PURPLE);
        curtainBlindsModels(CIBlocks.CURTAIN_BLINDS_LIME);
        curtainBlindsModels(CIBlocks.CURTAIN_BLINDS_PINK);
        curtainBlindsModels(CIBlocks.CURTAIN_BLINDS_ORANGE);
        curtainBlindsModels(CIBlocks.CURTAIN_BLINDS_MAGENTA);
        curtainBlindsModels(CIBlocks.CURTAIN_BLINDS_LIGHT_GRAY);
        curtainBlindsModels(CIBlocks.CURTAIN_BLINDS_LIGHT_BLUE);
        curtainBlindsModels(CIBlocks.CURTAIN_BLINDS_GREEN);
        curtainBlindsModels(CIBlocks.CURTAIN_BLINDS_GRAY);
        curtainBlindsModels(CIBlocks.CURTAIN_BLINDS_CYAN);
        curtainBlindsModels(CIBlocks.CURTAIN_BLINDS_BROWN);
        curtainBlindsModels(CIBlocks.CURTAIN_BLINDS_BLUE);
        curtainBlindsModels(CIBlocks.CURTAIN_BLINDS_BLACK);

        pelmetSolidModels(CIBlocks.PELMET_SOLID_ACACIA);
        pelmetSolidModels(CIBlocks.PELMET_SOLID_OAK);
        pelmetSolidModels(CIBlocks.PELMET_SOLID_DARK_OAK);
        pelmetSolidModels(CIBlocks.PELMET_SOLID_SPRUCE);
        pelmetSolidModels(CIBlocks.PELMET_SOLID_BAMBOO);
        pelmetSolidModels(CIBlocks.PELMET_SOLID_BIRCH);
        pelmetSolidModels(CIBlocks.PELMET_SOLID_CRIMSON);
        pelmetSolidModels(CIBlocks.PELMET_SOLID_WARPED);
        pelmetSolidModels(CIBlocks.PELMET_SOLID_JUNGLE);
        pelmetSolidModels(CIBlocks.PELMET_SOLID_CHERRY);
        pelmetSolidModels(CIBlocks.PELMET_SOLID_MANGROVE);

        pelmetCarvedModels(CIBlocks.PELMET_CARVED_ACACIA);
        pelmetCarvedModels(CIBlocks.PELMET_CARVED_OAK);
        pelmetCarvedModels(CIBlocks.PELMET_CARVED_DARK_OAK);
        pelmetCarvedModels(CIBlocks.PELMET_CARVED_SPRUCE);
        pelmetCarvedModels(CIBlocks.PELMET_CARVED_BAMBOO);
        pelmetCarvedModels(CIBlocks.PELMET_CARVED_BIRCH);
        pelmetCarvedModels(CIBlocks.PELMET_CARVED_CRIMSON);
        pelmetCarvedModels(CIBlocks.PELMET_CARVED_WARPED);
        pelmetCarvedModels(CIBlocks.PELMET_CARVED_JUNGLE);
        pelmetCarvedModels(CIBlocks.PELMET_CARVED_CHERRY);
        pelmetCarvedModels(CIBlocks.PELMET_CARVED_MANGROVE);

        pelmetSolidModels(CIBlocks.PELMET_SOLID_BLACK);
        pelmetSolidModels(CIBlocks.PELMET_SOLID_BLUE);
        pelmetSolidModels(CIBlocks.PELMET_SOLID_YELLOW);
        pelmetSolidModels(CIBlocks.PELMET_SOLID_WHITE);
        pelmetSolidModels(CIBlocks.PELMET_SOLID_RED);
        pelmetSolidModels(CIBlocks.PELMET_SOLID_CYAN);
        pelmetSolidModels(CIBlocks.PELMET_SOLID_PINK);
        pelmetSolidModels(CIBlocks.PELMET_SOLID_LIME);
        pelmetSolidModels(CIBlocks.PELMET_SOLID_GREEN);
        pelmetSolidModels(CIBlocks.PELMET_SOLID_MAGENTA);
        pelmetSolidModels(CIBlocks.PELMET_SOLID_PURPLE);
        pelmetSolidModels(CIBlocks.PELMET_SOLID_ORANGE);
        pelmetSolidModels(CIBlocks.PELMET_SOLID_LIGHT_BLUE);
        pelmetSolidModels(CIBlocks.PELMET_SOLID_BROWN);
        pelmetSolidModels(CIBlocks.PELMET_SOLID_GRAY);
        pelmetSolidModels(CIBlocks.PELMET_SOLID_LIGHT_GRAY);

        pelmetSoftModels(CIBlocks.PELMET_SOFT_BLACK);
        pelmetSoftModels(CIBlocks.PELMET_SOFT_BLUE);
        pelmetSoftModels(CIBlocks.PELMET_SOFT_YELLOW);
        pelmetSoftModels(CIBlocks.PELMET_SOFT_WHITE);
        pelmetSoftModels(CIBlocks.PELMET_SOFT_RED);
        pelmetSoftModels(CIBlocks.PELMET_SOFT_CYAN);
        pelmetSoftModels(CIBlocks.PELMET_SOFT_PINK);
        pelmetSoftModels(CIBlocks.PELMET_SOFT_LIME);
        pelmetSoftModels(CIBlocks.PELMET_SOFT_GREEN);
        pelmetSoftModels(CIBlocks.PELMET_SOFT_MAGENTA);
        pelmetSoftModels(CIBlocks.PELMET_SOFT_PURPLE);
        pelmetSoftModels(CIBlocks.PELMET_SOFT_ORANGE);
        pelmetSoftModels(CIBlocks.PELMET_SOFT_LIGHT_BLUE);
        pelmetSoftModels(CIBlocks.PELMET_SOFT_BROWN);
        pelmetSoftModels(CIBlocks.PELMET_SOFT_GRAY);
        pelmetSoftModels(CIBlocks.PELMET_SOFT_LIGHT_GRAY);

        pelmetOrnateModels(CIBlocks.PELMET_ORNATE_GOLD_BLACK, false);
        pelmetOrnateModels(CIBlocks.PELMET_ORNATE_GOLD_BLUE, false);
        pelmetOrnateModels(CIBlocks.PELMET_ORNATE_GOLD_YELLOW, false);
        pelmetOrnateModels(CIBlocks.PELMET_ORNATE_GOLD_WHITE, false);
        pelmetOrnateModels(CIBlocks.PELMET_ORNATE_GOLD_RED, false);
        pelmetOrnateModels(CIBlocks.PELMET_ORNATE_GOLD_CYAN, false);
        pelmetOrnateModels(CIBlocks.PELMET_ORNATE_GOLD_PINK, false);
        pelmetOrnateModels(CIBlocks.PELMET_ORNATE_GOLD_LIME, false);
        pelmetOrnateModels(CIBlocks.PELMET_ORNATE_GOLD_GREEN, false);
        pelmetOrnateModels(CIBlocks.PELMET_ORNATE_GOLD_MAGENTA, false);
        pelmetOrnateModels(CIBlocks.PELMET_ORNATE_GOLD_PURPLE, false);
        pelmetOrnateModels(CIBlocks.PELMET_ORNATE_GOLD_ORANGE, false);
        pelmetOrnateModels(CIBlocks.PELMET_ORNATE_GOLD_LIGHT_BLUE, false);
        pelmetOrnateModels(CIBlocks.PELMET_ORNATE_GOLD_BROWN, false);
        pelmetOrnateModels(CIBlocks.PELMET_ORNATE_GOLD_GRAY, false);
        pelmetOrnateModels(CIBlocks.PELMET_ORNATE_GOLD_LIGHT_GRAY, false);

        pelmetOrnateModels(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_BLACK, true);
        pelmetOrnateModels(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_BLUE, true);
        pelmetOrnateModels(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_YELLOW, true);
        pelmetOrnateModels(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_WHITE, true);
        pelmetOrnateModels(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_RED, true);
        pelmetOrnateModels(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_CYAN, true);
        pelmetOrnateModels(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_PINK, true);
        pelmetOrnateModels(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_LIME, true);
        pelmetOrnateModels(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_GREEN, true);
        pelmetOrnateModels(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_MAGENTA, true);
        pelmetOrnateModels(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_PURPLE, true);
        pelmetOrnateModels(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_ORANGE, true);
        pelmetOrnateModels(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_LIGHT_BLUE, true);
        pelmetOrnateModels(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_BROWN, true);
        pelmetOrnateModels(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_GRAY, true);
        pelmetOrnateModels(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_LIGHT_GRAY, true);

        //blocks end here
}

// registry objects

    private BlockModelBuilder pelmetOrnateModels(DeferredBlock<Block> block, boolean hasTinsel){
        String name = block.getId().getPath();
        ResourceLocation pelmet = CISupGen.matchCurtain(block.getId().getPath(), true);
        ResourceLocation metal = CISupGen.matchOrnament(block.getId().getPath(), true);
        ResourceLocation ornament = CISupGen.matchOrnament(block.getId().getPath(), false);
        ResourceLocation tinsel = hasTinsel ? CISupGen.matchTinsel(block.getId().getPath(), true)
                : ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/null");
        if (hasTinsel) {
            for (BlockModelBuilder blockModelBuilder : Arrays.asList(
                    pelmetOrnateTinsel(name, pelmet, metal, ornament, tinsel),
                    pelmetOrnateTinselBars(name, pelmet, metal, ornament, tinsel)
            )) {
                return blockModelBuilder;
            }
        } else {
            for (BlockModelBuilder blockModelBuilder : Arrays.asList(
                    pelmetOrnate(name, pelmet, metal, ornament),
                    pelmetOrnateBars(name, pelmet, metal, ornament)
            )) {
                return blockModelBuilder;
            }
        }
        return null;
    }

    private BlockModelBuilder pelmetCarvedModels(DeferredBlock<Block> block){
        String name = block.getId().getPath();
        ResourceLocation pelmet = CISupGen.matchTexture(block.getId().getPath(), true);
        for (BlockModelBuilder blockModelBuilder : Arrays.asList(
                pelmetCarved(name, pelmet),
                pelmetCarvedBars(name, pelmet)
        )) {
            return blockModelBuilder;
        }
        return null;
    }

    private BlockModelBuilder pelmetSoftModels(DeferredBlock<Block> block){
        String name = block.getId().getPath();
        ResourceLocation pelmet = CISupGen.matchCurtain(block.getId().getPath(), false);
        for (BlockModelBuilder blockModelBuilder : Arrays.asList(
                pelmetSoft(name, pelmet),
                pelmetSoftBars(name, pelmet)
        )) {
            return blockModelBuilder;
        }
        return null;
    }

    private BlockModelBuilder pelmetSolidModels(DeferredBlock<Block> block){
        String name = block.getId().getPath();
        ResourceLocation pelmet = CISupGen.matchTexture(block.getId().getPath(), CISupGen.isWooden(block));
        for (BlockModelBuilder blockModelBuilder : Arrays.asList(
                pelmetSolid(name, pelmet),
                pelmetSolidBars(name, pelmet)
        )) {
            return blockModelBuilder;
        }
        return null;
    }

    private BlockModelBuilder curtainModels(DeferredBlock<Block> block) {
        String name = block.getId().getPath();

        ResourceLocation curtain_single = ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_single_upper");
        ResourceLocation curtain_singleDown = ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_single_lower");
        ResourceLocation curtain_left = ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_three_left_upper");
        ResourceLocation curtain_leftDown = ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_three_left_lower");
        ResourceLocation curtain_middle = ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_three_middle_upper");
        ResourceLocation curtain_middleDown = ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_three_middle_lower");
        ResourceLocation curtain_right = ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_three_right_upper");
        ResourceLocation curtain_rightDown = ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_three_right_lower");
        ResourceLocation curtain_singleOpen = ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_single_upper_open");
        ResourceLocation curtain_singleDownOpen = ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_single_lower_open");
        ResourceLocation curtain_leftOpen = ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_three_left_upper_open");
        ResourceLocation curtain_leftDownOpen = ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_three_left_lower_open");
        ResourceLocation curtain_rightOpen = ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_three_right_upper_open");
        ResourceLocation curtain_rightDownOpen = ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_three_right_lower_open");
        ResourceLocation rod = ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/curtain_rod_oak");
        ResourceLocation empty = ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/null");

        for (BlockModelBuilder blockModelBuilder : Arrays.asList(barsPostEnds(name, rod, rod),
                curtainRodSide(name, rod),
                curtainRodSideAlt(name, rod),
                curtainCap(name, curtain_middle),
                curtainCapAlt(name, curtain_middle),
                curtainDownCap(name, curtain_middle),
                curtainDownCapAlt(name, curtain_middle),
                barsPost(name, curtain_middle, curtain_middle),

                curtainSide(name +"_single_upper", curtain_single),
                curtainSideAlt(name +"_single_upper", curtain_single),
                curtainSide(name +"_single_lower", curtain_singleDown),
                curtainSideAlt(name +"_single_lower", curtain_singleDown),
                curtainSide(name +"_single_lower_open", curtain_singleDownOpen),
                curtainSideAlt(name +"_single_lower_open", curtain_singleDownOpen),
                curtainSide(name +"_single_upper_open", curtain_singleOpen),
                curtainSideAlt(name +"_single_upper_open", curtain_singleOpen),

                curtainSide(name +"_three_left_upper", curtain_left),
                curtainSideAlt(name +"_three_left_upper", curtain_left),
                curtainSide(name +"_three_left_lower", curtain_leftDown),
                curtainSideAlt(name +"_three_left_lower", curtain_leftDown),
                curtainSide(name +"_three_left_upper_open", curtain_leftOpen),
                curtainSideAlt(name +"_three_left_upper_open", curtain_leftOpen),
                curtainSide(name +"_three_left_lower_open", curtain_leftDownOpen),
                curtainSideAlt(name +"_three_left_lower_open", curtain_leftDownOpen),

                curtainSide(name +"_three_middle_upper", curtain_middle),
                curtainSideAlt(name +"_three_middle_upper", curtain_middle),
                curtainSide(name +"_three_middle_lower", curtain_middleDown),
                curtainSideAlt(name +"_three_middle_lower", curtain_middleDown),
                curtainSide(name +"_three_middle_upper_open", empty),
                curtainSideAlt(name +"_three_middle_upper_open", empty),
                curtainSide(name +"_three_middle_lower_open", empty),
                curtainSideAlt(name +"_three_middle_lower_open", empty),

                curtainSide(name +"_three_right_upper", curtain_right),
                curtainSideAlt(name +"_three_right_upper", curtain_right),
                curtainSide(name+"_three_right_lower", curtain_rightDown),
                curtainSideAlt(name+"_three_right_lower", curtain_rightDown),
                curtainSide(name +"_three_right_upper_open", curtain_rightOpen),
                curtainSideAlt(name +"_three_right_upper_open", curtain_rightOpen),
                curtainSide(name +"_three_right_lower_open", curtain_rightDownOpen),
                curtainSideAlt(name +"_three_right_lower_open", curtain_rightDownOpen)
        )) {
            return blockModelBuilder;
        }
        return null;
    }

    private BlockModelBuilder curtainDefaultModels(DeferredBlock<Block> block) {
        String name = block.getId().getPath();
        String color = name.replace("curtain_default", "");

        ResourceLocation curtain_middle = ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/curtain" + color +"_three_middle_upper");

        ResourceLocation curtain_middleDown = ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_lower");

        ResourceLocation curtain_singleOpen = ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_upper_open");
        ResourceLocation curtain_singleDownOpen = ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_lower_open");
        ResourceLocation curtain_leftOpen = ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_left_upper_open");
        ResourceLocation curtain_leftDownOpen = ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_left_lower_open");
        ResourceLocation curtain_rightOpen = ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_right_upper_open");
        ResourceLocation curtain_rightDownOpen = ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_right_lower_open");
        ResourceLocation rod = ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/curtain_rod_oak");
        ResourceLocation empty = ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/null");

        for (BlockModelBuilder blockModelBuilder : Arrays.asList(barsPostEnds(name, rod, rod),
                curtainRodSide(name, rod),
                curtainRodSideAlt(name, rod),
                curtainCap(name, curtain_middle),
                curtainCapAlt(name, curtain_middle),
                curtainDownCap(name, curtain_middle),
                curtainDownCapAlt(name, curtain_middle),
                barsPost(name, curtain_middle, curtain_middle),

                curtainSide(name +"_lower_open", curtain_singleDownOpen),
                curtainSideAlt(name +"_lower_open", curtain_singleDownOpen),
                curtainSide(name +"_upper_open", curtain_singleOpen),
                curtainSideAlt(name +"_upper_open", curtain_singleOpen),

                curtainSide(name +"_left_upper_open", curtain_leftOpen),
                curtainSideAlt(name +"_left_upper_open", curtain_leftOpen),
                curtainSide(name +"_left_lower_open", curtain_leftDownOpen),
                curtainSideAlt(name +"_left_lower_open", curtain_leftDownOpen),

                curtainSide(name +"_upper", curtain_middle),
                curtainSideAlt(name +"_upper", curtain_middle),
                curtainSide(name +"_lower", curtain_middleDown),
                curtainSideAlt(name +"_lower", curtain_middleDown),
                curtainSide(name +"_middle_upper_open", empty),
                curtainSideAlt(name +"_middle_upper_open", empty),
                curtainSide(name +"_middle_lower_open", empty),
                curtainSideAlt(name +"_middle_lower_open", empty),

                curtainSide(name +"_right_upper_open", curtain_rightOpen),
                curtainSideAlt(name +"_right_upper_open", curtain_rightOpen),
                curtainSide(name +"_right_lower_open", curtain_rightDownOpen),
                curtainSideAlt(name +"_right_lower_open", curtain_rightDownOpen)
        )) {
            return blockModelBuilder;
        }
        return null;
    }

    private BlockModelBuilder curtainBeadedModels(DeferredBlock<Block> block) {
        String name = block.getId().getPath();

        ResourceLocation curtain_middle = ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/" + block.getId().getPath());
        ResourceLocation curtain_singleOpen = ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_open");
        ResourceLocation curtain_leftOpen = ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_left_open");
        ResourceLocation curtain_rightOpen = ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_right_open");

        ResourceLocation rod = ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/curtain_rod_oak");
        ResourceLocation empty = ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/null");

        for (BlockModelBuilder blockModelBuilder : Arrays.asList(barsPostEnds(name, rod, rod),
                curtainRodSide(name, rod),
                curtainRodSideAlt(name, rod),
                curtainCap(name, curtain_middle),
                curtainCapAlt(name, curtain_middle),
                curtainDownCap(name, curtain_middle),
                curtainDownCapAlt(name, curtain_middle),
                barsPost(name, curtain_middle, curtain_middle),

                curtainSide(name +"_open", curtain_singleOpen),
                curtainSideAlt(name +"_open", curtain_singleOpen),

                curtainSide(name +"_left_open", curtain_leftOpen),
                curtainSideAlt(name +"_left_open", curtain_leftOpen),

                curtainSide(name, curtain_middle),
                curtainSideAlt(name, curtain_middle),
                curtainSide(name +"_middle_open", empty),
                curtainSideAlt(name +"_middle_open", empty),

                curtainSide(name +"_right_open", curtain_rightOpen),
                curtainSideAlt(name +"_right_open", curtain_rightOpen)
        )) {
            return blockModelBuilder;
        }
        return null;
    }

    private BlockModelBuilder curtainBlindsModels(DeferredBlock<Block> block) {
        String name = block.getId().getPath();

        ResourceLocation curtain_open = ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_upper_open");
        ResourceLocation curtain_upper = ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_upper");
        ResourceLocation curtain_lower = ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_lower");

        ResourceLocation rod = ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/curtain_rod_oak");
        ResourceLocation empty = ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/null");

        for (BlockModelBuilder blockModelBuilder : Arrays.asList(barsPostEnds(name, rod, rod),
                curtainRodSide(name, rod),
                curtainRodSideAlt(name, rod),
                curtainCap(name, curtain_upper),
                curtainCapAlt(name, curtain_upper),
                curtainDownCap(name, curtain_lower),
                curtainDownCapAlt(name, curtain_lower),
                barsPost(name, curtain_upper, curtain_upper),

                curtainSide(name +"_upper_open", curtain_open),
                curtainSideAlt(name +"_upper_open", curtain_open),

                curtainSide(name +"_upper", curtain_upper),
                curtainSideAlt(name +"_upper", curtain_upper),

                curtainSide(name +"_lower_open", empty),
                curtainSideAlt(name +"_lower_open", empty),

                curtainSide(name +"_lower", curtain_lower),
                curtainSideAlt(name +"_lower", curtain_lower)
        )) {
            return blockModelBuilder;
        }
        return null;
    }

// models

    public BlockModelBuilder barsPost(String name, ResourceLocation particle, ResourceLocation bars) {
        return withExistingParent(name + "_post", ResourceLocation.withDefaultNamespace("block/iron_bars_post"))
                .texture("particle", particle)
                .texture("bars", bars).renderType("cutout_mipped");
    }

    public BlockModelBuilder barsPostEnds(String name, ResourceLocation particle, ResourceLocation edge) {
        return withExistingParent(name + "_post_ends", ResourceLocation.withDefaultNamespace("block/iron_bars_post_ends"))
                .texture("particle", particle)
                .texture("edge", edge).renderType("cutout_mipped");
    }
    
    public BlockModelBuilder curtainRodSide(String name, ResourceLocation rod) {
        return singleTexture(name + "_rod_side",ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/curtain/curtain_rod_side"), "rod", rod);
    }

    public BlockModelBuilder curtainRodSideAlt(String name, ResourceLocation rod) {
        return singleTexture(name + "_rod_side_alt",ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/curtain/curtain_rod_side_alt"), "rod", rod);
    }

    public BlockModelBuilder curtainSide(String name, ResourceLocation bars) {
        return singleTexture(name + "_side",ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID,
                "block/curtain/curtain_side"), "bars", bars).renderType("cutout_mipped");
    }

    public BlockModelBuilder curtainSideAlt(String name, ResourceLocation bars) {
        return singleTexture(name + "_side_alt",ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID,
                "block/curtain/curtain_side_alt"), "bars", bars).renderType("cutout_mipped");
    }

    public BlockModelBuilder curtainCap(String name, ResourceLocation bars) {
        return singleTexture(name + "_cap",ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID,
                "block/curtain/curtain_cap"), "bars", bars).renderType("cutout_mipped");
    }

    public BlockModelBuilder curtainCapAlt(String name, ResourceLocation bars) {
        return singleTexture(name + "_cap_alt",ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID,
                "block/curtain/curtain_cap_alt"), "bars", bars).renderType("cutout_mipped");
    }

    public BlockModelBuilder curtainDownCap(String name, ResourceLocation bars) {
        return singleTexture(name + "_down_cap",ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID,
                "block/curtain/curtain_down_cap"), "bars", bars).renderType("cutout_mipped");
    }

    public BlockModelBuilder curtainDownCapAlt(String name, ResourceLocation bars) {
        return singleTexture(name + "_down_cap_alt",ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID,
                "block/curtain/curtain_down_cap_alt"), "bars", bars).renderType("cutout_mipped");
    }

    public BlockModelBuilder vine(String name, ResourceLocation vine) {
        return singleTexture(name, ResourceLocation.withDefaultNamespace( "block/vine"), "vine", vine).renderType("cutout_mipped");
    }

    public BlockModelBuilder pelmetSolid(String name, ResourceLocation pelmet) {
        return singleTexture(name,ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/pelmet/pelmet_solid"), "pelmet", pelmet);
    }

    public BlockModelBuilder pelmetSolidBars(String name, ResourceLocation pelmet) {
        return singleTexture(name + "_bars",ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/pelmet/pelmet_solid_bars"), "pelmet", pelmet);
    }

    public BlockModelBuilder pelmetSoft(String name, ResourceLocation pelmet) {
        return singleTexture(name,ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/pelmet/pelmet_soft"), "pelmet", pelmet).renderType("cutout_mipped");
    }

    public BlockModelBuilder pelmetSoftBars(String name, ResourceLocation pelmet) {
        return singleTexture(name + "_bars",ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/pelmet/pelmet_soft_bars"), "pelmet", pelmet).renderType("cutout_mipped");
    }

    public BlockModelBuilder pelmetCarved(String name, ResourceLocation pelmet) {
        return singleTexture(name,ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/pelmet/pelmet_carved"), "pelmet", pelmet);
    }

    public BlockModelBuilder pelmetCarvedBars(String name, ResourceLocation pelmet) {
        return singleTexture(name + "_bars",ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/pelmet/pelmet_carved_bars"), "pelmet", pelmet);
    }

    public BlockModelBuilder pelmetOrnate(String name, ResourceLocation pelmet, ResourceLocation metal, ResourceLocation ornament) {
        return withExistingParent(name,ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/pelmet/pelmet_ornate"))
                .texture("pelmet", pelmet)
                .texture("metal", metal)
                .texture("ornament", ornament).renderType("cutout_mipped");
    }

    public BlockModelBuilder pelmetOrnateBars(String name, ResourceLocation pelmet, ResourceLocation metal, ResourceLocation ornament) {
        return withExistingParent(name + "_bars",ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/pelmet/pelmet_ornate_bars"))
                .texture("pelmet", pelmet)
                .texture("metal", metal)
                .texture("ornament", ornament).renderType("cutout_mipped");
    }

    public BlockModelBuilder pelmetOrnateTinsel(String name, ResourceLocation pelmet, ResourceLocation metal, ResourceLocation ornament, ResourceLocation tinsel) {
        return withExistingParent(name,ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/pelmet/pelmet_ornate_tinsel"))
                .texture("pelmet", pelmet)
                .texture("metal", metal)
                .texture("ornament", ornament)
                .texture("tinsel", tinsel).renderType("cutout_mipped");
    }

    public BlockModelBuilder pelmetOrnateTinselBars(String name, ResourceLocation pelmet, ResourceLocation metal, ResourceLocation ornament, ResourceLocation tinsel) {
        return withExistingParent(name + "_bars",ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, "block/pelmet/pelmet_ornate_tinsel_bars"))
                .texture("pelmet", pelmet)
                .texture("metal", metal)
                .texture("ornament", ornament)
                .texture("tinsel", tinsel).renderType("cutout_mipped");
    }

}
