package net.mcreator.craftkaisen.entity.layer;

public class EffectFugaLayer extends GeoRenderLayer<EffectFugaEntity> {
	private static final ResourceLocation LAYER = new ResourceLocation("craft_kaisen", "textures/entities/fugaeefect.png");

	public EffectFugaLayer(GeoRenderer<EffectFugaEntity> entityRenderer) {
		super(entityRenderer);
	}

	@Override
	public void render(PoseStack poseStack, EffectFugaEntity animatable, BakedGeoModel bakedModel, RenderType renderType, MultiBufferSource bufferSource, VertexConsumer buffer, float partialTick, int packedLight, int packedOverlay) {
		RenderType glowRenderType = RenderType.eyes(LAYER);
		getRenderer().reRender(getDefaultBakedModel(animatable), poseStack, bufferSource, animatable, glowRenderType, bufferSource.getBuffer(glowRenderType), partialTick, packedLight, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
	}
}