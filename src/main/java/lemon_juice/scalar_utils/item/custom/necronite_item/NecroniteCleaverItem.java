package lemon_juice.scalar_utils.item.custom.necronite_item;

import lemon_juice.scalar_utils.item.custom.CleaverItem;
import lemon_juice.scalar_utils.item.custom.tiers.ModTiers;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Properties;

public class NecroniteCleaverItem extends CleaverItem {
    public NecroniteCleaverItem(Properties properties) {
        super(ModTiers.NECRONITE, 4, -2.4f,  properties);
    }

    @Override
    public boolean isFireResistant() {
        return true;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.translatable("unbreakable.tooltip").withStyle(ChatFormatting.RED));
        components.add(Component.translatable("cleaver.tooltip"));
    }
}
