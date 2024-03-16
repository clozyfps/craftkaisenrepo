package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;
import net.mcreator.craftkaisen.init.CraftKaisenModMobEffects;
import net.mcreator.craftkaisen.init.CraftKaisenModBlocks;
import net.mcreator.craftkaisen.entity.BindingIceBlockEntity;
import net.mcreator.craftkaisen.CraftKaisenMod;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class BindingIceProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		String block = "";
		if (!entity.getPersistentData().getBoolean("domain")) {
			entity.getPersistentData().putString("domaintype", "Glacier");
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 20, 1, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 250, false, false));
			entity.getPersistentData().putDouble("domainx", (entity.getX()));
			entity.getPersistentData().putDouble("domainy", (entity.getY()));
			entity.getPersistentData().putDouble("domainz", (entity.getZ()));
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle craft_kaisen:ice_cloud ^ ^ ^ 20 1 20 0.1 300 force @a");
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.glass.break")), SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.glass.break")), SoundSource.PLAYERS, 1, 1, false);
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.hurt_freeze")), SoundSource.PLAYERS, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.hurt_freeze")), SoundSource.PLAYERS, 1, 1, false);
				}
			}
			int horizontalRadiusHemiTop = (int) 20 - 1;
			int verticalRadiusHemiTop = (int) 20;
			int yIterationsHemiTop = verticalRadiusHemiTop;
			for (int i = 0; i < yIterationsHemiTop; i++) {
				if (i == verticalRadiusHemiTop) {
					continue;
				}
				for (int xi = -horizontalRadiusHemiTop; xi <= horizontalRadiusHemiTop; xi++) {
					for (int zi = -horizontalRadiusHemiTop; zi <= horizontalRadiusHemiTop; zi++) {
						double distanceSq = (xi * xi) / (double) (horizontalRadiusHemiTop * horizontalRadiusHemiTop) + (i * i) / (double) (verticalRadiusHemiTop * verticalRadiusHemiTop)
								+ (zi * zi) / (double) (horizontalRadiusHemiTop * horizontalRadiusHemiTop);
						if (distanceSq <= 1.0) {
							if (y + i >= entity.getY()) {
								block = "" + ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x + xi, y + i, z + zi))).getBlock()).toString();
								if (y + i == entity.getY()) {
									if (Math.random() >= 0.9) {
										if (Math.random() >= 0.5) {
											world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CraftKaisenModBlocks.DOMAIN_ICE_STALAGMITE_TALL.get().defaultBlockState(), 3);
										} else {
											world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CraftKaisenModBlocks.DOMAIN_ICE_STALAGMITE.get().defaultBlockState(), 3);
										}
									} else {
										world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CraftKaisenModBlocks.DOMAIN_AIR_BLOCK.get().defaultBlockState(), 3);
									}
								}
								if (y + i > entity.getY()) {
									world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CraftKaisenModBlocks.DOMAIN_AIR_BLOCK.get().defaultBlockState(), 3);
								}
								if (y + i < entity.getY()) {
									if (Math.random() >= 0.5) {
										world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CraftKaisenModBlocks.DOMAIN_ICE_BLOCK.get().defaultBlockState(), 3);
									} else {
										world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CraftKaisenModBlocks.DOMAIN_PACKED_ICE.get().defaultBlockState(), 3);
									}
								}
								if (Math.round(Math.sqrt(Math.pow(x + xi - x, 2) + Math.pow(y + i - y, 2) + Math.pow(z + zi - z, 2))) >= 16 && Math.round(Math.sqrt(Math.pow(x + xi - x, 2) + Math.pow(y + i - y, 2) + Math.pow(z + zi - z, 2))) < 18) {
									if (Math.random() >= 0.5) {
										world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CraftKaisenModBlocks.DOMAIN_BLUE_ICE.get().defaultBlockState(), 3);
									} else {
										world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CraftKaisenModBlocks.DOMAIN_PACKED_ICE.get().defaultBlockState(), 3);
									}
								}
								if (Math.round(Math.sqrt(Math.pow(x + xi - x, 2) + Math.pow(y + i - y, 2) + Math.pow(z + zi - z, 2))) >= 18) {
									world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CraftKaisenModBlocks.DOMAIN_BLOCK.get().defaultBlockState(), 3);
								}
								if (!world.isClientSide()) {
									BlockPos _bp = BlockPos.containing(x + xi, y + i, z + zi);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getPersistentData().putString("old_block", block);
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
							}
						}
					}
				}
			}
			int horizontalRadiusHemiBot = (int) 20 - 1;
			int verticalRadiusHemiBot = (int) 20;
			int yIterationsHemiBot = verticalRadiusHemiBot;
			for (int i = -yIterationsHemiBot; i <= 0; i++) {
				if (i == -verticalRadiusHemiBot) {
					continue;
				}
				for (int xi = -horizontalRadiusHemiBot; xi <= horizontalRadiusHemiBot; xi++) {
					for (int zi = -horizontalRadiusHemiBot; zi <= horizontalRadiusHemiBot; zi++) {
						double distanceSq = (xi * xi) / (double) (horizontalRadiusHemiBot * horizontalRadiusHemiBot) + (i * i) / (double) (verticalRadiusHemiBot * verticalRadiusHemiBot)
								+ (zi * zi) / (double) (horizontalRadiusHemiBot * horizontalRadiusHemiBot);
						if (distanceSq <= 1.0) {
							if (y + i < entity.getY()) {
								block = "" + ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x + xi, y + i, z + zi))).getBlock()).toString();
								if (y + i == entity.getY()) {
									if (Math.random() >= 0.9) {
										if (Math.random() >= 0.5) {
											world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CraftKaisenModBlocks.DOMAIN_ICE_STALAGMITE_TALL.get().defaultBlockState(), 3);
										} else {
											world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CraftKaisenModBlocks.DOMAIN_ICE_STALAGMITE.get().defaultBlockState(), 3);
										}
									} else {
										world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CraftKaisenModBlocks.DOMAIN_AIR_BLOCK.get().defaultBlockState(), 3);
									}
								}
								if (y + i > entity.getY()) {
									world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CraftKaisenModBlocks.DOMAIN_AIR_BLOCK.get().defaultBlockState(), 3);
								}
								if (y + i < entity.getY()) {
									if (Math.random() >= 0.5) {
										world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CraftKaisenModBlocks.DOMAIN_ICE_BLOCK.get().defaultBlockState(), 3);
									} else {
										world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CraftKaisenModBlocks.DOMAIN_PACKED_ICE.get().defaultBlockState(), 3);
									}
								}
								if (Math.round(Math.sqrt(Math.pow(x + xi - x, 2) + Math.pow(y + i - y, 2) + Math.pow(z + zi - z, 2))) >= 16 && Math.round(Math.sqrt(Math.pow(x + xi - x, 2) + Math.pow(y + i - y, 2) + Math.pow(z + zi - z, 2))) < 18) {
									if (Math.random() >= 0.5) {
										world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CraftKaisenModBlocks.DOMAIN_BLUE_ICE.get().defaultBlockState(), 3);
									} else {
										world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CraftKaisenModBlocks.DOMAIN_PACKED_ICE.get().defaultBlockState(), 3);
									}
								}
								if (Math.round(Math.sqrt(Math.pow(x + xi - x, 2) + Math.pow(y + i - y, 2) + Math.pow(z + zi - z, 2))) >= 18) {
									world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CraftKaisenModBlocks.DOMAIN_BLOCK.get().defaultBlockState(), 3);
								}
								if (!world.isClientSide()) {
									BlockPos _bp = BlockPos.containing(x + xi, y + i, z + zi);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getPersistentData().putString("old_block", block);
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
							}
						}
					}
				}
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entityiterator == entity) && !(entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)
							&& !(entityiterator instanceof BindingIceBlockEntity)) {
						if (!(entityiterator instanceof LivingEntity _livEnt142 && _livEnt142.hasEffect(CraftKaisenModMobEffects.SIMPLE_DOMAIN.get()))
								|| !(entityiterator instanceof LivingEntity _livEnt143 && _livEnt143.hasEffect(CraftKaisenModMobEffects.DOMAIN_AMPLIFICATION.get()))) {
							if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
								_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.FROZEN_SOLID.get(), 150, 0, false, false));
						}
					}
					CraftKaisenMod.queueServerWork(1, () -> {
						if (entityiterator instanceof BindingIceBlockEntity && !(entityiterator instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false)) {
							if (entityiterator instanceof TamableAnimal _toTame && entity instanceof Player _owner)
								_toTame.tame(_owner);
						}
					});
				}
			}
			CraftKaisenMod.queueServerWork(1190, () -> {
				if (entity.getPersistentData().getBoolean("domain")) {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:reversefreezinwind")), SoundSource.PLAYERS, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:reversefreezinwind")), SoundSource.PLAYERS, 1, 1, false);
						}
					}
					entity.getPersistentData().putBoolean("domain", false);
				}
			});
		} else if (entity.getPersistentData().getBoolean("domain")) {
			IceDomainRemoveProcedure.execute(world, (entity.getPersistentData().getDouble("domainx")), (entity.getPersistentData().getDouble("domainy")), (entity.getPersistentData().getDouble("domainz")));
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("Unstable"), false);
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.UNSTABLE.get(),
						(int) (1600 - (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).level * 3), 0, false, false));
		}
	}
}
