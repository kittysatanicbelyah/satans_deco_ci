package net.satan.deco_ci.register;

import net.minecraft.world.item.Item;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import net.satan.deco_ci.satans_deco_ci;

public class CIItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.createItems(satans_deco_ci.MODID);
    //Items go here

    //Items end here
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
