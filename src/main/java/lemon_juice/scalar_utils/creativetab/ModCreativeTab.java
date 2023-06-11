package lemon_juice.scalar_utils.creativetab;

import lemon_juice.scalar_utils.ScalarUtils;
import lemon_juice.scalar_utils.block.ModBlocks;
import lemon_juice.scalar_utils.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
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
            .icon(() -> new ItemStack(ModBlocks.ULTIMATE_RUNEBOOSTER.get()))
            .build());

    public static final RegistryObject<CreativeModeTab> SCALAR_UTILS_ITEMS_TAB = CREATIVE_MODE_TABS.register("scalar_utils_items", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.scalar_utils_items"))
            .icon(() -> new ItemStack(ModItems.NECRONITE_INGOT.get()))
            .build());

    public static final RegistryObject<CreativeModeTab> SCALAR_UTILS_LIGHTING_TAB = CREATIVE_MODE_TABS.register("scalar_utils_lighting", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.scalar_utils_lighting"))
            .icon(() -> new ItemStack(ModBlocks.WHITE_LAMP.get()))
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

            event.accept(ModItems.NECRONITE_SWORD.get());
            event.accept(ModItems.NECRONITE_SHOVEL.get());
            event.accept(ModItems.NECRONITE_PICKAXE.get());
            event.accept(ModItems.NECRONITE_AXE.get());
            event.accept(ModItems.NECRONITE_HOE.get());

            event.accept(ModItems.NECRONITE_HELMET.get());
            event.accept(ModItems.NECRONITE_CHESTPLATE.get());
            event.accept(ModItems.NECRONITE_LEGGINGS.get());
            event.accept(ModItems.NECRONITE_BOOTS.get());

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
            event.accept(ModBlocks.NECRONITE_BLOCK.get());
            event.accept(ModBlocks.REINFORCED_GLASS.get());
            event.accept(ModBlocks.REINFORCED_GLASS_PANE.get());
            event.accept(ModBlocks.REINFORCED_OBSIDIAN.get());

            event.accept(ModBlocks.BASIC_RUNEBOOSTER.get());
            event.accept(ModBlocks.ADVANCED_RUNEBOOSTER.get());
            event.accept(ModBlocks.ELITE_RUNEBOOSTER.get());
            event.accept(ModBlocks.ULTIMATE_RUNEBOOSTER.get());
            event.accept(ModBlocks.TRANSCENDENT_RUNEBOOSTER.get());

            event.accept(ModBlocks.BASIC_RUNEDROPPER.get());
            event.accept(ModBlocks.ADVANCED_RUNEDROPPER.get());
            event.accept(ModBlocks.ELITE_RUNEDROPPER.get());
            event.accept(ModBlocks.ULTIMATE_RUNEDROPPER.get());
            event.accept(ModBlocks.TRANSCENDENT_RUNEDROPPER.get());
        }

        if(event.getTab() == SCALAR_UTILS_ITEMS_TAB.get()){
            event.accept(ModItems.CHAINMAIL.get());
            event.accept(ModItems.BLAZING_END_ROD.get());
            event.accept(ModItems.GLOVES.get());
            event.accept(ModItems.PENDANT.get());
            event.accept(ModItems.RING.get());
            event.accept(ModItems.NECRONITE_INGOT.get());
            event.accept(ModItems.NECRONITE_NUGGET.get());
            event.accept(ModItems.GELATIN.get());
            event.accept(ModItems.RICE_SLIME_BALL.get());
            event.accept(ModItems.WHEAT_SLIME_BALL.get());
            event.accept(ModItems.RUNIC_PLATE.get());
            event.accept(ModItems.STONE_ROD.get());
        }

        if(event.getTab() == SCALAR_UTILS_LIGHTING_TAB.get()){
            event.accept(ModBlocks.WHITE_LAMP.get());
            event.accept(ModBlocks.LIGHT_GRAY_LAMP.get());
            event.accept(ModBlocks.GRAY_LAMP.get());
            event.accept(ModBlocks.BLACK_LAMP.get());
            event.accept(ModBlocks.BROWN_LAMP.get());
            event.accept(ModBlocks.RED_LAMP.get());
            event.accept(ModBlocks.ORANGE_LAMP.get());
            event.accept(ModBlocks.YELLOW_LAMP.get());
            event.accept(ModBlocks.LIME_LAMP.get());
            event.accept(ModBlocks.GREEN_LAMP.get());
            event.accept(ModBlocks.CYAN_LAMP.get());
            event.accept(ModBlocks.LIGHT_BLUE_LAMP.get());
            event.accept(ModBlocks.BLUE_LAMP.get());
            event.accept(ModBlocks.PURPLE_LAMP.get());
            event.accept(ModBlocks.MAGENTA_LAMP.get());
            event.accept(ModBlocks.PINK_LAMP.get());

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
