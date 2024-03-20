package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

public class RepEventsProcedure {
	public static void execute(LevelAccessor world, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).reputation < -5) {
			entity.getPersistentData().putDouble("repeventtimer", (entity.getPersistentData().getDouble("repeventtimer") - 1));
			if (entity.getPersistentData().getDouble("repeventtimer") >= 15000) {
				entity.getPersistentData().putDouble("repeventtimer", 0);
				entity.getPersistentData().putDouble("repevent", 1);
				if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).YutaEventHappened == false) {
					if (entity.getPersistentData().getDouble("repevent") == 1) {
						YutaAmbushProcedureProcedure.execute(world, y, z, entity);
						{
							boolean _setval = true;
							entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.YutaEventHappened = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				}
			}
		}
	}
}
