package lemon_juice.scalar_utils.item.custom.necronite_item;

import lemon_juice.scalar_utils.item.custom.digger_item.TunnelerItem;
import lemon_juice.scalar_utils.item.custom.tier.ModTiers;

public class NecroniteTunnelerItem extends TunnelerItem {
    public NecroniteTunnelerItem(Properties properties, int radius) {
        super(ModTiers.NECRONITE_TIER, properties, radius);
    }

    @Override
    public boolean isFireResistant() {
        return true;
    }
}
