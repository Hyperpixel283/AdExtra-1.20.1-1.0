package de.hyperpixel.adextra.entities.vehicles.rockets.cosmetic.tier_5;

import com.mojang.blaze3d.vertex.PoseStack;
import earth.terrarium.ad_astra.client.renderer.entity.vehicle.VehicleRenderer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;

public class AdExtraRocketItemRendererTier5 extends BlockEntityWithoutLevelRenderer {
    public AdExtraRocketItemRendererTier5() {
        super(Minecraft.getInstance().getBlockEntityRenderDispatcher(), Minecraft.getInstance().getEntityModels());
    }

    public void m_108829_(ItemStack stack, ItemDisplayContext itemDisplayContext, PoseStack poseStack, MultiBufferSource buffer, int packedLight, int packedOverlay) {
        VehicleRenderer.renderRocketItem(AdExtraRocketRendererTier5.TEXTURE, AdExtraRocketModelTier5.TIER_5_LAYER, poseStack, buffer, packedLight, packedOverlay);
    }
}
