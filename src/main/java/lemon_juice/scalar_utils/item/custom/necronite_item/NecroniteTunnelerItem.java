package lemon_juice.scalar_utils.item.custom.necronite_item;

import lemon_juice.scalar_utils.item.custom.diggeritem.TunnelerItem;
import net.minecraft.world.item.Tier;

public class NecroniteTunnelerItem extends TunnelerItem {
    public NecroniteTunnelerItem(Tier tier, Properties properties, int radius) {
        super(tier, properties, radius);
    }

    @Override
    public boolean isFireResistant() {
        return true;
    }
}
