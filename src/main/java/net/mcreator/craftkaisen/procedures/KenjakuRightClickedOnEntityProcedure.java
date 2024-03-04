package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

public class KenjakuRightClickedOnEntityProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		double randomquest = 0;
		if (((sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).race).equals("Curse")) {
			if (!(entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).DoingMission) {
				if (((sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Grade).equals("Special Grade")) {
					entity.getPersistentData().putDouble("randomquest", (Mth.nextInt(RandomSource.create(), 1, 3)));
					if (entity.getPersistentData().getDouble("randomquest") == 1) {
						if (sourceentity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("\u00A7a\u00A7l Defeat Satoru Gojo"), true);
						{
							String _setval = "Defeat Satoru Gojo";
							sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.CurrentMission = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
					}
					if (entity.getPersistentData().getDouble("randomquest") == 2) {
						if (sourceentity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("\u00A7a\u00A7l Defeat Ryomen Sukuna"), true);
						{
							String _setval = "Defeat Ryomen Sukuna";
							sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.CurrentMission = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
					}
					if (entity.getPersistentData().getDouble("randomquest") == 3) {
						if (sourceentity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("\u00A7a\u00A7l Defeat Yuta Okkotsu"), true);
						{
							String _setval = "Defeat Yuta Okkotsu";
							sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.CurrentMission = _setval;
								capability.syncPlayerVariables(sourceentity);
							});
						}
					}
				}
			}
		}
	}
}
