package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class DomainDebugStickRightclickedProcedure {
public static void execute(
Entity entity
) {
if(
entity == null
) return ;
if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal(("domainx "+new java.text.DecimalFormat("##").format(entity.getPersistentData().getDouble("domainx")))), false);if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal(("domainy "+new java.text.DecimalFormat("##").format(entity.getPersistentData().getDouble("domainy")))), false);if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal(("domainz "+new java.text.DecimalFormat("##").format(entity.getPersistentData().getDouble("domainz")))), false);if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal(("domain "+entity.getPersistentData().getBoolean("domain"))), false);if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal(("InDomain "+)), false);if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal(("ownerdomain "+entity.getPersistentData().getString("ownerdomain"))), false);
}
}
