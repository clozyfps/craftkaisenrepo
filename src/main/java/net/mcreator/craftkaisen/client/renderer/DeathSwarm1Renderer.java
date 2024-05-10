
package net.mcreator.craftkaisen.client.renderer;

public class DeathSwarm1Renderer extends MobRenderer<DeathSwarm1Entity, Modeldeathswarm_fish<DeathSwarm1Entity>> {

	public DeathSwarm1Renderer(EntityRendererProvider.Context context) {
		super(context, new Modeldeathswarm_fish(context.bakeLayer(Modeldeathswarm_fish.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(DeathSwarm1Entity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/deathswarm1.png");
	}

}
