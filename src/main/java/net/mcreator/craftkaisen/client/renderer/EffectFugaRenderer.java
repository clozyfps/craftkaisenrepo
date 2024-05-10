
package net.mcreator.craftkaisen.client.renderer;

public class EffectFugaRenderer extends GeoEntityRenderer<EffectFugaEntity> {
	public EffectFugaRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new EffectFugaModel());
		this.shadowRadius = 0.5f;
		this.addRenderLayer(new EffectFugaLayer(this));
	}

	@Override
	public RenderType getRenderType(EffectFugaEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, EffectFugaEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

}