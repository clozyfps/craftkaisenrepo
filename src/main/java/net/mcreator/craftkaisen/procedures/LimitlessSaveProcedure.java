package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class LimitlessSaveProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		String newblock = "";
		BlockState newblocknew = Blocks.AIR.defaultBlockState();
		int horizontalRadiusSphere = (int) 20 - 1;
		int verticalRadiusSphere = (int) 20 - 1;
		int yIterationsSphere = verticalRadiusSphere;
		for (int i = -yIterationsSphere; i <= yIterationsSphere; i++) {
			for (int xi = -horizontalRadiusSphere; xi <= horizontalRadiusSphere; xi++) {
				for (int zi = -horizontalRadiusSphere; zi <= horizontalRadiusSphere; zi++) {
					double distanceSq = (xi * xi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere) + (i * i) / (double) (verticalRadiusSphere * verticalRadiusSphere)
							+ (zi * zi) / (double) (horizontalRadiusSphere * horizontalRadiusSphere);
					if (distanceSq <= 1.0) {
						newblocknew = (world.getBlockState(BlockPos.containing(x + xi, y + i, z + zi)));
					}
				}
			}
		}
	}
}
