/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.vampi.enhancedend.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import com.vampi.enhancedend.EnhancedendMod;

@EventBusSubscriber
public class EnhancedendModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EnhancedendMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ENHANCED_END_BLOCKS = REGISTRY.register("enhanced_end_blocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.enhancedend.enhanced_end_blocks")).icon(() -> new ItemStack(EnhancedendModBlocks.CORRUPTED_GRASS_BLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(EnhancedendModBlocks.VOID_ORE.get().asItem());
				tabData.accept(EnhancedendModBlocks.CORRUPTED_GRASS_BLOCK.get().asItem());
			}).withSearchBar().build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(EnhancedendModBlocks.VOID_ORE.get().asItem());
			tabData.accept(EnhancedendModBlocks.CORRUPTED_GRASS_BLOCK.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(EnhancedendModItems.VOID_ARTIFACT.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(EnhancedendModItems.VOID_SWORD.get());
			tabData.accept(EnhancedendModItems.VOID_HELMET.get());
			tabData.accept(EnhancedendModItems.VOID_CHESTPLATE.get());
			tabData.accept(EnhancedendModItems.VOID_LEGGINGS.get());
			tabData.accept(EnhancedendModItems.VOID_BOOTS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(EnhancedendModItems.VOID_SWORD.get());
			tabData.accept(EnhancedendModItems.VOID_AXE.get());
			tabData.accept(EnhancedendModItems.VOID_PICKAXE.get());
			tabData.accept(EnhancedendModItems.VOID_SHOVEL.get());
			tabData.accept(EnhancedendModItems.VOID_HOE.get());
		}
	}
}