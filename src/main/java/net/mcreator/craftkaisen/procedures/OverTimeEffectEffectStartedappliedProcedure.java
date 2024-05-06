package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;
import net.mcreator.craftkaisen.init.CraftKaisenModEntities;

public class OverTimeEffectEffectStartedappliedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel _serverLevel) {
			Entity entitytospawn = CraftKaisenModEntities.OVERTIME.get().spawn(_serverLevel, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
			if (entitytospawn != null) {
				entitytospawn.setYRot(world.getRandom().nextFloat() * 360.0F);
			}
			{
				double _setval = Mth.nextDouble(RandomSource.create(), 1, 99999999);
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.OverTimeNBT = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			(entitytospawn).getPersistentData().putDouble("overtimenbt", ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).OverTimeNBT));
		}
	}
}
