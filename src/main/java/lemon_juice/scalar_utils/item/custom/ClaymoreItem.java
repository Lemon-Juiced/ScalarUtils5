package lemon_juice.scalar_utils.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ClaymoreItem extends SwordItem {
    public ClaymoreItem(Tier tier, int attackDamage, float speed, Properties properties) {
        super(tier, attackDamage + 2, speed - 1.0F, properties);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag tooltipFlag) {
        components.add(Component.translatable("tooltip.scalar_utils.cleaver"));
    }
}
