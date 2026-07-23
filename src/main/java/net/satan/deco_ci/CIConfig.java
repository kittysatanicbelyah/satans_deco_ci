package net.satan.deco_ci;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.config.ModConfigEvent;
import net.neoforged.neoforge.common.ModConfigSpec;

@EventBusSubscriber(modid = satans_deco_ci.MODID, bus = EventBusSubscriber.Bus.MOD)
public class CIConfig {
    private static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();

    private static final ModConfigSpec.IntValue CURTAIN_LIMIT =
            BUILDER.comment("Curtain limit").defineInRange("curtainLimit", 5000, 0, Integer.MAX_VALUE);

    static final ModConfigSpec SPEC = BUILDER.build();

    public static int curtainLimit;

    @SubscribeEvent
    static void onLoad(final ModConfigEvent event) {
        curtainLimit = CURTAIN_LIMIT.get();
    }
}
