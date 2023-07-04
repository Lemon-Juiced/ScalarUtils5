package lemon_juice.scalar_utils.block;

import lemon_juice.scalar_utils.ScalarUtils;
import lemon_juice.scalar_utils.block.crop.FlaxCropBlock;
import lemon_juice.scalar_utils.block.crop.RiceCropBlock;
import lemon_juice.scalar_utils.block.custom.*;
import lemon_juice.scalar_utils.block.torches.TinyRedstoneTorchBlock;
import lemon_juice.scalar_utils.block.torches.TinyRedstoneWallTorchBlock;
import lemon_juice.scalar_utils.block.torches.TinyTorchBlock;
import lemon_juice.scalar_utils.block.torches.TinyWallTorchBlock;
import lemon_juice.scalar_utils.item.ModItems;
import lemon_juice.scalar_utils.item.custom.block_item.AbstractRuneboosterBlockItem;
import lemon_juice.scalar_utils.item.custom.block_item.AbstractRunedropperBlockItem;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ScalarUtils.MOD_ID);

    // Clear Glass
    public static final RegistryObject<Block> CLEAR_GLASS = registerBlock("clear_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).strength(0.3F).noOcclusion()));
    public static final RegistryObject<Block> CLEAR_GLASS_PANE = registerBlock("clear_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS_PANE).strength(0.3F).noOcclusion()));

    // Crops
    public static final RegistryObject<Block> FLAX_CROP = registerBlockWithoutBlockItem("flax_crop", () -> new FlaxCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> RICE_CROP = registerBlockWithoutBlockItem("rice_crop", () -> new RiceCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

    // Lamps
    public static final RegistryObject<Block> WHITE_LAMP = registerBlock("white_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> LIGHT_GRAY_LAMP = registerBlock("light_gray_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> GRAY_LAMP = registerBlock("gray_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> BLACK_LAMP = registerBlock("black_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> BROWN_LAMP = registerBlock("brown_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> RED_LAMP = registerBlock("red_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> ORANGE_LAMP = registerBlock("orange_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> YELLOW_LAMP = registerBlock("yellow_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> LIME_LAMP = registerBlock("lime_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> GREEN_LAMP = registerBlock("green_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> CYAN_LAMP = registerBlock("cyan_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> LIGHT_BLUE_LAMP = registerBlock("light_blue_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> BLUE_LAMP = registerBlock("blue_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> PURPLE_LAMP = registerBlock("purple_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> MAGENTA_LAMP = registerBlock("magenta_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> PINK_LAMP = registerBlock("pink_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> RAINBOW_LAMP = registerBlock("rainbow_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));

    // Reinforced Blocks
    public static final RegistryObject<Block> REINFORCED_GLASS = registerBlock("reinforced_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).strength(50.0F, 3600000.0F).noOcclusion()));
    public static final RegistryObject<Block> REINFORCED_GLASS_PANE = registerBlock("reinforced_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).strength(50.0F, 3600000.0F).noOcclusion()));
    public static final RegistryObject<Block> REINFORCED_OBSIDIAN = registerBlock("reinforced_obsidian", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).requiresCorrectToolForDrops().strength(50.0F, 3600000.0F)));

    // Runebooster
    public static final RegistryObject<Block> BASIC_RUNEBOOSTER = registerRuneboosterBlock("basic_runebooster", () -> new AbstractRuneboosterBlock(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F), 5), 5);
    public static final RegistryObject<Block> ADVANCED_RUNEBOOSTER = registerRuneboosterBlock("advanced_runebooster", () -> new AbstractRuneboosterBlock(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F), 10), 10);
    public static final RegistryObject<Block> ELITE_RUNEBOOSTER = registerRuneboosterBlock("elite_runebooster", () -> new AbstractRuneboosterBlock(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F), 15), 15);
    public static final RegistryObject<Block> ULTIMATE_RUNEBOOSTER = registerRuneboosterBlock("ultimate_runebooster", () -> new AbstractRuneboosterBlock(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F), 20), 20);
    public static final RegistryObject<Block> TRANSCENDENT_RUNEBOOSTER = registerRuneboosterBlock("transcendent_runebooster", () -> new AbstractRuneboosterBlock(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F), 1000), 1000);

    // Runedropper
    public static final RegistryObject<Block> BASIC_RUNEDROPPER = registerRunedropperBlock("basic_runedropper", () -> new AbstractRunedropperBlock(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F), -1f), 5);
    public static final RegistryObject<Block> ADVANCED_RUNEDROPPER = registerRunedropperBlock("advanced_runedropper", () -> new AbstractRunedropperBlock(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F), 10f), 10);
    public static final RegistryObject<Block> ELITE_RUNEDROPPER= registerRunedropperBlock("elite_runedropper", () -> new AbstractRunedropperBlock(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F), 15f), 15);
    public static final RegistryObject<Block> ULTIMATE_RUNEDROPPER = registerRunedropperBlock("ultimate_runedropper", () -> new AbstractRunedropperBlock(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F), 20), 20);
    public static final RegistryObject<Block> TRANSCENDENT_RUNEDROPPER = registerRunedropperBlock("transcendent_runedropper", () -> new AbstractRunedropperBlock(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F), 1000), 1000);

    /* Torches */
    // Redstone Stone Torch
    public static final RegistryObject<Block> REDSTONE_STONE_TORCH = registerBlockWithoutBlockItem("redstone_stone_torch", () -> new RedstoneTorchBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_TORCH).noCollission().instabreak().lightLevel((p_50886_) -> {return 7;}).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> REDSTONE_STONE_WALL_TORCH = registerBlockWithoutBlockItem("redstone_stone_wall_torch", () -> new RedstoneWallTorchBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_TORCH).noCollission().instabreak().lightLevel((p_50886_) -> {return 7;}).sound(SoundType.WOOD)));

    // Soul Stone Torch
    public static final RegistryObject<Block> SOUL_STONE_TORCH = registerBlockWithoutBlockItem("soul_stone_torch", () -> new TorchBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_TORCH).noCollission().instabreak().lightLevel((p_50886_) -> {return 10;}).sound(SoundType.WOOD), ParticleTypes.SOUL_FIRE_FLAME));
    public static final RegistryObject<Block> SOUL_STONE_WALL_TORCH = registerBlockWithoutBlockItem("soul_stone_wall_torch", () -> new WallTorchBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_TORCH).noCollission().instabreak().lightLevel((p_50886_) -> {return 10;}).sound(SoundType.WOOD), ParticleTypes.SOUL_FIRE_FLAME));

    // Stone Torch
    public static final RegistryObject<Block> STONE_TORCH = registerBlockWithoutBlockItem("stone_torch", () -> new TorchBlock(BlockBehaviour.Properties.copy(Blocks.TORCH).noCollission().instabreak().lightLevel((p_50886_) -> {return 14;}).sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> STONE_WALL_TORCH = registerBlockWithoutBlockItem("stone_wall_torch", () -> new WallTorchBlock(BlockBehaviour.Properties.copy(Blocks.TORCH).noCollission().instabreak().lightLevel((p_50886_) -> {return 14;}).sound(SoundType.WOOD), ParticleTypes.FLAME));

    // Tiny Redstone Stone Torch
    public static final RegistryObject<Block> TINY_REDSTONE_STONE_TORCH = registerBlockWithoutBlockItem("tiny_redstone_stone_torch", () -> new TinyRedstoneTorchBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_TORCH).noCollission().instabreak().lightLevel((p_50886_) -> {return 5;}).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> TINY_REDSTONE_STONE_WALL_TORCH = registerBlockWithoutBlockItem("tiny_redstone_stone_wall_torch", () -> new TinyRedstoneWallTorchBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_TORCH).noCollission().instabreak().lightLevel((p_50886_) -> {return 5;}).sound(SoundType.WOOD)));

    // Tiny Redstone Torch
    public static final RegistryObject<Block> TINY_REDSTONE_TORCH = registerBlockWithoutBlockItem("tiny_redstone_torch", () -> new TinyRedstoneTorchBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_TORCH).noCollission().instabreak().lightLevel((p_50886_) -> {return 5;}).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> TINY_REDSTONE_WALL_TORCH = registerBlockWithoutBlockItem("tiny_redstone_wall_torch", () -> new TinyRedstoneWallTorchBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_TORCH).noCollission().instabreak().lightLevel((p_50886_) -> {return 5;}).sound(SoundType.WOOD)));

    // Tiny Soul Stone Torch
    public static final RegistryObject<Block> TINY_SOUL_STONE_TORCH = registerBlockWithoutBlockItem("tiny_soul_stone_torch", () -> new TinyTorchBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_TORCH).noCollission().instabreak().lightLevel((p_50886_) -> {return 8;}).sound(SoundType.WOOD), ParticleTypes.SOUL_FIRE_FLAME));
    public static final RegistryObject<Block> TINY_SOUL_STONE_WALL_TORCH = registerBlockWithoutBlockItem("tiny_soul_stone_wall_torch", () -> new TinyWallTorchBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_TORCH).noCollission().instabreak().lightLevel((p_50886_) -> {return 8;}).sound(SoundType.WOOD), ParticleTypes.SOUL_FIRE_FLAME));

    // Tiny Stone Torch
    public static final RegistryObject<Block> TINY_STONE_TORCH = registerBlockWithoutBlockItem("tiny_stone_torch", () -> new TinyTorchBlock(BlockBehaviour.Properties.copy(Blocks.TORCH).noCollission().instabreak().lightLevel((p_50886_) -> {return 12;}).sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> TINY_STONE_WALL_TORCH = registerBlockWithoutBlockItem("tiny_stone_wall_torch", () -> new TinyWallTorchBlock(BlockBehaviour.Properties.copy(Blocks.TORCH).noCollission().instabreak().lightLevel((p_50886_) -> {return 12;}).sound(SoundType.WOOD), ParticleTypes.FLAME));

    // Tiny Soul Torch
    public static final RegistryObject<Block> TINY_SOUL_TORCH = registerBlockWithoutBlockItem("tiny_soul_torch", () -> new TinyTorchBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_TORCH).noCollission().instabreak().lightLevel((p_50886_) -> {return 8;}).sound(SoundType.WOOD), ParticleTypes.SOUL_FIRE_FLAME));
    public static final RegistryObject<Block> TINY_SOUL_WALL_TORCH = registerBlockWithoutBlockItem("tiny_soul_wall_torch", () -> new TinyWallTorchBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_TORCH).noCollission().instabreak().lightLevel((p_50886_) -> {return 8;}).sound(SoundType.WOOD), ParticleTypes.SOUL_FIRE_FLAME));

    // Tiny Torch
    public static final RegistryObject<Block> TINY_TORCH = registerBlockWithoutBlockItem("tiny_torch", () -> new TinyTorchBlock(BlockBehaviour.Properties.copy(Blocks.TORCH).noCollission().instabreak().lightLevel((p_50886_) -> {return 12;}).sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> TINY_WALL_TORCH = registerBlockWithoutBlockItem("tiny_wall_torch", () -> new TinyWallTorchBlock(BlockBehaviour.Properties.copy(Blocks.TORCH).noCollission().instabreak().lightLevel((p_50886_) -> {return 12;}).sound(SoundType.WOOD), ParticleTypes.FLAME));

    /**************************** Specific Registry ****************************/
    private static <T extends Block> RegistryObject<T> registerRuneboosterBlock(String name, Supplier<T> block, int seconds) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerRuneboosterBlockItem(name, toReturn, seconds);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerRuneboosterBlockItem(String name, RegistryObject<T> block, int seconds) {
        return ModItems.ITEMS.register(name, () -> new AbstractRuneboosterBlockItem(block.get(), new Item.Properties(), seconds));
    }

    private static <T extends Block> RegistryObject<T> registerRunedropperBlock(String name, Supplier<T> block, int blocks) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerRunedropperBlockItem(name, toReturn, blocks);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerRunedropperBlockItem(String name, RegistryObject<T> block, int blocks) {
        return ModItems.ITEMS.register(name, () -> new AbstractRunedropperBlockItem(block.get(), new Item.Properties(), blocks));
    }

    /******************************** Registry ********************************/
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
