package lemon_juice.scalar_utils.event;

import lemon_juice.scalar_utils.ScalarUtils;
import lemon_juice.scalar_utils.block.ModBlocks;
import lemon_juice.scalar_utils.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class CreativeTabEvent {
    public static CreativeModeTab SCALAR_UTILS_BLOCKS_TAB;
    public static CreativeModeTab SCALAR_UTILS_ITEMS_TAB;
    public static CreativeModeTab SCALAR_UTILS_LAMPS_TAB;
    public static CreativeModeTab SCALAR_UTILS_TOOLS_TAB;

    @SubscribeEvent
    public static void onCreativeModeTabRegister(CreativeModeTabEvent.Register event){

        // Blocks Tab
        SCALAR_UTILS_BLOCKS_TAB = event.registerCreativeModeTab(new ResourceLocation(ScalarUtils.MOD_ID, "scalar_utils_blocks"), builder -> {
            builder.icon(() -> new ItemStack(ModBlocks.ULTIMATE_RUNEBOOSTER.get()))
                    .displayItems((features, output, hasPermissions) -> {
                        output.accept(new ItemStack(ModBlocks.CLEAR_GLASS.get()));
                        output.accept(new ItemStack(ModBlocks.REINFORCED_GLASS.get()));
                        output.accept(new ItemStack(ModBlocks.REINFORCED_OBSIDIAN.get()));

                        output.accept(new ItemStack(ModBlocks.BASIC_RUNEBOOSTER.get()));
                        output.accept(new ItemStack(ModBlocks.ADVANCED_RUNEBOOSTER.get()));
                        output.accept(new ItemStack(ModBlocks.ELITE_RUNEBOOSTER.get()));
                        output.accept(new ItemStack(ModBlocks.ULTIMATE_RUNEBOOSTER.get()));

                        output.accept(new ItemStack(ModBlocks.BASIC_RUNEDROPPER.get()));
                        output.accept(new ItemStack(ModBlocks.ADVANCED_RUNEDROPPER.get()));
                        output.accept(new ItemStack(ModBlocks.ELITE_RUNEDROPPER.get()));
                        output.accept(new ItemStack(ModBlocks.ULTIMATE_RUNEDROPPER.get()));
                    })
                    .title(Component.translatable("itemGroup.scalar_utils_blocks"))
                    .build();
        });

        // Items Tab
        SCALAR_UTILS_ITEMS_TAB = event.registerCreativeModeTab(new ResourceLocation(ScalarUtils.MOD_ID, "scalar_utils_items"), builder -> {
            builder.icon(() -> new ItemStack(ModItems.TINY_COAL.get()))
                    .displayItems((features, output, hasPermissions) -> {
                        output.accept(new ItemStack(ModItems.TINY_CHARCOAL.get()));
                        output.accept(new ItemStack(ModItems.TINY_COAL.get()));
                        output.accept(new ItemStack(ModItems.FLAX_SEEDS.get()));
                        output.accept(new ItemStack(ModItems.FLOUR.get()));
                        output.accept(new ItemStack(ModItems.GELATIN.get()));
                        output.accept(new ItemStack(ModItems.WHEAT_SLIME_BALL.get()));
                        output.accept(new ItemStack(ModItems.RING.get()));
                        output.accept(new ItemStack(ModItems.RUNIC_PLATE.get()));
                    })
                    .title(Component.translatable("itemGroup.scalar_utils_items"))
                    .build();
        });

        // Lamps Tab
        SCALAR_UTILS_LAMPS_TAB = event.registerCreativeModeTab(new ResourceLocation(ScalarUtils.MOD_ID, "scalar_utils_lamps"), builder -> {
            builder.icon(() -> new ItemStack(ModBlocks.WHITE_LAMP.get()))
                    .displayItems((features, output, hasPermissions) -> {
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
                    })
                    .title(Component.translatable("itemGroup.scalar_utils_lamps"))
                    .build();
        });

        // Tools Tab
        SCALAR_UTILS_TOOLS_TAB = event.registerCreativeModeTab(new ResourceLocation(ScalarUtils.MOD_ID, "scalar_utils_tools"), builder -> {
            builder.icon(() -> new ItemStack(ModItems.RUNIC_ANGEL_RING.get()))
                    .displayItems((features, output, hasPermissions) -> {
                        output.accept(new ItemStack(ModItems.GLASS_CUTTER.get()));
                        output.accept(new ItemStack(ModItems.RUNECARVING_KNIFE.get()));

                        output.accept(new ItemStack(ModItems.RUNIC_ANGEL_RING.get()));
                        output.accept(new ItemStack(ModItems.RUNIC_BOOSTER_PLATE.get()));
                        output.accept(new ItemStack(ModItems.RUNIC_DROPPER_PLATE.get()));

                        output.accept(new ItemStack(ModItems.WOODEN_TUNNELER.get()));
                        output.accept(new ItemStack(ModItems.STONE_TUNNELER.get()));
                        output.accept(new ItemStack(ModItems.IRON_TUNNELER.get()));
                        output.accept(new ItemStack(ModItems.GOLDEN_TUNNELER.get()));
                        output.accept(new ItemStack(ModItems.DIAMOND_TUNNELER.get()));
                        output.accept(new ItemStack(ModItems.NETHERITE_TUNNELER.get()));
                    })
                    .title(Component.translatable("itemGroup.scalar_utils_tools"))
                    .build();
        });
    }
}