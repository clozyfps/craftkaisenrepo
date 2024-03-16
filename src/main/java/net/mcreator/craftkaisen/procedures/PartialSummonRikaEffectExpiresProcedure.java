package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.craftkaisen.entity.RikaEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class PartialSummonRikaEffectExpiresProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(45 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entityiterator == entity)) {
					if (entityiterator instanceof RikaEntity && (entityiterator instanceof TamableAnimal _tamIsTamedBy && entity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
						if (!entityiterator.level.isClientSide())
							entityiterator.discard();
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("Rika, Return!"), true);
					}
				}
			}
		}
	}
}
