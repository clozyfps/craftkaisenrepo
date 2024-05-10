package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

public class ChargeCursedEnergyOnKeyReleasedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putBoolean("charging", false);
		{
			boolean _setval = false;
			entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.ChargeKeyDown = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
