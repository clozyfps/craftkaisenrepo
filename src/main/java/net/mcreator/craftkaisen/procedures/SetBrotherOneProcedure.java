package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class SetBrotherOneProcedure {
public static void execute(
LevelAccessor world,
Entity entity
) {
if(
entity == null
) return ;
for (Entity entityiterator : new ArrayList<>(world.players())) {
if (==true) {if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal(("Your brother is "+entity.getDisplayName().getString())), false);}
}if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal(("Your brother is "+)), false);
}
}
