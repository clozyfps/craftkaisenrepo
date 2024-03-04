package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

public class TimersProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("cooldown1") > 0) {
			entity.getPersistentData().putDouble("cooldown1", (entity.getPersistentData().getDouble("cooldown1") - 1));
		}
		if (entity.getPersistentData().getDouble("cooldown2") > 0) {
			entity.getPersistentData().putDouble("cooldown2", (entity.getPersistentData().getDouble("cooldown2") - 1));
		}
		if (entity.getPersistentData().getDouble("cooldown3") > 0) {
			entity.getPersistentData().putDouble("cooldown3", (entity.getPersistentData().getDouble("cooldown3") - 1));
		}
		if (entity.getPersistentData().getDouble("cooldown4") > 0) {
			entity.getPersistentData().putDouble("cooldown4", (entity.getPersistentData().getDouble("cooldown4") - 1));
		}
		if (entity.getPersistentData().getDouble("cooldown5") > 0) {
			entity.getPersistentData().putDouble("cooldown5", (entity.getPersistentData().getDouble("cooldown5") - 1));
		}
		if (entity.getPersistentData().getDouble("cooldown6") > 0) {
			entity.getPersistentData().putDouble("cooldown6", (entity.getPersistentData().getDouble("cooldown6") - 1));
		}
	}
}
