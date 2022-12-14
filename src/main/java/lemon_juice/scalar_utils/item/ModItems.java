package lemon_juice.scalar_utils.item;

import lemon_juice.scalar_utils.ScalarUtils;
import lemon_juice.scalar_utils.item.custom.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
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

    // Ring
    public static final RegistryObject<Item> RING= ITEMS.register("ring", () -> new Item(new Item.Properties()));

    // Runic Angel Ring
    public static final RegistryObject<Item> RUNIC_ANGEL_RING = ITEMS.register("runic_angel_ring", () -> new RunicAngelRingItem(new Item.Properties()));

    // Runic Plates
    public static final RegistryObject<Item> RUNIC_PLATE = ITEMS.register("runic_plate", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUNIC_BOOSTER_PLATE = ITEMS.register("runic_booster_plate", () -> new RunicBoosterPlateItem(new Item.Properties()));
    public static final RegistryObject<Item> RUNIC_DROPPER_PLATE = ITEMS.register("runic_dropper_plate", () -> new RunicDropperPlateItem(new Item.Properties()));

    // Slimeball Alternatives
    public static final RegistryObject<Item> GELATIN = ITEMS.register("gelatin", () -> new AbstractSlimeballAlternativeItem(new Item.Properties()));
    public static final RegistryObject<Item> WHEAT_SLIME_BALL = ITEMS.register("wheat_slime_ball", () -> new AbstractSlimeballAlternativeItem(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
