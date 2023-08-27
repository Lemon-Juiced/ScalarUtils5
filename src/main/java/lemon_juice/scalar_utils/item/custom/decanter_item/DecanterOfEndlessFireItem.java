package lemon_juice.scalar_utils.item.custom.decanter_item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.FlintAndSteelItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class DecanterOfEndlessFireItem extends FlintAndSteelItem {
    public DecanterOfEndlessFireItem(Properties properties) {
        super(properties);
    }

    @Override
    public int getUseDuration(ItemStack itemStack) {
        return -1;
    }

    @Override
    public int getMaxStackSize(ItemStack stack) {
        return 1;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.translatable("tooltip.scalar_utils.runic_fire_plate"));
    }
}
