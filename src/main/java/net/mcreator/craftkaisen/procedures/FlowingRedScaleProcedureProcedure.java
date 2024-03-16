package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class FlowingRedScaleProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!entity.getPersistentData().getBoolean("flowingredscale")) {
			entity.getPersistentData().putBoolean("flowingredscale", true);
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("Flowing Red Scale."), true);
		} else if (entity.getPersistentData().getBoolean("flowingredscale")) {
			entity.getPersistentData().putBoolean("flowingredscale", false);
		}
	}
}
