package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DeathSwarmTiktokProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof DeathSwarm1Entity || entity instanceof DeathWarm2Entity || entity instanceof DeathSwarm3Entity) {
			if (entity instanceof Player _player) {
				_player.getAbilities().invulnerable = true;
				_player.onUpdateAbilities();
			}
			if (entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) {
				if ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null) instanceof LivingEntity _livEnt6 && _livEnt6.hasEffect(CraftKaisenModMobEffects.DEATH_SWARM.get())) {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.POOF, x, y, z, 2, 2, 2, 2, 0.4);
					{
						final Vec3 _center = new Vec3(x, y, z);
						List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(9 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
								.collect(Collectors.toList());
						for (Entity entityiterator : _entfound) {
							if (!(entity == entityiterator)) {
								entityiterator.hurt(
										new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_kaisen:cursed_energy_damage"))),
												(entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null)),
										(float) (9 + ((entity instanceof TamableAnimal _tamEnt ? (Entity) _tamEnt.getOwner() : null).getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
												.orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 7));
							}
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.shoot")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.shoot")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					int horizontalRadiusHemiTop = (int) 4 - 1;
					int verticalRadiusHemiTop = (int) 4;
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
									if (!((world.getBlockState(BlockPos.containing(x + xi, y + i, z + zi))).getBlock() == Blocks.AIR)) {
										world.destroyBlock(BlockPos.containing(x + xi, y + i, z + zi), false);
										if (world instanceof ServerLevel _level)
											_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, x + xi, y + i, z + zi, 1, 0.1, 0.1, 0.1, 0.4);
										if (world instanceof ServerLevel _level)
											_level.sendParticles(ParticleTypes.EXPLOSION, x + xi, y + i, z + zi, 1, 0.1, 0.1, 0.1, 0);
										if (world instanceof ServerLevel _level)
											_level.sendParticles(ParticleTypes.SMOKE, x + xi, y + i, z + zi, 1, 0.1, 0.1, 0.1, 0);
									}
									world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), Blocks.AIR.defaultBlockState(), 3);
								}
							}
						}
					}
				}
			}
		}
	}
}
