package lemon_juice.scalar_utils.tile;

import lemon_juice.scalar_utils.ScalarUtils;
import lemon_juice.scalar_utils.tile.entity.RunicVoidTileEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ScalarUtils.MOD_ID);

    public static final RegistryObject<BlockEntityType<RunicVoidTileEntity>> RUNIC_VOID_TILE_ENTITY = register("runic_void", () -> BlockEntityType.Builder.of(RunicVoidTileEntity::new, ForgeRegistries.BLOCKS.getValue(new ResourceLocation(ScalarUtils.MOD_ID, "runic_void"))).build(null));


    private static <T extends BlockEntity> RegistryObject<BlockEntityType<T>> register(String registryName, Supplier<BlockEntityType<T>> tile) {
        return BLOCK_ENTITIES.register(registryName, tile);
    }
}
