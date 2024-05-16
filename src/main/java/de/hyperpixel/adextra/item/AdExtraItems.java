package de.hyperpixel.adextra.item;

import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistries;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistry;
import de.hyperpixel.adextra.AdExtra;
import earth.terrarium.ad_astra.common.item.vehicle.RocketItem;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;

public class AdExtraItems {

    public static final RegistryEntry<Item> TIER_5_ROCKET;

    public static final ResourcefulRegistry<Item> ITEMS = ResourcefulRegistries.create(BuiltInRegistries.ITEM, AdExtra.MODID);

    public static final ResourcefulRegistry<Item> VEHICLES = ResourcefulRegistries.create(ITEMS);

    static {
        TIER_5_ROCKET = AdExtraItems.VEHICLES.register("tier_5_rocket", () -> {
            return new RocketItem(5, (new Item.Properties()).stacksTo(1).fireResistant());
        });
    }
}