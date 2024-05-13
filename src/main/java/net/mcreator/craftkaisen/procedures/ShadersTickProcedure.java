package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class ShadersTickProcedure {
public static void execute(
LevelAccessor world,
Entity entity
) {
if(
entity == null
) return ;
String ShaderLocation = "";boolean YourFirstCondition = false;boolean YourSecondCondition = false;boolean YourCondition = false;
if (world.isClientSide()&&entity instanceof Player) {if (entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(CraftKaisenModMobEffects.IFRAME_EFFECT.get())) {if (==) {}}else{if (!=) {}}}
}
}
