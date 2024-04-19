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
public class Modeltidestree<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_kaisen", "modeltidestree"), "main");
	public final ModelPart bone15;
	public final ModelPart bone;
	public final ModelPart bb_main;

	public Modeltidestree(ModelPart root) {
		this.bone15 = root.getChild("bone15");
		this.bone = root.getChild("bone");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone15 = partdefinition.addOrReplaceChild("bone15", CubeListBuilder.create(), PartPose.offset(9.749F, -20.9897F, 0.0F));
		PartDefinition bone16 = bone15.addOrReplaceChild("bone16", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1131F, 0.7141F, -0.0283F));
		PartDefinition cube_r1 = bone16.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(-5, 48).addBox(-12.7027F, 4.3088F, -12.2813F, 24.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.6379F, -4.794F, -2.5F, 0.1725F, -0.8623F, -0.2996F));
		PartDefinition bone19 = bone16.addOrReplaceChild("bone19", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.047F, -0.1801F, 0.2069F));
		PartDefinition cube_r2 = bone19.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(-5, 48).addBox(-11.2272F, 5.1643F, -2.2F, 24.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.6379F, -4.794F, -2.5F, 0.0F, 0.0F, -0.4189F));
		PartDefinition bone20 = bone16.addOrReplaceChild("bone20", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.088F, 0.2451F, 0.0245F));
		PartDefinition cube_r3 = bone20.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(-5, 48).addBox(-10.8065F, 4.5798F, -12.3653F, 24.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.6379F, -4.794F, -2.5F, 0.4674F, -0.5963F, -0.5515F));
		PartDefinition bone21 = bone20.addOrReplaceChild("bone21", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.047F, -0.1801F, 0.2069F));
		PartDefinition cube_r4 = bone21.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(-5, 48).addBox(-11.2272F, 5.1643F, -2.2F, 24.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.6379F, -4.794F, -2.5F, 0.0F, 0.0F, -0.4189F));
		PartDefinition bone17 = bone15.addOrReplaceChild("bone17", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone18 = bone17.addOrReplaceChild("bone18", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1344F, -0.5438F, 0.2557F));
		PartDefinition cube_r5 = bone18.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(-5, 48).addBox(-11.2272F, 5.1643F, -2.2F, 24.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.6379F, -4.794F, -2.5F, 0.0F, 0.0F, -0.4189F));
		PartDefinition bone22 = bone15.addOrReplaceChild("bone22", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.9199F, 0.0F));
		PartDefinition bone23 = bone22.addOrReplaceChild("bone23", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1251F, 0.8181F, -0.0455F));
		PartDefinition cube_r6 = bone23.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(-5, 48).addBox(-12.7027F, 4.3088F, -12.2813F, 24.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.6379F, -4.794F, -2.5F, 0.1725F, -0.8623F, -0.2996F));
		PartDefinition bone24 = bone23.addOrReplaceChild("bone24", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.047F, -0.1801F, 0.2069F));
		PartDefinition cube_r7 = bone24.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(-5, 48).addBox(-11.2272F, 5.1643F, -2.2F, 24.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.6379F, -4.794F, -2.5F, 0.0F, 0.0F, -0.4189F));
		PartDefinition bone25 = bone23.addOrReplaceChild("bone25", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.088F, 0.2451F, 0.0245F));
		PartDefinition cube_r8 = bone25.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(-5, 48).addBox(-10.8065F, 4.5798F, -12.3653F, 24.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.6379F, -4.794F, -2.5F, 0.4674F, -0.5963F, -0.5515F));
		PartDefinition bone26 = bone25.addOrReplaceChild("bone26", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.047F, -0.1801F, 0.2069F));
		PartDefinition cube_r9 = bone26.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(-5, 48).addBox(-11.2272F, 5.1643F, -2.2F, 24.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.6379F, -4.794F, -2.5F, 0.0F, 0.0F, -0.4189F));
		PartDefinition bone27 = bone22.addOrReplaceChild("bone27", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.5482F, 0.0F));
		PartDefinition bone28 = bone27.addOrReplaceChild("bone28", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1344F, -0.5438F, 0.2557F));
		PartDefinition cube_r10 = bone28.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(-5, 48).addBox(-11.2272F, 5.1643F, -2.2F, 24.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.6379F, -4.794F, -2.5F, 0.0F, 0.0F, -0.4189F));
		PartDefinition bone36 = bone27.addOrReplaceChild("bone36", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone37 = bone36.addOrReplaceChild("bone37", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1344F, -0.5438F, 0.2557F));
		PartDefinition cube_r11 = bone37.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(-5, 48).addBox(-11.2272F, 5.1643F, -2.2F, 24.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.6379F, -4.794F, -2.5F, 0.0F, 0.0F, -0.4189F));
		PartDefinition bone38 = bone27.addOrReplaceChild("bone38", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.5831F, 0.0F));
		PartDefinition bone39 = bone38.addOrReplaceChild("bone39", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1344F, -0.5438F, 0.2557F));
		PartDefinition cube_r12 = bone39.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(-5, 48).addBox(-11.2272F, 5.1643F, -2.2F, 24.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.6379F, -4.794F, -2.5F, 0.0F, 0.0F, -0.4189F));
		PartDefinition bone29 = bone22.addOrReplaceChild("bone29", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.9199F, 0.0F));
		PartDefinition bone30 = bone29.addOrReplaceChild("bone30", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1131F, 0.7141F, -0.0283F));
		PartDefinition cube_r13 = bone30.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(-5, 48).addBox(-12.7027F, 4.3088F, -12.2813F, 24.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.6379F, -4.794F, -2.5F, 0.1725F, -0.8623F, -0.2996F));
		PartDefinition bone31 = bone30.addOrReplaceChild("bone31", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.047F, -0.1801F, 0.2069F));
		PartDefinition cube_r14 = bone31.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(-5, 48).addBox(-11.2272F, 5.1643F, -2.2F, 24.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.6379F, -4.794F, -2.5F, 0.0F, 0.0F, -0.4189F));
		PartDefinition bone32 = bone30.addOrReplaceChild("bone32", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.088F, 0.2451F, 0.0245F));
		PartDefinition cube_r15 = bone32.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(-5, 48).addBox(-10.8065F, 4.5798F, -12.3653F, 24.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.6379F, -4.794F, -2.5F, 0.4674F, -0.5963F, -0.5515F));
		PartDefinition bone33 = bone32.addOrReplaceChild("bone33", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.047F, -0.1801F, 0.2069F));
		PartDefinition cube_r16 = bone33.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(-5, 48).addBox(-11.2272F, 5.1643F, -2.2F, 24.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.6379F, -4.794F, -2.5F, 0.0F, 0.0F, -0.4189F));
		PartDefinition bone34 = bone29.addOrReplaceChild("bone34", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition bone35 = bone34.addOrReplaceChild("bone35", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1344F, -0.5438F, 0.2557F));
		PartDefinition cube_r17 = bone35.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(-5, 48).addBox(-11.2272F, 5.1643F, -2.2F, 24.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.6379F, -4.794F, -2.5F, 0.0F, 0.0F, -0.4189F));
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(9.749F, -24.7897F, 0.0F));
		PartDefinition cube_r18 = bone.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(-5, 48).addBox(-12.0F, 6.9F, -2.2F, 24.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.6379F, -4.794F, -2.5F, 0.0F, 0.0F, -0.4189F));
		PartDefinition bone2 = bone.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5585F, 0.0F));
		PartDefinition cube_r19 = bone2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(-5, 48).addBox(-12.0F, 6.9F, -2.2F, 24.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.6379F, -4.794F, -2.5F, 0.0F, 0.0F, -0.4189F));
		PartDefinition bone3 = bone.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.885F, 0.0F));
		PartDefinition cube_r20 = bone3.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(-5, 48).addBox(-12.0F, 6.9F, -2.2F, 24.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.6379F, -4.794F, -2.5F, 0.0F, 0.0F, -0.4189F));
		PartDefinition bone4 = bone3.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5585F, 0.0F));
		PartDefinition cube_r21 = bone4.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(-5, 48).addBox(-12.0F, 6.9F, -2.2F, 24.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.6379F, -4.794F, -2.5F, 0.0F, 0.0F, -0.4189F));
		PartDefinition bone9 = bone3.addOrReplaceChild("bone9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -3.002F, 0.0F));
		PartDefinition cube_r22 = bone9.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(-5, 48).addBox(-12.0F, 6.9F, -2.2F, 24.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.6379F, -4.794F, -2.5F, 0.0F, 0.0F, -0.4189F));
		PartDefinition bone10 = bone9.addOrReplaceChild("bone10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.6232F, 0.0F));
		PartDefinition cube_r23 = bone10.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(-5, 48).addBox(-12.0F, 6.9F, -2.2F, 24.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.6379F, -4.794F, -2.5F, 0.0F, 0.0F, -0.4189F));
		PartDefinition bone11 = bone9.addOrReplaceChild("bone11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.4784F, 0.0F));
		PartDefinition cube_r24 = bone11.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(-5, 48).addBox(-12.0F, 6.9F, -2.2F, 24.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.6379F, -4.794F, -2.5F, 0.0F, 0.0F, -0.4189F));
		PartDefinition bone12 = bone11.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.6755F, 0.0F));
		PartDefinition cube_r25 = bone12.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(-5, 48).addBox(-12.0F, 6.9F, -2.2F, 24.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.6379F, -4.794F, -2.5F, 0.0F, 0.0F, -0.4189F));
		PartDefinition bone13 = bone11.addOrReplaceChild("bone13", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.1642F, 0.0F));
		PartDefinition cube_r26 = bone13.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(-5, 48).addBox(-12.0F, 6.9F, -2.2F, 24.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.6379F, -4.794F, -2.5F, 0.0F, 0.0F, -0.4189F));
		PartDefinition bone14 = bone13.addOrReplaceChild("bone14", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5585F, 0.0F));
		PartDefinition cube_r27 = bone14.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(-5, 48).addBox(-12.0F, 6.9F, -2.2F, 24.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.6379F, -4.794F, -2.5F, 0.0F, 0.0F, -0.4189F));
		PartDefinition bone5 = bone.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.2864F, 0.0F));
		PartDefinition cube_r28 = bone5.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(-5, 48).addBox(-12.0F, 6.9F, -2.2F, 24.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.6379F, -4.794F, -2.5F, 0.0F, 0.0F, -0.4189F));
		PartDefinition bone6 = bone5.addOrReplaceChild("bone6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5585F, 0.0F));
		PartDefinition cube_r29 = bone6.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(-5, 48).addBox(-12.0F, 6.9F, -2.2F, 24.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.6379F, -4.794F, -2.5F, 0.0F, 0.0F, -0.4189F));
		PartDefinition bone7 = bone5.addOrReplaceChild("bone7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.1519F, 0.0F));
		PartDefinition cube_r30 = bone7.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(-5, 48).addBox(-12.0F, 6.9F, -2.2F, 24.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.6379F, -4.794F, -2.5F, 0.0F, 0.0F, -0.4189F));
		PartDefinition bone8 = bone7.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5585F, 0.0F));
		PartDefinition cube_r31 = bone8.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(-5, 48).addBox(-12.0F, 6.9F, -2.2F, 24.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-14.6379F, -4.794F, -2.5F, 0.0F, 0.0F, -0.4189F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r32 = bb_main.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.6F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(9.749F, -48.7897F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition cube_r33 = bb_main.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(0, 0).addBox(-1.6F, -26.5F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-1.6F, -20.5F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-1.6F, -14.8F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.7881F, -19.5365F, 0.0F, 0.0F, 0.0F, 0.0873F));
		PartDefinition cube_r34 = bb_main.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(0, 0).addBox(-1.9F, -8.8F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.7881F, -19.5365F, 0.0F, 0.0F, 0.0F, 0.1222F));
		PartDefinition cube_r35 = bb_main.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.9F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.7881F, -19.5365F, 0.0F, 0.0F, 0.0F, 0.1745F));
		PartDefinition cube_r36 = bb_main.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(0, 0).addBox(-0.9F, -2.5F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.5687F, -14.3854F, 0.0F, 0.0F, 0.0F, 0.2618F));
		PartDefinition cube_r37 = bb_main.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, -11.9F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3665F));
		PartDefinition cube_r38 = bb_main.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(0, 0).addBox(-2.2F, -6.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4887F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone15.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
