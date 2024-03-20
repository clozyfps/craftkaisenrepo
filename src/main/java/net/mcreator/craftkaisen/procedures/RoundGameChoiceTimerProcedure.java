package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

public class RoundGameChoiceTimerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("roundChoiceTimer") > 1) {
			entity.getPersistentData().putDouble("roundChoiceTimer", (entity.getPersistentData().getDouble("roundChoiceTimer") - 1));
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal(("\u00A7a\u00A7l\u00A7oTime Left: " + new java.text.DecimalFormat("#").format(Math.floor(entity.getPersistentData().getDouble("roundChoiceTimer")) / 20))), true);
		} else if (entity.getPersistentData().getDouble("roundChoiceTimer") == 1) {
			entity.getPersistentData().putDouble("roundChoiceTimer", 0);
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.player.levelup")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
			if (entity.getPersistentData().getBoolean("doorRollChosen")) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "title @s title {\"text\":\"Shutter Door Path Chosen!\",\"bold\":true,\"italic\":true,\"color\":\"green\"}");
					}
				}
			} else if (entity.getPersistentData().getBoolean("ballRollChosen")) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "title @s title {\"text\":\"Reserve Ball Path Chosen!\",\"bold\":true,\"italic\":true,\"color\":\"green\"}");
					}
				}
			} else if (!(entity.getPersistentData().getBoolean("doorRollChosen") && entity.getPersistentData().getBoolean("ballRollChosen"))) {
				entity.getPersistentData().putBoolean("consRollChosen", true);
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "title @s title {\"text\":\"Consecutive Effects Path Chosen!\",\"bold\":true,\"italic\":true,\"color\":\"green\"}");
					}
				}
			}
			{
				boolean _setval = true;
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.Rolling = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
