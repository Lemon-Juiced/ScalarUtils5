package lemon_juice.scalar_utils.block.custom.rune_block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class AbstractRuneboosterBlock extends Block {
    private final int seconds;

    public AbstractRuneboosterBlock(Properties properties, int seconds) {
        super(properties);
        this.seconds = seconds;
    }

    @Override
    public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity) {
        if(entity instanceof LivingEntity livingEntity) livingEntity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, seconds * 20));

        super.stepOn(level, pos, state, entity);
    }
}
