package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

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
		if (entity.isShiftKeyDown()) {
			VoidRemoveProcedure.execute(world, x, y, z);
		} else {
			if (world.isClientSide()) {
				if (entity instanceof AbstractClientPlayer player) {
					var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation("craft_kaisen", "player_animation"));
					if (animation != null) {
						animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(new ResourceLocation("craft_kaisen", "fuga1"))));
					}
				}
			}
		}
	}
}
