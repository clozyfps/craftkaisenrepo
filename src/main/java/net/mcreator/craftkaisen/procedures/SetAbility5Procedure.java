package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class SetAbility5Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).abilitylist).contains(entity.getPersistentData().getString("moveDisplay"))) {
			{
				String _setval = entity.getPersistentData().getString("moveDisplay");
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ability5 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).ability2)
					.equals((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).ability5)) {
				{
					String _setval = "";
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ability2 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (world.isClientSide()) {
					if (world.isClientSide()) {
						Minecraft.getInstance().getTextureManager().bindForSetup(new ResourceLocation("craft_kaisen:textures/screens/emptyslot.png"));
						Minecraft.getInstance().getTextureManager().register(new ResourceLocation("craft_kaisen:textures/screens/emptyslot2.png"),
								Minecraft.getInstance().getTextureManager().getTexture(new ResourceLocation("craft_kaisen:textures/screens/emptyslot.png")));
					}
				}
			}
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).ability3)
					.equals((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).ability5)) {
				{
					String _setval = "";
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ability3 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (world.isClientSide()) {
					if (world.isClientSide()) {
						Minecraft.getInstance().getTextureManager().bindForSetup(new ResourceLocation("craft_kaisen:textures/screens/emptyslot.png"));
						Minecraft.getInstance().getTextureManager().register(new ResourceLocation("craft_kaisen:textures/screens/emptyslot3.png"),
								Minecraft.getInstance().getTextureManager().getTexture(new ResourceLocation("craft_kaisen:textures/screens/emptyslot.png")));
					}
				}
			}
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).ability4)
					.equals((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).ability5)) {
				{
					String _setval = "";
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ability4 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (world.isClientSide()) {
					if (world.isClientSide()) {
						Minecraft.getInstance().getTextureManager().bindForSetup(new ResourceLocation("craft_kaisen:textures/screens/emptyslot.png"));
						Minecraft.getInstance().getTextureManager().register(new ResourceLocation("craft_kaisen:textures/screens/emptyslot4.png"),
								Minecraft.getInstance().getTextureManager().getTexture(new ResourceLocation("craft_kaisen:textures/screens/emptyslot.png")));
					}
				}
			}
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).ability1)
					.equals((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).ability5)) {
				{
					String _setval = "";
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ability1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				if (world.isClientSide()) {
					if (world.isClientSide()) {
						Minecraft.getInstance().getTextureManager().bindForSetup(new ResourceLocation("craft_kaisen:textures/screens/emptyslot.png"));
						Minecraft.getInstance().getTextureManager().register(new ResourceLocation("craft_kaisen:textures/screens/emptyslot1.png"),
								Minecraft.getInstance().getTextureManager().getTexture(new ResourceLocation("craft_kaisen:textures/screens/emptyslot.png")));
					}
				}
			}
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).ability6)
					.equals((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).ability5)) {
				{
					String _setval = "";
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ability6 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
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
