package net.satan.deco_ci.block;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;

import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
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
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import net.satan.deco_ci.CIConfig;
import net.satan.deco_ci.register.CISounds;
import net.satan.deco_ci.register.CITags;

import java.util.*;

public class TemplateCurtainBlock extends IronBarsBlock {
    public static final BooleanProperty UP = PipeBlock.UP;
    public static final BooleanProperty DOWN = PipeBlock.DOWN;
    public static final BooleanProperty OPEN = BooleanProperty.create("open");
    public static final BooleanProperty POWERED = BlockStateProperties.POWERED;
    protected static final Map<Direction, BooleanProperty> PROPERTY_BY_VERTICAL = PipeBlock.PROPERTY_BY_DIRECTION.entrySet().stream().filter((p_52346_) -> {
        return p_52346_.getKey().getAxis().isVertical();
    }).collect(Util.toMap());

    private final Object2IntMap<BlockState> stateToIndex = new Object2IntOpenHashMap<>();
    protected final VoxelShape[] rodCollisionShapeByIndex;
    protected final VoxelShape[] curtainCollisionShapeByIndex;
    protected final boolean hasRodCollision;
    public static boolean isProcessing = false;

    protected SoundEvent openSound;
    protected SoundEvent closeSound;

    public TemplateCurtainBlock(Properties properties, boolean hasNoRodCollision, int soundOption){
        super(properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(NORTH,false)
                .setValue(EAST,false).setValue(SOUTH, false)
                .setValue(WEST, false).setValue(UP, false)
                .setValue(DOWN, false)
                .setValue(OPEN, false).setValue(WATERLOGGED,false)
                .setValue(POWERED, false)
        );
        this.hasRodCollision = !hasNoRodCollision;

        this.curtainCollisionShapeByIndex = hasCollision ? this.curtainCollisionShapes() : new VoxelShape[]{Shapes.empty()};
        this.rodCollisionShapeByIndex = hasRodCollision ? this.rodCollisionShapes() : new VoxelShape[]{Shapes.empty()};

        closeSound = CISounds.CURTAIN_CLOSES.get();
        openSound = CISounds.CURTAIN_OPENS.get();
        if (soundOption == 1) {
            closeSound = CISounds.BLINDS_CLOSES.get();
            openSound = CISounds.BLINDS_OPENS.get();
        }
    }
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_54221_) {
        p_54221_.add(NORTH, EAST, WEST, SOUTH, UP, DOWN, OPEN, WATERLOGGED, POWERED);
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

        return this.defaultBlockState().setValue(NORTH, this.attachsToCurtainHorizontal(blockstate,
                        blockstate.isFaceSturdy(blockgetter, blockpos1, Direction.SOUTH), blockstate4, NORTH))
                .setValue(SOUTH, this.attachsToCurtainHorizontal(blockstate1,
                        blockstate1.isFaceSturdy(blockgetter, blockpos2, Direction.NORTH), blockstate4, SOUTH))
                .setValue(WEST, this.attachsToCurtainHorizontal(blockstate2,
                        blockstate2.isFaceSturdy(blockgetter, blockpos3, Direction.EAST), blockstate4, WEST))
                .setValue(EAST,this.attachsToCurtainHorizontal(blockstate3,
                        blockstate3.isFaceSturdy(blockgetter, blockpos4, Direction.WEST), blockstate4, EAST))
                .setValue(UP, this.attachsToCurtains(blockstate4))
                .setValue(DOWN, this.attachsToCurtains(blockstate5))
                .setValue(OPEN, this.isCurtainOpen(blockstate, blockstate1, blockstate2, blockstate3, blockstate4, blockstate5))
                .setValue(WATERLOGGED, fluidstate.getType() == Fluids.WATER);
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

        return newState;
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
       if (entity.getMainHandItem().isEmpty() && !entity.isShiftKeyDown()){
           if (state.getValue(OPEN)) level.playSound(entity, pos, closeSound, SoundSource.BLOCKS, 0.75F, 0.75F);
           else level.playSound(entity, pos, openSound, SoundSource.BLOCKS, 0.75F, 0.75F);

           boolean newOpenState = !state.getValue(OPEN);
           openCurtain(level, pos, newOpenState);
               return InteractionResult.SUCCESS;
       }
       return InteractionResult.PASS;
    }

    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
        super.neighborChanged(state, level, pos, neighborBlock, fromPos, moving);
        if (!level.isClientSide) {
            if (isProcessing) return;

            boolean wasPowered = state.getValue(POWERED);
            boolean isPowered = level.hasNeighborSignal(pos);
            if (isPowered && !wasPowered) {
                if (state.getValue(OPEN)) level.playSound((Entity) null, pos, closeSound, SoundSource.BLOCKS, 0.75F, 0.75F);
                else level.playSound((Entity) null, pos, openSound, SoundSource.BLOCKS, 0.75F, 0.75F);
                isProcessing = true;
                try {
                    openCurtain(level, pos, !state.getValue(OPEN));
                } finally {
                    isProcessing = false;
                }
            }
            else if (!isPowered && wasPowered) {
                level.setBlock(pos, state.setValue(POWERED, false), 2);
            }
        }
    }

    // collision

    private VoxelShape[] rodCollisionShapes(){
        VoxelShape sideEast = Block.box(7, 14, 8, 9, 16, 16);
        VoxelShape sideAltSouth = Block.box(8, 14, 7, 16, 16, 9);
        VoxelShape sideNorth = Block.box(7, 14, 0, 9, 16, 8);
        VoxelShape sideAltWest = Block.box(0, 14, 7, 8, 16, 9);
        VoxelShape SN = Shapes.or(sideAltSouth, sideNorth);
        VoxelShape EW = Shapes.or(sideEast, sideAltWest);

        return new VoxelShape[]{Shapes.empty(), sideEast, sideAltWest, EW, sideNorth,
                Shapes.or(sideEast, sideNorth),
                Shapes.or(sideAltWest, sideNorth),
                Shapes.or(EW, sideNorth),

                sideAltSouth, Shapes.or(sideEast, sideAltSouth),
                Shapes.or(sideAltWest, sideAltSouth),
                Shapes.or(EW, sideAltSouth),

                SN, Shapes.or(sideEast, SN),
                Shapes.or(sideAltWest, SN),
                Shapes.or(EW, SN)};
    }

    protected VoxelShape[] curtainCollisionShapes() {
        VoxelShape post = Block.box(7, 0.0D, 7, 9, 16, 9);

        VoxelShape closedNorth = Block.box(7.5, 0, 0, 8.5, 16, 8);
        VoxelShape closedSouth = Block.box(7.5, 0, 8, 8.5, 16, 16);
        VoxelShape closedWest = Block.box(0, 0, 7.5, 8, 16, 8.5);
        VoxelShape closedEast = Block.box(8, 0, 7.5, 16, 16, 8.5);
        VoxelShape voxelshape5 = Shapes.or(closedNorth, closedEast);
        VoxelShape voxelshape6 = Shapes.or(closedSouth, closedWest);

        return new VoxelShape[]{post, closedEast, closedWest, voxelshape6,
                closedNorth, Shapes.or(closedEast, closedNorth),
                Shapes.or(closedWest, closedNorth),
                Shapes.or(voxelshape6, closedNorth),

                closedSouth, Shapes.or(closedEast, closedSouth),
                Shapes.or(closedWest, closedSouth),
                Shapes.or(voxelshape6, closedSouth),

                voxelshape5, Shapes.or(closedEast, voxelshape5),
                Shapes.or(closedWest, voxelshape5),
                Shapes.or(voxelshape6, voxelshape5),
                Shapes.empty()
        };
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        VoxelShape shape = hasCollision ? this.curtainCollisionShapeByIndex[this.getCurtainIndex(state)] : Shapes.empty();
        VoxelShape curtainShape = hasRodCollision ? this.rodCollisionShapeByIndex[this.getRodIndex(state)] : Shapes.empty();
        shape = Shapes.or(shape, curtainShape);
        return shape;
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
            if (isCorrectInstance(currentState)) {
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
                if (isCorrectInstance(neighborState)) {
                    if (areCurtainsConnected(level, currentPos, neighborPos, dir)) {
                        limit--;
                        visited.add(neighborPos);
                        toProcess.add(neighborPos);
                    }
                }
            }
        }
    }

    public boolean isCorrectInstance (BlockState block) {
        return block.getBlock() instanceof TemplateCurtainBlock && doCurtainsMatch(block);
    }

    public boolean doCurtainsMatch (BlockState block) {
        int thisType =  this.asBlock().defaultBlockState().is(CITags.CIBlocks.BEADED_CURTAINS) ? 3 :
                        this.asBlock().defaultBlockState().is(CITags.CIBlocks.BLINDS_CURTAINS) ? 2 :
                        this.asBlock() instanceof ThreePositionsCurtainBlock ? 1 :
                        0;
        int blockType = block.is(CITags.CIBlocks.BEADED_CURTAINS) ? 3 :
                        block.is(CITags.CIBlocks.BLINDS_CURTAINS) ? 2 :
                        block.getBlock() instanceof ThreePositionsCurtainBlock ? 1 :
                        0;
        return thisType == blockType;
    }

    public final boolean attachsToCurtains(BlockState state) {return isCorrectInstance(state);}

    private static int indexFor(Direction p_52344_) {
        return 1 << p_52344_.get2DDataValue();
    }

    protected int getRodIndex(BlockState p_52364_) {
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

    protected int getCurtainIndex(BlockState p_52364_) {
        return this.stateToIndex.computeIntIfAbsent(p_52364_, (p_52366_) -> {
            if (p_52366_.getValue(OPEN)) {
                return 17;
            }
            int i = 0;
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
            return i;
        });
    }

    public final boolean attachsToCurtainHorizontal(BlockState state, boolean p_54219_, BlockState up, BooleanProperty dir) {
       if (isCorrectInstance(up)) {return  up.getValue(dir);}
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
            if (isCorrectInstance(sides[x])) {
                if (sides[x].getValue(OPEN)) match=true;
            }
        }
        return match;
    }

    public boolean areCurtainsConnected(Level level, BlockPos pos1, BlockPos pos2, Direction direction) {
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