package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.client.player.AbstractClientPlayer;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;
import net.mcreator.craftkaisen.init.CraftKaisenModMobEffects;
import net.mcreator.craftkaisen.entity.ReversalRedProjectileProjectileEntity;
import net.mcreator.craftkaisen.CraftKaisenMod;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationRegistry;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationAccess;
import dev.kosmx.playerAnim.api.layered.ModifierLayer;
import dev.kosmx.playerAnim.api.layered.KeyframeAnimationPlayer;
import dev.kosmx.playerAnim.api.layered.IAnimation;

public class LapseBlueControlOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world.isClientSide()) {
			if (entity instanceof AbstractClientPlayer player) {
				var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("craft_kaisen", "player_animation"));
				if (animation != null) {
					animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("craft_kaisen", "ao"))));
				}
			}
		}
		if (entity.isShiftKeyDown() && entity.getPersistentData().getBoolean("charging") == true) {
			if (entity.getPersistentData().getDouble("bluex") < 15) {
				entity.getPersistentData().putDouble("bluex", (entity.getPersistentData().getDouble("bluex") + 1));
				entity.getPersistentData().putDouble("bluez", (entity.getPersistentData().getDouble("bluez") + 1));
				entity.getPersistentData().putDouble("bluey", (entity.getPersistentData().getDouble("bluey") + 1));
			}
		} else if (entity.isShiftKeyDown()) {
			if (entity.getPersistentData().getDouble("bluex") > 0) {
				entity.getPersistentData().putDouble("bluex", (entity.getPersistentData().getDouble("bluex") - 1));
				entity.getPersistentData().putDouble("bluez", (entity.getPersistentData().getDouble("bluez") - 1));
				entity.getPersistentData().putDouble("bluey", (entity.getPersistentData().getDouble("bluey") - 1));
			}
		}
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands()
					.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3((entity.level
							.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("bluex")))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
							.getBlockPos().getX()),
							(entity.level.clip(
									new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("bluey")))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
									.getBlockPos().getY()),
							(entity.level.clip(
									new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("bluez")))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
									.getBlockPos().getZ())),
							Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(), "particle minecraft:dust 0.01 0.77 0.99 2 ^0 ^0 ^0 0.7 0.7 0.7 0 25");
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.FIREWORK,
					(entity.level
							.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("bluex")))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
							.getBlockPos().getX()),
					(entity.level
							.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("bluey")))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
							.getBlockPos().getY()),
					(entity.level
							.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("bluez")))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
							.getBlockPos().getZ()),
					2, 1, 3, 1, 0.2);
		entity.getPersistentData().putString("currentmoveactive", "Lapse Blue");
		if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput < 100) {
			{
				double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentCursedEnergy - 4;
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.currentCursedEnergy = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput >= 100) {
			{
				double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentCursedEnergy - 6;
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.currentCursedEnergy = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		{
			final Vec3 _center = new Vec3(
					(entity.level
							.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("bluex")))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
							.getBlockPos().getX()),
					(entity.level
							.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("bluey")))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
							.getBlockPos().getY()),
					(entity.level
							.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("bluez")))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
							.getBlockPos().getZ()));
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(12 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entity == entityiterator) && !(entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
					if (entityiterator instanceof LivingEntity) {
						entityiterator.hurt(
								new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_kaisen:cursed_energy_damage"))), entity),
								(float) ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 15));
						{
							Entity _ent = entityiterator;
							_ent.teleportTo(
									(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("bluex")))), ClipContext.Block.OUTLINE,
											ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
									(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("bluey")))), ClipContext.Block.OUTLINE,
											ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
									(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("bluez")))), ClipContext.Block.OUTLINE,
											ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()));
							if (_ent instanceof ServerPlayer _serverPlayer)
								_serverPlayer.connection.teleport(
										(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("bluex")))), ClipContext.Block.OUTLINE,
												ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
										(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("bluey")))), ClipContext.Block.OUTLINE,
												ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
										(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("bluez")))), ClipContext.Block.OUTLINE,
												ClipContext.Fluid.NONE, entity)).getBlockPos().getZ()),
										_ent.getYRot(), _ent.getXRot());
						}
					}
				}
				if (entityiterator instanceof ReversalRedProjectileProjectileEntity) {
					if (entity instanceof ServerPlayer _plr52 && _plr52.level instanceof ServerLevel
							&& _plr52.getAdvancements().getOrStartProgress(_plr52.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:potentional"))).isDone()
							&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput >= 100) {
						if (entity.getPersistentData().getDouble("hollownukecooldown") <= 0) {
							{
								double _setval = entity.getPersistentData().getDouble("bluex");
								entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.bluepostionx = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = entity.getPersistentData().getDouble("bluey");
								entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.bluepostiony = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							{
								double _setval = entity.getPersistentData().getDouble("bluez");
								entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.bluepostionz = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 4, false, false));
							if (!entityiterator.level.isClientSide())
								entityiterator.discard();
							if (entity instanceof LivingEntity _entity)
								_entity.removeEffect(CraftKaisenModMobEffects.LAPSE_BLUE_CONTROL.get());
							entity.getPersistentData().putBoolean("rightleggonen", ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RightLegGone));
							entity.getPersistentData().putBoolean("rightarmgonen", ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RightArmGone));
							entity.getPersistentData().putBoolean("leftarmgonen", ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).LeftArmGone));
							entity.getPersistentData().putBoolean("leftleggonen", ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).LeftLegGone));
							entity.getPersistentData().putDouble("rightarmdamagen", ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).rightArmDamage));
							entity.getPersistentData().putDouble("leftarmdamagen", ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).leftArmDamage));
							entity.getPersistentData().putDouble("rightlegdamagen", ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).rightLegDamage));
							entity.getPersistentData().putDouble("leftlegdamagen", ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).leftLegDamage));
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL,
												new Vec3(
														(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("bluex")))),
																ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
														(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("bluey")))),
																ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
														(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("bluez")))),
																ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())),
												Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"particle minecraft:dust 0.64 0.09 0.78 5 ^0 ^0 ^0 5 5 5 0 2000");
							if (world instanceof ServerLevel _level)
								_level.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL,
												new Vec3(
														(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("bluex")))),
																ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
														(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("bluey")))),
																ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
														(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("bluez")))),
																ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())),
												Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
										"particle minecraft:dust 0.64 0.09 0.78 5 ^0 ^0 ^0 2.5 2.5 2.5 0 2000");
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.POOF, x, y, z, 25, 7, 3, 7, 0.4);
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, y, z, 25, 7, 3, 7, 0.4);
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.FIREWORK, x, y, z, 10, 7, 3, 7, 0.4);
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.EXPLOSION_EMITTER, x, y, z, 15, 7, 5, 7, 0);
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.FLASH, x, y, z, 10, 7, 3, 7, 0.4);
							CraftKaisenMod.queueServerWork(40, () -> {
								if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
									_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.IFRAME_EFFECT.get(), 4, 1, false, false));
								if (world instanceof Level _level && !_level.isClientSide())
									_level.explode(null, x, y, z, 60, Level.ExplosionInteraction.TNT);
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null,
												BlockPos.containing((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).bluepostionx,
														(entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).bluepostiony,
														(entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).bluepostionz),
												ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1);
									} else {
										_level.playLocalSound(((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).bluepostionx),
												((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).bluepostiony),
												((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).bluepostionz),
												ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1, false);
									}
								}
								if (world instanceof Level _level) {
									if (!_level.isClientSide()) {
										_level.playSound(null,
												BlockPos.containing((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).bluepostionx,
														(entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).bluepostiony,
														(entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).bluepostionz),
												ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.dragon_fireball.explode")), SoundSource.NEUTRAL, 1, 1);
									} else {
										_level.playLocalSound(((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).bluepostionx),
												((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).bluepostiony),
												((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).bluepostionz),
												ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.dragon_fireball.explode")), SoundSource.NEUTRAL, 1, 1, false);
									}
								}
								if (!(entity == entityiterator)) {
									entityiterator
											.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_kaisen:cursed_energy_damage"))),
													entity), (float) (45 + (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput));
								}
								{
									double _setval = entity.getPersistentData().getDouble("leftarmdamagen");
									entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.leftArmDamage = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
								{
									double _setval = entity.getPersistentData().getDouble("rightlegdamagen");
									entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.rightLegDamage = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
								{
									double _setval = entity.getPersistentData().getDouble("rightarmdamagen");
									entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.rightArmDamage = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
								{
									double _setval = entity.getPersistentData().getDouble("leftlegdamagen");
									entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.leftLegDamage = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
								{
									boolean _setval = entity.getPersistentData().getBoolean("rightleggonen");
									entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.RightLegGone = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
								{
									boolean _setval = entity.getPersistentData().getBoolean("rightarmgonen");
									entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.RightArmGone = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
								{
									boolean _setval = entity.getPersistentData().getBoolean("leftarmgonen");
									entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.LeftArmGone = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
								{
									boolean _setval = entity.getPersistentData().getBoolean("leftleggonen");
									entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.LeftLegGone = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
								entity.getPersistentData().putDouble("hollownukecooldown", 600);
							});
						}
					}
				}
			}
		}
		if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentCursedEnergy <= 0) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(CraftKaisenModMobEffects.LAPSE_BLUE_CONTROL.get());
		}
		entity.getPersistentData().putDouble("hollownukecooldown", (entity.getPersistentData().getDouble("hollownukecooldown") - 1));
		if (entity instanceof ServerPlayer _plr108 && _plr108.level instanceof ServerLevel && _plr108.getAdvancements().getOrStartProgress(_plr108.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:potentional"))).isDone()
				&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput >= 100) {
			BlueTickProcedure.execute(world,
					(entity.level
							.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("bluex")))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
							.getBlockPos().getX()),
					(entity.level
							.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("bluey")))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
							.getBlockPos().getY()),
					(entity.level
							.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("bluez")))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
							.getBlockPos().getZ()),
					entity);
		}
	}
}
