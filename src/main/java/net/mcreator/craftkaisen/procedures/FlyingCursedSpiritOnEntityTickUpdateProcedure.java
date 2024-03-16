package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.craftkaisen.CraftKaisenMod;

public class FlyingCursedSpiritOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null) instanceof LivingEntity) {
			if (Math.random() < 0.06) {
				entity.setDeltaMovement(new Vec3((((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getX() - entity.getX()) / 5),
						(((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getY() - entity.getY()) / 5), (((entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null).getZ() - entity.getZ()) / 5)));
				CraftKaisenMod.queueServerWork(10, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.POOF, x, y, z, 15, 3, 3, 3, 0.5);
				});
			}
		}
	}
}
