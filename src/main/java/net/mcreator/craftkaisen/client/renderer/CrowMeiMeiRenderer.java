
package net.mcreator.craftkaisen.client.renderer;

public class CrowMeiMeiRenderer extends MobRenderer<CrowMeiMeiEntity, ModelCrowProjectileFlying<CrowMeiMeiEntity>> {

	public CrowMeiMeiRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelCrowProjectileFlying(context.bakeLayer(ModelCrowProjectileFlying.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(CrowMeiMeiEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/projectilecrow.png");
	}

}
