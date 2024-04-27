
package net.mcreator.craftkaisen.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.craftkaisen.entity.MoonDregEntity;
import net.mcreator.craftkaisen.client.model.Modelmoondreg;

public class MoonDregRenderer extends MobRenderer<MoonDregEntity, Modelmoondreg<MoonDregEntity>> {
	public MoonDregRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmoondreg(context.bakeLayer(Modelmoondreg.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MoonDregEntity entity) {
		return new ResourceLocation("craft_kaisen:textures/entities/moondreg.png");
	}
}
