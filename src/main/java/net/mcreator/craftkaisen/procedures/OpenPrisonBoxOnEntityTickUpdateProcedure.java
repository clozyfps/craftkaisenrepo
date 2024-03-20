package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class OpenPrisonBoxOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(15 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(CraftKaisenModMobEffects.PRISON_BOX_STUN.get())) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), ("execute as " + entity.getStringUUID() + " at @s run tp @s ~ ~ ~ facing entity " + entityiterator.getStringUUID()));
						}
					}
				}
			}
		}
	}
}
