package net.satan.deco_ci.datagen.util;

import com.google.common.collect.ImmutableMap;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;

import net.minecraftforge.registries.RegistryObject;

import net.satan.deco_ci.register.CITags;
import net.satan.deco_ci.satans_deco_ci;

import java.time.LocalTime;
import java.util.Objects;

public interface CISupGen {
    //for pelmets
    String[] SupportedWood = {"oak", "spruce", "birch", "dark_oak", "jungle", "bamboo", "crimson", "warped", "acacia", "cherry", "mangrove"};
    String[] SupportedColors = {"black", "gray", "red", "green", "blue", "orange", "lime", "brown",
            "light_blue", "pink", "purple", "yellow", "magenta", "cyan", "light_gray", "white"};
    String[] PelmetOrnates = {"gold"};

    ImmutableMap<String, String> COLOR_DICHOTOMY = ImmutableMap.<String, String>builder()
            .put(SupportedColors[0], SupportedColors[15])
            .put(SupportedColors[1], SupportedColors[14])
            .put(SupportedColors[2], SupportedColors[13])
            .put(SupportedColors[3], SupportedColors[12])
            .put(SupportedColors[4], SupportedColors[11])
            .put(SupportedColors[5], SupportedColors[10])
            .put(SupportedColors[6], SupportedColors[9])
            .put(SupportedColors[7], SupportedColors[8])
            .put(SupportedColors[8], SupportedColors[7])
            .put(SupportedColors[9], SupportedColors[6])
            .put(SupportedColors[10], SupportedColors[5])
            .put(SupportedColors[11], SupportedColors[4])
            .put(SupportedColors[12], SupportedColors[3])
            .put(SupportedColors[13], SupportedColors[2])
            .put(SupportedColors[14], SupportedColors[1])
            .put(SupportedColors[15], SupportedColors[0]).build();

    static boolean isWooden(RegistryObject<Block> block) {
       boolean wood = false;
        for (int x=0; x<SupportedWood.length; x++) {
            wood = block.getId().getPath().contains(SupportedWood[x]);
            if (wood) break;
        }
        System.out.println("[" + LocalTime.now() +"] [" + satans_deco_ci.MODID + "/DataGenerator]: " + block.getId().getPath()
                + " isWooden? " + (wood));
        return wood;
    }

    static boolean isWooden(ItemLike block) {
        boolean wood = false;
        for (int x=0; x<SupportedWood.length; x++) {
            wood = block.asItem().toString().contains(SupportedWood[x]);
            if (wood) break;
        }
        System.out.println("[" + LocalTime.now() +"] [" + satans_deco_ci.MODID + "/DataGenerator]: " + block.asItem().toString()
                + " isWooden? " + (wood));
        return wood;
    }

    static boolean isTinsel(ItemLike item){
        return item.asItem().toString().contains("tinsel");
    }

    static ResourceLocation matchTexture(String name, boolean isWooden) {
        ResourceLocation res = new ResourceLocation("block/vine");
        if (isWooden) {
            boolean oak = false;
            for (int x = 0; x < SupportedWood.length; x++) {
                if (name.contains(SupportedWood[x])) {
                    oak = Objects.equals(SupportedWood[x], "oak") && name.contains("dark_oak");

                    if (!oak) {
                        res = new ResourceLocation("block/" + SupportedWood[x] + "_planks");
                        break;
                    }
                }
            }
        } else {
            boolean color = false;
            for (int x = 0; x < SupportedColors.length; x++) {
                if (name.contains(SupportedColors[x])) {
                    color = (Objects.equals(SupportedColors[x], "gray") && name.contains("light_gray"))
                            || (Objects.equals(SupportedColors[x], "blue") && name.contains("light_blue"));

                    if (!color) {
                        res = new ResourceLocation("block/" + SupportedColors[x] + "_wool");
                        break;
                    }
                }
            }
        }
        return res;
    }

    static ResourceLocation matchCurtain(String name, boolean isOrnate) {
        ResourceLocation res = new ResourceLocation("block/vine");
        boolean color = false;
        for (int x = 0; x < SupportedColors.length; x++) {
            if (name.contains(SupportedColors[x])) {
                color = (Objects.equals(SupportedColors[x], "gray") && name.contains("light_gray"))
                        || (Objects.equals(SupportedColors[x], "blue") && name.contains("light_blue"));

                if (!color) {
                    res = isOrnate ? new ResourceLocation(satans_deco_ci.MODID, "block/pelmet_ornate_" + SupportedColors[x])
                            : new ResourceLocation(satans_deco_ci.MODID, "block/curtain_default_" + SupportedColors[x] + "_lower");
                    break;
                }
            }
        }
        return res;
    }

    static ResourceLocation matchOrnament(String name, boolean isMetal) {
        ResourceLocation res = new ResourceLocation("block/vine");
        for(int x = 0; x<PelmetOrnates.length; x++) {
            if (name.contains(PelmetOrnates[x])) {
                res = isMetal ? new ResourceLocation("block/" + PelmetOrnates[x] + "_block")
            : new ResourceLocation( satans_deco_ci.MODID, "block/pelmet_ornate_" + PelmetOrnates[x]);
                break;
            }
        }
        return res;
    }

    static ResourceLocation matchTinsel(String name, boolean doOpposites){
        ResourceLocation res = new ResourceLocation("block/vine");
        boolean color = false;
        for (int x = 0; x < SupportedColors.length; x++) {
            if (name.contains(SupportedColors[x])) {
                color = (Objects.equals(SupportedColors[x], "gray") && name.contains("light_gray"))
                        || (Objects.equals(SupportedColors[x], "blue") && name.contains("light_blue"));

                if (!color) {
                    res = doOpposites ?  new ResourceLocation(satans_deco_ci.MODID, "block/pelmet_ornate_tinsel_" + COLOR_DICHOTOMY.get(SupportedColors[x]))
                : new ResourceLocation(satans_deco_ci.MODID, "block/pelmet_ornate_tinsel_" + SupportedColors[x]);
                    break;
                }
            }
        }
        return res;
    }

    static TagKey<Item> ornamentTag(String name, boolean hasTinsel){
        TagKey<Item> tag = ItemTags.AXES;

        for(int x = 0; x<PelmetOrnates.length; x++) {
            if (name.contains(PelmetOrnates[x])) {
                if (hasTinsel){
                    tag = PelmetOrnates[x].equals("gold") ? CITags.CIItems.ORNATE_TINSEL_GOLD_PELMETS : tag;
                    break;
                } else {
                    tag = PelmetOrnates[x].equals("gold") ? CITags.CIItems.ORNATE_NO_TINSEL_GOLD_PELMETS : tag;
                    break;
                }
            }
        }
        return tag;
    }

}
