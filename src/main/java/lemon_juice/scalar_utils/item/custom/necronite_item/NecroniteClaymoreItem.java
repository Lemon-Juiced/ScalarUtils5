package lemon_juice.scalar_utils.item.custom.necronite_item;

import lemon_juice.item.tier.LembraryTiers;
import lemon_juice.scalar_utils.item.custom.ClaymoreItem;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class NecroniteClaymoreItem extends ClaymoreItem {
    public NecroniteClaymoreItem(Properties properties) {
        super(LembraryTiers.NECRONITE_TIER, 4, -2.4f,  properties);
    }

    @Override
    public boolean isFireResistant() {
        return true;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.translatable("tooltip.scalar_utils.unbreakable").withStyle(ChatFormatting.RED));
        components.add(Component.translatable("tooltip.scalar_utils.cleaver"));
    }
}
