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
                })
                .build());

    //Tabs end here
    public static void register (IEventBus eventBus) {
        CREATIVE_MODE_TAB_DEFERRED_REGISTER.register(eventBus);
    }
}
