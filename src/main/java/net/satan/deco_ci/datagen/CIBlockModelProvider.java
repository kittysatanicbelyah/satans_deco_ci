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

    private BlockModelBuilder curtainDefaultModels(RegistryObject<Block> block) {
        String name = block.getId().getPath();
        String color = name.replace("curtain_default", "");

        ResourceLocation curtain_middle = new ResourceLocation(satans_deco_ci.MODID, "block/curtain" + color +"_three_middle_upper");

        ResourceLocation curtain_middleDown = new ResourceLocation(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_lower");

        ResourceLocation curtain_singleOpen = new ResourceLocation(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_upper_open");
        ResourceLocation curtain_singleDownOpen = new ResourceLocation(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_lower_open");
        ResourceLocation curtain_leftOpen = new ResourceLocation(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_left_upper_open");
        ResourceLocation curtain_leftDownOpen = new ResourceLocation(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_left_lower_open");
        ResourceLocation curtain_rightOpen = new ResourceLocation(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_right_upper_open");
        ResourceLocation curtain_rightDownOpen = new ResourceLocation(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_right_lower_open");
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

    private BlockModelBuilder curtainBeadedModels(RegistryObject<Block> block) {
        String name = block.getId().getPath();

        ResourceLocation curtain_middle = new ResourceLocation(satans_deco_ci.MODID, "block/" + block.getId().getPath());
        ResourceLocation curtain_singleOpen = new ResourceLocation(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_open");
        ResourceLocation curtain_leftOpen = new ResourceLocation(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_left_open");
        ResourceLocation curtain_rightOpen = new ResourceLocation(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_right_open");

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

    private BlockModelBuilder curtainBlindsModels(RegistryObject<Block> block) {
        String name = block.getId().getPath();

        ResourceLocation curtain_open = new ResourceLocation(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_upper_open");
        ResourceLocation curtain_upper = new ResourceLocation(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_upper");
        ResourceLocation curtain_lower = new ResourceLocation(satans_deco_ci.MODID, "block/" + block.getId().getPath() +"_lower");

        ResourceLocation rod = new ResourceLocation(satans_deco_ci.MODID, "block/curtain_rod_oak");
        ResourceLocation empty = new ResourceLocation(satans_deco_ci.MODID, "block/null");

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
