package net.noah.pooliummod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.noah.pooliummod.PooliumMod;

// Registers the modded items
public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PooliumMod.MOD_ID);

    // Makes a barebones item
    public static final RegistryObject<Item> POOLIUM_INGOT = ITEMS.register("poolium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_POOLIUM = ITEMS.register("raw_poolium",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
