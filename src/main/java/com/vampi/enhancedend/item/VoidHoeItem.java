package com.vampi.enhancedend.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class VoidHoeItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 2400, 12f, 0, 22, TagKey.create(Registries.ITEM, ResourceLocation.parse("enhancedend:void_hoe_repair_items")));

	public VoidHoeItem(Item.Properties properties) {
		super(properties.pickaxe(TOOL_MATERIAL, 3f, 1f).fireResistant());
	}
}