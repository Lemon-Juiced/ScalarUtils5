package lemon_juice.scalar_utils.item.custom.curios_item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

import java.util.List;

public class AbstractWisdomCurioItem extends Item implements ICurioItem {
    public AbstractWisdomCurioItem(Properties properties) {
        super(properties);
    }

    @Override
    public int getMaxStackSize(ItemStack stack) {
        return 1;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.translatable("tooltip.scalar_utils.abstract_wisdom_curio"));
    }

    // Curios Integration
    public void curioTick(SlotContext slotContext, ItemStack stack) {
        if(slotContext.getWearer() instanceof Player player){
            if(!player.level().isClientSide()){
                boolean playerHasRegeneration = player.hasEffect(MobEffect.byId(32));

                if(!playerHasRegeneration){
                    player.addEffect(new MobEffectInstance(MobEffects.HERO_OF_THE_VILLAGE, 200));
                }
            }
        }
        ICurioItem.super.curioTick(slotContext, stack);
    }
}
