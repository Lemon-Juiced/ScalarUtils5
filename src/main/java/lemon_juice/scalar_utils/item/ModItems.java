package lemon_juice.scalar_utils.item;

import lemon_juice.scalar_utils.ScalarUtils;
import lemon_juice.scalar_utils.block.ModBlocks;
import lemon_juice.scalar_utils.item.custom.*;
import lemon_juice.scalar_utils.item.custom.curiositem.RunicAngelRingItem;
import lemon_juice.scalar_utils.item.custom.curiositem.RunicBoosterPlateItem;
import lemon_juice.scalar_utils.item.custom.curiositem.RunicDropperPlateItem;
import lemon_juice.scalar_utils.item.custom.diggeritem.GlassCutterItem;
import lemon_juice.scalar_utils.item.custom.diggeritem.TunnelerItem;
import lemon_juice.scalar_utils.item.custom.wipitem.FlaxSeedsItem;
import lemon_juice.scalar_utils.item.custom.wipitem.StoneTorchItem;
import net.minecraft.core.Direction;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ScalarUtils.MOD_ID);

    // Abstract Tiny Coals
    public static final RegistryObject<Item> TINY_CHARCOAL = ITEMS.register("tiny_charcoal", () -> new AbstractTinyCoalItem(new Item.Properties()));
    public static final RegistryObject<Item> TINY_COAL = ITEMS.register("tiny_coal", () -> new AbstractTinyCoalItem(new Item.Properties()));

    // Flax Seeds
    public static final RegistryObject<Item> FLAX_SEEDS = ITEMS.register("flax_seeds", () -> new FlaxSeedsItem(ModBlocks.FLAX_CROP.get(), new Item.Properties()));

    // Flour
    public static final RegistryObject<Item> FLOUR = ITEMS.register("flour", () -> new FlourItem(new Item.Properties()));

    // Glass Cutter
    public static final RegistryObject<Item> GLASS_CUTTER = ITEMS.register("glass_cutter", () -> new GlassCutterItem(new Item.Properties()));

    // Ring
    public static final RegistryObject<Item> RING = ITEMS.register("ring", () -> new Item(new Item.Properties()));

    // Rune Carving Knife
    public static final RegistryObject<Item> RUNECARVING_KNIFE = ITEMS.register("runecarving_knife", () -> new RuneCarvingKnifeItem(new Item.Properties()));

    // Runic Angel Ring
    public static final RegistryObject<Item> RUNIC_ANGEL_RING = ITEMS.register("runic_angel_ring", () -> new RunicAngelRingItem(new Item.Properties()));

    // Runic Plates
    public static final RegistryObject<Item> RUNIC_PLATE = ITEMS.register("runic_plate", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUNIC_BOOSTER_PLATE = ITEMS.register("runic_booster_plate", () -> new RunicBoosterPlateItem(new Item.Properties()));
    public static final RegistryObject<Item> RUNIC_DROPPER_PLATE = ITEMS.register("runic_dropper_plate", () -> new RunicDropperPlateItem(new Item.Properties()));

    // Slimeball Alternatives
    public static final RegistryObject<Item> GELATIN = ITEMS.register("gelatin", () -> new AbstractSlimeballAlternativeItem(new Item.Properties()));
    public static final RegistryObject<Item> WHEAT_SLIME_BALL = ITEMS.register("wheat_slime_ball", () -> new AbstractSlimeballAlternativeItem(new Item.Properties()));

    // Stone Rod
    public static final RegistryObject<Item> STONE_ROD = ITEMS.register("stone_rod", () -> new Item(new Item.Properties()));

    // Stone Torch BlockItem
    public static final RegistryObject<Item> STONE_TORCH = ITEMS.register("stone_torch", () -> new StoneTorchItem(ModBlocks.STONE_TORCH.get(), ModBlocks.STONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));

    // Tunnelers
    public static final RegistryObject<Item> WOODEN_TUNNELER = ITEMS.register("wooden_tunneler", () -> new TunnelerItem(Tiers.WOOD, new Item.Properties(), 1));
    public static final RegistryObject<Item> STONE_TUNNELER = ITEMS.register("stone_tunneler", () -> new TunnelerItem(Tiers.STONE, new Item.Properties(), 1));
    public static final RegistryObject<Item> IRON_TUNNELER = ITEMS.register("iron_tunneler", () -> new TunnelerItem(Tiers.IRON, new Item.Properties(), 1));
    public static final RegistryObject<Item> GOLDEN_TUNNELER = ITEMS.register("golden_tunneler", () -> new TunnelerItem(Tiers.GOLD, new Item.Properties(), 1));
    public static final RegistryObject<Item> DIAMOND_TUNNELER = ITEMS.register("diamond_tunneler", () -> new TunnelerItem(Tiers.DIAMOND, new Item.Properties(), 2));
    public static final RegistryObject<Item> NETHERITE_TUNNELER = ITEMS.register("netherite_tunneler", () -> new TunnelerItem(Tiers.NETHERITE, new Item.Properties(), 3));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
