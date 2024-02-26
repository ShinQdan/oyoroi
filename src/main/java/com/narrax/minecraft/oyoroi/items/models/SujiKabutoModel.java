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
public class SujiKabutoModel {
	public static final ModelLayerLocation SUJI_KABUTO_LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(OYoroi.MODID, "do-maru_kabuto"), "main");
	public static final ModelLayerLocation SUJI_KABUTO_MENPO_LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(OYoroi.MODID, "do-maru_kabuto_menpo"), "main");
	public static final ModelLayerLocation SUJI_KABUTO_CIRCLE_LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(OYoroi.MODID, "do-maru_kabuto_circle"), "main");
	public static final ModelLayerLocation SUJI_KABUTO_LEAVES_LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(OYoroi.MODID, "do-maru_kabuto_leaves"), "main");
	public static final ModelLayerLocation SUJI_KABUTO_ANTLERS_LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(OYoroi.MODID, "do-maru_kabuto_antlers"), "main");
	public static final ModelLayerLocation SUJI_KABUTO_CRESCENT_LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(OYoroi.MODID, "do-maru_kabuto_crescent"), "main");
	public static final ModelLayerLocation SUJI_KABUTO_HORNS_LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(OYoroi.MODID, "do-maru_kabuto_horns"), "main");
	public static final ModelLayerLocation SUJI_KABUTO_MENPO_CIRCLE_LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(OYoroi.MODID, "do-maru_kabuto_menpo_circle"), "main");
	public static final ModelLayerLocation SUJI_KABUTO_MENPO_LEAVES_LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(OYoroi.MODID, "do-maru_kabuto_menpo_leaves"), "main");
	public static final ModelLayerLocation SUJI_KABUTO_MENPO_ANTLERS_LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(OYoroi.MODID, "do-maru_kabuto_menpo_antlers"), "main");
	public static final ModelLayerLocation SUJI_KABUTO_MENPO_CRESCENT_LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(OYoroi.MODID, "do-maru_kabuto_menpo_crescent"), "main");
	public static final ModelLayerLocation SUJI_KABUTO_MENPO_HORNS_LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(OYoroi.MODID, "do-maru_kabuto_menpo_horns"), "main");
	
	@SubscribeEvent
	public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event){
		event.registerLayerDefinition(SUJI_KABUTO_LAYER_LOCATION, () -> createBodyLayer(0, false));
		event.registerLayerDefinition(SUJI_KABUTO_MENPO_LAYER_LOCATION, () -> createBodyLayer(0, true));
		event.registerLayerDefinition(SUJI_KABUTO_CIRCLE_LAYER_LOCATION, () -> createBodyLayer(1, false));
		event.registerLayerDefinition(SUJI_KABUTO_LEAVES_LAYER_LOCATION, () -> createBodyLayer(2, false));
		event.registerLayerDefinition(SUJI_KABUTO_ANTLERS_LAYER_LOCATION, () -> createBodyLayer(3, false));
		event.registerLayerDefinition(SUJI_KABUTO_CRESCENT_LAYER_LOCATION, () -> createBodyLayer(4, false));
		event.registerLayerDefinition(SUJI_KABUTO_HORNS_LAYER_LOCATION, () -> createBodyLayer(5, false));
		event.registerLayerDefinition(SUJI_KABUTO_MENPO_CIRCLE_LAYER_LOCATION, () -> createBodyLayer(1, true));
		event.registerLayerDefinition(SUJI_KABUTO_MENPO_LEAVES_LAYER_LOCATION, () -> createBodyLayer(2, true));
		event.registerLayerDefinition(SUJI_KABUTO_MENPO_ANTLERS_LAYER_LOCATION, () -> createBodyLayer(3, true));
		event.registerLayerDefinition(SUJI_KABUTO_MENPO_CRESCENT_LAYER_LOCATION, () -> createBodyLayer(4, true));
		event.registerLayerDefinition(SUJI_KABUTO_MENPO_HORNS_LAYER_LOCATION, () -> createBodyLayer(5, true));
	}

	public static LayerDefinition createBodyLayer(int v, boolean menpo) {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -9.0F, -5.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition front2 = head.addOrReplaceChild("front2", CubeListBuilder.create().texOffs(75, 17).addBox(-5.0F, -8.0F, -5.0F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		front2.addOrReplaceChild("mabisashi_r1", CubeListBuilder.create().texOffs(42, 18).addBox(-4.0F, -5.0F, -7.5F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition back2 = head.addOrReplaceChild("back2", CubeListBuilder.create().texOffs(72, 33).addBox(-5.0F, -8.0F, 4.0F, 10.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		back2.addOrReplaceChild("plate4_r1", CubeListBuilder.create().texOffs(30, 0).addBox(-7.0F, -0.4F, 7.0F, 14.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(65, 22).addBox(-6.0F, -2.2F, 6.5F, 12.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(79, 40).addBox(-5.0F, -4.0F, 6.0F, 10.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition left2 = head.addOrReplaceChild("left2", CubeListBuilder.create().texOffs(23, 65).addBox(4.0F, -8.0F, -4.0F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		left2.addOrReplaceChild("plate4_r2", CubeListBuilder.create().texOffs(29, 11).addBox(7.0F, -0.4F, -4.0F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(0, 35).addBox(6.5F, -2.2F, -4.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(44, 62).addBox(6.0F, -4.0F, -4.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3927F));
		PartDefinition left_fukikaeshi = left2.addOrReplaceChild("left_fukikaeshi", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		left_fukikaeshi.addOrReplaceChild("panel2_r1", CubeListBuilder.create().texOffs(0, 59).addBox(1.0F, -4.0F, -10.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(40, 93).addBox(1.5F, -2.0F, -9.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, -0.3927F));
		left_fukikaeshi.addOrReplaceChild("panel3_r1", CubeListBuilder.create().texOffs(17, 96).addBox(5.0F, -4.0F, -9.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(95, 81).addBox(5.0F, -2.0F, -8.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3927F, -0.3927F));
		PartDefinition right2 = head.addOrReplaceChild("right2", CubeListBuilder.create().texOffs(65, 11).addBox(-5.0F, -8.0F, -4.0F, 1.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		right2.addOrReplaceChild("plate4_r3", CubeListBuilder.create().texOffs(17, 24).addBox(-8.0F, -0.4F, -4.0F, 1.0F, 2.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(31, 27).addBox(-7.5F, -2.2F, -4.0F, 1.0F, 2.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(90, 57).addBox(-7.0F, -4.0F, -4.0F, 1.0F, 2.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3927F));
		PartDefinition right_fukikaeshi = right2.addOrReplaceChild("right_fukikaeshi", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		right_fukikaeshi.addOrReplaceChild("panel2_r2", CubeListBuilder.create().texOffs(57, 0).addBox(-2.0F, -4.0F, -10.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(34, 93).addBox(-2.5F, -2.0F, -9.5F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.3927F));
		right_fukikaeshi.addOrReplaceChild("panel3_r2", CubeListBuilder.create().texOffs(6, 95).addBox(-7.0F, -4.0F, -9.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 95).addBox(-7.0F, -2.0F, -8.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3927F, 0.3927F));

		if(menpo){
			head.addOrReplaceChild("menpo", CubeListBuilder.create().texOffs(98, 68).addBox(-4.5F, -0.75F, -4.5F, 9.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
			.texOffs(0, 22).addBox(-0.5F, -6.75F, -4.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
			.texOffs(30, 24).addBox(-4.5F, -2.75F, -4.5F, 9.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
			.texOffs(11, 47).addBox(-4.5F, -7.75F, -4.5F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
			.texOffs(30, 27).addBox(3.5F, -7.75F, -4.5F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
			.texOffs(37, 3).addBox(-4.5F, -1.75F, -4.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
			.texOffs(37, 39).addBox(1.5F, -1.75F, -4.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		}

		if(v==1){
			head.addOrReplaceChild("maedate", CubeListBuilder.create().texOffs(54, 29).addBox(-1.5F, -11.0F, -5.5F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		}else if(v==2){
			head.addOrReplaceChild("type1", CubeListBuilder.create().texOffs(94, 33).addBox(-1.0F, -10.0F, -5.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
			.texOffs(33, 59).addBox(1.0F, -15.0F, -5.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
			.texOffs(22, 56).addBox(-4.0F, -15.0F, -5.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
			.texOffs(11, 62).addBox(1.0F, -13.0F, -5.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F))
			.texOffs(44, 62).addBox(-3.0F, -13.0F, -5.5F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		}else if(v==3){
			head.addOrReplaceChild("type2", CubeListBuilder.create().texOffs(0, 47).addBox(-0.5F, -16.0F, -5.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F))
			.texOffs(36, 29).addBox(-1.5F, -10.0F, -5.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
			.texOffs(23, 24).addBox(0.5F, -10.0F, -5.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
			.texOffs(94, 22).addBox(1.5F, -11.0F, -5.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
			.texOffs(0, 19).addBox(1.5F, -12.0F, -5.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
			.texOffs(0, 8).addBox(-4.5F, -12.0F, -5.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
			.texOffs(94, 19).addBox(-3.5F, -11.0F, -5.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		}else if(v==4){
			head.addOrReplaceChild("type3", CubeListBuilder.create().texOffs(0, 92).addBox(-2.5F, -10.0F, -5.5F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F))
			.texOffs(29, 86).addBox(1.5F, -12.0F, -5.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
			.texOffs(30, 19).addBox(-2.5F, -13.0F, -5.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
			.texOffs(23, 22).addBox(0.5F, -13.0F, -5.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
			.texOffs(7, 85).addBox(-3.5F, -12.0F, -5.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		}else if(v==5){
			PartDefinition type4 = head.addOrReplaceChild("type4", CubeListBuilder.create().texOffs(62, 0).addBox(-1.0F, -10.0F, -5.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
			type4.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 35).addBox(0.5F, -17.0F, -5.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));
			type4.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(4, 35).addBox(-1.5F, -17.0F, -5.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2618F));
		}

		return LayerDefinition.create(meshdefinition, 128, 128);
	}
}
