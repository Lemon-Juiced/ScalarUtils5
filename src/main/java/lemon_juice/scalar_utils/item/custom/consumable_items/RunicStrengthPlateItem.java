package lemon_juice.scalar_utils.item.custom.consumable_items;

import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class RunicStrengthPlateItem extends Item  {

    public RunicStrengthPlateItem(Properties properties) {
        super(properties);
    }

    @Override
    public int getMaxStackSize(ItemStack stack) {
        return 1;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if(!level.isClientSide() && (hand == InteractionHand.MAIN_HAND || hand == InteractionHand.OFF_HAND)){
            player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 100));
            player.setItemInHand(hand, ItemStack.EMPTY);
        }

        return super.use(level, player, hand);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.translatable("runic_strength_plate.tooltip"));
    }
}
