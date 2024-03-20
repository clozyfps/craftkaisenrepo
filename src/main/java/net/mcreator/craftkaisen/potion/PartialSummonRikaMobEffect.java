
package net.mcreator.craftkaisen.potion;

public class PartialSummonRikaMobEffect extends MobEffect {
	public PartialSummonRikaMobEffect() {
		super(MobEffectCategory.NEUTRAL, -1);
	}

	@Override
	public String getDescriptionId() {
		return "effect.craft_kaisen.partial_summon_rika";
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		PartialSummonRikaOnEffectActiveTickProcedure.execute();
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		PartialSummonRikaEffectExpiresProcedure.execute();
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