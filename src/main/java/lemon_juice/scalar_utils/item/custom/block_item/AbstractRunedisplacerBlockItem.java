package lemon_juice.scalar_utils.item.custom.block_item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class AbstractRunedisplacerBlockItem extends BlockItem {
    private final int blockLimit;
    public AbstractRunedisplacerBlockItem(Block block, Properties properties, int blockLimit) {
        super(block, properties);
        this.blockLimit = blockLimit;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        if (blockLimit == 10) components.add(Component.translatable("tooltip.scalar_utils.basic_runedisplacer"));
        else if (blockLimit == 20) components.add(Component.translatable("tooltip.scalar_utils.advanced_runedisplacer"));
        else if (blockLimit == 30) components.add(Component.translatable("tooltip.scalar_utils.elite_runedisplacer"));
        else if (blockLimit == 40) components.add(Component.translatable("tooltip.scalar_utils.ultimate_runedisplacer"));
        else components.add(Component.translatable("tooltip.scalar_utils.transcendent_runedisplacer"));

        components.add(Component.translatable("tooltip.scalar_utils.wip"));

        super.appendHoverText(stack, level, components, flag);
    }
}
