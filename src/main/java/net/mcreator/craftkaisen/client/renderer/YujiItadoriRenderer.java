
package net.mcreator.craftkaisen.client.renderer;

public class YujiItadoriRenderer extends MobRenderer<YujiItadoriEntity, ModelItadoriYuji<YujiItadoriEntity>> {

	public YujiItadoriRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelItadoriYuji(context.bakeLayer(ModelItadoriYuji.LAYER_LOCATION)), 0.5f);

		this.addLayer(new RenderLayer<YujiItadoriEntity, ModelItadoriYuji<YujiItadoriEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("craft_kaisen:textures/entities/yujikunatexture.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, YujiItadoriEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level;
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (YujiItadoriDisplayConditionProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					EntityModel model = new ModelYujikuna(Minecraft.getInstance().getEntityModels().bakeLayer(ModelYujikuna.LAYER_LOCATION));
					this.getParentModel().copyPropertiesTo(model);
					model.prepareMobModel(entity, limbSwing, limbSwingAmount, partialTicks);
					model.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
					model.renderToBuffer(poseStack, vertexConsumer, 15728640, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(YujiItadoriEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/itadoriyujitexture.png");
	}

}
