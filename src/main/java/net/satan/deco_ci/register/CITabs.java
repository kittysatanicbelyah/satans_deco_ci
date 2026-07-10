package net.satan.deco_ci.register;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.satan.deco_ci.satans_deco_ci;

public class CITabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB_DEFERRED_REGISTER =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, satans_deco_ci.MODID);
//Tabs go here
public static final RegistryObject<CreativeModeTab> PANELS_TAB = CREATIVE_MODE_TAB_DEFERRED_REGISTER.register("curtains_tab",
        () -> CreativeModeTab.builder().icon(() -> new ItemStack(CIBlocks.CURTAIN_BLUE.get()))
                .title(Component.translatable("creativetab.curtains_tab"))
                .displayItems((ItemDisplayParameters, output) -> {
                    output.accept(CIBlocks.CURTAIN_DEFAULT_YELLOW.get());
                    output.accept(CIBlocks.CURTAIN_DEFAULT_WHITE.get());
                    output.accept(CIBlocks.CURTAIN_DEFAULT_RED.get());
                    output.accept(CIBlocks.CURTAIN_DEFAULT_PURPLE.get());
                    output.accept(CIBlocks.CURTAIN_DEFAULT_LIME.get());
                    output.accept(CIBlocks.CURTAIN_DEFAULT_PINK.get());
                    output.accept(CIBlocks.CURTAIN_DEFAULT_ORANGE.get());
                    output.accept(CIBlocks.CURTAIN_DEFAULT_MAGENTA.get());
                    output.accept(CIBlocks.CURTAIN_DEFAULT_LIGHT_GRAY.get());
                    output.accept(CIBlocks.CURTAIN_DEFAULT_LIGHT_BLUE.get());
                    output.accept(CIBlocks.CURTAIN_DEFAULT_GREEN.get());
                    output.accept(CIBlocks.CURTAIN_DEFAULT_GRAY.get());
                    output.accept(CIBlocks.CURTAIN_DEFAULT_CYAN.get());
                    output.accept(CIBlocks.CURTAIN_DEFAULT_BROWN.get());
                    output.accept(CIBlocks.CURTAIN_DEFAULT_BLUE.get());
                    output.accept(CIBlocks.CURTAIN_DEFAULT_BLACK.get());

                    output.accept(CIBlocks.CURTAIN_YELLOW.get());
                    output.accept(CIBlocks.CURTAIN_WHITE.get());
                    output.accept(CIBlocks.CURTAIN_RED.get());
                    output.accept(CIBlocks.CURTAIN_PURPLE.get());
                    output.accept(CIBlocks.CURTAIN_LIME.get());
                    output.accept(CIBlocks.CURTAIN_PINK.get());
                    output.accept(CIBlocks.CURTAIN_ORANGE.get());
                    output.accept(CIBlocks.CURTAIN_MAGENTA.get());
                    output.accept(CIBlocks.CURTAIN_LIGHT_GRAY.get());
                    output.accept(CIBlocks.CURTAIN_LIGHT_BLUE.get());
                    output.accept(CIBlocks.CURTAIN_GREEN.get());
                    output.accept(CIBlocks.CURTAIN_GRAY.get());
                    output.accept(CIBlocks.CURTAIN_CYAN.get());
                    output.accept(CIBlocks.CURTAIN_BROWN.get());
                    output.accept(CIBlocks.CURTAIN_BLUE.get());
                    output.accept(CIBlocks.CURTAIN_BLACK.get());

                    output.accept(CIBlocks.CURTAIN_BLINDS_YELLOW.get());
                    output.accept(CIBlocks.CURTAIN_BLINDS_WHITE.get());
                    output.accept(CIBlocks.CURTAIN_BLINDS_RED.get());
                    output.accept(CIBlocks.CURTAIN_BLINDS_PURPLE.get());
                    output.accept(CIBlocks.CURTAIN_BLINDS_LIME.get());
                    output.accept(CIBlocks.CURTAIN_BLINDS_PINK.get());
                    output.accept(CIBlocks.CURTAIN_BLINDS_ORANGE.get());
                    output.accept(CIBlocks.CURTAIN_BLINDS_MAGENTA.get());
                    output.accept(CIBlocks.CURTAIN_BLINDS_LIGHT_GRAY.get());
                    output.accept(CIBlocks.CURTAIN_BLINDS_LIGHT_BLUE.get());
                    output.accept(CIBlocks.CURTAIN_BLINDS_GREEN.get());
                    output.accept(CIBlocks.CURTAIN_BLINDS_GRAY.get());
                    output.accept(CIBlocks.CURTAIN_BLINDS_CYAN.get());
                    output.accept(CIBlocks.CURTAIN_BLINDS_BROWN.get());
                    output.accept(CIBlocks.CURTAIN_BLINDS_BLUE.get());
                    output.accept(CIBlocks.CURTAIN_BLINDS_BLACK.get());

                    output.accept(CIBlocks.CURTAIN_BEADED_YELLOW.get());
                    output.accept(CIBlocks.CURTAIN_BEADED_WHITE.get());
                    output.accept(CIBlocks.CURTAIN_BEADED_RED.get());
                    output.accept(CIBlocks.CURTAIN_BEADED_PURPLE.get());
                    output.accept(CIBlocks.CURTAIN_BEADED_LIME.get());
                    output.accept(CIBlocks.CURTAIN_BEADED_PINK.get());
                    output.accept(CIBlocks.CURTAIN_BEADED_ORANGE.get());
                    output.accept(CIBlocks.CURTAIN_BEADED_MAGENTA.get());
                    output.accept(CIBlocks.CURTAIN_BEADED_LIGHT_GRAY.get());
                    output.accept(CIBlocks.CURTAIN_BEADED_LIGHT_BLUE.get());
                    output.accept(CIBlocks.CURTAIN_BEADED_GREEN.get());
                    output.accept(CIBlocks.CURTAIN_BEADED_GRAY.get());
                    output.accept(CIBlocks.CURTAIN_BEADED_CYAN.get());
                    output.accept(CIBlocks.CURTAIN_BEADED_BROWN.get());
                    output.accept(CIBlocks.CURTAIN_BEADED_BLUE.get());
                    output.accept(CIBlocks.CURTAIN_BEADED_BLACK.get());

                })
                .build());

    public static final RegistryObject<CreativeModeTab> PELMETS_TAB = CREATIVE_MODE_TAB_DEFERRED_REGISTER.register("pelmets_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(CIBlocks.PELMET_ORNATE_GOLD_BLUE.get()))
                    .title(Component.translatable("creativetab.pelmets_tab"))
                    .displayItems((ItemDisplayParameters, output) -> {
                       output.accept(CIBlocks.PELMET_SOLID_ACACIA.get());
                       output.accept(CIBlocks.PELMET_SOLID_OAK.get());
                       output.accept(CIBlocks.PELMET_SOLID_DARK_OAK.get());
                       output.accept(CIBlocks.PELMET_SOLID_SPRUCE.get());
                       output.accept(CIBlocks.PELMET_SOLID_BAMBOO.get());
                       output.accept(CIBlocks.PELMET_SOLID_BIRCH.get());
                       output.accept(CIBlocks.PELMET_SOLID_CRIMSON.get());
                       output.accept(CIBlocks.PELMET_SOLID_WARPED.get());
                       output.accept(CIBlocks.PELMET_SOLID_JUNGLE.get());
                        output.accept(CIBlocks.PELMET_SOLID_CHERRY.get());
                        output.accept(CIBlocks.PELMET_SOLID_MANGROVE.get());

                       output.accept(CIBlocks.PELMET_CARVED_ACACIA.get());
                       output.accept(CIBlocks.PELMET_CARVED_OAK.get());
                       output.accept(CIBlocks.PELMET_CARVED_DARK_OAK.get());
                       output.accept(CIBlocks.PELMET_CARVED_SPRUCE.get());
                       output.accept(CIBlocks.PELMET_CARVED_BAMBOO.get());
                       output.accept(CIBlocks.PELMET_CARVED_BIRCH.get());
                       output.accept(CIBlocks.PELMET_CARVED_CRIMSON.get());
                       output.accept(CIBlocks.PELMET_CARVED_WARPED.get());
                       output.accept(CIBlocks.PELMET_CARVED_JUNGLE.get());
                        output.accept(CIBlocks.PELMET_CARVED_CHERRY.get());
                        output.accept(CIBlocks.PELMET_CARVED_MANGROVE.get());

                       output.accept(CIBlocks.PELMET_SOLID_BLACK.get());
                       output.accept(CIBlocks.PELMET_SOLID_BLUE.get());
                       output.accept(CIBlocks.PELMET_SOLID_YELLOW.get());
                       output.accept(CIBlocks.PELMET_SOLID_WHITE.get());
                       output.accept(CIBlocks.PELMET_SOLID_RED.get());
                       output.accept(CIBlocks.PELMET_SOLID_CYAN.get());
                       output.accept(CIBlocks.PELMET_SOLID_PINK.get());
                       output.accept(CIBlocks.PELMET_SOLID_LIME.get());
                       output.accept(CIBlocks.PELMET_SOLID_GREEN.get());
                       output.accept(CIBlocks.PELMET_SOLID_MAGENTA.get());
                       output.accept(CIBlocks.PELMET_SOLID_PURPLE.get());
                       output.accept(CIBlocks.PELMET_SOLID_ORANGE.get());
                       output.accept(CIBlocks.PELMET_SOLID_LIGHT_BLUE.get());
                       output.accept(CIBlocks.PELMET_SOLID_BROWN.get());
                       output.accept(CIBlocks.PELMET_SOLID_GRAY.get());
                       output.accept(CIBlocks.PELMET_SOLID_LIGHT_GRAY.get());

                       output.accept(CIBlocks.PELMET_SOFT_BLACK.get());
                       output.accept(CIBlocks.PELMET_SOFT_BLUE.get());
                       output.accept(CIBlocks.PELMET_SOFT_YELLOW.get());
                       output.accept(CIBlocks.PELMET_SOFT_WHITE.get());
                       output.accept(CIBlocks.PELMET_SOFT_RED.get());
                       output.accept(CIBlocks.PELMET_SOFT_CYAN.get());
                       output.accept(CIBlocks.PELMET_SOFT_PINK.get());
                       output.accept(CIBlocks.PELMET_SOFT_LIME.get());
                       output.accept(CIBlocks.PELMET_SOFT_GREEN.get());
                       output.accept(CIBlocks.PELMET_SOFT_MAGENTA.get());
                       output.accept(CIBlocks.PELMET_SOFT_PURPLE.get());
                       output.accept(CIBlocks.PELMET_SOFT_ORANGE.get());
                       output.accept(CIBlocks.PELMET_SOFT_LIGHT_BLUE.get());
                       output.accept(CIBlocks.PELMET_SOFT_BROWN.get());
                       output.accept(CIBlocks.PELMET_SOFT_GRAY.get());
                       output.accept(CIBlocks.PELMET_SOFT_LIGHT_GRAY.get());

                       output.accept(CIBlocks.PELMET_ORNATE_GOLD_BLACK.get());
                       output.accept(CIBlocks.PELMET_ORNATE_GOLD_BLUE.get());
                       output.accept(CIBlocks.PELMET_ORNATE_GOLD_YELLOW.get());
                       output.accept(CIBlocks.PELMET_ORNATE_GOLD_WHITE.get());
                       output.accept(CIBlocks.PELMET_ORNATE_GOLD_RED.get());
                       output.accept(CIBlocks.PELMET_ORNATE_GOLD_CYAN.get());
                       output.accept(CIBlocks.PELMET_ORNATE_GOLD_PINK.get());
                       output.accept(CIBlocks.PELMET_ORNATE_GOLD_LIME.get());
                       output.accept(CIBlocks.PELMET_ORNATE_GOLD_GREEN.get());
                       output.accept(CIBlocks.PELMET_ORNATE_GOLD_MAGENTA.get());
                       output.accept(CIBlocks.PELMET_ORNATE_GOLD_PURPLE.get());
                       output.accept(CIBlocks.PELMET_ORNATE_GOLD_ORANGE.get());
                       output.accept(CIBlocks.PELMET_ORNATE_GOLD_LIGHT_BLUE.get());
                       output.accept(CIBlocks.PELMET_ORNATE_GOLD_BROWN.get());
                       output.accept(CIBlocks.PELMET_ORNATE_GOLD_GRAY.get());
                       output.accept(CIBlocks.PELMET_ORNATE_GOLD_LIGHT_GRAY.get());

                        output.accept(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_BLACK.get());
                        output.accept(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_BLUE.get());
                        output.accept(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_YELLOW.get());
                        output.accept(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_WHITE.get());
                        output.accept(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_RED.get());
                        output.accept(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_CYAN.get());
                        output.accept(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_PINK.get());
                        output.accept(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_LIME.get());
                        output.accept(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_GREEN.get());
                        output.accept(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_MAGENTA.get());
                        output.accept(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_PURPLE.get());
                        output.accept(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_ORANGE.get());
                        output.accept(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_LIGHT_BLUE.get());
                        output.accept(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_BROWN.get());
                        output.accept(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_GRAY.get());
                        output.accept(CIBlocks.PELMET_ORNATE_TINSEL_GOLD_LIGHT_GRAY.get());
                    })
                    .build());

    //Tabs end here
    public static void register (IEventBus eventBus) {
        CREATIVE_MODE_TAB_DEFERRED_REGISTER.register(eventBus);
    }
}
