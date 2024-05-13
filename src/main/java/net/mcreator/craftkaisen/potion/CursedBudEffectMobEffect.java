
package net.mcreator.craftkaisen.potion;

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
		CursedBudEffectOnEffectActiveTickProcedure.execute();
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}