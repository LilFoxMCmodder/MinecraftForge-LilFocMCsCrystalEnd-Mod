package net.lilfoxmcmodder.item;

import com.google.common.io.LittleEndianDataInputStream;
import net.lilfoxmcmodder.crystalend.LilFoxMCsCrystalEnd;
import net.lilfoxmcmodder.item.custom.CrystalChiselItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class Moditems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, LilFoxMCsCrystalEnd.MOD_ID);

    public static final RegistryObject<Item> CRYSTAL = ITEMS.register("crystal",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CRYSTAL_INGOT = ITEMS.register("crystal_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CRYSTAL_CHISEL = ITEMS.register("crystal_chisel",
            () -> new CrystalChiselItem(new Item.Properties().durability(35)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
