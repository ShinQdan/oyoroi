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
public class DoMaruModel {
	public static final ModelLayerLocation DO_LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(OYoroi.MODID, "do-maru"), "main");
	public static final ModelLayerLocation DO_K_LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(OYoroi.MODID, "do-maru_k"), "main");
	public static final ModelLayerLocation DO_S_LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(OYoroi.MODID, "do-maru_s"), "main");
	public static final ModelLayerLocation DO_M_LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(OYoroi.MODID, "do-maru_m"), "main");
	public static final ModelLayerLocation DO_L_LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(OYoroi.MODID, "do-maru_l"), "main");

	@SubscribeEvent
	public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event){
		event.registerLayerDefinition(DO_LAYER_LOCATION, () -> createBodyLayer(0));
		event.registerLayerDefinition(DO_K_LAYER_LOCATION, () -> createBodyLayer(1));
		event.registerLayerDefinition(DO_S_LAYER_LOCATION, () -> createBodyLayer(2));
		event.registerLayerDefinition(DO_M_LAYER_LOCATION, () -> createBodyLayer(3));
		event.registerLayerDefinition(DO_L_LAYER_LOCATION, () -> createBodyLayer(4));
	}

	public static LayerDefinition createBodyLayer(int v) {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition kusazuri = body.addOrReplaceChild("kusazuri", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition kusazuri_front = kusazuri.addOrReplaceChild("kusazuri_front", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		kusazuri_front.addOrReplaceChild("right_plate3_r1", CubeListBuilder.create().texOffs(4, 50).addBox(-0.75F, 12.5F, -1.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(49, 50).addBox(-1.5F, 11.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.7854F, 0.0F));

		kusazuri_front.addOrReplaceChild("left_plate3_r1", CubeListBuilder.create().texOffs(27, 51).addBox(-0.25F, 12.5F, -1.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(38, 51).addBox(0.5F, 11.0F, -1.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, -0.7854F, 0.0F));

		kusazuri_front.addOrReplaceChild("plate3_r4", CubeListBuilder.create().texOffs(0, 82).addBox(-4.0F, 12.0F, 0.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(82, 4).addBox(-4.0F, 10.5F, 0.5F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(82, 7).addBox(-4.0F, 9.0F, 1.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));

		PartDefinition kusazuri_back = kusazuri.addOrReplaceChild("kusazuri_back", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		kusazuri_back.addOrReplaceChild("right_plate3_r2", CubeListBuilder.create().texOffs(12, 39).addBox(-0.75F, 12.5F, 0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(17, 47).addBox(-1.5F, 11.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, -0.7854F, 0.0F));

		kusazuri_back.addOrReplaceChild("left_plate3_r2", CubeListBuilder.create().texOffs(4, 47).addBox(-0.25F, 12.5F, 0.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(48, 27).addBox(0.5F, 11.0F, 0.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.7854F, 0.0F));

		kusazuri_back.addOrReplaceChild("plate3_r5", CubeListBuilder.create().texOffs(44, 47).addBox(-4.0F, 12.0F, -1.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(81, 37).addBox(-4.0F, 10.5F, -1.5F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(77, 81).addBox(-4.0F, 9.0F, -2.0F, 8.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));

		body.addOrReplaceChild("do", CubeListBuilder.create().texOffs(0, 22).addBox(-4.5F, 3.9F, -2.5F, 9.0F, 8.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(42, 39).addBox(-3.5F, 0.9F, -2.5F, 7.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(13, 82).addBox(-3.5F, -0.1F, -2.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(12, 37).addBox(1.5F, -0.1F, -2.5F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition yodare_kake = body.addOrReplaceChild("yodare_kake", CubeListBuilder.create().texOffs(0, 64).addBox(-1.5F, -0.25F, -3.0F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		yodare_kake.addOrReplaceChild("plate2_r2", CubeListBuilder.create().texOffs(42, 15).addBox(-2.0F, 0.75F, -3.25F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition ornaments = body.addOrReplaceChild("ornaments", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition sendan = ornaments.addOrReplaceChild("sendan", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		sendan.addOrReplaceChild("plate4_r4", CubeListBuilder.create().texOffs(34, 27).addBox(-4.25F, 1.75F, -3.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(35, 33).addBox(-4.25F, 1.0F, -3.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(37, 6).addBox(-4.25F, 0.25F, -3.255F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(37, 42).addBox(-4.25F, -0.5F, -3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		ornaments.addOrReplaceChild("kyubi", CubeListBuilder.create().texOffs(21, 37).addBox(2.25F, 0.25F, -3.0F, 2.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));
		if(v>0){
			right_arm.addOrReplaceChild("right_kote", CubeListBuilder.create().texOffs(66, 40).addBox(1.5F, -3.5F, -2.5F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 2.0F, 0.0F));
			right_arm.addOrReplaceChild("right_tekko", CubeListBuilder.create().texOffs(84, 84).addBox(-8.5F, -14.5F, -2.5F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
			.texOffs(0, 73).addBox(-8.5F, -17.5F, -2.5F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, 22.0F, 0.0F));
		}
		if(v==2){
			PartDefinition right_small_sode = right_arm.addOrReplaceChild("right_small_sode", CubeListBuilder.create().texOffs(46, 86).addBox(-4.0F, -1.5F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
			right_small_sode.addOrReplaceChild("plate4_r5", CubeListBuilder.create().texOffs(22, 86).addBox(-4.8F, 1.0F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2182F));
			right_small_sode.addOrReplaceChild("plate3_r6", CubeListBuilder.create().texOffs(34, 86).addBox(-4.4F, -0.5F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
			right_small_sode.addOrReplaceChild("plate1_r1", CubeListBuilder.create().texOffs(87, 20).addBox(-3.75F, -2.5F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
			right_small_sode.addOrReplaceChild("top_r1", CubeListBuilder.create().texOffs(80, 69).addBox(-3.0F, -3.0F, -2.5F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));
		}else if(v==3){
			PartDefinition right_medium_sode = right_arm.addOrReplaceChild("right_medium_sode", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
			right_medium_sode.addOrReplaceChild("back_plate6_r1", CubeListBuilder.create().texOffs(74, 92).addBox(-4.9F, 0.5F, -2.25F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
			.texOffs(86, 92).addBox(-4.5F, -1.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, -0.3054F));
			right_medium_sode.addOrReplaceChild("front_plate6_r1", CubeListBuilder.create().texOffs(80, 92).addBox(-4.9F, 0.5F, 0.25F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
			.texOffs(92, 92).addBox(-4.5F, -1.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, -0.3054F));
			right_medium_sode.addOrReplaceChild("med_plate6_r1", CubeListBuilder.create().texOffs(33, 51).addBox(-5.1F, 0.5F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
			.texOffs(54, 22).addBox(-4.75F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3054F));
			right_medium_sode.addOrReplaceChild("back_plate4_r1", CubeListBuilder.create().texOffs(22, 93).addBox(-4.25F, -2.1F, -1.75F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, -0.1745F));
			right_medium_sode.addOrReplaceChild("front_plate4_r1", CubeListBuilder.create().texOffs(28, 93).addBox(-4.25F, -2.1F, -0.25F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, -0.1745F));
			right_medium_sode.addOrReplaceChild("med_plate4_r1", CubeListBuilder.create().texOffs(55, 50).addBox(-4.25F, -2.1F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
			.texOffs(30, 15).addBox(-1.0F, -3.0F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
			right_medium_sode.addOrReplaceChild("back_plate3_r1", CubeListBuilder.create().texOffs(15, 73).addBox(-1.0F, -4.0F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, -1.0472F));
			right_medium_sode.addOrReplaceChild("front_plate3_r1", CubeListBuilder.create().texOffs(51, 73).addBox(-1.0F, -4.0F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, -1.0472F));
			right_medium_sode.addOrReplaceChild("med_plate3_r1", CubeListBuilder.create().texOffs(0, 15).addBox(-1.0F, -4.0F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0472F));
			right_medium_sode.addOrReplaceChild("back_plate2_r1", CubeListBuilder.create().texOffs(28, 76).addBox(-1.0F, -3.5F, -1.25F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, -0.6109F));
			right_medium_sode.addOrReplaceChild("front_plate2_r1", CubeListBuilder.create().texOffs(41, 80).addBox(-1.0F, -3.5F, -0.75F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, -0.6109F));
			right_medium_sode.addOrReplaceChild("med_plate2_r1", CubeListBuilder.create().texOffs(30, 11).addBox(-1.0F, -3.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6109F));
			right_medium_sode.addOrReplaceChild("back_plate1_r1", CubeListBuilder.create().texOffs(22, 82).addBox(-1.0F, -3.25F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.7854F, 0.0F, -0.1745F));
			right_medium_sode.addOrReplaceChild("front_plate1_r1", CubeListBuilder.create().texOffs(83, 19).addBox(-1.0F, -3.25F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7854F, 0.0F, -0.1745F));
		}else if(v==4){
			PartDefinition right_large_sode = right_arm.addOrReplaceChild("right_large_sode", CubeListBuilder.create().texOffs(61, 29).addBox(-4.0F, -1.5F, -4.5F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
			right_large_sode.addOrReplaceChild("plate4_r6", CubeListBuilder.create().texOffs(0, 59).addBox(-4.8F, 1.0F, -4.5F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2182F));
			right_large_sode.addOrReplaceChild("plate3_r7", CubeListBuilder.create().texOffs(33, 59).addBox(-4.4F, -0.5F, -4.5F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
			right_large_sode.addOrReplaceChild("plate1_r2", CubeListBuilder.create().texOffs(11, 62).addBox(-3.75F, -2.5F, -4.5F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
			right_large_sode.addOrReplaceChild("top_r2", CubeListBuilder.create().texOffs(46, 80).addBox(-3.0F, -3.0F, -2.5F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0873F));
		}

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));
		if(v>0){
			left_arm.addOrReplaceChild("left_kote", CubeListBuilder.create().texOffs(64, 0).addBox(-0.5F, -1.5F, -2.5F, 4.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
			left_arm.addOrReplaceChild("left_tekko", CubeListBuilder.create().texOffs(72, 84).addBox(2.5F, 7.5F, -2.5F, 1.0F, 3.0F, 5.0F, new CubeDeformation(0.0F))
			.texOffs(72, 25).addBox(-1.5F, 4.5F, -2.5F, 5.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		}
		if(v==2){
			PartDefinition left_small_sode = left_arm.addOrReplaceChild("left_small_sode", CubeListBuilder.create().texOffs(0, 85).addBox(13.0F, -1.5F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-10.0F, 0.0F, 0.0F));
			left_small_sode.addOrReplaceChild("plate4_r7", CubeListBuilder.create().texOffs(30, 3).addBox(3.8F, 1.0F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2182F));
			left_small_sode.addOrReplaceChild("plate3_r8", CubeListBuilder.create().texOffs(58, 31).addBox(3.4F, -0.5F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
			left_small_sode.addOrReplaceChild("plate1_r3", CubeListBuilder.create().texOffs(59, 85).addBox(2.75F, -2.5F, -2.5F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
			left_small_sode.addOrReplaceChild("top_r3", CubeListBuilder.create().texOffs(28, 80).addBox(-1.0F, -3.0F, -2.5F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));
		}else if(v==3){
			PartDefinition left_medium_sode = left_arm.addOrReplaceChild("left_medium_sode", CubeListBuilder.create(), PartPose.offset(-10.0F, 0.0F, 0.0F));
			left_medium_sode.addOrReplaceChild("back_plate6_r2", CubeListBuilder.create().texOffs(41, 86).addBox(3.9F, 0.25F, -2.25F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
			.texOffs(18, 91).addBox(3.5F, -1.0F, -2.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.3054F));
			left_medium_sode.addOrReplaceChild("front_plate6_r2", CubeListBuilder.create().texOffs(53, 86).addBox(3.9F, 0.25F, 0.25F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
			.texOffs(56, 92).addBox(3.5F, -1.0F, 0.0F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.3054F));
			left_medium_sode.addOrReplaceChild("med_plate6_r2", CubeListBuilder.create().texOffs(43, 27).addBox(4.1F, 0.25F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
			.texOffs(44, 50).addBox(3.75F, -1.0F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3054F));
			left_medium_sode.addOrReplaceChild("back_plate4_r2", CubeListBuilder.create().texOffs(62, 92).addBox(3.25F, -2.1F, -1.75F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.1745F));
			left_medium_sode.addOrReplaceChild("front_plate4_r2", CubeListBuilder.create().texOffs(68, 92).addBox(3.25F, -2.1F, -0.25F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.1745F));
			left_medium_sode.addOrReplaceChild("med_plate4_r2", CubeListBuilder.create().texOffs(22, 51).addBox(3.25F, -2.1F, -1.5F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
			.texOffs(0, 11).addBox(-1.0F, -3.0F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
			left_medium_sode.addOrReplaceChild("back_plate3_r2", CubeListBuilder.create().texOffs(64, 11).addBox(-1.0F, -4.0F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 1.0472F));
			left_medium_sode.addOrReplaceChild("front_plate3_r2", CubeListBuilder.create().texOffs(33, 64).addBox(-1.0F, -4.0F, -0.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 1.0472F));
			left_medium_sode.addOrReplaceChild("med_plate3_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -4.0F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0472F));
			left_medium_sode.addOrReplaceChild("back_plate2_r2", CubeListBuilder.create().texOffs(66, 51).addBox(-1.0F, -3.5F, -1.25F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.6109F));
			left_medium_sode.addOrReplaceChild("front_plate2_r2", CubeListBuilder.create().texOffs(66, 62).addBox(-1.0F, -3.5F, -0.75F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.6109F));
			left_medium_sode.addOrReplaceChild("med_plate2_r2", CubeListBuilder.create().texOffs(0, 4).addBox(-1.0F, -3.5F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6109F));
			left_medium_sode.addOrReplaceChild("back_plate1_r2", CubeListBuilder.create().texOffs(0, 70).addBox(-1.0F, -3.25F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, 0.0F, -0.7854F, 0.0F, 0.1745F));
			left_medium_sode.addOrReplaceChild("front_plate1_r2", CubeListBuilder.create().texOffs(33, 70).addBox(-1.0F, -3.25F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, 0.0F, 0.7854F, 0.0F, 0.1745F));
		}else if(v==4){
			PartDefinition left_large_sode = left_arm.addOrReplaceChild("left_large_sode", CubeListBuilder.create().texOffs(55, 47).addBox(13.0F, -1.5F, -4.5F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(-10.0F, 0.0F, 0.0F));
			left_large_sode.addOrReplaceChild("plate4_r8", CubeListBuilder.create().texOffs(22, 53).addBox(3.8F, 1.0F, -4.5F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2182F));
			left_large_sode.addOrReplaceChild("plate3_r9", CubeListBuilder.create().texOffs(54, 18).addBox(3.4F, -0.5F, -4.5F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1745F));
			left_large_sode.addOrReplaceChild("plate1_r4", CubeListBuilder.create().texOffs(55, 58).addBox(2.75F, -2.5F, -4.5F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1745F));
			left_large_sode.addOrReplaceChild("top_r4", CubeListBuilder.create().texOffs(15, 76).addBox(-1.0F, -3.0F, -2.5F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.0873F));
		}

		return LayerDefinition.create(meshdefinition, 128, 128);
	}
}
