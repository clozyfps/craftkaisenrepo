package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;
import net.mcreator.craftkaisen.init.CraftKaisenModMobEffects;

public class SimpleDomainCallProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double xRadius = 0;
		double zRadius = 0;
		double degree = 0;
		double x_pos = 0;
		double y_pos = 0;
		double z_pos = 0;
		if (entity.getPersistentData().getDouble("simpledomainlevel") > 0) {
			degree = Math.toRadians(entity.getYRot());
			xRadius = entity.getPersistentData().getDouble("simpledomainlevel");
			zRadius = entity.getPersistentData().getDouble("simpledomainlevel");
			for (int index0 = 0; index0 < 36; index0++) {
				x_pos = x + Math.cos(degree) * xRadius;
				y_pos = y + 0.1;
				z_pos = z + Math.sin(degree) * zRadius;
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x_pos, y_pos, z_pos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:dust 0.26 0.7 0.92 1 ^0 ^0 ^0 0.1 0.1 0.1 0 1");
				if (Mth.nextInt(RandomSource.create(), 1, 2) == 1) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3(x_pos, y_pos, z_pos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle minecraft:dust 0.26 0.7 0.92 1 ^0 ^0.3 ^0 0.1 0.1 0.1 0 1");
				}
				degree = degree + Math.toRadians(5);
			}
			degree = Math.toRadians(entity.getYRot());
			xRadius = entity.getPersistentData().getDouble("simpledomainlevel") * (-1);
			zRadius = entity.getPersistentData().getDouble("simpledomainlevel") * (-1);
			for (int index1 = 0; index1 < 36; index1++) {
				x_pos = x + Math.cos(degree) * xRadius;
				y_pos = y + 0.1;
				z_pos = z + Math.sin(degree) * zRadius;
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x_pos, y_pos, z_pos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"particle minecraft:dust 0.26 0.7 0.92 1 ^0 ^0 ^0 0.1 0.1 0.1 0 1");
				if (Mth.nextInt(RandomSource.create(), 1, 2) == 1) {
					if (world instanceof ServerLevel _level)
						_level.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, new Vec3(x_pos, y_pos, z_pos), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"particle minecraft:dust 0.26 0.7 0.92 1 ^0 ^0.3 ^0 0.1 0.1 0.1 0 1");
				}
				degree = degree + Math.toRadians(5);
			}
		} else if (entity.getPersistentData().getDouble("simpledomainlevel") <= 0) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(CraftKaisenModMobEffects.SIMPLE_DOMAIN.get());
			entity.getPersistentData().putDouble("simpledomainlevel", 4);
			entity.getPersistentData().putDouble(("cooldown" + new java.text.DecimalFormat("#").format(entity.getPersistentData().getDouble("coolset"))), 700);
		}
		{
			double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentCursedEnergy - 2;
			entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.currentCursedEnergy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentCursedEnergy <= 0) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(CraftKaisenModMobEffects.SIMPLE_DOMAIN.get());
			entity.getPersistentData().putDouble(("cooldown" + new java.text.DecimalFormat("#").format(entity.getPersistentData().getDouble("coolset"))), 700);
			entity.getPersistentData().putDouble("simpledomainlevel", 4);
		}
	}
}
