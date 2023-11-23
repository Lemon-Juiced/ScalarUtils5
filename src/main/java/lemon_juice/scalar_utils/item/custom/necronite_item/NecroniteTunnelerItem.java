package lemon_juice.scalar_utils.item.custom.necronite_item;

import lemon_juice.item.custom.TunnelerItem;
import lemon_juice.item.tier.LembraryTiers;

public class NecroniteTunnelerItem extends TunnelerItem {
    public NecroniteTunnelerItem(Properties properties, int radius) {
        super(LembraryTiers.NECRONITE_TIER, properties, radius);
    }

    @Override
    public boolean isFireResistant() {
        return true;
    }
}
