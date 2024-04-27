package net.mcreator.craftkaisen.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import net.mcreator.craftkaisen.network.CraftKaisenModVariables;
import net.mcreator.craftkaisen.init.CraftKaisenModMobEffects;
import net.mcreator.craftkaisen.init.CraftKaisenModBlocks;
import net.mcreator.craftkaisen.CraftKaisenMod;

public class DisasterTidesDoamainExpasionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		String block = "";
		String newblock = "";
		BlockState blockrevert = Blocks.AIR.defaultBlockState();
		BlockState voidblocknew = Blocks.AIR.defaultBlockState();
		if (!entity.getPersistentData().getBoolean("domain")) {
			entity.getPersistentData().putString("domaintype", "Horizon of the Captivating Skandha");
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 120, 1, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 100, 250, false, false));
			entity.getPersistentData().putDouble("domainx", (entity.getX()));
			entity.getPersistentData().putDouble("domainy", (entity.getY()));
			entity.getPersistentData().putDouble("domainz", (entity.getZ()));
			int horizontalRadiusHemiBot = (int) 20 - 1;
			int verticalRadiusHemiBot = (int) 20;
			int yIterationsHemiBot = verticalRadiusHemiBot;
			for (int i = -yIterationsHemiBot; i <= 0; i++) {
				if (i == -verticalRadiusHemiBot) {
					continue;
				}
				for (int xi = -horizontalRadiusHemiBot; xi <= horizontalRadiusHemiBot; xi++) {
					for (int zi = -horizontalRadiusHemiBot; zi <= horizontalRadiusHemiBot; zi++) {
						double distanceSq = (xi * xi) / (double) (horizontalRadiusHemiBot * horizontalRadiusHemiBot) + (i * i) / (double) (verticalRadiusHemiBot * verticalRadiusHemiBot)
								+ (zi * zi) / (double) (horizontalRadiusHemiBot * horizontalRadiusHemiBot);
						if (distanceSq <= 1.0) {
							if (y + i < entity.getY()) {
								block = "" + ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x + xi, y + i, z + zi))).getBlock()).toString();
								if (y + i >= entity.getY()) {
									world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CraftKaisenModBlocks.DOMAIN_AIR_BLOCK.get().defaultBlockState(), 3);
								}
								if (y + i < entity.getY()) {
									world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CraftKaisenModBlocks.DOMAIN_BLOCK.get().defaultBlockState(), 3);
								}
								if (Math.round(Math.sqrt(Math.pow(x + xi - x, 2) + Math.pow(y + i - y, 2) + Math.pow(z + zi - z, 2))) >= 16 && Math.round(Math.sqrt(Math.pow(x + xi - x, 2) + Math.pow(y + i - y, 2) + Math.pow(z + zi - z, 2))) < 18) {
									world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CraftKaisenModBlocks.DOMAIN_SAND.get().defaultBlockState(), 3);
								}
								if (Math.round(Math.sqrt(Math.pow(x + xi - x, 2) + Math.pow(y + i - y, 2) + Math.pow(z + zi - z, 2))) >= 18) {
									world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CraftKaisenModBlocks.DOMAIN_SAND.get().defaultBlockState(), 3);
								}
								if (!world.isClientSide()) {
									BlockPos _bp = BlockPos.containing(x + xi, y + i, z + zi);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getPersistentData().putString("old_block", block);
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
							}
						}
					}
				}
			}
			int horizontalRadiusHemiTop = (int) 20 - 1;
			int verticalRadiusHemiTop = (int) 20;
			int yIterationsHemiTop = verticalRadiusHemiTop;
			for (int i = 0; i < yIterationsHemiTop; i++) {
				if (i == verticalRadiusHemiTop) {
					continue;
				}
				for (int xi = -horizontalRadiusHemiTop; xi <= horizontalRadiusHemiTop; xi++) {
					for (int zi = -horizontalRadiusHemiTop; zi <= horizontalRadiusHemiTop; zi++) {
						double distanceSq = (xi * xi) / (double) (horizontalRadiusHemiTop * horizontalRadiusHemiTop) + (i * i) / (double) (verticalRadiusHemiTop * verticalRadiusHemiTop)
								+ (zi * zi) / (double) (horizontalRadiusHemiTop * horizontalRadiusHemiTop);
						if (distanceSq <= 1.0) {
							if (y + i >= entity.getY()) {
								block = "" + ForgeRegistries.BLOCKS.getKey((world.getBlockState(BlockPos.containing(x + xi, y + i, z + zi))).getBlock()).toString();
								if (y + i >= entity.getY()) {
									world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CraftKaisenModBlocks.DOMAIN_AIR_BLOCK.get().defaultBlockState(), 3);
								}
								if (y + i < entity.getY()) {
									world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CraftKaisenModBlocks.DOMAIN_SKY.get().defaultBlockState(), 3);
								}
								if (Math.round(Math.sqrt(Math.pow(x + xi - x, 2) + Math.pow(y + i - y, 2) + Math.pow(z + zi - z, 2))) >= 16 && Math.round(Math.sqrt(Math.pow(x + xi - x, 2) + Math.pow(y + i - y, 2) + Math.pow(z + zi - z, 2))) < 18) {
									world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CraftKaisenModBlocks.DOMAIN_SKY.get().defaultBlockState(), 3);
								}
								if (Math.round(Math.sqrt(Math.pow(x + xi - x, 2) + Math.pow(y + i - y, 2) + Math.pow(z + zi - z, 2))) >= 18) {
									world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), CraftKaisenModBlocks.DOMAIN_SKY.get().defaultBlockState(), 3);
								}
								if (!world.isClientSide()) {
									BlockPos _bp = BlockPos.containing(x + xi, y + i, z + zi);
									BlockEntity _blockEntity = world.getBlockEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_blockEntity != null)
										_blockEntity.getPersistentData().putString("old_block", block);
									if (world instanceof Level _level)
										_level.sendBlockUpdated(_bp, _bs, _bs, 3);
								}
							}
						}
					}
				}
			}
			entity.getPersistentData().putBoolean("domain", true);
			CraftKaisenMod.queueServerWork(1190, () -> {
				if (entity.getPersistentData().getBoolean("domain")) {
					entity.getPersistentData().putBoolean("domain", false);
				}
			});
		} else if (entity.getPersistentData().getBoolean("domain")) {
			entity.getPersistentData().putBoolean("domain", false);
			VoidRemoveProcedure.execute(world, (entity.getPersistentData().getDouble("domainx")), (entity.getPersistentData().getDouble("domainy")), (entity.getPersistentData().getDouble("domainz")));
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(CraftKaisenModMobEffects.UNSTABLE.get(),
						(int) (1600 - (entity.getCapability(CraftKaisenModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new CraftKaisenModVariables.PlayerVariables())).level * 3), 0, false, false));
			if (entity instanceof Player _player && !_player.level.isClientSide())
				_player.displayClientMessage(Component.literal("Unstable"), false);
		}
	}
}
