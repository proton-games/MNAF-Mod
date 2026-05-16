package com.red_foxy.mnaf_mod;

import com.mojang.logging.LogUtils;
import com.red_foxy.mnaf_mod.registers.BlockRegistry;
import com.red_foxy.mnaf_mod.registers.CreativeTabGroupRegistry;
import com.red_foxy.mnaf_mod.registers.ItemRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

@Mod(MNAFMod.MOD_ID)
public class MNAFMod
{
    public static final String MOD_ID = "mnaf_mod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public MNAFMod(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();

        BlockRegistry.BLOCKS.register(modEventBus);
        LOGGER.info("BlockRegistry registered BLOCKS");

        ItemRegistry.ITEMS.register(modEventBus);
        LOGGER.info("ItemRegistry registered ITEMS");

        CreativeTabGroupRegistry.CREATIVE_MODE_TABS.register(modEventBus);
        LOGGER.info("CreativeTabGroupRegistry registered CREATIVE_MODE_TABS");

        MinecraftForge.EVENT_BUS.register(this);
        context.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
