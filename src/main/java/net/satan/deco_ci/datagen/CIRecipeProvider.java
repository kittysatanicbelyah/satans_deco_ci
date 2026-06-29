package net.satan.deco_ci.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
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
