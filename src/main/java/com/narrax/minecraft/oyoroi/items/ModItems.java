package com.narrax.minecraft.oyoroi.items;

import com.narrax.minecraft.oyoroi.OYoroi;
import com.narrax.minecraft.oyoroi.items.models.DoMaruModel;
import com.narrax.minecraft.oyoroi.items.models.HaidateModel;
import com.narrax.minecraft.oyoroi.items.models.HakamaModel;
import com.narrax.minecraft.oyoroi.items.models.SujiKabutoModel;
import com.narrax.minecraft.oyoroi.items.models.SuneateModel;
import com.narrax.minecraft.oyoroi.items.models.ZunariKabutoModel;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, OYoroi.MODID);

	public static final RegistryObject<Item> LAMELLAR_PLATE = ITEMS.register("iron_lamellar_plate", () -> new Item(new Properties().tab(CreativeModeTab.TAB_COMBAT)));

	public static final RegistryObject<Item> IRON_ZUNARI_KABUTO = ITEMS.register("iron_zunari_kabuto", () -> new OYoroiItem(OYoroiMaterial.IRON, EquipmentSlot.HEAD, ZunariKabutoModel.LAYER_LOCATION));
	public static final RegistryObject<Item> IRON_SUJI_KABUTO = ITEMS.register("iron_suji_kabuto", () -> new OYoroiItem(OYoroiMaterial.IRON, EquipmentSlot.HEAD, SujiKabutoModel.SUJI_KABUTO_LAYER_LOCATION));
	public static final RegistryObject<Item> IRON_SUJI_KABUTO_MENPO = ITEMS.register("iron_suji_kabuto_menpo", () -> new OYoroiItem(OYoroiMaterial.IRON, EquipmentSlot.HEAD, SujiKabutoModel.SUJI_KABUTO_MENPO_LAYER_LOCATION));
	public static final RegistryObject<Item> IRON_SUJI_KABUTO_CIRCLE = ITEMS.register("iron_suji_kabuto_circle", () -> new OYoroiItem(OYoroiMaterial.IRON_E1, EquipmentSlot.HEAD, SujiKabutoModel.SUJI_KABUTO_CIRCLE_LAYER_LOCATION));
	public static final RegistryObject<Item> IRON_SUJI_KABUTO_LEAVES = ITEMS.register("iron_suji_kabuto_leaves", () -> new OYoroiItem(OYoroiMaterial.IRON_E4, EquipmentSlot.HEAD, SujiKabutoModel.SUJI_KABUTO_LEAVES_LAYER_LOCATION));
	public static final RegistryObject<Item> IRON_SUJI_KABUTO_ANTLERS = ITEMS.register("iron_suji_kabuto_antlers", () -> new OYoroiItem(OYoroiMaterial.IRON_E4, EquipmentSlot.HEAD, SujiKabutoModel.SUJI_KABUTO_ANTLERS_LAYER_LOCATION));
	public static final RegistryObject<Item> IRON_SUJI_KABUTO_CRESCENT = ITEMS.register("iron_suji_kabuto_crescent", () -> new OYoroiItem(OYoroiMaterial.IRON_E5, EquipmentSlot.HEAD, SujiKabutoModel.SUJI_KABUTO_CRESCENT_LAYER_LOCATION));
	public static final RegistryObject<Item> IRON_SUJI_KABUTO_HORNS = ITEMS.register("iron_suji_kabuto_horns", () -> new OYoroiItem(OYoroiMaterial.IRON_E3, EquipmentSlot.HEAD, SujiKabutoModel.SUJI_KABUTO_HORNS_LAYER_LOCATION));
	public static final RegistryObject<Item> IRON_SUJI_KABUTO_MENPO_CIRCLE = ITEMS.register("iron_suji_kabuto_menpo_circle", () -> new OYoroiItem(OYoroiMaterial.IRON_E1, EquipmentSlot.HEAD, SujiKabutoModel.SUJI_KABUTO_MENPO_CIRCLE_LAYER_LOCATION));
	public static final RegistryObject<Item> IRON_SUJI_KABUTO_MENPO_LEAVES = ITEMS.register("iron_suji_kabuto_menpo_leaves", () -> new OYoroiItem(OYoroiMaterial.IRON_E4, EquipmentSlot.HEAD, SujiKabutoModel.SUJI_KABUTO_MENPO_LEAVES_LAYER_LOCATION));
	public static final RegistryObject<Item> IRON_SUJI_KABUTO_MENPO_ANTLERS = ITEMS.register("iron_suji_kabuto_menpo_antlers", () -> new OYoroiItem(OYoroiMaterial.IRON_E4, EquipmentSlot.HEAD, SujiKabutoModel.SUJI_KABUTO_MENPO_ANTLERS_LAYER_LOCATION));
	public static final RegistryObject<Item> IRON_SUJI_KABUTO_MENPO_CRESCENT = ITEMS.register("iron_suji_kabuto_menpo_crescent", () -> new OYoroiItem(OYoroiMaterial.IRON_E5, EquipmentSlot.HEAD, SujiKabutoModel.SUJI_KABUTO_MENPO_CRESCENT_LAYER_LOCATION));
	public static final RegistryObject<Item> IRON_SUJI_KABUTO_MENPO_HORNS = ITEMS.register("iron_suji_kabuto_menpo_horns", () -> new OYoroiItem(OYoroiMaterial.IRON_E3, EquipmentSlot.HEAD, SujiKabutoModel.SUJI_KABUTO_MENPO_HORNS_LAYER_LOCATION));
	public static final RegistryObject<Item> IRON_DO = ITEMS.register("iron_do-maru", () -> new OYoroiItem(OYoroiMaterial.IRON_D01, EquipmentSlot.CHEST, DoMaruModel.DO_LAYER_LOCATION));
	public static final RegistryObject<Item> IRON_DO_K = ITEMS.register("iron_do-maru_k", () -> new OYoroiItem(OYoroiMaterial.IRON, EquipmentSlot.CHEST, DoMaruModel.DO_K_LAYER_LOCATION));
	public static final RegistryObject<Item> IRON_DO_S = ITEMS.register("iron_do-maru_s", () -> new OYoroiItem(OYoroiMaterial.IRON_D1, EquipmentSlot.CHEST, DoMaruModel.DO_S_LAYER_LOCATION));
	public static final RegistryObject<Item> IRON_DO_M = ITEMS.register("iron_do-maru_m", () -> new OYoroiItem(OYoroiMaterial.IRON_D2, EquipmentSlot.CHEST, DoMaruModel.DO_M_LAYER_LOCATION));
	public static final RegistryObject<Item> IRON_DO_L = ITEMS.register("iron_do-maru_l", () -> new OYoroiItem(OYoroiMaterial.IRON_D2_E1, EquipmentSlot.CHEST, DoMaruModel.DO_L_LAYER_LOCATION));
	public static final RegistryObject<Item> IRON_HAIDATE = ITEMS.register("iron_haidate", () -> new OYoroiItem(OYoroiMaterial.IRON, EquipmentSlot.LEGS, HaidateModel.LAYER_LOCATION));
	public static final RegistryObject<Item> IRON_SUNEATE = ITEMS.register("iron_suneate", () -> new OYoroiItem(OYoroiMaterial.IRON, EquipmentSlot.FEET, SuneateModel.LAYER_LOCATION));

	public static final RegistryObject<Item> HAKAMA = ITEMS.register("hakama", () -> new OYoroiItem(OYoroiMaterial.LEATHER, EquipmentSlot.LEGS, HakamaModel.LAYER_LOCATION));
}
