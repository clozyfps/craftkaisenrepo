package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class RestrictedIconsProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.isClientSide()) {
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).ability1).equals("Blitz")) {
				if (world.isClientSide()) {
					Minecraft.getInstance().getTextureManager().bindForSetup(new ResourceLocation("craft_kaisen:textures/screens/blitz2.png"));
					Minecraft.getInstance().getTextureManager().register(new ResourceLocation("craft_kaisen:textures/screens/emptyslot1.png"),
							Minecraft.getInstance().getTextureManager().getTexture(new ResourceLocation("craft_kaisen:textures/screens/blitz2.png")));
				}
			} else if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).ability1).equals("Behind You")) {
				if (world.isClientSide()) {
					Minecraft.getInstance().getTextureManager().bindForSetup(new ResourceLocation("craft_kaisen:textures/screens/blitz.png"));
					Minecraft.getInstance().getTextureManager().register(new ResourceLocation("craft_kaisen:textures/screens/emptyslot1.png"),
							Minecraft.getInstance().getTextureManager().getTexture(new ResourceLocation("craft_kaisen:textures/screens/blitz.png")));
				}
			}
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).ability2).equals("Blitz")) {
				if (world.isClientSide()) {
					Minecraft.getInstance().getTextureManager().bindForSetup(new ResourceLocation("craft_kaisen:textures/screens/blitz2.png"));
					Minecraft.getInstance().getTextureManager().register(new ResourceLocation("craft_kaisen:textures/screens/emptyslot2.png"),
							Minecraft.getInstance().getTextureManager().getTexture(new ResourceLocation("craft_kaisen:textures/screens/blitz2.png")));
				}
			} else if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).ability2).equals("Behind You")) {
				if (world.isClientSide()) {
					Minecraft.getInstance().getTextureManager().bindForSetup(new ResourceLocation("craft_kaisen:textures/screens/blitz.png"));
					Minecraft.getInstance().getTextureManager().register(new ResourceLocation("craft_kaisen:textures/screens/emptyslot2.png"),
							Minecraft.getInstance().getTextureManager().getTexture(new ResourceLocation("craft_kaisen:textures/screens/blitz.png")));
				}
			}
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).ability3).equals("Blitz")) {
				if (world.isClientSide()) {
					Minecraft.getInstance().getTextureManager().bindForSetup(new ResourceLocation("craft_kaisen:textures/screens/blitz2.png"));
					Minecraft.getInstance().getTextureManager().register(new ResourceLocation("craft_kaisen:textures/screens/emptyslot3.png"),
							Minecraft.getInstance().getTextureManager().getTexture(new ResourceLocation("craft_kaisen:textures/screens/blitz2.png")));
				}
			} else if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).ability3).equals("Behind You")) {
				if (world.isClientSide()) {
					Minecraft.getInstance().getTextureManager().bindForSetup(new ResourceLocation("craft_kaisen:textures/screens/blitz.png"));
					Minecraft.getInstance().getTextureManager().register(new ResourceLocation("craft_kaisen:textures/screens/emptyslot3.png"),
							Minecraft.getInstance().getTextureManager().getTexture(new ResourceLocation("craft_kaisen:textures/screens/blitz.png")));
				}
			}
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).ability4).equals("Blitz")) {
				if (world.isClientSide()) {
					Minecraft.getInstance().getTextureManager().bindForSetup(new ResourceLocation("craft_kaisen:textures/screens/blitz2.png"));
					Minecraft.getInstance().getTextureManager().register(new ResourceLocation("craft_kaisen:textures/screens/emptyslot4.png"),
							Minecraft.getInstance().getTextureManager().getTexture(new ResourceLocation("craft_kaisen:textures/screens/blitz2.png")));
				}
			} else if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).ability4).equals("Behind You")) {
				if (world.isClientSide()) {
					Minecraft.getInstance().getTextureManager().bindForSetup(new ResourceLocation("craft_kaisen:textures/screens/blitz.png"));
					Minecraft.getInstance().getTextureManager().register(new ResourceLocation("craft_kaisen:textures/screens/emptyslot4.png"),
							Minecraft.getInstance().getTextureManager().getTexture(new ResourceLocation("craft_kaisen:textures/screens/blitz.png")));
				}
			}
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).ability5).equals("Blitz")) {
				if (world.isClientSide()) {
					Minecraft.getInstance().getTextureManager().bindForSetup(new ResourceLocation("craft_kaisen:textures/screens/blitz2.png"));
					Minecraft.getInstance().getTextureManager().register(new ResourceLocation("craft_kaisen:textures/screens/emptyslot5.png"),
							Minecraft.getInstance().getTextureManager().getTexture(new ResourceLocation("craft_kaisen:textures/screens/blitz2.png")));
				}
			} else if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).ability5).equals("Behind You")) {
				if (world.isClientSide()) {
					Minecraft.getInstance().getTextureManager().bindForSetup(new ResourceLocation("craft_kaisen:textures/screens/blitz.png"));
					Minecraft.getInstance().getTextureManager().register(new ResourceLocation("craft_kaisen:textures/screens/emptyslot5.png"),
							Minecraft.getInstance().getTextureManager().getTexture(new ResourceLocation("craft_kaisen:textures/screens/blitz.png")));
				}
			}
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).ability6).equals("Blitz")) {
				if (world.isClientSide()) {
					Minecraft.getInstance().getTextureManager().bindForSetup(new ResourceLocation("craft_kaisen:textures/screens/blitz2.png"));
					Minecraft.getInstance().getTextureManager().register(new ResourceLocation("craft_kaisen:textures/screens/emptyslot6.png"),
							Minecraft.getInstance().getTextureManager().getTexture(new ResourceLocation("craft_kaisen:textures/screens/blitz2.png")));
				}
			} else if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).ability6).equals("Behind You")) {
				if (world.isClientSide()) {
					Minecraft.getInstance().getTextureManager().bindForSetup(new ResourceLocation("craft_kaisen:textures/screens/blitz.png"));
					Minecraft.getInstance().getTextureManager().register(new ResourceLocation("craft_kaisen:textures/screens/emptyslot6.png"),
							Minecraft.getInstance().getTextureManager().getTexture(new ResourceLocation("craft_kaisen:textures/screens/blitz.png")));
				}
			}
		}
	}
}
