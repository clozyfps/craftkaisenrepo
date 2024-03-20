
package net.mcreator.craftkaisen.client.renderer;

public class FingerBearerRenderer extends MobRenderer<FingerBearerEntity, ModelFingerBearernew<FingerBearerEntity>> {

	public FingerBearerRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFingerBearernew(context.bakeLayer(ModelFingerBearernew.LAYER_LOCATION)), 0.5f);

	}

	@Override
	protected void scale(FingerBearerEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(1.03f, 1.03f, 1.03f);
	}

	@Override
	public ResourceLocation getTextureLocation(FingerBearerEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/fingerbearertexture.png");
	}

}
