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
    private final String tier;

    public AbstractRunedisplacerBlock(Properties properties, int blockLimit, String tier) {
        super(properties);
        this.blockLimit = blockLimit;
        this.tier = tier;
    }

    public String getTier(){
        return tier;
    }

    public int getBlockLimit(){
        return blockLimit;
    }

    @Override
    public void stepOn(Level level, BlockPos blockPos, BlockState blockState, Entity entity) {
        // First check if the entity is a player
        if(entity instanceof Player player){
            double playerX = player.getX();
            double playerZ = player.getZ();

            // Then check if the player is shifting
            if(player.isShiftKeyDown()){
                int yDisplacementPos = isValidBlockBelow(level, blockPos);
                player.setPos(playerX, yDisplacementPos, playerZ);
            }

            // Then check if the player is jumping (if their y velocity is greater than nothing)
            if(player.getDeltaMovement().y() >= 0){
                int yDisplacementPos = isValidBlockBelow(level, blockPos);
                player.setPos(playerX, yDisplacementPos, playerZ);
            }
        }

        super.stepOn(level, blockPos, blockState, entity);
    }

    /**
     * Returns a valid block's y position above the current block
     * This requires checking that the block is correct and that there is two blocks of air above it
     *
     * @param level The current level
     * @param blockPos The position of the current block
     * @return a valid block's y position above the current block, or 0 if one does not exist
     */
    private int isValidBlockAbove(Level level, BlockPos blockPos) {
        int y = 0; //Stays null if no valid block could be found

        // Decrement by 64 because world goes to -64 (this will be changed to account for the block limit)
        for (int i = 0; i < blockPos.getY() - 64; i++) {
            Block blockAti = level.getBlockState(blockPos).getBlock();
            Block blockAbove = level.getBlockState(blockPos.above(i)).getBlock();
            Block blockAboveBlockAbove = level.getBlockState(blockPos.above(i).above(i)).getBlock();

            if(isRunedisplacer(blockAti)){
                if(isAir(blockAbove) && isAir(blockAboveBlockAbove)) {
                    y = blockPos.above(i).getY();
                    break;
                }
            }
        }

        return y;
    }

    /**
     * Returns a valid block's y position below the current block
     * This requires checking that the block is correct and that there is two blocks of air above it
     *
     * @param level The current level
     * @param blockPos The position of the current block
     * @return a valid block below the current block, or null if one does not exist
     */
    private int isValidBlockBelow(Level level, BlockPos blockPos) {
        int y = 0; //Stays null if no valid block could be found

        // Increment by 64 because world goes to -64 (this will be changed to account for the block limit)
        for (int i = 0; i < blockPos.getY() + 64; i++) {
            Block blockBelow = level.getBlockState(blockPos.below(i)).getBlock();
            Block blockAti = level.getBlockState(blockPos).getBlock();
            Block blockAbove = level.getBlockState(blockPos.above(i)).getBlock();

            if(isRunedisplacer(blockBelow)){
                if(isAir(blockAti) && isAir(blockAbove)) {
                    y = blockPos.getY();
                    break;
                }
            }
        }

        return y;
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
