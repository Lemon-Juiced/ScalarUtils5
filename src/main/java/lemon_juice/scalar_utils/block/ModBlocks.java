package lemon_juice.scalar_utils.block;

import lemon_juice.scalar_utils.ScalarUtils;
import lemon_juice.scalar_utils.block.custom.crop.FlaxCropBlock;
import lemon_juice.scalar_utils.block.custom.crop.RiceCropBlock;
import lemon_juice.scalar_utils.block.custom.lighting.torch.torch_block.AbstractRedstoneTorchBlock;
import lemon_juice.scalar_utils.block.custom.lighting.torch.torch_block.AbstractTorchBlock;
import lemon_juice.scalar_utils.block.custom.lighting.torch.torch_block.TinyRedstoneTorchBlock;
import lemon_juice.scalar_utils.block.custom.lighting.torch.wall_torch_block.AbstractRedstoneWallTorchBlock;
import lemon_juice.scalar_utils.block.custom.lighting.torch.wall_torch_block.AbstractWallTorchBlock;
import lemon_juice.scalar_utils.block.custom.lighting.torch.wall_torch_block.TinyRedstoneWallTorchBlock;
import lemon_juice.scalar_utils.block.custom.lighting.torch.torch_block.TinyTorchBlock;
import lemon_juice.scalar_utils.block.custom.lighting.torch.wall_torch_block.TinyWallTorchBlock;
import lemon_juice.scalar_utils.item.ModItems;
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

