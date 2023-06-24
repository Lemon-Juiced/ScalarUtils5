package lemon_juice.scalar_utils.item.custom.necronite_item;

import lemon_juice.scalar_utils.item.custom.digger_item.TunnelerItem;
import lemon_juice.scalar_utils.item.custom.tiers.ModTiers;
import net.minecraft.world.item.Tier;

public class NecroniteTunnelerItem extends TunnelerItem {
    public NecroniteTunnelerItem(Properties properties, int radius) {
        super(ModTiers.NECRONITE, properties, radius);
    }

    @Override
    public boolean isFireResistant() {
        return true;
    }
}
