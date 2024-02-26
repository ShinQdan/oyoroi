package com.narrax.minecraft.oyoroi;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;
import com.narrax.minecraft.oyoroi.items.ModItems;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(OYoroi.MODID)
public class OYoroi {
	public static final String MODID = "oyoroi";
	public static final Logger LOGGER = LogUtils.getLogger();

	public OYoroi(IEventBus modEventBus){
		ModItems.ITEMS.register(modEventBus);
	}
}
