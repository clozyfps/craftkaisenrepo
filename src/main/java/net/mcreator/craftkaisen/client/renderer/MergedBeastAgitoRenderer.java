
package net.mcreator.craftkaisen.client.renderer;

public class MergedBeastAgitoRenderer extends MobRenderer<MergedBeastAgitoEntity, ModelMergedBeastAgito<MergedBeastAgitoEntity>> {

	public MergedBeastAgitoRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelMergedBeastAgito(context.bakeLayer(ModelMergedBeastAgito.LAYER_LOCATION)), 0.5f);

	}

	@Override
	protected void scale(MergedBeastAgitoEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(1.2f, 1.2f, 1.2f);
	}

	@Override
	public ResourceLocation getTextureLocation(MergedBeastAgitoEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/mergedbeastagitotexture.png");
	}

}
