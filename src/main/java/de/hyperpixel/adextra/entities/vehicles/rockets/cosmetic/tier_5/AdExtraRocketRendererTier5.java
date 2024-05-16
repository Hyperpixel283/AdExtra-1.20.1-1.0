package de.hyperpixel.adextra.entities.vehicles.rockets.cosmetic.tier_5;

import de.hyperpixel.adextra.entities.vehicles.rockets.AdExtraRocketTier5;
import earth.terrarium.ad_astra.client.renderer.entity.vehicle.VehicleRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class AdExtraRocketRendererTier5 extends VehicleRenderer<AdExtraRocketTier5, AdExtraRocketModelTier5> {
    public static final ResourceLocation TEXTURE = new ResourceLocation("adextra", "textures/vehicles/tier_5_rocket.png");

    public AdExtraRocketRendererTier5(EntityRendererProvider.Context context) {
        super(context, new AdExtraRocketModelTier5(context.bakeLayer(AdExtraRocketModelTier5.TIER_5_LAYER)), 0.5F);
    }

    public @NotNull ResourceLocation getTextureLocation(AdExtraRocketTier5 entity) {
        return TEXTURE;
    }
}
