package lemon_juice.scalar_utils.loot;

import com.mojang.serialization.Codec;
import lemon_juice.scalar_utils.ScalarUtils;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModLootModifiers {
    public static final DeferredRegister<Codec<? extends IGlobalLootModifier>> LOOT_MODIFIER_SERIALIZERS = DeferredRegister.create(ForgeRegistries.Keys.GLOBAL_LOOT_MODIFIER_SERIALIZERS, ScalarUtils.MOD_ID);

    public static final RegistryObject<Codec<? extends IGlobalLootModifier>> ADD_ITEM = LOOT_MODIFIER_SERIALIZERS.register("add_item", AddItemModifier.CODEC);

    public static void register(IEventBus eventBus){
        LOOT_MODIFIER_SERIALIZERS.register(eventBus);
    }
}
