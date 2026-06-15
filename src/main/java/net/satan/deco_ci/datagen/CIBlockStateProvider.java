package net.satan.deco_ci.datagen;

import net.minecraft.core.Direction;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.PipeBlock;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.client.model.generators.MultiPartBlockStateBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.satan.deco_ci.block.TemplateCurtainBlock;
import net.satan.deco_ci.register.CIBlocks;
import net.satan.deco_ci.satans_deco_ci;

import java.util.concurrent.CompletableFuture;

public class CIBlockStateProvider extends BlockStateProvider {
    public CIBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, satans_deco_ci.MODID, existingFileHelper);
        this.decoBlockModels = new CIBlockModelProvider(output, existingFileHelper) {
            @Override public CompletableFuture<?> run(CachedOutput cache) { return CompletableFuture.allOf(); }

            @Override protected void registerModels() {}
        };
    }
    private final CIBlockModelProvider decoBlockModels;
    
    //inputs
    @Override
    protected void registerStatesAndModels() {

    //curtains
    curtainsBlockState(CIBlocks.CURTAIN_BLACK);
    curtainsBlockState(CIBlocks.CURTAIN_BLUE);
    curtainsBlockState(CIBlocks.CURTAIN_BROWN);
    curtainsBlockState(CIBlocks.CURTAIN_CYAN);
    curtainsBlockState(CIBlocks.CURTAIN_YELLOW);
    curtainsBlockState(CIBlocks.CURTAIN_GRAY);
    curtainsBlockState(CIBlocks.CURTAIN_GREEN);
    curtainsBlockState(CIBlocks.CURTAIN_LIGHT_BLUE);
    curtainsBlockState(CIBlocks.CURTAIN_LIGHT_GRAY);
    curtainsBlockState(CIBlocks.CURTAIN_MAGENTA);
    curtainsBlockState(CIBlocks.CURTAIN_ORANGE);
    curtainsBlockState(CIBlocks.CURTAIN_PINK);
    curtainsBlockState(CIBlocks.CURTAIN_LIME);
    curtainsBlockState(CIBlocks.CURTAIN_PURPLE);
    curtainsBlockState(CIBlocks.CURTAIN_RED);
    curtainsBlockState(CIBlocks.CURTAIN_WHITE);
}

    private void curtainsBlockState(RegistryObject<Block> block) {
        curtainsBlockInternal(block.get(), block.getId().toString(),
                new ResourceLocation("minecraft", "block/iron_bars"),
                new ResourceLocation("minecraft", "block/iron_bars"),
                new ResourceLocation("minecraft", "block/iron_bars"));

    }
    private void curtainsBlockInternal(Block block, String baseName,
                                       ResourceLocation particle, ResourceLocation bars,
                                       ResourceLocation edge) {
        ModelFile post = decoBlockModels.barsPost(baseName, particle, edge);
        ModelFile postEnds = decoBlockModels.barsPostEnds(baseName, particle, edge);
        ModelFile cap = decoBlockModels.curtainCap(baseName, particle);
        ModelFile capAlt = decoBlockModels.curtainCapAlt(baseName, particle);
        ModelFile rodSide = decoBlockModels.curtainRodSide(baseName, bars);
        ModelFile rodSideAlt = decoBlockModels.curtainRodSideAlt(baseName, bars);
        ModelFile capDown = decoBlockModels.curtainDownCap(baseName, bars);
        ModelFile capDownAlt = decoBlockModels.curtainDownCapAlt(baseName, bars);

        ModelFile side_single = decoBlockModels.curtainSide(baseName +"_single_upper", particle);
        ModelFile sideAlt_single = decoBlockModels.curtainSideAlt(baseName +"_single_upper", particle);
        ModelFile side_right = decoBlockModels.curtainSide(baseName +"_three_right_upper", particle);
        ModelFile sideAlt_right = decoBlockModels.curtainSideAlt(baseName +"_three_right_upper", particle);
        ModelFile side_left = decoBlockModels.curtainSide(baseName +"_three_left_upper", particle);
        ModelFile sideAlt_left = decoBlockModels.curtainSideAlt(baseName +"_three_left_upper", particle);
        ModelFile side_middle = decoBlockModels.curtainSide(baseName +"_three_middle_upper", particle);
        ModelFile sideAlt_middle = decoBlockModels.curtainSideAlt(baseName +"_three_middle_upper", particle);
        ModelFile side_singleDown = decoBlockModels.curtainSide(baseName +"_single_lower", particle);
        ModelFile sideAlt_singleDown = decoBlockModels.curtainSideAlt(baseName +"_single_lower", particle);
        ModelFile side_rightDown = decoBlockModels.curtainSide(baseName +"_three_right_lower", particle);
        ModelFile sideAlt_rightDown = decoBlockModels.curtainSideAlt(baseName +"_three_right_lower", particle);
        ModelFile side_leftDown = decoBlockModels.curtainSide(baseName +"_three_left_lower", particle);
        ModelFile sideAlt_leftDown = decoBlockModels.curtainSideAlt(baseName +"_three_left_lower", particle);
        ModelFile side_middleDown = decoBlockModels.curtainSide(baseName +"_three_middle_lower", particle);
        ModelFile sideAlt_middleDown = decoBlockModels.curtainSideAlt(baseName +"_three_middle_lower", particle);

        ModelFile side_singleOpen = decoBlockModels.curtainSide(baseName +"_single_upper_open", particle);
        ModelFile sideAlt_singleOpen = decoBlockModels.curtainSideAlt(baseName +"_single_upper_open", particle);
        ModelFile side_rightOpen = decoBlockModels.curtainSide(baseName +"_three_right_upper_open", particle);
        ModelFile sideAlt_rightOpen = decoBlockModels.curtainSideAlt(baseName +"_three_right_upper_open", particle);
        ModelFile side_leftOpen = decoBlockModels.curtainSide(baseName +"_three_left_upper_open", particle);
        ModelFile sideAlt_leftOpen = decoBlockModels.curtainSideAlt(baseName +"_three_left_upper_open", particle);
        ModelFile side_middleOpen = decoBlockModels.curtainSide(baseName +"_three_middle_upper_open", particle);
        ModelFile sideAlt_middleOpen = decoBlockModels.curtainSideAlt(baseName +"_three_middle_upper_open", particle);
        ModelFile side_singleDownOpen = decoBlockModels.curtainSide(baseName +"_single_lower_open", particle);
        ModelFile sideAlt_singleDownOpen = decoBlockModels.curtainSideAlt(baseName +"_single_lower_open", particle);
        ModelFile side_rightDownOpen = decoBlockModels.curtainSide(baseName +"_three_right_lower_open", particle);
        ModelFile sideAlt_rightDownOpen = decoBlockModels.curtainSideAlt(baseName +"_three_right_lower_open", particle);
        ModelFile side_leftDownOpen = decoBlockModels.curtainSide(baseName +"_three_left_lower_open", particle);
        ModelFile sideAlt_leftDownOpen = decoBlockModels.curtainSideAlt(baseName +"_three_left_lower_open", particle);
        ModelFile side_middleDownOpen = decoBlockModels.curtainSide(baseName +"_three_middle_lower_open", particle);
        ModelFile sideAlt_middleDownOpen = decoBlockModels.curtainSideAlt(baseName +"_three_middle_lower_open", particle);


        curtainBlock(block, post, postEnds, rodSide, rodSideAlt, cap, capAlt, capDown, capDownAlt, side_single, sideAlt_single, side_right, sideAlt_right,
                side_left, sideAlt_left, side_middle, sideAlt_middle, side_singleDown, sideAlt_singleDown, side_rightDown, sideAlt_rightDown,
                side_leftDown, sideAlt_leftDown, side_middleDown, sideAlt_middleDown, side_singleOpen, sideAlt_singleOpen, side_rightOpen,
                sideAlt_rightOpen, side_leftOpen, sideAlt_leftOpen, side_middleOpen, sideAlt_middleOpen, side_singleDownOpen, sideAlt_singleDownOpen,
                side_rightDownOpen, sideAlt_rightDownOpen, side_leftDownOpen, sideAlt_leftDownOpen, side_middleDownOpen, sideAlt_middleDownOpen);
    }

    private void curtainBlock(Block block, ModelFile post, ModelFile postEnds, ModelFile rodSide, ModelFile rodSideAlt,
                              ModelFile cap, ModelFile capAlt, ModelFile capDown, ModelFile capDownAlt,
                              ModelFile side_single, ModelFile sideAlt_single, ModelFile side_right, ModelFile sideAlt_right,
                              ModelFile side_left, ModelFile sideAlt_left, ModelFile side_middle, ModelFile sideAlt_middle,
                              ModelFile side_singleDown, ModelFile sideAlt_singleDown, ModelFile side_rightDown, ModelFile sideAlt_rightDown,
                              ModelFile side_leftDown, ModelFile sideAlt_leftDown, ModelFile side_middleDown, ModelFile sideAlt_middleDown,

                              ModelFile side_singleOpen, ModelFile sideAlt_singleOpen, ModelFile side_rightOpen, ModelFile sideAlt_rightOpen,
                              ModelFile side_leftOpen, ModelFile sideAlt_leftOpen, ModelFile side_middleOpen, ModelFile sideAlt_middleOpen,
                              ModelFile side_singleDownOpen, ModelFile sideAlt_singleDownOpen, ModelFile side_rightDownOpen, ModelFile sideAlt_rightDownOpen,
                              ModelFile side_leftDownOpen, ModelFile sideAlt_leftDownOpen, ModelFile side_middleDownOpen, ModelFile sideAlt_middleDownOpen) {

        ModelFile[] sides = {side_single, side_left, side_middle, side_right};
        ModelFile[] sideAlts = {sideAlt_single, sideAlt_left, sideAlt_middle, sideAlt_right};
        ModelFile[] sidesDown = {side_singleDown, side_leftDown, side_middleDown, side_rightDown};
        ModelFile[] sideAltsDown = {sideAlt_singleDown, sideAlt_leftDown, sideAlt_middleDown, sideAlt_rightDown};
        ModelFile[] sidesOpen = {side_singleOpen, side_leftOpen, side_middleOpen, side_rightOpen};
        ModelFile[] sideAltsOpen = {sideAlt_singleOpen, sideAlt_leftOpen, sideAlt_middleOpen, sideAlt_rightOpen};
        ModelFile[] sidesDownOpen = {side_singleDownOpen, side_leftDownOpen, side_middleDownOpen, side_rightDownOpen};
        ModelFile[] sideAltsDownOpen = {sideAlt_singleDownOpen, sideAlt_leftDownOpen, sideAlt_middleDownOpen, sideAlt_rightDownOpen};

        MultiPartBlockStateBuilder builder = getMultipartBuilder(block).part().modelFile(postEnds).addModel().condition(PipeBlock.SOUTH, false)
                .condition(PipeBlock.NORTH, false).condition(PipeBlock.WEST, false).condition(PipeBlock.EAST, false)
                .end()
                .part().modelFile(post).addModel().condition(PipeBlock.SOUTH, false)
                .condition(PipeBlock.NORTH, false).condition(PipeBlock.WEST, false).condition(PipeBlock.EAST, false)
                .end();

        PipeBlock.PROPERTY_BY_DIRECTION.entrySet().forEach(e -> {
            Direction dir = e.getKey();

            if (dir.getAxis().isHorizontal()) {
                boolean alt = dir == Direction.SOUTH;
                builder.part().modelFile(alt || dir == Direction.WEST ? capAlt : cap)
                        .rotationY(dir.getAxis() == Direction.Axis.X ? 90 : 0).addModel()
                        .condition(e.getValue(), true)
                        .condition(getOppositeProperty(dir), false)
                        .condition(getLeftProperty(dir), false)
                        .condition(getRightProperty(dir), false)
                        .condition(TemplateCurtainBlock.OPEN, false)
                        .condition(PipeBlock.UP, false).end()
                        .part().modelFile(alt || dir == Direction.WEST ? capDownAlt : capDown)
                        .rotationY(dir.getAxis() == Direction.Axis.X ? 90 : 0).addModel()
                        .condition(e.getValue(), true)
                        .condition(getOppositeProperty(dir), false)
                        .condition(getLeftProperty(dir), false)
                        .condition(getRightProperty(dir), false)
                        .condition(TemplateCurtainBlock.OPEN, false)
                        .condition(PipeBlock.UP, true).end()
                        .part().modelFile(alt || dir == Direction.WEST ? rodSideAlt : rodSide)
                        .rotationY(dir.getAxis() == Direction.Axis.X ? 90 : 0).addModel()
                        .condition(e.getValue(), true)
                        .condition(PipeBlock.UP, false).end();

                for (int x=0; x<4; x++) {
                    builder.part().modelFile(alt || dir == Direction.WEST ? sideAlts[x] : sides[x])
                            .rotationY(dir.getAxis() == Direction.Axis.X ? 90 : 0).addModel()
                            .condition(e.getValue(), true)
                            .condition(TemplateCurtainBlock.POSITION, x)
                            .condition(TemplateCurtainBlock.OPEN, false)
                            .condition(PipeBlock.DOWN, true).end()
                            .part().modelFile(alt || dir == Direction.WEST ? sideAltsDown[x] : sidesDown[x])
                            .rotationY(dir.getAxis() == Direction.Axis.X ? 90 : 0).addModel()
                            .condition(e.getValue(), true)
                            .condition(TemplateCurtainBlock.POSITION, x)
                            .condition(TemplateCurtainBlock.OPEN, false)
                            .condition(PipeBlock.DOWN, false).end()
                            .part().modelFile(alt || dir == Direction.WEST ? sideAltsOpen[x] : sidesOpen[x])
                            .rotationY(dir.getAxis() == Direction.Axis.X ? 90 : 0).addModel()
                            .condition(e.getValue(), true)
                            .condition(TemplateCurtainBlock.POSITION, x)
                            .condition(TemplateCurtainBlock.OPEN, true)
                            .condition(PipeBlock.DOWN, true).end()
                            .part().modelFile(alt || dir == Direction.WEST ? sideAltsDownOpen[x] : sidesDownOpen[x])
                            .rotationY(dir.getAxis() == Direction.Axis.X ? 90 : 0).addModel()
                            .condition(e.getValue(), true)
                            .condition(TemplateCurtainBlock.POSITION, x)
                            .condition(TemplateCurtainBlock.OPEN, true)
                            .condition(PipeBlock.DOWN, false).end();
                }
            }
        });
    }


    //supply methods
    BooleanProperty getOppositeProperty (Direction dir){return PipeBlock.PROPERTY_BY_DIRECTION.get(dir.getOpposite());}

    BooleanProperty getLeftProperty (Direction dir){return PipeBlock.PROPERTY_BY_DIRECTION.get(dir.getCounterClockWise());}

    BooleanProperty getRightProperty (Direction dir){return PipeBlock.PROPERTY_BY_DIRECTION.get(dir.getClockWise());}


}
