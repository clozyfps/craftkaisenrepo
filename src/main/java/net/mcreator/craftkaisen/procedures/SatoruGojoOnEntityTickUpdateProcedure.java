package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.craftkaisen.init.CraftKaisenModParticleTypes;
import net.mcreator.craftkaisen.init.CraftKaisenModMobEffects;
import net.mcreator.craftkaisen.CraftKaisenMod;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class SatoruGojoOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double move = 0;
		if (!(entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(CraftKaisenModMobEffects.STOP_ATTACKS.get()))) {
			if (!entity.getPersistentData().getBoolean("floating")) {
				if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
					if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).isAlive()) {
						if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) <= 150) {
							if (!(entity instanceof LivingEntity _livEnt7 && _livEnt7.hasEffect(CraftKaisenModMobEffects.SURGE.get()))) {
								if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
									_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.SURGE.get(), 9000, 0, false, false));
							}
						}
						if (!(entity instanceof LivingEntity _livEnt9 && _livEnt9.hasEffect(CraftKaisenModMobEffects.COOLDOWN.get()))) {
							if (Math.random() < 0.001) {
								if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
									_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.COOLDOWN.get(), 30, 0, false, false));
								if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 15, 6, false, false));
							}
							if (Math.random() < 0.01) {
								if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
									_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.COOLDOWN.get(), 50, 0, false, false));
								if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
									_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.LAPSE_BLUE_CONTROL.get(), 50, 0, false, false));
								if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 50, 3, false, false));
								entity.getPersistentData().putString("currentmoveactive", "Lapse Blue");
							}
							if (Math.random() < 0.001) {
								entity.getPersistentData().putDouble("hollowPurple", 35);
								if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
									_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.COOLDOWN.get(), 100, 1, false, false));
								if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 45, 250, false, false));
								if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
									_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 45, 250, false, false));
								entity.getPersistentData().putString("currentmoveactive", "Hollow Purple");
							}
							if (Math.random() < 0.01) {
								{
									final Vec3 _center = new Vec3(x, y, z);
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(15 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.collect(Collectors.toList());
									for (Entity entityiterator : _entfound) {
										if (!(entity == entityiterator) && (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == entityiterator) {
											entityiterator.setDeltaMovement(new Vec3(((entity.getX() - entityiterator.getX()) / 5), ((entity.getY() - entityiterator.getY()) / 5), ((entity.getZ() - entityiterator.getZ()) / 5)));
											entity.getPersistentData().putString("currentmoveactive", "Lapse Blue");
											if (world instanceof ServerLevel _level)
												_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.BLUE_PARTICLE.get()), x, y, z, 25, 2, 2, 2, 0);
											if (world instanceof ServerLevel _level)
												_level.sendParticles(ParticleTypes.POOF, x, y, z, 25, 3, 2, 3, 0.4);
											if (world instanceof ServerLevel _level)
												_level.sendParticles(ParticleTypes.ELECTRIC_SPARK, x, y, z, 2, 3, 2, 3, 0);
										}
									}
								}
							}
							if (Math.random() < 0.009) {
								if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
									_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.COOLDOWN.get(), 40, 1, false, false));
								if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
									_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.PRE_RED.get(), 15, 0, false, false));
								entity.getPersistentData().putString("currentmoveactive", "Reversal Red");
							} else if (Math.random() < 0.002) {
								{
									final Vec3 _center = new Vec3(x, y, z);
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(15 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.collect(Collectors.toList());
									for (Entity entityiterator : _entfound) {
										if (!(entity == entityiterator) && (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == entityiterator) {
											entityiterator.setDeltaMovement(new Vec3((2.5 * entity.getLookAngle().x), (3 * entity.getLookAngle().y), (2.5 * entity.getLookAngle().z)));
											if (world instanceof ServerLevel _level)
												_level.sendParticles(ParticleTypes.EXPLOSION_EMITTER, x, y, z, 1, 1, 2, 1, 0);
											if (world instanceof ServerLevel _level)
												_level.sendParticles(ParticleTypes.POOF, x, y, z, 3, 1, 2, 1, 0);
											if (world instanceof Level _level) {
												if (!_level.isClientSide()) {
													_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1);
												} else {
													_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1, false);
												}
											}
										}
									}
								}
							}
						}
						if (Math.random() < 0.001) {
							entity.getPersistentData().putDouble("dashAttack", 40);
						}
						if (Math.random() < 0.0001) {
							if (!entity.getPersistentData().getBoolean("domain")) {
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:domain")), SoundSource.NEUTRAL, 1, 1);
									} else {
										_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:domain")), SoundSource.NEUTRAL, 1, 1, false);
									}
								}
								CraftKaisenMod.queueServerWork(20, () -> {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:unlimitedvoid")), SoundSource.NEUTRAL, 1, 1);
										} else {
											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:unlimitedvoid")), SoundSource.NEUTRAL, 1, 1, false);
										}
									}
								});
								CraftKaisenMod.queueServerWork(90, () -> {
									if (world instanceof Level _level) {
										if (!_level.isClientSide()) {
											_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:unlimitedsplash")), SoundSource.NEUTRAL, 1, 1);
										} else {
											_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:unlimitedsplash")), SoundSource.NEUTRAL, 1, 1, false);
										}
									}
								});
								UnlimitedVoidProcedureProcedure.execute(world, x, y, z, entity);
								entity.getPersistentData().putString("currentmoveactive", "Unlimited Void");
							}
						}
						if (entity.getPersistentData().getDouble("dashAttack") >= 1) {
							if (entity.getPersistentData().getDouble("dashAttack") >= 1) {
								if (!((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) == null)) {
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(
													new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
															_ent.getDisplayName(), _ent.level.getServer(), _ent),
													("execute as " + entity.getStringUUID() + " at @s run tp @s ~ ~ ~ facing entity " + (entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getStringUUID()));
										}
									}
								}
								entity.getPersistentData().putDouble("dashAttack", (entity.getPersistentData().getDouble("dashAttack") - 1));
								entity.setDeltaMovement(new Vec3((((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX() - entity.getX()) / 3),
										(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY() - entity.getY()) / 3), (((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ() - entity.getZ()) / 3)));
								{
									final Vec3 _center = new Vec3(x, y, z);
									List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
											.collect(Collectors.toList());
									for (Entity entityiterator : _entfound) {
										if (!(entityiterator == entity)) {
											if (world instanceof ServerLevel _level)
												_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.PUNCH_IMPACT.get()), (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 3, 0.1, 2, 0.1, 0);
											if (world instanceof ServerLevel _level)
												_level.sendParticles(ParticleTypes.POOF, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 1, 0.1, 0.1, 0.1, 1);
											if (world instanceof ServerLevel _level)
												_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.BLOOD_SPLASH.get()), (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 1, 0.2,
														(entityiterator.getBbHeight()), 0.2, 0.1);
											if (world instanceof Level _level) {
												if (!_level.isClientSide()) {
													_level.playSound(null, BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:crit")),
															SoundSource.NEUTRAL, 1, 1);
												} else {
													_level.playLocalSound((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:crit")),
															SoundSource.NEUTRAL, 1, 1, false);
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
		}
	}
}
