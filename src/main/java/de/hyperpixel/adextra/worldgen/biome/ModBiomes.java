package de.hyperpixel.adextra.worldgen.biome;

import de.hyperpixel.adextra.AdExtra;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;

public class ModBiomes {
    public static final ResourceKey<Biome> PROXIMACENTB_WASTELAND = ResourceKey.create(Registries.BIOME,
            new ResourceLocation(AdExtra.MODID, "proximacentb_wasteland"));
    public static final ResourceKey<Biome> PROXIMACENTB_HILLS = ResourceKey.create(Registries.BIOME,
            new ResourceLocation(AdExtra.MODID, "proximacentb_hills"));

    private static ResourceKey<Biome> register(String name) {
        return ResourceKey.create(Registries.BIOME, new ResourceLocation(AdExtra.MODID, name));
    }
}
