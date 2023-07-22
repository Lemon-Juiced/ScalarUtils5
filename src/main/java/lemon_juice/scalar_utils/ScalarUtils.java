package lemon_juice.scalar_utils;

import lemon_juice.scalar_utils.block.ModBlocks;
import lemon_juice.scalar_utils.creativetab.ModCreativeTab;
import lemon_juice.scalar_utils.handler.MobDropHandler;
import lemon_juice.scalar_utils.item.ModItems;
import lemon_juice.scalar_utils.loot.ModLootModifiers;
import lemon_juice.scalar_utils.tags.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import top.theillusivec4.curios.api.SlotTypeMessage;
import top.theillusivec4.curios.api.SlotTypePreset;

@Mod(ScalarUtils.MOD_ID)
public class ScalarUtils {
    public static final String MOD_ID = "scalar_utils";
    public ScalarUtils() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register Items & Blocks
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        // Register Creative Tab
        ModCreativeTab.register(modEventBus);
        modEventBus.addListener(ModCreativeTab::registerTabs);

        // Register Global Loot Modifiers
        ModLootModifiers.register(modEventBus);

        // Register Tags
        ModTags.init();

        // Register commonSetup (Mob Drops from Cleavers)
        modEventBus.addListener(this::commonSetup);

        // Registers enqueueIMC (Curios)
        modEventBus.addListener(this::enqueueIMC);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Registers Mob Drops from Cleavers
        MinecraftForge.EVENT_BUS.register(new MobDropHandler());
    }

    //InterModQueue For Curios
    private void enqueueIMC(InterModEnqueueEvent event) {
        // Adds 2 "RING" Slots
        InterModComms.sendTo("curios", SlotTypeMessage.REGISTER_TYPE, () -> SlotTypePreset.RING.getMessageBuilder().size(2).build());
        // Adds 1 "HAND" Slots
        InterModComms.sendTo("curios", SlotTypeMessage.REGISTER_TYPE, () -> SlotTypePreset.HANDS.getMessageBuilder().size(1).build());
        // Creates 1 "pendant" Slots
        InterModComms.sendTo("curios", SlotTypeMessage.REGISTER_TYPE, () -> new SlotTypeMessage.Builder("pendant").icon(new ResourceLocation(ScalarUtils.MOD_ID, "slot/empty_pendant_slot")).build());
}

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {}
    }
}
