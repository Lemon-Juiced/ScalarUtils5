package lemon_juice.scalar_utils.block.custom.rune_block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class AbstractRunedisplacerBlock extends Block {
    private final int blockLimit;

    public AbstractRunedisplacerBlock(Properties properties, int blockLimit) {
        super(properties);
        this.blockLimit = blockLimit;
    }

    @Override
    public void stepOn(Level level, BlockPos blockPos, BlockState blockState, Entity entity) {
        // First check if the entity is a player
        if(entity instanceof Player player){
            double playerX = player.getX();
            double playerZ = player.getZ();

            // Then check if the player is shifting
            if(player.isShiftKeyDown()){
                Block displaceLocation = isValidBlockBelow(player);
            }

            // Then check if the player is jumping (if their y velocity is greater than nothing)
            if(player.getDeltaMovement().y() >= 0){

            }
        }

        super.stepOn(level, blockPos, blockState, entity);
    }

    /**
     * Returns a valid block above the current block
     * This requires checking that the block is correct and that there is two blocks of air above it
     *
     * @param player The player
     * @return a valid block above the current block, or null if one does not exist
     */
    private Block isValidBlockAbove(Player player) {
        BlockPos blockPos = player.getOnPos();
        Block finalBlock = null; //Stays null if no valid block could be found

        // Decrement by 64 because world goes to -64 (this will be changed to account for the block limit)
        for (int i = 0; i < blockPos.getY() - 64; i++) {
            Block blockAti = player.level().getBlockState(blockPos).getBlock();
            Block blockAbove = player.level().getBlockState(blockPos.above(i)).getBlock();
            Block blockAboveBlockAbove = player.level().getBlockState(blockPos.above(i).above(i)).getBlock();

            if(isRunedisplacer(blockAti)){
                if(isAir(blockAbove) && isAir(blockAboveBlockAbove)) {
                    finalBlock = player.level().getBlockState(blockPos.above(i)).getBlock();
                    break;
                }
            }
        }

        return finalBlock;
    }

    /**
     * Returns a valid block below the current block
     * This requires checking that the block is correct and that there is two blocks of air above it
     *
     * @param player The player
     * @return a valid block below the current block, or null if one does not exist
     */
    private Block isValidBlockBelow(Player player) {
        BlockPos blockPos = player.getOnPos();
        Block finalBlock = null; //Stays null if no valid block could be found

        // Increment by 64 because world goes to -64 (this will be changed to account for the block limit)
        for (int i = 0; i < blockPos.getY() + 64; i++) {
            Block blockBelow = player.level().getBlockState(blockPos.below(i)).getBlock();
            Block blockAti = player.level().getBlockState(blockPos).getBlock();
            Block blockAbove = player.level().getBlockState(blockPos.above(i)).getBlock();

            if(isRunedisplacer(blockBelow)){
                if(isAir(blockAti) && isAir(blockAbove)) {
                    finalBlock = player.level().getBlockState(blockPos).getBlock();
                    break;
                }
            }
        }

        return finalBlock;
    }

    private boolean isRunedisplacer(Block block) {
        if(block instanceof AbstractRunedisplacerBlock) return true;
        else return false;
    }

    private boolean isAir(Block block){
        if(block==Blocks.AIR) return true;
        else return false;
    }
}
