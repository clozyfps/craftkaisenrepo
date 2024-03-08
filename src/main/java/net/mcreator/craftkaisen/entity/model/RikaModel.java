package net.mcreator.craftkaisen.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.craftkaisen.entity.RikaEntity;

public class RikaModel extends GeoModel<RikaEntity> {
	@Override
	public ResourceLocation getAnimationResource(RikaEntity entity) {
		return new ResourceLocation("craft_kaisen", "animations/rika.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RikaEntity entity) {
		return new ResourceLocation("craft_kaisen", "geo/rika.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RikaEntity entity) {
		return new ResourceLocation("craft_kaisen", "textures/entities/" + entity.getTexture() + ".png");
	}

}
