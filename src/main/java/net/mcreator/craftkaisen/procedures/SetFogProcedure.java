package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.client.event.ViewportEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.client.renderer.FogRenderer;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.Minecraft;

import net.mcreator.craftkaisen.init.CraftKaisenModMobEffects;

import javax.annotation.Nullable;

import com.mojang.blaze3d.shaders.FogShape;

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
