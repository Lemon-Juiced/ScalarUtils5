package lemon_juice.scalar_utils.item.custom.block_item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class AbstractRunedropperBlockItem extends BlockItem {
    private final int blocks;
    public AbstractRunedropperBlockItem(Block block, Properties properties, int blocks) {
        super(block, properties);
        this.blocks = blocks;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        if (blocks == 5) components.add(Component.translatable("basic_runedropper.tooltip"));
        else if (blocks == 10) components.add(Component.translatable("advanced_runedropper.tooltip"));
        else if (blocks == 15) components.add(Component.translatable("elite_runedropper.tooltip"));
        else if (blocks == 20) components.add(Component.translatable("ultimate_runedropper.tooltip"));
        else components.add(Component.translatable("transcendent_runedropper.tooltip"));

        super.appendHoverText(stack, level, components, flag);
    }
}
