package com.narrax.minecraft.oyoroi.items.models;

import com.narrax.minecraft.oyoroi.OYoroi;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = OYoroi.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class HaidateModel {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(OYoroi.MODID, "haidate"), "main");

	@SubscribeEvent
	public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event){
		event.registerLayerDefinition(LAYER_LOCATION, HaidateModel::createBodyLayer);
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create().texOffs(42, 3).addBox(-2.4F, 0.0F, -2.5F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(1.9F, 12.0F, 0.0F));

		PartDefinition left_haidate = left_leg.addOrReplaceChild("left_haidate", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		left_haidate.addOrReplaceChild("plate1_r5", CubeListBuilder.create().texOffs(90, 13).addBox(-2.9F, 0.0F, -3.75F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(90, 10).addBox(-2.9F, 1.5F, -4.25F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 88).addBox(-2.9F, 3.0F, -4.75F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(87, 27).addBox(-2.9F, 4.5F, -5.25F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, -0.3054F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create().texOffs(22, 39).addBox(-2.6F, 0.0F, -2.5F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition right_haidate = right_leg.addOrReplaceChild("right_haidate", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		right_haidate.addOrReplaceChild("plate1_r6", CubeListBuilder.create().texOffs(86, 75).addBox(-3.1F, 0.0F, -3.75F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(85, 59).addBox(-3.1F, 1.5F, -4.25F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(84, 48).addBox(-3.1F, 3.0F, -4.75F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(84, 45).addBox(-3.1F, 4.5F, -5.25F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.3054F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}
}