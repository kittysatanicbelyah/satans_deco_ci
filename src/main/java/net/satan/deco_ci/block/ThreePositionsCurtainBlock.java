package net.satan.deco_ci.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

import java.util.*;

public class ThreePositionsCurtainBlock extends TemplateCurtainBlock {
  // 0 - single; 1 - three, left; 2 -three, middle; 3 - three, right. I hate --vitrages-- enums, sorry.
    public static final IntegerProperty POSITION = IntegerProperty.create("position", 0, 3);

    public ThreePositionsCurtainBlock(Properties properties, boolean rodNoCollision, int soundOption){
        super(properties, rodNoCollision, soundOption);
        this.registerDefaultState(this.stateDefinition.any().setValue(NORTH, false)
                .setValue(EAST,false).setValue(SOUTH, false)
                .setValue(WEST, false).setValue(UP, false)
                .setValue(DOWN, false)
                .setValue(OPEN, false).setValue(POSITION, 0)
                .setValue(WATERLOGGED, false).setValue(POWERED, false)
        );
    }
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_54221_) {
        p_54221_.add(NORTH, EAST, WEST, SOUTH, UP, DOWN, OPEN, POSITION, WATERLOGGED, POWERED);
    }


    @Override
    public BlockState getStateForPlacement(BlockPlaceContext p_54200_) {
        BlockGetter blockgetter = p_54200_.getLevel();
        BlockPos blockpos = p_54200_.getClickedPos();
        BlockPos blockpos1 = blockpos.north();
        BlockPos blockpos2 = blockpos.south();
        BlockPos blockpos3 = blockpos.west();
        BlockPos blockpos4 = blockpos.east();
        BlockState blockstate = blockgetter.getBlockState(blockpos1);
        BlockState blockstate1 = blockgetter.getBlockState(blockpos2);
        BlockState blockstate2 = blockgetter.getBlockState(blockpos3);
        BlockState blockstate3 = blockgetter.getBlockState(blockpos4);

        return super.getStateForPlacement(p_54200_)
                .setValue(POSITION, positionCase(blockstate, blockstate1, blockstate2, blockstate3));
    }

    @Override
    public BlockState updateShape(BlockState state, Direction dir, BlockState state1, LevelAccessor level, BlockPos pos, BlockPos pos1) {
       BlockState newState = super.updateShape(state, dir,state1,level,pos,pos1);
       newState = newState.setValue(POSITION, positionCase(pos, level));
       return newState;
    }

    // supply methods
    public final int positionCase (BlockPos pos, LevelAccessor level) {
        return positionCase(level.getBlockState(pos.north()), level.getBlockState(pos.south()),
                level.getBlockState(pos.west()), level.getBlockState(pos.east()));
    }

    private int positionCase (BlockState north, BlockState south, BlockState west, BlockState east) {
        int Case = 0;
        BlockState[] sides = {north, south, west, east};
        Boolean[] matchHorizontal = new Boolean[sides.length];
        int matchCount = 0;

        for (int x = 0; x < matchHorizontal.length; x++) {
            if (isCorrectInstance(sides[x])) {
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
}