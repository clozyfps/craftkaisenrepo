package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class EffectFugaOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		CraftKaisenMod.queueServerWork(35, () -> {
			if (!entity.level.isClientSide())
				entity.discard();
		});
	}
}
