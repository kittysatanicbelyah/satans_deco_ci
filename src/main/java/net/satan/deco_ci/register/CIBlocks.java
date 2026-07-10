package net.satan.deco_ci.register;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.PushReaction;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import net.satan.deco_ci.block.TemplateCurtainBlock;
import net.satan.deco_ci.block.TemplatePelmetBlock;
import net.satan.deco_ci.block.ThreePositionsCurtainBlock;
import net.satan.deco_ci.satans_deco_ci;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class CIBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, satans_deco_ci.MODID);
    //Blocks go here
    //edge-trimmed
    public static final RegistryObject<Block> CURTAIN_WHITE = registerBlock("curtain_white",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
    public static final RegistryObject<Block> CURTAIN_ORANGE = registerBlock("curtain_orange",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
    public static final RegistryObject<Block> CURTAIN_MAGENTA = registerBlock("curtain_magenta",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
    public static final RegistryObject<Block> CURTAIN_LIGHT_BLUE = registerBlock("curtain_light_blue",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
    public static final RegistryObject<Block> CURTAIN_YELLOW = registerBlock("curtain_yellow",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
    public static final RegistryObject<Block> CURTAIN_LIME = registerBlock("curtain_lime",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
    public static final RegistryObject<Block> CURTAIN_PINK = registerBlock("curtain_pink",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
    public static final RegistryObject<Block> CURTAIN_GRAY = registerBlock("curtain_gray",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
    public static final RegistryObject<Block> CURTAIN_LIGHT_GRAY = registerBlock("curtain_light_gray",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
    public static final RegistryObject<Block> CURTAIN_CYAN = registerBlock("curtain_cyan",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
    public static final RegistryObject<Block> CURTAIN_PURPLE = registerBlock("curtain_purple",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
    public static final RegistryObject<Block> CURTAIN_BLUE = registerBlock("curtain_blue",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
    public static final RegistryObject<Block> CURTAIN_BROWN = registerBlock("curtain_brown",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
    public static final RegistryObject<Block> CURTAIN_GREEN = registerBlock("curtain_green",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
    public static final RegistryObject<Block> CURTAIN_RED = registerBlock("curtain_red",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
    public static final RegistryObject<Block> CURTAIN_BLACK = registerBlock("curtain_black",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
    //defaults
    public static final RegistryObject<Block> CURTAIN_DEFAULT_WHITE = registerBlock("curtain_default_white",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
    public static final RegistryObject<Block> CURTAIN_DEFAULT_ORANGE = registerBlock("curtain_default_orange",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
    public static final RegistryObject<Block> CURTAIN_DEFAULT_MAGENTA = registerBlock("curtain_default_magenta",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
    public static final RegistryObject<Block> CURTAIN_DEFAULT_LIGHT_BLUE = registerBlock("curtain_default_light_blue",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
    public static final RegistryObject<Block> CURTAIN_DEFAULT_YELLOW = registerBlock("curtain_default_yellow",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
    public static final RegistryObject<Block> CURTAIN_DEFAULT_LIME = registerBlock("curtain_default_lime",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
    public static final RegistryObject<Block> CURTAIN_DEFAULT_PINK = registerBlock("curtain_default_pink",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
    public static final RegistryObject<Block> CURTAIN_DEFAULT_GRAY = registerBlock("curtain_default_gray",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
    public static final RegistryObject<Block> CURTAIN_DEFAULT_LIGHT_GRAY = registerBlock("curtain_default_light_gray",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
    public static final RegistryObject<Block> CURTAIN_DEFAULT_CYAN = registerBlock("curtain_default_cyan",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
    public static final RegistryObject<Block> CURTAIN_DEFAULT_PURPLE = registerBlock("curtain_default_purple",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
    public static final RegistryObject<Block> CURTAIN_DEFAULT_BLUE = registerBlock("curtain_default_blue",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
    public static final RegistryObject<Block> CURTAIN_DEFAULT_BROWN = registerBlock("curtain_default_brown",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
    public static final RegistryObject<Block> CURTAIN_DEFAULT_GREEN = registerBlock("curtain_default_green",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
    public static final RegistryObject<Block> CURTAIN_DEFAULT_RED = registerBlock("curtain_default_red",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
    public static final RegistryObject<Block> CURTAIN_DEFAULT_BLACK = registerBlock("curtain_default_black",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
//beaded
public static final RegistryObject<Block> CURTAIN_BEADED_WHITE = registerBlock("curtain_beaded_white",
        () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
    public static final RegistryObject<Block> CURTAIN_BEADED_ORANGE = registerBlock("curtain_beaded_orange",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
    public static final RegistryObject<Block> CURTAIN_BEADED_MAGENTA = registerBlock("curtain_beaded_magenta",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
    public static final RegistryObject<Block> CURTAIN_BEADED_LIGHT_BLUE = registerBlock("curtain_beaded_light_blue",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
    public static final RegistryObject<Block> CURTAIN_BEADED_YELLOW = registerBlock("curtain_beaded_yellow",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
    public static final RegistryObject<Block> CURTAIN_BEADED_LIME = registerBlock("curtain_beaded_lime",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
    public static final RegistryObject<Block> CURTAIN_BEADED_PINK = registerBlock("curtain_beaded_pink",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
    public static final RegistryObject<Block> CURTAIN_BEADED_GRAY = registerBlock("curtain_beaded_gray",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
    public static final RegistryObject<Block> CURTAIN_BEADED_LIGHT_GRAY = registerBlock("curtain_beaded_light_gray",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
    public static final RegistryObject<Block> CURTAIN_BEADED_CYAN = registerBlock("curtain_beaded_cyan",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
    public static final RegistryObject<Block> CURTAIN_BEADED_PURPLE = registerBlock("curtain_beaded_purple",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
    public static final RegistryObject<Block> CURTAIN_BEADED_BLUE = registerBlock("curtain_beaded_blue",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
    public static final RegistryObject<Block> CURTAIN_BEADED_BROWN = registerBlock("curtain_beaded_brown",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
    public static final RegistryObject<Block> CURTAIN_BEADED_GREEN = registerBlock("curtain_beaded_green",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
    public static final RegistryObject<Block> CURTAIN_BEADED_RED = registerBlock("curtain_beaded_red",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
    public static final RegistryObject<Block> CURTAIN_BEADED_BLACK = registerBlock("curtain_beaded_black",
            () -> new ThreePositionsCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 0));
//blinds
public static final RegistryObject<Block> CURTAIN_BLINDS_WHITE = registerBlock("curtain_blinds_white",
        () -> new TemplateCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 1));
    public static final RegistryObject<Block> CURTAIN_BLINDS_ORANGE = registerBlock("curtain_blinds_orange",
            () -> new TemplateCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 1));
    public static final RegistryObject<Block> CURTAIN_BLINDS_MAGENTA = registerBlock("curtain_blinds_magenta",
            () -> new TemplateCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 1));
    public static final RegistryObject<Block> CURTAIN_BLINDS_LIGHT_BLUE = registerBlock("curtain_blinds_light_blue",
            () -> new TemplateCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 1));
    public static final RegistryObject<Block> CURTAIN_BLINDS_YELLOW = registerBlock("curtain_blinds_yellow",
            () -> new TemplateCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 1));
    public static final RegistryObject<Block> CURTAIN_BLINDS_LIME = registerBlock("curtain_blinds_lime",
            () -> new TemplateCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 1));
    public static final RegistryObject<Block> CURTAIN_BLINDS_PINK = registerBlock("curtain_blinds_pink",
            () -> new TemplateCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 1));
    public static final RegistryObject<Block> CURTAIN_BLINDS_GRAY = registerBlock("curtain_blinds_gray",
            () -> new TemplateCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 1));
    public static final RegistryObject<Block> CURTAIN_BLINDS_LIGHT_GRAY = registerBlock("curtain_blinds_light_gray",
            () -> new TemplateCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 1));
    public static final RegistryObject<Block> CURTAIN_BLINDS_CYAN = registerBlock("curtain_blinds_cyan",
            () -> new TemplateCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 1));
    public static final RegistryObject<Block> CURTAIN_BLINDS_PURPLE = registerBlock("curtain_blinds_purple",
            () -> new TemplateCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 1));
    public static final RegistryObject<Block> CURTAIN_BLINDS_BLUE = registerBlock("curtain_blinds_blue",
            () -> new TemplateCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 1));
    public static final RegistryObject<Block> CURTAIN_BLINDS_BROWN = registerBlock("curtain_blinds_brown",
            () -> new TemplateCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 1));
    public static final RegistryObject<Block> CURTAIN_BLINDS_GREEN = registerBlock("curtain_blinds_green",
            () -> new TemplateCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 1));
    public static final RegistryObject<Block> CURTAIN_BLINDS_RED = registerBlock("curtain_blinds_red",
            () -> new TemplateCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 1));
    public static final RegistryObject<Block> CURTAIN_BLINDS_BLACK = registerBlock("curtain_blinds_black",
            () -> new TemplateCurtainBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.GUITAR), false, 1));

    // Pelmets
    public static final RegistryObject<Block> PELMET_ORNATE_GOLD_BLACK = registerBlock("pelmet_ornate_gold_black",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_ORNATE_GOLD_GRAY = registerBlock("pelmet_ornate_gold_gray",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_ORNATE_GOLD_LIGHT_GRAY = registerBlock("pelmet_ornate_gold_light_gray",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_ORNATE_GOLD_WHITE = registerBlock("pelmet_ornate_gold_white",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_ORNATE_GOLD_RED = registerBlock("pelmet_ornate_gold_red",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_ORNATE_GOLD_BLUE = registerBlock("pelmet_ornate_gold_blue",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_ORNATE_GOLD_GREEN = registerBlock("pelmet_ornate_gold_green",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_ORNATE_GOLD_YELLOW = registerBlock("pelmet_ornate_gold_yellow",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_ORNATE_GOLD_MAGENTA = registerBlock("pelmet_ornate_gold_magenta",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_ORNATE_GOLD_CYAN = registerBlock("pelmet_ornate_gold_cyan",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_ORNATE_GOLD_LIME = registerBlock("pelmet_ornate_gold_lime",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_ORNATE_GOLD_PINK = registerBlock("pelmet_ornate_gold_pink",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_ORNATE_GOLD_PURPLE = registerBlock("pelmet_ornate_gold_purple",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_ORNATE_GOLD_ORANGE = registerBlock("pelmet_ornate_gold_orange",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_ORNATE_GOLD_LIGHT_BLUE = registerBlock("pelmet_ornate_gold_light_blue",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_ORNATE_GOLD_BROWN = registerBlock("pelmet_ornate_gold_brown",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));

    public static final RegistryObject<Block> PELMET_SOLID_BLACK = registerBlock("pelmet_solid_black",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_SOLID_GRAY = registerBlock("pelmet_solid_gray",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_SOLID_LIGHT_GRAY = registerBlock("pelmet_solid_light_gray",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_SOLID_WHITE = registerBlock("pelmet_solid_white",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_SOLID_RED = registerBlock("pelmet_solid_red",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_SOLID_BLUE = registerBlock("pelmet_solid_blue",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_SOLID_GREEN = registerBlock("pelmet_solid_green",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_SOLID_YELLOW = registerBlock("pelmet_solid_yellow",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_SOLID_MAGENTA = registerBlock("pelmet_solid_magenta",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_SOLID_CYAN = registerBlock("pelmet_solid_cyan",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_SOLID_LIME = registerBlock("pelmet_solid_lime",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_SOLID_PINK = registerBlock("pelmet_solid_pink",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_SOLID_PURPLE = registerBlock("pelmet_solid_purple",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_SOLID_ORANGE = registerBlock("pelmet_solid_orange",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_SOLID_LIGHT_BLUE = registerBlock("pelmet_solid_light_blue",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_SOLID_BROWN = registerBlock("pelmet_solid_brown",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));

    public static final RegistryObject<Block> PELMET_SOFT_BLACK = registerBlock("pelmet_soft_black",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_SOFT_GRAY = registerBlock("pelmet_soft_gray",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_SOFT_LIGHT_GRAY = registerBlock("pelmet_soft_light_gray",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_SOFT_WHITE = registerBlock("pelmet_soft_white",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_SOFT_RED = registerBlock("pelmet_soft_red",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_SOFT_BLUE = registerBlock("pelmet_soft_blue",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_SOFT_GREEN = registerBlock("pelmet_soft_green",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_SOFT_YELLOW = registerBlock("pelmet_soft_yellow",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_SOFT_MAGENTA = registerBlock("pelmet_soft_magenta",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_SOFT_CYAN = registerBlock("pelmet_soft_cyan",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_SOFT_LIME = registerBlock("pelmet_soft_lime",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_SOFT_PINK = registerBlock("pelmet_soft_pink",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_SOFT_PURPLE = registerBlock("pelmet_soft_purple",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_SOFT_ORANGE = registerBlock("pelmet_soft_orange",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_SOFT_LIGHT_BLUE = registerBlock("pelmet_soft_light_blue",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_SOFT_BROWN = registerBlock("pelmet_soft_brown",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));

    public static final RegistryObject<Block> PELMET_SOLID_OAK = registerBlock("pelmet_solid_oak",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOD)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_SOLID_DARK_OAK = registerBlock("pelmet_solid_dark_oak",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOD)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_SOLID_SPRUCE = registerBlock("pelmet_solid_spruce",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOD)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_SOLID_BIRCH = registerBlock("pelmet_solid_birch",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOD)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_SOLID_JUNGLE = registerBlock("pelmet_solid_jungle",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOD)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_SOLID_BAMBOO = registerBlock("pelmet_solid_bamboo",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOD)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_SOLID_ACACIA = registerBlock("pelmet_solid_acacia",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOD)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_SOLID_CRIMSON = registerBlock("pelmet_solid_crimson",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOD)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_SOLID_WARPED = registerBlock("pelmet_solid_warped",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOD)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_SOLID_CHERRY = registerBlock("pelmet_solid_cherry",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOD)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_SOLID_MANGROVE = registerBlock("pelmet_solid_mangrove",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOD)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));

    public static final RegistryObject<Block> PELMET_CARVED_OAK = registerBlock("pelmet_carved_oak",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOD)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_CARVED_DARK_OAK = registerBlock("pelmet_carved_dark_oak",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOD)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_CARVED_SPRUCE = registerBlock("pelmet_carved_spruce",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOD)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_CARVED_BIRCH = registerBlock("pelmet_carved_birch",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOD)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_CARVED_JUNGLE = registerBlock("pelmet_carved_jungle",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOD)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_CARVED_BAMBOO = registerBlock("pelmet_carved_bamboo",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOD)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_CARVED_ACACIA = registerBlock("pelmet_carved_acacia",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOD)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_CARVED_CRIMSON = registerBlock("pelmet_carved_crimson",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOD)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_CARVED_WARPED = registerBlock("pelmet_carved_warped",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOD)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_CARVED_CHERRY = registerBlock("pelmet_carved_cherry",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOD)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_CARVED_MANGROVE = registerBlock("pelmet_carved_mangrove",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOD)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));

    public static final RegistryObject<Block> PELMET_ORNATE_TINSEL_GOLD_BLACK = registerBlock("pelmet_ornate_tinsel_gold_black",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_ORNATE_TINSEL_GOLD_GRAY = registerBlock("pelmet_ornate_tinsel_gold_gray",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_ORNATE_TINSEL_GOLD_LIGHT_GRAY = registerBlock("pelmet_ornate_tinsel_gold_light_gray",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_ORNATE_TINSEL_GOLD_WHITE = registerBlock("pelmet_ornate_tinsel_gold_white",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_ORNATE_TINSEL_GOLD_RED = registerBlock("pelmet_ornate_tinsel_gold_red",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_ORNATE_TINSEL_GOLD_BLUE = registerBlock("pelmet_ornate_tinsel_gold_blue",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_ORNATE_TINSEL_GOLD_GREEN = registerBlock("pelmet_ornate_tinsel_gold_green",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_ORNATE_TINSEL_GOLD_YELLOW = registerBlock("pelmet_ornate_tinsel_gold_yellow",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_ORNATE_TINSEL_GOLD_MAGENTA = registerBlock("pelmet_ornate_tinsel_gold_magenta",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_ORNATE_TINSEL_GOLD_CYAN = registerBlock("pelmet_ornate_tinsel_gold_cyan",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_ORNATE_TINSEL_GOLD_LIME = registerBlock("pelmet_ornate_tinsel_gold_lime",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_ORNATE_TINSEL_GOLD_PINK = registerBlock("pelmet_ornate_tinsel_gold_pink",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_ORNATE_TINSEL_GOLD_PURPLE = registerBlock("pelmet_ornate_tinsel_gold_purple",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_ORNATE_TINSEL_GOLD_ORANGE = registerBlock("pelmet_ornate_tinsel_gold_orange",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_ORNATE_TINSEL_GOLD_LIGHT_BLUE = registerBlock("pelmet_ornate_tinsel_gold_light_blue",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));
    public static final RegistryObject<Block> PELMET_ORNATE_TINSEL_GOLD_BROWN = registerBlock("pelmet_ornate_tinsel_gold_brown",
            () -> new TemplatePelmetBlock(BlockBehaviour.Properties.of().strength(0.8F).sound(SoundType.WOOL)
                    .pushReaction(PushReaction.DESTROY).instrument(NoteBlockInstrument.HARP)));

    //Blocks end here
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return CIItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static final Map<String, RegistryObject<Block>> BLOCK_MAP = new HashMap<>();
    static {
        BLOCKS.getEntries().forEach(entry ->
                BLOCK_MAP.put(entry.getId().getPath(), entry)
        );
    }

    public static RegistryObject<Block> getByName(String name) {
        return BLOCK_MAP.get(name);

    }
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

