package net.mcreator.craftkaisen.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftkaisen.entity.OvertimeEntity;

public class OvertimeModel extends GeoModel<OvertimeEntity> {
	@Override
	public ResourceLocation getAnimationResource(OvertimeEntity entity) {
		return new ResourceLocation("craft_kaisen", "animations/overtimemodel.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OvertimeEntity entity) {
		return new ResourceLocation("craft_kaisen", "geo/overtimemodel.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OvertimeEntity entity) {
		return new ResourceLocation("craft_kaisen", "textures/entities/" + entity.getTexture() + ".png");
	}

}
