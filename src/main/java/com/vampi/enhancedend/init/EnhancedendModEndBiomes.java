package com.vampi.enhancedend.init;

import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import com.vampi.enhancedend.endbiomes.TheEndBiomes;

@EventBusSubscriber
public class EnhancedendModEndBiomes {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			TheEndBiomes.addMainIslandBiome(ResourceKey.create(Registries.BIOME, ResourceLocation.parse("enhancedend:poblated_main_island")), 5d);
		});
	}
}