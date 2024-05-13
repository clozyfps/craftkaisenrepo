package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class PreDomainOnEffectActiveTickProcedure {
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
if (>=20) {{
final Vec3 _center = new Vec3(x, y, z);
List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(20 / 2d), e -> true)
.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
for (Entity entityiterator : _entfound) {
if (entityiterator instanceof LivingEntity _entity) _entity.removeEffect(CraftKaisenModMobEffects.STOP_DOMAIN.get());if (entityiterator instanceof PreDomainMobEntity) {if(!entityiterator.level.isClientSide()) entityiterator.discard();}if (!(entityiterator == entity)) {if(entityiterator instanceof LivingEntity _entity && !_entity.level.isClientSide())
_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.STOP_DOMAIN.get(),60,1, false, false));}if (entityiterator instanceof LivingEntity _entity) _entity.removeEffect(CraftKaisenModMobEffects.DELETED_MOD_ELEMENT.get());
}
}
}
}
}
