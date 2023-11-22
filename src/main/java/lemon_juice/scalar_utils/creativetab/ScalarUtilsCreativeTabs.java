package lemon_juice.scalar_utils.creativetab;

import lemon_juice.scalar_utils.ScalarUtils;
import lemon_juice.scalar_utils.block.ScalarUtilsBlocks;
import lemon_juice.scalar_utils.block.custom.lighting.AbstractLampBlock;
import lemon_juice.scalar_utils.block.custom.lighting.torch.torch_block.AbstractRedstoneTorchBlock;
import lemon_juice.scalar_utils.block.custom.lighting.torch.torch_block.AbstractTorchBlock;
import lemon_juice.scalar_utils.block.custom.lighting.torch.wall_torch_block.AbstractRedstoneWallTorchBlock;
import lemon_juice.scalar_utils.block.custom.lighting.torch.wall_torch_block.AbstractWallTorchBlock;
import lemon_juice.scalar_utils.block.custom.rune_block.AbstractRuneboosterBlock;
import lemon_juice.scalar_utils.block.custom.rune_block.AbstractRunedisplacerBlock;
import lemon_juice.scalar_utils.block.custom.rune_block.AbstractRunedropperBlock;
import lemon_juice.scalar_utils.block.custom.rune_block.AbstractRuneshifterBlock;
import lemon_juice.scalar_utils.creativetab.util.CreativeTabUtils;
import lemon_juice.scalar_utils.item.ScalarUtilsItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static lemon_juice.lemon_core.creativetab.LemonCoreCreativeTabs.LEMON_CORE_OTHER_TAB;

