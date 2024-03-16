package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

public class DomainClashPotionEffectStartedappliedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			boolean _setval = true;
			entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.predomain = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
