package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class PreDomainEffectExpiresProcedure {
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
if (!(entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(CraftKaisenModMobEffects.STOP_DOMAIN.get()))) {if (==false) {if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Limitless")) {if (world.isClientSide()) {
if (entity instanceof AbstractClientPlayer player) {
var animation = (ModifierLayer<IAnimation>)PlayerAnimationAccess.getPlayerAssociatedData(player).get(
new ResourceLocation("craft_kaisen", "player_animation"));
if (animation != null ) {
animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(
new ResourceLocation("craft_kaisen", "unlimitedvoid"))));
}
}
}
VoidRemoveProcedure.execute(world,x,y,z)
;
{
final Vec3 _center = new Vec3(x, y, z);
List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(25 / 2d), e -> true)
.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
for (Entity entityiterator : _entfound) {
if (!(entity == entityiterator)) {entityiterator.getPersistentData().putBoolean("domain", false);}
}
}
UnlimitedVoidProcedureProcedure.execute(world,x,y,z,entity)
;
}if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Disaster Flames")) {
VoidRemoveProcedure.execute(world,x,y,z)
;
{
final Vec3 _center = new Vec3(x, y, z);
List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(25 / 2d), e -> true)
.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
for (Entity entityiterator : _entfound) {
if (!(entity == entityiterator)) {entityiterator.getPersistentData().putBoolean("domain", false);}
}
}
if (world.isClientSide()) {
if (entity instanceof AbstractClientPlayer player) {
var animation = (ModifierLayer<IAnimation>)PlayerAnimationAccess.getPlayerAssociatedData(player).get(
new ResourceLocation("craft_kaisen", "player_animation"));
if (animation != null && !animation.isActive()) {
animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(
new ResourceLocation("craft_kaisen", "mavshirine"))));
}
}
}
CoffinOfTheIronMountainProcedureProcedure.execute(world,x,y,z,entity)
;
if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, BlockPos.containing(x,y,z),
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:coffindomain")),
SoundSource.PLAYERS, 1, 1);
} else {
_level.playLocalSound(x, y, z,
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:coffindomain")),
SoundSource.PLAYERS, 1, 1, false);
}
}
}if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Sukuna Vessel")) {if (world.isClientSide()) {
if (entity instanceof AbstractClientPlayer player) {
var animation = (ModifierLayer<IAnimation>)PlayerAnimationAccess.getPlayerAssociatedData(player).get(
new ResourceLocation("craft_kaisen", "player_animation"));
if (animation != null ) {
animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(
new ResourceLocation("craft_kaisen", "mavshirine"))));
}
}
}
MalevolentShrineProcedureNewProcedure.execute(world,x,y,z,entity)
;
{
String _setval = "";
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.currentMove = _setval;
capability.syncPlayerVariables(entity);
});
}
}if (((entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Ice Formation")) {
VoidRemoveProcedure.execute(world,x,y,z)
;
{
final Vec3 _center = new Vec3(x, y, z);
List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(25 / 2d), e -> true)
.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
for (Entity entityiterator : _entfound) {
if (!(entity == entityiterator)) {entityiterator.getPersistentData().putBoolean("domain", false);}
}
}
if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:freezingwind")), SoundSource.NEUTRAL, 1, 1);
}
}
if (world.isClientSide()) {
if (entity instanceof AbstractClientPlayer player) {
var animation = (ModifierLayer<IAnimation>)PlayerAnimationAccess.getPlayerAssociatedData(player).get(
new ResourceLocation("craft_kaisen", "player_animation"));
if (animation != null && !animation.isActive()) {
animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(
new ResourceLocation("craft_kaisen", "mavshirine"))));
}
}
}if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:icedomain")), SoundSource.NEUTRAL, 1, 1);
}
}
BindingIceProcedure.execute(world,x,y,z,entity)
;
CraftKaisenMod.queueServerWork(1, () -> {
entity.getPersistentData().putBoolean("domain", true);
});
}if (entity instanceof LivingEntity _entity) _entity.removeEffect(CraftKaisenModMobEffects.PRE_DOMAIN.get());CraftKaisenMod.queueServerWork(7, () -> {
});
}}
}
}
