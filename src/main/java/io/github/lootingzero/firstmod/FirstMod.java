package io.github.lootingzero.firstmod;

import io.github.lootingzero.firstmod.registry.ModItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FirstMod implements ModInitializer {
	public static final String MOD_ID = "firstmod";
    public static final Logger LOGGER = LoggerFactory.getLogger("First Mod");

	@Override
	public void onInitialize() {
		LOGGER.info("Loading...");
		ModItems.load();
	}

	public static Identifier id(String path){
		return Identifier.of(MOD_ID, path);
	}
}