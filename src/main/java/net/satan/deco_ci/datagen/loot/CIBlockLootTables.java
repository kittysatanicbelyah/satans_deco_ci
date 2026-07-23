package net.satan.deco_ci.datagen.loot;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import net.satan.deco_ci.register.CIBlocks;

import java.util.Set;

public class CIBlockLootTables extends BlockLootSubProvider {
    public CIBlockLootTables(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
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

        this.dropSelf(CIBlocks.PELMET_SOLID_ACACIA.get());
        this.dropSelf(CIBlocks.PELMET_SOLID_OAK.get());
        this.dropSelf(CIBlocks.PELMET_SOLID_DARK_OAK.get());
        this.dropSelf(CIBlocks.PELMET_SOLID_SPRUCE.get());
        this.dropSelf(CIBlocks.PELMET_SOLID_BAMBOO.get());
        this.dropSelf(CIBlocks.PELMET_SOLID_BIRCH.get());
        this.dropSelf(CIBlocks.PELMET_SOLID_CRIMSON.get());
        this.dropSelf(CIBlocks.PELMET_SOLID_WARPED.get());
        this.dropSelf(CIBlocks.PELMET_SOLID_JUNGLE.get());
        this.dropSelf(CIBlocks.PELMET_SOLID_CHERRY.get());
        this.dropSelf(CIBlocks.PELMET_SOLID_MANGROVE.get());

        this.dropSelf(CIBlocks.PELMET_CARVED_ACACIA.get());
        this.dropSelf(CIBlocks.PELMET_CARVED_OAK.get());
        this.dropSelf(CIBlocks.PELMET_CARVED_DARK_OAK.get());
        this.dropSelf(CIBlocks.PELMET_CARVED_SPRUCE.get());
        this.dropSelf(CIBlocks.PELMET_CARVED_BAMBOO.get());
        this.dropSelf(CIBlocks.PELMET_CARVED_BIRCH.get());
        this.dropSelf(CIBlocks.PELMET_CARVED_CRIMSON.get());
        this.dropSelf(CIBlocks.PELMET_CARVED_WARPED.get());
        this.dropSelf(CIBlocks.PELMET_CARVED_JUNGLE.get());
        this.dropSelf(CIBlocks.PELMET_CARVED_CHERRY.get());
        this.dropSelf(CIBlocks.PELMET_CARVED_MANGROVE.get());

        this.dropSelf(CIBlocks.PELMET_SOLID_BLACK.get());
        this.dropSelf(CIBlocks.PELMET_SOLID_BLUE.get());
        this.dropSelf(CIBlocks.PELMET_SOLID_YELLOW.get());
        this.dropSelf(CIBlocks.PELMET_SOLID_WHITE.get());
        this.dropSelf(CIBlocks.PELMET_SOLID_RED.get());
        this.dropSelf(CIBlocks.PELMET_SOLID_CYAN.get());
        this.dropSelf(CIBlocks.PELMET_SOLID_PINK.get());
        this.dropSelf(CIBlocks.PELMET_SOLID_LIME.get());
        this.dropSelf(CIBlocks.PELMET_SOLID_GREEN.get());
        this.dropSelf(CIBlocks.PELMET_SOLID_MAGENTA.get());
        this.dropSelf(CIBlocks.PELMET_SOLID_PURPLE.get());
        this.dropSelf(CIBlocks.PELMET_SOLID_ORANGE.get());
        this.dropSelf(CIBlocks.PELMET_SOLID_LIGHT_BLUE.get());
        this.dropSelf(CIBlocks.PELMET_SOLID_BROWN.get());
        this.dropSelf(CIBlocks.PELMET_SOLID_GRAY.get());
        this.dropSelf(CIBlocks.PELMET_SOLID_LIGHT_GRAY.get());

        this.dropSelf(CIBlocks.PELMET_SOFT_BLACK.get());
        this.dropSelf(CIBlocks.PELMET_SOFT_BLUE.get());
        this.dropSelf(CIBlocks.PELMET_SOFT_YELLOW.get());
        this.dropSelf(CIBlocks.PELMET_SOFT_WHITE.get());
        this.dropSelf(CIBlocks.PELMET_SOFT_RED.get());
        this.dropSelf(CIBlocks.PELMET_SOFT_CYAN.get());
        this.dropSelf(CIBlocks.PELMET_SOFT_PINK.get());
        this.dropSelf(CIBlocks.PELMET_SOFT_LIME.get());
        this.dropSelf(CIBlocks.PELMET_SOFT_GREEN.get());
        this.dropSelf(CIBlocks.PELMET_SOFT_MAGENTA.get());
        this.dropSelf(CIBlocks.PELMET_SOFT_PURPLE.get());
        this.dropSelf(CIBlocks.PELMET_SOFT_ORANGE.get());
        this.dropSelf(CIBlocks.PELMET_SOFT_LIGHT_BLUE.get());
        this.dropSelf(CIBlocks.PELMET_SOFT_BROWN.get());
        this.dropSelf(CIBlocks.PELMET_SOFT_GRAY.get());
        this.dropSelf(CIBlocks.PELMET_SOFT_LIGHT_GRAY.get());

        this.dropSelf(CIBlocks.PELMET_ORNATE_GOLD_BLACK.get());
        this.dropSelf(CIBlocks.PELMET_ORNATE_GOLD_BLUE.get());
        this.dropSelf(CIBlocks.PELMET_ORNATE_GOLD_YELLOW.get());
        this.dropSelf(CIBlocks.PELMET_ORNATE_GOLD_WHITE.get());
        this.dropSelf(CIBlocks.PELMET_ORNATE_GOLD_RED.get());
        this.dropSelf(CIBlocks.PELMET_ORNATE_GOLD_CYAN.get());
        this.dropSelf(CIBlocks.PELMET_ORNATE_GOLD_PINK.get());
        this.dropSelf(CIBlocks.PELMET_ORNATE_GOLD_LIME.get());
        this.dropSelf(CIBlocks.PELMET_ORNATE_GOLD_GREEN.get());
        this.dropSelf(CIBlocks.PELMET_ORNATE_GOLD_MAGENTA.get());
        this.dropSelf(CIBlocks.PELMET_ORNATE_GOLD_PURPLE.get());
        this.dropSelf(CIBlocks.PELMET_ORNATE_GOLD_ORANGE.get());
        this.dropSelf(CIBlocks.PELMET_ORNATE_GOLD_LIGHT_BLUE.get());
        this.dropSelf(CIBlocks.PELMET_ORNATE_GOLD_BROWN.get());
        this.dropSelf(CIBlocks.PELMET_ORNATE_GOLD_GRAY.get());
        this.dropSelf(CIBlocks.PELMET_ORNATE_GOLD_LIGHT_GRAY.get());

        this.dropSelf(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_BLACK.get());
        this.dropSelf(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_BLUE.get());
        this.dropSelf(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_YELLOW.get());
        this.dropSelf(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_WHITE.get());
        this.dropSelf(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_RED.get());
        this.dropSelf(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_CYAN.get());
        this.dropSelf(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_PINK.get());
        this.dropSelf(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_LIME.get());
        this.dropSelf(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_GREEN.get());
        this.dropSelf(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_MAGENTA.get());
        this.dropSelf(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_PURPLE.get());
        this.dropSelf(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_ORANGE.get());
        this.dropSelf(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_LIGHT_BLUE.get());
        this.dropSelf(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_BROWN.get());
        this.dropSelf(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_GRAY.get());
        this.dropSelf(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_LIGHT_GRAY.get());
        //loot tables end here
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return CIBlocks.BLOCKS.getEntries().stream()
                .map(holder -> (Block) holder.get())
                ::iterator;
    }

}
