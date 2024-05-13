package de.hyperpixel.adextra.tags;

import de.hyperpixel.adextra.AdExtra;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.material.Fluid;

public class AdExtraFluidTags {
    public static final TagKey<Fluid> TIER5_ROCKET_FUEL = tag("tier5_rocket_fuel");

    private static TagKey<Fluid> tag(String name) {
        return TagKey.create(Registries.FLUID, new ResourceLocation(AdExtra.MODID, name));
    }
}
