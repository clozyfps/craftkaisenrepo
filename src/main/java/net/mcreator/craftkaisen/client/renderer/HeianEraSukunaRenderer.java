
package net.mcreator.craftkaisen.client.renderer;

public class HeianEraSukunaRenderer extends MobRenderer<HeianEraSukunaEntity, ModelTrueSukuna<HeianEraSukunaEntity>> {

	public HeianEraSukunaRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelTrueSukuna(context.bakeLayer(ModelTrueSukuna.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(HeianEraSukunaEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/truesukunatexture.png");
	}

}
