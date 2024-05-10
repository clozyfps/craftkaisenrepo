package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class OverTimeEffectEffectStartedappliedProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z
) {
if (world instanceof ServerLevel _serverLevel) {
Entity entitytospawn = CraftKaisenModEntities.OVERTIME.get().spawn(_serverLevel, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
if (entitytospawn != null) {
entitytospawn.setYRot(world.getRandom().nextFloat() * 360.0F);
}
(entitytospawn).getPersistentData().putDouble("overtimenbt", );
}
}
}
