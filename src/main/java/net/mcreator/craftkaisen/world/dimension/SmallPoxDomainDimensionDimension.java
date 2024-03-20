
package net.mcreator.craftkaisen.world.dimension;

@Mod.EventBusSubscriber
public class SmallPoxDomainDimensionDimension {
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
	public static class DimensionSpecialEffectsHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public static void registerDimensionSpecialEffects(RegisterDimensionSpecialEffectsEvent event) {
			DimensionSpecialEffects customEffect = new DimensionSpecialEffects(Float.NaN, true, DimensionSpecialEffects.SkyType.NONE, false, false) {
				@Override
				public Vec3 getBrightnessDependentFogColor(Vec3 color, float sunHeight) {
					return new Vec3(0.2, 0.3019607843, 0.4117647059);
				}

				@Override
				public boolean isFoggyAt(int x, int y) {
					return true;
				}
			};
			event.register(new ResourceLocation("craft_kaisen:small_pox_domain_dimension"), customEffect);
		}
	}

	@SubscribeEvent
	public static void onPlayerChangedDimensionEvent(PlayerEvent.PlayerChangedDimensionEvent event) {
		Entity entity = event.getEntity();
		Level world = entity.level;
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		if (event.getTo() == ResourceKey.create(Registries.DIMENSION, new ResourceLocation("craft_kaisen:small_pox_domain_dimension"))) {
			SmallPoxDomainDimensionPlayerEntersDimensionProcedure.execute(world, entity);
		}
	}
}