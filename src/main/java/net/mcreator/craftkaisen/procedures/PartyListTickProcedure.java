package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

import java.util.ArrayList;

public class PartyListTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).PartyRole).equals("Leader")) {
			for (Entity entityiterator : new ArrayList<>(world.players())) {
				if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Squad).contains(entityiterator.getDisplayName().getString())) {
					{
						String _setval = (entityiterator.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Squad;
						entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Squad = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		}
	}
}
