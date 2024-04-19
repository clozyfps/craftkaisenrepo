package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class OnWorldStartProcedure {
	public static void execute(LevelAccessor world) {
		CraftKaisenModVariables.MapVariables.get(world).neary = 75;
		CraftKaisenModVariables.MapVariables.get(world).syncData(world);
	}
}
