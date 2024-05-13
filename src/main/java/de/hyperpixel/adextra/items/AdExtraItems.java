package de.hyperpixel.adextra.items;

import com.teamresourceful.resourcefullib.common.registry.RegistryEntry;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistries;
import com.teamresourceful.resourcefullib.common.registry.ResourcefulRegistry;
import de.hyperpixel.adextra.AdExtra;
import de.hyperpixel.adextra.entities.AdExtraEntityTypes;
import earth.terrarium.ad_astra.common.item.vehicle.RocketItem;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;

public class AdExtraItems {
    public static final ResourcefulRegistry<Item> ITEMS = ResourcefulRegistries.create(BuiltInRegistries.ITEM, AdExtra.MODID);

    public static final ResourcefulRegistry<Item> VEHICLES = ResourcefulRegistries.create(ITEMS);

    public static final RegistryEntry<Item> TIER5_ROCKET_ITEM = VEHICLES.register("tier5_rocket_item", () -> new RocketItem(AdExtraEntityTypes.TIER5_ROCKET::get, new Item.Properties().stacksTo(1).fireResistant()));

}