public class ScalarUtilsCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ScalarUtils.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SCALAR_UTILS_AGRICULTURE_TAB = CREATIVE_MODE_TABS.register("scalar_utils_agriculture", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.scalar_utils_agriculture"))
            .icon(() -> new ItemStack(ScalarUtilsItems.FLOUR.get()))
            .build());

    public static final RegistryObject<CreativeModeTab> SCALAR_UTILS_ARSENAL_TAB = CREATIVE_MODE_TABS.register("scalar_utils_arsenal", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.scalar_utils_arsenal"))
            .icon(() -> new ItemStack(ScalarUtilsItems.RUNIC_ANGEL_RING.get()))
            .build());

    public static final RegistryObject<CreativeModeTab> SCALAR_UTILS_BLOCKS_TAB = CREATIVE_MODE_TABS.register("scalar_utils_blocks", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.scalar_utils_blocks"))
            .icon(() -> new ItemStack(ScalarUtilsBlocks.REINFORCED_OBSIDIAN.get()))
            .build());

    public static final RegistryObject<CreativeModeTab> SCALAR_UTILS_ITEMS_TAB = CREATIVE_MODE_TABS.register("scalar_utils_items", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.scalar_utils_items"))
            .icon(() -> new ItemStack(ScalarUtilsItems.RUNIC_PLATE.get()))
            .build());

    public static final RegistryObject<CreativeModeTab> SCALAR_UTILS_LIGHTING_TAB = CREATIVE_MODE_TABS.register("scalar_utils_lighting", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.scalar_utils_lighting"))
            .icon(() -> new ItemStack(CreativeTabUtils.getRainbowLampItem()))
            .build());

    public static void registerTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == SCALAR_UTILS_AGRICULTURE_TAB.get()) {
            event.accept(ScalarUtilsItems.FLOUR.get());
            event.accept(ScalarUtilsItems.CARROT_SEEDS.get());
            event.accept(ScalarUtilsItems.FLAX_SEEDS.get());
            event.accept(ScalarUtilsItems.POTATO_SEEDS.get());
            event.accept(ScalarUtilsItems.RICE.get());
        }

        if (event.getTab() == SCALAR_UTILS_ARSENAL_TAB.get()) {
            event.accept(ScalarUtilsItems.GLASS_CUTTER.get());
            event.accept(ScalarUtilsItems.RUNECARVING_KNIFE.get());

            event.accept(ScalarUtilsItems.RUNIC_BOOSTER_PLATE.get());
            event.accept(ScalarUtilsItems.RUNIC_DROPPER_PLATE.get());
            event.accept(ScalarUtilsItems.RUNIC_HEALING_PLATE.get());
            event.accept(ScalarUtilsItems.RUNIC_SPEED_PLATE.get());
            event.accept(ScalarUtilsItems.RUNIC_STRENGTH_PLATE.get());
            event.accept(ScalarUtilsItems.RUNIC_WISDOM_PLATE.get());

            event.accept(ScalarUtilsItems.RUNIC_FIRE_PLATE.get());
            event.accept(ScalarUtilsItems.RUNIC_WATER_PLATE.get());

            event.accept(ScalarUtilsItems.RUNE_OF_THE_TEMPLATE.get());

            event.accept(ScalarUtilsItems.RUNIC_GLOVES_OF_HEALING.get());
            event.accept(ScalarUtilsItems.RUNIC_GLOVES_OF_SPEED.get());
            event.accept(ScalarUtilsItems.RUNIC_GLOVES_OF_STRENGTH.get());
            event.accept(ScalarUtilsItems.RUNIC_GLOVES_OF_WISDOM.get());

            event.accept(ScalarUtilsItems.RUNIC_PENDANT_OF_HEALING.get());
            event.accept(ScalarUtilsItems.RUNIC_PENDANT_OF_SPEED.get());
            event.accept(ScalarUtilsItems.RUNIC_PENDANT_OF_STRENGTH.get());
            event.accept(ScalarUtilsItems.RUNIC_PENDANT_OF_WISDOM.get());

            event.accept(ScalarUtilsItems.RUNIC_ANGEL_RING.get());
            event.accept(ScalarUtilsItems.RUNIC_RING_OF_HEALING.get());
            event.accept(ScalarUtilsItems.RUNIC_RING_OF_SPEED.get());
            event.accept(ScalarUtilsItems.RUNIC_RING_OF_STRENGTH.get());
            event.accept(ScalarUtilsItems.RUNIC_RING_OF_WISDOM.get());

            event.accept(ScalarUtilsItems.RUNIC_DECANTER_OF_ENDLESS_FIRE.get());
            event.accept(ScalarUtilsItems.RUNIC_DECANTER_OF_ENDLESS_WATER.get());

            event.accept(ScalarUtilsItems.NECRONITE_SWORD.get());
            event.accept(ScalarUtilsItems.NECRONITE_PICKAXE.get());
            event.accept(ScalarUtilsItems.NECRONITE_AXE.get());
            event.accept(ScalarUtilsItems.NECRONITE_SHOVEL.get());
            event.accept(ScalarUtilsItems.NECRONITE_HOE.get());

            event.accept(ScalarUtilsItems.NECRONITE_HELMET.get());
            event.accept(ScalarUtilsItems.NECRONITE_CHESTPLATE.get());
            event.accept(ScalarUtilsItems.NECRONITE_LEGGINGS.get());
            event.accept(ScalarUtilsItems.NECRONITE_BOOTS.get());

            event.accept(ScalarUtilsItems.WOODEN_CLAYMORE.get());
            event.accept(ScalarUtilsItems.STONE_CLAYMORE.get());
            event.accept(ScalarUtilsItems.IRON_CLAYMORE.get());
            event.accept(ScalarUtilsItems.GOLDEN_CLAYMORE.get());
            event.accept(ScalarUtilsItems.DIAMOND_CLAYMORE.get());
            event.accept(ScalarUtilsItems.NETHERITE_CLAYMORE.get());
            event.accept(ScalarUtilsItems.NECRONITE_CLAYMORE.get());

            event.accept(ScalarUtilsItems.WOODEN_TUNNELER.get());
            event.accept(ScalarUtilsItems.STONE_TUNNELER.get());
            event.accept(ScalarUtilsItems.IRON_TUNNELER.get());
            event.accept(ScalarUtilsItems.GOLDEN_TUNNELER.get());
            event.accept(ScalarUtilsItems.DIAMOND_TUNNELER.get());
            event.accept(ScalarUtilsItems.NETHERITE_TUNNELER.get());
            event.accept(ScalarUtilsItems.NECRONITE_TUNNELER.get());
        }

        if (event.getTab() == SCALAR_UTILS_BLOCKS_TAB.get()) {
            event.accept(ScalarUtilsBlocks.CLEAR_GLASS.get());
            event.accept(ScalarUtilsBlocks.CLEAR_GLASS_PANE.get());
            event.accept(ScalarUtilsBlocks.REINFORCED_GLASS.get());
            event.accept(ScalarUtilsBlocks.REINFORCED_GLASS_PANE.get());
            event.accept(ScalarUtilsBlocks.REINFORCED_OBSIDIAN.get());

            for (RegistryObject<Block> block : ScalarUtilsBlocks.BLOCKS.getEntries())
                if (block.get() instanceof AbstractRuneboosterBlock)
                    event.accept(block.get());

            for (RegistryObject<Block> block : ScalarUtilsBlocks.BLOCKS.getEntries())
                if (block.get() instanceof AbstractRunedropperBlock)
                    event.accept(block.get());

            for (RegistryObject<Block> block : ScalarUtilsBlocks.BLOCKS.getEntries())
                if (block.get() instanceof AbstractRuneshifterBlock)
                    event.accept(block.get());

            for (RegistryObject<Block> block : ScalarUtilsBlocks.BLOCKS.getEntries())
                if (block.get() instanceof AbstractRunedisplacerBlock)
                    event.accept(block.get());
        }

        if (event.getTab() == SCALAR_UTILS_ITEMS_TAB.get()) {
            event.accept(ScalarUtilsItems.CHAINMAIL.get());
            event.accept(ScalarUtilsItems.BLAZING_END_ROD.get());
            event.accept(ScalarUtilsItems.GLOVES.get());
            event.accept(ScalarUtilsItems.PENDANT.get());
            event.accept(ScalarUtilsItems.RING.get());
            event.accept(ScalarUtilsItems.DECANTER.get());
            event.accept(ScalarUtilsItems.GELATIN.get());
            event.accept(ScalarUtilsItems.RICE_SLIME_BALL.get());
            event.accept(ScalarUtilsItems.WHEAT_SLIME_BALL.get());
            event.accept(ScalarUtilsItems.RUNIC_PLATE.get());
            event.accept(ScalarUtilsItems.RUNIC_DIAMOND.get());
            event.accept(ScalarUtilsItems.STONE_ROD.get());
        }

        if (event.getTab() == SCALAR_UTILS_LIGHTING_TAB.get()) {
            for (RegistryObject<Block> block : ScalarUtilsBlocks.BLOCKS.getEntries())
                if (block.get() instanceof AbstractLampBlock)
                    event.accept(block.get());

            for (RegistryObject<Block> block : ScalarUtilsBlocks.BLOCKS.getEntries())
                if (block.get() instanceof AbstractTorchBlock || block.get() instanceof AbstractWallTorchBlock ||
                        block.get() instanceof AbstractRedstoneTorchBlock || block.get() instanceof AbstractRedstoneWallTorchBlock) {
                    event.accept(block.get());

                }
        }

        if(event.getTab() == LEMON_CORE_OTHER_TAB.get()){
            event.accept(ScalarUtilsItems.NECRONITE_ORE_CRUSHING_HAMMER.get());
        }
    }

    /******************************** Registry ********************************/
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
