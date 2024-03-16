package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.init.CraftKaisenModMobEffects;

public class LapseBlueOverlayDisplayOverlayIngameProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(CraftKaisenModMobEffects.LAPSE_BLUE_CONTROL.get()) || entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(CraftKaisenModMobEffects.REVERSAL_RED_CONTROL.get())) {
			return true;
		}
		return false;
	}
}
