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
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

@Mod.EventBusSubscriber(modid = OYoroi.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ZunariKabutoModel {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(OYoroi.MODID, "zunari_kabuto"), "main");
	
	@SubscribeEvent
	public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event){
		event.registerLayerDefinition(LAYER_LOCATION, ZunariKabutoModel::createBodyLayer);
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(88, 87).addBox(-5.0F, -11.0F, -5.0F, 10.0F, 3.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition front = head.addOrReplaceChild("front", CubeListBuilder.create().texOffs(79, 43).addBox(-5.0F, -8.0F, -5.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		front.addOrReplaceChild("plate2_r1", CubeListBuilder.create().texOffs(59, 81).addBox(-4.0F, -5.0F, -7.5F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition back = head.addOrReplaceChild("back", CubeListBuilder.create().texOffs(77, 62).addBox(-5.0F, -8.0F, 4.0F, 10.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		back.addOrReplaceChild("plate3_r1", CubeListBuilder.create().texOffs(77, 0).addBox(-5.0F, 0.0F, 5.0F, 10.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(77, 51).addBox(-5.0F, -2.0F, 5.5F, 10.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(77, 55).addBox(-5.0F, -4.0F, 6.0F, 10.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition left = head.addOrReplaceChild("left", CubeListBuilder.create().texOffs(67, 62).addBox(4.0F, -8.0F, -4.0F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		left.addOrReplaceChild("panel0_r1", CubeListBuilder.create().texOffs(12, 91).addBox(1.0F, -3.0F, -9.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, -0.3927F));
		left.addOrReplaceChild("plate3_r2", CubeListBuilder.create().texOffs(11, 50).addBox(5.0F, 0.0F, -4.0F, 1.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(44, 50).addBox(5.5F, -2.0F, -4.0F, 1.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(53, 6).addBox(6.0F, -4.0F, -4.0F, 1.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition right = head.addOrReplaceChild("right", CubeListBuilder.create().texOffs(67, 51).addBox(-5.0F, -8.0F, -4.0F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		right.addOrReplaceChild("panel0_r2", CubeListBuilder.create().texOffs(22, 64).addBox(-2.0F, -3.0F, -9.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.3927F));
		right.addOrReplaceChild("plate3_r3", CubeListBuilder.create().texOffs(43, 24).addBox(-6.0F, 0.0F, -4.0F, 1.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(0, 47).addBox(-6.5F, -2.0F, -4.0F, 1.0F, 3.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(33, 47).addBox(-7.0F, -4.0F, -4.0F, 1.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3927F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}
}
