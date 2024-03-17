package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;
import net.mcreator.craftkaisen.CraftKaisenMod;

public class HumanStoryModeRightclickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).reputation >= 0) {
			if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).StoryModeLevel == 0) {
				{
					double _setval = 1;
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.StoryModeLevel = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Chapter 1: Starting"), false);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.blastfurnace.fire_crackle")), SoundSource.NEUTRAL, (float) 0.5, 2);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.blastfurnace.fire_crackle")), SoundSource.NEUTRAL, (float) 0.5, 2, false);
					}
				}
				CraftKaisenMod.queueServerWork(20, () -> {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.blastfurnace.fire_crackle")), SoundSource.NEUTRAL, (float) 0.5, 2);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.blastfurnace.fire_crackle")), SoundSource.NEUTRAL, (float) 0.5, 2, false);
						}
					}
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A76<Satoru Gojo> I see you want to become a sorcerer?"), false);
					CraftKaisenMod.queueServerWork(40, () -> {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.blastfurnace.fire_crackle")), SoundSource.NEUTRAL, (float) 0.5, 2);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.blastfurnace.fire_crackle")), SoundSource.NEUTRAL, (float) 0.5, 2, false);
							}
						}
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("\u00A76<Satoru Gojo> If you want, I can train you."), false);
						CraftKaisenMod.queueServerWork(40, () -> {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.blastfurnace.fire_crackle")), SoundSource.NEUTRAL, (float) 0.5, 2);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.blastfurnace.fire_crackle")), SoundSource.NEUTRAL, (float) 0.5, 2, false);
								}
							}
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("\u00A7l<Narrator> Retrieve 1 Piece Of Iron"), false);
						});
					});
				});
			} else if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).StoryModeLevel == 1) {
				if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(Items.IRON_INGOT)) : false) {
					{
						double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 20;
						entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.currentExp = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = 2;
						entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StoryModeLevel = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("Chapter 2: Improvement"), false);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.blastfurnace.fire_crackle")), SoundSource.NEUTRAL, (float) 0.5, 2);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.blastfurnace.fire_crackle")), SoundSource.NEUTRAL, (float) 0.5, 2, false);
						}
					}
					CraftKaisenMod.queueServerWork(40, () -> {
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.blastfurnace.fire_crackle")), SoundSource.NEUTRAL, (float) 0.5, 2);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.blastfurnace.fire_crackle")), SoundSource.NEUTRAL, (float) 0.5, 2, false);
							}
						}
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("\u00A76<Satoru Gojo> Get to level 10, and we'll talk."), false);
					});
				} else {
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.blastfurnace.fire_crackle")), SoundSource.NEUTRAL, (float) 0.5, 2);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.blastfurnace.fire_crackle")), SoundSource.NEUTRAL, (float) 0.5, 2, false);
						}
					}
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A7l<Narrator> Retrieve 1 Piece Of Iron"), false);
				}
			} else if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).StoryModeLevel == 2) {
				if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).level >= 10) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A76<Satoru Gojo> Great, you've proven yourself to me."), false);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.blastfurnace.fire_crackle")), SoundSource.NEUTRAL, (float) 0.5, 2);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.blastfurnace.fire_crackle")), SoundSource.NEUTRAL, (float) 0.5, 2, false);
						}
					}
					CraftKaisenMod.queueServerWork(20, () -> {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("\u00A76<Satoru Gojo> Now, I want you to exorcise a cursed spirit, Once you do that, You'll become a Jujutsu Sorcerer."), false);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.blastfurnace.fire_crackle")), SoundSource.NEUTRAL, (float) 0.5, 2);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.blastfurnace.fire_crackle")), SoundSource.NEUTRAL, (float) 0.5, 2, false);
							}
						}
					});
					{
						double _setval = 3;
						entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StoryModeLevel = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			} else if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).StoryModeLevel == 3) {
				if (entity instanceof ServerPlayer _plr24 && _plr24.level instanceof ServerLevel
						&& _plr24.getAdvancements().getOrStartProgress(_plr24.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:jujutsu_sorcerer"))).isDone()) {
					{
						double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 100;
						entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.currentExp = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = 4;
						entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StoryModeLevel = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal(("\u00A76<Satoru Gojo> Awesome, you've proven yourself once again " + entity.getDisplayName().getString() + ".")), false);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.blastfurnace.fire_crackle")), SoundSource.NEUTRAL, (float) 0.5, 2);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.blastfurnace.fire_crackle")), SoundSource.NEUTRAL, (float) 0.5, 2, false);
						}
					}
					CraftKaisenMod.queueServerWork(35, () -> {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal(("\u00A76<Satoru Gojo> So currently you are a "
									+ (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Grade + ". Next what I need you to do is reach grade 3.")), false);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.blastfurnace.fire_crackle")), SoundSource.NEUTRAL, (float) 0.5, 2);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.blastfurnace.fire_crackle")), SoundSource.NEUTRAL, (float) 0.5, 2, false);
							}
						}
					});
				} else {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A76<Satoru Gojo> You still havent exorcised a cursed spirit.."), false);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.blastfurnace.fire_crackle")), SoundSource.NEUTRAL, (float) 0.5, 2);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.blastfurnace.fire_crackle")), SoundSource.NEUTRAL, (float) 0.5, 2, false);
						}
					}
				}
			} else if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).StoryModeLevel == 4) {
				if (!((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Grade).isEmpty()
						&& !((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).Grade).equals("Grade 4")) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A76<Satoru Gojo> Great, You've reached grade 3. You've constantly proven yourself to me. So in return, Here is 200 EXP."), false);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.blastfurnace.fire_crackle")), SoundSource.NEUTRAL, (float) 0.5, 2);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.blastfurnace.fire_crackle")), SoundSource.NEUTRAL, (float) 0.5, 2, false);
						}
					}
					{
						double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
						entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.currentExp = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = 5;
						entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StoryModeLevel = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A76<Satoru Gojo> You still havent reached grade 3."), false);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.blastfurnace.fire_crackle")), SoundSource.NEUTRAL, (float) 0.5, 2);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.blastfurnace.fire_crackle")), SoundSource.NEUTRAL, (float) 0.5, 2, false);
						}
					}
				}
			} else if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).StoryModeLevel == 5) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(
							Component.literal("\u00A76<Satoru Gojo> I have a mission in mind for you, a powerful curse has been attacking fellow jujutsu sorcerers, the curse's name is Hanami. Find this Cursed Spirit and exorcise it."), false);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.blastfurnace.fire_crackle")), SoundSource.NEUTRAL, (float) 0.5, 2);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.blastfurnace.fire_crackle")), SoundSource.NEUTRAL, (float) 0.5, 2, false);
					}
				}
				{
					double _setval = 6;
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.StoryModeLevel = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).StoryModeLevel == 6) {
				if (entity instanceof ServerPlayer _plr39 && _plr39.level instanceof ServerLevel
						&& _plr39.getAdvancements().getOrStartProgress(_plr39.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:subjugation_of_hanami"))).isDone()) {
					{
						double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 350;
						entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.currentExp = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = 7;
						entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StoryModeLevel = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A76<Satoru Gojo> Oh? You were able to defeat Hanami."), false);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.blastfurnace.fire_crackle")), SoundSource.NEUTRAL, (float) 0.5, 2);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.blastfurnace.fire_crackle")), SoundSource.NEUTRAL, (float) 0.5, 2, false);
						}
					}
					CraftKaisenMod.queueServerWork(30, () -> {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("\u00A76<Satoru Gojo> Your final test with me is to beat me in a spar."), false);
						if (world instanceof Level _level) {
							if (!_level.isClientSide()) {
								_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.blastfurnace.fire_crackle")), SoundSource.NEUTRAL, (float) 0.5, 2);
							} else {
								_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.blastfurnace.fire_crackle")), SoundSource.NEUTRAL, (float) 0.5, 2, false);
							}
						}
						CraftKaisenMod.queueServerWork(30, () -> {
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("\u00A76<Satoru Gojo> Find me and defeat me."), false);
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.blastfurnace.fire_crackle")), SoundSource.NEUTRAL, (float) 0.5, 2);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.blastfurnace.fire_crackle")), SoundSource.NEUTRAL, (float) 0.5, 2, false);
								}
							}
						});
					});
				} else {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A76<Satoru Gojo> You still havent defeated hanami!"), false);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.blastfurnace.fire_crackle")), SoundSource.NEUTRAL, (float) 0.5, 2);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.blastfurnace.fire_crackle")), SoundSource.NEUTRAL, (float) 0.5, 2, false);
						}
					}
				}
			} else if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).StoryModeLevel == 7) {
				if (entity instanceof ServerPlayer _plr50 && _plr50.level instanceof ServerLevel
						&& _plr50.getAdvancements().getOrStartProgress(_plr50.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:the_honored_one"))).isDone()) {
					{
						double _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).currentExp + 200;
						entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.currentExp = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					{
						double _setval = 8;
						entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.StoryModeLevel = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A76<Satoru Gojo> You defeated me, I no longer have to train you.. You Now."), false);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.blastfurnace.fire_crackle")), SoundSource.NEUTRAL, (float) 0.5, 2);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.blastfurnace.fire_crackle")), SoundSource.NEUTRAL, (float) 0.5, 2, false);
						}
					}
				} else {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A76<Satoru Gojo> You still havent defeated me."), false);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.blastfurnace.fire_crackle")), SoundSource.NEUTRAL, (float) 0.5, 2);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.blastfurnace.fire_crackle")), SoundSource.NEUTRAL, (float) 0.5, 2, false);
						}
					}
				}
			} else if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).StoryModeLevel == 8) {
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("WIP"), false);
			}
		} else if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).reputation < 0) {
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("Rep must be atleast 0, You currently have "
						+ new java.text.DecimalFormat("#").format((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).reputation) + " Rep.")), true);
		}
	}
}
