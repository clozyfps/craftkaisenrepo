package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class FinishCharacterProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double SixEyes = 0;
		double Flash = 0;
		double overflow = 0;
		double SoulPerception = 0;
		double CursedWomb = 0;
		SixEyes = Mth.nextInt(RandomSource.create(), 1, 400);
		Flash = Mth.nextInt(RandomSource.create(), 1, 70);
		overflow = Mth.nextInt(RandomSource.create(), 1, 100);
		SoulPerception = Mth.nextInt(RandomSource.create(), 1, 90);
		CursedWomb = Mth.nextInt(RandomSource.create(), 1, 100);
		if (entity instanceof Player _player)
			_player.closeContainer();
		{
			boolean _setval = true;
			entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.characterCreated = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		RandomiseCursedTechniqueProcedure.execute(world, x, y, z, entity);
		if (SixEyes == 1) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:six_eyes_advancement"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("You are born with the legendary \u00A7bSix Eyes."), false);
			{
				String _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).special + " Six Eyes";
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.special = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (Flash == 1) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:blessed_by_the_sparks_advancement"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("You are blessed by the sparks."), false);
			{
				String _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).special + " Blessed By The Sparks";
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.special = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 3500;
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.BlackFlashRarity = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (overflow == 1) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:overflowing"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("You are born with a exceptional amount of cursed energy"), false);
			{
				String _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).special + " Overflowing Cursed Energy";
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.special = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			{
				double _setval = 80;
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.cursedEnergyStat = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (SoulPerception == 1) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:perception_of_the_soul"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("You are born with the ability to percieve souls"), false);
			{
				String _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).special + " Soul Perception";
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.special = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (CursedWomb == 1) {
			if (entity instanceof ServerPlayer _player) {
				Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:cursed_womb"));
				AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
				if (!_ap.isDone()) {
					for (String criteria : _ap.getRemainingCriteria())
						_player.getAdvancements().award(_adv, criteria);
				}
			}
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("You are born as a cursed womb"), false);
			{
				String _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).special + " Cursed Womb";
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.special = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
