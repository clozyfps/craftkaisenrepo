
package net.mcreator.craftkaisen.client.renderer;

public class MoonDregRenderer extends MobRenderer<MoonDregEntity, Modelmoondreg<MoonDregEntity>> {

	public MoonDregRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmoondreg(context.bakeLayer(Modelmoondreg.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(MoonDregEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/moondreg.png");
	}

}
