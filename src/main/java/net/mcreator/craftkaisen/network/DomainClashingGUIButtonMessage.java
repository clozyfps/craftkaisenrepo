
package net.mcreator.craftkaisen.network;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DomainClashingGUIButtonMessage {

	private final int buttonID, x, y, z;

	public DomainClashingGUIButtonMessage(FriendlyByteBuf buffer) {
		this.buttonID = buffer.readInt();
		this.x = buffer.readInt();
		this.y = buffer.readInt();
		this.z = buffer.readInt();
	}

	public DomainClashingGUIButtonMessage(int buttonID, int x, int y, int z) {
		this.buttonID = buttonID;
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public static void buffer(DomainClashingGUIButtonMessage message, FriendlyByteBuf buffer) {
		buffer.writeInt(message.buttonID);
		buffer.writeInt(message.x);
		buffer.writeInt(message.y);
		buffer.writeInt(message.z);
	}

	public static void handler(DomainClashingGUIButtonMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
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
		HashMap guistate = DomainClashingGUIMenu.guistate;

		// security measure to prevent arbitrary chunk generation
		if (!world.hasChunkAt(new BlockPos(x, y, z)))
			return;

		if (buttonID == 0) {

			DomainClashingClickProcedure.execute();
		}
		if (buttonID == 1) {

			DomainClashingClickProcedure.execute();
		}
		if (buttonID == 2) {

			DomainClashingClickProcedure.execute();
		}
		if (buttonID == 3) {

			DomainClashingClickProcedure.execute();
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		CraftKaisenMod.addNetworkMessage(DomainClashingGUIButtonMessage.class, DomainClashingGUIButtonMessage::buffer, DomainClashingGUIButtonMessage::new, DomainClashingGUIButtonMessage::handler);
	}

}
