
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.MalevolentShrineEntity;
import net.mcreator.craftkaisen.client.model.Modelmalevolent_kitchen;

public class MalevolentShrineRenderer extends MobRenderer<MalevolentShrineEntity, Modelmalevolent_kitchen<MalevolentShrineEntity>> {
	public MalevolentShrineRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmalevolent_kitchen(context.bakeLayer(Modelmalevolent_kitchen.LAYER_LOCATION)), 20f);
	}

	@Override
	public ResourceLocation getTextureLocation(MalevolentShrineEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/malevolent_shrine.png");
	}
}
