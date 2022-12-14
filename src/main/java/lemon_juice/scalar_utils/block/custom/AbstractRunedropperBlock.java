package lemon_juice.scalar_utils.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class AbstractRunedropperBlock extends Block {
    private final int seconds;

    public AbstractRunedropperBlock(Properties properties, int seconds) {
        super(properties);
        this.seconds = seconds;
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult result) {
        if(!level.isClientSide() && hand == InteractionHand.MAIN_HAND){
            player.addEffect(new MobEffectInstance(MobEffects.SLOW_FALLING, seconds * 20));
        }

        return super.use(state, level, pos, player, hand, result);
    }
}
