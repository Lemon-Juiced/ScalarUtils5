package lemon_juice.scalar_utils.creativetab;

import lemon_juice.scalar_utils.ScalarUtils;
import lemon_juice.scalar_utils.block.ModBlocks;
import lemon_juice.scalar_utils.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;

public class CreativeTab {

    public static ResourceLocation SCALAR_UTILS_AGRICULTURE_TAB = new ResourceLocation(ScalarUtils.MOD_ID, "scalar_utils_agriculture");
    public static ResourceLocation SCALAR_UTILS_BLOCKS_TAB = new ResourceLocation(ScalarUtils.MOD_ID, "scalar_utils_blocks");
    public static ResourceLocation SCALAR_UTILS_ITEMS_TAB = new ResourceLocation(ScalarUtils.MOD_ID, "scalar_utils_items");
    public static ResourceLocation SCALAR_UTILS_LIGHTING_TAB = new ResourceLocation(ScalarUtils.MOD_ID, "scalar_utils_lighting");
    public static ResourceLocation SCALAR_UTILS_TOOLS_TAB = new ResourceLocation(ScalarUtils.MOD_ID, "scalar_utils_tools");

    public static void registerTabs(CreativeModeTabEvent.Register event){
        // Agriculture Tab
        event.registerCreativeModeTab(SCALAR_UTILS_AGRICULTURE_TAB, builder -> builder
                .title(Component.translatable("itemGroup.scalar_utils_agriculture"))
                .icon(() -> new ItemStack(ModItems.FLOUR.get()))
                .displayItems((features, output) -> {
                    output.accept(new ItemStack(ModItems.FLOUR.get()));
                    output.accept(new ItemStack(ModItems.CARROT_SEEDS.get()));
                    output.accept(new ItemStack(ModItems.FLAX_SEEDS.get()));
                    output.accept(new ItemStack(ModItems.POTATO_SEEDS.get()));
                    output.accept(new ItemStack(ModItems.RICE.get()));
                }));

        // Blocks Tab
        event.registerCreativeModeTab(SCALAR_UTILS_BLOCKS_TAB, builder -> builder
                .title(Component.translatable("itemGroup.scalar_utils_blocks"))
                .icon(() -> new ItemStack(ModBlocks.ULTIMATE_RUNEBOOSTER.get()))
                .displayItems((features, output) -> {
                    output.accept(new ItemStack(ModBlocks.CLEAR_GLASS.get()));
                    output.accept(new ItemStack(ModBlocks.CLEAR_GLASS_PANE.get()));
                    output.accept(new ItemStack(ModBlocks.NECRONITE_BLOCK.get()));
                    output.accept(new ItemStack(ModBlocks.REINFORCED_GLASS.get()));
                    output.accept(new ItemStack(ModBlocks.REINFORCED_GLASS_PANE.get()));
                    output.accept(new ItemStack(ModBlocks.REINFORCED_OBSIDIAN.get()));

                    output.accept(new ItemStack(ModBlocks.BASIC_RUNEBOOSTER.get()));
                    output.accept(new ItemStack(ModBlocks.ADVANCED_RUNEBOOSTER.get()));
                    output.accept(new ItemStack(ModBlocks.ELITE_RUNEBOOSTER.get()));
                    output.accept(new ItemStack(ModBlocks.ULTIMATE_RUNEBOOSTER.get()));
                    output.accept(new ItemStack(ModBlocks.TRANSCENDENT_RUNEBOOSTER.get()));

                    output.accept(new ItemStack(ModBlocks.BASIC_RUNEDROPPER.get()));
                    output.accept(new ItemStack(ModBlocks.ADVANCED_RUNEDROPPER.get()));
                    output.accept(new ItemStack(ModBlocks.ELITE_RUNEDROPPER.get()));
                    output.accept(new ItemStack(ModBlocks.ULTIMATE_RUNEDROPPER.get()));
                    output.accept(new ItemStack(ModBlocks.TRANSCENDENT_RUNEDROPPER.get()));
                }));

        // Items Tab
        event.registerCreativeModeTab(SCALAR_UTILS_ITEMS_TAB, builder -> builder
                .title(Component.translatable("itemGroup.scalar_utils_items"))
                .icon(() -> new ItemStack(ModItems.NECRONITE_INGOT.get()))
                .displayItems((features, output) -> {
                    output.accept(new ItemStack(ModItems.BLAZING_END_ROD.get()));
                    output.accept(new ItemStack(ModItems.NECRONITE_INGOT.get()));
                    output.accept(new ItemStack(ModItems.NECRONITE_NUGGET.get()));
                    output.accept(new ItemStack(ModItems.GELATIN.get()));
                    output.accept(new ItemStack(ModItems.RICE_SLIME_BALL.get()));
                    output.accept(new ItemStack(ModItems.WHEAT_SLIME_BALL.get()));
                    output.accept(new ItemStack(ModItems.RING.get()));
                    output.accept(new ItemStack(ModItems.RUNIC_PLATE.get()));
                    output.accept(new ItemStack(ModItems.STONE_ROD.get()));
                    output.accept(new ItemStack(ModItems.TINY_CHARCOAL.get()));
                    output.accept(new ItemStack(ModItems.TINY_COAL.get()));
                }));

        // Lighting Tab
        event.registerCreativeModeTab(SCALAR_UTILS_LIGHTING_TAB, builder -> builder
                .title(Component.translatable("itemGroup.scalar_utils_lighting"))
                .icon(() -> new ItemStack(ModBlocks.WHITE_LAMP.get()))
                .displayItems((features, output) -> {
                    output.accept(new ItemStack(ModBlocks.WHITE_LAMP.get()));
                    output.accept(new ItemStack(ModBlocks.LIGHT_GRAY_LAMP.get()));
                    output.accept(new ItemStack(ModBlocks.GRAY_LAMP.get()));
                    output.accept(new ItemStack(ModBlocks.BLACK_LAMP.get()));
                    output.accept(new ItemStack(ModBlocks.BROWN_LAMP.get()));
                    output.accept(new ItemStack(ModBlocks.RED_LAMP.get()));
                    output.accept(new ItemStack(ModBlocks.ORANGE_LAMP.get()));
                    output.accept(new ItemStack(ModBlocks.YELLOW_LAMP.get()));
                    output.accept(new ItemStack(ModBlocks.LIME_LAMP.get()));
                    output.accept(new ItemStack(ModBlocks.GREEN_LAMP.get()));
                    output.accept(new ItemStack(ModBlocks.CYAN_LAMP.get()));
                    output.accept(new ItemStack(ModBlocks.LIGHT_BLUE_LAMP.get()));
                    output.accept(new ItemStack(ModBlocks.BLUE_LAMP.get()));
                    output.accept(new ItemStack(ModBlocks.PURPLE_LAMP.get()));
                    output.accept(new ItemStack(ModBlocks.MAGENTA_LAMP.get()));
                    output.accept(new ItemStack(ModBlocks.PINK_LAMP.get()));

                    output.accept(new ItemStack(ModItems.STONE_TORCH.get()));
                    output.accept(new ItemStack(ModItems.SOUL_STONE_TORCH.get()));

                    output.accept(new ItemStack(ModItems.TINY_TORCH.get()));
                    output.accept(new ItemStack(ModItems.TINY_STONE_TORCH.get()));
                    output.accept(new ItemStack(ModItems.TINY_SOUL_TORCH.get()));
                    output.accept(new ItemStack(ModItems.TINY_SOUL_STONE_TORCH.get()));
                }));

        // Tools Tab
        event.registerCreativeModeTab(SCALAR_UTILS_TOOLS_TAB, builder -> builder
                .title(Component.translatable("itemGroup.scalar_utils_tools"))
                .icon(() -> new ItemStack(ModItems.RUNIC_ANGEL_RING.get()))
                .displayItems((features, output) -> {
                    output.accept(new ItemStack(ModItems.GLASS_CUTTER.get()));
                    output.accept(new ItemStack(ModItems.RUNECARVING_KNIFE.get()));

                    output.accept(new ItemStack(ModItems.RUNIC_ANGEL_RING.get()));
                    output.accept(new ItemStack(ModItems.RUNIC_BOOSTER_PLATE.get()));
                    output.accept(new ItemStack(ModItems.RUNIC_DROPPER_PLATE.get()));

                    output.accept(new ItemStack(ModItems.NECRONITE_SWORD.get()));
                    output.accept(new ItemStack(ModItems.NECRONITE_SHOVEL.get()));
                    output.accept(new ItemStack(ModItems.NECRONITE_PICKAXE.get()));
                    output.accept(new ItemStack(ModItems.NECRONITE_AXE.get()));
                    output.accept(new ItemStack(ModItems.NECRONITE_HOE.get()));

                    output.accept(new ItemStack(ModItems.NECRONITE_HELMET.get()));
                    output.accept(new ItemStack(ModItems.NECRONITE_CHESTPLATE.get()));
                    output.accept(new ItemStack(ModItems.NECRONITE_LEGGINGS.get()));
                    output.accept(new ItemStack(ModItems.NECRONITE_BOOTS.get()));

                    output.accept(new ItemStack(ModItems.WOODEN_TUNNELER.get()));
                    output.accept(new ItemStack(ModItems.STONE_TUNNELER.get()));
                    output.accept(new ItemStack(ModItems.IRON_TUNNELER.get()));
                    output.accept(new ItemStack(ModItems.GOLDEN_TUNNELER.get()));
                    output.accept(new ItemStack(ModItems.DIAMOND_TUNNELER.get()));
                    output.accept(new ItemStack(ModItems.NETHERITE_TUNNELER.get()));
                    output.accept(new ItemStack(ModItems.NECRONITE_TUNNELER.get()));
                }));
    }
}
