package io.github.DevRenwick.DndMod;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.github.DevRenwick.DndMod.core.init.ItemsInit;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(DndMod.MOD_ID)
public class DndMod
{
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "sirdikalot_dnd";
    public DndMod() {
        // Register the setup method for modloading
    	//here we created a field called Bus. So when we call our register we can use bus.
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        
        ItemsInit.ITEMS.register(bus);
        
        MinecraftForge.EVENT_BUS.register(this);
        
        
    }

    private void setup(final FMLCommonSetupEvent event)
    {

    }
}
