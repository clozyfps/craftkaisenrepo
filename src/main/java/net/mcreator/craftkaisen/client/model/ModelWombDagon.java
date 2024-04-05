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
public class ModelWombDagon<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_kaisen", "model_womb_dagon"), "main");
	public final ModelPart body;

	public ModelWombDagon(ModelPart root) {
		this.body = root.getChild("body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(6.6005F, 4.1875F, -19.9764F, 16.0F, 14.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 49)
				.addBox(7.6005F, -8.8125F, -18.9764F, 14.0F, 13.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 30).addBox(5.6005F, -9.8125F, -20.9764F, 18.0F, 1.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offset(-14.6005F, 5.8125F, 11.9764F));
		PartDefinition torso_r1 = body.addOrReplaceChild("torso_r1", CubeListBuilder.create().texOffs(64, 23).addBox(-9.0F, -3.0F, -0.5F, 18.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.6005F, -6.7804F, -20.7398F, -0.0873F, 0.0F, 0.0F));
		PartDefinition torso_r2 = body.addOrReplaceChild("torso_r2",
				CubeListBuilder.create().texOffs(58, 74).addBox(-10.0F, 9.5F, 0.5F, 18.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(64, 0).addBox(-10.0F, -12.5F, -0.5F, 18.0F, 22.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(15.6005F, 2.6974F, -2.9307F, 0.0436F, 0.0F, 0.0F));
		PartDefinition torso_r3 = body.addOrReplaceChild("torso_r3",
				CubeListBuilder.create().texOffs(0, 58).addBox(0.5F, 9.5F, -9.0F, 0.0F, 3.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(56, 31).addBox(-0.5F, -12.5F, -9.0F, 1.0F, 22.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(23.6462F, 2.6974F, -11.9764F, 0.0F, 0.0F, -0.0436F));
		PartDefinition torso_r4 = body.addOrReplaceChild("torso_r4",
				CubeListBuilder.create().texOffs(58, 53).addBox(-0.5F, 9.5F, -9.0F, 0.0F, 3.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(38, 71).addBox(-0.5F, -12.5F, -9.0F, 1.0F, 22.0F, 18.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5548F, 2.6974F, -11.9764F, 0.0F, 0.0F, 0.0436F));
		PartDefinition torso_r5 = body.addOrReplaceChild("torso_r5", CubeListBuilder.create().texOffs(0, 36).addBox(-2.0F, -1.5F, -1.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.6005F, -4.5625F, -18.9764F, 0.0456F, -0.1685F, 0.127F));
		PartDefinition torso_r6 = body.addOrReplaceChild("torso_r6", CubeListBuilder.create().texOffs(28, 76).addBox(-2.0F, -2.0F, -4.5F, 4.0F, 4.0F, 8.0F, new CubeDeformation(-0.01F)),
				PartPose.offsetAndRotation(11.1757F, 4.993F, -19.6205F, 1.3764F, -0.8044F, -1.3754F));
		PartDefinition torso_r7 = body.addOrReplaceChild("torso_r7", CubeListBuilder.create().texOffs(58, 77).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.3505F, 5.6875F, -20.2264F, 0.7645F, -0.1841F, -0.2451F));
		PartDefinition torso_r8 = body.addOrReplaceChild("torso_r8", CubeListBuilder.create().texOffs(76, 29).addBox(-2.0F, -2.0F, -4.5F, 4.0F, 4.0F, 8.0F, new CubeDeformation(-0.01F)),
				PartPose.offsetAndRotation(18.0253F, 4.993F, -19.6205F, 1.3764F, 0.8044F, 1.3754F));
		PartDefinition torso_r9 = body.addOrReplaceChild("torso_r9", CubeListBuilder.create().texOffs(0, 79).addBox(-2.0F, -2.0F, 0.0F, 4.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(19.8505F, 5.6875F, -20.2264F, 0.7645F, 0.1841F, 0.2451F));
		PartDefinition torso_r10 = body.addOrReplaceChild("torso_r10", CubeListBuilder.create().texOffs(12, 7).addBox(-3.5F, 2.1543F, -1.1278F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.6005F, 2.1307F, -21.2857F, -0.0873F, 0.0F, 0.0F));
		PartDefinition torso_r11 = body.addOrReplaceChild("torso_r11", CubeListBuilder.create().texOffs(12, 10).addBox(-1.5F, 3.6909F, -0.4505F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.6005F, 2.1307F, -21.2857F, -0.3491F, 0.0F, 0.0F));
		PartDefinition torso_r12 = body.addOrReplaceChild("torso_r12", CubeListBuilder.create().texOffs(48, 0).addBox(0.0F, -0.152F, -1.3658F, 2.0F, 5.0F, 2.0F, new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(14.6005F, 2.1307F, -21.2857F, -0.1309F, 0.0F, 0.0F));
		PartDefinition torso_r13 = body.addOrReplaceChild("torso_r13", CubeListBuilder.create().texOffs(0, 13).addBox(2.5F, 3.679F, -0.0402F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 7)
				.addBox(2.0F, -0.321F, -0.5402F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.001F)).texOffs(6, 53).addBox(0.0F, -3.7933F, -1.3586F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.6005F, 2.1307F, -21.2857F, -0.3927F, 0.0F, 0.0F));
		PartDefinition torso_r14 = body.addOrReplaceChild("torso_r14",
				CubeListBuilder.create().texOffs(54, 11).addBox(-4.0F, -0.447F, -0.5738F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.001F)).texOffs(0, 0).addBox(-3.0F, -8.6605F, -1.684F, 6.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.6005F, 2.1307F, -21.2857F, -0.48F, 0.0F, 0.0F));
		PartDefinition torso_r15 = body.addOrReplaceChild("torso_r15", CubeListBuilder.create().texOffs(0, 49).addBox(-2.0F, -0.1689F, -1.5554F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(14.6005F, 2.1307F, -21.2857F, -0.1745F, 0.0F, 0.0F));
		PartDefinition torso_r16 = body.addOrReplaceChild("torso_r16", CubeListBuilder.create().texOffs(4, 13).addBox(0.5F, 4.4547F, 1.14F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.6005F, 2.1307F, -21.2857F, -0.5672F, 0.0F, 0.0F));
		PartDefinition torso_r17 = body.addOrReplaceChild("torso_r17",
				CubeListBuilder.create().texOffs(42, 49).addBox(2.0F, -3.9975F, -0.5054F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 53).addBox(-4.0F, -3.9975F, -0.5054F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.6005F, 2.1307F, -21.2857F, -0.1745F, 0.0F, 0.0F));
		PartDefinition torso_r18 = body.addOrReplaceChild("torso_r18", CubeListBuilder.create().texOffs(54, 30).addBox(-2.0F, -3.7606F, -1.5462F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.6005F, 2.1307F, -21.2857F, -0.4363F, 0.0F, 0.0F));
		PartDefinition torso_r19 = body.addOrReplaceChild("torso_r19", CubeListBuilder.create().texOffs(0, 41).addBox(-2.0F, -1.5F, -1.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.6005F, -4.5625F, -18.9764F, 0.0456F, 0.1685F, -0.127F));
		PartDefinition torso_r20 = body.addOrReplaceChild("torso_r20", CubeListBuilder.create().texOffs(0, 7).addBox(-2.0F, -2.0F, -1.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(20.1005F, -0.5625F, -18.4764F, 0.0F, -0.1309F, 0.1309F));
		PartDefinition torso_r21 = body.addOrReplaceChild("torso_r21", CubeListBuilder.create().texOffs(0, 30).addBox(-2.0F, -2.0F, -1.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.1005F, -0.5625F, -18.4764F, 0.0F, 0.1309F, -0.1309F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
