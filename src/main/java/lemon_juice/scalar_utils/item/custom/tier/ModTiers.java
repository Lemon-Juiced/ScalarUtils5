package lemon_juice.scalar_utils.item.custom.tier;

import lemon_juice.scalar_utils.ScalarUtils;
import lemon_juice.scalar_utils.tag.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModTiers {
    /* WOOD(0, 59, 2.0F, 0.0F, 15, () -> {return Ingredient.of(ItemTags.PLANKS);}),
     * STONE(1, 131, 4.0F, 1.0F, 5, () -> {return Ingredient.of(ItemTags.STONE_TOOL_MATERIALS);}),
     * IRON(2, 250, 6.0F, 2.0F, 14, () -> {return Ingredient.of(Items.IRON_INGOT);}),
     * DIAMOND(3, 1561, 8.0F, 3.0F, 10, () -> {return Ingredient.of(Items.DIAMOND);}),
     * GOLD(0, 32, 12.0F, 0.0F, 22, () -> {return Ingredient.of(Items.GOLD_INGOT);}),
     * NETHERITE(4, 2031, 9.0F, 4.0F, 15, () -> {return Ingredient.of(Items.NETHERITE_INGOT);});
     */

    public static final Tier NECRONITE_TIER = TierSortingRegistry.registerTier(new ForgeTier(5, -1, 12.0F, 5.0F, 22, ModTags.Blocks.NEEDS_NECRONITE_TOOL, () -> Ingredient.of(ModTags.Items.INGOTS_NECRONITE)), new ResourceLocation(ScalarUtils.MOD_ID, "necronite"), List.of(Tiers.NETHERITE), List.of());
}
