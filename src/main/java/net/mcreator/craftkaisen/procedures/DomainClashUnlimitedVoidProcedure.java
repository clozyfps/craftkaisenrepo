package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class DomainClashUnlimitedVoidProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z,
Entity entity
) {
if(
entity == null
) return ;
{
final Vec3 _center = new Vec3(x, y, z);
List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true)
.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
for (Entity entityiterator : _entfound) {
if (!(entityiterator == entity)) {if (==true) {entity.getPersistentData().putDouble("DomainClashPoints", 0);entityiterator.getPersistentData().putDouble("DomainClashPoints", 0);if(entity instanceof ServerPlayer _ent) {
BlockPos _bpos = BlockPos.containing(x,y,z);
NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
@Override public Component getDisplayName() {
return Component.literal("DomainClashingGUI");
}
@Override public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
return new DomainClashingGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
}
}, _bpos);
}
if(entityiterator instanceof ServerPlayer _ent) {
BlockPos _bpos = BlockPos.containing(x,y,z);
NetworkHooks.openScreen((ServerPlayer) _ent, new MenuProvider() {
@Override public Component getDisplayName() {
return Component.literal("DomainClashingGUI");
}
@Override public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
return new DomainClashingGUIMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(_bpos));
}
}, _bpos);
}
}}
}
}
if (==false) {}CraftKaisenMod.queueServerWork(30, () -> {
if (==false) {
UnlimitedVoidProcedureProcedure.execute(world,x,y,z,entity)
;
}if (==true) {{
final Vec3 _center = new Vec3(x, y, z);
List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true)
.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
for (Entity entityiterator : _entfound) {
if (!(entityiterator == entity)) {if(entity instanceof Player _player) _player.closeContainer();if(entityiterator instanceof Player _player) _player.closeContainer();if (entity.getPersistentData().getDouble("DomainClashPoints")>=entityiterator.getPersistentData().getDouble("DomainClashPoints")) {}else{}}
}
}
}if (==true) {
UnlimitedVoidProcedureProcedure.execute(world,x,y,z,entity)
;
}
});
}
}
