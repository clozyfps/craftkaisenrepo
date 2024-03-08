package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ReserveBallsProcedureProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double doorchance = 0;
		doorchance = Mth.nextInt(RandomSource.create(), 1, 100);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:domain.spin")), SoundSource.NEUTRAL, (float) 0.3, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:domain.spin")), SoundSource.NEUTRAL, (float) 0.3, 1, false);
			}
		}
		if (doorchance >= 1 && doorchance >= 70) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new GreenPachinkoBallProjectileEntity(CraftKaisenModEntities.DELETED_MOD_ELEMENT.get(), _level);
				entityToSpawn.moveTo((entity.getX() + Mth.nextInt(RandomSource.create(), (int) (-0.75), (int) 0.75)), (entity.getY() + Mth.nextInt(RandomSource.create(), (int) (-0.1), (int) 0.5)),
						(entity.getZ() + Mth.nextInt(RandomSource.create(), (int) (-0.75), (int) 0.75)), 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				_level.addFreshEntity(entityToSpawn);
			}
		}
		if (doorchance >= 71 && doorchance >= 89) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new RedPachinkoBallProjectileEntity(CraftKaisenModEntities.RED_PACHINKO_BALL_PROJECTILE.get(), _level);
				entityToSpawn.moveTo((entity.getX() + Mth.nextInt(RandomSource.create(), (int) (-0.75), (int) 0.75)), (entity.getY() + Mth.nextInt(RandomSource.create(), (int) (-0.1), (int) 0.5)),
						(entity.getZ() + Mth.nextInt(RandomSource.create(), (int) (-0.75), (int) 0.75)), 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				_level.addFreshEntity(entityToSpawn);
			}
		}
		if (doorchance >= 90 && doorchance >= 99) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new GoldPachinkoBallProjectileEntity(CraftKaisenModEntities.GOLD_PACHINKO_BALL_PROJECTILE.get(), _level);
				entityToSpawn.moveTo((entity.getX() + Mth.nextInt(RandomSource.create(), (int) (-0.75), (int) 0.75)), (entity.getY() + Mth.nextInt(RandomSource.create(), (int) (-0.1), (int) 0.5)),
						(entity.getZ() + Mth.nextInt(RandomSource.create(), (int) (-0.75), (int) 0.75)), 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				_level.addFreshEntity(entityToSpawn);
			}
		}
		if (doorchance == 100) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new RainbowPachinkoBallProjectileEntity(CraftKaisenModEntities.DELETED_MOD_ELEMENT.get(), _level);
				entityToSpawn.moveTo((entity.getX() + Mth.nextInt(RandomSource.create(), (int) (-0.75), (int) 0.75)), (entity.getY() + Mth.nextInt(RandomSource.create(), (int) (-0.1), (int) 0.5)),
						(entity.getZ() + Mth.nextInt(RandomSource.create(), (int) (-0.75), (int) 0.75)), 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				entityToSpawn.setDeltaMovement(0, 0, 0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}
