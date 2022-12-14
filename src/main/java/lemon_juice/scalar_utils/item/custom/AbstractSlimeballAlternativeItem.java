package lemon_juice.scalar_utils.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class AbstractSlimeballAlternativeItem extends Item {

    public AbstractSlimeballAlternativeItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.translatable("slime_ball_alternative.tooltip").withStyle(ChatFormatting.GREEN));
        super.appendHoverText(stack, level, components, flag);
    }
}
