package lemon_juice.scalar_utils.item.custom.consumable_item;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.ClipContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class RunicWaterPlateItem extends BucketItem {
    private final Fluid content;

    public RunicWaterPlateItem(Properties properties) {
        super(Fluids.WATER, properties);
        this.content = Fluids.WATER;
    }

    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand interactionHand) {
        ItemStack itemStack = player.getItemInHand(interactionHand);
        BlockHitResult blockHitResult = getPlayerPOVHitResult(level, player, this.content == Fluids.EMPTY ? ClipContext.Fluid.SOURCE_ONLY : ClipContext.Fluid.NONE);
        InteractionResultHolder<ItemStack> ret = net.minecraftforge.event.ForgeEventFactory.onBucketUse(player, level, itemStack, blockHitResult);
        if (ret != null) return ret;
        if (blockHitResult.getType() == HitResult.Type.MISS) {
            return InteractionResultHolder.pass(itemStack);
        } else if (blockHitResult.getType() != HitResult.Type.BLOCK) {
            return InteractionResultHolder.pass(itemStack);
        } else {
            BlockPos blockPos = blockHitResult.getBlockPos();
            Direction direction = blockHitResult.getDirection();
            BlockPos blockPos1 = blockPos.relative(direction);
            if (level.mayInteract(player, blockPos) && player.mayUseItemAt(blockPos1, direction, itemStack)) {

                BlockState blockState = level.getBlockState(blockPos);
                BlockPos blockPos2 = canBlockContainFluid(level, blockPos, blockState) ? blockPos : blockPos1;
                if (this.emptyContents(player, level, blockPos2, blockHitResult, itemStack)) {
                    this.checkExtraContent(player, level, itemStack, blockPos2);
                    if (player instanceof ServerPlayer) {
                        CriteriaTriggers.PLACED_BLOCK.trigger((ServerPlayer) player, blockPos2, itemStack);
                    }

                    return InteractionResultHolder.sidedSuccess(getEmptySuccessItem(itemStack, player), level.isClientSide());
                } else {
                    return InteractionResultHolder.fail(itemStack);
                }
            } else {
            return InteractionResultHolder.fail(itemStack);
            }
        }
    }

    public static ItemStack getEmptySuccessItem(ItemStack itemStack, Player player) {
        // Shrink the itemStack by 1
        itemStack.shrink(1);

        // If the size of the stack is 0 return AIR
        if(itemStack.isEmpty()) return new ItemStack(Items.AIR);
        // Else return the stack
        else return itemStack;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.translatable("tooltip.scalar_utils.runic_water_plate"));
    }

    @Override
    public int getMaxStackSize(ItemStack stack) {
        return 16;
    }
}
