package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;
import net.mcreator.craftkaisen.init.CraftKaisenModParticleTypes;
import net.mcreator.craftkaisen.entity.SatoruGojoEntity;
import net.mcreator.craftkaisen.CraftKaisenMod;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class HollowPurpeWhilstFlyingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		CraftKaisenMod.queueServerWork(100, () -> {
			if (!immediatesourceentity.level.isClientSide())
				immediatesourceentity.discard();
		});
		if (!(entity instanceof SatoruGojoEntity)) {
			{
				// Get the radius of the sphere
				double radius = ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 30); // 3 blocks
				// Set the tolerance for how close to the surface a point must be to create a particle
				double tolerance = 0.15; // 0.1 blocks
				for (double xx = -radius; xx <= radius; xx += 0.1) {
					for (double yy = -radius; yy <= radius; yy += 0.1) {
						for (double zz = -radius; zz <= radius; zz += 0.1) {
							if (Math.abs(xx * xx + yy * yy + zz * zz - radius * radius) <= tolerance) {
								// Calculate the position of the particle
								double posX = x + xx;
								double posY = y + yy;
								double posZ = z + zz;
								if (true) {
									if (world instanceof ServerLevel)
										((ServerLevel) world).sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.MIST_PURPLE.get()), posX, posY, posZ, (int) 1, 0.01, 0.01, 0.01, 0);
								} else {
									world.addParticle((SimpleParticleType) (CraftKaisenModParticleTypes.MIST_PURPLE.get()), posX, posY, posZ, 0, 0, 0);
								}
							}
						}
					}
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.PURPLE_ELECTRICITY.get()), x, y, z, 10,
						((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 10),
						((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 10),
						((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 10), 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.PURPLE_PULSE.get()), x, y, z, 1, 0.1, 0.1, 0.1, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.POOF, x, y, z, 20, 3, 3, 3, 0.3);
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world
						.getEntitiesOfClass(Entity.class,
								new AABB(_center, _center).inflate(((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 3) / 2d), e -> true)
						.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entity == entityiterator)) {
						if (!entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("craft_kaisen:domain_mobs")))) {
						}
					}
				}
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world
						.getEntitiesOfClass(Entity.class,
								new AABB(_center, _center).inflate(((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 6) / 2d), e -> true)
						.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entity == entityiterator)) {
						if (!entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("craft_kaisen:domain_mobs")))) {
							{
								Entity _ent = entityiterator;
								_ent.teleportTo(x, y, z);
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport(x, y, z, _ent.getYRot(), _ent.getXRot());
							}
						}
					}
				}
			}
			int horizontalRadiusSphere = (int) (2 + (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 15) - 1;
			int verticalRadiusSphere = (int) (2 + (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 15) - 1;
			int yIterationsSphere = verticalRadiusSphere;
			for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
				for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
					for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
						double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
								+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
						if (distanceSq <= 1.0) {
							if (!(world.getBlockState(BlockPos.containing(x + xi, y + i, z + zi))).is(BlockTags.create(new ResourceLocation("craft_kaisen:domain_blocks")))) {
								if (!((world.getBlockState(BlockPos.containing(x + xi, y + i, z + zi))).getBlock() == Blocks.BEDROCK)) {
									world.destroyBlock(BlockPos.containing(x + xi, y + i, z + zi), false);
									world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), Blocks.AIR.defaultBlockState(), 3);
								}
							}
						}
					}
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			immediatesourceentity.setNoGravity(true);
		} else {
			{
				// Get the radius of the sphere
				double radius = 4; // 3 blocks
				// Set the tolerance for how close to the surface a point must be to create a particle
				double tolerance = 0.15; // 0.1 blocks
				for (double xx = -radius; xx <= radius; xx += 0.1) {
					for (double yy = -radius; yy <= radius; yy += 0.1) {
						for (double zz = -radius; zz <= radius; zz += 0.1) {
							if (Math.abs(xx * xx + yy * yy + zz * zz - radius * radius) <= tolerance) {
								// Calculate the position of the particle
								double posX = x + xx;
								double posY = y + yy;
								double posZ = z + zz;
								if (true) {
									if (world instanceof ServerLevel)
										((ServerLevel) world).sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.MIST_PURPLE.get()), posX, posY, posZ, (int) 1, 0.01, 0.01, 0.01, 0);
								} else {
									world.addParticle((SimpleParticleType) (CraftKaisenModParticleTypes.MIST_PURPLE.get()), posX, posY, posZ, 0, 0, 0);
								}
							}
						}
					}
				}
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.PURPLE_ELECTRICITY.get()), x, y, z, 5, 1, 2, 1, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.PURPLE_PULSE.get()), x, y, z, 1, 0.1, 0.1, 0.1, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.POOF, x, y, z, 9, 3, 3, 3, 0);
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(30 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entity == entityiterator)) {
						if (!entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("craft_kaisen:domain_mobs")))) {
							{
								Entity _ent = entityiterator;
								_ent.teleportTo(x, y, z);
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport(x, y, z, _ent.getYRot(), _ent.getXRot());
							}
						}
					}
				}
			}
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(9 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entity == entityiterator)) {
						if (!entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("craft_kaisen:domain_mobs")))) {
							{
								Entity _ent = entityiterator;
								_ent.teleportTo(x, y, z);
								if (_ent instanceof ServerPlayer _serverPlayer)
									_serverPlayer.connection.teleport(x, y, z, _ent.getYRot(), _ent.getXRot());
							}
						}
					}
				}
			}
			int horizontalRadiusSphere = (int) 8 - 1;
			int verticalRadiusSphere = (int) 8 - 1;
			int yIterationsSphere = verticalRadiusSphere;
			for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
				for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
					for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
						double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
								+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
						if (distanceSq <= 1.0) {
							if (!(world.getBlockState(BlockPos.containing(x + xi, y + i, z + zi))).is(BlockTags.create(new ResourceLocation("craft_kaisen:domain_blocks")))) {
								if (!((world.getBlockState(BlockPos.containing(x + xi, y + i, z + zi))).getBlock() == Blocks.BEDROCK)) {
									world.destroyBlock(BlockPos.containing(x + xi, y + i, z + zi), false);
									world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), Blocks.AIR.defaultBlockState(), 3);
								}
							}
						}
					}
				}
			}
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			immediatesourceentity.setNoGravity(true);
		}
	}
}
