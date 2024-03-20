package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class SetSoundAmpProcedure {
	public static void execute(CommandContext<CommandSourceStack> arguments) {
		{
			String _setval = "Sound Amplification";
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
				capability.technique = _setval;
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
		}.getEntity()) instanceof Player _player) {
			ItemStack _setstack = new ItemStack(CraftKaisenModItems.ELECTRIC_GUITAR.get());
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
	}
}
