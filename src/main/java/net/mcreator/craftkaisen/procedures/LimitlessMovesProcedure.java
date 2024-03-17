package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;
import net.mcreator.craftkaisen.init.CraftKaisenModMobEffects;

import javax.annotation.Nullable;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

@Mod.EventBusSubscriber
public class LimitlessMovesProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level, event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput > 0) {
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentMove).equals("Reversal Red")) {
				if (entity instanceof ServerPlayer _plr0 && _plr0.level instanceof ServerLevel
						&& _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:reversed_cursed_technique"))).isDone()) {
					if (!(entity instanceof LivingEntity _livEnt1 && _livEnt1.hasEffect(CraftKaisenModMobEffects.REVERSAL_RED_CONTROL.get()))) {
						if (!((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RightArmGone
								|| (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).LeftArmGone)) {
							if (!entity.isShiftKeyDown()) {
								if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentCursedEnergy >= 50
										* ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 10)) {
									{
										double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentCursedEnergy
												- 50 * ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 10);
										entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
											capability.currentCursedEnergy = _setval;
											capability.syncPlayerVariables(entity);
										});
									}
									ReversalRedProceduresProcedure.execute(entity);
									if (entity instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(Component.literal("Aka."), true);
									entity.getPersistentData().putDouble(("cooldown" + new java.text.DecimalFormat("#").format(entity.getPersistentData().getDouble("coolset"))), 100);
								} else if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentCursedEnergy < 50
										* ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 10)) {
									if (entity instanceof Player _player && !_player.level.isClientSide())
										_player.displayClientMessage(Component.literal(("You need "
												+ new java.text.DecimalFormat("##.##")
														.format(50 * ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 10))
												+ " cursed energy to use this move.")), true);
								}
							} else if (entity.isShiftKeyDown()) {
								if (entity instanceof ServerPlayer _plr8 && _plr8.level instanceof ServerLevel
										&& _plr8.getAdvancements().getOrStartProgress(_plr8.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:potentional"))).isDone()
										&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput >= 100) {
									MaxRedProcedureProcedure.execute(entity);
								}
							}
						} else {
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("You dont have arms to perform Reversal Red"), true);
						}
					} else if (entity instanceof LivingEntity _livEnt10 && _livEnt10.hasEffect(CraftKaisenModMobEffects.REVERSAL_RED_CONTROL.get())) {
						if (entity instanceof LivingEntity _entity)
							_entity.removeEffect(CraftKaisenModMobEffects.REVERSAL_RED_CONTROL.get());
					}
				} else {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("You need Reverse Cursed Technique to use Reversal Red "), true);
				}
				{
					String _setval = "";
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.currentMove = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentMove).equals("Lapse Blue")) {
				LapseBlueProcedureProcedure.execute(entity);
				{
					String _setval = "";
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.currentMove = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentMove).equals("Teleport")) {
				if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentCursedEnergy >= 5
						* ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 10)) {
					{
						double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentCursedEnergy
								- 5 * ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 10);
						entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.currentCursedEnergy = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					TeleportProcedureProcedure.execute(world, x, y, z, entity);
					entity.getPersistentData().putDouble(("cooldown" + new java.text.DecimalFormat("#").format(entity.getPersistentData().getDouble("coolset"))), 70);
				} else if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentCursedEnergy < 5
						* ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 10)) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(("You need "
								+ new java.text.DecimalFormat("##.##").format(50 * ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 10))
								+ " cursed energy to use this move.")), true);
				}
				{
					String _setval = "";
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.currentMove = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentMove).equals("Infinity")) {
				InfinityProcedureProcedure.execute(entity);
				{
					String _setval = "";
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.currentMove = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentMove).equals("Hollow Purple")) {
				if (entity instanceof ServerPlayer _plr16 && _plr16.level instanceof ServerLevel
						&& _plr16.getAdvancements().getOrStartProgress(_plr16.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:reversed_cursed_technique"))).isDone()) {
					if (!((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RightArmGone
							|| (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).LeftArmGone)) {
						if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentCursedEnergy >= 190
								* ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 10)) {
							{
								double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentCursedEnergy
										- 190 * ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 10);
								entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.currentCursedEnergy = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							PurpleProcedureProcedure.execute(world, entity);
							entity.getPersistentData().putDouble(("cooldown" + new java.text.DecimalFormat("#").format(entity.getPersistentData().getDouble("coolset"))), 900);
						} else if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentCursedEnergy < 190
								* ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 10)) {
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal(("You need "
										+ new java.text.DecimalFormat("##.##").format(190 * ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput / 10))
										+ " cursed energy to use this move.")), true);
						}
						{
							String _setval = "";
							entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.currentMove = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("You dont have arms to perform Hollow Purple"), true);
					}
				} else {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("You need Reverse Cursed Technique to use Reversal Red "), true);
				}
				{
					String _setval = "";
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.currentMove = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentMove).equals("Unlimited Void")) {
				if (!((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RightArmGone
						|| (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).LeftArmGone)) {
					if (!entity.getPersistentData().getBoolean("domain")) {
						if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentCursedEnergy >= 600) {
							{
								double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentCursedEnergy - 600;
								entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.currentCursedEnergy = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							VoidRemoveProcedure.execute(world, x, y, z);
							{
								final Vec3 _center = new Vec3(x, y, z);
								List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(25 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
										.collect(Collectors.toList());
								for (Entity entityiterator : _entfound) {
									if (!(entity == entityiterator)) {
										entityiterator.getPersistentData().putBoolean("domain", false);
									}
								}
							}
							UnlimitedVoidProcedureProcedure.execute(world, x, y, z, entity);
							entity.getPersistentData().putDouble(("cooldown" + new java.text.DecimalFormat("#").format(entity.getPersistentData().getDouble("coolset"))), 60);
						} else if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentCursedEnergy < 600) {
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal(("You need " + new java.text.DecimalFormat("##.##").format(600) + " cursed energy to use this move.")), true);
						}
					} else if (entity.getPersistentData().getBoolean("domain")) {
						VoidRemoveProcedure.execute(world, x, y, z);
						entity.getPersistentData().putDouble(("cooldown" + new java.text.DecimalFormat("#").format(entity.getPersistentData().getDouble("coolset"))), 1500);
					}
					{
						String _setval = "";
						entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.currentMove = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("You dont have arms to perform Unlimited Void handsigns"), true);
				}
			}
		}
	}
}
