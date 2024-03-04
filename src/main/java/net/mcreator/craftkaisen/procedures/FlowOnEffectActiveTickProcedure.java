package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
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
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;
import net.mcreator.craftkaisen.init.CraftKaisenModParticleTypes;
import net.mcreator.craftkaisen.init.CraftKaisenModMobEffects;
import net.mcreator.craftkaisen.init.CraftKaisenModGameRules;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class FlowOnEffectActiveTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).CeNature).equals("Electricity")
				&& (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(CraftKaisenModMobEffects.SURGE.get()) ? _livEnt.getEffect(CraftKaisenModMobEffects.SURGE.get()).getDuration() : 0) >= 1930) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 0.72 0.37 0.95 2 ^0 ^0 ^0 0.3 1.2 0.3 0 2");
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.PURPLE_ELECTRICITY_PARTICLE.get()), x, y, z, 10, 2, 7, 2, 1);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.FLASH, x, y, z, 2, 3, 3, 3, 0);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.POOF, x, y, z, 2, 5, 4, 5, 0.7);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:electric")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:electric")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		} else if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).CeNature).equals("Electricity")
				&& (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(CraftKaisenModMobEffects.SURGE.get()) ? _livEnt.getEffect(CraftKaisenModMobEffects.SURGE.get()).getDuration() : 0) < 1930) {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.PURPLE_ELECTRICITY_PARTICLE.get()), x, y, z, 1, 0.1, 2, 0.1, 0);
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, new Vec3((entity.getX()), (entity.getY()), (entity.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 0.72 0.37 0.95 1 ^0 ^0 ^0 0.3 1.2 0.3 0 2");
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 5, 10, false, false));
		}
		if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).CeNature).equals("Flame")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 0.89 0.45 0.13 2 ^0 ^0 ^0 0.3 1.2 0.3 0 2");
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.FLAME, x, y, z, 10, 1, 2, 1, 0);
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 5, 6, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 5, 0, false, false));
		}
		if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).CeNature).equals("Frost")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 0.38 0.84 0.93 2 ^0 ^0 ^0 0.3 1.2 0.3 0 2");
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.SNOWFLAKE, x, y, z, 2, 1, 2, 1, 1);
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 5, 5, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.WATER_BREATHING, 5, 0, false, false));
			if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.WATER) {
				world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.ICE.defaultBlockState(), 3);
			}
		}
		if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).CeNature).equals("Rough")) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle minecraft:dust 0.2 0.94 0.62 2 ^0 ^0 ^0 0.3 1.2 0.3 0 2");
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.CRIT, x, y, z, 2, 1, 2, 1, 0);
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 5, 4, false, false));
		}
		{
			double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentCursedEnergy - 0.9;
			entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.currentCursedEnergy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentCursedEnergy <= 0) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(CraftKaisenModMobEffects.FLOW.get());
		}
		if (world.getLevelData().getGameRules().getBoolean(CraftKaisenModGameRules.NO_OVERWHELMING_PRESSURE) == false) {
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(25 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (!(entity == entityiterator) && !(entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
						if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).maxCursedEnergy > (entityiterator
								.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).maxCursedEnergy * 2.5) {
							if (entityiterator instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("\u00A74This overwhelming pressure..."), true);
							if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 5, 1, false, false));
							if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
								_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 5, 1, false, false));
							if (world instanceof ServerLevel _level)
								_level.sendParticles(ParticleTypes.SCULK_SOUL, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 1, 1, 2, 1, 0);
						}
					}
				}
			}
		}
	}
}
