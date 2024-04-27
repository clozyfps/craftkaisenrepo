package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.craftkaisen.entity.DeathWarm2Entity;
import net.mcreator.craftkaisen.entity.DeathSwarm3Entity;
import net.mcreator.craftkaisen.entity.DeathSwarm1Entity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class DeathSwarmEffectExpiresProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(45 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entityiterator == entity)) {
					if ((entityiterator instanceof DeathSwarm1Entity || entityiterator instanceof DeathWarm2Entity || entityiterator instanceof DeathSwarm3Entity)
							&& (entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
						if (!entityiterator.level.isClientSide())
							entityiterator.discard();
					}
				}
			}
		}
	}
}
