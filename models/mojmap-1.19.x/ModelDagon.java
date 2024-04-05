// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelDagon<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "dagon"), "main");
	private final ModelPart Head;
	private final ModelPart body;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;
	private final ModelPart LeftLeg;
	private final ModelPart RightLeg;

	public ModelDagon(ModelPart root) {
		this.Head = root.getChild("Head");
		this.body = root.getChild("body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(68, 49)
				.addBox(10.6005F, -17.2606F, -23.8504F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(58, 32)
				.addBox(16.6005F, -17.2606F, -23.8504F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-14.6005F, -15.1875F, 14.9764F));

		PartDefinition torso_r1 = Head.addOrReplaceChild("torso_r1",
				CubeListBuilder.create().texOffs(11, 11).addBox(-3.5F, 2.2269F, -6.1828F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.6005F, -13.776F, -18.3157F, 0.0873F, 0.0F, 0.0F));

		PartDefinition torso_r2 = Head.addOrReplaceChild("torso_r2",
				CubeListBuilder.create().texOffs(12, 7).addBox(-1.5F, 5.0694F, -5.3144F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.6005F, -13.776F, -18.3157F, -0.1745F, 0.0F, 0.0F));

		PartDefinition torso_r3 = Head.addOrReplaceChild("torso_r3",
				CubeListBuilder.create().texOffs(0, 32).addBox(0.0F, 0.141F, -6.4128F, 2.0F, 5.0F, 2.0F,
						new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(14.6005F, -13.776F, -18.3157F, 0.0436F, 0.0F, 0.0F));

		PartDefinition torso_r4 = Head.addOrReplaceChild("torso_r4",
				CubeListBuilder.create().texOffs(12, 14)
						.addBox(2.5F, 5.2683F, -4.8394F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(47, 0)
						.addBox(2.0F, 1.2683F, -5.3394F, 2.0F, 4.0F, 2.0F, new CubeDeformation(-0.001F)).texOffs(46, 58)
						.addBox(0.0F, -2.2041F, -6.1578F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.6005F, -13.776F, -18.3157F, -0.2182F, 0.0F, 0.0F));

		PartDefinition torso_r5 = Head.addOrReplaceChild("torso_r5",
				CubeListBuilder.create().texOffs(70, 71)
						.addBox(-4.0F, 1.5545F, -5.2162F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.001F)).texOffs(0, 0)
						.addBox(-3.0F, -6.659F, -6.3264F, 6.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.6005F, -13.776F, -18.3157F, -0.3054F, 0.0F, 0.0F));

		PartDefinition torso_r6 = Head.addOrReplaceChild("torso_r6",
				CubeListBuilder.create().texOffs(0, 58).addBox(-2.0F, 0.3439F, -6.5848F, 2.0F, 4.0F, 2.0F,
						new CubeDeformation(-0.001F)),
				PartPose.offsetAndRotation(14.6005F, -13.776F, -18.3157F, 0.0F, 0.0F, 0.0F));

		PartDefinition torso_r7 = Head.addOrReplaceChild("torso_r7",
				CubeListBuilder.create().texOffs(15, 9).addBox(0.5F, 6.8532F, -3.3103F, 1.0F, 2.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.6005F, -13.776F, -18.3157F, -0.3927F, 0.0F, 0.0F));

		PartDefinition torso_r8 = Head.addOrReplaceChild("torso_r8",
				CubeListBuilder.create().texOffs(66, 28).addBox(-2.0F, -1.9635F, -6.2714F, 2.0F, 4.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.6005F, -13.776F, -18.3157F, -0.2618F, 0.0F, 0.0F));

		PartDefinition torso_r9 = Head.addOrReplaceChild("torso_r9",
				CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -11.3115F, -2.7327F, 14.0F, 13.0F, 19.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.6005F, -13.776F, -18.3157F, 0.1745F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 32)
				.addBox(2.6005F, -14.8125F, -16.9764F, 24.0F, 16.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(68, 28)
				.addBox(8.6005F, -5.8125F, -17.0264F, 12.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(47, 0)
				.addBox(4.6005F, 9.1875F, -16.9764F, 20.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(100, 82)
				.addBox(10.6005F, 9.1875F, -17.0014F, 8.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 58)
				.addBox(5.6005F, 1.1875F, -16.9764F, 18.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-14.6005F, -15.1875F, 14.9764F));

		PartDefinition torso_r10 = body.addOrReplaceChild("torso_r10",
				CubeListBuilder.create().texOffs(0, 7).mirror()
						.addBox(-6.8753F, -6.586F, -2.9827F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(14.6005F, -13.776F, -18.3157F, 0.1719F, -0.0302F, 0.1719F));

		PartDefinition torso_r11 = body.addOrReplaceChild("torso_r11",
				CubeListBuilder.create().texOffs(0, 7).addBox(3.8753F, -6.586F, -2.9827F, 3.0F, 1.0F, 2.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(14.6005F, -13.776F, -18.3157F, 0.1719F, 0.0302F, -0.1719F));

		PartDefinition torso_r12 = body.addOrReplaceChild("torso_r12",
				CubeListBuilder.create().texOffs(0, 95).addBox(-4.5F, -5.0F, -5.0F, 9.0F, 8.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(20.1005F, 18.1875F, -11.9764F, -0.2182F, 0.0F, 0.0F));

		PartDefinition torso_r13 = body.addOrReplaceChild("torso_r13",
				CubeListBuilder.create().texOffs(68, 45)
						.addBox(-6.75F, -3.0F, -0.5F, 26.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(56, 58)
						.addBox(-6.75F, -2.0F, 0.0F, 26.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(92, 116)
						.addBox(-6.75F, -2.0F, -0.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.6495F, 4.1875F, -6.4764F, 0.0F, 0.0F, -0.1309F));

		PartDefinition torso_r14 = body.addOrReplaceChild("torso_r14", CubeListBuilder.create().texOffs(92, 116)
				.mirror().addBox(5.75F, -2.0F, -0.5F, 1.0F, 13.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(68, 45).mirror().addBox(-19.25F, -3.0F, -0.5F, 26.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.mirror(false).texOffs(56, 58).mirror()
				.addBox(-19.25F, -2.0F, 0.0F, 26.0F, 13.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(37.8505F, 4.1875F, -6.4764F, 0.0F, 0.0F, 0.1309F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(60, 108).mirror()
						.addBox(-5.3995F, -14.8125F, -15.9764F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.0F))
						.mirror(false),
				PartPose.offset(-14.6005F, -15.1875F, 14.9764F));

		PartDefinition torso_r15 = RightArm.addOrReplaceChild("torso_r15",
				CubeListBuilder.create().texOffs(27, 86).mirror()
						.addBox(-4.5F, 8.0F, -5.5F, 9.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false)
						.texOffs(112, 21).mirror()
						.addBox(-3.5F, -6.0F, -4.5F, 7.0F, 14.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-1.3995F, 0.1875F, -11.9764F, -0.2618F, 0.0F, 0.0F));

		PartDefinition LeftArm = partdefinition
				.addOrReplaceChild(
						"LeftArm", CubeListBuilder.create().texOffs(60, 108).addBox(26.6005F, -14.8125F, -15.9764F,
								8.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)),
						PartPose.offset(-14.6005F, -15.1875F, 14.9764F));

		PartDefinition torso_r16 = LeftArm.addOrReplaceChild("torso_r16",
				CubeListBuilder.create().texOffs(27, 86)
						.addBox(-4.5F, 8.0F, -5.5F, 9.0F, 9.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(112, 21)
						.addBox(-3.5F, -6.0F, -4.5F, 7.0F, 14.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(30.6005F, 0.1875F, -11.9764F, -0.2618F, 0.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(100, 63)
						.addBox(1.5F, 20.75F, -5.0F, 8.0F, 11.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(70, 73)
						.addBox(2.0F, 37.75F, -10.0F, 7.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(107, 0)
						.addBox(2.0F, 31.75F, -4.5F, 7.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -16.0F, 3.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(43, 71)
						.addBox(-9.0F, -2.25F, -7.0F, 7.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)).texOffs(100, 63)
						.mirror().addBox(-9.5F, -19.25F, -2.0F, 8.0F, 11.0F, 8.0F, new CubeDeformation(0.0F))
						.mirror(false).texOffs(107, 0).mirror()
						.addBox(-9.0F, -8.25F, -1.5F, 7.0F, 6.0F, 7.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition torso_r17 = RightLeg.addOrReplaceChild("torso_r17",
				CubeListBuilder.create().texOffs(0, 95).mirror()
						.addBox(-4.5F, -5.0F, -5.0F, 9.0F, 8.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(-5.5F, -21.0F, 3.0F, -0.2182F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}