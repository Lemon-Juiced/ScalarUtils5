package lemon_juice.scalar_utils.item.custom.necronite_item;

import lemon_juice.item.tier.LembraryTiers;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class NecroniteHoeItem extends HoeItem {
    public NecroniteHoeItem(Properties properties) {
        super(LembraryTiers.NECRONITE_TIER, -5, 0.0f, properties);
    }

    @Override
    public boolean isFireResistant() {
        return true;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.translatable("tooltip.scalar_utils.unbreakable").withStyle(ChatFormatting.RED));
    }
}
