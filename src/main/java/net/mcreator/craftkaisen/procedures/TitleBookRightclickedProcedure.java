package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class TitleBookRightclickedProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		itemstack.shrink(1);
		{
			String _setval = entity.getPersistentData().getString("titlebookname");
			entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.Title = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		entity.getPersistentData().putString("titlebookname", "");
	}
}
