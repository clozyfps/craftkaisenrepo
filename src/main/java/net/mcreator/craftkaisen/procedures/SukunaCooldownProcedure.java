package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

public class SukunaCooldownProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("sukunacooldown")) {
			entity.getPersistentData().putDouble("sctimer", (entity.getPersistentData().getDouble("sctimer") - 1));
			if (entity.getPersistentData().getDouble("sctimer") == 0) {
				entity.getPersistentData().putBoolean("sukunacooldown", false);
			}
		}
	}
}
