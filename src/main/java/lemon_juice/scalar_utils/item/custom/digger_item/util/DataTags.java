package lemon_juice.scalar_utils.item.custom.digger_item.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class DataTags {
    public static final TagKey<Block> WITH_HAMMER = BlockTags.create(new ResourceLocation("minecraft:mineable/tunneler"));
}
