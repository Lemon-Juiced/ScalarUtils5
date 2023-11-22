package lemon_juice.scalar_utils.block.registry.builder;

import lemon_juice.scalar_utils.block.ScalarUtilsBlocks;
import lemon_juice.scalar_utils.block.custom.lighting.AbstractLampBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class LampBlockBuilder {
    public static final String[] colors = {"white", "light_gray", "gray", "black", "brown", "red", "orange", "yellow",
            "lime", "green", "cyan", "light_blue", "blue", "purple", "magenta", "pink", "rainbow"};

    /**
     * Registers a Lamp block for all colors in <code>colors</code>
     */
    public static void lampBlockBuilder(){
        for (int i = 0; i < colors.length; i++) {
            ScalarUtilsBlocks.registerBlock(colors[i] + "_lamp", () -> new AbstractLampBlock(BlockBehaviour.Properties.copy(Blocks.REDSTONE_LAMP).lightLevel(state -> state.getValue(AbstractLampBlock.LIT) ? 15: 0).strength(0.3F).sound(SoundType.GLASS)));
        }
    }
}
