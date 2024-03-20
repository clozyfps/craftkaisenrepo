
package net.mcreator.craftkaisen.client.renderer;

public class RugbyFieldCursedSpiritRenderer extends MobRenderer<RugbyFieldCursedSpiritEntity, ModelRugbyFieldCurse<RugbyFieldCursedSpiritEntity>> {

	public RugbyFieldCursedSpiritRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelRugbyFieldCurse(context.bakeLayer(ModelRugbyFieldCurse.LAYER_LOCATION)), 0.5f);

	}

	@Override
	protected void scale(RugbyFieldCursedSpiritEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(1.3f, 1.3f, 1.3f);
	}

	@Override
	public ResourceLocation getTextureLocation(RugbyFieldCursedSpiritEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/rugbyfieldcursetexture.png");
	}

}
