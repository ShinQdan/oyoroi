package com.narrax.minecraft.oyoroi.items;

import com.narrax.minecraft.oyoroi.OYoroi;

import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = OYoroi.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItemColors {
	@SubscribeEvent
	public static void registerItemColors(RegisterColorHandlersEvent.Item event){
		event.register(
			(stack, index) -> {
				if(index!=1 && index!=4 && stack.getItem() instanceof OYoroiItem oyItem){
					return oyItem.getColor(stack);
				}else return -1;
			},
			ModItems.ITEMS.getEntries().stream().map(ro -> ro.get()).filter(i -> i instanceof OYoroiItem).toList().toArray(new Item[0])
		);
	}
}
