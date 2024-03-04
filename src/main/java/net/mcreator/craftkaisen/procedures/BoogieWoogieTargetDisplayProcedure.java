package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

public class BoogieWoogieTargetDisplayProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return "Automatic Swap: " + entity.getPersistentData().getString("boogiepartner");
	}
}
