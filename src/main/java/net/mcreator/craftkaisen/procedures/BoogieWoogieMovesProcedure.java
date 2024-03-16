package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class BoogieWoogieMovesProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double xLook = 0;
		double yLook = 0;
		double zLook = 0;
		Entity targetOne = null;
		Entity targetTwo = null;
		if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput > 0) {
			if (!((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).LeftArmGone
					|| (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RightArmGone)) {
				if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentMove).equals("Clap")) {
					if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentCursedEnergy >= 20) {
						{
							double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentCursedEnergy - 20;
							entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.currentCursedEnergy = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						ClapProcedureProcedure.execute(world, x, y, z, entity);
						if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.COOLDOWN.get(), 15, 0, false, false));
					} else if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentCursedEnergy < 20) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("You need " + 20 + " cursed energy to use this move.")), true);
					}
					{
						String _setval = "";
						entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.currentMove = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			} else {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("You dont have the hands to perform boogie woogie."), true);
			}
		}
	}
}
