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
public class Modelshinjukufitnew<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_kaisen", "modelshinjukufitnew"), "main");
	public final ModelPart bipedBody;
	public final ModelPart bipedLeftArm;
	public final ModelPart bipedRightArm;
	public final ModelPart bipedLeftLeg;
	public final ModelPart bipedRightLeg;

	public Modelshinjukufitnew(ModelPart root) {
		this.bipedBody = root.getChild("bipedBody");
		this.bipedLeftArm = root.getChild("bipedLeftArm");
		this.bipedRightArm = root.getChild("bipedRightArm");
		this.bipedLeftLeg = root.getChild("bipedLeftLeg");
		this.bipedRightLeg = root.getChild("bipedRightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bipedBody = partdefinition.addOrReplaceChild("bipedBody", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition armorBody = bipedBody.addOrReplaceChild("armorBody",
				CubeListBuilder.create().texOffs(26, 12).addBox(-4.75F, 11.0F, -2.75F, 9.5F, 1.0F, 5.5F, new CubeDeformation(0.0F)).texOffs(23, 21).addBox(-1.75F, 10.5F, -3.0F, 3.5F, 1.5F, 1.25F, new CubeDeformation(0.0F)).texOffs(39, 43)
						.addBox(-4.0F, 0.0F, 0.25F, 8.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(41, 30).addBox(-4.0F, 0.0F, -2.125F, 8.0F, 11.0F, 2.125F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(-1.0F, 4.0F, -2.375F, 2.0F, 2.0F, 1.125F, new CubeDeformation(0.0F)).texOffs(26, 45).addBox(-2.25F, 2.0F, -2.1875F, 4.5F, 3.0F, 0.875F, new CubeDeformation(0.0F)).texOffs(15, 45)
						.addBox(-5.0F, -0.25F, -2.5F, 3.0F, 6.5F, 4.8125F, new CubeDeformation(0.0F)).texOffs(0, 52).addBox(2.0F, -0.25F, -2.5F, 3.0F, 6.5F, 4.8125F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = armorBody.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 21).addBox(-5.0F, -3.5F, -2.0F, 10.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.5F, 1.25F, 0.1745F, 0.0F, 0.0F));
		PartDefinition cube_r2 = armorBody.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(10, 66).addBox(2.4023F, -2.0932F, -2.2188F, 3.0F, 5.5625F, 2.4375F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.1603F, -0.0313F, -0.258F, -0.045F, -0.1687F));
		PartDefinition cube_r3 = armorBody.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 64).addBox(-5.4023F, -2.0932F, -2.2188F, 3.0F, 5.5625F, 2.4375F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 9.1603F, -0.0313F, -0.258F, 0.045F, 0.1687F));
		PartDefinition cube_r4 = armorBody.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(55, 52).addBox(-2.0F, -3.8125F, -2.25F, 3.0F, 5.5625F, 4.4375F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.634F, 9.5891F, 0.0F, 0.0F, 0.0F, -0.1745F));
		PartDefinition cube_r5 = armorBody.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(42, 58).addBox(-1.0F, -3.8125F, -2.25F, 3.0F, 5.5625F, 4.4375F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.634F, 9.5891F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition cube_r6 = armorBody.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(5, 6).addBox(0.0704F, -0.3506F, -0.4375F, 1.0F, 1.5F, 0.875F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.1228F, -1.75F, -0.0715F, -0.05F, -0.6091F));
		PartDefinition cube_r7 = armorBody.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 12).addBox(-1.0704F, -0.3506F, -0.4375F, 1.0F, 1.5F, 0.875F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 5.1228F, -1.75F, -0.0715F, 0.05F, 0.6091F));
		PartDefinition cube_r8 = armorBody.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(64, 12).addBox(-2.25F, -2.75F, -0.25F, 4.5F, 5.5F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.5F, -2.75F, -0.0873F, 0.0F, 0.0F));
		PartDefinition bipedHead = bipedBody.addOrReplaceChild("bipedHead", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition armorHead = bipedHead.addOrReplaceChild("armorHead", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r9 = armorHead.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, 2.0F, -3.5F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(26, 21).addBox(-3.5F, 0.0F, -3.5F, 7.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.0152F, 0.1736F, 0.1719F, -0.0302F, 0.1719F));
		PartDefinition cube_r10 = armorHead.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(77, 1).addBox(-4.25F, -0.5F, -4.125F, 8.5F, 1.0F, 8.25F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.5059F, -0.1467F, 0.0436F, 0.0F, 0.0F));
		PartDefinition cube_r11 = armorHead.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 0).addBox(-4.5F, -1.0F, -4.5F, 9.0F, 2.5F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.0152F, 0.1736F, 0.1739F, -0.0151F, 0.0859F));
		PartDefinition bipedLeftArm = partdefinition.addOrReplaceChild("bipedLeftArm", CubeListBuilder.create(), PartPose.offset(-4.0F, 2.0F, 0.0F));
		PartDefinition armorLeftArm = bipedLeftArm.addOrReplaceChild("armorLeftArm", CubeListBuilder.create().texOffs(53, 14).addBox(-4.25F, -2.25F, -2.5F, 3.25F, 5.5F, 4.8125F, new CubeDeformation(0.0F)).texOffs(11, 59)
				.addBox(-4.5F, 2.75F, -2.75F, 3.5F, 1.75F, 5.3125F, new CubeDeformation(0.0F)).texOffs(63, 0).addBox(-4.25F, 4.25F, -2.5F, 3.25F, 1.0F, 4.8125F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r12 = armorLeftArm.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(24, 63).addBox(-2.3125F, -5.0F, -2.3438F, 1.375F, 5.4375F, 4.6875F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.625F, 3.0F, -0.0938F, 0.0F, 0.0F, 0.1309F));
		PartDefinition bipedRightArm = partdefinition.addOrReplaceChild("bipedRightArm", CubeListBuilder.create(), PartPose.offset(4.0F, 2.0F, 0.0F));
		PartDefinition armorRightArm = bipedRightArm.addOrReplaceChild("armorRightArm", CubeListBuilder.create().texOffs(54, 102).addBox(1.0F, 4.25F, -2.5F, 3.25F, 1.0F, 4.8125F, new CubeDeformation(0.0F)).texOffs(15, 77)
				.addBox(1.0F, -2.25F, -2.5F, 3.25F, 5.5F, 4.8125F, new CubeDeformation(0.0F)).texOffs(50, 98).addBox(1.0F, 2.75F, -2.75F, 3.5F, 1.75F, 5.3125F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r13 = armorRightArm.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(4, 78).addBox(0.9375F, -5.0F, -2.3438F, 1.375F, 5.4375F, 4.6875F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.625F, 3.0F, -0.0938F, 0.0F, 0.0F, -0.1309F));
		PartDefinition bipedLeftLeg = partdefinition.addOrReplaceChild("bipedLeftLeg", CubeListBuilder.create(), PartPose.offset(-2.0F, 12.0F, 0.0F));
		PartDefinition armorLeftLeg = bipedLeftLeg.addOrReplaceChild("armorLeftLeg",
				CubeListBuilder.create().texOffs(27, 0).addBox(1.25F, 7.0F, -2.75F, 5.5F, 3.0F, 5.5F, new CubeDeformation(0.0F)).texOffs(0, 34).addBox(1.5F, 0.0F, -2.5F, 5.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition armorLeftBoot = bipedLeftLeg.addOrReplaceChild("armorLeftBoot", CubeListBuilder.create().texOffs(54, 25).addBox(1.1875F, 11.0F, -1.9375F, 4.875F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bipedRightLeg = partdefinition.addOrReplaceChild("bipedRightLeg", CubeListBuilder.create(), PartPose.offset(2.0F, 12.0F, 0.0F));
		PartDefinition armorRightLeg = bipedRightLeg.addOrReplaceChild("armorRightLeg",
				CubeListBuilder.create().texOffs(0, 97).addBox(-6.5F, 0.0F, -2.5F, 5.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(20, 103).addBox(-6.75F, 7.0F, -2.75F, 5.5F, 3.0F, 5.5F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition armorRightBoot = bipedRightLeg.addOrReplaceChild("armorRightBoot", CubeListBuilder.create().texOffs(35, 76).addBox(-6.0625F, 11.0F, -2.0625F, 4.875F, 1.0F, 4.125F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bipedBody.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bipedLeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bipedRightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bipedLeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bipedRightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
