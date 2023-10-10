package lemon_juice.scalar_utils.tag;

import lemon_juice.scalar_utils.ScalarUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static void init() {
        Items.init();
    }

    private ModTags() {}

    public static class Items {
        private static void init() {}
        private Items() {}

        public static final TagKey<Item> INGOTS_NECRONITE = forgeTag("ingots/necronite");

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Blocks {
        //public static final TagKey<Block> NEEDS_NECRONITE_TOOL = tag("needs_necronite_tool");
        public static final TagKey<Block> NEEDS_NECRONITE_TOOL = forgeTag("needs_necronite_tool");
        public static final TagKey<Block> WITH_HAMMER = BlockTags.create(new ResourceLocation("minecraft:mineable/tunneler"));

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(ScalarUtils.MOD_ID, name));
        }
        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }
}
