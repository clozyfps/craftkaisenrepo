package net.mcreator.craftkaisen.entity.layer;

public class OvertimeLayer extends GeoRenderLayer<OvertimeEntity> {
	private static final ResourceLocation LAYER = new ResourceLocation("craft_kaisen", "textures/entities/ovetime.png");

	public OvertimeLayer(GeoRenderer<OvertimeEntity> entityRenderer) {
		super(entityRenderer);
	}

	@Override
	public void render(PoseStack poseStack, OvertimeEntity animatable, BakedGeoModel bakedModel, RenderType renderType, MultiBufferSource bufferSource, VertexConsumer buffer, float partialTick, int packedLight, int packedOverlay) {
		RenderType glowRenderType = RenderType.eyes(LAYER);
		getRenderer().reRender(getDefaultBakedModel(animatable), poseStack, bufferSource, animatable, glowRenderType, bufferSource.getBuffer(glowRenderType), partialTick, packedLight, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
	}
}