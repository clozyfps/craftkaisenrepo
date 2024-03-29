package net.mcreator.craftkaisen.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class RainbowDragonModel extends GeoModel<RainbowDragonEntity> {
	@Override
	public ResourceLocation getAnimationResource(RainbowDragonEntity entity) {
		return new ResourceLocation("craft_kaisen", "animations/rainbowdragon.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RainbowDragonEntity entity) {
		return new ResourceLocation("craft_kaisen", "geo/rainbowdragon.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RainbowDragonEntity entity) {
		return new ResourceLocation("craft_kaisen", "textures/entities/" + entity.getTexture() + ".png");
	}

}