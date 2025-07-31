package net.lilfoxmcmodder.blocks;

import net.lilfoxmcmodder.crystalend.LilFoxMCsCrystalEnd;
import net.lilfoxmcmodder.item.Moditems;
import net.lilfoxmcmodder.sound.ModSounds;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create
                    (ForgeRegistries.BLOCKS, LilFoxMCsCrystalEnd.MOD_ID);



    public static final RegistryObject<Block> CRYSTALITE_BLOCK = registryBlock("crystalite_block_ore",
            () ->new DropExperienceBlock(UniformInt.of(1,1), BlockBehaviour.Properties.of()
                    .strength(50,1200f)
                    .requiresCorrectToolForDrops()
                    .sound(ModSounds.CRYSTALITE_ORE_BLOCK_SOUNDS)));




    public static final RegistryObject<Block> CRYSTAL_BLOCK = registryBlock("crystal_block",
            () ->new Block(BlockBehaviour.Properties.of()
                    .strength(30f,1200f)
                    .requiresCorrectToolForDrops()
                    .sound(ModSounds.CRYSTAL_BLOCK_SOUNDS)));


    //---


    private static <T extends Block> RegistryObject<T> registryBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }



    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        Moditems.ITEMS.register(name, () ->new BlockItem(block.get(), new Item.Properties()));
    }



    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
