package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.world.inventory.DomainClashMenu;
import net.mcreator.craftkaisen.network.CraftKaisenModVariables;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

import io.netty.buffer.Unpooled;

public class DomainClashPotionEffectExpiresProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entity == entityiterator)) {
					if (!(entityiterator.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).predomain) {
						VoidRemoveProcedure.execute(world, x, y, z);
						entityiterator.getPersistentData().putBoolean("domain", false);
						if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Limitless")) {
							UnlimitedVoidProcedureProcedure.execute(world, x, y, z, entity);
						}
						if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Sukuna Vessel")) {
							MalevolentShrineProcedureNewProcedure.execute(world, x, y, z, entity);
						}
						if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Ice Formation")) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:freezingwind")), SoundSource.NEUTRAL, 1, 1);
								}
							}
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:icedomain")), SoundSource.NEUTRAL, 1, 1);
								}
							}
							BindingIceProcedure.execute(world, x, y, z, entity);
						}
						if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Disaster Flames")) {
							if (world instanceof Level _level) {
								if (!_level.isClientSide()) {
									_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:coffindomain")), SoundSource.PLAYERS, 1, 1);
								} else {
									_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:coffindomain")), SoundSource.PLAYERS, 1, 1, false);
								}
							}
							CoffinOfTheIronMountainProcedureProcedure.execute(world, x, y, z, entity);
						}
						if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Ten Shadows")) {
							ChimeraShadowGardenProcedure.execute(world, x, y, z, entity);
						}
						{
							boolean _setval = false;
							entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.predomain = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
					} else if ((entityiterator.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).predomain) {
						if (entity instanceof ServerPlayer _ent) {
							BlockPos _bpos = BlockPos.containing(x, y, z);
							NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
								@Override
								public Component getDisplayName() {
									return Component.literal("DomainClash");
								}

								@Override
								public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
									return new DomainClashMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
								}
							}, _bpos);
						}
						if (entityiterator instanceof ServerPlayer _ent) {
							BlockPos _bpos = BlockPos.containing(x, y, z);
							NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
								@Override
								public Component getDisplayName() {
									return Component.literal("DomainClash");
								}

								@Override
								public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
									return new DomainClashMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
								}
							}, _bpos);
						}
						entity.getPersistentData().putBoolean("domainclash", true);
						entityiterator.getPersistentData().putBoolean("domainclash", true);
					}
				}
			}
		}
	}
}
