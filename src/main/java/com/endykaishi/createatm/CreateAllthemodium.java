package com.endykaishi.createatm;

import com.endykaishi.createatm.registry.ModBlocks;
import com.endykaishi.createatm.registry.ModItems;
import com.endykaishi.createatm.visual.ModSpriteShifts;
import com.mojang.logging.LogUtils;
import com.simibubi.create.foundation.data.CreateRegistrate;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(CreateAllthemodium.MOD_ID)
public class CreateAllthemodium {

	// Define mod id in a common place for everything to reference
	public static final String MOD_ID = "create_allthemodium";
	public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(CreateAllthemodium.MOD_ID);
	// Directly reference a slf4j logger
	public static final Logger LOGGER = LogUtils.getLogger();

	public CreateAllthemodium(IEventBus modEventBus, ModContainer modContainer) {
		// Register the commonSetup method for modloading
		REGISTRATE.registerEventListeners(modEventBus);
		modEventBus.addListener(this::commonSetup);
		modEventBus.addListener(this::addCreative);

		NeoForge.EVENT_BUS.register(this);

		// Register our mod's ModConfigSpec so that FML can create and load the config file for us
		modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
		ModSpriteShifts.init();
	}

	private void commonSetup(FMLCommonSetupEvent event) {}

	// Add the example block item to the building blocks tab
	private void addCreative(BuildCreativeModeTabContentsEvent event) {}

	// You can use SubscribeEvent and let the Event Bus discover methods to call
	@SubscribeEvent
	public void onServerStarting(ServerStartingEvent event) {}
}
