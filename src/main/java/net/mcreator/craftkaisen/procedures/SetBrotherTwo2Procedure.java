package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class SetBrotherTwo2Procedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments) {
		for (Entity entityiterator : new ArrayList<>(world.players())) {
			{
				boolean _setval = false;
				entityiterator.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.BortherTwoif = _setval;
					capability.syncPlayerVariables(entityiterator);
				});
			}
			if ((entityiterator.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).BrotherOneIf == true) {
				if (entityiterator instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal(("Your brother is " + (new Object() {
						public Entity getEntity() {
							try {
								return EntityArgument.getEntity(arguments, "name");
							} catch (CommandSyntaxException e) {
								e.printStackTrace();
								return null;
							}
						}
					}.getEntity()).getDisplayName().getString())), false);
			}
		}
		CraftKaisenModVariables.MapVariables.get(world).Brother2 = (new Object() {
			public Entity getEntity() {
				try {
					return EntityArgument.getEntity(arguments, "name");
				} catch (CommandSyntaxException e) {
					e.printStackTrace();
					return null;
				}
			}
		}.getEntity()).getDisplayName().getString();
		CraftKaisenModVariables.MapVariables.get(world).syncData(world);
		{
			boolean _setval = true;
			(new Object() {
				public Entity getEntity() {
					try {
						return EntityArgument.getEntity(arguments, "name");
					} catch (CommandSyntaxException e) {
						e.printStackTrace();
						return null;
					}
				}
			}.getEntity()).getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.BortherTwoif = _setval;
				capability.syncPlayerVariables((new Object() {
					public Entity getEntity() {
						try {
							return EntityArgument.getEntity(arguments, "name");
						} catch (CommandSyntaxException e) {
							e.printStackTrace();
							return null;
						}
					}
				}.getEntity()));
			});
		}
		if ((new Object() {
			public Entity getEntity() {
				try {
					return EntityArgument.getEntity(arguments, "name");
				} catch (CommandSyntaxException e) {
					e.printStackTrace();
					return null;
				}
			}
		}.getEntity()) instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(Component.literal(("Your brother is " + CraftKaisenModVariables.MapVariables.get(world).Brother1)), false);
	}
}
