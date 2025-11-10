package com.vampi.enhancedend.procedures;

import net.neoforged.neoforge.event.entity.living.LivingDamageEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

@EventBusSubscriber
public class VoidnessTPProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingDamageEvent.Pre event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("tagName", (entity.getPersistentData().getDoubleOr("tagName", 0) + 1));
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
				.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("enhancedend:voidness")))) != 0) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= 6) {
				do {
					if (world.getBlockState(BlockPos.containing(entity.getX() + 7, entity.getY() - 1, entity.getZ())).canOcclude()) {
						world.setBlock(BlockPos.containing(entity.getX() + 7, entity.getY() + 1, entity.getZ()), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(entity.getX() - 7, entity.getY(), entity.getZ()), Blocks.AIR.defaultBlockState(), 3);
						{
							Entity _ent = entity;
							_ent.teleportTo((entity.getX() + 7), (entity.getY()), (entity.getZ()));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((entity.getX() + 7), (entity.getY()), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
						}
					} else if (world.getBlockState(BlockPos.containing(entity.getX() - 7, entity.getY() - 1, entity.getZ())).canOcclude()) {
						world.setBlock(BlockPos.containing(entity.getX() - 7, entity.getY() + 1, entity.getZ()), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(entity.getX() - 7, entity.getY(), entity.getZ()), Blocks.AIR.defaultBlockState(), 3);
						{
							Entity _ent = entity;
							_ent.teleportTo((entity.getX() - 7), (entity.getY()), (entity.getZ()));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((entity.getX() - 7), (entity.getY()), (entity.getZ()), _ent.getYRot(), _ent.getXRot());
						}
					} else if (world.getBlockState(BlockPos.containing(entity.getX(), entity.getY() - 1, entity.getZ() + 7)).canOcclude()) {
						world.setBlock(BlockPos.containing(entity.getX(), entity.getY() + 1, entity.getZ() + 7), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ() + 7), Blocks.AIR.defaultBlockState(), 3);
						{
							Entity _ent = entity;
							_ent.teleportTo((entity.getX()), (entity.getY()), (entity.getZ() + 7));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((entity.getX()), (entity.getY()), (entity.getZ() + 7), _ent.getYRot(), _ent.getXRot());
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.player.teleport")), SoundSource.AMBIENT, 1, 1);
							} else {
								_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.player.teleport")), SoundSource.AMBIENT, 1, 1, false);
							}
						}
					} else if (world.getBlockState(BlockPos.containing(entity.getX(), entity.getY() - 1, entity.getZ() - 7)).canOcclude()) {
						world.setBlock(BlockPos.containing(entity.getX(), entity.getY() + 1, entity.getZ() - 7), Blocks.AIR.defaultBlockState(), 3);
						world.setBlock(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ() - 7), Blocks.AIR.defaultBlockState(), 3);
						{
							Entity _ent = entity;
							_ent.teleportTo((entity.getX()), (entity.getY()), (entity.getZ() - 7));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport((entity.getX()), (entity.getY()), (entity.getZ() - 7), _ent.getYRot(), _ent.getXRot());
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.player.teleport")), SoundSource.AMBIENT, 1, 1);
							} else {
								_level.playLocalSound((entity.getX()), (entity.getY()), (entity.getZ()), BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("entity.player.teleport")), SoundSource.AMBIENT, 1, 1, false);
							}
						}
					}
				} while (entity.getPersistentData().getDoubleOr("tagName", 0) == 2);
			}
		}
	}
}