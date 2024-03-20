package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.craftkaisen.init.CraftKaisenModItems;

public class BloodEdgeTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!(entity.getPersistentData().getString("bloodtype")).isEmpty()) {
			if (entity.getPersistentData().getDouble("bloodtype") < 800) {
				entity.getPersistentData().putDouble("bloodtype", (entity.getPersistentData().getDouble("bloodtype") + 1));
			} else if (entity.getPersistentData().getDouble("bloodtype") >= 800) {
				entity.getPersistentData().putDouble("bloodtype", 0);
				entity.getPersistentData().putString("bloodtype", "");
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(CraftKaisenModItems.BLOOD_AXE.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 15, _player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(CraftKaisenModItems.BLOOD_SPEAR.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 15, _player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof Player _player) {
					ItemStack _stktoremove = new ItemStack(CraftKaisenModItems.BLOOD_BLADE.get());
					_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 15, _player.inventoryMenu.getCraftSlots());
				}
				if (entity instanceof Player _player && !_player.level.isClientSide())
					_player.displayClientMessage(Component.literal("Blood Weapon Expired."), true);
			}
		}
	}
}
