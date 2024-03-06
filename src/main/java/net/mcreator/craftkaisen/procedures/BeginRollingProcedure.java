package net.mcreator.craftkaisen.procedures;

import org.checkerframework.checker.units.qual.s;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

public class BeginRollingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double rNum = 0;
		if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Rolling) {
			entity.getPersistentData().putDouble("rollingTimer", (entity.getPersistentData().getDouble("rollingTimer") + 1));
			if (entity.getPersistentData().getDouble("rollingTimer") >= 0 && !(entity.getPersistentData().getDouble("rollingTimer") == 200)) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.bamboo_wood_button.click_on")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.bamboo_wood_button.click_on")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("\u00A7l\u00A7k7"), true);
				if (!((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RollingNumber1).isEmpty()
						&& !((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RollingNumber2).isEmpty()
						&& !((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RollingNumber3).isEmpty()) {
					if (new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RollingNumber1) == new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RollingNumber2) && new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RollingNumber2) == new Object() {
						double convert(String s) {
							try {
								return Double.parseDouble(s.trim());
							} catch (Exception e) {
							}
							return 0;
						}
					}.convert((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RollingNumber3)) {
						entity.getPersistentData().putDouble("losingStreak", 0);
						if (new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RollingNumber1) == 7) {
							{
								boolean _setval = false;
								entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.Rolling = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							IdleDeathGambleRemoveProcedure.execute(world, (entity.getPersistentData().getDouble("domainx")), (entity.getPersistentData().getDouble("domainy")), (entity.getPersistentData().getDouble("domainz")));
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:domain.crack")), SoundSource.NEUTRAL, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:domain.crack")), SoundSource.NEUTRAL, 1, 1, false);
								}
							}
							entity.getPersistentData().putBoolean("jackpotBegin", true);
						}
					} else {
						{
							boolean _setval = false;
							entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.Rolling = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						IdleDeathGambleRemoveProcedure.execute(world, (entity.getPersistentData().getDouble("domainx")), (entity.getPersistentData().getDouble("domainy")), (entity.getPersistentData().getDouble("domainz")));
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:domain.crack")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:domain.crack")), SoundSource.NEUTRAL, 1, 1, false);
							}
						}
						entity.getPersistentData().putDouble("losingStreak", (entity.getPersistentData().getDouble("losingStreak") + 1));
					}
					{
						String _setval = "";
						entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.RollingNumber1 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "";
						entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.RollingNumber2 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						String _setval = "";
						entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.RollingNumber3 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			} else if (entity.getPersistentData().getDouble("rollingTimer") == 200) {
				entity.getPersistentData().putDouble("rollingTimer", (-40));
				rNum = Mth.nextInt(RandomSource.create(), 1, 7);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RollingNumber1).isEmpty()) {
					{
						String _setval = new java.text.DecimalFormat("#").format(rNum);
						entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.RollingNumber1 = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if (!((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RollingNumber1).isEmpty()
						&& ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RollingNumber2).isEmpty()) {
					if (entity.getPersistentData().getDouble("losingStreak") == 0) {
						{
							String _setval = new java.text.DecimalFormat("#").format(rNum);
							entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.RollingNumber2 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else {
						{
							String _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RollingNumber1;
							entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.RollingNumber2 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				} else if (!((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RollingNumber1).isEmpty()
						&& !((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RollingNumber2).isEmpty()
						&& ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RollingNumber3).isEmpty()) {
					if (entity.getPersistentData().getDouble("losingStreak") == 0) {
						{
							String _setval = new java.text.DecimalFormat("#").format(rNum);
							entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.RollingNumber3 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if (entity.getPersistentData().getDouble("losingStreak") == 1) {
						{
							String _setval = new java.text.DecimalFormat("#").format(rNum);
							entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.RollingNumber3 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if (entity.getPersistentData().getDouble("losingStreak") == 2) {
						{
							String _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RollingNumber1;
							entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.RollingNumber3 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
				}
				if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RollingNumber1).isEmpty()) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(("\u00A7a\u00A7I" + new java.text.DecimalFormat("#").format(rNum))), false);
				} else if (!((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RollingNumber1).isEmpty()
						&& ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RollingNumber2).isEmpty()) {
					if (entity.getPersistentData().getDouble("losingStreak") == 0) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("\u00A7a\u00A7I" + new java.text.DecimalFormat("#").format(rNum))), false);
					} else {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("\u00A7a\u00A7I" + (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RollingNumber1)),
									false);
					}
				} else if (!((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RollingNumber1).isEmpty()
						&& !((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RollingNumber2).isEmpty()
						&& ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RollingNumber3).isEmpty()) {
					if (entity.getPersistentData().getDouble("losingStreak") == 0) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("\u00A7a\u00A7I" + new java.text.DecimalFormat("#").format(rNum))), false);
					} else if (entity.getPersistentData().getDouble("losingStreak") == 1) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("\u00A7a\u00A7I" + new java.text.DecimalFormat("#").format(rNum))), false);
					} else if (entity.getPersistentData().getDouble("losingStreak") == 2) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("\u00A7a\u00A7I" + (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RollingNumber1)),
									false);
					}
				}
			}
		}
	}
}
