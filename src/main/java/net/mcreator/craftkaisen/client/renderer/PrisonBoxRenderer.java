
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.PrisonBoxEntity;
import net.mcreator.craftkaisen.client.model.Modelprisonbox;

public class PrisonBoxRenderer extends MobRenderer<PrisonBoxEntity, Modelprisonbox<PrisonBoxEntity>> {
	public PrisonBoxRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelprisonbox(context.bakeLayer(Modelprisonbox.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PrisonBoxEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/prisonrealmtextureunsealed.png");
	}
}
