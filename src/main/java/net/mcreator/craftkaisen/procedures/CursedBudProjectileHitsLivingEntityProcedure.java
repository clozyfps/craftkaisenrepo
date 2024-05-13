package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class CursedBudProjectileHitsLivingEntityProcedure {
	public static void execute(Entity entity, Entity immediatesourceentity) {
		if (entity == null || immediatesourceentity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
			_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.CURSED_BUD_EFFECT.get(), 60, 1, false, false));
		if (!immediatesourceentity.level.isClientSide())
			immediatesourceentity.discard();
	}
}
