
package net.mcreator.craftkaisen.client.renderer;

public class TidesTreRenderer extends MobRenderer<TidesTreEntity, Modeltidestree<TidesTreEntity>> {

	public TidesTreRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltidestree(context.bakeLayer(Modeltidestree.LAYER_LOCATION)), 0.5f);

	}

	@Override
	protected void scale(TidesTreEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(2f, 2f, 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(TidesTreEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/tidetree.png");
	}

}
