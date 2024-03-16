package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.network.chat.Component;

public class StopPlayerTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getBoolean("stop")) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 5, 250, false, false));
			entity.makeStuckInBlock(Blocks.AIR.defaultBlockState(), new Vec3(0.25, 0.05, 0.25));
			entity.setDeltaMovement(new Vec3(0, 0, 0));
		} else if (entity.getPersistentData().getBoolean("sleep")) {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 5, 250, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 5, 250, false, false));
			entity.makeStuckInBlock(Blocks.AIR.defaultBlockState(), new Vec3(0.25, 0.05, 0.25));
			entity.setDeltaMovement(new Vec3(0, 0, 0));
		} else if (entity.getPersistentData().getBoolean("run")) {
			entity.setDeltaMovement(new Vec3((entity.getPersistentData().getDouble("runx")), (entity.getPersistentData().getDouble("runy")), (entity.getPersistentData().getDouble("runz"))));
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("Why am I running away?"), true);
		}
	}
}
