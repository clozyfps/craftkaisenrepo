
package net.mcreator.craftkaisen.potion;

public class UnstableMobEffect extends MobEffect {
	public UnstableMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.craft_kaisen.unstable";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}