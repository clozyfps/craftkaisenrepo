
package net.mcreator.craftkaisen.client.renderer;

public class BassBoosterRenderer extends MobRenderer<BassBoosterEntity, Modelbass_booster<BassBoosterEntity>> {

	public BassBoosterRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbass_booster(context.bakeLayer(Modelbass_booster.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(BassBoosterEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/bass_booster.png");
	}

}
