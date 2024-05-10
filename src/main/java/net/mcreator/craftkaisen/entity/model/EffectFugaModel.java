package net.mcreator.craftkaisen.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class EffectFugaModel extends GeoModel<EffectFugaEntity> {
	@Override
	public ResourceLocation getAnimationResource(EffectFugaEntity entity) {
		return new ResourceLocation("craft_kaisen", "animations/fugaeefect.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(EffectFugaEntity entity) {
		return new ResourceLocation("craft_kaisen", "geo/fugaeefect.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(EffectFugaEntity entity) {
		return new ResourceLocation("craft_kaisen", "textures/entities/" + entity.getTexture() + ".png");
	}

}