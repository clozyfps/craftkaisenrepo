
package net.mcreator.craftkaisen.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.craftkaisen.procedures.CursedBudEffectOnEffectActiveTickProcedure;

public class CursedBudEffectMobEffect extends MobEffect {
	public CursedBudEffectMobEffect() {
		super(MobEffectCategory.NEUTRAL, -3407821);
	}

	@Override
	public String getDescriptionId() {
		return "effect.craft_kaisen.cursed_bud_effect";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		CursedBudEffectOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
