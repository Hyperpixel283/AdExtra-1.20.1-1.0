package de.hyperpixel.adextra.entities;

import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistries;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistry;
import earth.terrarium.ad_astra.AdAstra;
import earth.terrarium.ad_astra.common.entity.vehicle.Rocket;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class AdExtraEntityTypes {
    public static final ResourcefulRegistry<EntityType<?>> ENTITY_TYPES = ResourcefulRegistries.create(BuiltInRegistries.ENTITY_TYPE, AdAstra.MOD_ID);

    public static final RegistryEntry<EntityType<Rocket>> TIER5_ROCKET = ENTITY_TYPES.register("tier5_rocket", () ->
            EntityType.Builder.<Rocket>of(AdExtraRockets::new, MobCategory.MISC)
                    .fireImmune()
                    .clientTrackingRange(10)
                    .sized(1.1f, 7.0f)
                    .build("tier_5_rocket"));
}
