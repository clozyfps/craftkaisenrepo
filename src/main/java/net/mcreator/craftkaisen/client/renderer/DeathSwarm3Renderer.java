
package net.mcreator.craftkaisen.client.renderer;

public class DeathSwarm3Renderer extends MobRenderer<DeathSwarm3Entity, Modeldeathswarm_fish<DeathSwarm3Entity>> {

	public DeathSwarm3Renderer(EntityRendererProvider.Context context) {
		super(context, new Modeldeathswarm_fish(context.bakeLayer(Modeldeathswarm_fish.LAYER_LOCATION)), 0.5f);

	}

	@Override
	public ResourceLocation getTextureLocation(DeathSwarm3Entity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/deathswarm3.png");
	}

}
