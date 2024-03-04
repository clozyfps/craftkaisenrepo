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
			if (!(entity instanceof ServerPlayer _plr2 && _plr2.level instanceof ServerLevel
					&& _plr2.getAdvancements().getOrStartProgress(_plr2.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:simple_domain_learned"))).isDone())) {
				entity.getPersistentData().putString("moveDisplay", "Simple Domain");
				entity.getPersistentData().putDouble("moveCost", 20);
			} else if (entity instanceof ServerPlayer _plr5 && _plr5.level instanceof ServerLevel
					&& _plr5.getAdvancements().getOrStartProgress(_plr5.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:simple_domain_learned"))).isDone()) {
				entity.getPersistentData().putString("moveDisplay", "Unlearned Simple Domain");
				entity.getPersistentData().putDouble("moveCost", 999999);
			}
		} else if (entity.getPersistentData().getDouble("moveNumber") == 2) {
			if (entity instanceof ServerPlayer _plr9 && _plr9.level instanceof ServerLevel
					&& _plr9.getAdvancements().getOrStartProgress(_plr9.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:domain_amplification_learned"))).isDone()) {
				entity.getPersistentData().putString("moveDisplay", "Domain Amplification");
				entity.getPersistentData().putDouble("moveCost", 35);
			} else if (!(entity instanceof ServerPlayer _plr12 && _plr12.level instanceof ServerLevel
					&& _plr12.getAdvancements().getOrStartProgress(_plr12.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:domain_amplification_learned"))).isDone())) {
				entity.getPersistentData().putString("moveDisplay", "Unlearned Domain Amplification");
				entity.getPersistentData().putDouble("moveCost", 999999);
			}
		} else if (entity.getPersistentData().getDouble("moveNumber") == 3) {
			if (entity instanceof ServerPlayer _plr16 && _plr16.level instanceof ServerLevel
					&& _plr16.getAdvancements().getOrStartProgress(_plr16.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:cursed_energy_flow"))).isDone()) {
				entity.getPersistentData().putString("moveDisplay", "Flow");
				entity.getPersistentData().putDouble("moveCost", 0);
			} else if (!(entity instanceof ServerPlayer _plr19 && _plr19.level instanceof ServerLevel
					&& _plr19.getAdvancements().getOrStartProgress(_plr19.server.getAdvancements().getAdvancement(new ResourceLocation("craft_kaisen:cursed_energy_flow"))).isDone())) {
				entity.getPersistentData().putString("moveDisplay", "Unlearned Flow");
				entity.getPersistentData().putDouble("moveCost", 999999);
			}
		}
	}
}
