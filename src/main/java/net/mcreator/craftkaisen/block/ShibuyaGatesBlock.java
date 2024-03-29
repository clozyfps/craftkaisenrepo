
package net.mcreator.craftkaisen.block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;

public class ShibuyaGatesBlock extends Block {
	public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

	public ShibuyaGatesBlock() {
		super(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL).strength(1f, 10f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
		this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return switch (state.getValue(FACING)) {
			default -> Shapes.or(box(0, 0, 7, 16, 20, 10), box(16, 0, 7, 32, 20, 8), box(0, 0.14805, 5.22836, 16, 21.14805, 7.22836), box(0, 21.90295, 7.37852, 16, 23.90295, 10.37852));
			case NORTH -> Shapes.or(box(0, 0, 6, 16, 20, 9), box(-16, 0, 8, 0, 20, 9), box(0, 0.14805, 8.77164, 16, 21.14805, 10.77164), box(0, 21.90295, 5.62148, 16, 23.90295, 8.62148));
			case EAST -> Shapes.or(box(7, 0, 0, 10, 20, 16), box(7, 0, -16, 8, 20, 0), box(5.22836, 0.14805, 0, 7.22836, 21.14805, 16), box(7.37852, 21.90295, 0, 10.37852, 23.90295, 16));
			case WEST -> Shapes.or(box(6, 0, 0, 9, 20, 16), box(8, 0, 16, 9, 20, 32), box(8.77164, 0.14805, 0, 10.77164, 21.14805, 16), box(5.62148, 21.90295, 0, 8.62148, 23.90295, 16));
		};
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getStateForPlacement(BlockPlaceContext context) {
		if (context.getClickedFace().getAxis() == Direction.Axis.Y)
			return this.defaultBlockState().setValue(FACING, Direction.NORTH);
		return this.defaultBlockState().setValue(FACING, context.getClickedFace());
	}

	public BlockState rotate(BlockState state, Rotation rot) {
		return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
	}

	public BlockState mirror(BlockState state, Mirror mirrorIn) {
		return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}
}