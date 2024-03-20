package net.mcreator.craftkaisen.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.network.chat.Component;

public class TitleBookItemInHandTickProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if ((entity.getPersistentData().getString("titlebookname")).isEmpty()) {
			entity.getPersistentData().putDouble("titlebook", (Mth.nextInt(RandomSource.create(), 1, 27)));
			if (entity.getPersistentData().getDouble("titlebook") == 1) {
				entity.getPersistentData().putString("titlebookname", "The Honored One");
			}
			if (entity.getPersistentData().getDouble("titlebook") == 2) {
				entity.getPersistentData().putString("titlebookname", "The Strongest");
			}
			if (entity.getPersistentData().getDouble("titlebook") == 3) {
				entity.getPersistentData().putString("titlebookname", "The One Who Left It All Behind");
			}
			if (entity.getPersistentData().getDouble("titlebook") == 4) {
				entity.getPersistentData().putString("titlebookname", "Relentless Gambler");
			}
			if (entity.getPersistentData().getDouble("titlebook") == 5) {
				entity.getPersistentData().putString("titlebookname", "Him");
			}
			if (entity.getPersistentData().getDouble("titlebook") == 6) {
				entity.getPersistentData().putString("titlebookname", "Murderer");
			}
			if (entity.getPersistentData().getDouble("titlebook") == 7) {
				entity.getPersistentData().putString("titlebookname", "Strongest Sorcerer Of Today");
			}
			if (entity.getPersistentData().getDouble("titlebook") == 8) {
				entity.getPersistentData().putString("titlebookname", "Fallen Angel");
			}
			if (entity.getPersistentData().getDouble("titlebook") == 9) {
				entity.getPersistentData().putString("titlebookname", "The Strongest Sorcerer Available");
			}
			if (entity.getPersistentData().getDouble("titlebook") == 10) {
				entity.getPersistentData().putString("titlebookname", "Fraud");
			}
			if (entity.getPersistentData().getDouble("titlebook") == 11) {
				entity.getPersistentData().putString("titlebookname", "Comedian");
			}
			if (entity.getPersistentData().getDouble("titlebook") == 12) {
				entity.getPersistentData().putString("titlebookname", "Farmer");
			}
			if (entity.getPersistentData().getDouble("titlebook") == 13) {
				entity.getPersistentData().putString("titlebookname", "Cursed Lovely");
			}
			if (entity.getPersistentData().getDouble("titlebook") == 14) {
				entity.getPersistentData().putString("titlebookname", "Strongest Sorcerer In History");
			}
			if (entity.getPersistentData().getDouble("titlebook") == 15) {
				entity.getPersistentData().putString("titlebookname", "Vengeful");
			}
			if (entity.getPersistentData().getDouble("titlebook") == 16) {
				entity.getPersistentData().putString("titlebookname", "The Disgraced One");
			}
			if (entity.getPersistentData().getDouble("titlebook") == 17) {
				entity.getPersistentData().putString("titlebookname", "Cutest Sorcerer");
			}
			if (entity.getPersistentData().getDouble("titlebook") == 18) {
				entity.getPersistentData().putString("titlebookname", "Fodder Sorcerer");
			}
			if (entity.getPersistentData().getDouble("titlebook") == 19) {
				entity.getPersistentData().putString("titlebookname", "Fraudkuna");
			}
			if (entity.getPersistentData().getDouble("titlebook") == 20) {
				entity.getPersistentData().putString("titlebookname", "Fraudjo");
			}
			if (entity.getPersistentData().getDouble("titlebook") == 21) {
				entity.getPersistentData().putString("titlebookname", "Clown");
			}
			if (entity.getPersistentData().getDouble("titlebook") == 22) {
				entity.getPersistentData().putString("titlebookname", "Maki Stan");
			}
			if (entity.getPersistentData().getDouble("titlebook") == 23) {
				entity.getPersistentData().putString("titlebookname", "Womanizer");
			}
			if (entity.getPersistentData().getDouble("titlebook") == 24) {
				entity.getPersistentData().putString("titlebookname", "Pure Love");
			}
			if (entity.getPersistentData().getDouble("titlebook") == 25) {
				entity.getPersistentData().putString("titlebookname", "Butter");
			}
			if (entity.getPersistentData().getDouble("titlebook") == 26) {
				entity.getPersistentData().putString("titlebookname", "Divergent");
			}
			if (entity.getPersistentData().getDouble("titlebook") == 27) {
				entity.getPersistentData().putString("titlebookname", "Left Right Goodnight");
			}
			itemstack.setHoverName(Component.literal(("Title: " + entity.getPersistentData().getString("titlebookname"))));
		}
	}
}
