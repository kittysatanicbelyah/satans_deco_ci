package net.satan.deco_ci;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.satan.deco_ci.register.*;

import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(satans_deco_ci.MODID)
public class satans_deco_ci {

    // Define mod id in a common place for everything to reference
    public static final String MODID = "satans_deco_ci";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public satans_deco_ci(IEventBus modEventBus, ModContainer modContainer) {
        CIBlocks.register(modEventBus);
        CIItems.register(modEventBus);
        CITabs.register(modEventBus);
        CISounds.register(modEventBus);

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        NeoForge.EVENT_BUS.register(this);

        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, CIConfig.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Some common setup code
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        // Do something when the server starts
    }
}
