package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class TestRightclickedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		BlockState blockanother = Blocks.AIR.defaultBlockState();
		double myx = 0;
		double myy = 0;
		double myz = 0;
		String blocktext = "";
		String block = "";
		entity.getPersistentData().putDouble("repeventtimer", 15000);
		{
			double _setval = -5;
			entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.reputation = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
