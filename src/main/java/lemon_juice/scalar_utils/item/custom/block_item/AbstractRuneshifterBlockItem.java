package lemon_juice.scalar_utils.item.custom.block_item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class AbstractRuneshifterBlockItem extends BlockItem {
    private final String direction;
    public AbstractRuneshifterBlockItem(Block block, Properties properties, String direction) {
        super(block, properties);
        this.direction = direction;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        switch (direction) {
            case "north" -> components.add(Component.translatable("tooltip.scalar_utils.runeshifter").append(Component.translatable("tooltip.scalar_utils.north")));
            case "south" -> components.add(Component.translatable("tooltip.scalar_utils.runeshifter").append(Component.translatable("tooltip.scalar_utils.south")));
            case "west" -> components.add(Component.translatable("tooltip.scalar_utils.runeshifter").append(Component.translatable("tooltip.scalar_utils.west")));
            case "east" -> components.add(Component.translatable("tooltip.scalar_utils.runeshifter").append(Component.translatable("tooltip.scalar_utils.east")));
            default -> {}
        }

        super.appendHoverText(stack, level, components, flag);
    }
}
