
package net.mcreator.craftkaisen.client.renderer;

public class YoshinobuGakuganjiRenderer extends HumanoidMobRenderer<YoshinobuGakuganjiEntity, HumanoidModel<YoshinobuGakuganjiEntity>> {

	public YoshinobuGakuganjiRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));

	}

	@Override
	public ResourceLocation getTextureLocation(YoshinobuGakuganjiEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/yoshinobu_gakuganji.png");
	}

}
