
package net.mcreator.craftkaisen.client.renderer;

public class WombDagonRenderer extends MobRenderer<WombDagonEntity, ModelWombDagon<WombDagonEntity>> {

	public WombDagonRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelWombDagon(context.bakeLayer(ModelWombDagon.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(WombDagonEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/wombdagontexture.png");
	}

}
