package com.narrax.minecraft.oyoroi.items;

import java.util.function.Consumer;

import org.jetbrains.annotations.NotNull;

import com.narrax.minecraft.oyoroi.items.models.DoMaruModel;
import com.narrax.minecraft.oyoroi.items.models.HaidateModel;
import com.narrax.minecraft.oyoroi.items.models.HakamaModel;
import com.narrax.minecraft.oyoroi.items.models.SujiKabutoModel;
import com.narrax.minecraft.oyoroi.items.models.SuneateModel;
import com.narrax.minecraft.oyoroi.items.models.ZunariKabutoModel;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.DyeableArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;

public class OYoroiItem extends DyeableArmorItem {
	private final ModelPointer model;

	public OYoroiItem(ArmorMaterial material, ArmorItem.Type armorType, ModelPointer model){
		this(material, armorType, new Item.Properties(), model);
	}

	public OYoroiItem(ArmorMaterial material, ArmorItem.Type armorType, Item.Properties properties, ModelPointer model){
		super(material, armorType, properties);
		this.model = model;
	}
	
	@Override
	public void initializeClient(Consumer<IClientItemExtensions> consumer){
		consumer.accept(new IClientItemExtensions() {
			@Override
			public @NotNull HumanoidModel<?> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, HumanoidModel<?> original) {
				EntityModelSet models = Minecraft.getInstance().getEntityModels();
				ModelPart root = null;
				switch(model){
					case ZUNARI_KABUTO:
						root = models.bakeLayer(ZunariKabutoModel.LAYER_LOCATION);
						break;
					case SUJI_KABUTO:
						root = models.bakeLayer(SujiKabutoModel.SUJI_KABUTO_LAYER_LOCATION);
						break;
					case SUJI_KABUTO_ANTLERS:
						root = models.bakeLayer(SujiKabutoModel.SUJI_KABUTO_ANTLERS_LAYER_LOCATION);
						break;
					case SUJI_KABUTO_CIRCLE:
						root = models.bakeLayer(SujiKabutoModel.SUJI_KABUTO_CIRCLE_LAYER_LOCATION);
						break;
					case SUJI_KABUTO_CRESCENT:
						root = models.bakeLayer(SujiKabutoModel.SUJI_KABUTO_CRESCENT_LAYER_LOCATION);
						break;
					case SUJI_KABUTO_HORNS:
						root = models.bakeLayer(SujiKabutoModel.SUJI_KABUTO_HORNS_LAYER_LOCATION);
						break;
					case SUJI_KABUTO_LEAVES:
						root = models.bakeLayer(SujiKabutoModel.SUJI_KABUTO_LEAVES_LAYER_LOCATION);
						break;
					case SUJI_KABUTO_MENPO:
						root = models.bakeLayer(SujiKabutoModel.SUJI_KABUTO_MENPO_LAYER_LOCATION);
						break;
					case SUJI_KABUTO_MENPO_ANTLERS:
						root = models.bakeLayer(SujiKabutoModel.SUJI_KABUTO_MENPO_ANTLERS_LAYER_LOCATION);
						break;
					case SUJI_KABUTO_MENPO_CIRCLE:
						root = models.bakeLayer(SujiKabutoModel.SUJI_KABUTO_MENPO_CIRCLE_LAYER_LOCATION);
						break;
					case SUJI_KABUTO_MENPO_CRESCENT:
						root = models.bakeLayer(SujiKabutoModel.SUJI_KABUTO_MENPO_CRESCENT_LAYER_LOCATION);
						break;
					case SUJI_KABUTO_MENPO_HORNS:
						root = models.bakeLayer(SujiKabutoModel.SUJI_KABUTO_MENPO_HORNS_LAYER_LOCATION);
						break;
					case SUJI_KABUTO_MENPO_LEAVES:
						root = models.bakeLayer(SujiKabutoModel.SUJI_KABUTO_MENPO_LEAVES_LAYER_LOCATION);
						break;
					case DO:
						root = models.bakeLayer(DoMaruModel.DO_LAYER_LOCATION);
						break;
					case DO_K:
						root = models.bakeLayer(DoMaruModel.DO_K_LAYER_LOCATION);
						break;
					case DO_S:
						root = models.bakeLayer(DoMaruModel.DO_S_LAYER_LOCATION);
						break;
					case DO_M:
						root = models.bakeLayer(DoMaruModel.DO_M_LAYER_LOCATION);
						break;
					case DO_L:
						root = models.bakeLayer(DoMaruModel.DO_L_LAYER_LOCATION);
						break;
					case HAIDATE:
						root = models.bakeLayer(HaidateModel.LAYER_LOCATION);
						break;
					case SUNEATE:
						root = models.bakeLayer(SuneateModel.LAYER_LOCATION);
						break;
					case HAKAMA:
						root = models.bakeLayer(HakamaModel.LAYER_LOCATION);
						break;
				}
				return new HumanoidModel<LivingEntity>(root);
			}
		});
	}

	@Override
	public int getColor(ItemStack p_41122_){
		CompoundTag compoundtag = p_41122_.getTagElement("display");
		return compoundtag != null && compoundtag.contains("color", 99) ? compoundtag.getInt("color") : 0xc0c0c0;
	}

	public static enum ModelPointer{
		ZUNARI_KABUTO,
		SUJI_KABUTO,
		SUJI_KABUTO_MENPO,
		SUJI_KABUTO_CIRCLE,
		SUJI_KABUTO_LEAVES,
		SUJI_KABUTO_ANTLERS,
		SUJI_KABUTO_CRESCENT,
		SUJI_KABUTO_HORNS,
		SUJI_KABUTO_MENPO_CIRCLE,
		SUJI_KABUTO_MENPO_LEAVES,
		SUJI_KABUTO_MENPO_ANTLERS,
		SUJI_KABUTO_MENPO_CRESCENT,
		SUJI_KABUTO_MENPO_HORNS,
		DO,
		DO_K,
		DO_S,
		DO_M,
		DO_L,
		HAIDATE,
		SUNEATE,
		HAKAMA
	}
}
