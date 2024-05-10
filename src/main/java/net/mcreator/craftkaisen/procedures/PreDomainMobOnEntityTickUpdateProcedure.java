package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class PreDomainMobOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(CraftKaisenModMobEffects.DELETED_MOD_ELEMENT.get())) {
					if (!(entityiterator instanceof Player _plr1 && _plr1.containerMenu instanceof DomainClashingGUIMenu)) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.STOP_DOMAIN.get(), 10000, 1, false, false));
						if (entityiterator instanceof ServerPlayer _ent) {
							BlockPos _bpos = BlockPos.containing(x, y, z);
							NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
								@Override
								public Component getDisplayName() {
									return Component.literal("DomainClashingGUI");
								}

								@Override
								public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
									return new DomainClashingGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
								}
							}, _bpos);
						}
						if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.DELETED_MOD_ELEMENT.get(), 10000, 1, false, false));
					}
				}
			}
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.DOMAIN_CLASH_PARTICLE.get()), x, y, z, 10, 5, 5, 5, 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.CLASH_PARTICLE.get()), x, y, z, 10, 5, 5, 5, 1);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, x, y, z, 7, 5, 1, 5, 1);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:domain.spin")), SoundSource.NEUTRAL, (float) 0.1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:domain.spin")), SoundSource.NEUTRAL, (float) 0.1, 1, false);
			}
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:lightningflash")), SoundSource.NEUTRAL, (float) 0.1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:lightningflash")), SoundSource.NEUTRAL, (float) 0.1, 1, false);
			}
		}
	}
}
