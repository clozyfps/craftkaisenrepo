
package net.mcreator.craftkaisen.client.renderer;

public class OpenPrisonBoxRenderer extends MobRenderer<OpenPrisonBoxEntity, Modelprison_realm_mob<OpenPrisonBoxEntity>> {

	public OpenPrisonBoxRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelprison_realm_mob(context.bakeLayer(Modelprison_realm_mob.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(OpenPrisonBoxEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/prmobtextureremake.png");
	}

}
