package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.network.NetworkHooks;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.MenuProvider;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.world.inventory.DomainClashingGUIMenu;
import net.mcreator.craftkaisen.network.CraftKaisenModVariables;
import net.mcreator.craftkaisen.CraftKaisenMod;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Comparator;

import io.netty.buffer.Unpooled;

public class DomainClashUnlimitedVoidProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
			for (Entity entityiterator : _entfound) {
				if (!(entityiterator == entity)) {
					if ((entityiterator.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).DomainClashAvalible == true) {
						{
							boolean _setval = true;
							entityiterator.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.DomainClashing = _setval;
								capability.syncPlayerVariables(entityiterator);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.DomainClashing = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = true;
							entityiterator.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.DomainClashAvalible = _setval;
								capability.syncPlayerVariables(entityiterator);
							});
						}
						{
							boolean _setval = true;
							entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.DomainClashAvalible = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = false;
							entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.DomainClashWon = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						{
							boolean _setval = false;
							entityiterator.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.DomainClashWon = _setval;
								capability.syncPlayerVariables(entityiterator);
							});
						}
						entity.getPersistentData().putDouble("DomainClashPoints", 0);
						entityiterator.getPersistentData().putDouble("DomainClashPoints", 0);
						if (entity instanceof ServerPlayer _ent) {
							BlockPos _bpos = BlockPos.containing(x, y, z);
							NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
								@Override
								public Component getDisplayName() {
									return Component.literal("DomainClashingGUI");
								}

								@Override
								public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
									return new DomainClashingGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
								}
							}, _bpos);
						}
						if (entityiterator instanceof ServerPlayer _ent) {
							BlockPos _bpos = BlockPos.containing(x, y, z);
							NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
								@Override
								public Component getDisplayName() {
									return Component.literal("DomainClashingGUI");
								}

								@Override
								public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
									return new DomainClashingGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
								}
							}, _bpos);
						}
					}
				}
			}
		}
		if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).DomainClashing == false) {
			{
				boolean _setval = true;
				entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.DomainClashAvalible = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
		CraftKaisenMod.queueServerWork(30, () -> {
			if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).DomainClashing == false) {
				UnlimitedVoidProcedureProcedure.execute(world, x, y, z, entity);
			}
			if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).DomainClashing == true) {
				{
					final Vec3 _center = new Vec3(x, y, z);
					List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center)))
							.collect(Collectors.toList());
					for (Entity entityiterator : _entfound) {
						if (!(entityiterator == entity)) {
							{
								boolean _setval = false;
								entityiterator.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.DomainClashing = _setval;
									capability.syncPlayerVariables(entityiterator);
								});
							}
							{
								boolean _setval = false;
								entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.DomainClashing = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
							if (entity instanceof Player _player)
								_player.closeContainer();
							if (entityiterator instanceof Player _player)
								_player.closeContainer();
							if (entity.getPersistentData().getDouble("DomainClashPoints") >= entityiterator.getPersistentData().getDouble("DomainClashPoints")) {
								{
									boolean _setval = true;
									entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.DomainClashWon = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
							} else {
								{
									boolean _setval = true;
									entityiterator.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.DomainClashWon = _setval;
										capability.syncPlayerVariables(entityiterator);
									});
								}
							}
						}
					}
				}
			}
			if ((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).DomainClashWon == true) {
				UnlimitedVoidProcedureProcedure.execute(world, x, y, z, entity);
			}
		});
	}
}
