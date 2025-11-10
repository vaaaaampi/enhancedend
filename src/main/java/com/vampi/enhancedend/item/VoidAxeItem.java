package com.vampi.enhancedend.item;

import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.AxeItem;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

public class VoidAxeItem extends AxeItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 2400, 15f, 0, 22, TagKey.create(Registries.ITEM, ResourceLocation.parse("enhancedend:void_axe_repair_items")));

	public VoidAxeItem(Item.Properties properties) {
		super(TOOL_MATERIAL, 11f, -3.3f, properties.fireResistant());
	}
}