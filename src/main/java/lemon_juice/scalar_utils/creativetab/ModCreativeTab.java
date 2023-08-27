package lemon_juice.scalar_utils.creativetab;

import lemon_juice.scalar_utils.ScalarUtils;
import lemon_juice.scalar_utils.block.ModBlocks;
import lemon_juice.scalar_utils.block.custom.AbstractLampBlock;
import lemon_juice.scalar_utils.block.custom.AbstractRuneboosterBlock;
import lemon_juice.scalar_utils.block.custom.AbstractRunedropperBlock;
import lemon_juice.scalar_utils.block.custom.AbstractRuneshifterBlock;
import lemon_juice.scalar_utils.creativetab.util.CreativeTabUtils;
import lemon_juice.scalar_utils.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ScalarUtils.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SCALAR_UTILS_AGRICULTURE_TAB = CREATIVE_MODE_TABS.register("scalar_utils_agriculture", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.scalar_utils_agriculture"))
            .icon(() -> new ItemStack(ModItems.FLOUR.get()))
            .build());

    public static final RegistryObject<CreativeModeTab> SCALAR_UTILS_ARSENAL_TAB = CREATIVE_MODE_TABS.register("scalar_utils_arsenal", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.scalar_utils_arsenal"))
            .icon(() -> new ItemStack(ModItems.RUNIC_ANGEL_RING.get()))
            .build());

    public static final RegistryObject<CreativeModeTab> SCALAR_UTILS_BLOCKS_TAB = CREATIVE_MODE_TABS.register("scalar_utils_blocks", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.scalar_utils_blocks"))
            .icon(() -> new ItemStack(ModBlocks.REINFORCED_OBSIDIAN.get()))
            .build());

    public static final RegistryObject<CreativeModeTab> SCALAR_UTILS_ITEMS_TAB = CREATIVE_MODE_TABS.register("scalar_utils_items", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.scalar_utils_items"))
            .icon(() -> new ItemStack(ModItems.RUNIC_PLATE.get()))
            .build());

    public static final RegistryObject<CreativeModeTab> SCALAR_UTILS_LIGHTING_TAB = CREATIVE_MODE_TABS.register("scalar_utils_lighting", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.scalar_utils_lighting"))
            .icon(() -> new ItemStack(CreativeTabUtils.getRainbowLampItem()))
            .build());

    public static void registerTabs(BuildCreativeModeTabContentsEvent event){
        if(event.getTab() == SCALAR_UTILS_AGRICULTURE_TAB.get()){
            event.accept(ModItems.FLOUR.get());
            event.accept(ModItems.CARROT_SEEDS.get());
            event.accept(ModItems.FLAX_SEEDS.get());
            event.accept(ModItems.POTATO_SEEDS.get());
            event.accept(ModItems.RICE.get());
        }

        if(event.getTab() == SCALAR_UTILS_ARSENAL_TAB.get()){
            event.accept(ModItems.GLASS_CUTTER.get());
            event.accept(ModItems.RUNECARVING_KNIFE.get());

            event.accept(ModItems.RUNIC_BOOSTER_PLATE.get());
            event.accept(ModItems.RUNIC_DROPPER_PLATE.get());
            event.accept(ModItems.RUNIC_HEALING_PLATE.get());
            event.accept(ModItems.RUNIC_SPEED_PLATE.get());
            event.accept(ModItems.RUNIC_STRENGTH_PLATE.get());
            event.accept(ModItems.RUNIC_WISDOM_PLATE.get());

            event.accept(ModItems.RUNIC_FIRE_PLATE.get());
            event.accept(ModItems.RUNIC_WATER_PLATE.get());

            event.accept(ModItems.RUNIC_GLOVES_OF_HEALING.get());
            event.accept(ModItems.RUNIC_GLOVES_OF_SPEED.get());
            event.accept(ModItems.RUNIC_GLOVES_OF_STRENGTH.get());
            event.accept(ModItems.RUNIC_GLOVES_OF_WISDOM.get());

            event.accept(ModItems.RUNIC_PENDANT_OF_HEALING.get());
            event.accept(ModItems.RUNIC_PENDANT_OF_SPEED.get());
            event.accept(ModItems.RUNIC_PENDANT_OF_STRENGTH.get());
            event.accept(ModItems.RUNIC_PENDANT_OF_WISDOM.get());

            event.accept(ModItems.RUNIC_ANGEL_RING.get());
            event.accept(ModItems.RUNIC_RING_OF_HEALING.get());
            event.accept(ModItems.RUNIC_RING_OF_SPEED.get());
            event.accept(ModItems.RUNIC_RING_OF_STRENGTH.get());
            event.accept(ModItems.RUNIC_RING_OF_WISDOM.get());

            event.accept(ModItems.RUNIC_DECANTER_OF_ENDLESS_FIRE.get());
            event.accept(ModItems.RUNIC_DECANTER_OF_ENDLESS_WATER.get());

            event.accept(ModItems.NECRONITE_SWORD.get());
            event.accept(ModItems.NECRONITE_SHOVEL.get());
            event.accept(ModItems.NECRONITE_PICKAXE.get());
            event.accept(ModItems.NECRONITE_AXE.get());
            event.accept(ModItems.NECRONITE_HOE.get());

            event.accept(ModItems.NECRONITE_HELMET.get());
            event.accept(ModItems.NECRONITE_CHESTPLATE.get());
            event.accept(ModItems.NECRONITE_LEGGINGS.get());
            event.accept(ModItems.NECRONITE_BOOTS.get());

            event.accept(ModItems.WOODEN_CLAYMORE.get());
            event.accept(ModItems.STONE_CLAYMORE.get());
            event.accept(ModItems.IRON_CLAYMORE.get());
            event.accept(ModItems.GOLDEN_CLAYMORE.get());
            event.accept(ModItems.DIAMOND_CLAYMORE.get());
            event.accept(ModItems.NETHERITE_CLAYMORE.get());
            event.accept(ModItems.NECRONITE_CLAYMORE.get());

            event.accept(ModItems.WOODEN_TUNNELER.get());
            event.accept(ModItems.STONE_TUNNELER.get());
            event.accept(ModItems.IRON_TUNNELER.get());
            event.accept(ModItems.GOLDEN_TUNNELER.get());
            event.accept(ModItems.DIAMOND_TUNNELER.get());
            event.accept(ModItems.NETHERITE_TUNNELER.get());
            event.accept(ModItems.NECRONITE_TUNNELER.get());
        }

        if(event.getTab() == SCALAR_UTILS_BLOCKS_TAB.get()){
            event.accept(ModBlocks.CLEAR_GLASS.get());
            event.accept(ModBlocks.CLEAR_GLASS_PANE.get());
            event.accept(ModBlocks.REINFORCED_GLASS.get());
            event.accept(ModBlocks.REINFORCED_GLASS_PANE.get());
            event.accept(ModBlocks.REINFORCED_OBSIDIAN.get());

            for(RegistryObject<Block> block : ModBlocks.BLOCKS.getEntries())
                if(block.get() instanceof AbstractRuneboosterBlock)
                    event.accept(block.get());

            for(RegistryObject<Block> block : ModBlocks.BLOCKS.getEntries())
                if(block.get() instanceof AbstractRunedropperBlock)
                    event.accept(block.get());

            for(RegistryObject<Block> block : ModBlocks.BLOCKS.getEntries())
                if(block.get() instanceof AbstractRuneshifterBlock)
                    event.accept(block.get());
        }

        if(event.getTab() == SCALAR_UTILS_ITEMS_TAB.get()){
            event.accept(ModItems.CHAINMAIL.get());
            event.accept(ModItems.BLAZING_END_ROD.get());
            event.accept(ModItems.GLOVES.get());
            event.accept(ModItems.PENDANT.get());
            event.accept(ModItems.RING.get());
            event.accept(ModItems.DECANTER.get());
            event.accept(ModItems.GELATIN.get());
            event.accept(ModItems.RICE_SLIME_BALL.get());
            event.accept(ModItems.WHEAT_SLIME_BALL.get());
            event.accept(ModItems.RUNIC_PLATE.get());
            event.accept(ModItems.RUNIC_DIAMOND.get());
            event.accept(ModItems.RUNE_OF_THE_TEMPLATE.get());
            event.accept(ModItems.STONE_ROD.get());
        }

        if(event.getTab() == SCALAR_UTILS_LIGHTING_TAB.get()){
            for(RegistryObject<Block> block : ModBlocks.BLOCKS.getEntries())
                if(block.get() instanceof AbstractLampBlock)
                    event.accept(block.get());

            event.accept(ModItems.STONE_TORCH.get());
            event.accept(ModItems.REDSTONE_STONE_TORCH.get());
            event.accept(ModItems.SOUL_STONE_TORCH.get());

            event.accept(ModItems.TINY_TORCH.get());
            event.accept(ModItems.TINY_STONE_TORCH.get());
            event.accept(ModItems.TINY_REDSTONE_TORCH.get());
            event.accept(ModItems.TINY_REDSTONE_STONE_TORCH.get());
            event.accept(ModItems.TINY_SOUL_TORCH.get());
            event.accept(ModItems.TINY_SOUL_STONE_TORCH.get());
        }
    }

    /******************************** Registry ********************************/
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
