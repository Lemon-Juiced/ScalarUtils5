package lemon_juice.scalar_utils.block.registry;

import lemon_juice.scalar_utils.item.ModItems;
import lemon_juice.scalar_utils.item.custom.block_item.AbstractRuneboosterBlockItem;
import lemon_juice.scalar_utils.item.custom.block_item.AbstractRunedropperBlockItem;
import lemon_juice.scalar_utils.item.custom.block_item.AbstractRuneshifterBlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static lemon_juice.scalar_utils.block.ModBlocks.BLOCKS;

public class ModBlockRegistry {

    public static <T extends Block> RegistryObject<T> registerRuneboosterBlock(String name, Supplier<T> block, int seconds) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerRuneboosterBlockItem(name, toReturn, seconds);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerRuneboosterBlockItem(String name, RegistryObject<T> block, int seconds) {
        return ModItems.ITEMS.register(name, () -> new AbstractRuneboosterBlockItem(block.get(), new Item.Properties(), seconds));
    }

    public static <T extends Block> RegistryObject<T> registerRunedropperBlock(String name, Supplier<T> block, int blocks) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerRunedropperBlockItem(name, toReturn, blocks);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerRunedropperBlockItem(String name, RegistryObject<T> block, int blocks) {
        return ModItems.ITEMS.register(name, () -> new AbstractRunedropperBlockItem(block.get(), new Item.Properties(), blocks));
    }

    public static <T extends Block> RegistryObject<T> registerRuneshifterBlock(String name, Supplier<T> block, String direction) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerRuneshifterBlockItem(name, toReturn, direction);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerRuneshifterBlockItem(String name, RegistryObject<T> block, String direction) {
        return ModItems.ITEMS.register(name, () -> new AbstractRuneshifterBlockItem(block.get(), new Item.Properties(), direction));
    }
}
