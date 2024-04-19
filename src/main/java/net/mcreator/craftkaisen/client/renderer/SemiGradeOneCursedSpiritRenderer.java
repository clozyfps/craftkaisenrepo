
package net.mcreator.craftkaisen.client.renderer;

public class SemiGradeOneCursedSpiritRenderer extends MobRenderer<SemiGradeOneCursedSpiritEntity, Modelcursespirit1<SemiGradeOneCursedSpiritEntity>> {

	public SemiGradeOneCursedSpiritRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcursespirit1(context.bakeLayer(Modelcursespirit1.LAYER_LOCATION)), 0.5f);

	}

	@Override
	protected void scale(SemiGradeOneCursedSpiritEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(2f, 2f, 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(SemiGradeOneCursedSpiritEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/cursespirit1_texture.png");
	}

}
