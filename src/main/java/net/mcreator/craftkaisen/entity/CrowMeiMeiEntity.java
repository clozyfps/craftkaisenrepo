
package net.mcreator.craftkaisen.entity;

import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.material.Material;
import net.minecraft.nbt.Tag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.sounds.SoundEvent;

import javax.annotation.Nullable;

public class CrowMeiMeiEntity extends Monster {

	public CrowMeiMeiEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(CraftKaisenModEntities.CROW_MEI_MEI.get(), world);
	}

	public CrowMeiMeiEntity(EntityType<CrowMeiMeiEntity> type, Level world) {
		super(type, world);
		maxUpStep = 0.6f;
		xpReward = 0;
		setNoAi(false);

		this.moveControl = new FlyingMoveControl(this, 10, true);

	}

	@Override
	public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}

	@Override
	protected PathNavigation createNavigation(Level world) {
		return new FlyingPathNavigation(this, world);
	}

	@Override
	protected void registerGoals() {
		super.registerGoals();

		this.goalSelector.addGoal(1, new Goal() {
			{
				this.setFlags(EnumSet.of(Goal.Flag.MOVE));
			}

			public boolean canUse() {
				if (CrowMeiMeiEntity.this.getTarget() != null && !CrowMeiMeiEntity.this.getMoveControl().hasWanted()) {
					return true;
				} else {
					return false;
				}
			}

			@Override
			public boolean canContinueToUse() {
				return CrowMeiMeiEntity.this.getMoveControl().hasWanted() && CrowMeiMeiEntity.this.getTarget() != null && CrowMeiMeiEntity.this.getTarget().isAlive();
			}

			@Override
			public void start() {
				LivingEntity livingentity = CrowMeiMeiEntity.this.getTarget();
				Vec3 vec3d = livingentity.getEyePosition(1);
				CrowMeiMeiEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1.7);
			}

			@Override
			public void tick() {
				LivingEntity livingentity = CrowMeiMeiEntity.this.getTarget();
				if (CrowMeiMeiEntity.this.getBoundingBox().intersects(livingentity.getBoundingBox())) {
					CrowMeiMeiEntity.this.doHurtTarget(livingentity);
				} else {
					double d0 = CrowMeiMeiEntity.this.distanceToSqr(livingentity);
					if (d0 < 20) {
						Vec3 vec3d = livingentity.getEyePosition(1);
						CrowMeiMeiEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1.7);
					}
				}
			}
		});
		this.goalSelector.addGoal(2, new RandomStrollGoal(this, 2.5, 20) {

			@Override
			protected Vec3 getPosition() {
				RandomSource random = CrowMeiMeiEntity.this.getRandom();
				double dir_x = CrowMeiMeiEntity.this.getX() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_y = CrowMeiMeiEntity.this.getY() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_z = CrowMeiMeiEntity.this.getZ() + ((random.nextFloat() * 2 - 1) * 16);
				return new Vec3(dir_x, dir_y, dir_z);
			}

		});
		this.goalSelector.addGoal(3, new MeleeAttackGoal(this, 1.2, false) {

			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}

		});
		this.targetSelector.addGoal(4, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(5, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(6, new FloatGoal(this));

	}

	@Override
	public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override
	public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
	}

	@Override
	public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
	}

	@Override
	public boolean causeFallDamage(float l, float d, DamageSource source) {

		return false;
	}

	@Override
	public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
		SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
		CrowMeiMeiOnInitialEntitySpawnProcedure.execute(world, this.getX(), this.getY(), this.getZ(), this);
		return retval;
	}

	@Override
	public void baseTick() {
		super.baseTick();
		CrowOnEntityTickUpdateProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
	}

	@Override
	protected void checkFallDamage(double y, boolean onGroundIn, BlockState state, BlockPos pos) {
	}

	@Override
	public void setNoGravity(boolean ignored) {
		super.setNoGravity(true);
	}

	public void aiStep() {
		super.aiStep();

		this.setNoGravity(true);
	}

	public static void init() {

	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 10);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 5);
		builder = builder.add(Attributes.FOLLOW_RANGE, 50);

		builder = builder.add(Attributes.FLYING_SPEED, 0.3);

		return builder;
	}

}
