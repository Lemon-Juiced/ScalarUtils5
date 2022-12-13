package lemon_juice.scalar_utils.item;

import lemon_juice.scalar_utils.ScalarUtils;
import lemon_juice.scalar_utils.item.custom.AbstractTinyCoalItem;
import lemon_juice.scalar_utils.item.custom.GlassCutterItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ScalarUtils.MOD_ID);

    // Abstract Tiny Coals
    public static final RegistryObject<Item> TINY_CHARCOAL = ITEMS.register("tiny_charcoal", () -> new AbstractTinyCoalItem(new Item.Properties()));
    public static final RegistryObject<Item> TINY_COAL = ITEMS.register("tiny_coal", () -> new AbstractTinyCoalItem(new Item.Properties()));

    // Flour
    public static final RegistryObject<Item> FLOUR = ITEMS.register("flour", () -> new Item(new Item.Properties()));

    // Glass Cutter
    public static final RegistryObject<Item> GLASS_CUTTER = ITEMS.register("glass_cutter", () -> new GlassCutterItem(new Item.Properties()));

    // Runic Plates
    public static final  RegistryObject<Item> RUNIC_PLATE = ITEMS.register("runic_plate", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
