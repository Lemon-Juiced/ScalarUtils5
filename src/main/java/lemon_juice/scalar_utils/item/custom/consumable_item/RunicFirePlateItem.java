package lemon_juice.scalar_utils.item.custom.consumable_item;

import net.minecraft.world.item.FireChargeItem;
import net.minecraft.world.item.ItemStack;

public class RunicFirePlateItem extends FireChargeItem {
    public RunicFirePlateItem(Properties properties) {
        super(properties);
    }

    @Override
    public int getMaxStackSize(ItemStack stack) {
        return 1;
    }
}
