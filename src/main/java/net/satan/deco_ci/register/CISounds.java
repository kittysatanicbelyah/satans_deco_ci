package net.satan.deco_ci.register;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.satan.deco_ci.satans_deco_ci;

public class CISounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS = DeferredRegister.create(Registries.SOUND_EVENT,
            satans_deco_ci.MODID);

//sounds go here

    public static final DeferredHolder<SoundEvent, SoundEvent> CURTAIN_OPENS = registerSoundEvents("curtain_opens");
    public static final DeferredHolder<SoundEvent, SoundEvent> CURTAIN_CLOSES = registerSoundEvents("curtain_closes");
    public static final DeferredHolder<SoundEvent, SoundEvent> BLINDS_OPENS = registerSoundEvents("blinds_opens");
    public static final DeferredHolder<SoundEvent, SoundEvent> BLINDS_CLOSES = registerSoundEvents("blinds_closes");

// sounds end here

    private static DeferredHolder<SoundEvent, SoundEvent> registerSoundEvents(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(satans_deco_ci.MODID, name)));
    }

    public static void register (IEventBus evenBus) {
        SOUND_EVENTS.register(evenBus);
    }
}
