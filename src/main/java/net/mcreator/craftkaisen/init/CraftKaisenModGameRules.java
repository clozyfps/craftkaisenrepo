
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.GameRules;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CraftKaisenModGameRules {
	public static final GameRules.Key<GameRules.IntegerValue> MAXIMUM_SUKUNA_VESSEL_PLAYERS = GameRules.register("maximumSukunaVesselPlayers", GameRules.Category.MISC, GameRules.IntegerValue.create(1));
	public static final GameRules.Key<GameRules.BooleanValue> SUKUNA_VESSEL_MODE = GameRules.register("sukunaVesselMode", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> FORCE_SUKUNA_TECHNIQUE = GameRules.register("forceSukunaTechnique", GameRules.Category.MISC, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> HARDCORE_LIVES = GameRules.register("hardcoreLives", GameRules.Category.PLAYER, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> SMP_SETTING = GameRules.register("sMPSetting", GameRules.Category.MISC, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> MALEVOLENT_SHRINE_BLOCK_DAMAGE = GameRules.register("malevolentShrineBlockDamage", GameRules.Category.PLAYER, GameRules.BooleanValue.create(true));
	public static final GameRules.Key<GameRules.BooleanValue> OP_BLESSED_BY_THE_SPARKS = GameRules.register("oPBlessedByTheSparks", GameRules.Category.PLAYER, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> NO_OVERWHELMING_PRESSURE = GameRules.register("noOverwhelmingPressure", GameRules.Category.PLAYER, GameRules.BooleanValue.create(false));
	public static final GameRules.Key<GameRules.BooleanValue> SUKUNA_LITERAL_TAKEOVER = GameRules.register("sukunaLiteralTakeover", GameRules.Category.PLAYER, GameRules.BooleanValue.create(false));
}
