package net.satan.deco_ci.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import net.satan.deco_ci.register.CIBlocks;

import java.util.Set;

public class CIBlockLootTables extends BlockLootSubProvider {
    public CIBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        //loot tables go here

        //curtains
        this.dropSelf(CIBlocks.CURTAIN_BLACK.get());
        this.dropSelf(CIBlocks.CURTAIN_BLUE.get());
        this.dropSelf(CIBlocks.CURTAIN_BROWN.get());
        this.dropSelf(CIBlocks.CURTAIN_CYAN.get());
        this.dropSelf(CIBlocks.CURTAIN_GRAY.get());
        this.dropSelf(CIBlocks.CURTAIN_GREEN.get());
        this.dropSelf(CIBlocks.CURTAIN_LIGHT_BLUE.get());
        this.dropSelf(CIBlocks.CURTAIN_LIGHT_GRAY.get());
        this.dropSelf(CIBlocks.CURTAIN_LIME.get());
        this.dropSelf(CIBlocks.CURTAIN_MAGENTA.get());
        this.dropSelf(CIBlocks.CURTAIN_ORANGE.get());
        this.dropSelf(CIBlocks.CURTAIN_PINK.get());
        this.dropSelf(CIBlocks.CURTAIN_PURPLE.get());
        this.dropSelf(CIBlocks.CURTAIN_RED.get());
        this.dropSelf(CIBlocks.CURTAIN_WHITE.get());
        this.dropSelf(CIBlocks.CURTAIN_YELLOW.get());

        this.dropSelf(CIBlocks.CURTAIN_DEFAULT_BLACK.get());
        this.dropSelf(CIBlocks.CURTAIN_DEFAULT_BLUE.get());
        this.dropSelf(CIBlocks.CURTAIN_DEFAULT_BROWN.get());
        this.dropSelf(CIBlocks.CURTAIN_DEFAULT_CYAN.get());
        this.dropSelf(CIBlocks.CURTAIN_DEFAULT_GRAY.get());
        this.dropSelf(CIBlocks.CURTAIN_DEFAULT_GREEN.get());
        this.dropSelf(CIBlocks.CURTAIN_DEFAULT_LIGHT_BLUE.get());
        this.dropSelf(CIBlocks.CURTAIN_DEFAULT_LIGHT_GRAY.get());
        this.dropSelf(CIBlocks.CURTAIN_DEFAULT_LIME.get());
        this.dropSelf(CIBlocks.CURTAIN_DEFAULT_MAGENTA.get());
        this.dropSelf(CIBlocks.CURTAIN_DEFAULT_ORANGE.get());
        this.dropSelf(CIBlocks.CURTAIN_DEFAULT_PINK.get());
        this.dropSelf(CIBlocks.CURTAIN_DEFAULT_PURPLE.get());
        this.dropSelf(CIBlocks.CURTAIN_DEFAULT_RED.get());
        this.dropSelf(CIBlocks.CURTAIN_DEFAULT_WHITE.get());
        this.dropSelf(CIBlocks.CURTAIN_DEFAULT_YELLOW.get());

        this.dropSelf(CIBlocks.CURTAIN_BEADED_BLACK.get());
        this.dropSelf(CIBlocks.CURTAIN_BEADED_BLUE.get());
        this.dropSelf(CIBlocks.CURTAIN_BEADED_BROWN.get());
        this.dropSelf(CIBlocks.CURTAIN_BEADED_CYAN.get());
        this.dropSelf(CIBlocks.CURTAIN_BEADED_GRAY.get());
        this.dropSelf(CIBlocks.CURTAIN_BEADED_GREEN.get());
        this.dropSelf(CIBlocks.CURTAIN_BEADED_LIGHT_BLUE.get());
        this.dropSelf(CIBlocks.CURTAIN_BEADED_LIGHT_GRAY.get());
        this.dropSelf(CIBlocks.CURTAIN_BEADED_LIME.get());
        this.dropSelf(CIBlocks.CURTAIN_BEADED_MAGENTA.get());
        this.dropSelf(CIBlocks.CURTAIN_BEADED_ORANGE.get());
        this.dropSelf(CIBlocks.CURTAIN_BEADED_PINK.get());
        this.dropSelf(CIBlocks.CURTAIN_BEADED_PURPLE.get());
        this.dropSelf(CIBlocks.CURTAIN_BEADED_RED.get());
        this.dropSelf(CIBlocks.CURTAIN_BEADED_WHITE.get());
        this.dropSelf(CIBlocks.CURTAIN_BEADED_YELLOW.get());

        this.dropSelf(CIBlocks.CURTAIN_BLINDS_BLACK.get());
        this.dropSelf(CIBlocks.CURTAIN_BLINDS_BLUE.get());
        this.dropSelf(CIBlocks.CURTAIN_BLINDS_BROWN.get());
        this.dropSelf(CIBlocks.CURTAIN_BLINDS_CYAN.get());
        this.dropSelf(CIBlocks.CURTAIN_BLINDS_GRAY.get());
        this.dropSelf(CIBlocks.CURTAIN_BLINDS_GREEN.get());
        this.dropSelf(CIBlocks.CURTAIN_BLINDS_LIGHT_BLUE.get());
        this.dropSelf(CIBlocks.CURTAIN_BLINDS_LIGHT_GRAY.get());
        this.dropSelf(CIBlocks.CURTAIN_BLINDS_LIME.get());
        this.dropSelf(CIBlocks.CURTAIN_BLINDS_MAGENTA.get());
        this.dropSelf(CIBlocks.CURTAIN_BLINDS_ORANGE.get());
        this.dropSelf(CIBlocks.CURTAIN_BLINDS_PINK.get());
        this.dropSelf(CIBlocks.CURTAIN_BLINDS_PURPLE.get());
        this.dropSelf(CIBlocks.CURTAIN_BLINDS_RED.get());
        this.dropSelf(CIBlocks.CURTAIN_BLINDS_WHITE.get());
        this.dropSelf(CIBlocks.CURTAIN_BLINDS_YELLOW.get());
        //loot tables end here
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return CIBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

}
