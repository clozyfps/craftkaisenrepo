package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

public class BeginRollingProcedure {
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
double rNum = 0;
if () {if (>=0&&!(==100)&&!(==20)) {if (!().isEmpty()&&!().isEmpty()&&!().isEmpty()) {if (new Object() {double convert(String s) { try { return Double.parseDouble(s.trim()); } catch (Exception e) { } return 0; }}.convert()==new Object() {double convert(String s) { try { return Double.parseDouble(s.trim()); } catch (Exception e) { } return 0; }}.convert()&&new Object() {double convert(String s) { try { return Double.parseDouble(s.trim()); } catch (Exception e) { } return 0; }}.convert()==new Object() {double convert(String s) { try { return Double.parseDouble(s.trim()); } catch (Exception e) { } return 0; }}.convert()) {if (new Object() {double convert(String s) { try { return Double.parseDouble(s.trim()); } catch (Exception e) { } return 0; }}.convert()==1) {if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("1 1 1"), false);}else if (new Object() {double convert(String s) { try { return Double.parseDouble(s.trim()); } catch (Exception e) { } return 0; }}.convert()==2) {if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("2 2 2"), false);}else if (new Object() {double convert(String s) { try { return Double.parseDouble(s.trim()); } catch (Exception e) { } return 0; }}.convert()==3) {if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("3 3 3"), false);}else if (new Object() {double convert(String s) { try { return Double.parseDouble(s.trim()); } catch (Exception e) { } return 0; }}.convert()==4) {if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("4 4 4"), false);}else if (new Object() {double convert(String s) { try { return Double.parseDouble(s.trim()); } catch (Exception e) { } return 0; }}.convert()==5) {if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("5 5 5"), false);}else if (new Object() {double convert(String s) { try { return Double.parseDouble(s.trim()); } catch (Exception e) { } return 0; }}.convert()==6) {if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("6 6 6"), false);}else if (new Object() {double convert(String s) { try { return Double.parseDouble(s.trim()); } catch (Exception e) { } return 0; }}.convert()==7) {if (entity instanceof Player _player && !_player.level.isClientSide())
_player.displayClientMessage(Component.literal("7 7 7"), false);entity.getPersistentData().putBoolean("jackpotBegin", true);}}else{}CraftKaisenMod.queueServerWork(20, () -> {
if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, BlockPos.containing(x,y,z),
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:domain.crack")),
SoundSource.NEUTRAL, 1, 1);
} else {
_level.playLocalSound(x, y, z,
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:domain.crack")),
SoundSource.NEUTRAL, 1, 1, false);
}
}
entity.getPersistentData().putDouble("displayProgress", 0);
});
}}else if (==0) {}else if (==100) {rNum = Mth.nextInt(RandomSource.create(), 1, 7);if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, BlockPos.containing(x,y,z),
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:domain.spin")),
SoundSource.NEUTRAL, 1, 1);
} else {
_level.playLocalSound(x, y, z,
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("craft_kaisen:domain.spin")),
SoundSource.NEUTRAL, 1, 1, false);
}
}
if (().isEmpty()) {entity.getPersistentData().putDouble("displayProgress", 1);}else if (!().isEmpty()&&().isEmpty()) {if (==0) {}else{}entity.getPersistentData().putDouble("displayProgress", 2);}else if (!().isEmpty()&&!().isEmpty()&&().isEmpty()) {if (!(==2)) {}else{}entity.getPersistentData().putDouble("displayProgress", 3);}
DisplayRollsProcedure.execute(entity)
;
}}
}
}
