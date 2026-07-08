package net.satan.deco_ci.datagen;

import net.minecraft.client.model.Model;
import net.minecraft.core.Direction;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.PipeBlock;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.client.model.generators.MultiPartBlockStateBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.satan.deco_ci.block.TemplatePelmetBlock;
import net.satan.deco_ci.block.ThreePositionsCurtainBlock;
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

        curtainDefaultBlockState(CIBlocks.CURTAIN_DEFAULT_BLACK);
        curtainDefaultBlockState(CIBlocks.CURTAIN_DEFAULT_BLUE);
        curtainDefaultBlockState(CIBlocks.CURTAIN_DEFAULT_BROWN);
        curtainDefaultBlockState(CIBlocks.CURTAIN_DEFAULT_CYAN);
        curtainDefaultBlockState(CIBlocks.CURTAIN_DEFAULT_YELLOW);
        curtainDefaultBlockState(CIBlocks.CURTAIN_DEFAULT_GRAY);
        curtainDefaultBlockState(CIBlocks.CURTAIN_DEFAULT_GREEN);
        curtainDefaultBlockState(CIBlocks.CURTAIN_DEFAULT_LIGHT_BLUE);
        curtainDefaultBlockState(CIBlocks.CURTAIN_DEFAULT_LIGHT_GRAY);
        curtainDefaultBlockState(CIBlocks.CURTAIN_DEFAULT_MAGENTA);
        curtainDefaultBlockState(CIBlocks.CURTAIN_DEFAULT_ORANGE);
        curtainDefaultBlockState(CIBlocks.CURTAIN_DEFAULT_PINK);
        curtainDefaultBlockState(CIBlocks.CURTAIN_DEFAULT_LIME);
        curtainDefaultBlockState(CIBlocks.CURTAIN_DEFAULT_PURPLE);
        curtainDefaultBlockState(CIBlocks.CURTAIN_DEFAULT_RED);
        curtainDefaultBlockState(CIBlocks.CURTAIN_DEFAULT_WHITE);

        curtainBeadedBlockState(CIBlocks.CURTAIN_BEADED_BLACK);
        curtainBeadedBlockState(CIBlocks.CURTAIN_BEADED_BLUE);
        curtainBeadedBlockState(CIBlocks.CURTAIN_BEADED_BROWN);
        curtainBeadedBlockState(CIBlocks.CURTAIN_BEADED_CYAN);
        curtainBeadedBlockState(CIBlocks.CURTAIN_BEADED_YELLOW);
        curtainBeadedBlockState(CIBlocks.CURTAIN_BEADED_GRAY);
        curtainBeadedBlockState(CIBlocks.CURTAIN_BEADED_GREEN);
        curtainBeadedBlockState(CIBlocks.CURTAIN_BEADED_LIGHT_BLUE);
        curtainBeadedBlockState(CIBlocks.CURTAIN_BEADED_LIGHT_GRAY);
        curtainBeadedBlockState(CIBlocks.CURTAIN_BEADED_MAGENTA);
        curtainBeadedBlockState(CIBlocks.CURTAIN_BEADED_ORANGE);
        curtainBeadedBlockState(CIBlocks.CURTAIN_BEADED_PINK);
        curtainBeadedBlockState(CIBlocks.CURTAIN_BEADED_LIME);
        curtainBeadedBlockState(CIBlocks.CURTAIN_BEADED_PURPLE);
        curtainBeadedBlockState(CIBlocks.CURTAIN_BEADED_RED);
        curtainBeadedBlockState(CIBlocks.CURTAIN_BEADED_WHITE);

        curtainBlindsBlockState(CIBlocks.CURTAIN_BLINDS_BLACK);
        curtainBlindsBlockState(CIBlocks.CURTAIN_BLINDS_BLUE);
        curtainBlindsBlockState(CIBlocks.CURTAIN_BLINDS_BROWN);
        curtainBlindsBlockState(CIBlocks.CURTAIN_BLINDS_CYAN);
        curtainBlindsBlockState(CIBlocks.CURTAIN_BLINDS_YELLOW);
        curtainBlindsBlockState(CIBlocks.CURTAIN_BLINDS_GRAY);
        curtainBlindsBlockState(CIBlocks.CURTAIN_BLINDS_GREEN);
        curtainBlindsBlockState(CIBlocks.CURTAIN_BLINDS_LIGHT_BLUE);
        curtainBlindsBlockState(CIBlocks.CURTAIN_BLINDS_LIGHT_GRAY);
        curtainBlindsBlockState(CIBlocks.CURTAIN_BLINDS_MAGENTA);
        curtainBlindsBlockState(CIBlocks.CURTAIN_BLINDS_ORANGE);
        curtainBlindsBlockState(CIBlocks.CURTAIN_BLINDS_PINK);
        curtainBlindsBlockState(CIBlocks.CURTAIN_BLINDS_LIME);
        curtainBlindsBlockState(CIBlocks.CURTAIN_BLINDS_PURPLE);
        curtainBlindsBlockState(CIBlocks.CURTAIN_BLINDS_RED);
        curtainBlindsBlockState(CIBlocks.CURTAIN_BLINDS_WHITE);

        pelmetSolidBlockState(CIBlocks.PELMET_TEST);
        pelmetSoftBlockState(CIBlocks.PELMET_TEST1);
        pelmetCarvedBlockState(CIBlocks.PELMET_TEST2);
        pelmetOrnateBlockState(CIBlocks.PELMET_TEST3);
}

    private void pelmetOrnateBlockState(RegistryObject<Block> block) {
        ResourceLocation res = new ResourceLocation("block/vine");
        ModelFile pelmet = decoBlockModels.pelmetOrnate(block.getId().getPath(), res, res, res, res);
        ModelFile pelmetBars = decoBlockModels.pelmetOrnateBars(block.getId().getPath(),  res, res, res, res);
        pelmetBlock(block.get(), pelmet, pelmetBars);
    }

    private void pelmetCarvedBlockState(RegistryObject<Block> block) {
        ModelFile pelmet = decoBlockModels.pelmetCarved(block.getId().getPath(), new ResourceLocation("block/vine"));
        ModelFile pelmetBars = decoBlockModels.pelmetCarvedBars(block.getId().getPath(), new ResourceLocation("block/vine"));
        pelmetBlock(block.get(), pelmet, pelmetBars);
    }

    private void pelmetSoftBlockState(RegistryObject<Block> block) {
        ModelFile pelmet = decoBlockModels.pelmetSoft(block.getId().getPath(), new ResourceLocation("block/vine"));
        ModelFile pelmetBars = decoBlockModels.pelmetSoftBars(block.getId().getPath(), new ResourceLocation("block/vine"));
        pelmetBlock(block.get(), pelmet, pelmetBars);
    }

    private void pelmetSolidBlockState(RegistryObject<Block> block) {
        ModelFile pelmet = decoBlockModels.pelmetSolid(block.getId().getPath(), new ResourceLocation("block/vine"));
        ModelFile pelmetBars = decoBlockModels.pelmetSolidBars(block.getId().getPath(), new ResourceLocation("block/vine"));
        pelmetBlock(block.get(), pelmet, pelmetBars);
    }

    private void pelmetBlock(Block block, ModelFile pelmet, ModelFile pelmetBars){
        MultiPartBlockStateBuilder builder = getMultipartBuilder(block);
        PipeBlock.PROPERTY_BY_DIRECTION.entrySet().forEach(e -> {
            Direction dir = e.getKey();
            BooleanProperty bDir = TemplatePelmetBlock.PROPERTY_BY_DIRECTION_BARS.get(dir);

            if (dir.getAxis().isHorizontal()) {
                builder.part().modelFile(pelmet)
                        .rotationY((int) dir.getOpposite().toYRot()).addModel()
                        .condition(e.getValue(), true)
                        .condition(bDir, false).end()

                        .part().modelFile(pelmetBars)
                        .rotationY((int) dir.getOpposite().toYRot()).addModel()
                        .condition(bDir, true)
                        .condition(e.getValue(), false).end();
            }
        });
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
                        .condition(ThreePositionsCurtainBlock.OPEN, false)
                        .condition(PipeBlock.UP, false).end()
                        .part().modelFile(alt || dir == Direction.WEST ? capDownAlt : capDown)
                        .rotationY(dir.getAxis() == Direction.Axis.X ? 90 : 0).addModel()
                        .condition(e.getValue(), true)
                        .condition(getOppositeProperty(dir), false)
                        .condition(getLeftProperty(dir), false)
                        .condition(getRightProperty(dir), false)
                        .condition(ThreePositionsCurtainBlock.OPEN, false)
                        .condition(PipeBlock.UP, true).end()
                        .part().modelFile(alt || dir == Direction.WEST ? rodSideAlt : rodSide)
                        .rotationY(dir.getAxis() == Direction.Axis.X ? 90 : 0).addModel()
                        .condition(e.getValue(), true)
                        .condition(PipeBlock.UP, false).end();

                for (int x=0; x<4; x++) {
                    builder.part().modelFile(alt || dir == Direction.WEST ? sideAlts[x] : sides[x])
                            .rotationY(dir.getAxis() == Direction.Axis.X ? 90 : 0).addModel()
                            .condition(e.getValue(), true)
                            .condition(ThreePositionsCurtainBlock.POSITION, x)
                            .condition(ThreePositionsCurtainBlock.OPEN, false)
                            .condition(PipeBlock.DOWN, true).end()
                            .part().modelFile(alt || dir == Direction.WEST ? sideAltsDown[x] : sidesDown[x])
                            .rotationY(dir.getAxis() == Direction.Axis.X ? 90 : 0).addModel()
                            .condition(e.getValue(), true)
                            .condition(ThreePositionsCurtainBlock.POSITION, x)
                            .condition(ThreePositionsCurtainBlock.OPEN, false)
                            .condition(PipeBlock.DOWN, false).end()
                            .part().modelFile(alt || dir == Direction.WEST ? sideAltsOpen[x] : sidesOpen[x])
                            .rotationY(dir.getAxis() == Direction.Axis.X ? 90 : 0).addModel()
                            .condition(e.getValue(), true)
                            .condition(ThreePositionsCurtainBlock.POSITION, x)
                            .condition(ThreePositionsCurtainBlock.OPEN, true)
                            .condition(PipeBlock.DOWN, true).end()
                            .part().modelFile(alt || dir == Direction.WEST ? sideAltsDownOpen[x] : sidesDownOpen[x])
                            .rotationY(dir.getAxis() == Direction.Axis.X ? 90 : 0).addModel()
                            .condition(e.getValue(), true)
                            .condition(ThreePositionsCurtainBlock.POSITION, x)
                            .condition(ThreePositionsCurtainBlock.OPEN, true)
                            .condition(PipeBlock.DOWN, false).end();
                }
            }
        });
    }

    private void curtainDefaultBlockState(RegistryObject<Block> block) {
        curtainDefaultBlockInternal(block.get(), block.getId().toString(),
                new ResourceLocation("minecraft", "block/iron_bars"),
                new ResourceLocation("minecraft", "block/iron_bars"),
                new ResourceLocation("minecraft", "block/iron_bars"));

    }
    private void curtainDefaultBlockInternal(Block block, String baseName,
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

        ModelFile side_middle = decoBlockModels.curtainSide(baseName +"_upper", particle);
        ModelFile sideAlt_middle = decoBlockModels.curtainSideAlt(baseName +"_upper", particle);
        ModelFile side_middleDown = decoBlockModels.curtainSide(baseName +"_lower", particle);
        ModelFile sideAlt_middleDown = decoBlockModels.curtainSideAlt(baseName +"_lower", particle);

        ModelFile side_singleOpen = decoBlockModels.curtainSide(baseName +"_upper_open", particle);
        ModelFile sideAlt_singleOpen = decoBlockModels.curtainSideAlt(baseName +"_upper_open", particle);
        ModelFile side_rightOpen = decoBlockModels.curtainSide(baseName +"_right_upper_open", particle);
        ModelFile sideAlt_rightOpen = decoBlockModels.curtainSideAlt(baseName +"_right_upper_open", particle);
        ModelFile side_leftOpen = decoBlockModels.curtainSide(baseName +"_left_upper_open", particle);
        ModelFile sideAlt_leftOpen = decoBlockModels.curtainSideAlt(baseName +"_left_upper_open", particle);
        ModelFile side_middleOpen = decoBlockModels.curtainSide(baseName +"_middle_upper_open", particle);
        ModelFile sideAlt_middleOpen = decoBlockModels.curtainSideAlt(baseName +"_middle_upper_open", particle);
        ModelFile side_singleDownOpen = decoBlockModels.curtainSide(baseName +"_lower_open", particle);
        ModelFile sideAlt_singleDownOpen = decoBlockModels.curtainSideAlt(baseName +"_lower_open", particle);
        ModelFile side_rightDownOpen = decoBlockModels.curtainSide(baseName +"_right_lower_open", particle);
        ModelFile sideAlt_rightDownOpen = decoBlockModels.curtainSideAlt(baseName +"_right_lower_open", particle);
        ModelFile side_leftDownOpen = decoBlockModels.curtainSide(baseName +"_left_lower_open", particle);
        ModelFile sideAlt_leftDownOpen = decoBlockModels.curtainSideAlt(baseName +"_left_lower_open", particle);
        ModelFile side_middleDownOpen = decoBlockModels.curtainSide(baseName +"_middle_lower_open", particle);
        ModelFile sideAlt_middleDownOpen = decoBlockModels.curtainSideAlt(baseName +"_middle_lower_open", particle);


        curtainDefaultBlock(block, post, postEnds, rodSide, rodSideAlt, cap, capAlt, capDown, capDownAlt, side_middle, sideAlt_middle, side_middleDown, sideAlt_middleDown, side_singleOpen, sideAlt_singleOpen, side_rightOpen,
                sideAlt_rightOpen, side_leftOpen, sideAlt_leftOpen, side_middleOpen, sideAlt_middleOpen, side_singleDownOpen, sideAlt_singleDownOpen,
                side_rightDownOpen, sideAlt_rightDownOpen, side_leftDownOpen, sideAlt_leftDownOpen, side_middleDownOpen, sideAlt_middleDownOpen);
    }

    private void curtainDefaultBlock(Block block, ModelFile post, ModelFile postEnds, ModelFile rodSide, ModelFile rodSideAlt,
                              ModelFile cap, ModelFile capAlt, ModelFile capDown, ModelFile capDownAlt,
                              ModelFile side_middle, ModelFile sideAlt_middle, ModelFile side_middleDown, ModelFile sideAlt_middleDown,

                              ModelFile side_singleOpen, ModelFile sideAlt_singleOpen, ModelFile side_rightOpen, ModelFile sideAlt_rightOpen,
                              ModelFile side_leftOpen, ModelFile sideAlt_leftOpen, ModelFile side_middleOpen, ModelFile sideAlt_middleOpen,
                              ModelFile side_singleDownOpen, ModelFile sideAlt_singleDownOpen, ModelFile side_rightDownOpen, ModelFile sideAlt_rightDownOpen,
                              ModelFile side_leftDownOpen, ModelFile sideAlt_leftDownOpen, ModelFile side_middleDownOpen, ModelFile sideAlt_middleDownOpen) {

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
                        .condition(ThreePositionsCurtainBlock.OPEN, false)
                        .condition(PipeBlock.UP, false).end()

                        .part().modelFile(alt || dir == Direction.WEST ? capDownAlt : capDown)
                        .rotationY(dir.getAxis() == Direction.Axis.X ? 90 : 0).addModel()
                        .condition(e.getValue(), true)
                        .condition(getOppositeProperty(dir), false)
                        .condition(getLeftProperty(dir), false)
                        .condition(getRightProperty(dir), false)
                        .condition(ThreePositionsCurtainBlock.OPEN, false)
                        .condition(PipeBlock.UP, true).end()

                        .part().modelFile(alt || dir == Direction.WEST ? rodSideAlt : rodSide)
                        .rotationY(dir.getAxis() == Direction.Axis.X ? 90 : 0).addModel()
                        .condition(e.getValue(), true)
                        .condition(PipeBlock.UP, false).end()

                        .part().modelFile(alt || dir == Direction.WEST ? sideAlt_middle : side_middle)
                        .rotationY(dir.getAxis() == Direction.Axis.X ? 90 : 0).addModel()
                        .condition(e.getValue(), true)
                        .condition(ThreePositionsCurtainBlock.OPEN, false)
                        .condition(PipeBlock.DOWN, true)
                        .end()

                        .part().modelFile(alt || dir == Direction.WEST ? sideAlt_middleDown : side_middleDown)
                        .rotationY(dir.getAxis() == Direction.Axis.X ? 90 : 0).addModel()
                        .condition(e.getValue(), true)
                        .condition(ThreePositionsCurtainBlock.OPEN, false)
                        .condition(PipeBlock.DOWN, false)
                        .end();

                for (int x=0; x<4; x++) {
                    builder
                            .part().modelFile(alt || dir == Direction.WEST ? sideAltsOpen[x] : sidesOpen[x])
                            .rotationY(dir.getAxis() == Direction.Axis.X ? 90 : 0).addModel()
                            .condition(e.getValue(), true)
                            .condition(ThreePositionsCurtainBlock.POSITION, x)
                            .condition(PipeBlock.DOWN, true)
                            .condition(ThreePositionsCurtainBlock.OPEN, true)
                            .end()

                            .part().modelFile(alt || dir == Direction.WEST ? sideAltsDownOpen[x] : sidesDownOpen[x])
                            .rotationY(dir.getAxis() == Direction.Axis.X ? 90 : 0).addModel()
                            .condition(e.getValue(), true)
                            .condition(ThreePositionsCurtainBlock.POSITION, x)
                            .condition(PipeBlock.DOWN, false)
                            .condition(ThreePositionsCurtainBlock.OPEN, true)
                            .end();
                }
            }
        });
    }

    private void curtainBeadedBlockState(RegistryObject<Block> block) {
        curtainBeadedBlockInternal(block.get(), block.getId().toString(),
                new ResourceLocation("minecraft", "block/iron_bars"),
                new ResourceLocation("minecraft", "block/iron_bars"),
                new ResourceLocation("minecraft", "block/iron_bars"));

    }
    private void curtainBeadedBlockInternal(Block block, String baseName,
                                             ResourceLocation particle, ResourceLocation bars,
                                             ResourceLocation edge) {
        ModelFile post = decoBlockModels.barsPost(baseName, particle, edge);
        ModelFile postEnds = decoBlockModels.barsPostEnds(baseName, particle, edge);
        ModelFile rodSide = decoBlockModels.curtainRodSide(baseName, bars);
        ModelFile rodSideAlt = decoBlockModels.curtainRodSideAlt(baseName, bars);

        ModelFile side_middle = decoBlockModels.curtainSide(baseName, particle);
        ModelFile sideAlt_middle = decoBlockModels.curtainSideAlt(baseName, particle);

        ModelFile side_singleOpen = decoBlockModels.curtainSide(baseName +"_open", particle);
        ModelFile sideAlt_singleOpen = decoBlockModels.curtainSideAlt(baseName +"_open", particle);
        ModelFile side_rightOpen = decoBlockModels.curtainSide(baseName +"_right_open", particle);
        ModelFile sideAlt_rightOpen = decoBlockModels.curtainSideAlt(baseName +"_right_open", particle);
        ModelFile side_leftOpen = decoBlockModels.curtainSide(baseName +"_left_open", particle);
        ModelFile sideAlt_leftOpen = decoBlockModels.curtainSideAlt(baseName +"_left_open", particle);
        ModelFile side_middleOpen = decoBlockModels.curtainSide(baseName +"_middle_open", particle);
        ModelFile sideAlt_middleOpen = decoBlockModels.curtainSideAlt(baseName +"_middle_open", particle);


        curtainBeadedBlock(block, post, postEnds, rodSide, rodSideAlt, side_middle, sideAlt_middle, side_singleOpen, sideAlt_singleOpen, side_rightOpen,
                sideAlt_rightOpen, side_leftOpen, sideAlt_leftOpen, side_middleOpen, sideAlt_middleOpen);
    }

    private void curtainBeadedBlock(Block block, ModelFile post, ModelFile postEnds, ModelFile rodSide, ModelFile rodSideAlt,
                                     ModelFile side_middle, ModelFile sideAlt_middle,

                                     ModelFile side_singleOpen, ModelFile sideAlt_singleOpen, ModelFile side_rightOpen, ModelFile sideAlt_rightOpen,
                                     ModelFile side_leftOpen, ModelFile sideAlt_leftOpen, ModelFile side_middleOpen, ModelFile sideAlt_middleOpen) {

        ModelFile[] sidesOpen = {side_singleOpen, side_leftOpen, side_middleOpen, side_rightOpen};
        ModelFile[] sideAltsOpen = {sideAlt_singleOpen, sideAlt_leftOpen, sideAlt_middleOpen, sideAlt_rightOpen};

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
                builder.part().modelFile(alt || dir == Direction.WEST ? sideAlt_middle : side_middle)
                        .rotationY(dir.getAxis() == Direction.Axis.X ? 90 : 0).addModel()
                        .condition(e.getValue(), true)
                        .condition(ThreePositionsCurtainBlock.OPEN, false)
                        .end()

                        .part().modelFile(alt || dir == Direction.WEST ? rodSideAlt : rodSide)
                        .rotationY(dir.getAxis() == Direction.Axis.X ? 90 : 0).addModel()
                        .condition(e.getValue(), true)
                        .condition(PipeBlock.UP, false).end();


                for (int x=0; x<4; x++) {
                    builder
                            .part().modelFile(alt || dir == Direction.WEST ? sideAltsOpen[x] : sidesOpen[x])
                            .rotationY(dir.getAxis() == Direction.Axis.X ? 90 : 0).addModel()
                            .condition(e.getValue(), true)
                            .condition(ThreePositionsCurtainBlock.POSITION, x)
                            .condition(ThreePositionsCurtainBlock.OPEN, true).end();
                }
            }
        });
    }

    private void curtainBlindsBlockState(RegistryObject<Block> block) {
        curtainBlindsBlockInternal(block.get(), block.getId().toString(),
                new ResourceLocation("minecraft", "block/iron_bars"),
                new ResourceLocation("minecraft", "block/iron_bars"),
                new ResourceLocation("minecraft", "block/iron_bars"));

    }
    private void curtainBlindsBlockInternal(Block block, String baseName,
                                            ResourceLocation particle, ResourceLocation bars,
                                            ResourceLocation edge) {
        ModelFile post = decoBlockModels.barsPost(baseName, particle, edge);
        ModelFile postEnds = decoBlockModels.barsPostEnds(baseName, particle, edge);
        ModelFile rodSide = decoBlockModels.curtainRodSide(baseName, bars);
        ModelFile rodSideAlt = decoBlockModels.curtainRodSideAlt(baseName, bars);

        ModelFile side_middle = decoBlockModels.curtainSide(baseName + "_upper", particle);
        ModelFile sideAlt_middle = decoBlockModels.curtainSideAlt(baseName + "_upper", particle);
        ModelFile side_middleDown = decoBlockModels.curtainSide(baseName + "_lower", particle);
        ModelFile sideAlt_middleDown = decoBlockModels.curtainSideAlt(baseName + "_lower", particle);

        ModelFile side_middleOpen = decoBlockModels.curtainSide(baseName +"_upper_open", particle);
        ModelFile sideAlt_middleOpen = decoBlockModels.curtainSideAlt(baseName +"_upper_open", particle);
        ModelFile side_middleOpenDown = decoBlockModels.curtainSide(baseName +"_lower_open", particle);
        ModelFile sideAlt_middleOpenDown = decoBlockModels.curtainSideAlt(baseName +"_lower_open", particle);


        curtainBlindsBlock(block, post, postEnds, rodSide, rodSideAlt, side_middle, sideAlt_middle, side_middleDown, sideAlt_middleDown,
                side_middleOpen, sideAlt_middleOpen, side_middleOpenDown, sideAlt_middleOpenDown);
    }

    private void curtainBlindsBlock(Block block, ModelFile post, ModelFile postEnds, ModelFile rodSide, ModelFile rodSideAlt,
                                    ModelFile side_middle, ModelFile sideAlt_middle, ModelFile side_middleDown, ModelFile sideAlt_middleDown,
                                    ModelFile side_middleOpen, ModelFile sideAlt_middleOpen,
                                    ModelFile side_middleDownOpen, ModelFile sideAlt_middleDownOpen) {

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
                builder.part().modelFile(alt || dir == Direction.WEST ? sideAlt_middle : side_middle)
                        .rotationY(dir.getAxis() == Direction.Axis.X ? 90 : 0).addModel()
                        .condition(e.getValue(), true)
                        .condition(ThreePositionsCurtainBlock.OPEN, false)
                        .condition(PipeBlock.DOWN, true).end()

                        .part().modelFile(alt || dir == Direction.WEST ? sideAlt_middleDown : side_middleDown)
                        .rotationY(dir.getAxis() == Direction.Axis.X ? 90 : 0).addModel()
                        .condition(e.getValue(), true)
                        .condition(ThreePositionsCurtainBlock.OPEN, false)
                        .condition(PipeBlock.DOWN, false).end()

                        .part().modelFile(alt || dir == Direction.WEST ? sideAlt_middleOpen : side_middleOpen)
                        .rotationY(dir.getAxis() == Direction.Axis.X ? 90 : 0).addModel()
                        .condition(e.getValue(), true)
                        .condition(ThreePositionsCurtainBlock.OPEN, true)
                        .condition(PipeBlock.UP, false).end()

                        .part().modelFile(alt || dir == Direction.WEST ? sideAlt_middleDownOpen : side_middleDownOpen)
                        .rotationY(dir.getAxis() == Direction.Axis.X ? 90 : 0).addModel()
                        .condition(e.getValue(), true)
                        .condition(ThreePositionsCurtainBlock.OPEN, true)
                        .condition(PipeBlock.UP, true).end()

                        .part().modelFile(alt || dir == Direction.WEST ? rodSideAlt : rodSide)
                        .rotationY(dir.getAxis() == Direction.Axis.X ? 90 : 0).addModel()
                        .condition(e.getValue(), true)
                        .condition(PipeBlock.UP, false).end();

            }
        });
    }

    //supply methods
    BooleanProperty getOppositeProperty (Direction dir){return PipeBlock.PROPERTY_BY_DIRECTION.get(dir.getOpposite());}

    BooleanProperty getLeftProperty (Direction dir){return PipeBlock.PROPERTY_BY_DIRECTION.get(dir.getCounterClockWise());}

    BooleanProperty getRightProperty (Direction dir){return PipeBlock.PROPERTY_BY_DIRECTION.get(dir.getClockWise());}


}
