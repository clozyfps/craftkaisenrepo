
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.DeathWarm2Entity;
import net.mcreator.craftkaisen.client.model.Modeldeathswarm_fish;

public class DeathWarm2Renderer extends MobRenderer<DeathWarm2Entity, Modeldeathswarm_fish<DeathWarm2Entity>> {
	public DeathWarm2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modeldeathswarm_fish(context.bakeLayer(Modeldeathswarm_fish.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(DeathWarm2Entity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/deathswarm2.png");
	}
}
