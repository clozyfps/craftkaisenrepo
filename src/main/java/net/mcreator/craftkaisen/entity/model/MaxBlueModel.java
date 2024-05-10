package net.mcreator.craftkaisen.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class MaxBlueModel extends GeoModel<MaxBlueEntity> {
	@Override
	public ResourceLocation getAnimationResource(MaxBlueEntity entity) {
		return new ResourceLocation("craft_kaisen", "animations/maxblue.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MaxBlueEntity entity) {
		return new ResourceLocation("craft_kaisen", "geo/maxblue.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MaxBlueEntity entity) {
		return new ResourceLocation("craft_kaisen", "textures/entities/" + entity.getTexture() + ".png");
	}

}