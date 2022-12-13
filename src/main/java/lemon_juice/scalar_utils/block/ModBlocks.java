package lemon_juice.scalar_utils.block;

import lemon_juice.scalar_utils.ScalarUtils;
import lemon_juice.scalar_utils.block.custom.AbstractLampBlock;
import lemon_juice.scalar_utils.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ScalarUtils.MOD_ID);
    
    // Lamps
    public static final RegistryObject<Block> WHITE_LAMP = registerBlock("white_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> ORANGE_LAMP = registerBlock("orange_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> MAGENTA_LAMP = registerBlock("magenta_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> LIGHT_BLUE_LAMP = registerBlock("light_blue_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> YELLOW_LAMP = registerBlock("yellow_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> LIME_LAMP = registerBlock("lime_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> PINK_LAMP = registerBlock("pink_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> GRAY_LAMP = registerBlock("gray_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> LIGHT_GRAY_LAMP = registerBlock("light_gray_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> CYAN_LAMP = registerBlock("cyan_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> PURPLE_LAMP = registerBlock("purple_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> BLUE_LAMP = registerBlock("blue_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> BROWN_LAMP = registerBlock("brown_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> GREEN_LAMP = registerBlock("green_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> RED_LAMP = registerBlock("red_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
    public static final RegistryObject<Block> BLACK_LAMP = registerBlock("black_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));


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
