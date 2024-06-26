
package net.mcreator.craftkaisen.network;

import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.world.inventory.CSMGUIMenu;
import net.mcreator.craftkaisen.procedures.Slot9CSMProcedure;
import net.mcreator.craftkaisen.procedures.Slot8CSMProcedure;
import net.mcreator.craftkaisen.procedures.Slot7CSMProcedure;
import net.mcreator.craftkaisen.procedures.Slot6CSMProcedure;
import net.mcreator.craftkaisen.procedures.Slot5CSMProcedure;
import net.mcreator.craftkaisen.procedures.Slot4CSMProcedure;
import net.mcreator.craftkaisen.procedures.Slot3CSMProcedure;
import net.mcreator.craftkaisen.procedures.Slot2CSMProcedure;
import net.mcreator.craftkaisen.procedures.Slot1CSMProcedure;
import net.mcreator.craftkaisen.procedures.Slot10CSMProcedure;
import net.mcreator.craftkaisen.CraftKaisenMod;

import java.util.function.Supplier;
import java.util.HashMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CSMGUIButtonMessage {
	private final int buttonID, x, y, z;

	public CSMGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public CSMGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(CSMGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(CSMGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
		NetworkEvent.Context context = contextSupplier.get();
		context.enqueueWork(() -> {
			Player entity = context.getSender();
			int buttonID = message.buttonID;
			int x = message.x;
			int y = message.y;
			int z = message.z;
			handleButtonAction(entity, buttonID, x, y, z);
		});
		context.setPacketHandled(true);
	}

	public static void handleButtonAction(Player entity, int buttonID, int x, int y, int z) {
		Level world = entity.level;
		HashMap guistate = CSMGUIMenu.guistate;
		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;
		if (buttonID == 0) {

			Slot1CSMProcedure.execute(entity);
		}
		if (buttonID == 1) {

			Slot2CSMProcedure.execute(entity);
		}
		if (buttonID == 2) {

			Slot3CSMProcedure.execute(entity);
		}
		if (buttonID == 3) {

			Slot4CSMProcedure.execute(entity);
		}
		if (buttonID == 4) {

			Slot5CSMProcedure.execute(entity);
		}
		if (buttonID == 5) {

			Slot6CSMProcedure.execute(entity);
		}
		if (buttonID == 6) {

			Slot7CSMProcedure.execute(entity);
		}
		if (buttonID == 7) {

			Slot8CSMProcedure.execute(entity);
		}
		if (buttonID == 8) {

			Slot9CSMProcedure.execute(entity);
		}
		if (buttonID == 9) {

			Slot10CSMProcedure.execute(entity);
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CraftKaisenMod.addNetworkMessage(CSMGUIButtonMessage.class, CSMGUIButtonMessage::buffer, CSMGUIButtonMessage::new, CSMGUIButtonMessage::handler);
	}
}
