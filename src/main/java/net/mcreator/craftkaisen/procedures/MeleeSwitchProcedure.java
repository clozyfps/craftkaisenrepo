package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

public class MeleeSwitchProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("maxMoves", 7);
		if (entity.getPersistentData().getDouble("moveNumber") == 1) {
			entity.getPersistentData().putString("moveDisplay", "Strong Punch");
			entity.getPersistentData().putDouble("moveCost", 3);
		} else if (entity.getPersistentData().getDouble("moveNumber") == 2) {
			entity.getPersistentData().putString("moveDisplay", "Grab");
			entity.getPersistentData().putDouble("moveCost", 4);
		} else if (entity.getPersistentData().getDouble("moveNumber") == 3) {
			entity.getPersistentData().putString("moveDisplay", "Punch Barrage");
			entity.getPersistentData().putDouble("moveCost", 8);
		} else if (entity.getPersistentData().getDouble("moveNumber") == 4) {
			entity.getPersistentData().putString("moveDisplay", "Slam");
			entity.getPersistentData().putDouble("moveCost", 11);
		} else if (entity.getPersistentData().getDouble("moveNumber") == 5) {
			entity.getPersistentData().putString("moveDisplay", "Throw");
			entity.getPersistentData().putDouble("moveCost", 15);
		} else if (entity.getPersistentData().getDouble("moveNumber") == 6) {
			entity.getPersistentData().putString("moveDisplay", "Critical Jab");
			entity.getPersistentData().putDouble("moveCost", 20);
		} else if (entity.getPersistentData().getDouble("moveNumber") == 7) {
			entity.getPersistentData().putString("moveDisplay", "Follow Up Punch");
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Sukuna Vessel")) {
				entity.getPersistentData().putDouble("moveCost", 15);
			} else if (!((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Sukuna Vessel")) {
				entity.getPersistentData().putDouble("moveCost", 45);
			}
		}
	}
}
