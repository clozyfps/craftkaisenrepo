
package net.mcreator.craftkaisen.client.renderer;

public class NobaraKugisakiRenderer extends HumanoidMobRenderer<NobaraKugisakiEntity, HumanoidModel<NobaraKugisakiEntity>> {

	public NobaraKugisakiRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));

	}

	@Override
	public ResourceLocation getTextureLocation(NobaraKugisakiEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/nobara_jujutsu_kaisen.png");
	}

}
