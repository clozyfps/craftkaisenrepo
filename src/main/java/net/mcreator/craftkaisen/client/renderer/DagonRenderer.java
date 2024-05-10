
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.DagonEntity;
import net.mcreator.craftkaisen.client.model.ModelDagon;

public class DagonRenderer extends MobRenderer<DagonEntity, ModelDagon<DagonEntity>> {
	public DagonRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelDagon(context.bakeLayer(ModelDagon.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DagonEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/dagontexture.png");
	}
}
