package lemon_juice.scalar_utils.item.custom.decanter_item;

import net.minecraft.world.item.FlintAndSteelItem;
import net.minecraft.world.item.ItemStack;

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
}
