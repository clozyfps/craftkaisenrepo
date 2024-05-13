package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class HollowPurpleNukeExplosionOnInitialEntitySpawnProcedure {
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
CraftKaisenMod.queueServerWork(45, () -> {
if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, BlockPos.containing(x,y,z),
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")),
SoundSource.NEUTRAL, 2, 1);
} else {
_level.playLocalSound(x, y, z,
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")),
SoundSource.NEUTRAL, 2, 1, false);
}
}
if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, BlockPos.containing(x,y,z),
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.dragon_fireball.explode")),
SoundSource.NEUTRAL, 2, 1);
} else {
_level.playLocalSound(x, y, z,
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.dragon_fireball.explode")),
SoundSource.NEUTRAL, 2, 1, false);
}
}
if (world instanceof Level _level && !_level.isClientSide())
_level.explode(null, x, y, z, 60, Level.ExplosionInteraction.TNT);{
final Vec3 _center = new Vec3(x, y, z);
List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(30 / 2d), e -> true)
.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
for (Entity entityiterator : _entfound) {
if(entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.DELETED_MOD_ELEMENT.get(),4,1, false, false));if (!(==entity.getPersistentData().getDouble("hollowpurplenukeidfix"))) {entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(DamageTypes.GENERIC)), 85);}
}
}
CraftKaisenMod.queueServerWork(5, () -> {
{
final Vec3 _center = new Vec3(x, y, z);
List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(30 / 2d), e -> true)
.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
for (Entity entityiterator : _entfound) {
if (==entity.getPersistentData().getDouble("hollowpurplenukeidfix")) {{
double _setval = entityiterator.getPersistentData().getDouble("leftarmdamagen");
entityiterator.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.leftArmDamage = _setval;
capability.syncPlayerVariables(entityiterator);
});
}
{
double _setval = entityiterator.getPersistentData().getDouble("rightlegdamagen");
entityiterator.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.rightLegDamage = _setval;
capability.syncPlayerVariables(entityiterator);
});
}
{
double _setval = entityiterator.getPersistentData().getDouble("rightarmdamagen");
entityiterator.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.rightArmDamage = _setval;
capability.syncPlayerVariables(entityiterator);
});
}
{
double _setval = entityiterator.getPersistentData().getDouble("leftlegdamagen");
entityiterator.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.leftLegDamage = _setval;
capability.syncPlayerVariables(entityiterator);
});
}
{
boolean _setval = entityiterator.getPersistentData().getBoolean("rightleggonen");
entityiterator.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.RightLegGone = _setval;
capability.syncPlayerVariables(entityiterator);
});
}
{
boolean _setval = entityiterator.getPersistentData().getBoolean("rightarmgonen");
entityiterator.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.RightArmGone = _setval;
capability.syncPlayerVariables(entityiterator);
});
}
{
boolean _setval = entityiterator.getPersistentData().getBoolean("leftarmgonen");
entityiterator.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.LeftArmGone = _setval;
capability.syncPlayerVariables(entityiterator);
});
}
{
boolean _setval = entityiterator.getPersistentData().getBoolean("leftleggonen");
entityiterator.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.LeftLegGone = _setval;
capability.syncPlayerVariables(entityiterator);
});
}
entity.getPersistentData().putDouble("hollownukecooldown", 600);}
}
}
});
});
}
}
