package lemon_juice.scalar_utils.block.custom.crop;

import lemon_juice.scalar_utils.item.ModItems;
import net.minecraft.world.level.ItemLike;

public class FlaxCropBlock extends AbstractBaseCropBlock {

    public FlaxCropBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.FLAX_SEEDS.get();
    }

}
