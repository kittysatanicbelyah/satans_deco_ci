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

}

    private ItemModelBuilder curtainBlockItem(RegistryObject<Block> block) {
        return withExistingParent(block.getId().getPath(),
                new ResourceLocation("item/generated"))
                .texture("layer0", new ResourceLocation(satans_deco_ci.MODID, "block/" + block.getId().getPath() + "_single_lower"));
    }
}
