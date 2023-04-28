package com.narrax.minecraft.oyoroi;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;
import com.narrax.minecraft.oyoroi.items.ModItems;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(OYoroi.MODID)
public class OYoroi {
	public static final String MODID = "oyoroi";
	public static final Logger LOGGER = LogUtils.getLogger();

	public OYoroi(){
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

		ModItems.ITEMS.register(modEventBus);

	}
}
