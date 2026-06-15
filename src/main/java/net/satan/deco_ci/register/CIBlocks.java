package net.satan.deco_ci.register;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import net.satan.deco_ci.block.TemplateCurtainBlock;
import net.satan.deco_ci.satans_deco_ci;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class CIBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, satans_deco_ci.MODID);
    //Blocks go here
    //curtains
    public static final RegistryObject<Block> CURTAIN_WHITE = registerBlock("curtain_white",
            () -> new TemplateCurtainBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY), false));
    public static final RegistryObject<Block> CURTAIN_ORANGE = registerBlock("curtain_orange",
            () -> new TemplateCurtainBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY), false));
    public static final RegistryObject<Block> CURTAIN_MAGENTA = registerBlock("curtain_magenta",
            () -> new TemplateCurtainBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY), false));
    public static final RegistryObject<Block> CURTAIN_LIGHT_BLUE = registerBlock("curtain_light_blue",
            () -> new TemplateCurtainBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY), false));
    public static final RegistryObject<Block> CURTAIN_YELLOW = registerBlock("curtain_yellow",
            () -> new TemplateCurtainBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY), false));
    public static final RegistryObject<Block> CURTAIN_LIME = registerBlock("curtain_lime",
            () -> new TemplateCurtainBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY), false));
    public static final RegistryObject<Block> CURTAIN_PINK = registerBlock("curtain_pink",
            () -> new TemplateCurtainBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY), false));
    public static final RegistryObject<Block> CURTAIN_GRAY = registerBlock("curtain_gray",
            () -> new TemplateCurtainBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY), false));
    public static final RegistryObject<Block> CURTAIN_LIGHT_GRAY = registerBlock("curtain_light_gray",
            () -> new TemplateCurtainBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY), false));
    public static final RegistryObject<Block> CURTAIN_CYAN = registerBlock("curtain_cyan",
            () -> new TemplateCurtainBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY), false));
    public static final RegistryObject<Block> CURTAIN_PURPLE = registerBlock("curtain_purple",
            () -> new TemplateCurtainBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY), false));
    public static final RegistryObject<Block> CURTAIN_BLUE = registerBlock("curtain_blue",
            () -> new TemplateCurtainBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY), false));
    public static final RegistryObject<Block> CURTAIN_BROWN = registerBlock("curtain_brown",
            () -> new TemplateCurtainBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY), false));
    public static final RegistryObject<Block> CURTAIN_GREEN = registerBlock("curtain_green",
            () -> new TemplateCurtainBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY), false));
    public static final RegistryObject<Block> CURTAIN_RED = registerBlock("curtain_red",
            () -> new TemplateCurtainBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY), false));
    public static final RegistryObject<Block> CURTAIN_BLACK = registerBlock("curtain_black",
            () -> new TemplateCurtainBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BARS).strength(0.8F).sound(SoundType.WOOL)
                    .noCollission().pushReaction(PushReaction.DESTROY), false));

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

