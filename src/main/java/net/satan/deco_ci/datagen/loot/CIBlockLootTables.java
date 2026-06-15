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

        //loot tables end here
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return CIBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

}
