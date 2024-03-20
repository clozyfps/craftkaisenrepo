
package net.mcreator.craftkaisen.client.renderer;

public class EmberInsectRenderer extends MobRenderer<EmberInsectEntity, ModelEmberInsect<EmberInsectEntity>> {

	public EmberInsectRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelEmberInsect(context.bakeLayer(ModelEmberInsect.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(EmberInsectEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/emberinsecttexture.png");
	}

}
