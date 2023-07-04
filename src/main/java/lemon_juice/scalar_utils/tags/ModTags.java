package lemon_juice.scalar_utils.tags;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

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
}
