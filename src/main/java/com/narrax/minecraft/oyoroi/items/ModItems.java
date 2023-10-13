package com.narrax.minecraft.oyoroi.items;

import com.narrax.minecraft.oyoroi.OYoroi;
import com.narrax.minecraft.oyoroi.items.OYoroiItem.ModelPointer;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = OYoroi.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OYoroi.MODID);

	public static final RegistryObject<Item> LAMELLAR_PLATE = ITEMS.register("iron_lamellar_plate", () -> new Item(new Properties()));
	public static final RegistryObject<Item> PAPER_PLATE = ITEMS.register("paper_lamellar_plate", () -> new Item(new Properties()));

	public static final RegistryObject<Item> IRON_ZUNARI_KABUTO = ITEMS.register("iron_zunari_kabuto", () -> new OYoroiItem(OYoroiMaterial.IRON, ArmorItem.Type.HELMET, ModelPointer.ZUNARI_KABUTO));
	public static final RegistryObject<Item> IRON_SUJI_KABUTO = ITEMS.register("iron_suji_kabuto", () -> new OYoroiItem(OYoroiMaterial.IRON, ArmorItem.Type.HELMET, ModelPointer.SUJI_KABUTO));
	public static final RegistryObject<Item> IRON_SUJI_KABUTO_MENPO = ITEMS.register("iron_suji_kabuto_menpo", () -> new OYoroiItem(OYoroiMaterial.IRON, ArmorItem.Type.HELMET, ModelPointer.SUJI_KABUTO_MENPO));
	public static final RegistryObject<Item> IRON_SUJI_KABUTO_CIRCLE = ITEMS.register("iron_suji_kabuto_circle", () -> new OYoroiItem(OYoroiMaterial.IRON_E1, ArmorItem.Type.HELMET, ModelPointer.SUJI_KABUTO_CIRCLE));
	public static final RegistryObject<Item> IRON_SUJI_KABUTO_LEAVES = ITEMS.register("iron_suji_kabuto_leaves", () -> new OYoroiItem(OYoroiMaterial.IRON_E4, ArmorItem.Type.HELMET, ModelPointer.SUJI_KABUTO_LEAVES));
	public static final RegistryObject<Item> IRON_SUJI_KABUTO_ANTLERS = ITEMS.register("iron_suji_kabuto_antlers", () -> new OYoroiItem(OYoroiMaterial.IRON_E4, ArmorItem.Type.HELMET, ModelPointer.SUJI_KABUTO_ANTLERS));
	public static final RegistryObject<Item> IRON_SUJI_KABUTO_CRESCENT = ITEMS.register("iron_suji_kabuto_crescent", () -> new OYoroiItem(OYoroiMaterial.IRON_E5, ArmorItem.Type.HELMET, ModelPointer.SUJI_KABUTO_CRESCENT));
	public static final RegistryObject<Item> IRON_SUJI_KABUTO_HORNS = ITEMS.register("iron_suji_kabuto_horns", () -> new OYoroiItem(OYoroiMaterial.IRON_E3, ArmorItem.Type.HELMET, ModelPointer.SUJI_KABUTO_HORNS));
	public static final RegistryObject<Item> IRON_SUJI_KABUTO_MENPO_CIRCLE = ITEMS.register("iron_suji_kabuto_menpo_circle", () -> new OYoroiItem(OYoroiMaterial.IRON_E1, ArmorItem.Type.HELMET, ModelPointer.SUJI_KABUTO_MENPO_CIRCLE));
	public static final RegistryObject<Item> IRON_SUJI_KABUTO_MENPO_LEAVES = ITEMS.register("iron_suji_kabuto_menpo_leaves", () -> new OYoroiItem(OYoroiMaterial.IRON_E4, ArmorItem.Type.HELMET, ModelPointer.SUJI_KABUTO_MENPO_LEAVES));
	public static final RegistryObject<Item> IRON_SUJI_KABUTO_MENPO_ANTLERS = ITEMS.register("iron_suji_kabuto_menpo_antlers", () -> new OYoroiItem(OYoroiMaterial.IRON_E4, ArmorItem.Type.HELMET, ModelPointer.SUJI_KABUTO_MENPO_ANTLERS));
	public static final RegistryObject<Item> IRON_SUJI_KABUTO_MENPO_CRESCENT = ITEMS.register("iron_suji_kabuto_menpo_crescent", () -> new OYoroiItem(OYoroiMaterial.IRON_E5, ArmorItem.Type.HELMET, ModelPointer.SUJI_KABUTO_MENPO_CRESCENT));
	public static final RegistryObject<Item> IRON_SUJI_KABUTO_MENPO_HORNS = ITEMS.register("iron_suji_kabuto_menpo_horns", () -> new OYoroiItem(OYoroiMaterial.IRON_E3, ArmorItem.Type.HELMET, ModelPointer.SUJI_KABUTO_MENPO_HORNS));
	public static final RegistryObject<Item> IRON_DO = ITEMS.register("iron_do-maru", () -> new OYoroiItem(OYoroiMaterial.IRON_D01, ArmorItem.Type.CHESTPLATE, ModelPointer.DO));
	public static final RegistryObject<Item> IRON_DO_K = ITEMS.register("iron_do-maru_k", () -> new OYoroiItem(OYoroiMaterial.IRON, ArmorItem.Type.CHESTPLATE, ModelPointer.DO_K));
	public static final RegistryObject<Item> IRON_DO_S = ITEMS.register("iron_do-maru_s", () -> new OYoroiItem(OYoroiMaterial.IRON_D1, ArmorItem.Type.CHESTPLATE, ModelPointer.DO_S));
	public static final RegistryObject<Item> IRON_DO_M = ITEMS.register("iron_do-maru_m", () -> new OYoroiItem(OYoroiMaterial.IRON_D1, ArmorItem.Type.CHESTPLATE, ModelPointer.DO_M));
	public static final RegistryObject<Item> IRON_DO_L = ITEMS.register("iron_do-maru_l", () -> new OYoroiItem(OYoroiMaterial.IRON_D2_E1, ArmorItem.Type.CHESTPLATE, ModelPointer.DO_L));
	public static final RegistryObject<Item> IRON_HAIDATE = ITEMS.register("iron_haidate", () -> new OYoroiItem(OYoroiMaterial.IRON, ArmorItem.Type.LEGGINGS, ModelPointer.HAIDATE));
	public static final RegistryObject<Item> IRON_SUNEATE = ITEMS.register("iron_suneate", () -> new OYoroiItem(OYoroiMaterial.IRON, ArmorItem.Type.BOOTS, ModelPointer.SUNEATE));

	public static final RegistryObject<Item> NETHERITE_ZUNARI_KABUTO = ITEMS.register("netherite_zunari_kabuto", () -> new OYoroiItem(OYoroiMaterial.NETHERITE, ArmorItem.Type.HELMET, ModelPointer.ZUNARI_KABUTO));
	public static final RegistryObject<Item> NETHERITE_SUJI_KABUTO = ITEMS.register("netherite_suji_kabuto", () -> new OYoroiItem(OYoroiMaterial.NETHERITE, ArmorItem.Type.HELMET, ModelPointer.SUJI_KABUTO));
	public static final RegistryObject<Item> NETHERITE_SUJI_KABUTO_MENPO = ITEMS.register("netherite_suji_kabuto_menpo", () -> new OYoroiItem(OYoroiMaterial.NETHERITE, ArmorItem.Type.HELMET, ModelPointer.SUJI_KABUTO_MENPO));
	public static final RegistryObject<Item> NETHERITE_SUJI_KABUTO_CIRCLE = ITEMS.register("netherite_suji_kabuto_circle", () -> new OYoroiItem(OYoroiMaterial.NETHERITE_E1, ArmorItem.Type.HELMET, ModelPointer.SUJI_KABUTO_CIRCLE));
	public static final RegistryObject<Item> NETHERITE_SUJI_KABUTO_LEAVES = ITEMS.register("netherite_suji_kabuto_leaves", () -> new OYoroiItem(OYoroiMaterial.NETHERITE_E4, ArmorItem.Type.HELMET, ModelPointer.SUJI_KABUTO_LEAVES));
	public static final RegistryObject<Item> NETHERITE_SUJI_KABUTO_ANTLERS = ITEMS.register("netherite_suji_kabuto_antlers", () -> new OYoroiItem(OYoroiMaterial.NETHERITE_E4, ArmorItem.Type.HELMET, ModelPointer.SUJI_KABUTO_ANTLERS));
	public static final RegistryObject<Item> NETHERITE_SUJI_KABUTO_CRESCENT = ITEMS.register("netherite_suji_kabuto_crescent", () -> new OYoroiItem(OYoroiMaterial.NETHERITE_E5, ArmorItem.Type.HELMET, ModelPointer.SUJI_KABUTO_CRESCENT));
	public static final RegistryObject<Item> NETHERITE_SUJI_KABUTO_HORNS = ITEMS.register("netherite_suji_kabuto_horns", () -> new OYoroiItem(OYoroiMaterial.NETHERITE_E3, ArmorItem.Type.HELMET, ModelPointer.SUJI_KABUTO_HORNS));
	public static final RegistryObject<Item> NETHERITE_SUJI_KABUTO_MENPO_CIRCLE = ITEMS.register("netherite_suji_kabuto_menpo_circle", () -> new OYoroiItem(OYoroiMaterial.NETHERITE_E1, ArmorItem.Type.HELMET, ModelPointer.SUJI_KABUTO_MENPO_CIRCLE));
	public static final RegistryObject<Item> NETHERITE_SUJI_KABUTO_MENPO_LEAVES = ITEMS.register("netherite_suji_kabuto_menpo_leaves", () -> new OYoroiItem(OYoroiMaterial.NETHERITE_E4, ArmorItem.Type.HELMET, ModelPointer.SUJI_KABUTO_MENPO_LEAVES));
	public static final RegistryObject<Item> NETHERITE_SUJI_KABUTO_MENPO_ANTLERS = ITEMS.register("netherite_suji_kabuto_menpo_antlers", () -> new OYoroiItem(OYoroiMaterial.NETHERITE_E4, ArmorItem.Type.HELMET, ModelPointer.SUJI_KABUTO_MENPO_ANTLERS));
	public static final RegistryObject<Item> NETHERITE_SUJI_KABUTO_MENPO_CRESCENT = ITEMS.register("netherite_suji_kabuto_menpo_crescent", () -> new OYoroiItem(OYoroiMaterial.NETHERITE_E5, ArmorItem.Type.HELMET, ModelPointer.SUJI_KABUTO_MENPO_CRESCENT));
	public static final RegistryObject<Item> NETHERITE_SUJI_KABUTO_MENPO_HORNS = ITEMS.register("netherite_suji_kabuto_menpo_horns", () -> new OYoroiItem(OYoroiMaterial.NETHERITE_E3, ArmorItem.Type.HELMET, ModelPointer.SUJI_KABUTO_MENPO_HORNS));
	public static final RegistryObject<Item> NETHERITE_DO = ITEMS.register("netherite_do-maru", () -> new OYoroiItem(OYoroiMaterial.NETHERITE_D02, ArmorItem.Type.CHESTPLATE, ModelPointer.DO));
	public static final RegistryObject<Item> NETHERITE_DO_K = ITEMS.register("netherite_do-maru_k", () -> new OYoroiItem(OYoroiMaterial.NETHERITE_D01, ArmorItem.Type.CHESTPLATE, ModelPointer.DO_K));
	public static final RegistryObject<Item> NETHERITE_DO_S = ITEMS.register("netherite_do-maru_s", () -> new OYoroiItem(OYoroiMaterial.NETHERITE, ArmorItem.Type.CHESTPLATE, ModelPointer.DO_S));
	public static final RegistryObject<Item> NETHERITE_DO_M = ITEMS.register("netherite_do-maru_m", () -> new OYoroiItem(OYoroiMaterial.NETHERITE_D1, ArmorItem.Type.CHESTPLATE, ModelPointer.DO_M));
	public static final RegistryObject<Item> NETHERITE_DO_L = ITEMS.register("netherite_do-maru_l", () -> new OYoroiItem(OYoroiMaterial.NETHERITE_D2_E1, ArmorItem.Type.CHESTPLATE, ModelPointer.DO_L));
	public static final RegistryObject<Item> NETHERITE_HAIDATE = ITEMS.register("netherite_haidate", () -> new OYoroiItem(OYoroiMaterial.NETHERITE, ArmorItem.Type.LEGGINGS, ModelPointer.HAIDATE));
	public static final RegistryObject<Item> NETHERITE_SUNEATE = ITEMS.register("netherite_suneate", () -> new OYoroiItem(OYoroiMaterial.NETHERITE, ArmorItem.Type.BOOTS, ModelPointer.SUNEATE));

	// public static final RegistryObject<Item> PAPER_ZUNARI_KABUTO = ITEMS.register("paper_zunari_kabuto", () -> new OYoroiItem(OYoroiMaterial.PAPER, ArmorItem.Type.HELMET, ModelPointer.ZUNARI_KABUTO, 0xeeeeee));
	public static final RegistryObject<Item> PAPER_SUJI_KABUTO = ITEMS.register("paper_suji_kabuto", () -> new OYoroiItem(OYoroiMaterial.PAPER, ArmorItem.Type.HELMET, ModelPointer.SUJI_KABUTO, 0xeeeeee));
	public static final RegistryObject<Item> PAPER_DO = ITEMS.register("paper_do-maru", () -> new OYoroiItem(OYoroiMaterial.PAPER, ArmorItem.Type.CHESTPLATE, ModelPointer.DO, 0xeeeeee));
	public static final RegistryObject<Item> PAPER_DO_K = ITEMS.register("paper_do-maru_k", () -> new OYoroiItem(OYoroiMaterial.PAPER, ArmorItem.Type.CHESTPLATE, ModelPointer.DO_K, 0xeeeeee));
	public static final RegistryObject<Item> PAPER_DO_S = ITEMS.register("paper_do-maru_s", () -> new OYoroiItem(OYoroiMaterial.PAPER, ArmorItem.Type.CHESTPLATE, ModelPointer.DO_S, 0xeeeeee));
	public static final RegistryObject<Item> PAPER_HAIDATE = ITEMS.register("paper_haidate", () -> new OYoroiItem(OYoroiMaterial.PAPER, ArmorItem.Type.LEGGINGS, ModelPointer.HAIDATE, 0xeeeeee));
	public static final RegistryObject<Item> PAPER_SUNEATE = ITEMS.register("paper_suneate", () -> new OYoroiItem(OYoroiMaterial.PAPER, ArmorItem.Type.BOOTS, ModelPointer.SUNEATE, 0xeeeeee));

	public static final RegistryObject<Item> HAKAMA = ITEMS.register("hakama", () -> new OYoroiItem(OYoroiMaterial.LEATHER, ArmorItem.Type.LEGGINGS, ModelPointer.HAKAMA));
	public static final RegistryObject<Item> WOOLEN_HAKAMA = ITEMS.register("woollen_hakama", () -> new OYoroiItem(OYoroiMaterial.WOOL, ArmorItem.Type.LEGGINGS, ModelPointer.HAKAMA));

	@SubscribeEvent
	public static void creativeTabBuildContents(BuildCreativeModeTabContentsEvent  event){
		if(event.getTabKey()==CreativeModeTabs.COMBAT){
			ITEMS.getEntries().stream().filter(entry -> entry.get() instanceof OYoroiItem).forEach(entry -> event.accept(entry));
		}else if(event.getTabKey()==CreativeModeTabs.INGREDIENTS){
			event.accept(LAMELLAR_PLATE);
			event.accept(PAPER_PLATE);
		}
	}
}
