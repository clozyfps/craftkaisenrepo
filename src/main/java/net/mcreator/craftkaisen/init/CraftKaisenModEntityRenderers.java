
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.craftkaisen.client.renderer.YutaOkkotsuRenderer;
import net.mcreator.craftkaisen.client.renderer.YujiItadoriRenderer;
import net.mcreator.craftkaisen.client.renderer.WoodenBoxRenderer;
import net.mcreator.craftkaisen.client.renderer.WhiteDivineDogRenderer;
import net.mcreator.craftkaisen.client.renderer.UraumeRenderer;
import net.mcreator.craftkaisen.client.renderer.UnlimitedVoidMobRenderer;
import net.mcreator.craftkaisen.client.renderer.UnlimitedVoidAccelerateRenderer;
import net.mcreator.craftkaisen.client.renderer.TojiFushiguroRenderer;
import net.mcreator.craftkaisen.client.renderer.TogeInumakiRenderer;
import net.mcreator.craftkaisen.client.renderer.ToadRenderer;
import net.mcreator.craftkaisen.client.renderer.ThrowPlayerMobRenderer;
import net.mcreator.craftkaisen.client.renderer.TenShadowRabbitRenderer;
import net.mcreator.craftkaisen.client.renderer.TakadaRenderer;
import net.mcreator.craftkaisen.client.renderer.SuguruGetoRenderer;
import net.mcreator.craftkaisen.client.renderer.SmallPoxDomainSpawnerRenderer;
import net.mcreator.craftkaisen.client.renderer.SmallPoxDeityRenderer;
import net.mcreator.craftkaisen.client.renderer.ShinjukuGojoRenderer;
import net.mcreator.craftkaisen.client.renderer.ShadowFrogRenderer;
import net.mcreator.craftkaisen.client.renderer.ScouterCrowProjectileRenderer;
import net.mcreator.craftkaisen.client.renderer.SatoruGojoRenderer;
import net.mcreator.craftkaisen.client.renderer.RyomenSukunaRenderer;
import net.mcreator.craftkaisen.client.renderer.RugbyFieldCursedSpiritRenderer;
import net.mcreator.craftkaisen.client.renderer.RoundDeerRenderer;
import net.mcreator.craftkaisen.client.renderer.RoppongiCursedSpiritRenderer;
import net.mcreator.craftkaisen.client.renderer.RopeMobRenderer;
import net.mcreator.craftkaisen.client.renderer.RikoAmanaiRenderer;
import net.mcreator.craftkaisen.client.renderer.RikaRenderer;
import net.mcreator.craftkaisen.client.renderer.ReversalRedEntityRenderer;
import net.mcreator.craftkaisen.client.renderer.ResurrectedTojiRenderer;
import net.mcreator.craftkaisen.client.renderer.RedOpenDoorRenderer;
import net.mcreator.craftkaisen.client.renderer.RedClosedDoorRenderer;
import net.mcreator.craftkaisen.client.renderer.RainbowOpenDoorRenderer;
import net.mcreator.craftkaisen.client.renderer.RainbowDragonRenderer;
import net.mcreator.craftkaisen.client.renderer.RainbowClosedDoorRenderer;
import net.mcreator.craftkaisen.client.renderer.PoxDeityDomainRenderer;
import net.mcreator.craftkaisen.client.renderer.OldLadyRenderer;
import net.mcreator.craftkaisen.client.renderer.NueRenderer;
import net.mcreator.craftkaisen.client.renderer.NobaraKugisakiRenderer;
import net.mcreator.craftkaisen.client.renderer.NaobitoRenderer;
import net.mcreator.craftkaisen.client.renderer.NanamiKentoRenderer;
import net.mcreator.craftkaisen.client.renderer.MouthCursedSpiritRenderer;
import net.mcreator.craftkaisen.client.renderer.MergedBeastAgitoRenderer;
import net.mcreator.craftkaisen.client.renderer.MeiMeiRenderer;
import net.mcreator.craftkaisen.client.renderer.MegunaRenderer;
import net.mcreator.craftkaisen.client.renderer.MegumiFushiguroRenderer;
import net.mcreator.craftkaisen.client.renderer.MaximumElephantRenderer;
import net.mcreator.craftkaisen.client.renderer.MaxMeteorRenderer;
import net.mcreator.craftkaisen.client.renderer.MalevolentShrineRenderer;
import net.mcreator.craftkaisen.client.renderer.MahitoRenderer;
import net.mcreator.craftkaisen.client.renderer.MahitoCloneRenderer;
import net.mcreator.craftkaisen.client.renderer.KoGuyRenderer;
import net.mcreator.craftkaisen.client.renderer.KenjakuRenderer;
import net.mcreator.craftkaisen.client.renderer.JogoRenderer;
import net.mcreator.craftkaisen.client.renderer.JinichiZeninRenderer;
import net.mcreator.craftkaisen.client.renderer.InventoryCurseMobRenderer;
import net.mcreator.craftkaisen.client.renderer.IcileRenderer;
import net.mcreator.craftkaisen.client.renderer.HundredDemonsTickRenderer;
import net.mcreator.craftkaisen.client.renderer.HeianEraSukunaRenderer;
import net.mcreator.craftkaisen.client.renderer.HanamiRenderer;
import net.mcreator.craftkaisen.client.renderer.HajimeKashimoRenderer;
import net.mcreator.craftkaisen.client.renderer.GreenOpenDoorRenderer;
import net.mcreator.craftkaisen.client.renderer.GreenClosedDoorRenderer;
import net.mcreator.craftkaisen.client.renderer.GreatSerpentRenderer;
import net.mcreator.craftkaisen.client.renderer.GoldOpenDoorRenderer;
import net.mcreator.craftkaisen.client.renderer.GoldClosedDoorRenderer;
import net.mcreator.craftkaisen.client.renderer.FrozenFrameRenderer;
import net.mcreator.craftkaisen.client.renderer.FrameRayRenderer;
import net.mcreator.craftkaisen.client.renderer.FrameMobRenderer;
import net.mcreator.craftkaisen.client.renderer.FlyingCursedSpiritRenderer;
import net.mcreator.craftkaisen.client.renderer.FlyHeadRenderer;
import net.mcreator.craftkaisen.client.renderer.FistProjectileRenderer;
import net.mcreator.craftkaisen.client.renderer.FireArrowStormRenderer;
import net.mcreator.craftkaisen.client.renderer.FingerBearerRenderer;
import net.mcreator.craftkaisen.client.renderer.EmberInsectRenderer;
import net.mcreator.craftkaisen.client.renderer.EmberInsectProjectileProjectileRenderer;
import net.mcreator.craftkaisen.client.renderer.EightHandledSwordDivergentSilaDivineGeneralMahoragaRenderer;
import net.mcreator.craftkaisen.client.renderer.CrowRenderer;
import net.mcreator.craftkaisen.client.renderer.CrowMeiMeiRenderer;
import net.mcreator.craftkaisen.client.renderer.CoffinMountainRenderer;
import net.mcreator.craftkaisen.client.renderer.ChosoRenderer;
import net.mcreator.craftkaisen.client.renderer.ChimeraShadowGardenMobRenderer;
import net.mcreator.craftkaisen.client.renderer.BodyRepel3Renderer;
import net.mcreator.craftkaisen.client.renderer.BodyRepel2Renderer;
import net.mcreator.craftkaisen.client.renderer.BodyRepel1Renderer;
import net.mcreator.craftkaisen.client.renderer.BlueEntityRenderer;
import net.mcreator.craftkaisen.client.renderer.BlackDivineDogRenderer;
import net.mcreator.craftkaisen.client.renderer.BlackBirdProjectileRenderer;
import net.mcreator.craftkaisen.client.renderer.BindingIceBlockRenderer;
import net.mcreator.craftkaisen.client.renderer.AwakenedMakiRenderer;
import net.mcreator.craftkaisen.client.renderer.AoiTodoRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class CraftKaisenModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(CraftKaisenModEntities.REVERSAL_RED_ENTITY.get(), ReversalRedEntityRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.SATORU_GOJO.get(), SatoruGojoRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.TOJI_FUSHIGURO.get(), TojiFushiguroRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.YUJI_ITADORI.get(), YujiItadoriRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.RYOMEN_SUKUNA.get(), RyomenSukunaRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.ROPPONGI_CURSED_SPIRIT.get(), RoppongiCursedSpiritRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.YUTA_OKKOTSU.get(), YutaOkkotsuRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.RIKA.get(), RikaRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.GREAT_SERPENT.get(), GreatSerpentRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.RUGBY_FIELD_CURSED_SPIRIT.get(), RugbyFieldCursedSpiritRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.KO_GUY.get(), KoGuyRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.HEIAN_ERA_SUKUNA.get(), HeianEraSukunaRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.TOAD.get(), ToadRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.UNLIMITED_VOID_MOB.get(), UnlimitedVoidMobRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.NUE.get(), NueRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.CHOSO.get(), ChosoRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.MOUTH_CURSED_SPIRIT.get(), MouthCursedSpiritRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.MAHITO.get(), MahitoRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.NANAMI_KENTO.get(), NanamiKentoRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.MALEVOLENT_SHRINE.get(), MalevolentShrineRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.HANAMI.get(), HanamiRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.JOGO.get(), JogoRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.ROUND_DEER.get(), RoundDeerRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.RESURRECTED_TOJI.get(), ResurrectedTojiRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.MAXIMUM_ELEPHANT.get(), MaximumElephantRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.BLACK_DIVINE_DOG.get(), BlackDivineDogRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.WHITE_DIVINE_DOG.get(), WhiteDivineDogRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.TEN_SHADOW_RABBIT.get(), TenShadowRabbitRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.SHADOW_FROG.get(), ShadowFrogRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.CHIMERA_SHADOW_GARDEN_MOB.get(), ChimeraShadowGardenMobRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.NOBARA_KUGISAKI.get(), NobaraKugisakiRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.EMBER_INSECT.get(), EmberInsectRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.MAX_METEOR.get(), MaxMeteorRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.COFFIN_MOUNTAIN.get(), CoffinMountainRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.INVENTORY_CURSE_MOB.get(), InventoryCurseMobRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.FINGER_BEARER.get(), FingerBearerRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.EIGHT_HANDLED_SWORD_DIVERGENT_SILA_DIVINE_GENERAL_MAHORAGA.get(), EightHandledSwordDivergentSilaDivineGeneralMahoragaRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.RAINBOW_DRAGON.get(), RainbowDragonRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.SMALL_POX_DEITY.get(), SmallPoxDeityRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.WOODEN_BOX.get(), WoodenBoxRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.SMALL_POX_DOMAIN_SPAWNER.get(), SmallPoxDomainSpawnerRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.POX_DEITY_DOMAIN.get(), PoxDeityDomainRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.MAHITO_CLONE.get(), MahitoCloneRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.FLY_HEAD.get(), FlyHeadRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.OLD_LADY.get(), OldLadyRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.RIKO_AMANAI.get(), RikoAmanaiRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.BLUE_ENTITY.get(), BlueEntityRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.EXPLODE_RANGED_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.REVERSAL_RED_PROJECTILE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.DONT_MOVE_RANGED_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.BLAST_AWAY_RANGED_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.CRUMBLE_AWAY_RANGED_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.CRUSHED_RANGED_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.SLEEP_RANGED_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.RUN_AWAY_RANGED_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.TWIST_RANGED_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.FIRE_ARROW_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.FIRE_ARROW_MOB_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.BLACK_MUCUS_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.DISMANTLE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.FIND_BLUE_LOCATION_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.BLOOD_METEORITE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.SLICING_EXCORISM_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.REVERSAL_RED_PROJECTILE_1.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.WATER_MAXIMUM_ELEPHANT_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.NAIL_PROJECTILE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.DISASTER_FLAME_RANGED_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.VOLCANIC_ERUPTION_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.FLOWER_PROJECTILE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.HOLLOW_PURPLE_PROJECTILE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.EMBER_INSECT_PROJECTILE_PROJECTILE.get(), EmberInsectProjectileProjectileRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.PURE_LOVE_BEAM_RANGED_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.ROOT_PROJECTILE_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.STRONGHIT_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.LAPSE_BLUE_RANGED_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.AWAKENED_MAKI.get(), AwakenedMakiRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.BODY_REPEL_1.get(), BodyRepel1Renderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.BODY_REPEL_2.get(), BodyRepel2Renderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.BODY_REPEL_3.get(), BodyRepel3Renderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.ROPE_MOB.get(), RopeMobRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.SUGURU_GETO.get(), SuguruGetoRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.MEGUNA.get(), MegunaRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.HOLLOW_PURPLE_GOJO.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.HAJIME_KASHIMO.get(), HajimeKashimoRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.FINGER_BEARER_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.MERGED_BEAST_AGITO.get(), MergedBeastAgitoRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.MEGUMI_FUSHIGURO.get(), MegumiFushiguroRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.TOGE_INUMAKI.get(), TogeInumakiRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.KAICHI.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.TAKADA.get(), TakadaRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.AOI_TODO.get(), AoiTodoRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.DISMANTLE_PR.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.FIRE_ARROW_STORM.get(), FireArrowStormRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.HUNDRED_DEMONS_TICK.get(), HundredDemonsTickRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.ICILE.get(), IcileRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.ICE_NEEDLE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.ICE_TICKING.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.URAUME.get(), UraumeRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.GREEN_OPEN_DOOR.get(), GreenOpenDoorRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.RED_OPEN_DOOR.get(), RedOpenDoorRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.GOLD_OPEN_DOOR.get(), GoldOpenDoorRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.RAINBOW_OPEN_DOOR.get(), RainbowOpenDoorRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.GREEN_CLOSED_DOOR.get(), GreenClosedDoorRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.RED_CLOSED_DOOR.get(), RedClosedDoorRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.GOLD_CLOSED_DOOR.get(), GoldClosedDoorRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.RAINBOW_CLOSED_DOOR.get(), RainbowClosedDoorRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.DOORS_CHECKER.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.JINICHI_ZENIN.get(), JinichiZeninRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.FIST_PROJECTILE.get(), FistProjectileRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.FLYING_CURSED_SPIRIT.get(), FlyingCursedSpiritRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.FRAME_RAY.get(), FrameRayRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.FRAME_MOB.get(), FrameMobRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.FROZEN_FRAME.get(), FrozenFrameRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.MEI_MEI.get(), MeiMeiRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.BLACK_BIRD_PROJECTILE.get(), BlackBirdProjectileRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.CROW.get(), CrowRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.SCOUTER_CROW_PROJECTILE.get(), ScouterCrowProjectileRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.CROW_MEI_MEI.get(), CrowMeiMeiRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.SHINJUKU_GOJO.get(), ShinjukuGojoRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.KENJAKU.get(), KenjakuRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.BINDING_ICE_BLOCK.get(), BindingIceBlockRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.UNLIMITED_VOID_ACCELERATE.get(), UnlimitedVoidAccelerateRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.NAOBITO.get(), NaobitoRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.PIERCING_BLOOD_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.THROW_PLAYER_MOB.get(), ThrowPlayerMobRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.WORLD_CUT_DISMANTLE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(CraftKaisenModEntities.STRONG_PUNCH.get(), ThrownItemRenderer::new);
	}
}