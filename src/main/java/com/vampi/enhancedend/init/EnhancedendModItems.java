/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.vampi.enhancedend.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import java.util.function.Function;

import com.vampi.enhancedend.item.*;
import com.vampi.enhancedend.EnhancedendMod;

public class EnhancedendModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(EnhancedendMod.MODID);
	public static final DeferredItem<Item> VOID_HELMET;
	public static final DeferredItem<Item> VOID_CHESTPLATE;
	public static final DeferredItem<Item> VOID_LEGGINGS;
	public static final DeferredItem<Item> VOID_BOOTS;
	public static final DeferredItem<Item> VOID_ORE;
	public static final DeferredItem<Item> VOID_SWORD;
	public static final DeferredItem<Item> VOID_PICKAXE;
	public static final DeferredItem<Item> VOID_AXE;
	public static final DeferredItem<Item> VOID_SHOVEL;
	public static final DeferredItem<Item> VOID_HOE;
	public static final DeferredItem<Item> CORRUPTED_GRASS_BLOCK;
	public static final DeferredItem<Item> VOID_ARTIFACT;
	static {
		VOID_HELMET = register("void_helmet", VoidArmorItem.Helmet::new);
		VOID_CHESTPLATE = register("void_chestplate", VoidArmorItem.Chestplate::new);
		VOID_LEGGINGS = register("void_leggings", VoidArmorItem.Leggings::new);
		VOID_BOOTS = register("void_boots", VoidArmorItem.Boots::new);
		VOID_ORE = block(EnhancedendModBlocks.VOID_ORE);
		VOID_SWORD = register("void_sword", VoidSwordItem::new);
		VOID_PICKAXE = register("void_pickaxe", VoidPickaxeItem::new);
		VOID_AXE = register("void_axe", VoidAxeItem::new);
		VOID_SHOVEL = register("void_shovel", VoidShovelItem::new);
		VOID_HOE = register("void_hoe", VoidHoeItem::new);
		CORRUPTED_GRASS_BLOCK = block(EnhancedendModBlocks.CORRUPTED_GRASS_BLOCK);
		VOID_ARTIFACT = register("void_artifact", VoidArtifactItem::new);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), properties);
	}
}