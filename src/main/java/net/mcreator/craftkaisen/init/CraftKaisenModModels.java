
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.craftkaisen.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.craftkaisen.client.model.Modelyutafitnew;
import net.mcreator.craftkaisen.client.model.Modelyutafinal;
import net.mcreator.craftkaisen.client.model.Modelyutaarmor;
import net.mcreator.craftkaisen.client.model.Modelwintryicles;
import net.mcreator.craftkaisen.client.model.Modeluniformdefault;
import net.mcreator.craftkaisen.client.model.Modeluniform;
import net.mcreator.craftkaisen.client.model.Modeltstoad;
import net.mcreator.craftkaisen.client.model.ModeltpCircle;
import net.mcreator.craftkaisen.client.model.Modeltojishirt;
import net.mcreator.craftkaisen.client.model.Modeltojipants;
import net.mcreator.craftkaisen.client.model.Modeltoji_curse;
import net.mcreator.craftkaisen.client.model.Modeltenshadowsgreatserpent;
import net.mcreator.craftkaisen.client.model.Modelswordslice;
import net.mcreator.craftkaisen.client.model.Modelsukunafit;
import net.mcreator.craftkaisen.client.model.Modelsukunafightingchestplate;
import net.mcreator.craftkaisen.client.model.Modelsorcerernew;
import net.mcreator.craftkaisen.client.model.Modelshinjukufitnew;
import net.mcreator.craftkaisen.client.model.Modelshinjukufitfinal;
import net.mcreator.craftkaisen.client.model.Modelshinjukufit;
import net.mcreator.craftkaisen.client.model.Modelserpentground;
import net.mcreator.craftkaisen.client.model.Modelroppongicursedspirit;
import net.mcreator.craftkaisen.client.model.Modelreversalred;
import net.mcreator.craftkaisen.client.model.Modelrepelpink;
import net.mcreator.craftkaisen.client.model.Modelprisonbox;
import net.mcreator.craftkaisen.client.model.Modelpachinko_ball;
import net.mcreator.craftkaisen.client.model.Modelnewmuzi;
import net.mcreator.craftkaisen.client.model.Modelmouthcursedspirit;
import net.mcreator.craftkaisen.client.model.Modelmaximummeteornewwww;
import net.mcreator.craftkaisen.client.model.Modelmaximumelephantnew;
import net.mcreator.craftkaisen.client.model.Modelmaximumelephant;
import net.mcreator.craftkaisen.client.model.Modelmalevolentshrine;
import net.mcreator.craftkaisen.client.model.Modelmahitooutfit;
import net.mcreator.craftkaisen.client.model.Modelmahitodistorted;
import net.mcreator.craftkaisen.client.model.Modelkashimooutfit;
import net.mcreator.craftkaisen.client.model.Modeljjkoutfiot;
import net.mcreator.craftkaisen.client.model.Modelitadoriuniform;
import net.mcreator.craftkaisen.client.model.Modelinventorycurseground;
import net.mcreator.craftkaisen.client.model.Modelhanami;
import net.mcreator.craftkaisen.client.model.Modelgetosandalsnew;
import net.mcreator.craftkaisen.client.model.Modelgetorobes;
import net.mcreator.craftkaisen.client.model.Modelgetolegs;
import net.mcreator.craftkaisen.client.model.Modelframewall;
import net.mcreator.craftkaisen.client.model.Modelfist;
import net.mcreator.craftkaisen.client.model.Modelfemaleuniform;
import net.mcreator.craftkaisen.client.model.Modeldivinedog;
import net.mcreator.craftkaisen.client.model.Modelcustom_model;
import net.mcreator.craftkaisen.client.model.Modelcursedspiritgrasshopper;
import net.mcreator.craftkaisen.client.model.Modelcurse_1;
import net.mcreator.craftkaisen.client.model.Modelchosodrip;
import net.mcreator.craftkaisen.client.model.Modelchoso;
import net.mcreator.craftkaisen.client.model.Modelchimerafrog;
import net.mcreator.craftkaisen.client.model.Modelcabin;
import net.mcreator.craftkaisen.client.model.Modelbodyrepelpincer;
import net.mcreator.craftkaisen.client.model.Modelbodyrepel1;
import net.mcreator.craftkaisen.client.model.Modelblackblindfold;
import net.mcreator.craftkaisen.client.model.Modelbeastsummonmask;
import net.mcreator.craftkaisen.client.model.ModelYujikunaShirtless;
import net.mcreator.craftkaisen.client.model.ModelYujikuna;
import net.mcreator.craftkaisen.client.model.ModelVoidAccelerate;
import net.mcreator.craftkaisen.client.model.ModelUnlimitedBlackhole;
import net.mcreator.craftkaisen.client.model.ModelTrueSukuna;
import net.mcreator.craftkaisen.client.model.ModelTenShadowBunny;
import net.mcreator.craftkaisen.client.model.ModelSorcererArmor;
import net.mcreator.craftkaisen.client.model.ModelRugbyFieldCurse;
import net.mcreator.craftkaisen.client.model.ModelRoppongiCurse;
import net.mcreator.craftkaisen.client.model.ModelRika;
import net.mcreator.craftkaisen.client.model.ModelMouthSpirit;
import net.mcreator.craftkaisen.client.model.ModelMergedBeastAgito;
import net.mcreator.craftkaisen.client.model.ModelMegunaArmor;
import net.mcreator.craftkaisen.client.model.ModelMeguna;
import net.mcreator.craftkaisen.client.model.ModelMegumiFushiguro;
import net.mcreator.craftkaisen.client.model.ModelMahoragaWheel;
import net.mcreator.craftkaisen.client.model.ModelMahoragaPants;
import net.mcreator.craftkaisen.client.model.ModelMahoragaChest;
import net.mcreator.craftkaisen.client.model.ModelMahoraga;
import net.mcreator.craftkaisen.client.model.ModelJogoModel;
import net.mcreator.craftkaisen.client.model.ModelItadoriYuji;
import net.mcreator.craftkaisen.client.model.ModelInventoryCurse;
import net.mcreator.craftkaisen.client.model.ModelIceBlock;
import net.mcreator.craftkaisen.client.model.ModelHakariDoorsOpen;
import net.mcreator.craftkaisen.client.model.ModelHakariDoorsClosed;
import net.mcreator.craftkaisen.client.model.ModelFrame;
import net.mcreator.craftkaisen.client.model.ModelFlyingCurseSpirit;
import net.mcreator.craftkaisen.client.model.ModelFlyHead;
import net.mcreator.craftkaisen.client.model.ModelFingerBearernew;
import net.mcreator.craftkaisen.client.model.ModelEmberInsect;
import net.mcreator.craftkaisen.client.model.ModelCrowProjectileFlying;
import net.mcreator.craftkaisen.client.model.ModelCrowProjectile;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class CraftKaisenModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelMahoraga.LAYER_LOCATION, ModelMahoraga::createBodyLayer);
		event.registerLayerDefinition(Modelfist.LAYER_LOCATION, Modelfist::createBodyLayer);
		event.registerLayerDefinition(ModelRoppongiCurse.LAYER_LOCATION, ModelRoppongiCurse::createBodyLayer);
		event.registerLayerDefinition(Modelyutafitnew.LAYER_LOCATION, Modelyutafitnew::createBodyLayer);
		event.registerLayerDefinition(ModelYujikunaShirtless.LAYER_LOCATION, ModelYujikunaShirtless::createBodyLayer);
		event.registerLayerDefinition(ModelFrame.LAYER_LOCATION, ModelFrame::createBodyLayer);
		event.registerLayerDefinition(Modelmalevolentshrine.LAYER_LOCATION, Modelmalevolentshrine::createBodyLayer);
		event.registerLayerDefinition(Modelshinjukufitnew.LAYER_LOCATION, Modelshinjukufitnew::createBodyLayer);
		event.registerLayerDefinition(Modelsukunafightingchestplate.LAYER_LOCATION, Modelsukunafightingchestplate::createBodyLayer);
		event.registerLayerDefinition(ModelMergedBeastAgito.LAYER_LOCATION, ModelMergedBeastAgito::createBodyLayer);
		event.registerLayerDefinition(Modeluniformdefault.LAYER_LOCATION, Modeluniformdefault::createBodyLayer);
		event.registerLayerDefinition(ModelItadoriYuji.LAYER_LOCATION, ModelItadoriYuji::createBodyLayer);
		event.registerLayerDefinition(ModelFlyingCurseSpirit.LAYER_LOCATION, ModelFlyingCurseSpirit::createBodyLayer);
		event.registerLayerDefinition(ModelTrueSukuna.LAYER_LOCATION, ModelTrueSukuna::createBodyLayer);
		event.registerLayerDefinition(Modelcursedspiritgrasshopper.LAYER_LOCATION, Modelcursedspiritgrasshopper::createBodyLayer);
		event.registerLayerDefinition(ModelJogoModel.LAYER_LOCATION, ModelJogoModel::createBodyLayer);
		event.registerLayerDefinition(ModelRugbyFieldCurse.LAYER_LOCATION, ModelRugbyFieldCurse::createBodyLayer);
		event.registerLayerDefinition(ModelFingerBearernew.LAYER_LOCATION, ModelFingerBearernew::createBodyLayer);
		event.registerLayerDefinition(Modelmaximumelephant.LAYER_LOCATION, Modelmaximumelephant::createBodyLayer);
		event.registerLayerDefinition(Modelmahitooutfit.LAYER_LOCATION, Modelmahitooutfit::createBodyLayer);
		event.registerLayerDefinition(ModelMahoragaChest.LAYER_LOCATION, ModelMahoragaChest::createBodyLayer);
		event.registerLayerDefinition(Modelshinjukufitfinal.LAYER_LOCATION, Modelshinjukufitfinal::createBodyLayer);
		event.registerLayerDefinition(Modelblackblindfold.LAYER_LOCATION, Modelblackblindfold::createBodyLayer);
		event.registerLayerDefinition(ModelMahoragaWheel.LAYER_LOCATION, ModelMahoragaWheel::createBodyLayer);
		event.registerLayerDefinition(Modeltoji_curse.LAYER_LOCATION, Modeltoji_curse::createBodyLayer);
		event.registerLayerDefinition(ModelMeguna.LAYER_LOCATION, ModelMeguna::createBodyLayer);
		event.registerLayerDefinition(Modelwintryicles.LAYER_LOCATION, Modelwintryicles::createBodyLayer);
		event.registerLayerDefinition(Modelgetorobes.LAYER_LOCATION, Modelgetorobes::createBodyLayer);
		event.registerLayerDefinition(ModelHakariDoorsOpen.LAYER_LOCATION, ModelHakariDoorsOpen::createBodyLayer);
		event.registerLayerDefinition(Modelyutaarmor.LAYER_LOCATION, Modelyutaarmor::createBodyLayer);
		event.registerLayerDefinition(ModelMahoragaPants.LAYER_LOCATION, ModelMahoragaPants::createBodyLayer);
		event.registerLayerDefinition(ModelYujikuna.LAYER_LOCATION, ModelYujikuna::createBodyLayer);
		event.registerLayerDefinition(Modelserpentground.LAYER_LOCATION, Modelserpentground::createBodyLayer);
		event.registerLayerDefinition(ModelCrowProjectile.LAYER_LOCATION, ModelCrowProjectile::createBodyLayer);
		event.registerLayerDefinition(Modelpachinko_ball.LAYER_LOCATION, Modelpachinko_ball::createBodyLayer);
		event.registerLayerDefinition(Modeltojishirt.LAYER_LOCATION, Modeltojishirt::createBodyLayer);
		event.registerLayerDefinition(Modelhanami.LAYER_LOCATION, Modelhanami::createBodyLayer);
		event.registerLayerDefinition(Modelsukunafit.LAYER_LOCATION, Modelsukunafit::createBodyLayer);
		event.registerLayerDefinition(ModelCrowProjectileFlying.LAYER_LOCATION, ModelCrowProjectileFlying::createBodyLayer);
		event.registerLayerDefinition(Modelbeastsummonmask.LAYER_LOCATION, Modelbeastsummonmask::createBodyLayer);
		event.registerLayerDefinition(Modelshinjukufit.LAYER_LOCATION, Modelshinjukufit::createBodyLayer);
		event.registerLayerDefinition(Modelmahitodistorted.LAYER_LOCATION, Modelmahitodistorted::createBodyLayer);
		event.registerLayerDefinition(ModelHakariDoorsClosed.LAYER_LOCATION, ModelHakariDoorsClosed::createBodyLayer);
		event.registerLayerDefinition(Modelswordslice.LAYER_LOCATION, Modelswordslice::createBodyLayer);
		event.registerLayerDefinition(ModelEmberInsect.LAYER_LOCATION, ModelEmberInsect::createBodyLayer);
		event.registerLayerDefinition(ModelVoidAccelerate.LAYER_LOCATION, ModelVoidAccelerate::createBodyLayer);
		event.registerLayerDefinition(Modeluniform.LAYER_LOCATION, Modeluniform::createBodyLayer);
		event.registerLayerDefinition(Modelmaximumelephantnew.LAYER_LOCATION, Modelmaximumelephantnew::createBodyLayer);
		event.registerLayerDefinition(Modelcurse_1.LAYER_LOCATION, Modelcurse_1::createBodyLayer);
		event.registerLayerDefinition(Modelprisonbox.LAYER_LOCATION, Modelprisonbox::createBodyLayer);
		event.registerLayerDefinition(Modelgetosandalsnew.LAYER_LOCATION, Modelgetosandalsnew::createBodyLayer);
		event.registerLayerDefinition(Modelsorcerernew.LAYER_LOCATION, Modelsorcerernew::createBodyLayer);
		event.registerLayerDefinition(Modelrepelpink.LAYER_LOCATION, Modelrepelpink::createBodyLayer);
		event.registerLayerDefinition(Modelgetolegs.LAYER_LOCATION, Modelgetolegs::createBodyLayer);
		event.registerLayerDefinition(Modelinventorycurseground.LAYER_LOCATION, Modelinventorycurseground::createBodyLayer);
		event.registerLayerDefinition(ModelRika.LAYER_LOCATION, ModelRika::createBodyLayer);
		event.registerLayerDefinition(Modeltenshadowsgreatserpent.LAYER_LOCATION, Modeltenshadowsgreatserpent::createBodyLayer);
		event.registerLayerDefinition(Modelyutafinal.LAYER_LOCATION, Modelyutafinal::createBodyLayer);
		event.registerLayerDefinition(ModelMouthSpirit.LAYER_LOCATION, ModelMouthSpirit::createBodyLayer);
		event.registerLayerDefinition(Modeltojipants.LAYER_LOCATION, Modeltojipants::createBodyLayer);
		event.registerLayerDefinition(Modelchosodrip.LAYER_LOCATION, Modelchosodrip::createBodyLayer);
		event.registerLayerDefinition(ModelFlyHead.LAYER_LOCATION, ModelFlyHead::createBodyLayer);
		event.registerLayerDefinition(Modeljjkoutfiot.LAYER_LOCATION, Modeljjkoutfiot::createBodyLayer);
		event.registerLayerDefinition(Modeltstoad.LAYER_LOCATION, Modeltstoad::createBodyLayer);
		event.registerLayerDefinition(Modelroppongicursedspirit.LAYER_LOCATION, Modelroppongicursedspirit::createBodyLayer);
		event.registerLayerDefinition(Modelbodyrepelpincer.LAYER_LOCATION, Modelbodyrepelpincer::createBodyLayer);
		event.registerLayerDefinition(ModelMegunaArmor.LAYER_LOCATION, ModelMegunaArmor::createBodyLayer);
		event.registerLayerDefinition(Modelchimerafrog.LAYER_LOCATION, Modelchimerafrog::createBodyLayer);
		event.registerLayerDefinition(Modelcabin.LAYER_LOCATION, Modelcabin::createBodyLayer);
		event.registerLayerDefinition(ModelMegumiFushiguro.LAYER_LOCATION, ModelMegumiFushiguro::createBodyLayer);
		event.registerLayerDefinition(Modelfemaleuniform.LAYER_LOCATION, Modelfemaleuniform::createBodyLayer);
		event.registerLayerDefinition(ModelIceBlock.LAYER_LOCATION, ModelIceBlock::createBodyLayer);
		event.registerLayerDefinition(Modelframewall.LAYER_LOCATION, Modelframewall::createBodyLayer);
		event.registerLayerDefinition(Modelchoso.LAYER_LOCATION, Modelchoso::createBodyLayer);
		event.registerLayerDefinition(Modelbodyrepel1.LAYER_LOCATION, Modelbodyrepel1::createBodyLayer);
		event.registerLayerDefinition(Modelitadoriuniform.LAYER_LOCATION, Modelitadoriuniform::createBodyLayer);
		event.registerLayerDefinition(ModeltpCircle.LAYER_LOCATION, ModeltpCircle::createBodyLayer);
		event.registerLayerDefinition(ModelSorcererArmor.LAYER_LOCATION, ModelSorcererArmor::createBodyLayer);
		event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
		event.registerLayerDefinition(Modelkashimooutfit.LAYER_LOCATION, Modelkashimooutfit::createBodyLayer);
		event.registerLayerDefinition(Modelmouthcursedspirit.LAYER_LOCATION, Modelmouthcursedspirit::createBodyLayer);
		event.registerLayerDefinition(ModelInventoryCurse.LAYER_LOCATION, ModelInventoryCurse::createBodyLayer);
		event.registerLayerDefinition(Modelreversalred.LAYER_LOCATION, Modelreversalred::createBodyLayer);
		event.registerLayerDefinition(ModelTenShadowBunny.LAYER_LOCATION, ModelTenShadowBunny::createBodyLayer);
		event.registerLayerDefinition(ModelUnlimitedBlackhole.LAYER_LOCATION, ModelUnlimitedBlackhole::createBodyLayer);
		event.registerLayerDefinition(Modeldivinedog.LAYER_LOCATION, Modeldivinedog::createBodyLayer);
		event.registerLayerDefinition(Modelmaximummeteornewwww.LAYER_LOCATION, Modelmaximummeteornewwww::createBodyLayer);
		event.registerLayerDefinition(Modelnewmuzi.LAYER_LOCATION, Modelnewmuzi::createBodyLayer);
	}
}
