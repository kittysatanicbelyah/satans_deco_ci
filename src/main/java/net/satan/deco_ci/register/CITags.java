package net.satan.deco_ci.register;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.satan.deco_ci.satans_deco_ci;

public class CITags {
    public static class CIItems {
        public static final TagKey<Item> CURTAINS = tag("curtains");
    private static TagKey<Item> tag(String name) {return ItemTags.create(new ResourceLocation(satans_deco_ci.MODID, name));}
    }

    public static class CommonItems {
        public static final TagKey<Item> WOODEN_RODS = tag("rods/wooden");
        private static TagKey<Item> tag(String name) {return ItemTags.create(new ResourceLocation("c", name));}
    }
}
