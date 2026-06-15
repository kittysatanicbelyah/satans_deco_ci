package net.satan.deco_ci.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
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

        curtainsMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_BLACK.get(), Blocks.BLACK_WOOL, Items.BLACK_DYE);
        curtainsMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_GRAY.get(), Blocks.GRAY_WOOL, Items.GRAY_DYE);
        curtainsMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_LIGHT_GRAY.get(), Blocks.LIGHT_GRAY_WOOL, Items.LIGHT_GRAY_DYE);
        curtainsMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_WHITE.get(), Blocks.WHITE_WOOL, Items.WHITE_DYE);
        curtainsMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_RED.get(), Blocks.RED_WOOL, Items.RED_DYE);
        curtainsMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_BROWN.get(), Blocks.BROWN_WOOL, Items.BROWN_DYE);
        curtainsMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_ORANGE.get(), Blocks.ORANGE_WOOL, Items.ORANGE_DYE);
        curtainsMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_YELLOW.get(), Blocks.YELLOW_WOOL, Items.YELLOW_DYE);
        curtainsMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_LIME.get(), Blocks.LIME_WOOL, Items.LIME_DYE);
        curtainsMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_GREEN.get(), Blocks.GREEN_WOOL, Items.GREEN_DYE);
        curtainsMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_CYAN.get(), Blocks.CYAN_WOOL, Items.CYAN_DYE);
        curtainsMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_LIGHT_BLUE.get(), Blocks.LIGHT_BLUE_WOOL, Items.LIGHT_BLUE_DYE);
        curtainsMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_BLUE.get(), Blocks.BLUE_WOOL, Items.BLUE_DYE);
        curtainsMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_PURPLE.get(), Blocks.PURPLE_WOOL, Items.PURPLE_DYE);
        curtainsMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_MAGENTA.get(), Blocks.MAGENTA_WOOL, Items.MAGENTA_DYE);
        curtainsMaking(recipe, RecipeCategory.DECORATIONS, CIBlocks.CURTAIN_PINK.get(), Blocks.PINK_WOOL, Items.PINK_DYE);
    }
    
    protected static void curtainsMaking (Consumer<FinishedRecipe> recipe, RecipeCategory category, ItemLike result,
                                          ItemLike ingredient, ItemLike dye) {
        ShapedRecipeBuilder.shaped(category, result, 6).pattern("A").pattern("B")
                .define('A', CITags.CommonItems.WOODEN_RODS).define('B', ingredient).unlockedBy(getHasName(Blocks.WHITE_WOOL), has(Blocks.WHITE_WOOL))
                .save(recipe);

        ShapelessRecipeBuilder.shapeless(category, result, 1).requires(CITags.CIItems.CURTAINS).requires(dye)
                .unlockedBy(getHasName(ingredient), has(ingredient))
                .save(recipe, satans_deco_ci.MODID +":"+ "dyed_to_" + getItemName(result));
    }
}
