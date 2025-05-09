package com.example;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Zodiac implements ModInitializer {
   public static final String MOD_ID = "modid";
   public static final Logger LOGGER = LoggerFactory.getLogger("modid");

   public void onInitialize() {
      if (FabricLoader.getInstance().isModLoaded("fabric")) {
         LOGGER.info("Patching Sodium because we deserve it");
      }

   }
}
