package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class RevertTickProcedure {
	public static void execute(LevelAccessor world) {
		if (world.isClientSide()) {
			Minecraft.getInstance().getTextureManager().release(new ResourceLocation("craft_kaisen:textures/screens/emptyslot1.png"));
		}
		if (world.isClientSide()) {
			Minecraft.getInstance().getTextureManager().release(new ResourceLocation("craft_kaisen:textures/screens/emptyslot2.png"));
		}
		if (world.isClientSide()) {
			Minecraft.getInstance().getTextureManager().release(new ResourceLocation("craft_kaisen:textures/screens/emptyslot3.png"));
		}
		if (world.isClientSide()) {
			Minecraft.getInstance().getTextureManager().release(new ResourceLocation("craft_kaisen:textures/screens/emptyslot4.png"));
		}
		if (world.isClientSide()) {
			Minecraft.getInstance().getTextureManager().release(new ResourceLocation("craft_kaisen:textures/screens/emptyslot5.png"));
		}
		if (world.isClientSide()) {
			Minecraft.getInstance().getTextureManager().release(new ResourceLocation("craft_kaisen:textures/screens/emptyslot6.png"));
		}
	}
}
