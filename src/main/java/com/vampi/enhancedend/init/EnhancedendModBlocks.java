/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.vampi.enhancedend.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import java.util.function.Function;

import com.vampi.enhancedend.block.VoidOreBlock;
import com.vampi.enhancedend.block.CorruptedGrassBlockBlock;
import com.vampi.enhancedend.EnhancedendMod;

public class EnhancedendModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(EnhancedendMod.MODID);
	public static final DeferredBlock<Block> VOID_ORE;
	public static final DeferredBlock<Block> CORRUPTED_GRASS_BLOCK;
	static {
		VOID_ORE = register("void_ore", VoidOreBlock::new);
		CORRUPTED_GRASS_BLOCK = register("corrupted_grass_block", CorruptedGrassBlockBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}