package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.init.CraftKaisenModItems;
import net.mcreator.craftkaisen.entity.EightHandledSwordDivergentSilaDivineGeneralMahoragaEntity;

import javax.annotation.Nullable;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class MahoragaAdaptionProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingHurtEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getSource(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, DamageSource damagesource, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, damagesource, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, DamageSource damagesource, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof EightHandledSwordDivergentSilaDivineGeneralMahoragaEntity) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CraftKaisenModItems.TEST.get()) {
				entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC), sourceentity), 1000);
			} else if (!((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == CraftKaisenModItems.TEST.get())) {
				if (damagesource.is(DamageTypes.GENERIC)) {
					if (entity.getPersistentData().getBoolean("DamageAdapted") == false) {
						if (entity.getPersistentData().getDouble("DamageAdaptation") < 25) {
							entity.getPersistentData().putDouble("DamageAdaptation", (entity.getPersistentData().getDouble("DamageAdaptation") + 1));
						} else if (entity.getPersistentData().getDouble("DamageAdaptation") == 25) {
							entity.getPersistentData().putDouble("DamageAdaptation", (entity.getPersistentData().getDouble("DamageAdaptation") + 1));
							entity.getPersistentData().putDouble("DamageAdaptationTimer", 200);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_trapdoor.close")), SoundSource.HOSTILE, 1, (float) 0.5);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_trapdoor.close")), SoundSource.HOSTILE, 1, (float) 0.5, false);
								}
							}
							{
								final Vec3 _center = new Vec3(x, y, z);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (entityiterator instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(Component.literal("Mahoraga Adaptation to Generic Damage has begun."), false);
								}
							}
						}
					} else if (entity.getPersistentData().getBoolean("DamageAdapted") == true) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
					}
				}
				if (damagesource.is(DamageTypes.PLAYER_ATTACK)) {
					if (entity.getPersistentData().getBoolean("PlayerAttackAdapted") == false) {
						if (entity.getPersistentData().getDouble("PlayerAttackAdaptation") < 25) {
							entity.getPersistentData().putDouble("PlayerAttackAdaptation", (entity.getPersistentData().getDouble("PlayerAttackAdaptation") + 1));
						} else if (entity.getPersistentData().getDouble("PlayerAttackAdaptation") == 25) {
							entity.getPersistentData().putDouble("PlayerAttackAdaptation", (entity.getPersistentData().getDouble("PlayerAttackAdaptation") + 1));
							entity.getPersistentData().putDouble("PlayerAttackAdaptationTimer", 200);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_trapdoor.close")), SoundSource.PLAYERS, 1, (float) 0.5);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_trapdoor.close")), SoundSource.PLAYERS, 1, (float) 0.5, false);
								}
							}
							{
								final Vec3 _center = new Vec3(x, y, z);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (entityiterator instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(Component.literal("Mahoraga Adaptation to Player Hits has begun."), false);
								}
							}
						}
					} else if (entity.getPersistentData().getBoolean("PlayerAttackAdapted") == true) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
					}
				}
				if (damagesource.is(DamageTypes.MOB_ATTACK) || damagesource.is(DamageTypes.MOB_ATTACK_NO_AGGRO) || damagesource.is(DamageTypes.STING)) {
					if (entity.getPersistentData().getBoolean("MobAttackAdapted") == false) {
						if (entity.getPersistentData().getDouble("MobAttackAdaptation") < 20) {
							entity.getPersistentData().putDouble("MobAttackAdaptation", (entity.getPersistentData().getDouble("MobAttackAdaptation") + 1));
						} else if (entity.getPersistentData().getDouble("MobAttackAdaptation") == 20) {
							entity.getPersistentData().putDouble("MobAttackAdaptation", (entity.getPersistentData().getDouble("MobAttackAdaptation") + 1));
							entity.getPersistentData().putDouble("MobAttackAdaptationTimer", 200);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wood.place")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
							{
								final Vec3 _center = new Vec3(x, y, z);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (entityiterator instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(Component.literal("Mahoraga Adaptation to Mob Hits has begun."), false);
								}
							}
						}
					} else if (entity.getPersistentData().getBoolean("MobAttackAdapted") == true) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
					}
				}
				if (damagesource.is(DamageTypes.IN_FIRE) || damagesource.is(DamageTypes.ON_FIRE) || damagesource.is(DamageTypes.LAVA) || damagesource.is(DamageTypes.HOT_FLOOR)) {
					if (entity.getPersistentData().getBoolean("BurningAdapted") == false) {
						if (entity.getPersistentData().getDouble("BurningAdaptation") < 25) {
							entity.getPersistentData().putDouble("BurningAdaptation", (entity.getPersistentData().getDouble("BurningAdaptation") + 1));
						} else if (entity.getPersistentData().getDouble("BurningAdaptation") == 25) {
							entity.getPersistentData().putDouble("BurningAdaptation", (entity.getPersistentData().getDouble("BurningAdaptation") + 1));
							entity.getPersistentData().putDouble("BurningAdaptationTimer", 100);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_trapdoor.close")), SoundSource.HOSTILE, 1, (float) 0.5);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_trapdoor.close")), SoundSource.HOSTILE, 1, (float) 0.5, false);
								}
							}
							{
								final Vec3 _center = new Vec3(x, y, z);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (entityiterator instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(Component.literal("Mahoraga Adaptation to Burning has begun."), false);
								}
							}
						}
					} else if (entity.getPersistentData().getBoolean("BurningAdapted") == true) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
					}
				}
				if (damagesource.is(DamageTypes.EXPLOSION) || damagesource.is(DamageTypes.PLAYER_EXPLOSION) || damagesource.is(DamageTypes.BAD_RESPAWN_POINT) || damagesource.is(DamageTypes.FIREBALL)
						|| damagesource.is(DamageTypes.UNATTRIBUTED_FIREBALL)) {
					if (entity.getPersistentData().getBoolean("ExplosionAdapted") == false) {
						if (entity.getPersistentData().getDouble("ExplosionAdaptation") < 15) {
							entity.getPersistentData().putDouble("ExplosionAdaptation", (entity.getPersistentData().getDouble("ExplosionAdaptation") + 1));
						} else if (entity.getPersistentData().getDouble("ExplosionAdaptation") == 15) {
							entity.getPersistentData().putDouble("ExplosionAdaptation", (entity.getPersistentData().getDouble("ExplosionAdaptation") + 1));
							entity.getPersistentData().putDouble("ExplosionAdaptationTimer", 500);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_trapdoor.close")), SoundSource.HOSTILE, 1, (float) 0.5);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_trapdoor.close")), SoundSource.HOSTILE, 1, (float) 0.5, false);
								}
							}
							{
								final Vec3 _center = new Vec3(x, y, z);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (entityiterator instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(Component.literal("Mahoraga Adaptation to Explosions has begun."), false);
								}
							}
						}
					} else if (entity.getPersistentData().getBoolean("ExplosionAdapted") == true) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
					}
				}
				if (damagesource.is(DamageTypes.FALL) || damagesource.is(DamageTypes.FLY_INTO_WALL)) {
					if (entity.getPersistentData().getBoolean("FallDamageAdapted") == false) {
						if (entity.getPersistentData().getDouble("FallDamageAdaptation") < 10) {
							entity.getPersistentData().putDouble("FallDamageAdaptation", (entity.getPersistentData().getDouble("FallDamageAdaptation") + 1));
						} else if (entity.getPersistentData().getDouble("FallDamageAdaptation") == 10) {
							entity.getPersistentData().putDouble("FallDamageAdaptation", (entity.getPersistentData().getDouble("FallDamageAdaptation") + 1));
							entity.getPersistentData().putDouble("FallDamageAdaptationTimer", 200);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_trapdoor.close")), SoundSource.HOSTILE, 1, (float) 0.5);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_trapdoor.close")), SoundSource.HOSTILE, 1, (float) 0.5, false);
								}
							}
							{
								final Vec3 _center = new Vec3(x, y, z);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (entityiterator instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(Component.literal("Mahoraga Adaptation to Fall Damage has begun."), false);
								}
							}
						}
					} else if (entity.getPersistentData().getBoolean("FallDamageAdapted") == true) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
					}
				}
				if (damagesource.is(DamageTypes.DROWN) || damagesource.is(DamageTypes.DRY_OUT) || damagesource.is(DamageTypes.IN_WALL)) {
					if (entity.getPersistentData().getBoolean("SuffocationAdapted") == false) {
						if (entity.getPersistentData().getDouble("SuffocationAdaptation") < 15) {
							entity.getPersistentData().putDouble("SuffocationAdaptation", (entity.getPersistentData().getDouble("SuffocationAdaptation") + 1));
						} else if (entity.getPersistentData().getDouble("SuffocationAdaptation") == 15) {
							entity.getPersistentData().putDouble("SuffocationAdaptation", (entity.getPersistentData().getDouble("SuffocationAdaptation") + 1));
							entity.getPersistentData().putDouble("SuffocationAdaptationTimer", 200);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_trapdoor.close")), SoundSource.HOSTILE, 1, (float) 0.5);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_trapdoor.close")), SoundSource.HOSTILE, 1, (float) 0.5, false);
								}
							}
							{
								final Vec3 _center = new Vec3(x, y, z);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (entityiterator instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(Component.literal("Mahoraga Adaptation to Suffocation has begun."), false);
								}
							}
						}
					} else if (entity.getPersistentData().getBoolean("SuffocationAdapted") == true) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
					}
				}
				if (damagesource.is(DamageTypes.STALAGMITE) || damagesource.is(DamageTypes.CACTUS) || damagesource.is(DamageTypes.SWEET_BERRY_BUSH) || damagesource.is(DamageTypes.FALLING_BLOCK) || damagesource.is(DamageTypes.FALLING_STALACTITE)
						|| damagesource.is(DamageTypes.FALLING_ANVIL)) {
					if (entity.getPersistentData().getBoolean("DamageBlockAdapted") == false) {
						if (entity.getPersistentData().getDouble("DamageBlockAdaptation") < 25) {
							entity.getPersistentData().putDouble("DamageBlockAdaptation", (entity.getPersistentData().getDouble("DamageBlockAdaptation") + 1));
						} else if (entity.getPersistentData().getDouble("DamageBlockAdaptation") == 25) {
							entity.getPersistentData().putDouble("DamageBlockAdaptation", (entity.getPersistentData().getDouble("DamageBlockAdaptation") + 1));
							entity.getPersistentData().putDouble("DamageBlockAdaptationTimer", 200);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_trapdoor.close")), SoundSource.HOSTILE, 1, (float) 0.5);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_trapdoor.close")), SoundSource.HOSTILE, 1, (float) 0.5, false);
								}
							}
							{
								final Vec3 _center = new Vec3(x, y, z);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (entityiterator instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(Component.literal("Mahoraga Adaptation to Block Damage has begun."), false);
								}
							}
						}
					} else if (entity.getPersistentData().getBoolean("DamageBlockAdapted") == true) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
					}
				}
				if (damagesource.is(DamageTypes.ARROW) || damagesource.is(DamageTypes.FIREWORKS) || damagesource.is(DamageTypes.MOB_PROJECTILE) || damagesource.is(DamageTypes.TRIDENT)) {
					if (entity.getPersistentData().getBoolean("ProjectileAdapted") == false) {
						if (entity.getPersistentData().getDouble("ProjectileAdaptation") < 10) {
							entity.getPersistentData().putDouble("ProjectileAdaptation", (entity.getPersistentData().getDouble("ProjectileAdaptation") + 1));
						} else if (entity.getPersistentData().getDouble("ProjectileAdaptation") == 10) {
							entity.getPersistentData().putDouble("ProjectileAdaptation", (entity.getPersistentData().getDouble("ProjectileAdaptation") + 1));
							entity.getPersistentData().putDouble("ProjectileAdaptationTimer", 200);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_trapdoor.close")), SoundSource.HOSTILE, 1, (float) 0.5);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_trapdoor.close")), SoundSource.HOSTILE, 1, (float) 0.5, false);
								}
							}
							{
								final Vec3 _center = new Vec3(x, y, z);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (entityiterator instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(Component.literal("Mahoraga Adaptation to Projectiles has begun."), false);
								}
							}
						}
					} else if (entity.getPersistentData().getBoolean("ProjectileAdapted") == true) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
					}
				}
				if (damagesource.is(DamageTypes.WITHER) || damagesource.is(DamageTypes.WITHER_SKULL)) {
					if (entity.getPersistentData().getBoolean("WitherAdapted") == false) {
						if (entity.getPersistentData().getDouble("WitherAdaptation") < 15) {
							entity.getPersistentData().putDouble("WitherAdaptation", (entity.getPersistentData().getDouble("WitherAdaptation") + 1));
						} else if (entity.getPersistentData().getDouble("WitherAdaptation") == 15) {
							entity.getPersistentData().putDouble("WitherAdaptation", (entity.getPersistentData().getDouble("WitherAdaptation") + 1));
							entity.getPersistentData().putDouble("WitherAdaptationTimer", 200);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_trapdoor.close")), SoundSource.HOSTILE, 1, (float) 0.5);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_trapdoor.close")), SoundSource.HOSTILE, 1, (float) 0.5, false);
								}
							}
							{
								final Vec3 _center = new Vec3(x, y, z);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (entityiterator instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(Component.literal("Mahoraga Adaptation to Withering has begun."), false);
								}
							}
						}
					} else if (entity.getPersistentData().getBoolean("WitherAdapted") == true) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
					}
				}
				if (damagesource.is(DamageTypes.INDIRECT_MAGIC) || damagesource.is(DamageTypes.MAGIC) || damagesource.is(DamageTypes.THORNS) || damagesource.is(DamageTypes.DRAGON_BREATH)) {
					if (entity.getPersistentData().getBoolean("MagicAdapted") == false) {
						if (entity.getPersistentData().getDouble("MagicAdaptation") < 15) {
							entity.getPersistentData().putDouble("MagicAdaptation", (entity.getPersistentData().getDouble("MagicAdaptation") + 1));
						} else if (entity.getPersistentData().getDouble("MagicAdaptation") == 15) {
							entity.getPersistentData().putDouble("MagicAdaptation", (entity.getPersistentData().getDouble("MagicAdaptation") + 1));
							entity.getPersistentData().putDouble("MagicAdaptationTimer", 200);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_trapdoor.close")), SoundSource.PLAYERS, 1, (float) 0.5);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_trapdoor.close")), SoundSource.PLAYERS, 1, (float) 0.5, false);
								}
							}
							{
								final Vec3 _center = new Vec3(x, y, z);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (entityiterator instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(Component.literal("Mahoraga Adaptation to Magic Attacks has begun."), false);
								}
							}
						}
					} else if (entity.getPersistentData().getBoolean("MagicAdapted") == true) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
					}
				}
				if (damagesource.is(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_kaisen:blood_damage")))) {
					if (entity.getPersistentData().getBoolean("BloodAdapted") == false) {
						if (entity.getPersistentData().getDouble("BloodAdaptation") < 10) {
							entity.getPersistentData().putDouble("BloodAdaptation", (entity.getPersistentData().getDouble("BloodAdaptation") + 1));
						} else if (entity.getPersistentData().getDouble("BloodAdaptation") == 10) {
							entity.getPersistentData().putDouble("BloodAdaptation", (entity.getPersistentData().getDouble("BloodAdaptation") + 1));
							entity.getPersistentData().putDouble("BloodAdaptationTimer", 200);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_trapdoor.close")), SoundSource.HOSTILE, 1, (float) 0.5);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_trapdoor.close")), SoundSource.HOSTILE, 1, (float) 0.5, false);
								}
							}
							{
								final Vec3 _center = new Vec3(x, y, z);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (entityiterator instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(Component.literal("Mahoraga Adaptation to Blood Attacks has begun."), false);
								}
							}
						}
					} else if (entity.getPersistentData().getBoolean("BloodAdapted") == true) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
					}
				}
				if (damagesource.is(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_kaisen:ratio_damage")))) {
					if (entity.getPersistentData().getBoolean("RatioAdapted") == false) {
						if (entity.getPersistentData().getDouble("RatioAdaptation") < 10) {
							entity.getPersistentData().putDouble("RatioAdaptation", (entity.getPersistentData().getDouble("RatioAdaptation") + 1));
						} else if (entity.getPersistentData().getDouble("RatioAdaptation") == 10) {
							entity.getPersistentData().putDouble("RatioAdaptation", (entity.getPersistentData().getDouble("RatioAdaptation") + 1));
							entity.getPersistentData().putDouble("RatioAdaptationTimer", 200);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_trapdoor.close")), SoundSource.HOSTILE, 1, (float) 0.5);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_trapdoor.close")), SoundSource.HOSTILE, 1, (float) 0.5, false);
								}
							}
							{
								final Vec3 _center = new Vec3(x, y, z);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (entityiterator instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(Component.literal("Mahoraga Adaptation to Ratio has begun."), false);
								}
							}
						}
					} else if (entity.getPersistentData().getBoolean("RatioAdapted") == true) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
					}
				}
				if (damagesource.is(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_kaisen:frame_attack")))) {
					if (entity.getPersistentData().getBoolean("FrameAdapted") == false) {
						if (entity.getPersistentData().getDouble("FrameAdaptation") < 10) {
							entity.getPersistentData().putDouble("FrameAdaptation", (entity.getPersistentData().getDouble("FrameAdaptation") + 1));
						} else if (entity.getPersistentData().getDouble("FrameAdaptation") == 10) {
							entity.getPersistentData().putDouble("FrameAdaptation", (entity.getPersistentData().getDouble("FrameAdaptation") + 1));
							entity.getPersistentData().putDouble("FrameAdaptationTimer", 200);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_trapdoor.close")), SoundSource.HOSTILE, 1, (float) 0.5);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_trapdoor.close")), SoundSource.HOSTILE, 1, (float) 0.5, false);
								}
							}
							{
								final Vec3 _center = new Vec3(x, y, z);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (entityiterator instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(Component.literal("Mahoraga Adaptation to Projection Sorcery has begun."), false);
								}
							}
						}
					} else if (entity.getPersistentData().getBoolean("FrameAdapted") == true) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
					}
				}
				if (damagesource.is(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_kaisen:frost_calm_damage"))) || damagesource.is(DamageTypes.FREEZE)) {
					if (entity.getPersistentData().getBoolean("FreezingAdapted") == false) {
						if (entity.getPersistentData().getDouble("FreezingAdaptation") < 10) {
							entity.getPersistentData().putDouble("FreezingAdaptation", (entity.getPersistentData().getDouble("FreezingAdaptation") + 1));
						} else if (entity.getPersistentData().getDouble("FreezingAdaptation") == 10) {
							entity.getPersistentData().putDouble("FreezingAdaptation", (entity.getPersistentData().getDouble("FreezingAdaptation") + 1));
							entity.getPersistentData().putDouble("FreezingAdaptationTimer", 200);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_trapdoor.close")), SoundSource.NEUTRAL, 1, (float) 0.5);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_trapdoor.close")), SoundSource.NEUTRAL, 1, (float) 0.5, false);
								}
							}
							{
								final Vec3 _center = new Vec3(x, y, z);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (entityiterator instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(Component.literal("Mahoraga Adaptation to Freezing has begun."), false);
								}
							}
						}
					} else if (entity.getPersistentData().getBoolean("FreezingAdapted") == true) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
					}
				}
				if (damagesource.is(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_kaisen:repelling_damage"))) || damagesource.is(DamageTypes.SONIC_BOOM)) {
					if (entity.getPersistentData().getBoolean("RepulsionAdapted") == false) {
						if (entity.getPersistentData().getDouble("RepulsionAdaptation") < 10) {
							entity.getPersistentData().putDouble("RepulsionAdaptation", (entity.getPersistentData().getDouble("RepulsionAdaptation") + 1));
						} else if (entity.getPersistentData().getDouble("RepulsionAdaptation") == 10) {
							entity.getPersistentData().putDouble("RepulsionAdaptation", (entity.getPersistentData().getDouble("RepulsionAdaptation") + 1));
							entity.getPersistentData().putDouble("RepulsionAdaptationTimer", 200);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_trapdoor.close")), SoundSource.HOSTILE, 1, (float) 0.5);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_trapdoor.close")), SoundSource.HOSTILE, 1, (float) 0.5, false);
								}
							}
							{
								final Vec3 _center = new Vec3(x, y, z);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (entityiterator instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(Component.literal("Mahoraga Adaptation to Repelling Attacks has begun."), false);
								}
							}
						}
					} else if (entity.getPersistentData().getBoolean("RepulsionAdapted") == true) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
					}
				}
				if (damagesource.is(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_kaisen:crushing_damage"))) || damagesource.is(DamageTypes.CRAMMING)) {
					if (entity.getPersistentData().getBoolean("CrushingAdapted") == false) {
						if (entity.getPersistentData().getDouble("CrushingAdaptation") < 100) {
							entity.getPersistentData().putDouble("CrushingAdaptation", (entity.getPersistentData().getDouble("CrushingAdaptation") + 1));
						} else if (entity.getPersistentData().getDouble("CrushingAdaptation") == 100) {
							entity.getPersistentData().putDouble("CrushingAdaptation", (entity.getPersistentData().getDouble("CrushingAdaptation") + 1));
							entity.getPersistentData().putDouble("CrushingAdaptationTimer", 500);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_trapdoor.close")), SoundSource.HOSTILE, 1, (float) 0.5);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_trapdoor.close")), SoundSource.HOSTILE, 1, (float) 0.5, false);
								}
							}
							{
								final Vec3 _center = new Vec3(x, y, z);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (entityiterator instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(Component.literal("Mahoraga Adaptation to Crushing Attacks has begun."), false);
								}
							}
						}
					} else if (entity.getPersistentData().getBoolean("CrushingAdapted") == true) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
					}
				}
				if (damagesource.is(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_kaisen:slashing_damage")))) {
					if (entity.getPersistentData().getBoolean("SlashesAdapted") == false) {
						if (entity.getPersistentData().getDouble("SlashesAdaptation") < 15) {
							entity.getPersistentData().putDouble("SlashesAdaptation", (entity.getPersistentData().getDouble("SlashesAdaptation") + 1));
						} else if (entity.getPersistentData().getDouble("SlashesAdaptation") == 15) {
							entity.getPersistentData().putDouble("SlashesAdaptation", (entity.getPersistentData().getDouble("SlashesAdaptation") + 1));
							entity.getPersistentData().putDouble("SlashesAdaptationTimer", 200);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_trapdoor.close")), SoundSource.HOSTILE, 1, (float) 0.5);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_trapdoor.close")), SoundSource.HOSTILE, 1, (float) 0.5, false);
								}
							}
							{
								final Vec3 _center = new Vec3(x, y, z);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (entityiterator instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(Component.literal("Mahoraga Adaptation to Slashing Attacks has begun."), false);
								}
							}
						}
					} else if (entity.getPersistentData().getBoolean("SlashesAdapted") == true) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
					}
				}
				if (damagesource.is(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_kaisen:electric_damage"))) || damagesource.is(DamageTypes.LIGHTNING_BOLT)) {
					if (entity.getPersistentData().getBoolean("ElectricityAdapted") == false) {
						if (entity.getPersistentData().getDouble("ElectricityAdaptation") < 15) {
							entity.getPersistentData().putDouble("ElectricityAdaptation", (entity.getPersistentData().getDouble("ElectricityAdaptation") + 1));
						} else if (entity.getPersistentData().getDouble("ElectricityAdaptation") == 15) {
							entity.getPersistentData().putDouble("ElectricityAdaptation", (entity.getPersistentData().getDouble("ElectricityAdaptation") + 1));
							entity.getPersistentData().putDouble("ElectricityAdaptationTimer", 200);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_trapdoor.close")), SoundSource.HOSTILE, 1, (float) 0.5);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_trapdoor.close")), SoundSource.HOSTILE, 1, (float) 0.5, false);
								}
							}
							{
								final Vec3 _center = new Vec3(x, y, z);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (entityiterator instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(Component.literal("Mahoraga Adaptation to Electricity has begun."), false);
								}
							}
						}
					} else if (entity.getPersistentData().getBoolean("ElectricityAdapted") == true) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
					}
				}
				if (damagesource.is(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_kaisen:cursed_energy_damage")))) {
					if (entity.getPersistentData().getBoolean("CursedEnergyAdapted") == false) {
						if (entity.getPersistentData().getDouble("CursedEnergyAdaptation") < 15) {
							entity.getPersistentData().putDouble("CursedEnergyAdaptation", (entity.getPersistentData().getDouble("CursedEnergyAdaptation") + 1));
						} else if (entity.getPersistentData().getDouble("CursedEnergyAdaptation") == 15) {
							entity.getPersistentData().putDouble("CursedEnergyAdaptation", (entity.getPersistentData().getDouble("CursedEnergyAdaptation") + 1));
							entity.getPersistentData().putDouble("CursedEnergyAdaptationTimer", 200);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_trapdoor.close")), SoundSource.HOSTILE, 1, (float) 0.5);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_trapdoor.close")), SoundSource.HOSTILE, 1, (float) 0.5, false);
								}
							}
							{
								final Vec3 _center = new Vec3(x, y, z);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (entityiterator instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(Component.literal("Mahoraga Adaptation to Basic Cursed Energy has begun."), false);
								}
							}
						}
					} else if (entity.getPersistentData().getBoolean("CursedEnergyAdapted") == true) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
					}
				}
				if (damagesource.is(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_kaisen:soul_damage")))) {
					if (entity.getPersistentData().getBoolean("SoulDamageAdapted") == false) {
						if (entity.getPersistentData().getDouble("SoulDamageAdaptation") < 20) {
							entity.getPersistentData().putDouble("SoulDamageAdaptation", (entity.getPersistentData().getDouble("SoulDamageAdaptation") + 1));
						} else if (entity.getPersistentData().getDouble("SoulDamageAdaptation") == 20) {
							entity.getPersistentData().putDouble("SoulDamageAdaptation", (entity.getPersistentData().getDouble("SoulDamageAdaptation") + 1));
							entity.getPersistentData().putDouble("SoulDamageAdaptationTimer", 200);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_trapdoor.close")), SoundSource.HOSTILE, 1, (float) 0.5);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.wooden_trapdoor.close")), SoundSource.HOSTILE, 1, (float) 0.5, false);
								}
							}
							{
								final Vec3 _center = new Vec3(x, y, z);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (entityiterator instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(Component.literal("Mahoraga Adaptation to Soul Attacks has begun."), false);
								}
							}
						}
					} else if (entity.getPersistentData().getBoolean("SoulDamageAdapted") == true) {
						if (event != null && event.isCancelable()) {
							event.setCanceled(true);
						}
					}
				}
			}
		}
	}
}
