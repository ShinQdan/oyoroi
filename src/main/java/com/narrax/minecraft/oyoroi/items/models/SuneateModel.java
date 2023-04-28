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
public class SuneateModel {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(OYoroi.MODID, "suneate"), "main");
	
	@SubscribeEvent
	public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event){
		event.registerLayerDefinition(LAYER_LOCATION, SuneateModel::createBodyLayer);
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition left_foot = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(1.9F, 12.0F, 0.0F));

		left_foot.addOrReplaceChild("left_suneate", CubeListBuilder.create().texOffs(56, 73).addBox(-2.4F, 7.0F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(92, 30).addBox(-2.4F, 9.0F, -2.5F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		left_foot.addOrReplaceChild("left_tabi", CubeListBuilder.create().texOffs(27, 37).addBox(-0.4F, 10.25F, -2.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(55, 62).addBox(-1.4F, 8.25F, 1.25F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 35).addBox(1.35F, 8.25F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(71, 75).addBox(-2.4F, 11.25F, -2.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_foot = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(-1.9F, 12.0F, 0.0F));

		right_foot.addOrReplaceChild("right_suneate", CubeListBuilder.create().texOffs(36, 73).addBox(-2.6F, 7.0F, -2.5F, 5.0F, 2.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(91, 84).addBox(-2.6F, 9.0F, -2.5F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		right_foot.addOrReplaceChild("right_tabi", CubeListBuilder.create().texOffs(36, 19).addBox(-0.6F, 10.25F, -2.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(61, 40).addBox(-1.6F, 8.25F, 1.25F, 3.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(30, 3).addBox(-2.35F, 8.25F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(75, 11).addBox(-2.6F, 11.25F, -2.5F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}
}