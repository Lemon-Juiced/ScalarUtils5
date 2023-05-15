package lemon_juice.scalar_utils.tile.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.level.block.entity.BarrelBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

public class RunicVoidTileEntity extends BarrelBlockEntity {
    public RunicVoidTileEntity(BlockPos pos, BlockState state) {
        super(pos, state);
    }

    @Nullable
    @Override
    public Component getCustomName() {
        return Component.translatable("runic_void.title");
    }

    @Override
    public int getContainerSize() {
        return 54;
    }

    @Override
    protected AbstractContainerMenu createMenu(int i, Inventory inventory) {
        return ChestMenu.sixRows(i, inventory, this);
    }
}
