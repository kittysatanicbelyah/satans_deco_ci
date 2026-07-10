package net.satan.deco_ci.block;

import com.google.common.collect.ImmutableMap;
import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;

import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TemplatePelmetBlock extends Block implements SimpleWaterloggedBlock{

    public static final BooleanProperty NORTH = PipeBlock.NORTH;
    public static final BooleanProperty EAST = PipeBlock.EAST;
    public static final BooleanProperty SOUTH = PipeBlock.SOUTH;
    public static final BooleanProperty WEST = PipeBlock.WEST;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;
    public static final BooleanProperty BARS_NORTH = BooleanProperty.create("bars_north");
    public static final BooleanProperty BARS_EAST = BooleanProperty.create("bars_east");
    public static final BooleanProperty BARS_SOUTH = BooleanProperty.create("bars_south");
    public static final BooleanProperty BARS_WEST = BooleanProperty.create("bars_west");

    protected static final Map<Direction, BooleanProperty> PROPERTY_BY_DIRECTION = PipeBlock.PROPERTY_BY_DIRECTION.entrySet().stream().filter((p_52346_) -> {
        return p_52346_.getKey().getAxis().isHorizontal();
    }).collect(Util.toMap());
    public static final ImmutableMap<Direction, BooleanProperty> PROPERTY_BY_DIRECTION_BARS = ImmutableMap.<Direction, BooleanProperty>builder()
            .put(Direction.NORTH, BARS_NORTH)
            .put(Direction.SOUTH, BARS_SOUTH)
            .put(Direction.EAST, BARS_EAST)
            .put(Direction.WEST, BARS_WEST).build();

    private static final VoxelShape WEST_AABB = Block.box(0.0D, 10.0D, 0.0D, 4.0D, 16.0D, 16.0D);
    private static final VoxelShape EAST_AABB = Block.box(12.0D, 10.0D, 0.0D, 16.0D, 16.0D, 16.0D);
    private static final VoxelShape NORTH_AABB = Block.box(0.0D, 10.0D, 0.0D, 16.0D, 16.0D, 4.0D);
    private static final VoxelShape SOUTH_AABB = Block.box(0.0D, 10.0D, 12.0D, 16.0D, 16.0D, 16.0D);

    private static final VoxelShape B_WEST_AABB = Block.box(-7.0D, 10.0D, 0.0D, -3.0D, 16.0D, 16.0D);
    private static final VoxelShape B_EAST_AABB = Block.box(20.0D, 10.0D, 0.0D, 24.0D, 16.0D, 16.0D);
    private static final VoxelShape B_NORTH_AABB = Block.box(0.0D, 10.0D, -7.0D, 16.0D, 16.0D, -3.0D);
    private static final VoxelShape B_SOUTH_AABB = Block.box(0.0D, 10.0D, 20.0D, 16.0D, 16.0D, 24.0D);

    private final Map<BlockState, VoxelShape> shapesCache;

    public TemplatePelmetBlock(BlockBehaviour.Properties p_57847_) {
        super(p_57847_);
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(NORTH, false).setValue(EAST, false)
                .setValue(SOUTH, false).setValue(WEST, false)
                .setValue(WATERLOGGED, false)
                .setValue(BARS_NORTH, false).setValue(BARS_EAST, false)
                .setValue(BARS_SOUTH, false).setValue(BARS_WEST, false)
        );
        this.shapesCache = ImmutableMap.copyOf(this.stateDefinition.getPossibleStates().stream()
                .collect(Collectors.toMap(Function.identity(), TemplatePelmetBlock::calculatePelmetShape)));
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_57882_) {
        p_57882_.add(NORTH, EAST, SOUTH, WEST, WATERLOGGED, BARS_NORTH, BARS_EAST, BARS_SOUTH, BARS_WEST);
    }

    public FluidState getFluidState(BlockState p_52362_) {
        return p_52362_.getValue(WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(p_52362_);
    }

    public boolean propagatesSkylightDown(BlockState state, BlockGetter p_181240_, BlockPos p_181241_) {
        return !state.getValue(WATERLOGGED);
    }

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext p_54200_) {
        BlockGetter blockgetter = p_54200_.getLevel();
        BlockPos blockpos = p_54200_.getClickedPos();
        FluidState fluidstate = p_54200_.getLevel().getFluidState(p_54200_.getClickedPos());
        BlockState state = this.defaultBlockState();
        BlockPos blockpos1 = blockpos.north();
        BlockPos blockpos2 = blockpos.south();
        BlockPos blockpos3 = blockpos.west();
        BlockPos blockpos4 = blockpos.east();
        BlockState blockstate = blockgetter.getBlockState(blockpos1);
        BlockState blockstate1 = blockgetter.getBlockState(blockpos2);
        BlockState blockstate2 = blockgetter.getBlockState(blockpos3);
        BlockState blockstate3 = blockgetter.getBlockState(blockpos4);

        boolean north = this.isAttachedToCorrectInstance(blockstate,
                blockstate.isFaceSturdy(blockgetter, blockpos1, Direction.SOUTH) && isSurvivable(blockgetter, blockpos, Direction.NORTH));
        boolean south = this.isAttachedToCorrectInstance(blockstate1,
                blockstate1.isFaceSturdy(blockgetter, blockpos2, Direction.NORTH) && isSurvivable(blockgetter, blockpos, Direction.SOUTH));
        boolean west = this.isAttachedToCorrectInstance(blockstate2,
                blockstate2.isFaceSturdy(blockgetter, blockpos3, Direction.EAST) && isSurvivable(blockgetter, blockpos, Direction.WEST));
        boolean east = this.isAttachedToCorrectInstance(blockstate3,
                blockstate3.isFaceSturdy(blockgetter, blockpos4, Direction.WEST) && isSurvivable(blockgetter, blockpos, Direction.EAST));

        state = isBars(blockstate) ?  state.setValue(BARS_NORTH, north).setValue(NORTH, false)
                : state.setValue(NORTH, north).setValue(BARS_NORTH, false);

        state = isBars(blockstate1) ? state.setValue(BARS_SOUTH, south).setValue(SOUTH, false)
                : state.setValue(SOUTH, south).setValue(BARS_SOUTH, false);

        state = isBars(blockstate2) ? state.setValue(BARS_WEST, west).setValue(WEST, false)
                : state.setValue(WEST, west).setValue(BARS_WEST, false);

        state = isBars(blockstate3) ? state.setValue(BARS_EAST, east).setValue(EAST, false)
                : state.setValue(EAST, east).setValue(BARS_EAST, false);

        return state.setValue(WATERLOGGED, fluidstate.getType() == Fluids.WATER);
    }

    public BlockState updateShape(BlockState state, Direction dir, BlockState state1, LevelAccessor level, BlockPos pos, BlockPos pos1) {
        if (state.getValue(WATERLOGGED)) {
            level.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(level));
        }
        BlockState newState = state;
        if (dir.getAxis().isHorizontal()) {
            boolean bool = this.isAttachedToCorrectInstance(state1, state1.isFaceSturdy(level, pos1, dir.getOpposite())) && isSurvivable(level, pos, dir);
            newState = isBars(state1) ? newState.setValue(Objects.requireNonNull(PROPERTY_BY_DIRECTION_BARS.get(dir)), bool).setValue(PROPERTY_BY_DIRECTION.get(dir), false)
                    : newState.setValue(PROPERTY_BY_DIRECTION.get(dir), bool).setValue(Objects.requireNonNull(PROPERTY_BY_DIRECTION_BARS.get(dir)), false);
            }

            return newState;
    }

    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block block, BlockPos pos1, boolean bool) {
        if (canSurvive(state, level, pos)) {
            super.neighborChanged(state, level, pos, block, pos1, bool);
        } else {
            Item item = this.asItem();
            ItemStack itemDrop = new ItemStack(item, 1);
            ItemEntity dropEntity = new ItemEntity(
                    level, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, itemDrop);
            dropEntity.setDefaultPickUpDelay();
            level.addFreshEntity(dropEntity);
            level.destroyBlock(pos, bool);
        }
    }

    public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        int i = 0;
        for(Direction dir : Direction.Plane.HORIZONTAL) {
            BooleanProperty face = getPropertyForFace(dir);
            BooleanProperty barsFace = getBarsPropertyForFace(dir);
            BlockPos blockpos = pos.relative(dir);
            if (isNeighbourCool(level, blockpos, dir) && (state.getValue(face) || state.getValue(barsFace))) {
                ++i;
            }
        }
        System.out.println("canSurvive:"+i + "?:" + (i>0));
        return i > 0;
    }

    public BlockState rotate(BlockState p_57868_, Rotation p_57869_) {
        switch (p_57869_) {
            case CLOCKWISE_180:
                return p_57868_.setValue(NORTH, p_57868_.getValue(SOUTH)).setValue(EAST, p_57868_.getValue(WEST)).setValue(SOUTH, p_57868_.getValue(NORTH)).setValue(WEST, p_57868_.getValue(EAST));
            case COUNTERCLOCKWISE_90:
                return p_57868_.setValue(NORTH, p_57868_.getValue(EAST)).setValue(EAST, p_57868_.getValue(SOUTH)).setValue(SOUTH, p_57868_.getValue(WEST)).setValue(WEST, p_57868_.getValue(NORTH));
            case CLOCKWISE_90:
                return p_57868_.setValue(NORTH, p_57868_.getValue(WEST)).setValue(EAST, p_57868_.getValue(NORTH)).setValue(SOUTH, p_57868_.getValue(EAST)).setValue(WEST, p_57868_.getValue(SOUTH));
            default:
                return p_57868_;
        }
    }

    public BlockState mirror(BlockState p_57865_, Mirror p_57866_) {
        switch (p_57866_) {
            case LEFT_RIGHT:
                return p_57865_.setValue(NORTH, p_57865_.getValue(SOUTH)).setValue(SOUTH, p_57865_.getValue(NORTH));
            case FRONT_BACK:
                return p_57865_.setValue(EAST, p_57865_.getValue(WEST)).setValue(WEST, p_57865_.getValue(EAST));
            default:
                return super.mirror(p_57865_, p_57866_);
        }
    }

    // supply methods
    public boolean isSurvivable(BlockGetter level, BlockPos pos, Direction dir) {
        BlockPos blockpos = pos.relative(dir);
        System.out.println("isSurvivable:"+isNeighbourCool(level, blockpos, dir));
        return isNeighbourCool(level, blockpos, dir);
    }

    public static boolean isNeighbourCool(BlockGetter p_57854_, BlockPos p_57855_, Direction p_57856_) {
        BlockState state = p_57854_.getBlockState(p_57855_);
        return MultifaceBlock.canAttachTo(p_57854_, p_57856_, p_57855_, state)
                || ((state.getBlock() instanceof IronBarsBlock || state.getBlock() instanceof FenceBlock
                || state.is(BlockTags.WALLS)  || state.getBlock() instanceof StairBlock  || state.getBlock() instanceof SlabBlock)
                && !(state.is(Blocks.AIR)));
    }

    private boolean isBars(BlockState state) {
      System.out.println("isBars&NotAir? " + ((state.getBlock() instanceof IronBarsBlock || state.is(BlockTags.WALLS))
              && !(state.is(Blocks.AIR))));
        System.out.println("isBars? " + ((state.getBlock() instanceof IronBarsBlock || state.getBlock() instanceof FenceBlock || state.is(BlockTags.WALLS))));
        return (state.getBlock() instanceof IronBarsBlock || state.is(BlockTags.WALLS) || state.getBlock() instanceof FenceBlock)
                && !(state.is(Blocks.AIR));
    }

    private boolean isAttachedToCorrectInstance(BlockState state, boolean isFaceFull){
        return ((!isExceptionForConnection(state) && isFaceFull || state.getBlock() instanceof IronBarsBlock  || state.getBlock() instanceof FenceBlock
                || state.is(BlockTags.WALLS)  || state.getBlock() instanceof StairBlock  || state.getBlock() instanceof SlabBlock)
                && !(state.is(Blocks.AIR)));
    }

    public static BooleanProperty getPropertyForFace(Direction p_57884_) {
        return PROPERTY_BY_DIRECTION.get(p_57884_);
    }

    public static BooleanProperty getBarsPropertyForFace(Direction p_57884_) {
        return PROPERTY_BY_DIRECTION_BARS.get(p_57884_);
    }

    // shapes
    public VoxelShape getShape(BlockState p_57897_, BlockGetter p_57898_, BlockPos p_57899_, CollisionContext p_57900_) {
        return this.shapesCache.get(p_57897_);
    }

    public VoxelShape getCollisionShape(BlockState p_57897_, BlockGetter p_57898_, BlockPos p_57899_, CollisionContext p_57900_) {
        return hasCollision ? this.shapesCache.get(p_57897_) : Shapes.empty();
    }

    private static VoxelShape calculatePelmetShape(BlockState p_57906_) {
        VoxelShape voxelshape = Shapes.empty();
            if (p_57906_.getValue(BARS_NORTH)) {voxelshape = Shapes.or(voxelshape, B_NORTH_AABB);}
            if (p_57906_.getValue(BARS_SOUTH)) {voxelshape = Shapes.or(voxelshape, B_SOUTH_AABB);}
            if (p_57906_.getValue(BARS_EAST)) {voxelshape = Shapes.or(voxelshape, B_EAST_AABB);}
            if (p_57906_.getValue(BARS_WEST)) {voxelshape = Shapes.or(voxelshape, B_WEST_AABB);}
            if (p_57906_.getValue(NORTH)) {voxelshape = Shapes.or(voxelshape, NORTH_AABB);}
            if (p_57906_.getValue(SOUTH)) {voxelshape = Shapes.or(voxelshape, SOUTH_AABB);}
            if (p_57906_.getValue(EAST)) {voxelshape = Shapes.or(voxelshape, EAST_AABB);}
            if (p_57906_.getValue(WEST)) {voxelshape = Shapes.or(voxelshape, WEST_AABB);}
        return voxelshape.isEmpty() ? Shapes.block() : voxelshape;
    }
}
