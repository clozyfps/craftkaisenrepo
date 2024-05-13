
package net.mcreator.craftkaisen.client.renderer;

public class DeathWarm2Renderer extends MobRenderer<DeathWarm2Entity, Modeldeathswarm_fish<DeathWarm2Entity>> {

	public DeathWarm2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modeldeathswarm_fish(context.bakeLayer(Modeldeathswarm_fish.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(DeathWarm2Entity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/deathswarm2.png");
	}

}
