
package net.mcreator.craftkaisen.client.particle;

@OnlyIn(Dist.CLIENT)
public class Shrine3redParticle extends TextureSheetParticle {
	public static Shrine3redParticleProvider provider(SpriteSet spriteSet) {
		return new Shrine3redParticleProvider(spriteSet);
	}

	public static class Shrine3redParticleProvider implements ParticleProvider<SimpleParticleType> {
		private final SpriteSet spriteSet;

		public Shrine3redParticleProvider(SpriteSet spriteSet) {
			this.spriteSet = spriteSet;
		}

		public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
			return new Shrine3redParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
		}
	}

	private final SpriteSet spriteSet;

	protected Shrine3redParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
		super(world, x, y, z);
		this.spriteSet = spriteSet;
		this.setSize(0.05f, 0.2f);
		this.quadSize *= 65f;
		this.lifetime = 1;
		this.gravity = 0f;
		this.hasPhysics = false;
		this.xd = vx * 0;
		this.yd = vy * 0;
		this.zd = vz * 0;
		this.pickSprite(spriteSet);
	}

	@Override
	public ParticleRenderType getRenderType() {
		return ParticleRenderType.PARTICLE_SHEET_TRANSLUCENT;
	}

	@Override
	public void tick() {
		super.tick();
	}
}