import static lemon_juice.scalar_utils.block.registry.builder.AbstractRuneBlockBuilder.registerAllRuneBlocks;
import static lemon_juice.scalar_utils.block.registry.builder.LampBlockBuilder.lampBlockBuilder;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ScalarUtils.MOD_ID);

    // Clear Glass
    public static final RegistryObject<Block> CLEAR_GLASS = registerBlock("clear_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).strength(0.3F).noOcclusion()));
    public static final RegistryObject<Block> CLEAR_GLASS_PANE = registerBlock("clear_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS_PANE).strength(0.3F).noOcclusion()));

    // Crops
    public static final RegistryObject<Block> FLAX_CROP = registerBlockWithoutBlockItem("flax_crop", () -> new FlaxCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));
    public static final RegistryObject<Block> RICE_CROP = registerBlockWithoutBlockItem("rice_crop", () -> new RiceCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

    // Reinforced Blocks
    public static final RegistryObject<Block> REINFORCED_GLASS = registerBlock("reinforced_glass", () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).strength(50.0F, 3600000.0F).noOcclusion()));
    public static final RegistryObject<Block> REINFORCED_GLASS_PANE = registerBlock("reinforced_glass_pane", () -> new IronBarsBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).strength(50.0F, 3600000.0F).noOcclusion()));
    public static final RegistryObject<Block> REINFORCED_OBSIDIAN = registerBlock("reinforced_obsidian", () -> new Block(BlockBehaviour.Properties.copy(Blocks.OBSIDIAN).requiresCorrectToolForDrops().strength(50.0F, 3600000.0F).requiresCorrectToolForDrops()));

    /* Torches */
    // Tiny Torches
    // Tiny Torch
    public static final RegistryObject<Block> TINY_TORCH = registerBlockWithoutBlockItem("tiny_torch", () -> new TinyTorchBlock(BlockBehaviour.Properties.copy(Blocks.TORCH).noCollission().instabreak().lightLevel((p_50886_) -> {return 12;}).sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> TINY_WALL_TORCH = registerBlockWithoutBlockItem("tiny_wall_torch", () -> new TinyWallTorchBlock(BlockBehaviour.Properties.copy(Blocks.TORCH).noCollission().instabreak().lightLevel((p_50886_) -> {return 12;}).sound(SoundType.WOOD), ParticleTypes.FLAME));
    // Tiny Redstone Torch
    public static final RegistryObject<Block> TINY_REDSTONE_TORCH = registerBlockWithoutBlockItem("tiny_redstone_torch", () -> new TinyRedstoneTorchBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_TORCH).noCollission().instabreak().lightLevel((p_50886_) -> {return 5;}).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> TINY_REDSTONE_WALL_TORCH = registerBlockWithoutBlockItem("tiny_redstone_wall_torch", () -> new TinyRedstoneWallTorchBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_TORCH).noCollission().instabreak().lightLevel((p_50886_) -> {return 5;}).sound(SoundType.WOOD)));
    // Tiny Soul Torch
    public static final RegistryObject<Block> TINY_SOUL_TORCH = registerBlockWithoutBlockItem("tiny_soul_torch", () -> new TinyTorchBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_TORCH).noCollission().instabreak().lightLevel((p_50886_) -> {return 8;}).sound(SoundType.WOOD), ParticleTypes.SOUL_FIRE_FLAME));
    public static final RegistryObject<Block> TINY_SOUL_WALL_TORCH = registerBlockWithoutBlockItem("tiny_soul_wall_torch", () -> new TinyWallTorchBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_TORCH).noCollission().instabreak().lightLevel((p_50886_) -> {return 8;}).sound(SoundType.WOOD), ParticleTypes.SOUL_FIRE_FLAME));
    // Stone Torches
    // Stone Torch
    public static final RegistryObject<Block> STONE_TORCH = registerBlockWithoutBlockItem("stone_torch", () -> new AbstractTorchBlock(BlockBehaviour.Properties.copy(Blocks.TORCH).noCollission().instabreak().lightLevel((p_50886_) -> {return 14;}).sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> STONE_WALL_TORCH = registerBlockWithoutBlockItem("stone_wall_torch", () -> new AbstractWallTorchBlock(BlockBehaviour.Properties.copy(Blocks.TORCH).noCollission().instabreak().lightLevel((p_50886_) -> {return 14;}).sound(SoundType.WOOD), ParticleTypes.FLAME));
    // Redstone Stone Torch
    public static final RegistryObject<Block> REDSTONE_STONE_TORCH = registerBlockWithoutBlockItem("redstone_stone_torch", () -> new AbstractRedstoneTorchBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_TORCH).noCollission().instabreak().lightLevel((p_50886_) -> {return 7;}).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> REDSTONE_STONE_WALL_TORCH = registerBlockWithoutBlockItem("redstone_stone_wall_torch", () -> new AbstractRedstoneWallTorchBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_TORCH).noCollission().instabreak().lightLevel((p_50886_) -> {return 7;}).sound(SoundType.WOOD)));
    // Soul Stone Torch
    public static final RegistryObject<Block> SOUL_STONE_TORCH = registerBlockWithoutBlockItem("soul_stone_torch", () -> new AbstractTorchBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_TORCH).noCollission().instabreak().lightLevel((p_50886_) -> {return 10;}).sound(SoundType.WOOD), ParticleTypes.SOUL_FIRE_FLAME));
    public static final RegistryObject<Block> SOUL_STONE_WALL_TORCH = registerBlockWithoutBlockItem("soul_stone_wall_torch", () -> new AbstractWallTorchBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_TORCH).noCollission().instabreak().lightLevel((p_50886_) -> {return 10;}).sound(SoundType.WOOD), ParticleTypes.SOUL_FIRE_FLAME));
    // Tiny Stone Torches
    // Tiny Stone Torch
    public static final RegistryObject<Block> TINY_STONE_TORCH = registerBlockWithoutBlockItem("tiny_stone_torch", () -> new TinyTorchBlock(BlockBehaviour.Properties.copy(Blocks.TORCH).noCollission().instabreak().lightLevel((p_50886_) -> {return 12;}).sound(SoundType.WOOD), ParticleTypes.FLAME));
    public static final RegistryObject<Block> TINY_STONE_WALL_TORCH = registerBlockWithoutBlockItem("tiny_stone_wall_torch", () -> new TinyWallTorchBlock(BlockBehaviour.Properties.copy(Blocks.TORCH).noCollission().instabreak().lightLevel((p_50886_) -> {return 12;}).sound(SoundType.WOOD), ParticleTypes.FLAME));
    // Tiny Redstone Stone Torch
    public static final RegistryObject<Block> TINY_REDSTONE_STONE_TORCH = registerBlockWithoutBlockItem("tiny_redstone_stone_torch", () -> new TinyRedstoneTorchBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_TORCH).noCollission().instabreak().lightLevel((p_50886_) -> {return 5;}).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> TINY_REDSTONE_STONE_WALL_TORCH = registerBlockWithoutBlockItem("tiny_redstone_stone_wall_torch", () -> new TinyRedstoneWallTorchBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_TORCH).noCollission().instabreak().lightLevel((p_50886_) -> {return 5;}).sound(SoundType.WOOD)));
    // Tiny Soul Stone Torch
    public static final RegistryObject<Block> TINY_SOUL_STONE_TORCH = registerBlockWithoutBlockItem("tiny_soul_stone_torch", () -> new TinyTorchBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_TORCH).noCollission().instabreak().lightLevel((p_50886_) -> {return 8;}).sound(SoundType.WOOD), ParticleTypes.SOUL_FIRE_FLAME));
    public static final RegistryObject<Block> TINY_SOUL_STONE_WALL_TORCH = registerBlockWithoutBlockItem("tiny_soul_stone_wall_torch", () -> new TinyWallTorchBlock(BlockBehaviour.Properties.copy(Blocks.SOUL_TORCH).noCollission().instabreak().lightLevel((p_50886_) -> {return 8;}).sound(SoundType.WOOD), ParticleTypes.SOUL_FIRE_FLAME));

    /******************************** Registry ********************************/
    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    public static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        // Register from outside ModBlocks
        registerAllRuneBlocks();
        lampBlockBuilder();

        // Register from ModBlocks
        BLOCKS.register(eventBus);
    }
}
