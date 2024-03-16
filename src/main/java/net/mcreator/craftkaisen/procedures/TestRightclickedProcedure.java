package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

public class TestRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		BlockState blockanother = Blocks.AIR.defaultBlockState();
		double myx = 0;
		double myy = 0;
		double myz = 0;
		String blocktext = "";
		String block = "";
		{
			String _setval = "Unlimited Void";
			entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.currentMove = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentMove).equals("Unlimited Void")) {
			if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput > 0) {
				UnlimitedVoidProcedureProcedure.execute(world, x, y, z, entity);
			} else {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("1"), false);
			}
		} else {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("2"), false);
		}
	}
}
