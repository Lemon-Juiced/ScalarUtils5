package lemon_juice.scalar_utils.events;

import lemon_juice.scalar_utils.ScalarUtils;
import lemon_juice.scalar_utils.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class CreativeTabEvent {
    public static CreativeModeTab SCALAR_UTILS_TAB;

    @SubscribeEvent
    public static void onCreativeModeTabRegister(CreativeModeTabEvent.Register event){
        SCALAR_UTILS_TAB = event.registerCreativeModeTab(new ResourceLocation(ScalarUtils.MOD_ID, "scalar_utils"), builder -> {
            builder.icon(() -> new ItemStack(ModItems.TINY_COAL.get()))
                    .displayItems((features, output, hasPermissions) -> {
                        output.accept(new ItemStack(ModItems.TINY_CHARCOAL.get()));
                        output.accept(new ItemStack(ModItems.TINY_COAL.get()));
                        output.accept(new ItemStack(ModItems.FLOUR.get()));
                    })
                    .title(Component.translatable("itemGroup.scalar_utils"))
                    .build();
        });
    }
}