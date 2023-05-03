package com.narrax.minecraft.oyoroi.items;

import com.narrax.minecraft.oyoroi.OYoroi;
import com.narrax.minecraft.oyoroi.items.OYoroiItem.ModelPointer;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OYoroi.MODID);

	public static final RegistryObject<Item> LAMELLAR_PLATE = ITEMS.register("iron_lamellar_plate", () -> new Item(new Properties().tab(CreativeModeTab.TAB_COMBAT)));

	public static final RegistryObject<Item> IRON_ZUNARI_KABUTO = ITEMS.register("iron_zunari_kabuto", () -> new OYoroiItem(OYoroiMaterial.IRON, EquipmentSlot.HEAD, ModelPointer.ZUNARI_KABUTO));
	public static final RegistryObject<Item> IRON_SUJI_KABUTO = ITEMS.register("iron_suji_kabuto", () -> new OYoroiItem(OYoroiMaterial.IRON, EquipmentSlot.HEAD, ModelPointer.SUJI_KABUTO));
	public static final RegistryObject<Item> IRON_SUJI_KABUTO_MENPO = ITEMS.register("iron_suji_kabuto_menpo", () -> new OYoroiItem(OYoroiMaterial.IRON, EquipmentSlot.HEAD, ModelPointer.SUJI_KABUTO_MENPO));
	public static final RegistryObject<Item> IRON_SUJI_KABUTO_CIRCLE = ITEMS.register("iron_suji_kabuto_circle", () -> new OYoroiItem(OYoroiMaterial.IRON_E1, EquipmentSlot.HEAD, ModelPointer.SUJI_KABUTO_CIRCLE));
	public static final RegistryObject<Item> IRON_SUJI_KABUTO_LEAVES = ITEMS.register("iron_suji_kabuto_leaves", () -> new OYoroiItem(OYoroiMaterial.IRON_E4, EquipmentSlot.HEAD, ModelPointer.SUJI_KABUTO_LEAVES));
	public static final RegistryObject<Item> IRON_SUJI_KABUTO_ANTLERS = ITEMS.register("iron_suji_kabuto_antlers", () -> new OYoroiItem(OYoroiMaterial.IRON_E4, EquipmentSlot.HEAD, ModelPointer.SUJI_KABUTO_ANTLERS));
	public static final RegistryObject<Item> IRON_SUJI_KABUTO_CRESCENT = ITEMS.register("iron_suji_kabuto_crescent", () -> new OYoroiItem(OYoroiMaterial.IRON_E5, EquipmentSlot.HEAD, ModelPointer.SUJI_KABUTO_CRESCENT));
	public static final RegistryObject<Item> IRON_SUJI_KABUTO_HORNS = ITEMS.register("iron_suji_kabuto_horns", () -> new OYoroiItem(OYoroiMaterial.IRON_E3, EquipmentSlot.HEAD, ModelPointer.SUJI_KABUTO_HORNS));
	public static final RegistryObject<Item> IRON_SUJI_KABUTO_MENPO_CIRCLE = ITEMS.register("iron_suji_kabuto_menpo_circle", () -> new OYoroiItem(OYoroiMaterial.IRON_E1, EquipmentSlot.HEAD, ModelPointer.SUJI_KABUTO_MENPO_CIRCLE));
	public static final RegistryObject<Item> IRON_SUJI_KABUTO_MENPO_LEAVES = ITEMS.register("iron_suji_kabuto_menpo_leaves", () -> new OYoroiItem(OYoroiMaterial.IRON_E4, EquipmentSlot.HEAD, ModelPointer.SUJI_KABUTO_MENPO_LEAVES));
	public static final RegistryObject<Item> IRON_SUJI_KABUTO_MENPO_ANTLERS = ITEMS.register("iron_suji_kabuto_menpo_antlers", () -> new OYoroiItem(OYoroiMaterial.IRON_E4, EquipmentSlot.HEAD, ModelPointer.SUJI_KABUTO_MENPO_ANTLERS));
	public static final RegistryObject<Item> IRON_SUJI_KABUTO_MENPO_CRESCENT = ITEMS.register("iron_suji_kabuto_menpo_crescent", () -> new OYoroiItem(OYoroiMaterial.IRON_E5, EquipmentSlot.HEAD, ModelPointer.SUJI_KABUTO_MENPO_CRESCENT));
	public static final RegistryObject<Item> IRON_SUJI_KABUTO_MENPO_HORNS = ITEMS.register("iron_suji_kabuto_menpo_horns", () -> new OYoroiItem(OYoroiMaterial.IRON_E3, EquipmentSlot.HEAD, ModelPointer.SUJI_KABUTO_MENPO_HORNS));
	public static final RegistryObject<Item> IRON_DO = ITEMS.register("iron_do-maru", () -> new OYoroiItem(OYoroiMaterial.IRON_D01, EquipmentSlot.CHEST, ModelPointer.DO));
	public static final RegistryObject<Item> IRON_DO_K = ITEMS.register("iron_do-maru_k", () -> new OYoroiItem(OYoroiMaterial.IRON, EquipmentSlot.CHEST, ModelPointer.DO_K));
	public static final RegistryObject<Item> IRON_DO_S = ITEMS.register("iron_do-maru_s", () -> new OYoroiItem(OYoroiMaterial.IRON_D1, EquipmentSlot.CHEST, ModelPointer.DO_S));
	public static final RegistryObject<Item> IRON_DO_M = ITEMS.register("iron_do-maru_m", () -> new OYoroiItem(OYoroiMaterial.IRON_D1, EquipmentSlot.CHEST, ModelPointer.DO_M));
	public static final RegistryObject<Item> IRON_DO_L = ITEMS.register("iron_do-maru_l", () -> new OYoroiItem(OYoroiMaterial.IRON_D2_E1, EquipmentSlot.CHEST, ModelPointer.DO_L));
	public static final RegistryObject<Item> IRON_HAIDATE = ITEMS.register("iron_haidate", () -> new OYoroiItem(OYoroiMaterial.IRON, EquipmentSlot.LEGS, ModelPointer.HAIDATE));
	public static final RegistryObject<Item> IRON_SUNEATE = ITEMS.register("iron_suneate", () -> new OYoroiItem(OYoroiMaterial.IRON, EquipmentSlot.FEET, ModelPointer.SUNEATE));

	public static final RegistryObject<Item> NETHERITE_ZUNARI_KABUTO = ITEMS.register("netherite_zunari_kabuto", () -> new OYoroiItem(OYoroiMaterial.NETHERITE, EquipmentSlot.HEAD, ModelPointer.ZUNARI_KABUTO));
	public static final RegistryObject<Item> NETHERITE_SUJI_KABUTO = ITEMS.register("netherite_suji_kabuto", () -> new OYoroiItem(OYoroiMaterial.NETHERITE, EquipmentSlot.HEAD, ModelPointer.SUJI_KABUTO));
	public static final RegistryObject<Item> NETHERITE_SUJI_KABUTO_MENPO = ITEMS.register("netherite_suji_kabuto_menpo", () -> new OYoroiItem(OYoroiMaterial.NETHERITE, EquipmentSlot.HEAD, ModelPointer.SUJI_KABUTO_MENPO));
	public static final RegistryObject<Item> NETHERITE_SUJI_KABUTO_CIRCLE = ITEMS.register("netherite_suji_kabuto_circle", () -> new OYoroiItem(OYoroiMaterial.NETHERITE_E1, EquipmentSlot.HEAD, ModelPointer.SUJI_KABUTO_CIRCLE));
	public static final RegistryObject<Item> NETHERITE_SUJI_KABUTO_LEAVES = ITEMS.register("netherite_suji_kabuto_leaves", () -> new OYoroiItem(OYoroiMaterial.NETHERITE_E4, EquipmentSlot.HEAD, ModelPointer.SUJI_KABUTO_LEAVES));
	public static final RegistryObject<Item> NETHERITE_SUJI_KABUTO_ANTLERS = ITEMS.register("netherite_suji_kabuto_antlers", () -> new OYoroiItem(OYoroiMaterial.NETHERITE_E4, EquipmentSlot.HEAD, ModelPointer.SUJI_KABUTO_ANTLERS));
	public static final RegistryObject<Item> NETHERITE_SUJI_KABUTO_CRESCENT = ITEMS.register("netherite_suji_kabuto_crescent", () -> new OYoroiItem(OYoroiMaterial.NETHERITE_E5, EquipmentSlot.HEAD, ModelPointer.SUJI_KABUTO_CRESCENT));
	public static final RegistryObject<Item> NETHERITE_SUJI_KABUTO_HORNS = ITEMS.register("netherite_suji_kabuto_horns", () -> new OYoroiItem(OYoroiMaterial.NETHERITE_E3, EquipmentSlot.HEAD, ModelPointer.SUJI_KABUTO_HORNS));
	public static final RegistryObject<Item> NETHERITE_SUJI_KABUTO_MENPO_CIRCLE = ITEMS.register("netherite_suji_kabuto_menpo_circle", () -> new OYoroiItem(OYoroiMaterial.NETHERITE_E1, EquipmentSlot.HEAD, ModelPointer.SUJI_KABUTO_MENPO_CIRCLE));
	public static final RegistryObject<Item> NETHERITE_SUJI_KABUTO_MENPO_LEAVES = ITEMS.register("netherite_suji_kabuto_menpo_leaves", () -> new OYoroiItem(OYoroiMaterial.NETHERITE_E4, EquipmentSlot.HEAD, ModelPointer.SUJI_KABUTO_MENPO_LEAVES));
	public static final RegistryObject<Item> NETHERITE_SUJI_KABUTO_MENPO_ANTLERS = ITEMS.register("netherite_suji_kabuto_menpo_antlers", () -> new OYoroiItem(OYoroiMaterial.NETHERITE_E4, EquipmentSlot.HEAD, ModelPointer.SUJI_KABUTO_MENPO_ANTLERS));
	public static final RegistryObject<Item> NETHERITE_SUJI_KABUTO_MENPO_CRESCENT = ITEMS.register("netherite_suji_kabuto_menpo_crescent", () -> new OYoroiItem(OYoroiMaterial.NETHERITE_E5, EquipmentSlot.HEAD, ModelPointer.SUJI_KABUTO_MENPO_CRESCENT));
	public static final RegistryObject<Item> NETHERITE_SUJI_KABUTO_MENPO_HORNS = ITEMS.register("netherite_suji_kabuto_menpo_horns", () -> new OYoroiItem(OYoroiMaterial.NETHERITE_E3, EquipmentSlot.HEAD, ModelPointer.SUJI_KABUTO_MENPO_HORNS));
	public static final RegistryObject<Item> NETHERITE_DO = ITEMS.register("netherite_do-maru", () -> new OYoroiItem(OYoroiMaterial.NETHERITE_D02, EquipmentSlot.CHEST, ModelPointer.DO));
	public static final RegistryObject<Item> NETHERITE_DO_K = ITEMS.register("netherite_do-maru_k", () -> new OYoroiItem(OYoroiMaterial.NETHERITE_D01, EquipmentSlot.CHEST, ModelPointer.DO_K));
	public static final RegistryObject<Item> NETHERITE_DO_S = ITEMS.register("netherite_do-maru_s", () -> new OYoroiItem(OYoroiMaterial.NETHERITE, EquipmentSlot.CHEST, ModelPointer.DO_S));
	public static final RegistryObject<Item> NETHERITE_DO_M = ITEMS.register("netherite_do-maru_m", () -> new OYoroiItem(OYoroiMaterial.NETHERITE_D1, EquipmentSlot.CHEST, ModelPointer.DO_M));
	public static final RegistryObject<Item> NETHERITE_DO_L = ITEMS.register("netherite_do-maru_l", () -> new OYoroiItem(OYoroiMaterial.NETHERITE_D2_E1, EquipmentSlot.CHEST, ModelPointer.DO_L));
	public static final RegistryObject<Item> NETHERITE_HAIDATE = ITEMS.register("netherite_haidate", () -> new OYoroiItem(OYoroiMaterial.NETHERITE, EquipmentSlot.LEGS, ModelPointer.HAIDATE));
	public static final RegistryObject<Item> NETHERITE_SUNEATE = ITEMS.register("netherite_suneate", () -> new OYoroiItem(OYoroiMaterial.NETHERITE, EquipmentSlot.FEET, ModelPointer.SUNEATE));

	public static final RegistryObject<Item> HAKAMA = ITEMS.register("hakama", () -> new OYoroiItem(OYoroiMaterial.LEATHER, EquipmentSlot.LEGS, ModelPointer.HAKAMA));
}
