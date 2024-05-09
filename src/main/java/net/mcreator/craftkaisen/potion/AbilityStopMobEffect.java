
package net.mcreator.craftkaisen.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class AbilityStopMobEffect extends MobEffect {
	public AbilityStopMobEffect() {
		super(MobEffectCategory.NEUTRAL, -3145728);
	}

	@Override
	public String getDescriptionId() {
		return "effect.craft_kaisen.ability_stop";
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
