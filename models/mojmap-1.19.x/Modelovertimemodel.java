// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelovertimemodel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "overtimemodel"), "main");
	private final ModelPart Model;

	public Modelovertimemodel(ModelPart root) {
		this.Model = root.getChild("Model");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Model = partdefinition.addOrReplaceChild("Model", CubeListBuilder.create().texOffs(-15, 1)
				.addBox(-7.3667F, 13.3833F, -7.3667F, 15.0F, 0.3F, 15.0F, new CubeDeformation(0.0F)).texOffs(33, 22)
				.addBox(-7.3667F, -27.2167F, -0.3667F, 15.0F, 40.9F, 0.2F, new CubeDeformation(0.0F)),
				PartPose.offset(0.2667F, 10.4167F, 0.3667F));

		PartDefinition Model_r1 = Model.addOrReplaceChild("Model_r1",
				CubeListBuilder.create().texOffs(33, 22).addBox(-7.0F, -28.8F, 1.7F, 15.0F, 40.9F, 0.4F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.6333F, 1.5833F, -0.3667F, 0.0F, -1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Model.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}