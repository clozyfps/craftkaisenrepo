package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.init.CraftKaisenModEntities;
import net.mcreator.craftkaisen.init.CraftKaisenModBlocks;
import net.mcreator.craftkaisen.entity.TidesTreEntity;
import net.mcreator.craftkaisen.CraftKaisenMod;

public class DomainSandBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		CraftKaisenMod.queueServerWork(2, () -> {
			if (Mth.nextInt(RandomSource.create(), 1, 15) == 1) {
				if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == CraftKaisenModBlocks.DOMAIN_AIR_BLOCK.get() || (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR
						|| (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.CAVE_AIR) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new TidesTreEntity(CraftKaisenModEntities.TIDES_TRE.get(), _level);
						entityToSpawn.moveTo(x, (y + 1), z, 0, 0);
						entityToSpawn.setYBodyRot(0);
						entityToSpawn.setYHeadRot(0);
						entityToSpawn.setDeltaMovement(0, 0, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
		});
	}
}
