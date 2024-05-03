package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.mcreator.craftkaisen.init.CraftKaisenModMobEffects;

public class ShadersTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		String ShaderLocation = "";
		boolean YourFirstCondition = false;
		boolean YourSecondCondition = false;
		boolean YourCondition = false;
		if (world.isClientSide() && entity instanceof Player) {
			if (entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(CraftKaisenModMobEffects.IFRAME_EFFECT.get())) {
				if (Minecraft.getInstance().gameRenderer.currentEffect() == null) {
					Minecraft.getInstance().gameRenderer.loadEffect(new ResourceLocation("craft_kaisen:shaders/post/black_and_white.json"));
				}
			} else {
				if (Minecraft.getInstance().gameRenderer.currentEffect() != null) {
					Minecraft.getInstance().gameRenderer.shutdownEffect();
				}
			}
		}
	}
}
