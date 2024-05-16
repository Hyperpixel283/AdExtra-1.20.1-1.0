package de.hyperpixel.adextra.entities.vehicles.rockets;

import de.hyperpixel.adextra.entities.AdExtraEntityTypes;
import de.hyperpixel.adextra.item.AdExtraItems;
import earth.terrarium.ad_astra.common.entity.vehicle.Rocket;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class AdExtraRocketTier5 extends Rocket {
    public AdExtraRocketTier5(Level level) {
        super((EntityType) AdExtraEntityTypes.TIER_5_ROCKET.get(), level, 5);
    }

    public AdExtraRocketTier5(EntityType<?> type, Level level) {
        super(type, level, 5);
    }

    public int getMaxPassengers() {
        return 2;
    }

    public double m_6048_() {return m_6048_() + 1.7000000476837158;
    }

    public boolean shouldSit() {
        return false;
    }

    @Override
    public int getInventorySize() {
        return 10;
    }



    public ItemStack getDropStack() {
        return ((Item) AdExtraItems.TIER_5_ROCKET.get()).getDefaultInstance();
    }
}
