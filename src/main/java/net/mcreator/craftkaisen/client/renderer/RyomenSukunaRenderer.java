
package net.mcreator.craftkaisen.client.renderer;

public class RyomenSukunaRenderer extends MobRenderer<RyomenSukunaEntity, ModelYujikunaShirtless<RyomenSukunaEntity>> {

	public RyomenSukunaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelYujikunaShirtless(context.bakeLayer(ModelYujikunaShirtless.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(RyomenSukunaEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/yujikunashirtlesstexture.png");
	}

}
