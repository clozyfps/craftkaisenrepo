package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber(value = {Dist.CLIENT})
public class SetFogProcedure {
	@SubscribeEvent
	public static void renderFog(ViewportEvent.RenderFog event) {
		try {
			if (event.getMode() == FogRenderer.FogMode.FOG_TERRAIN) {
				ClientLevel clientLevel = Minecraft.getInstance().level;
				Entity entity = event.getCamera().getEntity();
				execute(null, entity, event);
				event.setCanceled(true);
			}
		} catch (Exception e) {
		}
	}

	public static void execute(Entity entity, ViewportEvent viewport) {
		execute(null, entity, viewport);
	}

	private static void execute(@Nullable Event event, Entity entity, ViewportEvent viewport) {
		if (entity == null || viewport == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(CraftKaisenModMobEffects.RED_FOG.get())) {
			if (viewport instanceof ViewportEvent.RenderFog _renderFog) {
				_renderFog.setNearPlaneDistance(1);
				_renderFog.setFarPlaneDistance(100);
			}
			if (viewport instanceof ViewportEvent.RenderFog _renderFog) {
				_renderFog.setFogShape(FogShape.SPHERE);
			}
		}
	}
}
