
package net.mcreator.craftkaisen.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class NailItem extends Item {
	public NailItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Use With Straw Doll Technique"));
	}
}