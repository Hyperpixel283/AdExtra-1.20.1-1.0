package de.hyperpixel.adextra.client;

import de.hyperpixel.adextra.entities.AdExtraEntityTypes;
import de.hyperpixel.adextra.entities.vehicles.rockets.cosmetic.tier_5.AdExtraRocketItemRendererTier5;
import de.hyperpixel.adextra.entities.vehicles.rockets.cosmetic.tier_5.AdExtraRocketModelTier5;
import de.hyperpixel.adextra.entities.vehicles.rockets.cosmetic.tier_5.AdExtraRocketRendererTier5;
import de.hyperpixel.adextra.item.AdExtraItems;
import earth.terrarium.ad_astra.client.registry.ClientModEntities;
import earth.terrarium.botarium.client.ClientHooks;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

import java.util.function.BiConsumer;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class AdExtraClient {

    public static void init() {
        registerEntityRenderers();
    }
    public static void registerEntityRenderers() {
        ClientHooks.registerEntityRenderer(AdExtraEntityTypes.TIER_5_ROCKET, AdExtraRocketRendererTier5::new);
    }

    public static void registerEntityLayers(ClientModEntities.LayerDefinitionRegistry registry) {
        registry.register(AdExtraRocketModelTier5.TIER_5_LAYER, AdExtraRocketModelTier5::createTier5Layer);
    }

    public abstract static class LayerDefinitionRegistry {
        public LayerDefinitionRegistry() {
        }

        public abstract void register(ModelLayerLocation var1, Supplier<LayerDefinition> var2);
    }

    public static void onRegisterItemRenderers(BiConsumer<ItemLike, BlockEntityWithoutLevelRenderer> register) {
        register.accept((ItemLike)AdExtraItems.TIER_5_ROCKET.get(), new AdExtraRocketItemRendererTier5());
    }

}
