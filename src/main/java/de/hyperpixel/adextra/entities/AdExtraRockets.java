package de.hyperpixel.adextra.entities;

import de.hyperpixel.adextra.items.AdExtraItems;
import de.hyperpixel.adextra.tags.AdExtraFluidTags;
import earth.terrarium.ad_astra.common.entity.vehicle.Rocket;
import net.minecraft.world.entity.EntityType;

import java.util.Map;
import java.util.logging.Level;

public class AdExtraRockets extends Rocket {
    private static final Rocket TIER5_PROPERTIES = new Rocket(5, AdExtraItems.TIER5_ROCKET_ITEM.get(), 1.5f, AdExtraFluidTags.TIER5_ROCKET_FUEL);

    public static final Map<EntityType<?>, Rocket> COSMIC_ROCKET_PROPERTIES = Map.of(
            AdExtraEntityTypes.TIER5_ROCKET.get(), TIER5_PROPERTIES);

    public AdExtraRockets(EntityType<?> type, Level level) {
        super(type, level, COSMIC_ROCKET_PROPERTIES.get(type));
    }
}
