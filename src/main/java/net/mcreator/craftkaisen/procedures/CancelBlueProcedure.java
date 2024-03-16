package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.init.CraftKaisenModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class CancelBlueProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity());
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(CraftKaisenModMobEffects.LAPSE_BLUE_CONTROL.get())) {
			if (Math.random() < 0.1) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(CraftKaisenModMobEffects.LAPSE_BLUE_CONTROL.get());
			}
		}
	}
}
