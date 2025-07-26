package net.lilfoxmcmodder.sound;

import net.lilfoxmcmodder.crystalend.LilFoxMCsCrystalEnd;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, LilFoxMCsCrystalEnd.MOD_ID);

    public static final RegistryObject<SoundEvent> CRYSTALITE_ORE_BLOCK_BREAK= registerSoundEvent("crystalite_ore_block_break");
    public static final RegistryObject<SoundEvent> CRYSTALITE_ORE_BLOCK_STEP= registerSoundEvent("crystalite_ore_block_step");
    public static final RegistryObject<SoundEvent> CRYSTALITE_ORE_BLOCK_PLACE= registerSoundEvent("crystalite_ore_block_place");
    public static final RegistryObject<SoundEvent> CRYSTALITE_ORE_BLOCK_HIT= registerSoundEvent("crystalite_ore_block_hit");
    public static final RegistryObject<SoundEvent> CRYSTALITE_ORE_BLOCK_FALL= registerSoundEvent("crystalite_ore_block_fall");

    public static final ForgeSoundType  CRYSTALITE_ORE_BLOCK_SOUNDS = new ForgeSoundType(1f, 1f,
            ModSounds.CRYSTALITE_ORE_BLOCK_BREAK, ModSounds.CRYSTALITE_ORE_BLOCK_STEP, ModSounds.CRYSTALITE_ORE_BLOCK_PLACE, ModSounds.CRYSTALITE_ORE_BLOCK_HIT, ModSounds.CRYSTALITE_ORE_BLOCK_FALL);

    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath(LilFoxMCsCrystalEnd.MOD_ID, name)));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
