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
import net.mcreator.craftkaisen.CraftKaisenMod;

public class BeginRollingProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double rNum = 0;
		if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Rolling) {
			{
				double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RollingTimer + 1;
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.RollingTimer = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RollingTimer >= 0
					&& !((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RollingTimer == 100)
					&& !((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RollingTimer == 20)) {
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
						{
							double _setval = 0;
							entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.LosingStreak = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						if (new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RollingNumber1) == 1) {
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("1 1 1"), false);
						} else if (new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RollingNumber1) == 2) {
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("2 2 2"), false);
						} else if (new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RollingNumber1) == 3) {
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("3 3 3"), false);
						} else if (new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RollingNumber1) == 4) {
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("4 4 4"), false);
						} else if (new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RollingNumber1) == 5) {
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("5 5 5"), false);
						} else if (new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RollingNumber1) == 6) {
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("6 6 6"), false);
						} else if (new Object() {
							double convert(String s) {
								try {
									return Double.parseDouble(s.trim());
								} catch (Exception e) {
								}
								return 0;
							}
						}.convert((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RollingNumber1) == 7) {
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("7 7 7"), false);
							entity.getPersistentData().putBoolean("jackpotBegin", true);
						}
					} else {
						{
							double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).LosingStreak + 1;
							entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.LosingStreak = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
					{
						boolean _setval = false;
						entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.Rolling = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					CraftKaisenMod.queueServerWork(20, () -> {
						IdleDeathGambleRemoveProcedure.execute(world, (entity.getPersistentData().getDouble("domainx")), (entity.getPersistentData().getDouble("domainy")), (entity.getPersistentData().getDouble("domainz")));
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:domain.crack")), SoundSource.NEUTRAL, 1, 1);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:domain.crack")), SoundSource.NEUTRAL, 1, 1, false);
							}
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
						{
							boolean _setval = false;
							entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.MiddleCard = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = 0;
							entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.RollingTimer = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = 0;
							entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.RolledNumber = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							double _setval = 0;
							entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.RolledStage = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						entity.getPersistentData().putDouble("displayProgress", 0);
					});
				}
			} else if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RollingTimer == 0) {
				{
					double _setval = 1;
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.RollingTimer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					boolean _setval = false;
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.MiddleCard = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.RolledNumber = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				{
					double _setval = 0;
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.RolledStage = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RollingTimer == 100) {
				{
					double _setval = -10;
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.RollingTimer = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				rNum = Mth.nextInt(RandomSource.create(), 1, 7);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:domain.spin")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:domain.spin")), SoundSource.NEUTRAL, 1, 1, false);
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
					entity.getPersistentData().putDouble("displayProgress", 1);
				} else if (!((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RollingNumber1).isEmpty()
						&& ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RollingNumber2).isEmpty()) {
					if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).LosingStreak == 0) {
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
					entity.getPersistentData().putDouble("displayProgress", 2);
				} else if (!((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RollingNumber1).isEmpty()
						&& !((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RollingNumber2).isEmpty()
						&& ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RollingNumber3).isEmpty()) {
					if (!((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).LosingStreak == 2)) {
						{
							String _setval = new java.text.DecimalFormat("#").format(rNum);
							entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.RollingNumber3 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else {
						{
							String _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).RollingNumber1;
							entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.RollingNumber3 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					}
					entity.getPersistentData().putDouble("displayProgress", 3);
				}
				DisplayRollsProcedure.execute(entity);
			}
		}
	}
}
