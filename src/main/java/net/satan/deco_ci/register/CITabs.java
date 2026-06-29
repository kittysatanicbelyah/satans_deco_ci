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

    //Tabs end here
    public static void register (IEventBus eventBus) {
        CREATIVE_MODE_TAB_DEFERRED_REGISTER.register(eventBus);
    }
}
