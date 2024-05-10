package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class MaxBlueOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:blood")), SoundSource.NEUTRAL, 1, (float) 1.3);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:blood")), SoundSource.NEUTRAL, 1, (float) 1.3, false);
			}
		}
		CraftKaisenMod.queueServerWork(160, () -> {
			if (!entity.level.isClientSide())
				entity.discard();
		});
	}
}
