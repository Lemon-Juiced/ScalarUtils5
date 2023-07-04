package lemon_juice.scalar_utils.events;

import com.google.common.collect.ImmutableMap;
import lemon_juice.scalar_utils.ScalarUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.MissingMappingsEvent;

import javax.annotation.concurrent.Immutable;
import java.util.Map;
import java.util.function.Supplier;

@Mod.EventBusSubscriber
public class ModRemapper {
    @SubscribeEvent
    public static void fixMissingMappins(MissingMappingsEvent event) {
        Map<ResourceLocation, Supplier<Item>> itemsMap = (new ImmutableMap.Builder<ResourceLocation, Supplier<Item>>())
                .put(new ResourceLocation(ScalarUtils.MOD_ID, "necronite_ingot"), (Supplier<Item>) Items.NETHERITE_INGOT)
                .put(new ResourceLocation(ScalarUtils.MOD_ID, "necronite_nugget"), (Supplier<Item>) Items.DIAMOND)
                .put(new ResourceLocation(ScalarUtils.MOD_ID, "necronite_block"), (Supplier<Item>) Items.NETHERITE_BLOCK)
                .build();

        Map<ResourceLocation, Supplier<Block>> blocksMap = (new ImmutableMap.Builder<ResourceLocation, Supplier<Block>>())
                .put(new ResourceLocation(ScalarUtils.MOD_ID, "necronite_block"), (Supplier<Block>) Blocks.NETHERITE_BLOCK)
                .build();

        for (MissingMappingsEvent.Mapping<Item> mapping : event.getMappings(ForgeRegistries.Keys.ITEMS, ScalarUtils.MOD_ID)) {
            Supplier<Item> itemSupplier = itemsMap.get(mapping.getKey());
            if (itemSupplier != null) {
                Item item = itemSupplier.get();
                mapping.remap(item);
            }
        }

        for (MissingMappingsEvent.Mapping<Block> mapping : event.getMappings(ForgeRegistries.Keys.BLOCKS, ScalarUtils.MOD_ID)) {
            Supplier<Block> itemSupplier = blocksMap.get(mapping.getKey());
            if (itemSupplier != null) {
                Block item = itemSupplier.get();
                mapping.remap(item);
            }
        }
    }
}