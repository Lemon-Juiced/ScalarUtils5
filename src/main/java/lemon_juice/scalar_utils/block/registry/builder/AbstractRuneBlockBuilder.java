package lemon_juice.scalar_utils.block.registry.builder;

import lemon_juice.scalar_utils.block.custom.rune_block.AbstractRuneboosterBlock;
import lemon_juice.scalar_utils.block.custom.rune_block.AbstractRunedisplacerBlock;
import lemon_juice.scalar_utils.block.custom.rune_block.AbstractRuneshifterBlock;
import lemon_juice.scalar_utils.block.registry.ModBlockRegistry;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class AbstractRuneBlockBuilder {
    public static final String[] runeTiers = {"basic", "advanced", "elite", "ultimate", "transcendent"};

    /**
     * Registers a Runebooster block for all tiers in <code>runeTiers</code>
     */
    public static void runeboosterBlockBuilder(){
        int[] seconds = {5, 10, 15, 20, 1000};
        for (int i = 0; i < runeTiers.length; i++) {
            int finalI = i;
            ModBlockRegistry.registerRuneboosterBlock(runeTiers[i] + "_runebooster", () -> new AbstractRuneboosterBlock(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F), seconds[finalI]), seconds[i]);
        }
    }

    /**
     * Registers a Runedropper block for all tiers in <code>runeTiers</code>
     */
    public static void runedropperBlockBuilder(){
        int[] blocks = {5, 10, 15, 20, 1000};
        for (int i = 0; i < runeTiers.length; i++) {
            int finalI = i;
            ModBlockRegistry.registerRunedropperBlock(runeTiers[i] + "_runedropper", () -> new AbstractRuneboosterBlock(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F), blocks[finalI]), blocks[i]);
        }
    }

    /**
     * Registers a Runeshifter block for all tiers in <code>runeTiers</code> for each direction in <code>directions</code>
     */
    public static void runeshifterBlockBuilder(){
        double initialVelocity = .1;
        String[] directions = {"north", "south", "west", "east"};
        for (int i = 0; i < runeTiers.length; i++) {
            for (int j = 0; j < directions.length; j++) {
                int finalI = i, finalJ = j;
                ModBlockRegistry.registerRuneshifterBlock(runeTiers[i] + "_runeshifter_" + directions[j], () -> new AbstractRuneshifterBlock(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F), directions[finalJ], (initialVelocity * (finalI +1))),  directions[j]);
            }
        }
    }

    /**
     * Registers a Runedisplacer block for all tiers in <code>runeTiers</code>
     */
    public static void runeDisplacerBlockBuilder(){
        int[] blockLimit = {10, 20, 30, 40, 320};
        for (int i = 0; i < runeTiers.length ; i++) {
            int finalI = i;
            ModBlockRegistry.registerRunedisplacerBlock(runeTiers[i] + "_runedisplacer", () -> new AbstractRunedisplacerBlock(BlockBehaviour.Properties.copy(Blocks.STONE).requiresCorrectToolForDrops().strength(1.5F, 6.0F), blockLimit[finalI]), blockLimit[i]);
        }
    }

    /**
     * Runs all runeBlockBuilder methods
     */
    public static void registerAllRuneBlocks(){
        runeboosterBlockBuilder();
        runedropperBlockBuilder();
        runeshifterBlockBuilder();
        runeDisplacerBlockBuilder();
    }
}
