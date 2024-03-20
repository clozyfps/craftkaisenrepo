package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;
import net.mcreator.craftkaisen.init.CraftKaisenModGameRules;
import net.mcreator.craftkaisen.entity.RyomenSukunaEntity;

import java.util.Comparator;

public class SukunaEffectExpiresProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			String _setval = entity.getPersistentData().getString("ability1old");
			entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.ability1 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = entity.getPersistentData().getString("ability2old");
			entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.ability2 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = entity.getPersistentData().getString("ability3old");
			entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.ability3 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = entity.getPersistentData().getString("ability4old");
			entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.ability4 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		{
			String _setval = entity.getPersistentData().getString("ability5old");
			entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.ability5 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
		if (entity instanceof Player _player && !_player.level.isClientSide())
			_player.displayClientMessage(Component.literal("\u00A7l\u00A74You can handle the rest."), true);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:sukuna")), SoundSource.NEUTRAL, 1, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:sukuna")), SoundSource.NEUTRAL, 1, 1, false);
			}
		}
		if (world.getLevelData().getGameRules().getBoolean(CraftKaisenModGameRules.SUKUNA_LITERAL_TAKEOVER) == true) {
			if (!world.getEntitiesOfClass(RyomenSukunaEntity.class, AABB.ofSize(new Vec3(x, y, z), 7, 7, 7), e -> true).isEmpty()) {
				if ((((Entity) world.getEntitiesOfClass(RyomenSukunaEntity.class, AABB.ofSize(new Vec3(x, y, z), 4, 4, 4), e -> true).stream().sorted(new Object() {
					Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
						return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
					}
				}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().getString("sukunatakeover")).equals(entity.getDisplayName().getString())) {
					if (!world.getEntitiesOfClass(RyomenSukunaEntity.class, AABB.ofSize(new Vec3(x, y, z), 7, 7, 7), e -> true).isEmpty()) {
						if (!((Entity) world.getEntitiesOfClass(RyomenSukunaEntity.class, AABB.ofSize(new Vec3(x, y, z), 7, 7, 7), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)).level.isClientSide())
							((Entity) world.getEntitiesOfClass(RyomenSukunaEntity.class, AABB.ofSize(new Vec3(x, y, z), 7, 7, 7), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)).discard();
						((Entity) world.getEntitiesOfClass(RyomenSukunaEntity.class, AABB.ofSize(new Vec3(x, y, z), 7, 7, 7), e -> true).stream().sorted(new Object() {
							Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
								return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
							}
						}.compareDistOf(x, y, z)).findFirst().orElse(null)).getPersistentData().putString("sukunatakeover", "");
					}
				}
			}
		}
	}
}
