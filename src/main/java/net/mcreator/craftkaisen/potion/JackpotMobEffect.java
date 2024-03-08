
package net.mcreator.craftkaisen.potion;

public class JackpotMobEffect extends MobEffect {
	public JackpotMobEffect() {
		super(MobEffectCategory.NEUTRAL, -13369600);
	}

	@Override
	public String getDescriptionId() {
		return "effect.craft_kaisen.jackpot";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}