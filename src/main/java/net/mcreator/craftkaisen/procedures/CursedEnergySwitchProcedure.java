package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;

public class CursedEnergySwitchProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("maxMoves", 3);
		if (entity.getPersistentData().getDouble("moveNumber") == 1) {
			entity.getPersistentData().putString("moveDisplay", "Simple Domain");
			if (!(entity instanceof ServerPlayer _plr3 && _plr3.level instanceof ServerLevel
					&& _plr3.getAdvancements().getOrStartProgress(_plr3.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:simple_domain_learned"))).isDone())) {
				entity.getPersistentData().putDouble("moveCost", 40);
			} else if (entity instanceof ServerPlayer _plr5 && _plr5.level instanceof ServerLevel
					&& _plr5.getAdvancements().getOrStartProgress(_plr5.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:simple_domain_learned"))).isDone()) {
				entity.getPersistentData().putDouble("moveCost", 0);
			}
		} else if (entity.getPersistentData().getDouble("moveNumber") == 2) {
			entity.getPersistentData().putString("moveDisplay", "Domain Amplification");
			if (entity instanceof ServerPlayer _plr9 && _plr9.level instanceof ServerLevel
					&& _plr9.getAdvancements().getOrStartProgress(_plr9.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:domain_amplification_learned"))).isDone()) {
				entity.getPersistentData().putDouble("moveCost", 0);
			} else if (!(entity instanceof ServerPlayer _plr11 && _plr11.level instanceof ServerLevel
					&& _plr11.getAdvancements().getOrStartProgress(_plr11.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:domain_amplification_learned"))).isDone())) {
				entity.getPersistentData().putDouble("moveCost", 65);
			}
		} else if (entity.getPersistentData().getDouble("moveNumber") == 3) {
			entity.getPersistentData().putString("moveDisplay", "Flow");
			if (entity instanceof ServerPlayer _plr15 && _plr15.level instanceof ServerLevel
					&& _plr15.getAdvancements().getOrStartProgress(_plr15.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:cursed_energy_flow"))).isDone()) {
				entity.getPersistentData().putDouble("moveCost", 0);
			} else if (!(entity instanceof ServerPlayer _plr17 && _plr17.level instanceof ServerLevel
					&& _plr17.getAdvancements().getOrStartProgress(_plr17.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:cursed_energy_flow"))).isDone())) {
				entity.getPersistentData().putDouble("moveCost", 50);
			}
		}
	}
}
