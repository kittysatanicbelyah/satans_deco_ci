package net.satan.deco_ci;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.config.ModConfigEvent;

@Mod.EventBusSubscriber(modid = satans_deco_ci.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CIConfig {
    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    private static final ForgeConfigSpec.IntValue CURTAIN_LIMIT =
            BUILDER.comment("Curtain limit").defineInRange("curtainLimit", 5000, 0, Integer.MAX_VALUE);

    static final ForgeConfigSpec SPEC = BUILDER.build();

    public static int curtainLimit;

    @SubscribeEvent
    static void onLoad(final ModConfigEvent event) {
        curtainLimit = CURTAIN_LIMIT.get();
    }

    public static void register() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, SPEC);
    }
}
