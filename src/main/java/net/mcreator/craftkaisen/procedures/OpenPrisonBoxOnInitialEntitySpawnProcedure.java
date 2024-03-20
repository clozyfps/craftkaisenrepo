package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class OpenPrisonBoxOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		CraftKaisenMod.queueServerWork(60, () -> {
			if (!entity.level.isClientSide())
				entity.discard();
			{
				final Vec3 _center = new Vec3(x, y, z);
				List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(25 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
						.collect(Collectors.toList());
				for (Entity entityiterator : _entfound) {
					if (entityiterator instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(CraftKaisenModMobEffects.DELETED_MOD_ELEMENT.get())) {
						{
							Entity _entity = entityiterator;
							if (_entity instanceof Player _player) {
								_player.getInventory().armor.set(2, new ItemStack(CraftKaisenModItems.DELETED_MOD_ELEMENT_CHESTPLATE.get()));
								_player.getInventory().setChanged();
							} else if (_entity instanceof LivingEntity _living) {
								_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(CraftKaisenModItems.DELETED_MOD_ELEMENT_CHESTPLATE.get()));
							}
						}
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(entityiterator.getX(), entityiterator.getY(), entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.iron_door.close")),
										SoundSource.NEUTRAL, 1, (float) 0.3);
							} else {
								_level.playLocalSound((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.iron_door.close")), SoundSource.NEUTRAL, 1,
										(float) 0.3, false);
							}
						}
					}
				}
			}
		});
	}
}
