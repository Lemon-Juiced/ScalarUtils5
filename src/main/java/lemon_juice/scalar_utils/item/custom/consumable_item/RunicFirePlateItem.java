package lemon_juice.scalar_utils.item.custom.consumable_item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.FireChargeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class RunicFirePlateItem extends FireChargeItem {
    public RunicFirePlateItem(Properties properties) {
        super(properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.translatable("tooltip.scalar_utils.runic_fire_plate"));
    }

    @Override
    public int getMaxStackSize(ItemStack stack) {
        return 16;
    }
}
