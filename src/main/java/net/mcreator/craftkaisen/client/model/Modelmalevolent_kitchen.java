package net.mcreator.craftkaisen.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelmalevolent_kitchen<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_kaisen", "modelmalevolent_kitchen"), "main");
	public final ModelPart ms;

	public Modelmalevolent_kitchen(ModelPart root) {
		this.ms = root.getChild("ms");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition ms = partdefinition.addOrReplaceChild("ms", CubeListBuilder.create(), PartPose.offset(0.0F, 12.0F, 11.0F));
		PartDefinition body_ms = ms.addOrReplaceChild("body_ms",
				CubeListBuilder.create().texOffs(492, 472).addBox(-32.0F, -80.0F, 13.0F, 64.0F, 80.0F, 64.0F, new CubeDeformation(0.0F)).texOffs(124, 358).addBox(-34.0F, -80.0F, 11.0F, 68.0F, 6.0F, 68.0F, new CubeDeformation(0.0F)).texOffs(324, 244)
						.addBox(-50.0F, -86.0F, -5.0F, 100.0F, 6.0F, 100.0F, new CubeDeformation(0.0F)).texOffs(336, 124).addBox(-42.0F, -80.0F, 3.0F, 84.0F, 2.0F, 84.0F, new CubeDeformation(0.0F)).texOffs(0, 244)
						.addBox(-54.0F, -90.0F, -9.0F, 108.0F, 6.0F, 108.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-60.0F, -90.0F, -15.0F, 120.0F, 4.0F, 120.0F, new CubeDeformation(0.0F)).texOffs(436, 350)
						.addBox(-1.5F, -126.5F, -9.0F, 3.0F, 9.0F, 108.0F, new CubeDeformation(0.0F)).texOffs(0, 124).addBox(-40.0F, -80.0F, 8.0F, 8.0F, 80.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(64, 0)
						.addBox(32.0F, -80.0F, 8.0F, 8.0F, 80.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(32.0F, -80.0F, 74.0F, 8.0F, 80.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 0)
						.addBox(-40.0F, -80.0F, 74.0F, 8.0F, 80.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 4.0F, 0.0F));
		PartDefinition cube_r1 = body_ms.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 244).addBox(-42.0F, -3.0F, 33.0F, 4.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -87.0F, 102.0F, 0.2443F, -0.7723F, -0.1702F));
		PartDefinition cube_r2 = body_ms.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(76, 214).addBox(38.0F, -3.0F, 33.0F, 4.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -87.0F, 102.0F, 0.2443F, 0.7723F, 0.1702F));
		PartDefinition cube_r3 = body_ms.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(40, 212).addBox(-2.0F, -3.0F, -7.0F, 4.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(57.25F, -87.0F, -10.75F, -0.1745F, -0.7854F, 0.0F));
		PartDefinition cube_r4 = body_ms.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(18, 206).addBox(-2.0F, -3.0F, -7.0F, 4.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-56.5F, -87.0F, -11.25F, -0.1745F, 0.7854F, 0.0F));
		PartDefinition cube_r5 = body_ms.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(72, 244).addBox(-2.0F, -3.0F, -7.0F, 4.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-41.0F, -77.0F, 85.0F, 0.0F, 2.5307F, 0.0F));
		PartDefinition cube_r6 = body_ms.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(36, 244).addBox(-2.0F, -3.0F, -7.0F, 4.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(41.0F, -77.0F, 85.0F, 0.0F, -2.5307F, 0.0F));
		PartDefinition cube_r7 = body_ms.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 264).addBox(-2.0F, -36.0F, -14.0F, 4.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(36.0F, -44.0F, 12.0F, 0.0F, -0.7854F, 0.0F));
		PartDefinition cube_r8 = body_ms.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(36, 264).addBox(-2.0F, -36.0F, -14.0F, 4.0F, 6.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-36.0F, -44.0F, 12.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r9 = body_ms.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(314, 352).addBox(5.0F, -36.5F, -60.0F, 2.0F, 66.0F, 118.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -93.75F, 75.0F, 1.5708F, -0.4363F, -1.5708F));
		PartDefinition cube_r10 = body_ms.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(2, 360).addBox(5.0F, -36.5F, -59.0F, 2.0F, 66.0F, 118.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -93.75F, 15.0F, -1.5708F, 0.4363F, -1.5708F));
		PartDefinition cube_r11 = body_ms.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 544).addBox(3.5F, -19.25F, -54.0F, 3.0F, 26.0F, 108.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(47.75F, -86.5F, 45.0F, 0.0F, 0.0F, -1.2217F));
		PartDefinition cube_r12 = body_ms.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(136, 436).addBox(-15.0F, -47.25F, -54.0F, 3.0F, 39.0F, 108.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(47.0F, -103.5F, 45.0F, 0.0F, 0.0F, -0.9599F));
		PartDefinition cube_r13 = body_ms.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(250, 536).addBox(12.0F, -47.25F, -54.0F, 3.0F, 39.0F, 108.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-47.0F, -103.5F, 45.0F, 0.0F, 0.0F, 0.9599F));
		PartDefinition cube_r14 = body_ms.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(564, 102).addBox(-6.5F, -19.25F, -54.0F, 3.0F, 26.0F, 108.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-47.75F, -86.5F, 45.0F, 0.0F, 0.0F, 1.2217F));
		PartDefinition cube_r15 = body_ms.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(360, 84).addBox(-53.0F, -3.0F, 55.5F, 104.0F, 29.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(360, 84).addBox(-53.0F, -3.0F, -56.5F, 104.0F, 29.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(250, 342)
						.addBox(-51.0F, -6.0F, -44.0F, 0.0F, 32.0F, 90.0F, new CubeDeformation(0.0F)).texOffs(250, 342).addBox(42.0F, -6.0F, -44.0F, 0.0F, 32.0F, 90.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -112.0F, 45.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition skull = ms.addOrReplaceChild("skull", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition hanging = skull.addOrReplaceChild("hanging",
				CubeListBuilder.create().texOffs(96, 71).addBox(-45.0F, -71.0F, 3.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 88).addBox(44.0F, -71.0F, 3.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(64, 88)
						.addBox(44.0F, -71.0F, 88.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 88).addBox(-45.0F, -71.0F, 88.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r16 = hanging.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(32, 284).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(44.0F, -59.0F, 88.0F, -2.1468F, 0.9556F, -1.9417F));
		PartDefinition cube_r17 = hanging.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 284).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-44.0F, -59.0F, 88.0F, -0.096F, 0.4363F, -0.3011F));
		PartDefinition cube_r18 = hanging.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(56, 296).addBox(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(44.0F, -59.0F, 4.0F, 2.7925F, 0.0F, -2.7053F));
		PartDefinition cube_r19 = hanging.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 300).addBox(-6.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-44.0F, -59.0F, 4.0F, 2.618F, -1.4835F, -2.7925F));
		PartDefinition ground = skull.addOrReplaceChild("ground", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition small = ground.addOrReplaceChild("small", CubeListBuilder.create().texOffs(64, 190).addBox(-4.0F, 0.5208F, -13.1721F, 8.0F, 8.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-46.0F, -3.5208F, -9.8279F, 0.1309F, 0.4363F, 0.0F));
		PartDefinition cube_r20 = small.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(72, 264).addBox(-9.0F, -8.0F, 7.0F, 16.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -7.4792F, -1.1721F, -0.4363F, 0.0F, 0.0F));
		PartDefinition small2 = ground.addOrReplaceChild("small2", CubeListBuilder.create().texOffs(64, 190).addBox(-4.0F, 0.5208F, -13.1721F, 8.0F, 8.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-36.0F, -1.5208F, -14.8279F, 0.1021F, -0.2231F, 0.0074F));
		PartDefinition cube_r21 = small2.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(72, 264).addBox(-9.0F, -8.0F, 7.0F, 16.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -7.4792F, -1.1721F, -0.4363F, 0.0F, 0.0F));
		PartDefinition small3 = ground.addOrReplaceChild("small3", CubeListBuilder.create().texOffs(64, 190).addBox(-4.0F, 0.5208F, -13.1721F, 8.0F, 8.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(36.0F, -1.5208F, -14.8279F, 0.1021F, -0.2231F, 0.0074F));
		PartDefinition cube_r22 = small3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(72, 264).addBox(-9.0F, -8.0F, 7.0F, 16.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -7.4792F, -1.1721F, -0.4363F, 0.0F, 0.0F));
		PartDefinition small4 = ground.addOrReplaceChild("small4", CubeListBuilder.create().texOffs(64, 190).addBox(-4.0F, 0.5208F, -13.1721F, 8.0F, 8.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(58.0F, -1.5208F, 1.1721F, 0.1855F, -1.0018F, -0.1267F));
		PartDefinition cube_r23 = small4.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(72, 264).addBox(-9.0F, -8.0F, 7.0F, 16.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -7.4792F, -1.1721F, -0.4363F, 0.0F, 0.0F));
		PartDefinition small5 = ground.addOrReplaceChild("small5", CubeListBuilder.create().texOffs(64, 190).addBox(-4.0F, 0.5208F, -13.1721F, 8.0F, 8.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(57.0F, -1.5208F, 15.1721F, -2.7581F, -1.3769F, 2.7635F));
		PartDefinition cube_r24 = small5.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(72, 264).addBox(-9.0F, -8.0F, 7.0F, 16.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -7.4792F, -1.1721F, -0.4363F, 0.0F, 0.0F));
		PartDefinition small6 = ground.addOrReplaceChild("small6", CubeListBuilder.create().texOffs(64, 190).addBox(-4.0F, 0.5208F, -13.1721F, 8.0F, 8.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(54.0F, -1.5208F, 85.1721F, -2.7581F, -1.3769F, 2.7635F));
		PartDefinition cube_r25 = small6.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(72, 264).addBox(-9.0F, -8.0F, 7.0F, 16.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -7.4792F, -1.1721F, -0.4363F, 0.0F, 0.0F));
		PartDefinition small14 = ground.addOrReplaceChild("small14", CubeListBuilder.create().texOffs(64, 190).addBox(-4.0F, 0.5208F, -13.1721F, 8.0F, 8.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(54.0F, -1.5208F, 75.1721F, 0.3103F, -1.2563F, -0.3487F));
		PartDefinition cube_r26 = small14.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(72, 264).addBox(-9.0F, -8.0F, 7.0F, 16.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -7.4792F, -1.1721F, -0.4363F, 0.0F, 0.0F));
		PartDefinition small7 = ground.addOrReplaceChild("small7", CubeListBuilder.create().texOffs(64, 190).addBox(-4.0F, 0.5208F, -13.1721F, 8.0F, 8.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(31.0F, -1.5208F, 102.1721F, -3.0511F, -0.6469F, 3.0858F));
		PartDefinition cube_r27 = small7.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(72, 264).addBox(-9.0F, -8.0F, 7.0F, 16.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -7.4792F, -1.1721F, -0.4363F, 0.0F, 0.0F));
		PartDefinition small8 = ground.addOrReplaceChild("small8", CubeListBuilder.create().texOffs(64, 190).addBox(-4.0F, 0.5208F, -13.1721F, 8.0F, 8.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.0F, -1.5208F, 96.1721F, -3.0683F, 0.1797F, -3.1296F));
		PartDefinition cube_r28 = small8.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(72, 264).addBox(-9.0F, -8.0F, 7.0F, 16.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -7.4792F, -1.1721F, -0.4363F, 0.0F, 0.0F));
		PartDefinition small9 = ground.addOrReplaceChild("small9", CubeListBuilder.create().texOffs(64, 190).addBox(-4.0F, 0.5208F, -13.1721F, 8.0F, 8.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-16.0F, -1.5208F, 96.1721F, -3.067F, -0.2555F, 3.1215F));
		PartDefinition cube_r29 = small9.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(72, 264).addBox(-9.0F, -8.0F, 7.0F, 16.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -7.4792F, -1.1721F, -0.4363F, 0.0F, 0.0F));
		PartDefinition small10 = ground.addOrReplaceChild("small10", CubeListBuilder.create().texOffs(64, 190).addBox(-4.0F, 0.5208F, -13.1721F, 8.0F, 8.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-48.0F, -1.5208F, 105.1721F, -2.9745F, 0.4407F, -3.1087F));
		PartDefinition cube_r30 = small10.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(72, 264).addBox(-9.0F, -8.0F, 7.0F, 16.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -7.4792F, -1.1721F, -0.4363F, 0.0F, 0.0F));
		PartDefinition small11 = ground.addOrReplaceChild("small11", CubeListBuilder.create().texOffs(64, 190).addBox(-4.0F, 0.5208F, -13.1721F, 8.0F, 8.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-60.0F, -1.5208F, 78.1721F, -2.9178F, 0.8263F, -3.0146F));
		PartDefinition cube_r31 = small11.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(72, 264).addBox(-9.0F, -8.0F, 7.0F, 16.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -7.4792F, -1.1721F, -0.4363F, 0.0F, 0.0F));
		PartDefinition small12 = ground.addOrReplaceChild("small12", CubeListBuilder.create().texOffs(64, 190).addBox(-4.0F, 0.5208F, -13.1721F, 8.0F, 8.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-58.0F, -1.5208F, 62.1721F, 0.2231F, 1.365F, 0.0849F));
		PartDefinition cube_r32 = small12.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(72, 264).addBox(-9.0F, -8.0F, 7.0F, 16.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -7.4792F, -1.1721F, -0.4363F, 0.0F, 0.0F));
		PartDefinition small13 = ground.addOrReplaceChild("small13", CubeListBuilder.create().texOffs(64, 190).addBox(-4.0F, 0.5208F, -13.1721F, 8.0F, 8.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-52.0F, -3.5208F, 28.1721F, 2.9788F, 1.2881F, 2.8515F));
		PartDefinition cube_r33 = small13.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(72, 264).addBox(-9.0F, -8.0F, 7.0F, 16.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -7.4792F, -1.1721F, -0.4363F, 0.0F, 0.0F));
		PartDefinition big = ground.addOrReplaceChild("big", CubeListBuilder.create(), PartPose.offset(-80.0F, -12.0F, -11.0F));
		PartDefinition cube_r34 = big.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(32, 182).addBox(-12.0F, -19.75F, 3.75F, 24.0F, 24.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.0F, 7.75F, -3.5F, -0.4363F, 0.7854F, 0.0F));
		PartDefinition cube_r35 = big.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(32, 124).addBox(-6.0F, -0.75F, -17.5F, 12.0F, 12.0F, 22.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.0F, 7.75F, -3.5F, 0.0F, 0.7854F, 0.0F));
		PartDefinition big7 = ground.addOrReplaceChild("big7", CubeListBuilder.create(), PartPose.offsetAndRotation(-37.0F, -12.0F, -16.0F, 0.0F, -0.48F, 0.0F));
		PartDefinition cube_r36 = big7.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(32, 182).addBox(-12.0F, -19.75F, 3.75F, 24.0F, 24.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.0F, 7.75F, -3.5F, -0.4363F, 0.7854F, 0.0F));
		PartDefinition cube_r37 = big7.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(32, 124).addBox(-6.0F, -0.75F, -17.5F, 12.0F, 12.0F, 22.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(18.0F, 7.75F, -3.5F, 0.0F, 0.7854F, 0.0F));
		PartDefinition big2 = ground.addOrReplaceChild("big2", CubeListBuilder.create(), PartPose.offsetAndRotation(-57.0F, -4.3335F, 12.5173F, 0.0F, 0.2618F, 0.0F));
		PartDefinition cube_r38 = big2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(32, 182).addBox(-12.0F, -19.75F, 3.75F, 24.0F, 24.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0835F, -0.0173F, -0.4363F, 0.7854F, 0.0F));
		PartDefinition cube_r39 = big2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(32, 124).addBox(-6.0F, -0.75F, -17.5F, 12.0F, 12.0F, 22.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0835F, -0.0173F, 0.0F, 0.7854F, 0.0F));
		PartDefinition big3 = ground.addOrReplaceChild("big3", CubeListBuilder.create(), PartPose.offsetAndRotation(-52.0F, -4.3335F, 90.5173F, 0.0F, 1.5272F, 0.0F));
		PartDefinition cube_r40 = big3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(32, 182).addBox(-12.0F, -19.75F, 3.75F, 24.0F, 24.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0835F, -0.0173F, -0.4363F, 0.7854F, 0.0F));
		PartDefinition cube_r41 = big3.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(32, 124).addBox(-6.0F, -0.75F, -17.5F, 12.0F, 12.0F, 22.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0835F, -0.0173F, 0.0F, 0.7854F, 0.0F));
		PartDefinition big4 = ground.addOrReplaceChild("big4", CubeListBuilder.create(), PartPose.offsetAndRotation(-31.0F, -4.3335F, 96.5173F, -2.9494F, 1.1758F, -3.028F));
		PartDefinition cube_r42 = big4.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(32, 182).addBox(-12.0F, -19.75F, 3.75F, 24.0F, 24.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0835F, -0.0173F, -0.4363F, 0.7854F, 0.0F));
		PartDefinition cube_r43 = big4.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(32, 124).addBox(-6.0F, -0.75F, -17.5F, 12.0F, 12.0F, 22.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0835F, -0.0173F, 0.0F, 0.7854F, 0.0F));
		PartDefinition big5 = ground.addOrReplaceChild("big5", CubeListBuilder.create(), PartPose.offsetAndRotation(45.0F, -4.3335F, 96.5173F, -3.0677F, 0.0913F, 3.0842F));
		PartDefinition cube_r44 = big5.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(32, 182).addBox(-12.0F, -19.75F, 3.75F, 24.0F, 24.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0835F, -0.0173F, -0.4363F, 0.7854F, 0.0F));
		PartDefinition cube_r45 = big5.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(32, 124).addBox(-6.0F, -0.75F, -17.5F, 12.0F, 12.0F, 22.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0835F, -0.0173F, 0.0F, 0.7854F, 0.0F));
		PartDefinition big8 = ground.addOrReplaceChild("big8", CubeListBuilder.create(), PartPose.offsetAndRotation(55.0F, -4.3335F, 59.5173F, -3.096F, -0.9545F, -3.0908F));
		PartDefinition cube_r46 = big8.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(32, 182).addBox(-12.0F, -19.75F, 3.75F, 24.0F, 24.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0835F, -0.0173F, -0.4363F, 0.7854F, 0.0F));
		PartDefinition cube_r47 = big8.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(32, 124).addBox(-6.0F, -0.75F, -17.5F, 12.0F, 12.0F, 22.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0835F, -0.0173F, 0.0F, 0.7854F, 0.0F));
		PartDefinition big6 = ground.addOrReplaceChild("big6", CubeListBuilder.create(), PartPose.offsetAndRotation(46.0F, -4.3335F, -5.5173F, 3.0677F, -0.0913F, 3.0842F));
		PartDefinition cube_r48 = big6.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(32, 182).addBox(-12.0F, -19.75F, -3.75F, 24.0F, 24.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0835F, 0.0173F, 0.4363F, -0.7854F, 0.0F));
		PartDefinition cube_r49 = big6.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(32, 124).addBox(-6.0F, -0.75F, -4.5F, 12.0F, 12.0F, 22.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0835F, 0.0173F, 0.0F, -0.7854F, 0.0F));
		PartDefinition decoration = ms.addOrReplaceChild("decoration",
				CubeListBuilder.create().texOffs(72, 280).addBox(-8.0F, -133.0F, -1.0F, 16.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(72, 280).addBox(-8.0F, -133.0F, 91.0F, 16.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition horns = decoration.addOrReplaceChild("horns", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bighorn = horns.addOrReplaceChild("bighorn", CubeListBuilder.create().texOffs(78, 124).addBox(44.5F, -117.75F, 74.0F, 8.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r50 = bighorn.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(96, 61).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(48.5F, -120.75F, 78.0F, 0.0F, 0.0F, -0.4363F));
		PartDefinition cube_r51 = bighorn.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(32, 158).addBox(-6.0F, -7.0F, -6.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(47.0F, -101.0F, 78.0F, 0.0F, 0.0F, 0.4363F));
		PartDefinition cube_r52 = bighorn.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(0, 88).addBox(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(41.5F, -93.25F, 78.0F, 0.0F, 0.0F, 0.8727F));
		PartDefinition bighorn3 = horns.addOrReplaceChild("bighorn3", CubeListBuilder.create().texOffs(78, 124).addBox(44.5F, -117.75F, 6.0F, 8.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r53 = bighorn3.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(96, 61).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(48.5F, -120.75F, 10.0F, 0.0F, 0.0F, -0.4363F));
		PartDefinition cube_r54 = bighorn3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(32, 158).addBox(-6.0F, -7.0F, -6.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(47.0F, -101.0F, 10.0F, 0.0F, 0.0F, 0.4363F));
		PartDefinition cube_r55 = bighorn3.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(0, 88).addBox(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(41.5F, -93.25F, 10.0F, 0.0F, 0.0F, 0.8727F));
		PartDefinition bighorn2 = horns.addOrReplaceChild("bighorn2", CubeListBuilder.create().texOffs(78, 124).mirror().addBox(-52.5F, -117.75F, 74.0F, 8.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r56 = bighorn2.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(96, 61).mirror().addBox(-1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-48.5F, -120.75F, 78.0F, 0.0F, 0.0F, 0.4363F));
		PartDefinition cube_r57 = bighorn2.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(32, 158).mirror().addBox(-6.0F, -7.0F, -6.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-47.0F, -101.0F, 78.0F, 0.0F, 0.0F, -0.4363F));
		PartDefinition cube_r58 = bighorn2.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(0, 88).mirror().addBox(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-41.5F, -93.25F, 78.0F, 0.0F, 0.0F, -0.8727F));
		PartDefinition bighorn4 = horns.addOrReplaceChild("bighorn4", CubeListBuilder.create().texOffs(78, 124).mirror().addBox(-52.5F, -117.75F, 6.0F, 8.0F, 12.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r59 = bighorn4.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(96, 61).mirror().addBox(-1.0F, -2.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-48.5F, -120.75F, 10.0F, 0.0F, 0.0F, 0.4363F));
		PartDefinition cube_r60 = bighorn4.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(32, 158).mirror().addBox(-6.0F, -7.0F, -6.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-47.0F, -101.0F, 10.0F, 0.0F, 0.0F, -0.4363F));
		PartDefinition cube_r61 = bighorn4.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(0, 88).mirror().addBox(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-41.5F, -93.25F, 10.0F, 0.0F, 0.0F, -0.8727F));
		PartDefinition smallhorn = horns.addOrReplaceChild("smallhorn", CubeListBuilder.create().texOffs(96, 16).addBox(0.6925F, -4.4479F, -4.0F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(29.8075F, -112.3021F, 70.0F));
		PartDefinition cube_r62 = smallhorn.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(24, 0).addBox(-2.5F, -1.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1925F, -6.4479F, -1.5F, 0.0F, 0.0F, -0.4363F));
		PartDefinition cube_r63 = smallhorn.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(80, 168).addBox(-2.0F, 0.0F, -6.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1925F, 1.3021F, 0.0F, 0.0F, 0.0F, 0.4363F));
		PartDefinition cube_r64 = smallhorn.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(64, 88).addBox(-4.0F, -4.0F, -8.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.3075F, 9.0521F, 0.0F, 0.0F, 0.0F, 0.8727F));
		PartDefinition smallhorn3 = horns.addOrReplaceChild("smallhorn3", CubeListBuilder.create().texOffs(96, 16).addBox(0.6925F, -4.4479F, -53.0F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(29.8075F, -112.3021F, 70.0F));
		PartDefinition cube_r65 = smallhorn3.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(24, 0).addBox(-2.5F, -1.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.1925F, -6.4479F, -50.5F, 0.0F, 0.0F, -0.4363F));
		PartDefinition cube_r66 = smallhorn3.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(80, 168).addBox(-2.0F, 0.0F, -2.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.1925F, 1.3021F, -52.0F, 0.0F, 0.0F, 0.4363F));
		PartDefinition cube_r67 = smallhorn3.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(64, 88).addBox(-4.0F, -4.0F, -4.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.3075F, 9.0521F, -52.0F, 0.0F, 0.0F, 0.8727F));
		PartDefinition smallhorn2 = horns.addOrReplaceChild("smallhorn2", CubeListBuilder.create().texOffs(96, 16).mirror().addBox(-65.3075F, -4.4479F, -4.0F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(29.8075F, -112.3021F, 70.0F));
		PartDefinition cube_r68 = smallhorn2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(24, 0).mirror().addBox(-0.5F, -1.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-62.8075F, -6.4479F, -1.5F, 0.0F, 0.0F, 0.4363F));
		PartDefinition cube_r69 = smallhorn2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(80, 168).mirror().addBox(-6.0F, 0.0F, -6.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-60.8075F, 1.3021F, 0.0F, 0.0F, 0.0F, -0.4363F));
		PartDefinition cube_r70 = smallhorn2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(64, 88).mirror().addBox(-8.0F, -4.0F, -8.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-55.3075F, 9.0521F, 0.0F, 0.0F, 0.0F, -0.8727F));
		PartDefinition smallhorn4 = horns.addOrReplaceChild("smallhorn4", CubeListBuilder.create().texOffs(96, 16).mirror().addBox(-65.3075F, -4.4479F, -53.0F, 5.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(29.8075F, -112.3021F, 70.0F));
		PartDefinition cube_r71 = smallhorn4.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(24, 0).mirror().addBox(-0.5F, -1.0F, -1.5F, 3.0F, 4.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-62.8075F, -6.4479F, -50.5F, 0.0F, 0.0F, 0.4363F));
		PartDefinition cube_r72 = smallhorn4.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(80, 168).mirror().addBox(-6.0F, 0.0F, -2.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-60.8075F, 1.3021F, -52.0F, 0.0F, 0.0F, -0.4363F));
		PartDefinition cube_r73 = smallhorn4.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(64, 88).mirror().addBox(-8.0F, -4.0F, -4.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-55.3075F, 9.0521F, -52.0F, 0.0F, 0.0F, -0.8727F));
		PartDefinition bone = decoration.addOrReplaceChild("bone",
				CubeListBuilder.create().texOffs(837, 32).addBox(7.5F, -2.0F, -2.0F, 2.0F, 24.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(894, 134).addBox(-8.5F, -15.0F, -1.0F, 17.0F, 21.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-63.5F, -21.0F, 0.0F));
		PartDefinition cube_r74 = bone.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(837, 32).addBox(2.0F, -15.0F, 1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.5F, 10.0F, -1.0F, 0.6109F, 0.0F, -0.8727F));
		PartDefinition cube_r75 = bone.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(854, 133).addBox(1.5F, -10.5F, 9.0F, 17.0F, 21.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(17.0F, -4.5F, -1.0F, 0.0F, -1.7453F, 0.0F));
		PartDefinition cube_r76 = bone.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(854, 133).addBox(-7.5F, -10.5F, -4.0F, 17.0F, 21.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(17.0F, -4.5F, -1.0F, 0.0F, 0.6109F, 0.0F));
		PartDefinition cube_r77 = bone.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(865, 99).addBox(-23.5F, -14.5F, -5.0F, 25.0F, 25.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.5F, -1.0F, 0.0F, -0.8727F, 0.0F));
		PartDefinition bone4 = decoration.addOrReplaceChild("bone4",
				CubeListBuilder.create().texOffs(837, 32).addBox(7.5F, -2.0F, -2.0F, 2.0F, 24.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(894, 134).addBox(-8.5F, -15.0F, -1.0F, 17.0F, 21.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(32.5F, -21.0F, 0.0F));
		PartDefinition cube_r78 = bone4.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(837, 32).addBox(2.0F, -15.0F, 1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.5F, 10.0F, -1.0F, 0.6109F, 0.0F, -0.8727F));
		PartDefinition cube_r79 = bone4.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(854, 133).addBox(1.5F, -10.5F, 9.0F, 17.0F, 21.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(17.0F, -4.5F, -1.0F, 0.0F, -1.7453F, 0.0F));
		PartDefinition cube_r80 = bone4.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(854, 133).addBox(-7.5F, -10.5F, -4.0F, 17.0F, 21.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(17.0F, -4.5F, -1.0F, 0.0F, 0.6109F, 0.0F));
		PartDefinition cube_r81 = bone4.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(865, 99).addBox(-23.5F, -14.5F, -5.0F, 25.0F, 25.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.5F, -1.0F, 0.0F, -0.8727F, 0.0F));
		PartDefinition bone5 = decoration.addOrReplaceChild("bone5",
				CubeListBuilder.create().texOffs(837, 32).addBox(7.5F, -2.0F, -2.0F, 2.0F, 24.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(894, 134).addBox(-8.5F, -15.0F, -1.0F, 17.0F, 21.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(52.5F, -13.0F, 8.0F, -2.7053F, -1.2217F, 3.1416F));
		PartDefinition cube_r82 = bone5.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(837, 32).addBox(2.0F, -15.0F, 1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.5F, 10.0F, -1.0F, 0.6109F, 0.0F, -0.8727F));
		PartDefinition cube_r83 = bone5.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(854, 133).addBox(1.5F, -10.5F, 9.0F, 17.0F, 21.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(17.0F, -4.5F, -1.0F, 0.0F, -1.7453F, 0.0F));
		PartDefinition cube_r84 = bone5.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(854, 133).addBox(-7.5F, -10.5F, -4.0F, 17.0F, 21.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(17.0F, -4.5F, -1.0F, 0.0F, 0.6109F, 0.0F));
		PartDefinition cube_r85 = bone5.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(865, 99).addBox(-23.5F, -14.5F, -5.0F, 25.0F, 25.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.5F, -1.0F, 0.0F, -0.8727F, 0.0F));
		PartDefinition bone2 = decoration.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(837, 32).addBox(2.3189F, -0.7043F, 0.7882F, 2.0F, 24.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(894, 134).addBox(-13.6811F, -13.7043F, 1.7882F, 17.0F, 21.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-48.3189F, -14.2957F, 84.2118F, 0.2618F, 0.0F, -0.4363F));
		PartDefinition cube_r86 = bone2.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(837, 32).addBox(2.0F, -15.0F, 1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.3189F, 11.2957F, 1.7882F, 0.6109F, 0.0F, -0.8727F));
		PartDefinition cube_r87 = bone2.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(854, 133).addBox(1.5F, -10.5F, 9.0F, 17.0F, 21.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.8189F, -3.2043F, 1.7882F, 0.0F, -1.7453F, 0.0F));
		PartDefinition cube_r88 = bone2.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(854, 133).addBox(-7.5F, -10.5F, -4.0F, 17.0F, 21.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.8189F, -3.2043F, 1.7882F, 0.0F, 0.6109F, 0.0F));
		PartDefinition cube_r89 = bone2.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(865, 99).addBox(-23.5F, -14.5F, -5.0F, 25.0F, 25.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.1811F, -3.2043F, 1.7882F, 0.0F, -0.8727F, 0.0F));
		PartDefinition bone3 = decoration.addOrReplaceChild("bone3", CubeListBuilder.create().texOffs(837, 32).mirror().addBox(-4.3189F, -0.7043F, 0.7882F, 2.0F, 24.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(894, 134).mirror()
				.addBox(-3.3189F, -13.7043F, 1.7882F, 17.0F, 21.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(48.3189F, -14.2957F, 84.2118F, 0.2618F, 0.0F, 0.4363F));
		PartDefinition cube_r90 = bone3.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(837, 32).mirror().addBox(-4.0F, -15.0F, 1.0F, 2.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-3.3189F, 11.2957F, 1.7882F, 0.6109F, 0.0F, 0.8727F));
		PartDefinition cube_r91 = bone3.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(854, 133).mirror().addBox(-18.5F, -10.5F, 9.0F, 17.0F, 21.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-11.8189F, -3.2043F, 1.7882F, 0.0F, 1.7453F, 0.0F));
		PartDefinition cube_r92 = bone3.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(854, 133).mirror().addBox(-9.5F, -10.5F, -4.0F, 17.0F, 21.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-11.8189F, -3.2043F, 1.7882F, 0.0F, -0.6109F, 0.0F));
		PartDefinition cube_r93 = bone3.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(865, 99).mirror().addBox(-1.5F, -14.5F, -5.0F, 25.0F, 25.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.1811F, -3.2043F, 1.7882F, 0.0F, 0.8727F, 0.0F));
		PartDefinition lamps = decoration.addOrReplaceChild("lamps", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition lamp = lamps.addOrReplaceChild("lamp",
				CubeListBuilder.create().texOffs(893, 191).addBox(43.0F, -14.0F, -26.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(868, 193).addBox(44.0F, -21.0F, -25.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(904, 240)
						.addBox(43.0F, -20.0F, -26.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(899, 196).addBox(47.0F, -26.0F, -28.0F, 0.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(911, 208)
						.addBox(41.0F, -26.0F, -22.0F, 12.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(866, 235).addBox(44.0F, -19.0F, -25.0F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(868, 202)
						.addBox(44.0F, -12.0F, -25.0F, 6.0F, 18.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition lamp2 = lamps.addOrReplaceChild("lamp2",
				CubeListBuilder.create().texOffs(893, 191).addBox(43.0F, -14.0F, -26.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(868, 193).addBox(44.0F, -21.0F, -25.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(904, 240)
						.addBox(43.0F, -20.0F, -26.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(899, 196).addBox(47.0F, -26.0F, -28.0F, 0.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(911, 208)
						.addBox(41.0F, -26.0F, -22.0F, 12.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(866, 235).addBox(44.0F, -19.0F, -25.0F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(868, 202)
						.addBox(44.0F, -12.0F, -25.0F, 6.0F, 18.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-19.0F, 5.0F, 115.0F));
		PartDefinition lamp3 = lamps.addOrReplaceChild("lamp3",
				CubeListBuilder.create().texOffs(893, 191).addBox(43.0F, -14.0F, -26.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(868, 193).addBox(44.0F, -21.0F, -25.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(904, 240)
						.addBox(43.0F, -20.0F, -26.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(899, 196).addBox(47.0F, -26.0F, -28.0F, 0.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(911, 208)
						.addBox(41.0F, -26.0F, -22.0F, 12.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(866, 235).addBox(44.0F, -19.0F, -25.0F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(868, 202)
						.addBox(44.0F, -12.0F, -25.0F, 6.0F, 18.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-96.0F, 0.0F, 95.0F));
		PartDefinition lamp4 = lamps.addOrReplaceChild("lamp4",
				CubeListBuilder.create().texOffs(893, 191).addBox(43.0F, -14.0F, -26.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(868, 193).addBox(44.0F, -21.0F, -25.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(904, 240)
						.addBox(43.0F, -20.0F, -26.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(899, 196).addBox(47.0F, -26.0F, -28.0F, 0.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(911, 208)
						.addBox(41.0F, -26.0F, -22.0F, 12.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(866, 235).addBox(44.0F, -19.0F, -25.0F, 6.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(868, 202)
						.addBox(44.0F, -12.0F, -25.0F, 6.0F, 18.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-82.0F, -1.0F, 20.0F));
		PartDefinition teeth = ms.addOrReplaceChild("teeth", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r94 = teeth.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(68, 158).addBox(-8.0F, -3.0F, -2.0F, 16.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -103.0F, 1.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r95 = teeth.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(0, 226).addBox(-8.0F, -3.0F, -2.0F, 16.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -98.0F, 1.0F, 0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r96 = teeth.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(616, 648).addBox(-29.0F, 6.25F, 32.75F, 58.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -30.5F, 45.0F, 0.0F, 1.5708F, 0.2618F));
		PartDefinition cube_r97 = teeth.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(624, 302).addBox(-29.0F, -24.25F, 32.75F, 58.0F, 18.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -27.5F, 45.0F, 0.0F, 1.5708F, -0.2618F));
		PartDefinition cube_r98 = teeth.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(624, 268).addBox(-29.0F, -24.25F, -48.75F, 58.0F, 18.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -27.5F, 45.0F, 0.0F, 1.5708F, 0.2618F));
		PartDefinition cube_r99 = teeth.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(632, 616).addBox(-29.0F, 6.25F, -48.75F, 58.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -30.5F, 45.0F, 0.0F, 1.5708F, -0.2618F));
		PartDefinition cube_r100 = teeth.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(620, 68).addBox(-32.0F, 15.5F, -2.0F, 64.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -30.5F, 81.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r101 = teeth.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(550, 406).addBox(-32.0F, -33.5F, -2.0F, 64.0F, 18.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -27.5F, 81.0F, 0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r102 = teeth.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(624, 236).addBox(-32.0F, 15.5F, -14.0F, 64.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -30.5F, 9.0F, 0.2618F, 0.0F, 0.0F));
		PartDefinition cube_r103 = teeth.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(472, 616).addBox(-32.0F, -33.5F, -14.0F, 64.0F, 18.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -27.5F, 9.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition base = ms.addOrReplaceChild("base",
				CubeListBuilder.create().texOffs(0, 124).addBox(-56.0F, 4.0F, -11.0F, 112.0F, 8.0F, 112.0F, new CubeDeformation(0.0F)).texOffs(550, 350).addBox(-74.0F, 6.0F, -27.0F, 90.0F, 6.0F, 50.0F, new CubeDeformation(0.0F)).texOffs(114, 583)
						.addBox(30.0F, 6.0F, -27.0F, 40.0F, 6.0F, 50.0F, new CubeDeformation(0.0F)).texOffs(558, 0).addBox(-68.0F, 6.0F, 57.0F, 60.0F, 6.0F, 56.0F, new CubeDeformation(0.0F)).texOffs(360, 0)
						.addBox(4.0F, 6.0F, 34.0F, 60.0F, 6.0F, 78.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 1024, 1024);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		ms.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
