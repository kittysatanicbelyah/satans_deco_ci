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

