
package net.mcreator.craftkaisen.potion;

import net.minecraftforge.client.extensions.common.IClientMobEffectExtensions;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.client.gui.screens.inventory.EffectRenderingInventoryScreen;

import net.mcreator.craftkaisen.procedures.FrozenSolidOnEffectActiveTickProcedure;
import net.mcreator.craftkaisen.procedures.FrozenSolidEffectStartedappliedProcedure;

import com.mojang.blaze3d.vertex.PoseStack;

public class FrozenSolidMobEffect extends MobEffect {
	public FrozenSolidMobEffect() {
		super(MobEffectCategory.NEUTRAL, -10040065);
	}

	@Override
	public String getDescriptionId() {
		return "effect.craft_kaisen.frozen_solid";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		FrozenSolidEffectStartedappliedProcedure.execute(entity.level, entity);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		FrozenSolidOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public void initializeClient(java.util.function.Consumer<IClientMobEffectExtensions> consumer) {
		consumer.accept(new IClientMobEffectExtensions() {
			@Override
			public boolean isVisibleInInventory(MobEffectInstance effect) {
				return false;
			}

			@Override
			public boolean renderInventoryText(MobEffectInstance instance, EffectRenderingInventoryScreen<?> screen, PoseStack poseStack, int x, int y, int blitOffset) {
				return false;
			}

			@Override
			public boolean isVisibleInGui(MobEffectInstance effect) {
				return false;
			}
		});
	}
}
