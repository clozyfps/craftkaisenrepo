package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber(value = {Dist.CLIENT})
public class SetFogColorProcedure {
	@SubscribeEvent
	public static void computeFogColor(ViewportEvent.ComputeFogColor event) {
		try {
			ClientLevel clientLevel = Minecraft.getInstance().level;
			Entity entity = event.getCamera().getEntity();
			execute(null, entity, event);
		} catch (Exception e) {
		}
	}

	public static void execute(Entity entity, ViewportEvent viewport) {
		execute(null, entity, viewport);
	}

	private static void execute(@Nullable Event event, Entity entity, ViewportEvent viewport) {
		if (entity == null || viewport == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(CraftKaisenModMobEffects.DELETED_MOD_ELEMENT.get())) {
			if (viewport instanceof ViewportEvent.ComputeFogColor _computeFogColor) {
				_computeFogColor.setRed(139 / 255.0F);
				_computeFogColor.setGreen(0 / 255.0F);
				_computeFogColor.setBlue(0 / 255.0F);
			}
		}
	}
}
