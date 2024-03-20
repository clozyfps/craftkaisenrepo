
package net.mcreator.craftkaisen.client.renderer;

public class RoppongiCursedSpiritRenderer extends MobRenderer<RoppongiCursedSpiritEntity, ModelRoppongiCurse<RoppongiCursedSpiritEntity>> {

	public RoppongiCursedSpiritRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelRoppongiCurse(context.bakeLayer(ModelRoppongiCurse.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(RoppongiCursedSpiritEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/roppongicursetexture.png");
	}

}
