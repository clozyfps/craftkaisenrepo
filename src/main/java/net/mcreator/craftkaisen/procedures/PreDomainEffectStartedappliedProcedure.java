package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class PreDomainEffectStartedappliedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double fi = 0;
		if (!(entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(CraftKaisenModMobEffects.DELETED_MOD_ELEMENT.get()))) {
			fi = 0;
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof ServerPlayer || entityiterator instanceof Player) {
						fi = fi + 1;
					}
				}
			}
			if (fi >= 2) {
				if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.DELETED_MOD_ELEMENT.get(), 100, 1, false, false));
				{
					// Get the radius of the sphere
					double radius = 10; // 3 blocks
					// Set the tolerance for how close to the surface a point must be to create a particle
					double tolerance = 0.5; // 0.1 blocks
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
											((ServerLevel) world).sendParticles(ParticleTypes.END_ROD, posX, posY, posZ, (int) 1, 0.01, 0.01, 0.01, 0);
									} else {
										world.addParticle(ParticleTypes.END_ROD, posX, posY, posZ, 0, 0, 0);
									}
								}
							}
						}
					}
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.land")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.land")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.DELETED_MOD_ELEMENT.get(), 100, 1, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.STOP_DOMAIN.get(), 95, 1, false, false));
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (!(entityiterator == entity)) {
							if (entityiterator instanceof LivingEntity _livEnt10 && _livEnt10.hasEffect(CraftKaisenModMobEffects.DELETED_MOD_ELEMENT.get())) {
								if (!(!world.getEntitiesOfClass(PreDomainMobEntity.class, AABB.ofSize(new Vec3(x, y, z), 20, 20, 20), e -> true).isEmpty())) {
									if (world instanceof ServerLevel _level) {
										Entity entityToSpawn = new PreDomainMobEntity(CraftKaisenModEntities.DELETED_MOD_ELEMENT.get(), _level);
										entityToSpawn.moveTo(x, y, z, 0, 0);
										entityToSpawn.setYBodyRot(0);
										entityToSpawn.setYHeadRot(0);
										entityToSpawn.setDeltaMovement(0, 0, 0);
										if (entityToSpawn instanceof Mob _mobToSpawn)
											_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
										_level.addFreshEntity(entityToSpawn);
									}
								}
							}
						}
					}
				}
			} else {
			}
		}
	}
}
