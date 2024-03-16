package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;
import net.mcreator.craftkaisen.entity.MergedBeastAgitoEntity;
import net.mcreator.craftkaisen.entity.EightHandledSwordDivergentSilaDivineGeneralMahoragaEntity;

import javax.annotation.Nullable;

import java.util.Comparator;

@Mod.EventBusSubscriber
public class TenShadowTargetProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level, event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		execute(null, world, x, y, z, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (sourceentity instanceof Player || sourceentity instanceof ServerPlayer) {
			if (((sourceentity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).technique).equals("Ten Shadows")) {
				if (!world.getEntitiesOfClass(EightHandledSwordDivergentSilaDivineGeneralMahoragaEntity.class, AABB.ofSize(new Vec3(x, y, z), 50, 50, 50), e -> true).isEmpty()) {
					if (((Entity) world.getEntitiesOfClass(EightHandledSwordDivergentSilaDivineGeneralMahoragaEntity.class, AABB.ofSize(new Vec3(x, y, z), 50, 50, 50), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof TamableAnimal _tamIsTamedBy && sourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) {
						if (!world.getEntitiesOfClass(EightHandledSwordDivergentSilaDivineGeneralMahoragaEntity.class, AABB.ofSize(new Vec3(x, y, z), 50, 50, 50), e -> true).isEmpty()) {
							if (((Entity) world.getEntitiesOfClass(EightHandledSwordDivergentSilaDivineGeneralMahoragaEntity.class, AABB.ofSize(new Vec3(x, y, z), 50, 50, 50), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof Mob _entity && entity instanceof LivingEntity _ent)
								_entity.setTarget(_ent);
						}
					}
				}
				if (!world.getEntitiesOfClass(MergedBeastAgitoEntity.class, AABB.ofSize(new Vec3(x, y, z), 50, 50, 50), e -> true).isEmpty()) {
					if (((Entity) world.getEntitiesOfClass(MergedBeastAgitoEntity.class, AABB.ofSize(new Vec3(x, y, z), 50, 50, 50), e -> true).stream().sorted(new Object() {
						Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
							return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
						}
					}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof TamableAnimal _tamIsTamedBy && sourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false) {
						if (!world.getEntitiesOfClass(MergedBeastAgitoEntity.class, AABB.ofSize(new Vec3(x, y, z), 50, 50, 50), e -> true).isEmpty()) {
							if (((Entity) world.getEntitiesOfClass(MergedBeastAgitoEntity.class, AABB.ofSize(new Vec3(x, y, z), 50, 50, 50), e -> true).stream().sorted(new Object() {
								Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
									return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
								}
							}.compareDistOf(x, y, z)).findFirst().orElse(null)) instanceof Mob _entity && entity instanceof LivingEntity _ent)
								_entity.setTarget(_ent);
						}
					}
				}
			}
		}
	}
}
