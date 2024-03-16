package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;
import net.mcreator.craftkaisen.init.CraftKaisenModGameRules;

public class ExpProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double randomperk = 0;
		if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp >= (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new CraftKaisenModVariables.PlayerVariables())).maxExp) {
			if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).level < 100
					&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).PrestigeLevel == 0
					|| world.getLevelData().getGameRules().getBoolean(CraftKaisenModGameRules.SMP_SETTING) == true
							&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).level < 200
							&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).PrestigeLevel == 0
							&& ((entity.getDisplayName().getString()).equals("vin_jo") || (entity.getDisplayName().getString()).equals("Void_Asriel"))) {
				LevelUpPlayerProcedure.execute(world, x, y, z, entity);
			}
			if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).level < 200
					&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).PrestigeLevel == 1
					|| world.getLevelData().getGameRules().getBoolean(CraftKaisenModGameRules.SMP_SETTING) == true
							&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).level < 300
							&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).PrestigeLevel == 1
							&& ((entity.getDisplayName().getString()).equals("vin_jo") || (entity.getDisplayName().getString()).equals("Void_Asriel"))) {
				LevelUpPlayerProcedure.execute(world, x, y, z, entity);
			}
			if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).level < 300
					&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).PrestigeLevel == 2
					|| world.getLevelData().getGameRules().getBoolean(CraftKaisenModGameRules.SMP_SETTING) == true
							&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).level < 400
							&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).PrestigeLevel == 2
							&& ((entity.getDisplayName().getString()).equals("vin_jo") || (entity.getDisplayName().getString()).equals("Void_Asriel"))) {
				LevelUpPlayerProcedure.execute(world, x, y, z, entity);
			}
			if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).level < 400
					&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).PrestigeLevel == 3
					|| world.getLevelData().getGameRules().getBoolean(CraftKaisenModGameRules.SMP_SETTING) == true
							&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).level < 500
							&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).PrestigeLevel == 3
							&& ((entity.getDisplayName().getString()).equals("vin_jo") || (entity.getDisplayName().getString()).equals("Void_Asriel"))) {
				LevelUpPlayerProcedure.execute(world, x, y, z, entity);
			}
			if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).level < 500
					&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).PrestigeLevel == 4
					|| world.getLevelData().getGameRules().getBoolean(CraftKaisenModGameRules.SMP_SETTING) == true
							&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).level < 600
							&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).PrestigeLevel == 5
							&& ((entity.getDisplayName().getString()).equals("vin_jo") || (entity.getDisplayName().getString()).equals("Void_Asriel"))) {
				LevelUpPlayerProcedure.execute(world, x, y, z, entity);
			}
		}
		if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Lives > 2) {
			{
				double _setval = 2;
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Lives = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
