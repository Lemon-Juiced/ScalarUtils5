package lemon_juice.scalar_utils.item;

import lemon_juice.scalar_utils.ScalarUtils;
import lemon_juice.scalar_utils.block.ModBlocks;
import lemon_juice.scalar_utils.item.custom.*;
import lemon_juice.scalar_utils.item.custom.consumable_item.*;
import lemon_juice.scalar_utils.item.custom.curios_item.*;
import lemon_juice.scalar_utils.item.custom.decanter_item.DecanterOfEndlessFireItem;
import lemon_juice.scalar_utils.item.custom.decanter_item.DecanterOfEndlessWaterItem;
import lemon_juice.scalar_utils.item.custom.digger_item.GlassCutterItem;
import lemon_juice.scalar_utils.item.custom.digger_item.TunnelerItem;
import lemon_juice.scalar_utils.item.custom.necronite_item.*;
import lemon_juice.scalar_utils.item.custom.tiers.ModTiers;
import net.minecraft.core.Direction;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ScalarUtils.MOD_ID);

    // Crafting Items
    public static final RegistryObject<Item> BLAZING_END_ROD = ITEMS.register("blazing_end_rod", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHAINMAIL = ITEMS.register("chainmail", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUNIC_DIAMOND = ITEMS.register("runic_diamond", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STONE_ROD = ITEMS.register("stone_rod", () -> new Item(new Item.Properties()));

    // Flour
    public static final RegistryObject<Item> FLOUR = ITEMS.register("flour", () -> new FlourItem(new Item.Properties()));

    // Glass Cutter
    public static final RegistryObject<Item> GLASS_CUTTER = ITEMS.register("glass_cutter", () -> new GlassCutterItem(new Item.Properties()));

    // Jewelry
    public static final RegistryObject<Item> GLOVES = ITEMS.register("gloves", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PENDANT = ITEMS.register("pendant", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RING = ITEMS.register("ring", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DECANTER = ITEMS.register("decanter", () -> new Item(new Item.Properties()));

    // Necronite
    public static final RegistryObject<Item> NECRONITE_INGOT = ITEMS.register("necronite_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NECRONITE_NUGGET = ITEMS.register("necronite_nugget", () -> new Item(new Item.Properties()));
    /* Tools */
    public static final RegistryObject<Item> NECRONITE_SWORD = ITEMS.register("necronite_sword", () -> new NecroniteSwordItem(new Item.Properties()));
    public static final RegistryObject<Item> NECRONITE_SHOVEL = ITEMS.register("necronite_shovel", () -> new NecroniteShovelItem(new Item.Properties()));
    public static final RegistryObject<Item> NECRONITE_PICKAXE = ITEMS.register("necronite_pickaxe", () -> new NecronitePickaxeItem(new Item.Properties()));
    public static final RegistryObject<Item> NECRONITE_AXE = ITEMS.register("necronite_axe", () -> new NecroniteAxeItem(new Item.Properties()));
    public static final RegistryObject<Item> NECRONITE_HOE = ITEMS.register("necronite_hoe", () -> new NecroniteHoeItem(new Item.Properties()));
    /* Armor */
    public static final RegistryObject<Item> NECRONITE_HELMET = ITEMS.register("necronite_helmet", () -> new NecroniteArmorItem(ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> NECRONITE_CHESTPLATE = ITEMS.register("necronite_chestplate", () -> new NecroniteArmorItem(ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> NECRONITE_LEGGINGS = ITEMS.register("necronite_leggings", () -> new NecroniteArmorItem(ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> NECRONITE_BOOTS = ITEMS.register("necronite_boots", () -> new NecroniteArmorItem(ArmorItem.Type.BOOTS, new Item.Properties()));

    // Rune Carving Knife
    public static final RegistryObject<Item> RUNECARVING_KNIFE = ITEMS.register("runecarving_knife", () -> new RuneCarvingKnifeItem(new Item.Properties()));

    /* Runic Jewelries*/
    // Special Items
    public static final RegistryObject<Item> RUNIC_ANGEL_RING = ITEMS.register("runic_angel_ring", () -> new RunicAngelRingItem(new Item.Properties()));
    // Basic Items
    public static final RegistryObject<Item> RUNIC_GLOVES_OF_HEALING = ITEMS.register("runic_gloves_of_healing", () -> new AbstractHealingCurioItem(new Item.Properties()));
    public static final RegistryObject<Item> RUNIC_PENDANT_OF_HEALING = ITEMS.register("runic_pendant_of_healing", () -> new AbstractHealingCurioItem(new Item.Properties()));
    public static final RegistryObject<Item> RUNIC_RING_OF_HEALING = ITEMS.register("runic_ring_of_healing", () -> new AbstractHealingCurioItem(new Item.Properties()));
    public static final RegistryObject<Item> RUNIC_GLOVES_OF_SPEED = ITEMS.register("runic_gloves_of_speed", () -> new AbstractSpeedCurioItem(new Item.Properties()));
    public static final RegistryObject<Item> RUNIC_PENDANT_OF_SPEED = ITEMS.register("runic_pendant_of_speed", () -> new AbstractSpeedCurioItem(new Item.Properties()));
    public static final RegistryObject<Item> RUNIC_RING_OF_SPEED = ITEMS.register("runic_ring_of_speed", () -> new AbstractSpeedCurioItem(new Item.Properties()));
    public static final RegistryObject<Item> RUNIC_GLOVES_OF_STRENGTH = ITEMS.register("runic_gloves_of_strength", () -> new AbstractStrengthCurioItem(new Item.Properties()));
    public static final RegistryObject<Item> RUNIC_PENDANT_OF_STRENGTH = ITEMS.register("runic_pendant_of_strength", () -> new AbstractStrengthCurioItem(new Item.Properties()));
    public static final RegistryObject<Item> RUNIC_RING_OF_STRENGTH = ITEMS.register("runic_ring_of_strength", () -> new AbstractStrengthCurioItem(new Item.Properties()));
    public static final RegistryObject<Item> RUNIC_GLOVES_OF_WISDOM = ITEMS.register("runic_gloves_of_wisdom", () -> new AbstractWisdomCurioItem(new Item.Properties()));
    public static final RegistryObject<Item> RUNIC_PENDANT_OF_WISDOM = ITEMS.register("runic_pendant_of_wisdom", () -> new AbstractWisdomCurioItem(new Item.Properties()));
    public static final RegistryObject<Item> RUNIC_RING_OF_WISDOM = ITEMS.register("runic_ring_of_wisdom", () -> new AbstractWisdomCurioItem(new Item.Properties()));

    public static final RegistryObject<Item> RUNIC_DECANTER_OF_ENDLESS_FIRE = ITEMS.register("runic_decanter_of_endless_fire", () -> new DecanterOfEndlessFireItem(new Item.Properties()));
    public static final RegistryObject<Item> RUNIC_DECANTER_OF_ENDLESS_WATER = ITEMS.register("runic_decanter_of_endless_water", () -> new DecanterOfEndlessWaterItem(new Item.Properties()));


    // Runic Plates
    public static final RegistryObject<Item> RUNIC_PLATE = ITEMS.register("runic_plate", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUNIC_BOOSTER_PLATE = ITEMS.register("runic_booster_plate", () -> new RunicBoosterPlateItem(new Item.Properties()));
    public static final RegistryObject<Item> RUNIC_DROPPER_PLATE = ITEMS.register("runic_dropper_plate", () -> new RunicDropperPlateItem(new Item.Properties()));
    public static final RegistryObject<Item> RUNIC_HEALING_PLATE = ITEMS.register("runic_healing_plate", () -> new RunicHealingPlateItem(new Item.Properties()));
    public static final RegistryObject<Item> RUNIC_SPEED_PLATE = ITEMS.register("runic_speed_plate", () -> new RunicSpeedPlateItem(new Item.Properties()));
    public static final RegistryObject<Item> RUNIC_STRENGTH_PLATE = ITEMS.register("runic_strength_plate", () -> new RunicStrengthPlateItem(new Item.Properties()));
    public static final RegistryObject<Item> RUNIC_WISDOM_PLATE = ITEMS.register("runic_wisdom_plate", () -> new RunicWisdomPlateItem(new Item.Properties()));
    public static final RegistryObject<Item> RUNIC_FIRE_PLATE = ITEMS.register("runic_fire_plate", () -> new RunicFirePlateItem(new Item.Properties()));
    public static final RegistryObject<Item> RUNIC_WATER_PLATE = ITEMS.register("runic_water_plate", () -> new RunicWaterPlateItem(new Item.Properties()));

    public static final RegistryObject<Item> RUNE_OF_THE_TEMPLATE = ITEMS.register("rune_of_the_template", () -> new Item(new Item.Properties()));

    // Seeds
    public static final RegistryObject<Item> FLAX_SEEDS = ITEMS.register("flax_seeds", () -> new ItemNameBlockItem(ModBlocks.FLAX_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> CARROT_SEEDS = ITEMS.register("carrot_seeds", () -> new ItemNameBlockItem(Blocks.CARROTS, new Item.Properties()));
    public static final RegistryObject<Item> POTATO_SEEDS = ITEMS.register("potato_seeds", () -> new ItemNameBlockItem(Blocks.POTATOES, new Item.Properties()));
    public static final RegistryObject<Item> RICE = ITEMS.register("rice", () -> new ItemNameBlockItem(ModBlocks.RICE_CROP.get(), new Item.Properties().food(new FoodProperties.Builder().nutrition(2).saturationMod(2f).build())));

    // Slimeball Alternatives
    public static final RegistryObject<Item> GELATIN = ITEMS.register("gelatin", () -> new AbstractSlimeballAlternativeItem(new Item.Properties()));
    public static final RegistryObject<Item> RICE_SLIME_BALL = ITEMS.register("rice_slime_ball", () -> new AbstractSlimeballAlternativeItem(new Item.Properties()));
    public static final RegistryObject<Item> WHEAT_SLIME_BALL = ITEMS.register("wheat_slime_ball", () -> new AbstractSlimeballAlternativeItem(new Item.Properties()));

    // Torch BlockItems
    public static final RegistryObject<Item> REDSTONE_STONE_TORCH = ITEMS.register("redstone_stone_torch", () -> new StandingAndWallBlockItem(ModBlocks.REDSTONE_STONE_TORCH.get(), ModBlocks.REDSTONE_STONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> SOUL_STONE_TORCH = ITEMS.register("soul_stone_torch", () -> new StandingAndWallBlockItem(ModBlocks.SOUL_STONE_TORCH.get(), ModBlocks.SOUL_STONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> STONE_TORCH = ITEMS.register("stone_torch", () -> new StandingAndWallBlockItem(ModBlocks.STONE_TORCH.get(), ModBlocks.STONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> TINY_REDSTONE_STONE_TORCH = ITEMS.register("tiny_redstone_stone_torch", () -> new StandingAndWallBlockItem(ModBlocks.TINY_REDSTONE_STONE_TORCH.get(), ModBlocks.TINY_REDSTONE_STONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> TINY_REDSTONE_TORCH = ITEMS.register("tiny_redstone_torch", () -> new StandingAndWallBlockItem(ModBlocks.TINY_REDSTONE_TORCH.get(), ModBlocks.TINY_REDSTONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> TINY_SOUL_STONE_TORCH = ITEMS.register("tiny_soul_stone_torch", () -> new StandingAndWallBlockItem(ModBlocks.TINY_SOUL_STONE_TORCH.get(), ModBlocks.TINY_SOUL_STONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> TINY_SOUL_TORCH = ITEMS.register("tiny_soul_torch", () -> new StandingAndWallBlockItem(ModBlocks.TINY_SOUL_TORCH.get(), ModBlocks.TINY_SOUL_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> TINY_STONE_TORCH = ITEMS.register("tiny_stone_torch", () -> new StandingAndWallBlockItem(ModBlocks.TINY_STONE_TORCH.get(), ModBlocks.TINY_STONE_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));
    public static final RegistryObject<Item> TINY_TORCH = ITEMS.register("tiny_torch", () -> new StandingAndWallBlockItem(ModBlocks.TINY_TORCH.get(), ModBlocks.TINY_WALL_TORCH.get(), new Item.Properties(), Direction.DOWN));

    // Tunnelers
    public static final RegistryObject<Item> WOODEN_TUNNELER = ITEMS.register("wooden_tunneler", () -> new TunnelerItem(net.minecraft.world.item.Tiers.WOOD, new Item.Properties(), 1));
    public static final RegistryObject<Item> STONE_TUNNELER = ITEMS.register("stone_tunneler", () -> new TunnelerItem(net.minecraft.world.item.Tiers.STONE, new Item.Properties(), 1));
    public static final RegistryObject<Item> IRON_TUNNELER = ITEMS.register("iron_tunneler", () -> new TunnelerItem(net.minecraft.world.item.Tiers.IRON, new Item.Properties(), 1));
    public static final RegistryObject<Item> GOLDEN_TUNNELER = ITEMS.register("golden_tunneler", () -> new TunnelerItem(net.minecraft.world.item.Tiers.GOLD, new Item.Properties(), 1));
    public static final RegistryObject<Item> DIAMOND_TUNNELER = ITEMS.register("diamond_tunneler", () -> new TunnelerItem(net.minecraft.world.item.Tiers.DIAMOND, new Item.Properties(), 2));
    public static final RegistryObject<Item> NETHERITE_TUNNELER = ITEMS.register("netherite_tunneler", () -> new TunnelerItem(net.minecraft.world.item.Tiers.NETHERITE, new Item.Properties(), 3));
    public static final RegistryObject<Item> NECRONITE_TUNNELER = ITEMS.register("necronite_tunneler", () -> new NecroniteTunnelerItem(ModTiers.NECRONITE, new Item.Properties(), 4));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
