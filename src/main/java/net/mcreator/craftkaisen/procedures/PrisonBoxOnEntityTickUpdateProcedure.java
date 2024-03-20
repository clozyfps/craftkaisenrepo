package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class PrisonBoxOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("boxtimer", (entity.getPersistentData().getDouble("boxtimer") + 1));
		if (entity.getPersistentData().getDouble("boxtimer") >= 150) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(10 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entity == entityiterator)) {
						if (!(entity instanceof TamableAnimal _tamIsTamedBy && entityiterator instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
							if (entityiterator instanceof LivingEntity) {
								if (entity.getPersistentData().getDouble("playersinradius") == 0) {
									entity.getPersistentData().putDouble("playersinradius", 1);
									entity.getPersistentData().putString("playerbox", (entityiterator.getDisplayName().getString()));
								}
								if (!entity.level.isClientSide())
									entity.discard();
								if (world instanceof ServerLevel _level) {
									Entity entityToSpawn = new OpenPrisonBoxEntity(CraftKaisenModEntities.DELETED_MOD_ELEMENT.get(), _level);
									entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
									if (entityToSpawn instanceof Mob _mobToSpawn)
										_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
									_level.addFreshEntity(entityToSpawn);
								}
								if (world instanceof ServerLevel _level)
									_level.sendParticles(ParticleTypes.SQUID_INK, x, y, z, 5, 1, 1, 1, 0.4);
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.spawn")), SoundSource.NEUTRAL, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.spawn")), SoundSource.NEUTRAL, 1, 1, false);
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
