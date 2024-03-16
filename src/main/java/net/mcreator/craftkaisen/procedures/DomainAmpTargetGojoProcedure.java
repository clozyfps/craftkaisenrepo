package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingEvent;

import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.craftkaisen.init.CraftKaisenModMobEffects;
import net.mcreator.craftkaisen.entity.SatoruGojoEntity;
import net.mcreator.craftkaisen.entity.RyomenSukunaEntity;
import net.mcreator.craftkaisen.entity.MegunaEntity;
import net.mcreator.craftkaisen.entity.JogoEntity;
import net.mcreator.craftkaisen.entity.HeianEraSukunaEntity;
import net.mcreator.craftkaisen.entity.HanamiEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DomainAmpTargetGojoProcedure {
	@SubscribeEvent
	public static void onEntityTick(LivingEvent.LivingTickEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof SatoruGojoEntity) {
			if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).isAlive()) {
				if (entity instanceof RyomenSukunaEntity || entity instanceof HeianEraSukunaEntity || entity instanceof MegunaEntity || entity instanceof JogoEntity || entity instanceof HanamiEntity) {
					if (!(entity instanceof LivingEntity _livEnt9 && _livEnt9.hasEffect(CraftKaisenModMobEffects.DOMAIN_AMPLIFICATION.get()))) {
						if (Math.random() < 0.5) {
							if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
								_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.DOMAIN_AMPLIFICATION.get(), 200, 0, false, false));
						}
					}
				}
			}
		}
	}
}
