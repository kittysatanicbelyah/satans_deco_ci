package net.satan.deco_ci.block;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.IronBarsBlock;
import net.minecraft.world.level.block.PipeBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import net.satan.deco_ci.CIConfig;

import java.util.*;

public class TemplateCurtainBlock extends IronBarsBlock {
    public static final BooleanProperty UP = PipeBlock.UP;
    public static final BooleanProperty DOWN = PipeBlock.DOWN;
    public static final BooleanProperty OPEN = BooleanProperty.create("open");

  // 0 - single; 1 - three, left; 2 -three, middle; 3 - three, right. I hate enums, sorry.
    public static final IntegerProperty POSITION = IntegerProperty.create("position", 0, 3);

    protected static final Map<Direction, BooleanProperty> PROPERTY_BY_VERTICAL = PipeBlock.PROPERTY_BY_DIRECTION.entrySet().stream().filter((p_52346_) -> {
        return p_52346_.getKey().getAxis().isVertical();
    }).collect(Util.toMap());

    protected final VoxelShape[] curtainCollisionShapeByIndex;
    protected final boolean rodCollision;
    private final Object2IntMap<BlockState> stateToIndex = new Object2IntOpenHashMap<>();

    public TemplateCurtainBlock(Properties properties, boolean rodNoCollision){
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(NORTH, Boolean.valueOf(false))
                .setValue(EAST, Boolean.valueOf(false))
                .setValue(SOUTH, Boolean.valueOf(false))
                .setValue(WEST, Boolean.valueOf(false))
                .setValue(UP, Boolean.valueOf(false))
                .setValue(DOWN, Boolean.valueOf(false))
                .setValue(OPEN, Boolean.valueOf(false))
                .setValue(POSITION, 0)
                .setValue(WATERLOGGED, Boolean.valueOf(false))
        );
        this.rodCollision = !rodNoCollision;
        VoxelShape[] curtainCollisionShapeByIndex1;
        curtainCollisionShapeByIndex1 = new VoxelShape[]{Shapes.empty()};
        if (rodCollision) curtainCollisionShapeByIndex1 = this.collisionShapes();
        this.curtainCollisionShapeByIndex = curtainCollisionShapeByIndex1;

    }
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_54221_) {
        p_54221_.add(NORTH, EAST, WEST, SOUTH, UP, DOWN, OPEN, POSITION, WATERLOGGED);
    }

    private VoxelShape[] collisionShapes(){
        VoxelShape sideEast = Block.box(7, 14, 8, 9, 16, 16);
        VoxelShape sideAltSouth = Block.box(8, 14, 7, 16, 16, 9);
        VoxelShape sideNorth = Block.box(7, 14, 0, 9, 16, 8);
        VoxelShape sideAltWest = Block.box(0, 14, 7, 8, 16, 9);
        VoxelShape SN = Shapes.or(sideAltSouth, sideNorth);
        VoxelShape EW = Shapes.or(sideEast, sideAltWest);
        VoxelShape[] avoxelshape = {Shapes.empty(), sideEast, sideAltWest, EW, sideNorth,
                Shapes.or(sideEast, sideNorth),
                Shapes.or(sideAltWest, sideNorth),
                Shapes.or(EW, sideNorth),

                sideAltSouth, Shapes.or(sideEast, sideAltSouth),
                Shapes.or(sideAltWest, sideAltSouth),
                Shapes.or(EW, sideAltSouth),

                SN, Shapes.or(sideEast, SN),
                Shapes.or(sideAltWest, SN),
                Shapes.or(EW, SN)};

        return avoxelshape;
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        VoxelShape shape = hasCollision ? super.getCollisionShape(state, level, pos, context) : Shapes.empty();
        if (rodCollision) {
            VoxelShape curtainShape = this.curtainCollisionShapeByIndex[this.getCurtainIndex(state)];
            shape = Shapes.or(shape, curtainShape);
        }
        return shape;
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext p_54200_) {
        BlockGetter blockgetter = p_54200_.getLevel();
        BlockPos blockpos = p_54200_.getClickedPos();
        FluidState fluidstate = p_54200_.getLevel().getFluidState(p_54200_.getClickedPos());
        BlockPos blockpos1 = blockpos.north();
        BlockPos blockpos2 = blockpos.south();
        BlockPos blockpos3 = blockpos.west();
        BlockPos blockpos4 = blockpos.east();
        BlockPos blockpos5 = blockpos.above();
        BlockPos blockpos6 = blockpos.below();
        BlockState blockstate = blockgetter.getBlockState(blockpos1);
        BlockState blockstate1 = blockgetter.getBlockState(blockpos2);
        BlockState blockstate2 = blockgetter.getBlockState(blockpos3);
        BlockState blockstate3 = blockgetter.getBlockState(blockpos4);
        BlockState blockstate4 = blockgetter.getBlockState(blockpos5);
        BlockState blockstate5 = blockgetter.getBlockState(blockpos6);

        return this.defaultBlockState().setValue(NORTH, Boolean.valueOf(this.attachsToCurtainHorizontal(blockstate,
                        blockstate.isFaceSturdy(blockgetter, blockpos1, Direction.SOUTH), blockstate4, NORTH)))
                .setValue(SOUTH, Boolean.valueOf(this.attachsToCurtainHorizontal(blockstate1,
                        blockstate1.isFaceSturdy(blockgetter, blockpos2, Direction.NORTH), blockstate4, SOUTH)))
                .setValue(WEST, Boolean.valueOf(this.attachsToCurtainHorizontal(blockstate2,
                        blockstate2.isFaceSturdy(blockgetter, blockpos3, Direction.EAST), blockstate4, WEST)))
                .setValue(EAST, Boolean.valueOf(this.attachsToCurtainHorizontal(blockstate3,
                        blockstate3.isFaceSturdy(blockgetter, blockpos4, Direction.WEST), blockstate4, EAST)))
                .setValue(UP, Boolean.valueOf(this.attachsToCurtains(blockstate4)))
                .setValue(DOWN, Boolean.valueOf(this.attachsToCurtains(blockstate5)))
                .setValue(OPEN, Boolean.valueOf(this.isCurtainOpen(blockstate, blockstate1, blockstate2, blockstate3, blockstate4, blockstate5)))
               .setValue(POSITION, positionCase(blockstate, blockstate1, blockstate2, blockstate3, blockstate4, blockstate5))
                .setValue(WATERLOGGED, Boolean.valueOf(fluidstate.getType() == Fluids.WATER));
    }

    @Override
    public BlockState updateShape(BlockState state, Direction dir, BlockState state1, LevelAccessor level, BlockPos pos, BlockPos pos1) {
        if (state.getValue(WATERLOGGED)) {
            level.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(level));
        }
        BlockState newState = state;
            if (dir.getAxis().isVertical()) {
                newState = newState.setValue(PROPERTY_BY_VERTICAL.get(dir),
                        this.attachsToCurtains(state1));
            } else if (dir.getAxis().isHorizontal()) {
                newState = newState.setValue(PROPERTY_BY_DIRECTION.get(dir),
                        this.attachsToCurtainHorizontal(state1, state1.isFaceSturdy(level, pos1, dir.getOpposite()),
                                level.getBlockState(pos.above()), PROPERTY_BY_DIRECTION.get(dir)));
            }
            newState = newState.setValue(POSITION, positionCase(pos, level));

        return newState;
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
       if (entity.getMainHandItem().isEmpty() && !entity.isShiftKeyDown()){
           level.playSound(entity, pos, SoundEvents.WOOL_BREAK, SoundSource.BLOCKS, 0.75F, 0.75F);
           boolean newOpenState = !state.getValue(OPEN);
           openCurtain(level, pos, newOpenState);
               return InteractionResult.SUCCESS;
       }
       return InteractionResult.PASS;
    }
    private static boolean isProcessing = false;
    private boolean wasPowered = false;
    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
        super.neighborChanged(state, level, pos, neighborBlock, fromPos, moving);
        if (isProcessing) return;
        boolean isPowered = level.getBestNeighborSignal(pos) > 0;
        if (!level.isClientSide() && isPowered && !wasPowered ) {
            isProcessing = true;
            try {
                openCurtain(level, pos, !state.getValue(OPEN));
            }
            finally {
                isProcessing = false;
            }
        }
        wasPowered = isPowered;
    }

    // supply methods
    public void openCurtain (Level level, BlockPos pos, boolean newOpenState) {
        Set<BlockPos> visited = new HashSet<>();
        Queue<BlockPos> toProcess = new ArrayDeque<>();
        toProcess.add(pos);
        visited.add(pos);
        int limit = CIConfig.curtainLimit;
        while (!toProcess.isEmpty()) {
            if (limit <= 0) {
                break;
            }

            BlockPos currentPos = toProcess.poll();
            BlockState currentState = level.getBlockState(currentPos);
            // Update curtain
            if (currentState.getBlock() instanceof TemplateCurtainBlock) {
                if (currentState.getValue(OPEN) != newOpenState) {
                    level.setBlock(currentPos, currentState.setValue(OPEN, newOpenState), 2);
                }
            }
            // Check directions
            for (Direction dir : Direction.values()) {
                BlockPos neighborPos = currentPos.relative(dir);

                if (visited.contains(neighborPos)) continue;

                BlockState neighborState = level.getBlockState(neighborPos);
                // Check neighbor
                if (neighborState.getBlock() instanceof TemplateCurtainBlock) {
                    if (areCurtainsConnected(level, currentPos, neighborPos, dir)) {
                        limit--;
                        visited.add(neighborPos);
                        toProcess.add(neighborPos);
                    }
                }
            }
        }
    }

    public final boolean attachsToCurtains(BlockState state) {return state.getBlock() instanceof TemplateCurtainBlock;}

    private static int indexFor(Direction p_52344_) {
        return 1 << p_52344_.get2DDataValue();
    }

    protected int getCurtainIndex(BlockState p_52364_) {
        return this.stateToIndex.computeIntIfAbsent(p_52364_, (p_52366_) -> {
            int i = 0;
            if (!p_52366_.getValue(UP)) {
                if (p_52366_.getValue(NORTH)) {
                    i |= indexFor(Direction.NORTH);
                }

                if (p_52366_.getValue(EAST)) {
                    i |= indexFor(Direction.EAST);
                }

                if (p_52366_.getValue(SOUTH)) {
                    i |= indexFor(Direction.SOUTH);
                }

                if (p_52366_.getValue(WEST)) {
                    i |= indexFor(Direction.WEST);
                }
            }
            return i;
        });
    }

    public final boolean attachsToCurtainHorizontal(BlockState state, boolean p_54219_, BlockState up, BooleanProperty dir) {
       if (up.getBlock() instanceof TemplateCurtainBlock) {return  up.getValue(dir);}
        return (!isExceptionForConnection(state) && p_54219_ || state.getBlock() instanceof IronBarsBlock || state.is(BlockTags.WALLS));
    }

    public final boolean isCurtainOpen (BlockPos pos, LevelAccessor level) {
        return isCurtainOpen(level.getBlockState(pos.north()), level.getBlockState(pos.south()),
                level.getBlockState(pos.west()), level.getBlockState(pos.east()), level.getBlockState(pos.above()),
                level.getBlockState(pos.below()));
    }

    public final boolean isCurtainOpen (BlockState north, BlockState south, BlockState west, BlockState east, BlockState up, BlockState down) {
        BlockState[] sides = {north, south, west, east, up, down};
       boolean match=false;
        for (int x = 0; x < sides.length; x++) {
            if (sides[x].getBlock() instanceof TemplateCurtainBlock) {
                if (sides[x].getValue(OPEN)) match=true;
            }
        }
        return match;
    }

    public final int positionCase (BlockPos pos, LevelAccessor level) {
        return positionCase(level.getBlockState(pos.north()), level.getBlockState(pos.south()),
                level.getBlockState(pos.west()), level.getBlockState(pos.east()), level.getBlockState(pos.above()),
                level.getBlockState(pos.below()));
    }

    private int positionCase (BlockState north, BlockState south, BlockState west, BlockState east, BlockState up, BlockState down) {
        int Case = 0;
        BlockState[] sides = {north, south, west, east};
        Boolean[] matchHorizontal = new Boolean[sides.length];
        int matchCount = 0;

        for (int x = 0; x < matchHorizontal.length; x++) {
            if (sides[x].getBlock() instanceof TemplateCurtainBlock) {
                matchHorizontal[x] = true;
                matchCount = matchCount + 1;
            }
            else matchHorizontal[x] = false;
        }

        if (matchCount == 1) {
            for (int x = 0; x < matchHorizontal.length; x++) {
                if (matchHorizontal[x]) {
                    if (x == 1 || x == 2) {
                        Case = 3;
                    } else Case = 1;
                }
            }
        } else if (matchCount > 1) {
            Case = 2;
        }
        return Case;
    }

    private boolean areCurtainsConnected(Level level, BlockPos pos1, BlockPos pos2, Direction direction) {
        BlockState state1 = level.getBlockState(pos1);
        BlockState state2 = level.getBlockState(pos2);

        if (direction.getAxis().isVertical()) {
            return state1.getValue(PROPERTY_BY_VERTICAL.get(direction)) &&
                    state2.getValue(PROPERTY_BY_VERTICAL.get(direction.getOpposite()));
        } else {
            return state1.getValue(PROPERTY_BY_DIRECTION.get(direction)) &&
                    state2.getValue(PROPERTY_BY_DIRECTION.get(direction.getOpposite()));
        }
    }

}