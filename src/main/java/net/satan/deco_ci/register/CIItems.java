package net.satan.deco_ci.register;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.satan.deco_ci.satans_deco_ci;

public class CIItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, satans_deco_ci.MODID);
    //Items go here

    //Items end here
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
