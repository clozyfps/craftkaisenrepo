package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.ServerChatEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;
import net.mcreator.craftkaisen.init.CraftKaisenModMobEffects;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class AskSukunaProcedure {
	@SubscribeEvent
	public static void onChat(ServerChatEvent event) {
		execute(event, event.getPlayer().level, event.getPlayer().getX(), event.getPlayer().getY(), event.getPlayer().getZ(), event.getPlayer(), event.getRawText());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, String text) {
		execute(null, world, x, y, z, entity, text);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, String text) {
		if (entity == null || text == null)
			return;
		double random = 0;
		double sukunacharisma = 0;
		if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).SukunaLevel > 0) {
			if (text.contains("Sukuna Come Out")) {
				if (!(entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(CraftKaisenModMobEffects.SUKUNA.get()))) {
					if (!entity.getPersistentData().getBoolean("sukunacooldown")) {
						sukunacharisma = Mth.nextInt(RandomSource.create(), 1, 5);
						if (sukunacharisma == 2) {
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("\u00A7l\u00A74Sure."), true);
							CallSukunaActivationProcedure.execute(world, x, y, z, entity);
						} else if (sukunacharisma != 2) {
							if (entity instanceof Player _player && !_player.level.isClientSide())
								_player.displayClientMessage(Component.literal("\u00A7l\u00A74Pathetic, Figure it out yourself."), true);
							entity.getPersistentData().putBoolean("sukunacooldown", true);
							entity.getPersistentData().putDouble("sctimer", 2500);
						}
					} else if (entity.getPersistentData().getBoolean("sukunacooldown")) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("\u00A7l\u00A74You're asking too much."), true);
					}
				} else if (entity instanceof LivingEntity _livEnt9 && _livEnt9.hasEffect(CraftKaisenModMobEffects.SUKUNA.get())) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("\u00A7l\u00A74Im Already Out."), true);
				}
			} else if (text.contains("Sukuna Leave")) {
				if (entity instanceof LivingEntity _livEnt11 && _livEnt11.hasEffect(CraftKaisenModMobEffects.SUKUNA.get())) {
					sukunacharisma = Mth.nextInt(RandomSource.create(), 1, 5);
					if (sukunacharisma == 2) {
						if (entity instanceof LivingEntity _entity)
							_entity.removeEffect(CraftKaisenModMobEffects.SUKUNA.get());
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("\u00A7l\u00A74Sure."), true);
						entity.getPersistentData().putBoolean("sukunacooldown", true);
						entity.getPersistentData().putDouble("sctimer", 5000);
					} else if (sukunacharisma != 2) {
						if (entity instanceof Player _player && !_player.level.isClientSide())
							_player.displayClientMessage(Component.literal("\u00A7l\u00A74Nah."), true);
						entity.getPersistentData().putBoolean("sukunacooldown", true);
						entity.getPersistentData().putDouble("sctimer", 600);
					}
				}
			}
		}
	}
}
