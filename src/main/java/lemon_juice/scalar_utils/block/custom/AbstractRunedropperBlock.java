package lemon_juice.scalar_utils.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class AbstractRunedropperBlock extends Block {
    private final int blocks;

    public AbstractRunedropperBlock(Properties properties, int blocks) {
        super(properties);
        this.blocks = blocks;
    }

    //Stops Entities from Taking Fall Damage on Unless they "Suppress the Bounce"
    @Override
    public void fallOn(Level level, BlockState state, BlockPos pos, Entity entity, float fallDistance) {
        if(entity.isSuppressingBounce()){
            super.fallOn(level, state, pos, entity, fallDistance);
        } else {
            entity.causeFallDamage(fallDistance-blocks, 1.0F, DamageSource.FALL);
        }
    }

}
