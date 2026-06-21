package net.satan.deco_ci.register;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import net.satan.deco_ci.satans_deco_ci;

public class CISounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS,
            satans_deco_ci.MODID);

//sounds go here

    public static final RegistryObject<SoundEvent> CURTAIN_OPENS = registerSoundEvents("curtain_opens");
    public static final RegistryObject<SoundEvent> CURTAIN_CLOSES = registerSoundEvents("curtain_closes");

// sounds end here

    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(satans_deco_ci.MODID, name)));
    }

    public static void register (IEventBus evenBus) {
        SOUND_EVENTS.register(evenBus);
    }
}
