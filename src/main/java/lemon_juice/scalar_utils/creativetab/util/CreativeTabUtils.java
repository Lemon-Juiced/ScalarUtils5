package lemon_juice.scalar_utils.creativetab.util;

import lemon_juice.scalar_utils.block.ModBlocks;
import lemon_juice.scalar_utils.block.custom.lighting.AbstractLampBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTabUtils {
    public static Item getRainbowLampItem(){
        Block lampItem = null;
        for(RegistryObject<Block> block : ModBlocks.BLOCKS.getEntries())
            if(block.get() instanceof AbstractLampBlock)
                lampItem = block.get();
        return lampItem.asItem(); //This works because the last lamp is rainbow
    }
}
