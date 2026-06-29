package net.satan.deco_ci.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;

import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

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
}
