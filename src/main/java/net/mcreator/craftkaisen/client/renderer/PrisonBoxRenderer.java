
package net.mcreator.craftkaisen.client.renderer;

public class PrisonBoxRenderer extends MobRenderer<PrisonBoxEntity, Modelprisonbox<PrisonBoxEntity>> {

	public PrisonBoxRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelprisonbox(context.bakeLayer(Modelprisonbox.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(PrisonBoxEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/prisonrealmtextureunsealed.png");
	}

}
