
package net.mcreator.craftkaisen.client.renderer;

public class InventoryCurseMobRenderer extends MobRenderer<InventoryCurseMobEntity, ModelInventoryCurse<InventoryCurseMobEntity>> {

	public InventoryCurseMobRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelInventoryCurse(context.bakeLayer(ModelInventoryCurse.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(InventoryCurseMobEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/invcursetex.png");
	}

}
