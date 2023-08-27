package lemon_juice.scalar_utils.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;

public class AbstractRuneshifterBlock extends Block {
    private final String direction;

    public AbstractRuneshifterBlock(Properties properties, String direction) {
        super(properties);
        this.direction = direction;
    }

    @Override
    public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity) {
        switch (direction) {
            case "north" -> entity.addDeltaMovement(new Vec3(0, 0, -1)); // Negative Z
            case "south" -> entity.addDeltaMovement(new Vec3(0, 0, 1)); // Positive Z
            case "west" -> entity.addDeltaMovement(new Vec3(-1, 0, 0)); // Negative X
            case "east" -> entity.addDeltaMovement(new Vec3(1, 0, 0)); // Positive X
            default -> {}
        }

        super.stepOn(level, pos, state, entity);
    }
}
