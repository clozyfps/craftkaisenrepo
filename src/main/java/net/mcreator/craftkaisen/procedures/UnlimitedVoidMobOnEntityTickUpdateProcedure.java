package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;
import net.mcreator.craftkaisen.init.CraftKaisenModParticleTypes;
import net.mcreator.craftkaisen.init.CraftKaisenModMobEffects;
import net.mcreator.craftkaisen.init.CraftKaisenModBlocks;
import net.mcreator.craftkaisen.entity.UnlimitedVoidAccelerateEntity;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

public class UnlimitedVoidMobOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double rand = 0;
		entity.makeStuckInBlock(Blocks.AIR.defaultBlockState(), new Vec3(0.25, 0.05, 0.25));
		if (entity.getPersistentData().getDouble("spawnhole") > 0) {
			entity.getPersistentData().putDouble("spawnhole", (entity.getPersistentData().getDouble("spawnhole") - 1));
		}
		if (entity.getPersistentData().getDouble("spawnhole") == 0) {
			if (world instanceof ServerLevel _level)
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"particle craft_kaisen:unlimitedblackhole ^ ^1.5 ^ 0.01 0.01 0.01 0.01 1 force @a");
			entity.getPersistentData().putDouble("spawnhole", 100);
		}
		if (entity.getPersistentData().getDouble("spawnparticles") > 0) {
			entity.getPersistentData().putDouble("spawnparticles", (entity.getPersistentData().getDouble("spawnparticles") - 1));
		}
		if (entity.getPersistentData().getDouble("spawnparticles") == 0) {
			rand = Mth.nextInt(RandomSource.create(), 1, 3);
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.ELECTRIC_SPARK, x, y, z, 10, 8, 5, 8, 0);
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.UNLIMITED_VOID_SPLASH_1.get()), x, y, z, 1, 6, 5, 6, 0);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.UNLIMITED_VOID_SPLASH_2.get()), x, y, z, 1, 6, 5, 6, 0);
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (CraftKaisenModParticleTypes.UNLIMITED_VOID_SPLASH_3.get()), x, y, z, 1, 6, 5, 6, 0);
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(15 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entity == entityiterator)) {
					if (!(entity instanceof TamableAnimal _tamIsTamedBy && entityiterator instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)) {
						if (!(entity.getPersistentData().getString("ownerdomain")).equals(entityiterator.getDisplayName().getString())) {
							if (!(entityiterator instanceof ItemEntity)) {
								if (!(entityiterator instanceof UnlimitedVoidAccelerateEntity)) {
									if (!(entityiterator instanceof LivingEntity _livEnt22 && _livEnt22.hasEffect(CraftKaisenModMobEffects.SIMPLE_DOMAIN.get()))
											|| !(entityiterator instanceof LivingEntity _livEnt23 && _livEnt23.hasEffect(CraftKaisenModMobEffects.DOMAIN_AMPLIFICATION.get()))) {
										if ((world.getBlockState(BlockPos.containing(entityiterator.getX(), entityiterator.getY() - 1, entityiterator.getZ()))).getBlock() == CraftKaisenModBlocks.DOMAIN_BLOCK.get()) {
											entityiterator.setDeltaMovement(new Vec3(0, 0, 0));
											if (world instanceof ServerLevel _level)
												_level.sendParticles(ParticleTypes.ENCHANT, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 7, 1, 3, 1, 0);
											if (world instanceof ServerLevel _level)
												_level.sendParticles(ParticleTypes.EFFECT, (entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), 1, 1, 3, 1, 0);
											entityiterator.makeStuckInBlock(Blocks.AIR.defaultBlockState(), new Vec3(0.25, 0.05, 0.25));
											if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
												_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.STOP_ATTACKS.get(), 20, 0, false, false));
											if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
												_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 25, 250, false, false));
											if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
												_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 25, 250, false, false));
											if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
												_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 25, 250, false, false));
											{
												String _setval = "";
												entityiterator.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
													capability.currentMove = _setval;
													capability.syncPlayerVariables(entityiterator);
												});
											}
										}
									} else if (entityiterator instanceof LivingEntity _livEnt43 && _livEnt43.hasEffect(CraftKaisenModMobEffects.SIMPLE_DOMAIN.get())) {
										entityiterator.getPersistentData().putDouble("simpledomainlevel", (entityiterator.getPersistentData().getDouble("simpledomainlevel") - 0.1));
									}
								}
							}
						}
					}
					if (entity instanceof TamableAnimal _tamIsTamedBy && entityiterator instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) {
						if (entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
							_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 25, 8, false, false));
					}
				}
			}
		}
	}
}
