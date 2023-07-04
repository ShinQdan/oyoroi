package com.narrax.minecraft.oyoroi.items;

import com.narrax.minecraft.oyoroi.OYoroi;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.Tags.Items;

public class OYoroiMaterial implements ArmorMaterial {
	public static final OYoroiMaterial IRON = new OYoroiMaterial("iron_oyoroi", ArmorMaterials.IRON, 1, 15, Ingredient.of(ModItems.LAMELLAR_PLATE.get()));
	public static final OYoroiMaterial IRON_E1 = new OYoroiMaterial("iron_oyoroi", ArmorMaterials.IRON, 2, 15, Ingredient.of(ModItems.LAMELLAR_PLATE.get()));
	public static final OYoroiMaterial IRON_E3 = new OYoroiMaterial("iron_oyoroi", ArmorMaterials.IRON, 3, 15, Ingredient.of(ModItems.LAMELLAR_PLATE.get()));
	public static final OYoroiMaterial IRON_E4 = new OYoroiMaterial("iron_oyoroi", ArmorMaterials.IRON, 4, 15, Ingredient.of(ModItems.LAMELLAR_PLATE.get()));
	public static final OYoroiMaterial IRON_E5 = new OYoroiMaterial("iron_oyoroi", ArmorMaterials.IRON, 5, 15, Ingredient.of(ModItems.LAMELLAR_PLATE.get()));
	public static final OYoroiMaterial IRON_D01 = new OYoroiMaterial("iron_oyoroi", ArmorMaterials.IRON, 1, 15, Ingredient.of(ModItems.LAMELLAR_PLATE.get()), -1);
	public static final OYoroiMaterial IRON_D1 = new OYoroiMaterial("iron_oyoroi", ArmorMaterials.IRON, 1, 15, Ingredient.of(ModItems.LAMELLAR_PLATE.get()), 1);
	public static final OYoroiMaterial IRON_D2_E1 = new OYoroiMaterial("iron_oyoroi", ArmorMaterials.IRON, 2, 15, Ingredient.of(ModItems.LAMELLAR_PLATE.get()), 2);

	public static final OYoroiMaterial NETHERITE = new OYoroiMaterial("netherite_oyoroi", ArmorMaterials.NETHERITE, 1, 37);
	public static final OYoroiMaterial NETHERITE_E1 = new OYoroiMaterial("netherite_oyoroi", ArmorMaterials.NETHERITE, 2, 37);
	public static final OYoroiMaterial NETHERITE_E3 = new OYoroiMaterial("netherite_oyoroi", ArmorMaterials.NETHERITE, 3, 37);
	public static final OYoroiMaterial NETHERITE_E4 = new OYoroiMaterial("netherite_oyoroi", ArmorMaterials.NETHERITE, 4, 37);
	public static final OYoroiMaterial NETHERITE_E5 = new OYoroiMaterial("netherite_oyoroi", ArmorMaterials.NETHERITE, 5, 37);
	public static final OYoroiMaterial NETHERITE_D02 = new OYoroiMaterial("netherite_oyoroi", ArmorMaterials.NETHERITE, 1, 37, -2);
	public static final OYoroiMaterial NETHERITE_D01 = new OYoroiMaterial("netherite_oyoroi", ArmorMaterials.NETHERITE, 1, 37, -1);
	public static final OYoroiMaterial NETHERITE_D1 = new OYoroiMaterial("netherite_oyoroi", ArmorMaterials.NETHERITE, 1, 37, 1);
	public static final OYoroiMaterial NETHERITE_D2_E1 = new OYoroiMaterial("netherite_oyoroi", ArmorMaterials.NETHERITE, 2, 37, 2);

	public static final OYoroiMaterial LEATHER = new OYoroiMaterial("leather_oyoroi", ArmorMaterials.LEATHER, 1, 5, Ingredient.of(Items.LEATHER));

	private final String name;
	private final int[] durability;
	private final int[] protection;
	private final int enchantmentValue;
	private final SoundEvent sound;
	private final float toughness;
	private final float knockbackResistance;
	private final Ingredient repairIngredient;

	public OYoroiMaterial(String name, int[] durability, int[] protection, 
	int enchantmentValue, SoundEvent sound, float toughness, 
	float knockbackResistance, Ingredient repaIngredient){
		this.name = name;
		this.durability = durability;
		this.protection = protection;
		this.enchantmentValue = enchantmentValue;
		this.sound = sound;
		this.toughness = toughness;
		this.knockbackResistance = knockbackResistance;
		this.repairIngredient = repaIngredient;
	}

	public OYoroiMaterial(String name, ArmorMaterial base, int addition, int durabilityMult, Ingredient repairIngredient){
		this(
			name,
			new int[]{
				base.getDurabilityForType(ArmorItem.Type.BOOTS) + addition*durabilityMult,
				base.getDurabilityForType(ArmorItem.Type.LEGGINGS) + addition*durabilityMult,
				base.getDurabilityForType(ArmorItem.Type.CHESTPLATE) + addition*durabilityMult,
				base.getDurabilityForType(ArmorItem.Type.HELMET) + addition*durabilityMult
			}, 
			new int[]{
				base.getDefenseForType(ArmorItem.Type.BOOTS),
				base.getDefenseForType(ArmorItem.Type.LEGGINGS),
				base.getDefenseForType(ArmorItem.Type.CHESTPLATE),
				base.getDefenseForType(ArmorItem.Type.HELMET)
			},
			base.getEnchantmentValue()+addition, 
			base.getEquipSound(), 
			base.getToughness(), 
			base.getKnockbackResistance(), 
			repairIngredient
		);
	}

	public OYoroiMaterial(String name, ArmorMaterial base, int addition, int durabilityMult, int defAddition){
		this(name, base, addition, durabilityMult, base.getRepairIngredient(), defAddition);
	}

	public OYoroiMaterial(String name, ArmorMaterial base, int addition, int durabilityMult){
		this(name, base, addition, durabilityMult, base.getRepairIngredient());
	}

	public OYoroiMaterial(String name, ArmorMaterial base, int addition, int durabilityMult, Ingredient repairIngredient, int defAddition){
		this(name, base, addition, durabilityMult, repairIngredient);
		for(int i = 0; i<protection.length; i++){
			protection[i] += defAddition;
		}
	}

	public OYoroiMaterial(String name, ArmorMaterial base){
		this(name, base, 0, 0);
	}

	@Override
	public int getDurabilityForType(ArmorItem.Type armorType){
		return durability[armorType.getSlot().getIndex()];
	}

	@Override
	public int getDefenseForType(ArmorItem.Type armorType){
		return protection[armorType.getSlot().getIndex()];
	}

	@Override
	public int getEnchantmentValue() {
		return enchantmentValue;
	}

	@Override
	public SoundEvent getEquipSound() {
		return sound;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return repairIngredient;
	}

	@Override
	public String getName() {
		return OYoroi.MODID+":"+name;
	}

	@Override
	public float getToughness() {
		return toughness;
	}

	@Override
	public float getKnockbackResistance() {
		return knockbackResistance;
	}
	
}
