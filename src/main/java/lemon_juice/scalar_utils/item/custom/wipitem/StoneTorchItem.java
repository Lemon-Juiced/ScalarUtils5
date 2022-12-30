package lemon_juice.scalar_utils.item.custom.wipitem;

import net.minecraft.ChatFormatting;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class StoneTorchItem extends StandingAndWallBlockItem {
    public StoneTorchItem(Block standingBlock, Block wallBlock, Properties properties, Direction direction) {
        super(standingBlock, wallBlock, properties, direction);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.translatable("wip.tooltip").withStyle(ChatFormatting.BOLD));
    }
}
