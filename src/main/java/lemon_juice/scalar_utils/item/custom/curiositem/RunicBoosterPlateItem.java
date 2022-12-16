package lemon_juice.scalar_utils.item.custom.curiositem;

import lemon_juice.scalar_utils.item.ModItems;
import net.minecraft.client.gui.screens.social.PlayerEntry;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.util.LazyOptional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.CuriosCapability;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurio;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

import java.util.List;
import java.util.Objects;

public class RunicBoosterPlateItem extends Item implements ICurioItem {

    public RunicBoosterPlateItem(Properties properties) {
        super(properties);
    }

    @Override
    public int getMaxStackSize(ItemStack stack) {
        return 1;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if(!level.isClientSide() && (hand == InteractionHand.MAIN_HAND || hand == InteractionHand.OFF_HAND)){
            player.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 20));
        }

        return super.use(level, player, hand);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.translatable("runic_booster_plate.tooltip"));
    }

    // Curios Integration
    @Override
    public void curioTick(SlotContext slotContext, ItemStack stack) {
        if(slotContext.getWearer() instanceof Player player){
            if(!player.level.isClientSide()){
                boolean playerHasJumpBoost = player.hasEffect(MobEffect.byId(8));

                if(!playerHasJumpBoost){
                    player.addEffect(new MobEffectInstance(MobEffects.JUMP, 200));
                }
            }
        }
        ICurioItem.super.curioTick(slotContext, stack);
    }
}
