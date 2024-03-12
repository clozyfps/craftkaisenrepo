
package net.mcreator.craftkaisen.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.Minecraft;

import net.mcreator.craftkaisen.procedures.DisplayJackpotTwo3Procedure;
import net.mcreator.craftkaisen.procedures.DisplayJackpotTwo2Procedure;
import net.mcreator.craftkaisen.procedures.DisplayJackpotTwo1Procedure;
import net.mcreator.craftkaisen.procedures.DisplayJackpotThree3Procedure;
import net.mcreator.craftkaisen.procedures.DisplayJackpotThree2Procedure;
import net.mcreator.craftkaisen.procedures.DisplayJackpotThree1Procedure;
import net.mcreator.craftkaisen.procedures.DisplayJackpotSix3Procedure;
import net.mcreator.craftkaisen.procedures.DisplayJackpotSix2Procedure;
import net.mcreator.craftkaisen.procedures.DisplayJackpotSix1Procedure;
import net.mcreator.craftkaisen.procedures.DisplayJackpotSeven3Procedure;
import net.mcreator.craftkaisen.procedures.DisplayJackpotSeven2Procedure;
import net.mcreator.craftkaisen.procedures.DisplayJackpotSeven1Procedure;
import net.mcreator.craftkaisen.procedures.DisplayJackpotOne3Procedure;
import net.mcreator.craftkaisen.procedures.DisplayJackpotOne2Procedure;
import net.mcreator.craftkaisen.procedures.DisplayJackpotOne1Procedure;
import net.mcreator.craftkaisen.procedures.DisplayJackpotFour3Procedure;
import net.mcreator.craftkaisen.procedures.DisplayJackpotFour2Procedure;
import net.mcreator.craftkaisen.procedures.DisplayJackpotFour1Procedure;
import net.mcreator.craftkaisen.procedures.DisplayJackpotFive3Procedure;
import net.mcreator.craftkaisen.procedures.DisplayJackpotFive2Procedure;
import net.mcreator.craftkaisen.procedures.DisplayJackpotFive1Procedure;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.platform.GlStateManager;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class PachinkoOverlayOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level;
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		RenderSystem.disableDepthTest();
		RenderSystem.depthMask(false);
		RenderSystem.enableBlend();
		RenderSystem.setShader(GameRenderer::getPositionTexShader);
		RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
		RenderSystem.setShaderColor(1, 1, 1, 1);
		if (true) {
			if (DisplayJackpotOne1Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/jackpot1.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, h / 2 + -49, 0, 0, 100, 100, 100, 100);
			}
			if (DisplayJackpotOne2Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/jackpot1.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -50, h / 2 + -49, 0, 0, 100, 100, 100, 100);
			}
			if (DisplayJackpotOne3Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/jackpot1.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + 81, h / 2 + -49, 0, 0, 100, 100, 100, 100);
			}
			if (DisplayJackpotTwo1Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/jackpot2.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, h / 2 + -49, 0, 0, 100, 100, 100, 100);
			}
			if (DisplayJackpotTwo2Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/jackpot2.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -50, h / 2 + -49, 0, 0, 100, 100, 100, 100);
			}
			if (DisplayJackpotTwo3Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/jackpot2.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + 81, h / 2 + -49, 0, 0, 100, 100, 100, 100);
			}
			if (DisplayJackpotThree1Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/jackpot3.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, h / 2 + -49, 0, 0, 100, 100, 100, 100);
			}
			if (DisplayJackpotThree2Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/jackpot3.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -50, h / 2 + -49, 0, 0, 100, 100, 100, 100);
			}
			if (DisplayJackpotThree3Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/jackpot3.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + 81, h / 2 + -49, 0, 0, 100, 100, 100, 100);
			}
			if (DisplayJackpotFour1Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/jackpot4.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, h / 2 + -49, 0, 0, 100, 100, 100, 100);
			}
			if (DisplayJackpotFour2Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/jackpot4.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -50, h / 2 + -49, 0, 0, 100, 100, 100, 100);
			}
			if (DisplayJackpotFour3Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/jackpot4.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + 81, h / 2 + -49, 0, 0, 100, 100, 100, 100);
			}
			if (DisplayJackpotFive1Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/jackpot5.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, h / 2 + -49, 0, 0, 100, 100, 100, 100);
			}
			if (DisplayJackpotFive2Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/jackpot5.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -50, h / 2 + -49, 0, 0, 100, 100, 100, 100);
			}
			if (DisplayJackpotFive3Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/jackpot5.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + 81, h / 2 + -49, 0, 0, 100, 100, 100, 100);
			}
			if (DisplayJackpotSix1Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/jackpot6.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, h / 2 + -49, 0, 0, 100, 100, 100, 100);
			}
			if (DisplayJackpotSix2Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/jackpot6.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -50, h / 2 + -49, 0, 0, 100, 100, 100, 100);
			}
			if (DisplayJackpotSix3Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/jackpot6.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + 81, h / 2 + -49, 0, 0, 100, 100, 100, 100);
			}
			if (DisplayJackpotSeven1Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/jackpot7.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, h / 2 + -49, 0, 0, 100, 100, 100, 100);
			}
			if (DisplayJackpotSeven2Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/jackpot7.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -50, h / 2 + -49, 0, 0, 100, 100, 100, 100);
			}
			if (DisplayJackpotSeven3Procedure.execute(entity)) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/jackpot7.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + 81, h / 2 + -49, 0, 0, 100, 100, 100, 100);
			}
		}
		RenderSystem.depthMask(true);
		RenderSystem.defaultBlendFunc();
		RenderSystem.enableDepthTest();
		RenderSystem.disableBlend();
		RenderSystem.setShaderColor(1, 1, 1, 1);
	}
}
