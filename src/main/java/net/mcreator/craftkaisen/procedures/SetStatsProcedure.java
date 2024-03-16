package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class SetStatsProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).special).equals("Physically Gifted")) {
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE)
					.setBaseValue((1 + (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).strengthStat / 4.5));
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH)
					.setBaseValue((20 + (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).healthStat));
			if (!entity.getPersistentData().getBoolean("speeddisable")) {
				((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED)
						.setBaseValue((0.1 + (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).speedStat / 110));
			} else if (entity.getPersistentData().getBoolean("speeddisable")) {
				((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).setBaseValue(0.1);
			}
		} else if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).special).equals("Physically Gifted")) {
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ATTACK_DAMAGE)
					.setBaseValue((1 + (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).strengthStat / 2.5));
			((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MAX_HEALTH)
					.setBaseValue((35 + (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).healthStat));
			if (!entity.getPersistentData().getBoolean("speeddisable")) {
				((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED)
						.setBaseValue((0.1 + (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).speedStat / 80));
			} else if (entity.getPersistentData().getBoolean("speeddisable")) {
				((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.MOVEMENT_SPEED).setBaseValue(0.1);
			}
		}
		if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).speedStat >= 15) {
			if (entity.isInWater()) {
				if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 10, 0));
			}
		}
		((LivingEntity) entity).getAttribute(net.minecraft.world.entity.ai.attributes.Attributes.ARMOR)
				.setBaseValue(((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Durability));
		{
			double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).cursedEnergyStat * 20;
			entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.maxCursedEnergy = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		entity.getPersistentData().putDouble("rep", ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).reputation));
		if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).energyControl < 9) {
			{
				double _setval = 10 + (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).energyControl * 10;
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.maxOutput = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentCursedEnergy > (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new CraftKaisenModVariables.PlayerVariables())).maxCursedEnergy) {
			{
				double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).maxCursedEnergy;
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.currentCursedEnergy = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (world.getLevelData().getGameRules().getBoolean(CraftKaisenModGameRules.SMP_SETTING) == true && (entity.getDisplayName().getString()).equals("Void_Asriel")) {
			if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).level > 600) {
				{
					double _setval = 500;
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.level = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if (world.getLevelData().getGameRules().getBoolean(CraftKaisenModGameRules.SMP_SETTING) == true && (entity.getDisplayName().getString()).equals("vin_jo")) {
			if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).level > 600) {
				{
					double _setval = 500;
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.level = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if (!((entity.getDisplayName().getString()).equals("Void_Asriel") || (entity.getDisplayName().getString()).equals("vin_jo"))) {
			if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).level > 500) {
				{
					double _setval = 500;
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.level = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentCursedEnergy <= 0) {
			{
				double _setval = 0;
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.currentCursedEnergy = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput > (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
				.orElse(new CraftKaisenModVariables.PlayerVariables())).maxOutput) {
			{
				double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).maxOutput;
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.currentOutput = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput <= 0) {
			{
				double _setval = 0;
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.currentOutput = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).energyControl >= 10 && !(entity instanceof ServerPlayer _plr22 && _plr22.level instanceof ServerLevel
				&& _plr22.getAdvancements().getOrStartProgress(_plr22.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:potentional"))).isDone())) {
			{
				double _setval = 100;
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.maxOutput = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).energyControl >= 10 && entity instanceof ServerPlayer _plr23
				&& _plr23.level instanceof ServerLevel && _plr23.getAdvancements().getOrStartProgress(_plr23.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:potentional"))).isDone()) {
			{
				double _setval = 120;
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.maxOutput = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).race).equals("Curse")
				&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).characterCreated == true) {
			if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) < (entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1)) {
				if (entity.isAlive()) {
					if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Grade).equals("Grade 4")
							|| ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Grade).equals("Grade 3")) {
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 0.02));
					}
					if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Grade).equals("Grade 2")
							|| ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Grade).equals("Semi Grade 2")) {
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 0.05));
					}
					if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Grade).equals("Grade 1")
							|| ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Grade).equals("Semi Grade 1")) {
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 0.08));
					}
					if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Grade).equals("Special Grade")
							|| ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Grade).equals("Special Grade 1")) {
						if (entity instanceof LivingEntity _entity)
							_entity.setHealth((float) ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 0.1));
					}
				}
			}
		}
		if (new Object() {
			public boolean checkGamemode(Entity _ent) {
				if (_ent instanceof ServerPlayer _serverPlayer) {
					return _serverPlayer.gameMode.getGameModeForPlayer() == GameType.CREATIVE;
				} else if (_ent.level.isClientSide() && _ent instanceof Player _player) {
					return Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()) != null && Minecraft.getInstance().getConnection().getPlayerInfo(_player.getGameProfile().getId()).getGameMode() == GameType.CREATIVE;
				}
				return false;
			}
		}.checkGamemode(entity)) {
			{
				double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).maxCursedEnergy;
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.currentCursedEnergy = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
