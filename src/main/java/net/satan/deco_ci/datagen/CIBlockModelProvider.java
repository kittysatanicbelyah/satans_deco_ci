package net.satan.deco_ci.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

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

    //blocks end here
}

// registry objects

    private BlockModelBuilder curtainModels(RegistryObject<Block> block) {
        String name = block.getId().getPath();

        ResourceLocation curtain_single = new ResourceLocation(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_single_upper");
        ResourceLocation curtain_singleDown = new ResourceLocation(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_single_lower");
        ResourceLocation curtain_left = new ResourceLocation(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_three_left_upper");
        ResourceLocation curtain_leftDown = new ResourceLocation(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_three_left_lower");
        ResourceLocation curtain_middle = new ResourceLocation(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_three_middle_upper");
        ResourceLocation curtain_middleDown = new ResourceLocation(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_three_middle_lower");
        ResourceLocation curtain_right = new ResourceLocation(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_three_right_upper");
        ResourceLocation curtain_rightDown = new ResourceLocation(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_three_right_lower");
        ResourceLocation curtain_singleOpen = new ResourceLocation(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_single_upper_open");
        ResourceLocation curtain_singleDownOpen = new ResourceLocation(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_single_lower_open");
        ResourceLocation curtain_leftOpen = new ResourceLocation(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_three_left_upper_open");
        ResourceLocation curtain_leftDownOpen = new ResourceLocation(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_three_left_lower_open");
        ResourceLocation curtain_rightOpen = new ResourceLocation(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_three_right_upper_open");
        ResourceLocation curtain_rightDownOpen = new ResourceLocation(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_three_right_lower_open");
        ResourceLocation rod = new ResourceLocation(satans_deco_ci.MODID, "block/curtain_rod_oak");
        ResourceLocation empty = new ResourceLocation(satans_deco_ci.MODID, "block/null");

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

// models

    public BlockModelBuilder barsPost(String name, ResourceLocation particle, ResourceLocation bars) {
        return withExistingParent(name + "_post", new ResourceLocation("block/iron_bars_post"))
                .texture("particle", particle)
                .texture("bars", bars).renderType("cutout_mipped");
    }

    public BlockModelBuilder barsPostEnds(String name, ResourceLocation particle, ResourceLocation edge) {
        return withExistingParent(name + "_post_ends", new ResourceLocation("block/iron_bars_post_ends"))
                .texture("particle", particle)
                .texture("edge", edge).renderType("cutout_mipped");
    }
    
    public BlockModelBuilder curtainRodSide(String name, ResourceLocation rod) {
        return singleTexture(name + "_rod_side", new ResourceLocation(satans_deco_ci.MODID, "block/curtain/curtain_rod_side"), "rod", rod);
    }

    public BlockModelBuilder curtainRodSideAlt(String name, ResourceLocation rod) {
        return singleTexture(name + "_rod_side_alt", new ResourceLocation(satans_deco_ci.MODID, "block/curtain/curtain_rod_side_alt"), "rod", rod);
    }

    public BlockModelBuilder curtainSide(String name, ResourceLocation bars) {
        return singleTexture(name + "_side", new ResourceLocation(satans_deco_ci.MODID,
                "block/curtain/curtain_side"), "bars", bars).renderType("cutout_mipped");
    }

    public BlockModelBuilder curtainSideAlt(String name, ResourceLocation bars) {
        return singleTexture(name + "_side_alt", new ResourceLocation(satans_deco_ci.MODID,
                "block/curtain/curtain_side_alt"), "bars", bars).renderType("cutout_mipped");
    }

    public BlockModelBuilder curtainCap(String name, ResourceLocation bars) {
        return singleTexture(name + "_cap", new ResourceLocation(satans_deco_ci.MODID,
                "block/curtain/curtain_cap"), "bars", bars).renderType("cutout_mipped");
    }

    public BlockModelBuilder curtainCapAlt(String name, ResourceLocation bars) {
        return singleTexture(name + "_cap_alt", new ResourceLocation(satans_deco_ci.MODID,
                "block/curtain/curtain_cap_alt"), "bars", bars).renderType("cutout_mipped");
    }

    public BlockModelBuilder curtainDownCap(String name, ResourceLocation bars) {
        return singleTexture(name + "_down_cap", new ResourceLocation(satans_deco_ci.MODID,
                "block/curtain/curtain_down_cap"), "bars", bars).renderType("cutout_mipped");
    }

    public BlockModelBuilder curtainDownCapAlt(String name, ResourceLocation bars) {
        return singleTexture(name + "_down_cap_alt", new ResourceLocation(satans_deco_ci.MODID,
                "block/curtain/curtain_down_cap_alt"), "bars", bars).renderType("cutout_mipped");
    }
    
}
