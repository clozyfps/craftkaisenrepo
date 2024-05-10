package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

public class InfinityProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("infinity") == true) {
			entity.getPersistentData().putBoolean("infinity", false);
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("Infinity Deactivated"), true);
			{
				String _setval = "Infinity: Off";
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.InfinityOverlay = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if (entity.getPersistentData().getBoolean("infinity") == false) {
			entity.getPersistentData().putBoolean("infinity", true);
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("Infinity Activated"), true);
			{
				String _setval = "Infinity: On";
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.InfinityOverlay = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
