package de.hyperpixel.adextra;

import com.mojang.logging.LogUtils;
import de.hyperpixel.adextra.client.AdExtraClient;
import de.hyperpixel.adextra.item.AdExtraItems;
import earth.terrarium.ad_astra.client.forge.AdAstraClientForge;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.io.ObjectInputFilter;
import java.util.Map;
import java.util.Objects;

@Mod(AdExtra.MODID)
public class AdExtra  {

    public static final String MODID = "adextra";

    private static final Logger LOGGER = LogUtils.getLogger();

    public AdExtra()  {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)  {

    }

private void addCreative(BuildCreativeModeTabContentsEvent event)  {

    }
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)  {

    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}
