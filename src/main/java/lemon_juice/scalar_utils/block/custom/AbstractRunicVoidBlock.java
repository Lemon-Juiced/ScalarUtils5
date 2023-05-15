package lemon_juice.scalar_utils.block.custom;

import lemon_juice.scalar_utils.tile.entity.RunicVoidTileEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.BarrelBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class AbstractRunicVoidBlock extends BarrelBlock {
    public AbstractRunicVoidBlock(Properties properties) {
        super(properties);
    }

    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new RunicVoidTileEntity(pos, state);
    }
}
