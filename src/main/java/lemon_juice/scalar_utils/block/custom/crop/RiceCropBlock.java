package lemon_juice.scalar_utils.block.custom.crop;

import lemon_juice.scalar_utils.item.ModItems;
import net.minecraft.world.level.ItemLike;

public class RiceCropBlock extends AbstractBaseCropBlock {
    public RiceCropBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.RICE.get();
    }
}
