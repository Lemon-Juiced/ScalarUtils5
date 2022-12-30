package lemon_juice.scalar_utils.item.custom;

import net.minecraft.util.RandomSource;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class RuneCarvingKnifeItem extends Item {
    private final RandomSource random = RandomSource.create();

    public RuneCarvingKnifeItem(Properties properties) {
        super(properties);
    }

    @Override
    public int getMaxStackSize(ItemStack stack) {
        return 1;
    }

    @Override
    public int getMaxDamage(ItemStack stack) {
        return 64;
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack itemStack) {
        ItemStack damagedItemStack = itemStack.copy();
        if(damagedItemStack.hurt(1, random, null)){return ItemStack.EMPTY;}
        else {return damagedItemStack;}
    }
}
