
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.BassBoosterEntity;
import net.mcreator.craftkaisen.client.model.Modelbass_booster;

public class BassBoosterRenderer extends MobRenderer<BassBoosterEntity, Modelbass_booster<BassBoosterEntity>> {
	public BassBoosterRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbass_booster(context.bakeLayer(Modelbass_booster.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BassBoosterEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/bass_booster.png");
	}
}
