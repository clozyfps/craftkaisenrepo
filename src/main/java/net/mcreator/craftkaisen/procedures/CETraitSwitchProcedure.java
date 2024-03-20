package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

public class CETraitSwitchProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("maxMoves", 3);
		if (entity.getPersistentData().getDouble("moveNumber") == 1) {
			entity.getPersistentData().putString("moveDisplay", "Lightning Bolt");
			entity.getPersistentData().putDouble("moveCost", 5);
		} else if (entity.getPersistentData().getDouble("moveNumber") == 2) {
			entity.getPersistentData().putString("moveDisplay", "Lightning Discharge");
			entity.getPersistentData().putDouble("moveCost", 15);
		} else if (entity.getPersistentData().getDouble("moveNumber") == 3) {
			entity.getPersistentData().putString("moveDisplay", "Strike");
			entity.getPersistentData().putDouble("moveCost", 20);
		}
	}
}
