package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class CameraRayWhileProjectileFlyingTickProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z,
Entity entity,
Entity immediatesourceentity
) {
if(
entity == null ||
immediatesourceentity == null
) return ;
double currentx = 0;double currentz = 0;double currenty = 0;
immediatesourceentity.setNoGravity(true);CraftKaisenMod.queueServerWork(7, () -> {
if(!immediatesourceentity.level.isClientSide()) immediatesourceentity.discard();
});
{
final Vec3 _center = new Vec3(x, y, z);
List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(5 / 2d), e -> true)
.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
for (Entity entityiterator : _entfound) {
if (!(entity == entityiterator)) {if (!(immediatesourceentity == entityiterator)) {if (entityiterator instanceof LivingEntity) {if(!immediatesourceentity.level.isClientSide()) immediatesourceentity.discard();if (==1) {entityiterator.setSecondsOnFire(10);entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_kaisen:cursed_energy_damage"))), immediatesourceentity, entity), (float)(3+(entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput/ 10));}if (==2) {if(entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN,100,3, false, false));if(entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS,100,3, false, false));}if (==3) {if(entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.COOLDOWN.get(),100,0, false, false));if(entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.STOP_ATTACKS.get(),100,0, false, false));}if (==4) {entityiterator.hurt(new DamageSource(world.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, new ResourceLocation("craft_kaisen:cursed_energy_damage"))), immediatesourceentity, entity), (float)(10+(entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).currentOutput/ 7));world.levelEvent(2001, BlockPos.containing(entityiterator.getX(),entityiterator.getY(),entityiterator.getZ()), Block.getId(Blocks.REDSTONE_BLOCK.defaultBlockState()));if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, BlockPos.containing(entityiterator.getX(),entityiterator.getY(),entityiterator.getZ()),
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:guts")),
SoundSource.AMBIENT, (float)0.2, 1);
} else {
_level.playLocalSound((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()),
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:guts")),
SoundSource.AMBIENT, (float)0.2, 1, false);
}
}
}if (==5) {{
Entity _ent = entity;
_ent.teleportTo((entityiterator.getX()),(entityiterator.getY()),(entityiterator.getZ()));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ()), _ent.getYRot(), _ent.getXRot());
}{
Entity _ent = entityiterator;
_ent.teleportTo((entity.getPersistentData().getDouble("currentx")),(entity.getPersistentData().getDouble("currenty")),(entity.getPersistentData().getDouble("currentz")));
if (_ent instanceof ServerPlayer _serverPlayer)
_serverPlayer.connection.teleport((entity.getPersistentData().getDouble("currentx")), (entity.getPersistentData().getDouble("currenty")), (entity.getPersistentData().getDouble("currentz")), _ent.getYRot(), _ent.getXRot());
}}}}}
}
}
}
}
