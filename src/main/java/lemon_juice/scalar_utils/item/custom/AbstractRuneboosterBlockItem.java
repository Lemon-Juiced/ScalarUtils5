package lemon_juice.scalar_utils.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class AbstractRuneboosterBlockItem extends BlockItem {
    private final int seconds;
    public AbstractRuneboosterBlockItem(Block block, Properties properties, int seconds) {
        super(block, properties);
        this.seconds = seconds;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        if (seconds == 5) components.add(Component.translatable("basic_runebooster.tooltip"));
        else if (seconds == 10) components.add(Component.translatable("advanced_runebooster.tooltip"));
        else if (seconds == 15) components.add(Component.translatable("elite_runebooster.tooltip"));
        else components.add(Component.translatable("ultimate_runebooster.tooltip"));

        super.appendHoverText(stack, level, components, flag);
    }
}
