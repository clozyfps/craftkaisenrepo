
package net.mcreator.craftkaisen.client.renderer;

public class DagonRenderer extends MobRenderer<DagonEntity, ModelDagon<DagonEntity>> {

	public DagonRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelDagon(context.bakeLayer(ModelDagon.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(DagonEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/dagontexture.png");
	}

}
