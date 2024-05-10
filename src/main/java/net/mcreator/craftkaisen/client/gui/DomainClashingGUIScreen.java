package net.mcreator.craftkaisen.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.ImageButton;

import net.mcreator.craftkaisen.world.inventory.DomainClashingGUIMenu;
import net.mcreator.craftkaisen.procedures.DomainClashingButton4Procedure;
import net.mcreator.craftkaisen.procedures.DomainClashingButton3Procedure;
import net.mcreator.craftkaisen.procedures.DomainClashButton2Procedure;
import net.mcreator.craftkaisen.procedures.DomainClashButton1Procedure;
import net.mcreator.craftkaisen.network.DomainClashingGUIButtonMessage;
import net.mcreator.craftkaisen.CraftKaisenMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class DomainClashingGUIScreen extends AbstractContainerScreen<DomainClashingGUIMenu> {
	private final static HashMap<String, Object> guistate = DomainClashingGUIMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	ImageButton imagebutton_domaiexpansionclickbutton;
	ImageButton imagebutton_domaiexpansionclickbutton1;
	ImageButton imagebutton_domaiexpansionclickbutton2;
	ImageButton imagebutton_domaiexpansionclickbutton3;

	public DomainClashingGUIScreen(DomainClashingGUIMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 0;
		this.imageHeight = 0;
	}

	private static final ResourceLocation texture = new ResourceLocation("craft_kaisen:textures/screens/domain_clashing_gui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("craft_kaisen:textures/screens/domainclashinggui.png"));
		this.blit(ms, this.leftPos + -88, this.topPos + -83, 0, 0, 176, 166, 176, 166);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.craft_kaisen.domain_clashing_gui.label_click_the_buttons"), -41, -5, -1);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
		imagebutton_domaiexpansionclickbutton = new ImageButton(this.leftPos + -69, this.topPos + -39, 40, 17, 0, 0, 17, new ResourceLocation("craft_kaisen:textures/screens/atlas/imagebutton_domaiexpansionclickbutton.png"), 40, 34, e -> {
			if (DomainClashButton1Procedure.execute(entity)) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new DomainClashingGUIButtonMessage(0, x, y, z));
				DomainClashingGUIButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (DomainClashButton1Procedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_domaiexpansionclickbutton", imagebutton_domaiexpansionclickbutton);
		this.addRenderableWidget(imagebutton_domaiexpansionclickbutton);
		imagebutton_domaiexpansionclickbutton1 = new ImageButton(this.leftPos + 28, this.topPos + 31, 40, 17, 0, 0, 17, new ResourceLocation("craft_kaisen:textures/screens/atlas/imagebutton_domaiexpansionclickbutton1.png"), 40, 34, e -> {
			if (DomainClashingButton4Procedure.execute(entity)) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new DomainClashingGUIButtonMessage(1, x, y, z));
				DomainClashingGUIButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (DomainClashingButton4Procedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_domaiexpansionclickbutton1", imagebutton_domaiexpansionclickbutton1);
		this.addRenderableWidget(imagebutton_domaiexpansionclickbutton1);
		imagebutton_domaiexpansionclickbutton2 = new ImageButton(this.leftPos + 28, this.topPos + -40, 40, 17, 0, 0, 17, new ResourceLocation("craft_kaisen:textures/screens/atlas/imagebutton_domaiexpansionclickbutton2.png"), 40, 34, e -> {
			if (DomainClashButton2Procedure.execute(entity)) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new DomainClashingGUIButtonMessage(2, x, y, z));
				DomainClashingGUIButtonMessage.handleButtonAction(entity, 2, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (DomainClashButton2Procedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_domaiexpansionclickbutton2", imagebutton_domaiexpansionclickbutton2);
		this.addRenderableWidget(imagebutton_domaiexpansionclickbutton2);
		imagebutton_domaiexpansionclickbutton3 = new ImageButton(this.leftPos + -70, this.topPos + 31, 40, 17, 0, 0, 17, new ResourceLocation("craft_kaisen:textures/screens/atlas/imagebutton_domaiexpansionclickbutton3.png"), 40, 34, e -> {
			if (DomainClashingButton3Procedure.execute(entity)) {
				CraftKaisenMod.PACKET_HANDLER.sendToServer(new DomainClashingGUIButtonMessage(3, x, y, z));
				DomainClashingGUIButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}) {
			@Override
			public void render(PoseStack ms, int gx, int gy, float ticks) {
				if (DomainClashingButton3Procedure.execute(entity))
					super.render(ms, gx, gy, ticks);
			}
		};
		guistate.put("button:imagebutton_domaiexpansionclickbutton3", imagebutton_domaiexpansionclickbutton3);
		this.addRenderableWidget(imagebutton_domaiexpansionclickbutton3);
	}
}
