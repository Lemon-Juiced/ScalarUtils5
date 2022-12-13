package lemon_juice.scalar_utils.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import org.jetbrains.annotations.Nullable;

public class AbstractTinyCoalItem extends Item {

    public AbstractTinyCoalItem(Properties properties) {
        super(properties);
    }

    //Set Burn Time To 200 Ticks (1 Second)
    @Override
    public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
        return 200;
    }
}
