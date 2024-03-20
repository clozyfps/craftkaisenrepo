
package net.mcreator.craftkaisen.entity;

import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.material.Material;
import net.minecraft.nbt.Tag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.sounds.SoundEvent;

import javax.annotation.Nullable;

public class FlyHeadEntity extends Monster {

	public FlyHeadEntity(PlayMessages.SpawnEntity packet, Level world) {
		this(CraftKaisenModEntities.FLY_HEAD.get(), world);
	}

	public FlyHeadEntity(EntityType<FlyHeadEntity> type, Level world) {
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

		this.goalSelector.addGoal(1, new RandomStrollGoal(this, 1.7, 20) {

			@Override
			protected Vec3 getPosition() {
				RandomSource random = FlyHeadEntity.this.getRandom();
				double dir_x = FlyHeadEntity.this.getX() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_y = FlyHeadEntity.this.getY() + ((random.nextFloat() * 2 - 1) * 16);
				double dir_z = FlyHeadEntity.this.getZ() + ((random.nextFloat() * 2 - 1) * 16);
				return new Vec3(dir_x, dir_y, dir_z);
			}

		});
		this.goalSelector.addGoal(2, new Goal() {
			{
				this.setFlags(EnumSet.of(Goal.Flag.MOVE));
			}

			public boolean canUse() {
				if (FlyHeadEntity.this.getTarget() != null && !FlyHeadEntity.this.getMoveControl().hasWanted()) {
					return true;
				} else {
					return false;
				}
			}

			@Override
			public boolean canContinueToUse() {
				return FlyHeadEntity.this.getMoveControl().hasWanted() && FlyHeadEntity.this.getTarget() != null && FlyHeadEntity.this.getTarget().isAlive();
			}

			@Override
			public void start() {
				LivingEntity livingentity = FlyHeadEntity.this.getTarget();
				Vec3 vec3d = livingentity.getEyePosition(1);
				FlyHeadEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 2.3);
			}

			@Override
			public void tick() {
				LivingEntity livingentity = FlyHeadEntity.this.getTarget();
				if (FlyHeadEntity.this.getBoundingBox().intersects(livingentity.getBoundingBox())) {
					FlyHeadEntity.this.doHurtTarget(livingentity);
				} else {
					double d0 = FlyHeadEntity.this.distanceToSqr(livingentity);
					if (d0 < 25) {
						Vec3 vec3d = livingentity.getEyePosition(1);
						FlyHeadEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 2.3);
					}
				}
			}
		});
		this.goalSelector.addGoal(3, new MeleeAttackGoal(this, 1.8, true) {

			@Override
			protected double getAttackReachSqr(LivingEntity entity) {
				return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
			}

		});
		this.goalSelector.addGoal(4, new RandomStrollGoal(this, 2));
		this.targetSelector.addGoal(5, new HurtByTargetGoal(this));
		this.goalSelector.addGoal(6, new RandomLookAroundGoal(this));
		this.goalSelector.addGoal(7, new FloatGoal(this));

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
	public void baseTick() {
		super.baseTick();
		FlyHeadOnEntityTickUpdateProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
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
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.6);
		builder = builder.add(Attributes.MAX_HEALTH, 5);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 1);
		builder = builder.add(Attributes.FOLLOW_RANGE, 1000);

		builder = builder.add(Attributes.FLYING_SPEED, 0.6);

		return builder;
	}

}
