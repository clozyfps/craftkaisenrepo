
package net.mcreator.craftkaisen.client.renderer;

public class DagonRenderer extends HumanoidMobRenderer<DagonEntity, HumanoidModel<DagonEntity>> {

	public DagonRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));

	}

	@Override
	public ResourceLocation getTextureLocation(DagonEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/dagontexture.png");
	}

}
