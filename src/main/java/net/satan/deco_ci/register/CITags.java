package net.satan.deco_ci.register;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.satan.deco_ci.satans_deco_ci;

public class CITags {
    public static class CIItems {
        public static final TagKey<Item> CURTAINS = tag("curtains");
        public static final TagKey<Item> EDGE_TRIM_CURTAINS = tag("curtains/edge_trims");
        public static final TagKey<Item> BEADED_CURTAINS = tag("curtains/beaded");
        public static final TagKey<Item> BLINDS_CURTAINS = tag("curtains/blinds");
        public static final TagKey<Item> DEFAULT_CURTAINS = tag("curtains/default");

        public static final TagKey<Item> PELMETS = tag("pelmets");
        public static final TagKey<Item> SOLID_PELMETS = tag("pelmets/solids");
        public static final TagKey<Item> CARVED_PELMETS = tag("pelmets/carveds");
        public static final TagKey<Item> SOFT_PELMETS = tag("pelmets/softs");
        public static final TagKey<Item> ORNATE_PELMETS = tag("pelmets/ornates");

        public static final TagKey<Item> SOLID_WOOL_PELMETS = tag("pelmets/solids/wool");
        public static final TagKey<Item> SOLID_WOODEN_PELMETS = tag("pelmets/solids/wood");

        public static final TagKey<Item> ORNATE_TINSEL_PELMETS = tag("pelmets/ornates/tinsel");
        public static final TagKey<Item> ORNATE_NO_TINSEL_PELMETS = tag("pelmets/ornates/no_tinsel");

        public static final TagKey<Item> ORNATE_NO_TINSEL_GOLD_PELMETS = tag("pelmets/ornates/no_tinsel/gold");
        public static final TagKey<Item> ORNATE_TINSEL_GOLD_PELMETS = tag("pelmets/ornates/tinsel/gold");

    private static TagKey<Item> tag(String name) {return ItemTags.create(new ResourceLocation(satans_deco_ci.MODID, name));}
    }

    public static class CIBlocks {
        public static final TagKey<Block> CURTAINS = tag("curtains");
        public static final TagKey<Block> EDGE_TRIM_CURTAINS = tag("curtains/edge_trims");
        public static final TagKey<Block> BEADED_CURTAINS = tag("curtains/beaded");
        public static final TagKey<Block> BLINDS_CURTAINS = tag("curtains/blinds");
        public static final TagKey<Block> DEFAULT_CURTAINS = tag("curtains/default");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(satans_deco_ci.MODID, name));
        }
    }

    public static class CommonItems {
        public static final TagKey<Item> WOODEN_RODS = tag("rods/wooden");
        public static final TagKey<Item> STRINGS = tag("strings");

        private static TagKey<Item> tag(String name) {return ItemTags.create(new ResourceLocation("c", name));}
    }
}
