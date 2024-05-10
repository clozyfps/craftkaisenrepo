package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

public class OnWorldStartProcedure {
	public static void execute(LevelAccessor world) {
		CraftKaisenModVariables.MapVariables.get(world).neary = 75;
		CraftKaisenModVariables.MapVariables.get(world).syncData(world);
	}
}
