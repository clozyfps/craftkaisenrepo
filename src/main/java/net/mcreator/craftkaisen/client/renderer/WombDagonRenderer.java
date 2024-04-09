
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.WombDagonEntity;
import net.mcreator.craftkaisen.client.model.ModelWombDagon;

public class WombDagonRenderer extends MobRenderer<WombDagonEntity, ModelWombDagon<WombDagonEntity>> {
	public WombDagonRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelWombDagon(context.bakeLayer(ModelWombDagon.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WombDagonEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/wombdagontexture.png");
	}
}
