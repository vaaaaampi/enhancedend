package com.vampi.enhancedend.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class VoidSwordItem extends Item {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 100, 12f, 0, 17, TagKey.create(Registries.ITEM, ResourceLocation.parse("enhancedend:void_sword_repair_items")));

	public VoidSwordItem(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 9f, -3f).fireResistant());
	}
}