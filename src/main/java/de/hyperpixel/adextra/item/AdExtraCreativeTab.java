package de.hyperpixel.adextra.item;

import com.teamresourceful.resourcefullib.common.item.tabs.ResourcefulCreativeTab;
import de.hyperpixel.adextra.AdExtra;
import earth.terrarium.ad_astra.common.registry.ModFluids;
import earth.terrarium.ad_astra.common.util.FluidUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

@SuppressWarnings({"unused", "SameParameterValue"})
public class AdExtraCreativeTab {

    public static final Supplier<CreativeModeTab> TAB = new ResourcefulCreativeTab(new ResourceLocation(AdExtra.MODID, "main"))
            .setItemIcon(AdExtraItems.TIER_5_ROCKET)
            .addContent(AdExtraCreativeTab::getCustomNbtItems)
            .addRegistry(AdExtraItems.ITEMS)
            .build();

    public static Stream<ItemStack> getCustomNbtItems() {
        List<ItemStack> list = new ArrayList<>();

        list.add(new ItemStack(AdExtraItems.TIER_5_ROCKET.get()));

        return list.stream();
    }

    public static void init() {} // NO-OP
}
