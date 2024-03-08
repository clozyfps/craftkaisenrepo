
package net.mcreator.craftkaisen.client.screens;

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

			if (

			DisplayJackpotOne1Procedure.execute()

			) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/jackpot1.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, h / 2 + -49, 0, 0, 100, 100, 100, 100);
			}
			if (

			DisplayJackpotOne2Procedure.execute()

			) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/jackpot1.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -50, h / 2 + -49, 0, 0, 100, 100, 100, 100);
			}
			if (

			DisplayJackpotOne3Procedure.execute()

			) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/jackpot1.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + 81, h / 2 + -49, 0, 0, 100, 100, 100, 100);
			}
			if (

			DisplayJackpotTwo1Procedure.execute()

			) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/jackpot2.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, h / 2 + -49, 0, 0, 100, 100, 100, 100);
			}
			if (

			DisplayJackpotTwo2Procedure.execute()

			) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/jackpot2.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -50, h / 2 + -49, 0, 0, 100, 100, 100, 100);
			}
			if (

			DisplayJackpotTwo3Procedure.execute()

			) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/jackpot2.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + 81, h / 2 + -49, 0, 0, 100, 100, 100, 100);
			}
			if (

			DisplayJackpotThree1Procedure.execute()

			) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/jackpot3.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, h / 2 + -49, 0, 0, 100, 100, 100, 100);
			}
			if (

			DisplayJackpotThree2Procedure.execute()

			) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/jackpot3.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -50, h / 2 + -49, 0, 0, 100, 100, 100, 100);
			}
			if (

			DisplayJackpotThree3Procedure.execute()

			) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/jackpot3.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + 81, h / 2 + -49, 0, 0, 100, 100, 100, 100);
			}
			if (

			DisplayJackpotFour1Procedure.execute()

			) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/jackpot4.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, h / 2 + -49, 0, 0, 100, 100, 100, 100);
			}
			if (

			DisplayJackpotFour2Procedure.execute()

			) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/jackpot4.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -50, h / 2 + -49, 0, 0, 100, 100, 100, 100);
			}
			if (

			DisplayJackpotFour3Procedure.execute()

			) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/jackpot4.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + 81, h / 2 + -49, 0, 0, 100, 100, 100, 100);
			}
			if (

			DisplayJackpotFive1Procedure.execute()

			) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/jackpot5.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, h / 2 + -49, 0, 0, 100, 100, 100, 100);
			}
			if (

			DisplayJackpotFive2Procedure.execute()

			) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/jackpot5.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -50, h / 2 + -49, 0, 0, 100, 100, 100, 100);
			}
			if (

			DisplayJackpotFive3Procedure.execute()

			) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/jackpot5.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + 81, h / 2 + -49, 0, 0, 100, 100, 100, 100);
			}
			if (

			DisplayJackpotSix1Procedure.execute()

			) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/jackpot6.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, h / 2 + -49, 0, 0, 100, 100, 100, 100);
			}
			if (

			DisplayJackpotSix2Procedure.execute()

			) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/jackpot6.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -50, h / 2 + -49, 0, 0, 100, 100, 100, 100);
			}
			if (

			DisplayJackpotSix3Procedure.execute()

			) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/jackpot6.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + 81, h / 2 + -49, 0, 0, 100, 100, 100, 100);
			}
			if (

			DisplayJackpotSeven1Procedure.execute()

			) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/jackpot7.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -180, h / 2 + -49, 0, 0, 100, 100, 100, 100);
			}
			if (

			DisplayJackpotSeven2Procedure.execute()

			) {
				RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/jackpot7.png"));
				Minecraft.getInstance().gui.blit(event.getPoseStack(), w / 2 + -50, h / 2 + -49, 0, 0, 100, 100, 100, 100);
			}
			if (

			DisplayJackpotSeven3Procedure.execute()

			) {
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
