package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class TestRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		BlockState blockanother = Blocks.AIR.defaultBlockState();
		double myx = 0;
		double myy = 0;
		double myz = 0;
		String blocktext = "";
		String block = "";
		VoidRemoveProcedure.execute(world, x, y, z);
		DisasterTidesDomainExpasionProcedure.execute(world, x, y, z, entity);
	}
}
