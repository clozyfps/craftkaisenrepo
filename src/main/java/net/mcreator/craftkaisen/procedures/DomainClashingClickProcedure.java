package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class DomainClashingClickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("DomainClashPoints", (entity.getPersistentData().getDouble("DomainClashPoints") + 1));
	}
}
