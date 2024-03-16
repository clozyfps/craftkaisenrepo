package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

public class SetStats2Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).reputation > 0
				&& !((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).affiliation).equals("Sorcerer")) {
			{
				String _setval = "Civilian";
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.affiliation = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).reputation < 0
				&& !((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).affiliation).equals("Sorcerer")) {
			{
				String _setval = "Curse User";
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.affiliation = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
