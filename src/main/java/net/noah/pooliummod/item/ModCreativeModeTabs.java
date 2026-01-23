package net.noah.pooliummod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.noah.pooliummod.PooliumMod;
import net.noah.pooliummod.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PooliumMod.MOD_ID);

    // Creative Tab for ITEMS
    public static final RegistryObject<CreativeModeTab> POOLIUM_ITEMS_TAB = CREATIVE_MODE_TABS.register("poolium_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RAW_POOLIUM.get()))
                    .title(Component.translatable("creativetab.pooliummod.poolium_items"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.POOLIUM_INGOT.get());
                        pOutput.accept(ModItems.RAW_POOLIUM.get());

                    })
                    .build());

    // Creative Tab for BLOCKS
    public static final RegistryObject<CreativeModeTab> POOLIUM_BLOCKS_TAB = CREATIVE_MODE_TABS.register("poolium_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.POOLIUM_ORE.get()))
                    .withTabsBefore(POOLIUM_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.pooliummod.poolium_ore"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.POOLIUM_ORE.get());
                        pOutput.accept(ModBlocks.BORBUS_BLOCK.get());
                        pOutput.accept(ModBlocks.POOLIUM_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }


}
