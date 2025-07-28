package net.lilfoxmcmodder.item;

import net.lilfoxmcmodder.crystalend.LilFoxMCsCrystalEnd;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LilFoxMCsCrystalEnd.MOD_ID);

    public static final RegistryObject<Item> CRYSTAL = ITEMS.register("crystal", () -> new Item(new Item.Properties()));

    // possible crystal Ingot

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
