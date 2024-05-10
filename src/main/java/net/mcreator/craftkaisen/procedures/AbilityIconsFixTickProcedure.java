package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class AbilityIconsFixTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double randomnature = 0;
		if (world.isClientSide()) {
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).ability1).equals("")) {
				if (world.isClientSide()) {
					if (world.isClientSide()) {
						Minecraft.getInstance().getTextureManager().bindForSetup(new ResourceLocation("craft_kaisen:textures/screens/emptyslot.png"));
						Minecraft.getInstance().getTextureManager().register(new ResourceLocation("craft_kaisen:textures/screens/emptyslot1.png"),
								Minecraft.getInstance().getTextureManager().getTexture(new ResourceLocation("craft_kaisen:textures/screens/emptyslot.png")));
					}
				}
			}
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).ability2).equals("")) {
				if (world.isClientSide()) {
					if (world.isClientSide()) {
						Minecraft.getInstance().getTextureManager().bindForSetup(new ResourceLocation("craft_kaisen:textures/screens/emptyslot.png"));
						Minecraft.getInstance().getTextureManager().register(new ResourceLocation("craft_kaisen:textures/screens/emptyslot2.png"),
								Minecraft.getInstance().getTextureManager().getTexture(new ResourceLocation("craft_kaisen:textures/screens/emptyslot.png")));
					}
				}
			}
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).ability3).equals("")) {
				if (world.isClientSide()) {
					if (world.isClientSide()) {
						Minecraft.getInstance().getTextureManager().bindForSetup(new ResourceLocation("craft_kaisen:textures/screens/emptyslot.png"));
						Minecraft.getInstance().getTextureManager().register(new ResourceLocation("craft_kaisen:textures/screens/emptyslot3.png"),
								Minecraft.getInstance().getTextureManager().getTexture(new ResourceLocation("craft_kaisen:textures/screens/emptyslot.png")));
					}
				}
			}
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).ability4).equals("")) {
				if (world.isClientSide()) {
					if (world.isClientSide()) {
						Minecraft.getInstance().getTextureManager().bindForSetup(new ResourceLocation("craft_kaisen:textures/screens/emptyslot.png"));
						Minecraft.getInstance().getTextureManager().register(new ResourceLocation("craft_kaisen:textures/screens/emptyslot4.png"),
								Minecraft.getInstance().getTextureManager().getTexture(new ResourceLocation("craft_kaisen:textures/screens/emptyslot.png")));
					}
				}
			}
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).ability5).equals("")) {
				if (world.isClientSide()) {
					if (world.isClientSide()) {
						Minecraft.getInstance().getTextureManager().bindForSetup(new ResourceLocation("craft_kaisen:textures/screens/emptyslot.png"));
						Minecraft.getInstance().getTextureManager().register(new ResourceLocation("craft_kaisen:textures/screens/emptyslot5.png"),
								Minecraft.getInstance().getTextureManager().getTexture(new ResourceLocation("craft_kaisen:textures/screens/emptyslot.png")));
					}
				}
			}
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).ability6).equals("")) {
				if (world.isClientSide()) {
					if (world.isClientSide()) {
						Minecraft.getInstance().getTextureManager().bindForSetup(new ResourceLocation("craft_kaisen:textures/screens/emptyslot.png"));
						Minecraft.getInstance().getTextureManager().register(new ResourceLocation("craft_kaisen:textures/screens/emptyslot6.png"),
								Minecraft.getInstance().getTextureManager().getTexture(new ResourceLocation("craft_kaisen:textures/screens/emptyslot.png")));
					}
				}
			}
		}
	}
}
