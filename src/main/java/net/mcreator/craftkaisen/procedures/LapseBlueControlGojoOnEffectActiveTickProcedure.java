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

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;
import net.mcreator.craftkaisen.init.CraftKaisenModMobEffects;
import net.mcreator.craftkaisen.entity.ReversalRedProjectileProjectileEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class LapseBlueControlGojoOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("bluex") >= 10) {
			entity.getPersistentData().putDouble("bluex", 0);
			entity.getPersistentData().putDouble("bluey", 0);
			entity.getPersistentData().putDouble("bluez", 0);
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(CraftKaisenModMobEffects.LAPSE_BLUE_CONTROL_GOJO.get());
		}
		entity.getPersistentData().putDouble("bluex", (entity.getPersistentData().getDouble("bluex") + 0.5));
		entity.getPersistentData().putDouble("bluey", (entity.getPersistentData().getDouble("bluex") + 0.5));
		entity.getPersistentData().putDouble("bluez", (entity.getPersistentData().getDouble("bluex") + 0.5));
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
								new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_kaisen:cursed_energy_damage"))), entity), 8);
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
					if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
						_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 4, false, false));
					if (!entityiterator.level.isClientSide())
						entityiterator.discard();
					if (entity instanceof LivingEntity _entity)
						_entity.removeEffect(CraftKaisenModMobEffects.LAPSE_BLUE_CONTROL.get());
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL,
										new Vec3(
												(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("bluex")))), ClipContext.Block.OUTLINE,
														ClipContext.Fluid.NONE, entity)).getBlockPos().getX()),
												(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("bluey")))), ClipContext.Block.OUTLINE,
														ClipContext.Fluid.NONE, entity)).getBlockPos().getY()),
												(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("bluez")))), ClipContext.Block.OUTLINE,
														ClipContext.Fluid.NONE, entity)).getBlockPos().getZ())),
										Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle minecraft:dust 0.64 0.09 0.78 5 ^0 ^0 ^0 10 5 10 0 150");
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.POOF, x, y, z, 25, 15, 3, 15, 0.4);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, y, z, 25, 15, 3, 15, 0.4);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.FIREWORK, x, y, z, 10, 15, 3, 15, 0.4);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.EXPLOSION_EMITTER, x, y, z, 15, 15, 5, 15, 0);
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.FLASH, x, y, z, 10, 15, 3, 15, 0.4);
					if (world instanceof Level _level && !_level.isClientSide())
						_level.explode(null, x, y, z, (float) (10 + (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 2),
								Level.ExplosionInteraction.TNT);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.dragon_fireball.explode")), SoundSource.NEUTRAL, 1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.dragon_fireball.explode")), SoundSource.NEUTRAL, 1, 1, false);
						}
					}
					entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_kaisen:cursed_energy_damage"))), entity),
							70);
				}
			}
		}
		BlueTickProcedure.execute(world,
				(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("bluex")))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
						.getBlockPos().getX()),
				(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("bluey")))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
						.getBlockPos().getY()),
				(entity.level.clip(new ClipContext(entity.getEyePosition(1f), entity.getEyePosition(1f).add(entity.getViewVector(1f).scale((entity.getPersistentData().getDouble("bluez")))), ClipContext.Block.OUTLINE, ClipContext.Fluid.NONE, entity))
						.getBlockPos().getZ()),
				entity);
	}
}
