package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

public class SorcererFameTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).affiliation).equals("Sorcerer")) {
			if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Fame < 5000) {
				{
					String _setval = "Grade 4";
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Grade = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (!(entity instanceof ServerPlayer _plr0 && _plr0.level instanceof ServerLevel && _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:grade_4"))).isDone())) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:grade_4"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			} else if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Fame >= 5000
					&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Fame < 25000) {
				{
					String _setval = "Grade 3";
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Grade = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (!(entity instanceof ServerPlayer _plr2 && _plr2.level instanceof ServerLevel && _plr2.getAdvancements().getOrStartProgress(_plr2.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:grade_3"))).isDone())) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:grade_3"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			} else if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Fame >= 25000
					&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Fame < 60000) {
				if (!(entity instanceof ServerPlayer _plr4 && _plr4.level instanceof ServerLevel
						&& _plr4.getAdvancements().getOrStartProgress(_plr4.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:semi_grade_2"))).isDone())) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:semi_grade_2"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				{
					String _setval = "Semi Grade 2";
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Grade = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Fame >= 60000
					&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Fame < 90000) {
				if (!(entity instanceof ServerPlayer _plr6 && _plr6.level instanceof ServerLevel && _plr6.getAdvancements().getOrStartProgress(_plr6.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:grade_2"))).isDone())) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:grade_2"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				{
					String _setval = "Grade 2";
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Grade = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Fame >= 90000
					&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Fame < 120000) {
				if (!(entity instanceof ServerPlayer _plr8 && _plr8.level instanceof ServerLevel
						&& _plr8.getAdvancements().getOrStartProgress(_plr8.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:semi_grade_1"))).isDone())) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:semi_grade_1"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				{
					String _setval = "Semi Grade 1";
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Grade = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Fame >= 120000
					&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Fame < 200000) {
				if (!(entity instanceof ServerPlayer _plr10 && _plr10.level instanceof ServerLevel
						&& _plr10.getAdvancements().getOrStartProgress(_plr10.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:grade_1"))).isDone())) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:grade_1"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				{
					String _setval = "Grade 1";
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Grade = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Fame >= 200000
					&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Fame < 300000) {
				if (!(entity instanceof ServerPlayer _plr12 && _plr12.level instanceof ServerLevel
						&& _plr12.getAdvancements().getOrStartProgress(_plr12.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:special_grade"))).isDone())) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:special_grade"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				{
					String _setval = "Special Grade 1";
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Grade = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Fame >= 300000) {
				if (!(entity instanceof ServerPlayer _plr14 && _plr14.level instanceof ServerLevel
						&& _plr14.getAdvancements().getOrStartProgress(_plr14.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:special_grade"))).isDone())) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:special_grade"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				{
					String _setval = "Special Grade";
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Grade = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
		if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).race).equals("Curse")) {
			if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).level < 50) {
				{
					String _setval = "Grade 4";
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Grade = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (!(entity instanceof ServerPlayer _plr16 && _plr16.level instanceof ServerLevel
						&& _plr16.getAdvancements().getOrStartProgress(_plr16.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:grade_4"))).isDone())) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:grade_4"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			} else if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).level >= 50
					&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).level < 100) {
				{
					String _setval = "Grade 3";
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Grade = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (!(entity instanceof ServerPlayer _plr18 && _plr18.level instanceof ServerLevel
						&& _plr18.getAdvancements().getOrStartProgress(_plr18.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:grade_3"))).isDone())) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:grade_3"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
			} else if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).level >= 100
					&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).level < 150) {
				if (!(entity instanceof ServerPlayer _plr20 && _plr20.level instanceof ServerLevel
						&& _plr20.getAdvancements().getOrStartProgress(_plr20.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:semi_grade_2"))).isDone())) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:semi_grade_2"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				{
					String _setval = "Semi Grade 2";
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Grade = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).level >= 150
					&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).level < 220) {
				if (!(entity instanceof ServerPlayer _plr22 && _plr22.level instanceof ServerLevel
						&& _plr22.getAdvancements().getOrStartProgress(_plr22.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:grade_2"))).isDone())) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:grade_2"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				{
					String _setval = "Grade 2";
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Grade = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).level >= 220
					&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).level < 300) {
				if (!(entity instanceof ServerPlayer _plr24 && _plr24.level instanceof ServerLevel
						&& _plr24.getAdvancements().getOrStartProgress(_plr24.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:semi_grade_1"))).isDone())) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:semi_grade_1"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				{
					String _setval = "Semi Grade 1";
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Grade = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).level >= 300
					&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).level < 500) {
				if (!(entity instanceof ServerPlayer _plr26 && _plr26.level instanceof ServerLevel
						&& _plr26.getAdvancements().getOrStartProgress(_plr26.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:grade_1"))).isDone())) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:grade_1"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				{
					String _setval = "Grade 1";
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Grade = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).level >= 500
					&& (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).level < 700) {
				if (!(entity instanceof ServerPlayer _plr28 && _plr28.level instanceof ServerLevel
						&& _plr28.getAdvancements().getOrStartProgress(_plr28.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:special_grade"))).isDone())) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:special_grade"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				{
					String _setval = "Special Grade";
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Grade = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).level >= 700) {
				if (!(entity instanceof ServerPlayer _plr30 && _plr30.level instanceof ServerLevel
						&& _plr30.getAdvancements().getOrStartProgress(_plr30.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:special_grade"))).isDone())) {
					if (entity instanceof ServerPlayer _player) {
						Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:special_grade"));
						AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
						if (!_ap.isDone()) {
							for (String criteria : _ap.getRemainingCriteria())
								_player.getAdvancements().award(_adv, criteria);
						}
					}
				}
				{
					String _setval = "Special Grade";
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Grade = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
