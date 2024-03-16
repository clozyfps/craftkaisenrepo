package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

public class SplitSoulKatanaLivingEntityIsHitWithToolProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity.getType().is(TagKey.create(Registries.ENTITY_TYPE, new ResourceLocation("craft_kaisen:cursed_spirits")))
				|| ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).race).equals("Curse")) {
			entity.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_kaisen:slashing_damage"))), sourceentity), 25);
		}
	}
}
