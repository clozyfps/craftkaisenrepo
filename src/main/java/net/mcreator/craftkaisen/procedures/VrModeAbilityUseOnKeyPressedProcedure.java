package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class VrModeAbilityUseOnKeyPressedProcedure {
public static void execute(
Entity entity
) {
if(
entity == null
) return ;
if (!(entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(CraftKaisenModMobEffects.DELETED_MOD_ELEMENT.get()))) {if (==1) {if (entity.getPersistentData().getDouble("cooldown1")==0) {{
String _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).ability1;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.currentMove = _setval;
capability.syncPlayerVariables(entity);
});
}
entity.getPersistentData().putDouble("coolset", 1);}}else if (==2) {if (entity.getPersistentData().getDouble("cooldown2")==0) {{
String _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).ability2;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.currentMove = _setval;
capability.syncPlayerVariables(entity);
});
}
entity.getPersistentData().putDouble("coolset", 2);}}else if (==3) {if (entity.getPersistentData().getDouble("cooldown3")==0) {{
String _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).ability3;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.currentMove = _setval;
capability.syncPlayerVariables(entity);
});
}
entity.getPersistentData().putDouble("coolset", 3);}}else if (==4) {if (entity.getPersistentData().getDouble("cooldown4")==0) {{
String _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).ability4;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.currentMove = _setval;
capability.syncPlayerVariables(entity);
});
}
entity.getPersistentData().putDouble("coolset", 4);}}else if (==5) {if (entity.getPersistentData().getDouble("cooldown5")==0) {{
String _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).ability5;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.currentMove = _setval;
capability.syncPlayerVariables(entity);
});
}
entity.getPersistentData().putDouble("coolset", 5);}}else if (==6) {if (entity.getPersistentData().getDouble("cooldown6")==0) {{
String _setval = (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null)
.orElse(new CraftKaisenModVariables.PlayerVariables())).ability6;
entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
capability.currentMove = _setval;
capability.syncPlayerVariables(entity);
});
}
entity.getPersistentData().putDouble("coolset", 6);}}}
}
}
