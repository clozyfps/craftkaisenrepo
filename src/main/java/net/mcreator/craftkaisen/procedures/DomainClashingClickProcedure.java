package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

public class DomainClashingClickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("DomainClashPoints", (entity.getPersistentData().getDouble("DomainClashPoints") + 1));
		{
			double _setval = Mth.nextInt(RandomSource.create(), 1, 4);
			entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.DomainClashGame = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
