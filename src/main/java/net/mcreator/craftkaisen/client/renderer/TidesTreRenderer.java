
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.TidesTreEntity;
import net.mcreator.craftkaisen.client.model.Modeltidestree;

import com.mojang.blaze3d.vertex.PoseStack;

public class TidesTreRenderer extends MobRenderer<TidesTreEntity, Modeltidestree<TidesTreEntity>> {
	public TidesTreRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltidestree(context.bakeLayer(Modeltidestree.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(TidesTreEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(2f, 2f, 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(TidesTreEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/tidetree.png");
	}
}
