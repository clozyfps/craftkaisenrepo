
package net.mcreator.craftkaisen.client.renderer;

public class FlyingCursedSpiritRenderer extends MobRenderer<FlyingCursedSpiritEntity, ModelFlyingCurseSpirit<FlyingCursedSpiritEntity>> {

	public FlyingCursedSpiritRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFlyingCurseSpirit(context.bakeLayer(ModelFlyingCurseSpirit.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(FlyingCursedSpiritEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/flyingcursespirittexture.png");
	}

}
