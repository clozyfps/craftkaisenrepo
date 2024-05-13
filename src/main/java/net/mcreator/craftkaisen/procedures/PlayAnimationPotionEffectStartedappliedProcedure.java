package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class PlayAnimationPotionEffectStartedappliedProcedure {
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
List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(100 / 2d), e -> true)
.stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).collect(Collectors.toList());
for (Entity entityiterator : _entfound) {
if (!(entityiterator == entity)) {if (entityiterator instanceof ServerPlayer||entityiterator instanceof Player) {if (!().equals("empty")) {if (world.isClientSide()) {
if (entityiterator instanceof AbstractClientPlayer player) {
var animation = (ModifierLayer<IAnimation>)PlayerAnimationAccess.getPlayerAssociatedData(player).get(
new ResourceLocation("craft_kaisen", "player_animation"));
if (animation != null ) {
animation.setAnimation(new KeyframeAnimationPlayer(PlayerAnimationRegistry.getAnimation(
new ResourceLocation("craft_kaisen", ))));
}
}
}}}}
}
}
}
}
