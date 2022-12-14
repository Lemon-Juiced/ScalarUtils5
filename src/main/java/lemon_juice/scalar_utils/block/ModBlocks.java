package lemon_juice.scalar_utils.block;

import lemon_juice.scalar_utils.ScalarUtils;
import lemon_juice.scalar_utils.block.crop.FlaxCropBlock;
import lemon_juice.scalar_utils.block.crop.RiceCropBlock;
import lemon_juice.scalar_utils.block.custom.AbstractLampBlock;
import lemon_juice.scalar_utils.block.custom.AbstractRuneboosterBlock;
import lemon_juice.scalar_utils.block.custom.AbstractRunedropperBlock;
import lemon_juice.scalar_utils.item.ModItems;
import lemon_juice.scalar_utils.item.custom.blockitem.AbstractRuneboosterBlockItem;
import lemon_juice.scalar_utils.item.custom.blockitem.AbstractRunedropperBlockItem;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ScalarUtils.MOD_ID);

    // Clear Glass
    public static final RegistryObject<Block> CLEAR_GLASS = registerBlock("clear_glass", () -> new GlassBlock(BlockBehaviour.Properties.of(Material.GLASS).strength(0.3F).noOcclusion()));
    public static final RegistryObject<Block> CLEAR_GLASS_PANE = registerBlock("clear_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.of(Material.GLASS).strength(0.3F).noOcclusion()));

    // Flax Crop
    public static final RegistryObject<Block> FLAX_CROP = registerBlockWithoutBlockItem("flax_crop", () -> new FlaxCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

    // Lamps
    public static final RegistryObject<Block> WHITE_LAMP = registerBlock("white_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> LIGHT_GRAY_LAMP = registerBlock("light_gray_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> GRAY_LAMP = registerBlock("gray_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> BLACK_LAMP = registerBlock("black_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> BROWN_LAMP = registerBlock("brown_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> RED_LAMP = registerBlock("red_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> ORANGE_LAMP = registerBlock("orange_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> YELLOW_LAMP = registerBlock("yellow_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> LIME_LAMP = registerBlock("lime_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> GREEN_LAMP = registerBlock("green_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> CYAN_LAMP = registerBlock("cyan_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> LIGHT_BLUE_LAMP = registerBlock("light_blue_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> BLUE_LAMP = registerBlock("blue_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> PURPLE_LAMP = registerBlock("purple_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> MAGENTA_LAMP = registerBlock("magenta_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> PINK_LAMP = registerBlock("pink_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));

    // Reinforced Blocks
    public static final RegistryObject<Block> REINFORCED_GLASS = registerBlock("reinforced_glass", () -> new GlassBlock(BlockBehaviour.Properties.of(Material.GLASS).strength(50.0F, 3600000.0F).noOcclusion()));
    public static final RegistryObject<Block> REINFORCED_OBSIDIAN = registerBlock("reinforced_obsidian", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(50.0F, 3600000.0F)));

    // Rice Crop
    public static final RegistryObject<Block> RICE_CROP = registerBlockWithoutBlockItem("rice_crop", () -> new RiceCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

    // Runebooster
    public static final RegistryObject<Block> BASIC_RUNEBOOSTER = registerRuneboosterBlock("basic_runebooster", () -> new AbstractRuneboosterBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F), 5), 5);
    public static final RegistryObject<Block> ADVANCED_RUNEBOOSTER = registerRuneboosterBlock("advanced_runebooster", () -> new AbstractRuneboosterBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F), 10), 10);
    public static final RegistryObject<Block> ELITE_RUNEBOOSTER = registerRuneboosterBlock("elite_runebooster", () -> new AbstractRuneboosterBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F), 15), 15);
    public static final RegistryObject<Block> ULTIMATE_RUNEBOOSTER = registerRuneboosterBlock("ultimate_runebooster", () -> new AbstractRuneboosterBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F), 20), 20);

    // Runedropper
    public static final RegistryObject<Block> BASIC_RUNEDROPPER = registerRunedropperBlock("basic_runedropper", () -> new AbstractRunedropperBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F), 5f), 5);
    public static final RegistryObject<Block> ADVANCED_RUNEDROPPER = registerRunedropperBlock("advanced_runedropper", () -> new AbstractRunedropperBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F), 10f), 10);
    public static final RegistryObject<Block> ELITE_RUNEDROPPER= registerRunedropperBlock("elite_runedropper", () -> new AbstractRunedropperBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F), 15f), 15);
    public static final RegistryObject<Block> ULTIMATE_RUNEDROPPER = registerRunedropperBlock("ultimate_runedropper", () -> new AbstractRunedropperBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F), 20), 20);

    // Stone Torch
    public static final RegistryObject<Block> STONE_TORCH = registerBlockWithoutBlockItem("stone_torch", () -> new TorchBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().instabreak().lightLevel((p_50886_) -> {
        return 14;
    }).sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> STONE_WALL_TORCH = registerBlockWithoutBlockItem("stone_wall_torch", () -> new WallTorchBlock(BlockBehaviour.Properties.of(Material.DECORATION).noCollission().instabreak().lightLevel((p_50886_) -> {
        return 14;
    }).sound(SoundType.WOOD), ParticleTypes.FLAME)); //Omits dropsLike method from Minecraft's WALL_TORCH (Fixed by Loot Table?)

    /**************************** Specific Registry ****************************/
    private static <T extends Block> RegistryObject<T> registerRuneboosterBlock(String name, Supplier<T> block, int seconds) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerRuneboosterBlockItem(name, toReturn, seconds);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerRuneboosterBlockItem(String name, RegistryObject<T> block, int seconds) {
        return ModItems.ITEMS.register(name, () -> new AbstractRuneboosterBlockItem(block.get(), new Item.Properties(), seconds));
    }

    private static <T extends Block> RegistryObject<T> registerRunedropperBlock(String name, Supplier<T> block, int seconds) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerRunedropperBlockItem(name, toReturn, seconds);
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
