package net.mcreator.craftkaisen.client.renderer;

import com.mojang.math.Axis;

public class RedPachinkoBallProjectileRenderer extends EntityRenderer<RedPachinkoBallProjectileEntity> {

	private static final ResourceLocation texture = new ResourceLocation("craft_kaisen:textures/entities/pachinkored.png");

	private final Modelpachinko_ball model;

	public RedPachinkoBallProjectileRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelpachinko_ball(context.bakeLayer(Modelpachinko_ball.LAYER_LOCATION));
	}

	@Override
	public void render(RedPachinkoBallProjectileEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
		poseStack.popPose();

		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(RedPachinkoBallProjectileEntity entity) {
		return texture;
	}

}
