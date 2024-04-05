package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

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
			if ((entityiterator.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).BortherTwoif == true) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("Your brother is " + entity.getDisplayName().getString())), false);
			}
		}
		{
			boolean _setval = true;
			entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.BrotherOneIf = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		CraftKaisenModVariables.MapVariables.get(world).Brother1 = entity.getDisplayName().getString();
		CraftKaisenModVariables.MapVariables.get(world).syncData(world);
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(Component.literal(("Your brother is " + CraftKaisenModVariables.MapVariables.get(world).Brother2)), false);
	}
}
