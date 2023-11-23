package lemon_juice.scalar_utils.item.custom.digger_item;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GlassCutterItem extends PickaxeItem {
    // Tier Is Set To Netherite To Avoid Conflicts With Reinforced Glass (Needs Diamond Tier To Mine)
    public GlassCutterItem(Properties properties) {
        super(Tiers.NETHERITE, 1, 1f, properties);
    }

    @Override
    public boolean isRepairable(ItemStack stack) {
        return false;
    }

    @Override
    public boolean mineBlock(ItemStack stack, Level level, BlockState blockState, BlockPos blockPos, LivingEntity livingEntity) {
        if (!level.isClientSide && blockState.getDestroySpeed(level, blockPos) != 0.0F) {
            stack.hurtAndBreak(1, livingEntity, (p_40992_) -> {
                p_40992_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
            });
        }

        return true;
    }

    @Override
    public int getMaxDamage(ItemStack stack) {
        return 1023;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.translatable("tooltip.scalar_utils.glass_cutter"));
        super.appendHoverText(stack, level, components, flag);
    }
}
