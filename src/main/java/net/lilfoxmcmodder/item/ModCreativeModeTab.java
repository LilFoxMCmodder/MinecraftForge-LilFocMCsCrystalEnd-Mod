package net.lilfoxmcmodder.item;

import net.lilfoxmcmodder.blocks.ModBlocks;
import net.lilfoxmcmodder.crystalend.LilFoxMCsCrystalEnd;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LilFoxMCsCrystalEnd.MOD_ID);


    public static final RegistryObject<CreativeModeTab> LILFOXMCSCRYSTALEND_ITEMS_TAB = CREATIVE_MODE_TABS.register("lilfoxmcscrystalend_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Moditems.CRYSTAL.get()))
                    .title(Component.translatable("creativetab.lilfoxmcscrystalend.crystal_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Moditems.CRYSTAL.get());
                        output.accept(Moditems.CRYSTAL_INGOT.get());
                        output.accept(Moditems.CRYSTAL_CHISEL.get());
                    }).build());




    public static final RegistryObject<CreativeModeTab> LILFOXMCSCRYSTALEND_BlOCKS_TAB = CREATIVE_MODE_TABS.register("lilfoxmcscrystalend_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.CRYSTAL_BLOCK.get()))
                    .withTabsBefore(LILFOXMCSCRYSTALEND_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.lilfoxmcscrystalend.crystal_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                       output.accept(ModBlocks.CRYSTALITE_BLOCK.get());
                       output.accept(ModBlocks.CRYSTAL_BLOCK.get());
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

