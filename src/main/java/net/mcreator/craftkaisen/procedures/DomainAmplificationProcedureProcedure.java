package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.craftkaisen.init.CraftKaisenModMobEffects;

public class DomainAmplificationProcedureProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(CraftKaisenModMobEffects.DOMAIN_AMPLIFICATION.get()))) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.DOMAIN_AMPLIFICATION.get(), 99999, 0, false, false));
		} else if (entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(CraftKaisenModMobEffects.DOMAIN_AMPLIFICATION.get())) {
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(CraftKaisenModMobEffects.DOMAIN_AMPLIFICATION.get());
		}
	}
}
