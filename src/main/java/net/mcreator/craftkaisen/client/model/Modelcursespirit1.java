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
public class Modelcursespirit1<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_kaisen", "modelcursespirit_1"), "main");
	public final ModelPart bone2;

	public Modelcursespirit1(ModelPart root) {
		this.bone2 = root.getChild("bone2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone2 = partdefinition.addOrReplaceChild("bone2",
				CubeListBuilder.create().texOffs(0, 33).addBox(-12.0F, 10.0F, -1.0F, 24.0F, 14.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(0, 71).addBox(-12.0F, 8.0F, -1.0F, 24.0F, 2.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-13.0F, 17.0F, -2.0F, 26.0F, 7.0F, 26.0F, new CubeDeformation(0.0F)).texOffs(76, 51).addBox(-10.0F, 2.0F, 1.0F, 20.0F, 8.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(78, 0)
						.addBox(-10.0F, 0.0F, 1.0F, 20.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(72, 33).addBox(-8.0F, 0.0F, 3.0F, 16.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(82, 81)
						.addBox(-8.0F, -11.0F, 3.0F, 16.0F, 11.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -12.0F));
		PartDefinition cube_r1 = bone2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(22, 137).addBox(-12.3614F, -2.1182F, -0.5867F, 8.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.297F, 18.7926F, -1.75F, 0.1858F, -0.3587F, 0.0227F));
		PartDefinition cube_r2 = bone2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(22, 137).addBox(3.8048F, -4.4861F, -0.0941F, 8.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.297F, 18.7926F, -1.75F, 0.2024F, 0.2411F, 0.1349F));
		PartDefinition cube_r3 = bone2.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.0F, 3.0F, -1.0F, 6.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(72, 33).addBox(-2.0F, -6.0F, -1.0F, 4.0F, 9.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3491F, 0.0F, 0.0F));
		PartDefinition cube_r4 = bone2.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(112, 108).addBox(-7.0F, -6.75F, -0.575F, 14.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(84, 108).addBox(-6.0F, -5.75F, -0.5F, 12.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.25F, 1.5F, -0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r5 = bone2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(3, 140).mirror().addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.5F, -5.5F, 2.0F, 0.0154F, -0.1739F, -0.0886F));
		PartDefinition cube_r6 = bone2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(3, 140).addBox(-1.5F, -1.5F, -2.0F, 3.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.5F, -5.5F, 2.0F, 0.0154F, 0.1739F, 0.0886F));
		PartDefinition cube_r7 = bone2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(16, 9).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -1.0F, 0.0F, 0.1719F, 0.0302F, -0.1719F));
		PartDefinition cube_r8 = bone2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(16, 17).addBox(-1.0F, -3.0F, -1.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -1.0F, 0.0F, 0.1719F, -0.0302F, 0.1719F));
		PartDefinition cube_r9 = bone2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 45).addBox(3.1813F, -6.3437F, -2.0F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(17.8774F, 5.3259F, 8.0F, 2.7485F, 0.0146F, -0.3614F));
		PartDefinition cube_r10 = bone2.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(0, 11).addBox(5.5315F, -4.747F, -3.0F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 113).addBox(-2.4685F, -4.747F, -3.0F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(17.8774F, 5.3259F, 8.0F, 2.7879F, 0.176F, 0.0463F));
		PartDefinition cube_r11 = bone2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 97).addBox(-15.1221F, -6.3261F, -4.0F, 15.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(17.8774F, 5.3259F, 8.0F, 2.8924F, 0.3076F, 0.4753F));
		PartDefinition cube_r12 = bone2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 71).addBox(-3.5F, -2.0F, -2.0F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-20.2211F, 17.5072F, 11.0F, 0.0F, 0.0F, -1.5708F));
		PartDefinition cube_r13 = bone2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 33).addBox(2.0F, -3.0F, -3.0F, 2.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-21.489F, 20.2261F, 11.0F, 0.0F, 0.0F, -1.1345F));
		PartDefinition cube_r14 = bone2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(22, 121).addBox(-3.0F, -1.0F, -3.0F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-20.3433F, 13.0367F, 11.0F, 0.0F, 0.0F, -1.1345F));
		PartDefinition cube_r15 = bone2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(38, 105).addBox(-4.0F, 5.0F, -3.0F, 15.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-20.0F, 1.0F, 10.0F, 0.0F, 0.0F, -0.6981F));
		PartDefinition cube_r16 = bone2.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(21, 21).addBox(-6.5213F, -1.0448F, -3.25F, 21.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.297F, 18.7926F, -1.75F, 0.1739F, -0.0151F, 0.0859F));
		PartDefinition cube_r17 = bone2.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(18, 18).addBox(-13.8661F, -1.4724F, -2.25F, 12.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.297F, 18.7926F, -1.75F, 0.1739F, 0.0151F, -0.0859F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
