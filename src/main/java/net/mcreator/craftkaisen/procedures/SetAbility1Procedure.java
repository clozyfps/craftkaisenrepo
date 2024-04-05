package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

public class SetAbility1Procedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!entity.isShiftKeyDown()) {
			if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).abilitylist).contains(entity.getPersistentData().getString("moveDisplay"))) {
				{
					String _setval = entity.getPersistentData().getString("moveDisplay");
					entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.ability1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		} else if (entity.isShiftKeyDown()) {
			{
				String _setval = "";
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ability1 = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		if (world.isClientSide()) {
			if ((entity.getPersistentData().getString("moveDisplay")).equals("Hollow Purple")) {
				if (world.isClientSide()) {
					Minecraft.getInstance().getTextureManager().bindForSetup(new ResourceLocation("craft_kaisen:textures/screens/hollowpurple.png"));
					Minecraft.getInstance().getTextureManager().register(new ResourceLocation("craft_kaisen:textures/screens/emptyslot1.png"),
							Minecraft.getInstance().getTextureManager().getTexture(new ResourceLocation("craft_kaisen:textures/screens/hollowpurple.png")));
				}
			} else if ((entity.getPersistentData().getString("moveDisplay")).equals("Lapse Blue")) {
				if (world.isClientSide()) {
					Minecraft.getInstance().getTextureManager().bindForSetup(new ResourceLocation("craft_kaisen:textures/screens/lapseblue.png"));
					Minecraft.getInstance().getTextureManager().register(new ResourceLocation("craft_kaisen:textures/screens/emptyslot1.png"),
							Minecraft.getInstance().getTextureManager().getTexture(new ResourceLocation("craft_kaisen:textures/screens/lapseblue.png")));
				}
			} else {
				if (world.isClientSide()) {
					Minecraft.getInstance().getTextureManager().release(new ResourceLocation("craft_kaisen:textures/screens/emptyslot1.png"));
				}
			}
		}
	}
}
