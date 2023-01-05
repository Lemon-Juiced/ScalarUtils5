package lemon_juice.scalar_utils.block.crop;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class AbstractBaseCrop extends CropBlock {
    private static final int minAge = 0;
    private static final int maxAge = 7;
    public static final IntegerProperty AGE = IntegerProperty.create("age", minAge, maxAge);
    public AbstractBaseCrop(Properties properties) {
        super(properties);
    }

    @Override
    public IntegerProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }
}
