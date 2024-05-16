package de.hyperpixel.adextra.entities;

import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import de.hyperpixel.adextra.entities.vehicles.rockets.AdExtraRocketTier5;
import earth.terrarium.ad_astra.common.registry.ModEntityTypes;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

public class AdExtraEntityTypes extends ModEntityTypes {
    public static final RegistryEntry<EntityType<AdExtraRocketTier5>> TIER_5_ROCKET = ENTITY_TYPES.register("tier_5_rocket", () ->
            EntityType.Builder.<AdExtraRocketTier5>of(AdExtraRocketTier5::new, MobCategory.MISC)
                    .sized(1.1F, 7.0F)
                    .clientTrackingRange(10)
                    .fireImmune()
                    .build("ad_astra"));
}
