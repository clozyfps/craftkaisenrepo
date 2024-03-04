package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class PlayerTickProcedure {
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
		InfinityTickProcedure.execute(world, x, y, z, entity);
		LimitlessTick2Procedure.execute(world, x, y, z, entity);
		LimitlessMovesProcedure.execute(world, x, y, z, entity);
		SetStatsProcedure.execute(world, entity);
		PartyListTickProcedure.execute(world, entity);
		SpecialTickProcedure.execute(entity);
		ChargeTickProcedure.execute(world, x, y, z, entity);
		ReputationSetProcedure.execute(entity);
		QuoteTickProcedure.execute(world, x, y, z, entity);
		PartyListTickProcedure.execute(world, entity);
		TimersProcedure.execute(entity);
		BloodEdgeTickProcedure.execute(entity);
		StopPlayerTickProcedure.execute(entity);
		DisasterPlantsMovesProcedure.execute(world, entity);
		DisasterFlamesMovesProcedure.execute(world, x, y, z, entity);
		AntiGravitySystemMovesProcedure.execute(world, x, y, z, entity);
		PPLTMovesProcedure.execute(entity);
		MeleeMovesProcedure.execute(world, x, y, z, entity);
		WeaponMovesProcedure.execute(entity);
		CursedEnergyMovesProcedure.execute(world, entity);
		CursedSpeechMovesProcedure.execute(entity);
		CopyMovesProcedure.execute(world, x, y, z, entity);
		TenShadowsMovesProcedure.execute(world, x, y, z, entity);
		SukunaMovesProcedure.execute(world, x, y, z, entity);
		IdleTransfigurationMovesProcedure.execute(entity);
		RatioMovesProcedure.execute(world, x, y, z, entity);
		BloodManipulationMovesProcedure.execute(world, x, y, z, entity);
		AuspiciousBeastsSummonMovesProcedure.execute(world, x, y, z, entity);
		IceMovesProcedure.execute(world, x, y, z, entity);
		RestrictedMovesProcedure.execute(world, x, y, z, entity);
		CursedSpiritManipulationMovesProcedure.execute(world, x, y, z, entity);
		BoogieWoogieMovesProcedure.execute(world, x, y, z, entity);
		MissileFistsMovesProcedure.execute(entity);
		ProjectionSorceryMovesProcedure.execute(entity);
		BlackBirdMovesProcedure.execute(world, x, y, z, entity);
		StarPlasmaVesselQuestProcedure.execute(world, x, y, z, entity);
		SixEyesTickProcedure.execute(world, entity);
		GainRikaTrustProcedure.execute(world, x, y, z, entity);
		SpectatorSkillProcedure.execute(entity);
		CooldownSetProcedure.execute(entity);
		ReversalRedTickProcedure.execute(world, entity);
		SetMovesProcedure.execute(entity);
		SetStatsProcedure.execute(world, entity);
		SetStats2Procedure.execute(entity);
		RepEventsProcedure.execute(world, y, z, entity);
		ExpProcedure.execute(world, x, y, z, entity);
		ResistanceHealthProcedure.execute(entity);
		SukunaCooldownProcedure.execute(entity);
		ChantTimerProcedure.execute(world, x, y, z, entity);
		SlamProcedure.execute(world, x, y, z, entity);
	}
}
