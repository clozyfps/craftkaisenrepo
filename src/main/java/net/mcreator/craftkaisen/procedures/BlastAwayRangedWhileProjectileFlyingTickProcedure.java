package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;
import net.mcreator.craftkaisen.init.CraftKaisenModParticleTypes;
import net.mcreator.craftkaisen.CraftKaisenMod;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class BlastAwayRangedWhileProjectileFlyingTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world
					.getEntitiesOfClass(Entity.class,
							new AABB(_center, _center).inflate((7 + (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 10) / 2d), e -> true)
					.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entity == entityiterator)) {
					if (!(immediatesourceentity == entityiterator)) {
						if (!entityiterator.getPersistentData().getBoolean("blast")) {
							entityiterator.getPersistentData().putBoolean("blast", true);
							CraftKaisenMod.queueServerWork(1, () -> {
								entityiterator.getPersistentData().putBoolean("blast", false);
							});
							entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_kaisen:repelling_damage"))),
									immediatesourceentity, entity), (float) (10 + (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 4));
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.EXPLOSION_EMITTER, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 30, 3, 3, 3, 0);
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.POOF, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 15, 4, 3, 4, 0.3);
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.BLOOD.get()), (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 20, 3, 3, 3, 1);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")),
											SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1,
											false);
								}
							}
							entityiterator.setDeltaMovement(new Vec3((3.5 * entity.getLookAngle().x), (3 * entity.getLookAngle().y), (3.5 * entity.getLookAngle().z)));
						}
					}
				}
			}
		}
		CraftKaisenMod.queueServerWork(20, () -> {
			if (!immediatesourceentity.level.isClientSide())
				immediatesourceentity.discard();
		});
	}
}
