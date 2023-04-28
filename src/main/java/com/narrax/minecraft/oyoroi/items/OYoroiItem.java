package com.narrax.minecraft.oyoroi.items;

import java.util.function.Consumer;

import org.jetbrains.annotations.NotNull;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeableArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;

public class OYoroiItem extends DyeableArmorItem {
	private final ModelLayerLocation location;

	public OYoroiItem(ArmorMaterial material, EquipmentSlot slot, ModelLayerLocation location){
		this(material, slot, new Properties(), location);
	}

	public OYoroiItem(ArmorMaterial material, EquipmentSlot slot, Properties properties, ModelLayerLocation location){
		super(material, slot, properties.tab(CreativeModeTab.TAB_COMBAT));
		this.location = location;
	}
	
	@Override
	public void initializeClient(Consumer<IClientItemExtensions> consumer){
		consumer.accept(new IClientItemExtensions() {
			@Override
			public @NotNull HumanoidModel<?> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, HumanoidModel<?> original) {
				EntityModelSet models = Minecraft.getInstance().getEntityModels();
				ModelPart root = models.bakeLayer(location);
				return new HumanoidModel<LivingEntity>(root);
			}
		});
	}

	@Override
	public int getColor(ItemStack p_41122_){
		CompoundTag compoundtag = p_41122_.getTagElement("display");
		return compoundtag != null && compoundtag.contains("color", 99) ? compoundtag.getInt("color") : 0xc0c0c0;
	}
}
