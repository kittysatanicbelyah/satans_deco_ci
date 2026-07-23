package net.satan.deco_ci.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;

import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import net.satan.deco_ci.datagen.util.CISupGen;
import net.satan.deco_ci.register.CIBlocks;
import net.satan.deco_ci.register.CITags;
import net.satan.deco_ci.satans_deco_ci;

import java.util.function.Consumer;

public class CIRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public CIRecipeProvider(PackOutput packOutput) {
        super(packOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> recipe) {

        edgeTrimMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_BLACK.get(), CIBlocks.CURTAIN_DEFAULT_BLACK.get(), Items.BLACK_DYE, Items.WHITE_DYE);
        edgeTrimMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_GRAY.get(), CIBlocks.CURTAIN_DEFAULT_GRAY.get(), Items.GRAY_DYE, Items.LIGHT_GRAY_DYE);
        edgeTrimMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_LIGHT_GRAY.get(), CIBlocks.CURTAIN_DEFAULT_LIGHT_GRAY.get(), Items.LIGHT_GRAY_DYE, Items.GRAY_DYE);
        edgeTrimMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_WHITE.get(), CIBlocks.CURTAIN_DEFAULT_WHITE.get(), Items.WHITE_DYE, Items.BLACK_DYE);
        edgeTrimMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_RED.get(), CIBlocks.CURTAIN_DEFAULT_RED.get(), Items.RED_DYE, Items.CYAN_DYE);
        edgeTrimMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_BROWN.get(), CIBlocks.CURTAIN_DEFAULT_BROWN.get(), Items.BROWN_DYE, Items.BROWN_DYE);
        edgeTrimMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_ORANGE.get(), CIBlocks.CURTAIN_DEFAULT_ORANGE.get(), Items.ORANGE_DYE, Items.PURPLE_DYE);
        edgeTrimMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_YELLOW.get(), CIBlocks.CURTAIN_DEFAULT_YELLOW.get(), Items.YELLOW_DYE, Items.BLUE_DYE);
        edgeTrimMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_LIME.get(), CIBlocks.CURTAIN_DEFAULT_LIME.get(), Items.LIME_DYE, Items.PINK_DYE);
        edgeTrimMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_GREEN.get(), CIBlocks.CURTAIN_DEFAULT_GREEN.get(), Items.GREEN_DYE, Items.MAGENTA_DYE);
        edgeTrimMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_CYAN.get(), CIBlocks.CURTAIN_DEFAULT_CYAN.get(), Items.CYAN_DYE, Items.RED_DYE);
        edgeTrimMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_LIGHT_BLUE.get(), CIBlocks.CURTAIN_DEFAULT_LIGHT_BLUE.get(), Items.LIGHT_BLUE_DYE, Items.BROWN_DYE);
        edgeTrimMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_BLUE.get(), CIBlocks.CURTAIN_DEFAULT_BLUE.get(), Items.BLUE_DYE, Items.YELLOW_DYE);
        edgeTrimMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_PURPLE.get(), CIBlocks.CURTAIN_DEFAULT_PURPLE.get(), Items.PURPLE_DYE, Items.ORANGE_DYE);
        edgeTrimMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_MAGENTA.get(), CIBlocks.CURTAIN_DEFAULT_MAGENTA.get(), Items.MAGENTA_DYE, Items.GREEN_DYE);
        edgeTrimMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_PINK.get(), CIBlocks.CURTAIN_DEFAULT_PINK.get(), Items.PINK_DYE, Items.LIME_DYE);

        defaultMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_DEFAULT_BLACK.get(), Blocks.BLACK_WOOL, Items.BLACK_DYE);
        defaultMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_DEFAULT_GRAY.get(), Blocks.GRAY_WOOL, Items.GRAY_DYE);
        defaultMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_DEFAULT_LIGHT_GRAY.get(), Blocks.LIGHT_GRAY_WOOL, Items.LIGHT_GRAY_DYE);
        defaultMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_DEFAULT_WHITE.get(), Blocks.WHITE_WOOL, Items.WHITE_DYE);
        defaultMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_DEFAULT_RED.get(), Blocks.RED_WOOL, Items.RED_DYE);
        defaultMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_DEFAULT_BROWN.get(), Blocks.BROWN_WOOL, Items.BROWN_DYE);
        defaultMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_DEFAULT_ORANGE.get(), Blocks.ORANGE_WOOL, Items.ORANGE_DYE);
        defaultMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_DEFAULT_YELLOW.get(), Blocks.YELLOW_WOOL, Items.YELLOW_DYE);
        defaultMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_DEFAULT_LIME.get(), Blocks.LIME_WOOL, Items.LIME_DYE);
        defaultMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_DEFAULT_GREEN.get(), Blocks.GREEN_WOOL, Items.GREEN_DYE);
        defaultMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_DEFAULT_CYAN.get(), Blocks.CYAN_WOOL, Items.CYAN_DYE);
        defaultMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_DEFAULT_LIGHT_BLUE.get(), Blocks.LIGHT_BLUE_WOOL, Items.LIGHT_BLUE_DYE);
        defaultMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_DEFAULT_BLUE.get(), Blocks.BLUE_WOOL, Items.BLUE_DYE);
        defaultMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_DEFAULT_PURPLE.get(), Blocks.PURPLE_WOOL, Items.PURPLE_DYE);
        defaultMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_DEFAULT_MAGENTA.get(), Blocks.MAGENTA_WOOL, Items.MAGENTA_DYE);
        defaultMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_DEFAULT_PINK.get(), Blocks.PINK_WOOL, Items.PINK_DYE);

        blindsMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_BLINDS_BLACK.get(), Blocks.BLACK_WOOL, Items.BLACK_DYE, Blocks.WHITE_WOOL);
        blindsMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_BLINDS_GRAY.get(), Blocks.GRAY_WOOL, Items.GRAY_DYE, Blocks.LIGHT_GRAY_WOOL);
        blindsMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_BLINDS_LIGHT_GRAY.get(), Blocks.LIGHT_GRAY_WOOL, Items.LIGHT_GRAY_DYE, Blocks.GRAY_WOOL);
        blindsMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_BLINDS_WHITE.get(), Blocks.WHITE_WOOL, Items.WHITE_DYE, Blocks.BLACK_WOOL);
        blindsMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_BLINDS_RED.get(), Blocks.RED_WOOL, Items.RED_DYE, Blocks.CYAN_WOOL);
        blindsMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_BLINDS_BROWN.get(), Blocks.BROWN_WOOL, Items.BROWN_DYE, Blocks.LIGHT_BLUE_WOOL);
        blindsMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_BLINDS_ORANGE.get(), Blocks.ORANGE_WOOL, Items.ORANGE_DYE, Blocks.PURPLE_WOOL);
        blindsMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_BLINDS_YELLOW.get(), Blocks.YELLOW_WOOL, Items.YELLOW_DYE, Blocks.BLUE_WOOL);
        blindsMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_BLINDS_LIME.get(), Blocks.LIME_WOOL, Items.LIME_DYE, Blocks.PINK_WOOL);
        blindsMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_BLINDS_GREEN.get(), Blocks.GREEN_WOOL, Items.GREEN_DYE, Blocks.MAGENTA_WOOL);
        blindsMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_BLINDS_CYAN.get(), Blocks.CYAN_WOOL, Items.CYAN_DYE, Blocks.RED_WOOL);
        blindsMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_BLINDS_LIGHT_BLUE.get(), Blocks.LIGHT_BLUE_WOOL, Items.LIGHT_BLUE_DYE, Blocks.BROWN_WOOL);
        blindsMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_BLINDS_BLUE.get(), Blocks.BLUE_WOOL, Items.BLUE_DYE, Blocks.YELLOW_WOOL);
        blindsMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_BLINDS_PURPLE.get(), Blocks.PURPLE_WOOL, Items.PURPLE_DYE, Blocks.ORANGE_WOOL);
        blindsMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_BLINDS_MAGENTA.get(), Blocks.MAGENTA_WOOL, Items.MAGENTA_DYE, Blocks.GREEN_WOOL);
        blindsMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_BLINDS_PINK.get(), Blocks.PINK_WOOL, Items.PINK_DYE, Blocks.LIME_WOOL);

        beadedMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_BEADED_BLACK.get(), Blocks.BLACK_WOOL, Items.BLACK_DYE);
        beadedMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_BEADED_GRAY.get(), Blocks.GRAY_WOOL, Items.GRAY_DYE);
        beadedMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_BEADED_LIGHT_GRAY.get(), Blocks.LIGHT_GRAY_WOOL, Items.LIGHT_GRAY_DYE);
        beadedMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_BEADED_WHITE.get(), Blocks.WHITE_WOOL, Items.WHITE_DYE);
        beadedMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_BEADED_RED.get(), Blocks.RED_WOOL, Items.RED_DYE);
        beadedMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_BEADED_BROWN.get(), Blocks.BROWN_WOOL, Items.BROWN_DYE);
        beadedMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_BEADED_ORANGE.get(), Blocks.ORANGE_WOOL, Items.ORANGE_DYE);
        beadedMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_BEADED_YELLOW.get(), Blocks.YELLOW_WOOL, Items.YELLOW_DYE);
        beadedMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_BEADED_LIME.get(), Blocks.LIME_WOOL, Items.LIME_DYE);
        beadedMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_BEADED_GREEN.get(), Blocks.GREEN_WOOL, Items.GREEN_DYE);
        beadedMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_BEADED_CYAN.get(), Blocks.CYAN_WOOL, Items.CYAN_DYE);
        beadedMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_BEADED_LIGHT_BLUE.get(), Blocks.LIGHT_BLUE_WOOL, Items.LIGHT_BLUE_DYE);
        beadedMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_BEADED_BLUE.get(), Blocks.BLUE_WOOL, Items.BLUE_DYE);
        beadedMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_BEADED_PURPLE.get(), Blocks.PURPLE_WOOL, Items.PURPLE_DYE);
        beadedMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_BEADED_MAGENTA.get(), Blocks.MAGENTA_WOOL, Items.MAGENTA_DYE);
        beadedMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_BEADED_PINK.get(), Blocks.PINK_WOOL, Items.PINK_DYE);

        //pelmets
        SolidWoodMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_SOLID_ACACIA.get(), Blocks.ACACIA_SLAB);
        SolidWoodMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_SOLID_BAMBOO.get(), Blocks.BAMBOO_SLAB);
        SolidWoodMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_SOLID_OAK.get(), Blocks.OAK_SLAB);
        SolidWoodMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_SOLID_DARK_OAK.get(), Blocks.DARK_OAK_SLAB);
        SolidWoodMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_SOLID_BIRCH.get(), Blocks.BIRCH_SLAB);
        SolidWoodMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_SOLID_SPRUCE.get(), Blocks.SPRUCE_SLAB);
        SolidWoodMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_SOLID_CRIMSON.get(), Blocks.CRIMSON_SLAB);
        SolidWoodMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_SOLID_WARPED.get(), Blocks.WARPED_SLAB);
        SolidWoodMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_SOLID_JUNGLE.get(), Blocks.JUNGLE_SLAB);

        CarvedMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_CARVED_ACACIA.get(), CIBlocks.PELMET_SOLID_ACACIA.get());
        CarvedMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_CARVED_BAMBOO.get(), CIBlocks.PELMET_SOLID_BAMBOO.get());
        CarvedMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_CARVED_OAK.get(), CIBlocks.PELMET_SOLID_OAK.get());
        CarvedMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_CARVED_DARK_OAK.get(), CIBlocks.PELMET_SOLID_DARK_OAK.get());
        CarvedMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_CARVED_BIRCH.get(), CIBlocks.PELMET_SOLID_BIRCH.get());
        CarvedMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_CARVED_SPRUCE.get(), CIBlocks.PELMET_SOLID_SPRUCE.get());
        CarvedMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_CARVED_CRIMSON.get(), CIBlocks.PELMET_SOLID_CRIMSON.get());
        CarvedMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_CARVED_WARPED.get(), CIBlocks.PELMET_SOLID_WARPED.get());
        CarvedMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_CARVED_JUNGLE.get(), CIBlocks.PELMET_SOLID_JUNGLE.get());

        SolidWoolMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_SOLID_BLACK.get(), Items.BLACK_CARPET, Items.BLACK_DYE);
        SolidWoolMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_SOLID_GRAY.get(), Items.GRAY_CARPET, Items.GRAY_DYE);
        SolidWoolMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_SOLID_LIGHT_GRAY.get(), Items.LIGHT_GRAY_CARPET, Items.LIGHT_GRAY_DYE);
        SolidWoolMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_SOLID_WHITE.get(), Items.WHITE_CARPET, Items.WHITE_DYE);
        SolidWoolMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_SOLID_RED.get(), Items.RED_CARPET, Items.RED_DYE);
        SolidWoolMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_SOLID_BROWN.get(), Items.BROWN_CARPET, Items.BROWN_DYE);
        SolidWoolMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_SOLID_ORANGE.get(), Items.ORANGE_CARPET, Items.ORANGE_DYE);
        SolidWoolMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_SOLID_YELLOW.get(), Items.YELLOW_CARPET, Items.YELLOW_DYE);
        SolidWoolMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_SOLID_LIME.get(), Items.LIME_CARPET, Items.LIME_DYE);
        SolidWoolMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_SOLID_GREEN.get(), Items.GREEN_CARPET, Items.GREEN_DYE);
        SolidWoolMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_SOLID_CYAN.get(), Items.CYAN_CARPET, Items.CYAN_DYE);
        SolidWoolMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_SOLID_LIGHT_BLUE.get(), Items.LIGHT_BLUE_CARPET, Items.LIGHT_BLUE_DYE);
        SolidWoolMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_SOLID_BLUE.get(), Items.BLUE_CARPET, Items.BLUE_DYE);
        SolidWoolMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_SOLID_PURPLE.get(), Items.PURPLE_CARPET, Items.PURPLE_DYE);
        SolidWoolMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_SOLID_MAGENTA.get(), Items.MAGENTA_CARPET, Items.MAGENTA_DYE);
        SolidWoolMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_SOLID_PINK.get(), Items.PINK_CARPET, Items.PINK_DYE);

        SoftMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_SOFT_BLACK.get(), Items.BLACK_CARPET, Items.BLACK_DYE);
        SoftMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_SOFT_GRAY.get(), Items.GRAY_CARPET, Items.GRAY_DYE);
        SoftMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_SOFT_LIGHT_GRAY.get(), Items.LIGHT_GRAY_CARPET, Items.LIGHT_GRAY_DYE);
        SoftMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_SOFT_WHITE.get(), Items.WHITE_CARPET, Items.WHITE_DYE);
        SoftMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_SOFT_RED.get(), Items.RED_CARPET, Items.RED_DYE);
        SoftMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_SOFT_BROWN.get(), Items.BROWN_CARPET, Items.BROWN_DYE);
        SoftMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_SOFT_ORANGE.get(), Items.ORANGE_CARPET, Items.ORANGE_DYE);
        SoftMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_SOFT_YELLOW.get(), Items.YELLOW_CARPET, Items.YELLOW_DYE);
        SoftMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_SOFT_LIME.get(), Items.LIME_CARPET, Items.LIME_DYE);
        SoftMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_SOFT_GREEN.get(), Items.GREEN_CARPET, Items.GREEN_DYE);
        SoftMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_SOFT_CYAN.get(), Items.CYAN_CARPET, Items.CYAN_DYE);
        SoftMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_SOFT_LIGHT_BLUE.get(), Items.LIGHT_BLUE_CARPET, Items.LIGHT_BLUE_DYE);
        SoftMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_SOFT_BLUE.get(), Items.BLUE_CARPET, Items.BLUE_DYE);
        SoftMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_SOFT_PURPLE.get(), Items.PURPLE_CARPET, Items.PURPLE_DYE);
        SoftMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_SOFT_MAGENTA.get(), Items.MAGENTA_CARPET, Items.MAGENTA_DYE);
        SoftMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_SOFT_PINK.get(), Items.PINK_CARPET, Items.PINK_DYE);
        
        OrnateMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_ORNATE_GOLD_BLACK.get(), CIBlocks.PELMET_SOFT_BLACK.get(), Items.GOLD_NUGGET, Items.BLACK_DYE);
        OrnateMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_ORNATE_GOLD_GRAY.get(), CIBlocks.PELMET_SOFT_GRAY.get(), Items.GOLD_NUGGET, Items.GRAY_DYE);
        OrnateMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_ORNATE_GOLD_LIGHT_GRAY.get(), CIBlocks.PELMET_SOFT_LIGHT_GRAY.get(), Items.GOLD_NUGGET, Items.LIGHT_GRAY_DYE);
        OrnateMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_ORNATE_GOLD_WHITE.get(), CIBlocks.PELMET_SOFT_WHITE.get(), Items.GOLD_NUGGET, Items.WHITE_DYE);
        OrnateMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_ORNATE_GOLD_RED.get(), CIBlocks.PELMET_SOFT_RED.get(), Items.GOLD_NUGGET, Items.RED_DYE);
        OrnateMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_ORNATE_GOLD_BROWN.get(), CIBlocks.PELMET_SOFT_BROWN.get(), Items.GOLD_NUGGET, Items.BROWN_DYE);
        OrnateMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_ORNATE_GOLD_ORANGE.get(), CIBlocks.PELMET_SOFT_ORANGE.get(), Items.GOLD_NUGGET, Items.ORANGE_DYE);
        OrnateMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_ORNATE_GOLD_YELLOW.get(), CIBlocks.PELMET_SOFT_YELLOW.get(), Items.GOLD_NUGGET, Items.YELLOW_DYE);
        OrnateMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_ORNATE_GOLD_LIME.get(), CIBlocks.PELMET_SOFT_LIME.get(), Items.GOLD_NUGGET, Items.LIME_DYE);
        OrnateMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_ORNATE_GOLD_GREEN.get(), CIBlocks.PELMET_SOFT_GREEN.get(), Items.GOLD_NUGGET, Items.GREEN_DYE);
        OrnateMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_ORNATE_GOLD_CYAN.get(), CIBlocks.PELMET_SOFT_CYAN.get(), Items.GOLD_NUGGET, Items.CYAN_DYE);
        OrnateMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_ORNATE_GOLD_LIGHT_BLUE.get(), CIBlocks.PELMET_SOFT_LIGHT_BLUE.get(), Items.GOLD_NUGGET, Items.LIGHT_BLUE_DYE);
        OrnateMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_ORNATE_GOLD_BLUE.get(), CIBlocks.PELMET_SOFT_BLUE.get(), Items.GOLD_NUGGET, Items.BLUE_DYE);
        OrnateMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_ORNATE_GOLD_PURPLE.get(), CIBlocks.PELMET_SOFT_PURPLE.get(), Items.GOLD_NUGGET, Items.PURPLE_DYE);
        OrnateMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_ORNATE_GOLD_MAGENTA.get(), CIBlocks.PELMET_SOFT_MAGENTA.get(), Items.GOLD_NUGGET, Items.MAGENTA_DYE);
        OrnateMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_ORNATE_GOLD_PINK.get(), CIBlocks.PELMET_SOFT_PINK.get(), Items.GOLD_NUGGET, Items.PINK_DYE);
        
        OrnateTinselMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_ORNATE_TINSEL_GOLD_BLACK.get(), CIBlocks.PELMET_SOFT_BLACK.get(), Items.GOLD_NUGGET, Items.BLACK_DYE, CIBlocks.PELMET_ORNATE_GOLD_BLACK.get());
        OrnateTinselMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_ORNATE_TINSEL_GOLD_GRAY.get(), CIBlocks.PELMET_SOFT_GRAY.get(), Items.GOLD_NUGGET, Items.GRAY_DYE, CIBlocks.PELMET_ORNATE_GOLD_GRAY.get());
        OrnateTinselMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_ORNATE_TINSEL_GOLD_LIGHT_GRAY.get(), CIBlocks.PELMET_SOFT_LIGHT_GRAY.get(), Items.GOLD_NUGGET, Items.LIGHT_GRAY_DYE, CIBlocks.PELMET_ORNATE_GOLD_LIGHT_GRAY.get());
        OrnateTinselMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_ORNATE_TINSEL_GOLD_WHITE.get(), CIBlocks.PELMET_SOFT_WHITE.get(), Items.GOLD_NUGGET, Items.WHITE_DYE, CIBlocks.PELMET_ORNATE_GOLD_WHITE.get());
        OrnateTinselMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_ORNATE_TINSEL_GOLD_RED.get(), CIBlocks.PELMET_SOFT_RED.get(), Items.GOLD_NUGGET, Items.RED_DYE, CIBlocks.PELMET_ORNATE_GOLD_RED.get());
        OrnateTinselMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_ORNATE_TINSEL_GOLD_BROWN.get(), CIBlocks.PELMET_SOFT_BROWN.get(), Items.GOLD_NUGGET, Items.BROWN_DYE, CIBlocks.PELMET_ORNATE_GOLD_BROWN.get());
        OrnateTinselMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_ORNATE_TINSEL_GOLD_ORANGE.get(), CIBlocks.PELMET_SOFT_ORANGE.get(), Items.GOLD_NUGGET, Items.ORANGE_DYE, CIBlocks.PELMET_ORNATE_GOLD_ORANGE.get());
        OrnateTinselMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_ORNATE_TINSEL_GOLD_YELLOW.get(), CIBlocks.PELMET_SOFT_YELLOW.get(), Items.GOLD_NUGGET, Items.YELLOW_DYE, CIBlocks.PELMET_ORNATE_GOLD_YELLOW.get());
        OrnateTinselMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_ORNATE_TINSEL_GOLD_LIME.get(), CIBlocks.PELMET_SOFT_LIME.get(), Items.GOLD_NUGGET, Items.LIME_DYE, CIBlocks.PELMET_ORNATE_GOLD_LIME.get());
        OrnateTinselMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_ORNATE_TINSEL_GOLD_GREEN.get(), CIBlocks.PELMET_SOFT_GREEN.get(), Items.GOLD_NUGGET, Items.GREEN_DYE, CIBlocks.PELMET_ORNATE_GOLD_GREEN.get());
        OrnateTinselMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_ORNATE_TINSEL_GOLD_CYAN.get(), CIBlocks.PELMET_SOFT_CYAN.get(), Items.GOLD_NUGGET, Items.CYAN_DYE, CIBlocks.PELMET_ORNATE_GOLD_CYAN.get());
        OrnateTinselMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_ORNATE_TINSEL_GOLD_LIGHT_BLUE.get(), CIBlocks.PELMET_SOFT_LIGHT_BLUE.get(), Items.GOLD_NUGGET, Items.LIGHT_BLUE_DYE, CIBlocks.PELMET_ORNATE_GOLD_LIGHT_BLUE.get());
        OrnateTinselMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_ORNATE_TINSEL_GOLD_BLUE.get(), CIBlocks.PELMET_SOFT_BLUE.get(), Items.GOLD_NUGGET, Items.BLUE_DYE, CIBlocks.PELMET_ORNATE_GOLD_BLUE.get());
        OrnateTinselMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_ORNATE_TINSEL_GOLD_PURPLE.get(), CIBlocks.PELMET_SOFT_PURPLE.get(), Items.GOLD_NUGGET, Items.PURPLE_DYE, CIBlocks.PELMET_ORNATE_GOLD_PURPLE.get());
        OrnateTinselMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_ORNATE_TINSEL_GOLD_MAGENTA.get(), CIBlocks.PELMET_SOFT_MAGENTA.get(), Items.GOLD_NUGGET, Items.MAGENTA_DYE, CIBlocks.PELMET_ORNATE_GOLD_MAGENTA.get());
        OrnateTinselMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.PELMET_ORNATE_TINSEL_GOLD_PINK.get(), CIBlocks.PELMET_SOFT_PINK.get(), Items.GOLD_NUGGET, Items.PINK_DYE, CIBlocks.PELMET_ORNATE_GOLD_PINK.get());

    }

    // recipe patterns

    protected static void SolidWoolMaking (Consumer<FinishedRecipe> recipe, RecipeCategory category, ItemLike result,
                                          ItemLike ingredient, ItemLike dye) {
            ShapedRecipeBuilder.shaped(category, result, 2).pattern("A").pattern("B").pattern("A")
                    .define('A', CITags.CommonItems.WOODEN_RODS).define('B', ingredient).unlockedBy(getHasName(ingredient), has(ingredient))
                    .save(recipe);

            ShapelessRecipeBuilder.shapeless(category, result, 1).requires(CITags.CIItems.SOLID_WOOL_PELMETS).requires(dye)
                    .unlockedBy(getHasName(ingredient), has(ingredient))
                    .save(recipe, satans_deco_ci.MODID + ":" + "dyed_to_" + getItemName(result));
    }

    protected static void SolidWoodMaking (Consumer<FinishedRecipe> recipe, RecipeCategory category, ItemLike result,
                                       ItemLike ingredient) {
            ShapelessRecipeBuilder.shapeless(category, result, 4).requires(ingredient)
                    .unlockedBy(getHasName(ingredient), has(ingredient))
                    .save(recipe);
    }

    protected static void CarvedMaking (Consumer<FinishedRecipe> recipe, RecipeCategory category, ItemLike result,
                                           ItemLike ingredient) {
        ShapedRecipeBuilder.shaped(category, result, 2).pattern("AA")
                .define('A', ingredient).unlockedBy(getHasName(ingredient), has(ingredient))
                .save(recipe);
    }

    protected static void SoftMaking (Consumer<FinishedRecipe> recipe, RecipeCategory category, ItemLike result,
                                           ItemLike ingredient, ItemLike dye) {
        ShapedRecipeBuilder.shaped(category, result, 2).pattern("A").pattern("B")
                .define('A', CITags.CommonItems.WOODEN_RODS).define('B', ingredient).unlockedBy(getHasName(ingredient), has(ingredient))
                .save(recipe);

        ShapelessRecipeBuilder.shapeless(category, result, 1).requires(CITags.CIItems.SOFT_PELMETS).requires(dye)
                .unlockedBy(getHasName(ingredient), has(ingredient))
                .save(recipe, satans_deco_ci.MODID + ":" + "dyed_to_" + getItemName(result));
    }

    protected static void OrnateMaking (Consumer<FinishedRecipe> recipe, RecipeCategory category, ItemLike result,
                                      ItemLike ingredient, ItemLike ingredient1, ItemLike dye) {
        ShapedRecipeBuilder.shaped(category, result, 1).pattern("ABA")
                .define('A', ingredient1).define('B', ingredient).unlockedBy(getHasName(ingredient), has(ingredient))
                .save(recipe);

        ShapelessRecipeBuilder.shapeless(category, result, 1).requires(CISupGen.ornamentTag(result.asItem().toString(), false))
                .requires(dye)
                .unlockedBy(getHasName(ingredient), has(ingredient))
                .save(recipe, satans_deco_ci.MODID + ":" + "dyed_to_" + getItemName(result));
    }

    protected static void OrnateTinselMaking (Consumer<FinishedRecipe> recipe, RecipeCategory category, ItemLike result,
                                        ItemLike ingredient, ItemLike ingredient1, ItemLike dye, ItemLike ingredient2) {
        ShapedRecipeBuilder.shaped(category, result, 1).pattern("ABA").pattern(" C ")
                .define('A', ingredient1).define('B', ingredient).define('C', CITags.CommonItems.STRINGS)
                .unlockedBy(getHasName(ingredient), has(ingredient))
                .save(recipe);

        ShapedRecipeBuilder.shaped(category, result, 1).pattern("A").pattern("B")
                .define('A', ingredient2).define('B', CITags.CommonItems.STRINGS).unlockedBy(getHasName(ingredient), has(ingredient))
                .save(recipe, satans_deco_ci.MODID + ":" + "added_tinsels_" + getItemName(result));

        ShapelessRecipeBuilder.shapeless(category, result, 1).requires(CISupGen.ornamentTag(result.asItem().toString(), true))
                .requires(dye)
                .unlockedBy(getHasName(ingredient), has(ingredient))
                .save(recipe, satans_deco_ci.MODID + ":" + "dyed_to_" + getItemName(result));
    }

    protected static void edgeTrimMaking (Consumer<FinishedRecipe> recipe, RecipeCategory category, ItemLike result,
                                          ItemLike ingredient, ItemLike dye, ItemLike adye) {
        ShapedRecipeBuilder.shaped(category, result, 1).pattern("ABA")
                .define('A', adye).define('B', ingredient).unlockedBy(getHasName(ingredient), has(ingredient))
                .save(recipe);

        ShapelessRecipeBuilder.shapeless(category, result, 1).requires(CITags.CIItems.EDGE_TRIM_CURTAINS).requires(dye)
                .unlockedBy(getHasName(ingredient), has(ingredient))
                .save(recipe, satans_deco_ci.MODID +":"+ "dyed_to_" + getItemName(result));
    }

    protected static void defaultMaking (Consumer<FinishedRecipe> recipe, RecipeCategory category, ItemLike result,
                                          ItemLike ingredient, ItemLike dye) {
        ShapedRecipeBuilder.shaped(category, result, 6).pattern("A").pattern("B")
                .define('A', CITags.CommonItems.WOODEN_RODS).define('B', ingredient).unlockedBy(getHasName(Blocks.WHITE_WOOL), has(Blocks.WHITE_WOOL))
                .save(recipe);

        ShapelessRecipeBuilder.shapeless(category, result, 1).requires(CITags.CIItems.DEFAULT_CURTAINS).requires(dye)
                .unlockedBy(getHasName(ingredient), has(ingredient))
                .save(recipe, satans_deco_ci.MODID +":"+ "dyed_to_" + getItemName(result));
    }

    protected static void blindsMaking (Consumer<FinishedRecipe> recipe, RecipeCategory category, ItemLike result,
                                         ItemLike ingredient, ItemLike dye, ItemLike aingredient) {
        ShapedRecipeBuilder.shaped(category, result, 12).pattern("CAC").pattern("B B").pattern("CAC")
                .define('A', ItemTags.WOODEN_SLABS).define('B', aingredient).define('C', ingredient).unlockedBy(getHasName(Blocks.WHITE_WOOL), has(Blocks.WHITE_WOOL))
                .save(recipe);

        ShapelessRecipeBuilder.shapeless(category, result, 1).requires(CITags.CIItems.BLINDS_CURTAINS).requires(dye)
                .unlockedBy(getHasName(ingredient), has(ingredient))
                .save(recipe, satans_deco_ci.MODID +":"+ "dyed_to_" + getItemName(result));
    }

    protected static void beadedMaking (Consumer<FinishedRecipe> recipe, RecipeCategory category, ItemLike result,
                                         ItemLike ingredient, ItemLike dye) {
        ShapedRecipeBuilder.shaped(category, result, 6).pattern("A").pattern("B").pattern("C")
                .define('A', CITags.CommonItems.WOODEN_RODS).define('B', CITags.CommonItems.STRINGS).define('C', ingredient)
                .unlockedBy(getHasName(Blocks.WHITE_WOOL), has(Blocks.WHITE_WOOL))
                .save(recipe);

        ShapelessRecipeBuilder.shapeless(category, result, 1).requires(CITags.CIItems.BEADED_CURTAINS).requires(dye)
                .unlockedBy(getHasName(ingredient), has(ingredient))
                .save(recipe, satans_deco_ci.MODID +":"+ "dyed_to_" + getItemName(result));
    }
}
