package de.hyperpixel.adextra.worldgen.dimension;

import de.hyperpixel.adextra.AdExtra;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;

public class ModDimensions {
    public static final ResourceKey<Level> PROXIMACENTB = ResourceKey.create(Registries.DIMENSION,
            new ResourceLocation(AdExtra.MODID, "proximacentb"));
    public static final ResourceKey<DimensionType> PROXIMACENTB_TYPE = ResourceKey.create(Registries.DIMENSION_TYPE,
            new ResourceLocation(AdExtra.MODID, "proximacentb_type"));
    public static final ResourceKey<Level> PROXIMACENTB_ORBIT = ResourceKey.create(Registries.DIMENSION,
            new ResourceLocation(AdExtra.MODID, "proximacentb_orbit"));
    public static final ResourceKey<DimensionType> PROXIMACENTB_ORBIT_TYPE = ResourceKey.create(Registries.DIMENSION_TYPE,
            new ResourceLocation(AdExtra.MODID, "proximacentb_orbit_type"));

    private static ResourceKey<NoiseGeneratorSettings> registerNoise(String name) {
        return ResourceKey.create(Registries.NOISE_SETTINGS, new ResourceLocation(AdExtra.MODID, name));
    }

    private static ResourceKey<LevelStem> register(String name) {
        return ResourceKey.create(Registries.LEVEL_STEM, new ResourceLocation(AdExtra.MODID, name));
    }

}
