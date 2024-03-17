package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

import java.util.ArrayList;

public class SetBrotherOneProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		for (Entity entityiterator : new ArrayList<>(world.players())) {
			{
				boolean _setval = false;
				entityiterator.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.BrotherOneIf = _setval;
					capability.syncPlayerVariables(entityiterator);
				});
			}
		}
		{
			boolean _setval = true;
			entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.BrotherOneIf = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
