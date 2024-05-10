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
public class Modelmoondreg<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("craft_kaisen", "modelmoondreg"), "main");
	public final ModelPart moondreg;

	public Modelmoondreg(ModelPart root) {
		this.moondreg = root.getChild("moondreg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition moondreg = partdefinition
				.addOrReplaceChild(
						"moondreg", CubeListBuilder.create().texOffs(0, 66).addBox(-12.0F, -46.0F, -9.0F, 24.0F, 11.0F, 21.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-15.0F, -35.0F, -11.0F, 30.0F, 10.0F, 25.0F, new CubeDeformation(0.0F))
								.texOffs(0, 35).addBox(-13.0F, -25.0F, -9.0F, 26.0F, 10.0F, 21.0F, new CubeDeformation(0.0F)).texOffs(77, 49).addBox(-11.0F, -22.0F, -7.0F, 22.0F, 18.0F, 17.0F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = moondreg.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(90, 84).addBox(-4.975F, -37.5F, -3.0F, 9.95F, 11.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -31.2365F, 22.0025F, 1.4399F, 0.0F, 0.0F));
		PartDefinition cube_r2 = moondreg.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 98).addBox(-5.0F, -27.5F, -2.0F, 10.0F, 11.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(85, 0).addBox(-11.975F, -27.5F, 2.0F, 23.95F, 11.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -22.961F, 7.5667F, 0.8727F, 0.0F, 0.0F));
		PartDefinition cube_r3 = moondreg.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(0, 66).addBox(15.025F, -0.5F, -5.0F, 2.95F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 73).addBox(30.025F, -0.5F, -5.0F, 2.95F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-24.0F, -40.5496F, -6.3937F, 0.1309F, 0.0F, 0.0F));
		PartDefinition tenticle = moondreg.addOrReplaceChild("tenticle", CubeListBuilder.create().texOffs(0, 43).addBox(-1.0F, -1.0F, -6.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0F, -28.0F, -10.0F, 0.5585F, 0.3378F, 0.2042F));
		PartDefinition tenticle2 = tenticle.addOrReplaceChild("tenticle2", CubeListBuilder.create().texOffs(0, 35).addBox(-1.0F, -1.0F, -6.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition tenticle3 = tenticle2.addOrReplaceChild("tenticle3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r4 = tenticle3.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, -2.0F, -7.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 0.75F, 0.0F, 0.0F, 0.0F));
		PartDefinition tenticle4 = tenticle3.addOrReplaceChild("tenticle4",
				CubeListBuilder.create().texOffs(0, 9).addBox(-1.0F, -1.0F, -6.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.0F, 0.0F, -9.25F, 8.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition tenticle41 = moondreg.addOrReplaceChild("tenticle41", CubeListBuilder.create().texOffs(0, 43).addBox(-1.0F, -1.0F, 0.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0F, -28.0F, 13.0F, -0.5585F, -0.3378F, 0.2042F));
		PartDefinition tenticle42 = tenticle41.addOrReplaceChild("tenticle42", CubeListBuilder.create().texOffs(0, 35).addBox(-1.0F, -1.0F, 0.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition tenticle43 = tenticle42.addOrReplaceChild("tenticle43", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r5 = tenticle43.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, -2.0F, 1.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, -0.75F, 0.0F, 0.0F, 0.0F));
		PartDefinition tenticle44 = tenticle43.addOrReplaceChild("tenticle44",
				CubeListBuilder.create().texOffs(0, 9).addBox(-1.0F, -1.0F, 0.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.0F, 0.0F, 0.25F, 8.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition tenticle53 = moondreg.addOrReplaceChild("tenticle53", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(-1.0F, -1.0F, 0.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(11.0F, -28.0F, 13.0F, -0.5585F, 0.3378F, -0.2042F));
		PartDefinition tenticle54 = tenticle53.addOrReplaceChild("tenticle54", CubeListBuilder.create().texOffs(0, 35).mirror().addBox(-1.0F, -1.0F, 0.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition tenticle55 = tenticle54.addOrReplaceChild("tenticle55", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r6 = tenticle55.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 17).mirror().addBox(-1.0F, -2.0F, 1.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.0F, -0.75F, 0.0F, 0.0F, 0.0F));
		PartDefinition tenticle56 = tenticle55.addOrReplaceChild("tenticle56", CubeListBuilder.create().texOffs(0, 9).mirror().addBox(-1.0F, -1.0F, 0.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(-8, 0).mirror()
				.addBox(-4.0F, 0.0F, 0.25F, 8.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition tenticle9 = moondreg.addOrReplaceChild("tenticle9", CubeListBuilder.create().texOffs(0, 43).addBox(-1.0F, -1.0F, -6.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -28.0F, -10.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition tenticle10 = tenticle9.addOrReplaceChild("tenticle10", CubeListBuilder.create().texOffs(0, 35).addBox(-1.0F, -1.0F, -6.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition tenticle11 = tenticle10.addOrReplaceChild("tenticle11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r7 = tenticle11.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, -2.0F, -7.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 0.75F, 0.0F, 0.0F, 0.0F));
		PartDefinition tenticle12 = tenticle11.addOrReplaceChild("tenticle12",
				CubeListBuilder.create().texOffs(0, 9).addBox(-1.0F, -1.0F, -6.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.0F, 0.0F, -9.25F, 8.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition tenticle45 = moondreg.addOrReplaceChild("tenticle45", CubeListBuilder.create().texOffs(0, 43).addBox(-1.0F, -1.0F, 0.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -28.0F, 13.0F, -0.5236F, 0.0F, 0.0F));
		PartDefinition tenticle46 = tenticle45.addOrReplaceChild("tenticle46", CubeListBuilder.create().texOffs(0, 35).addBox(-1.0F, -1.0F, 0.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition tenticle47 = tenticle46.addOrReplaceChild("tenticle47", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r8 = tenticle47.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, -2.0F, 1.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, -0.75F, 0.0F, 0.0F, 0.0F));
		PartDefinition tenticle48 = tenticle47.addOrReplaceChild("tenticle48",
				CubeListBuilder.create().texOffs(0, 9).addBox(-1.0F, -1.0F, 0.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.0F, 0.0F, 0.25F, 8.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition tenticle49 = moondreg.addOrReplaceChild("tenticle49", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(-1.0F, -1.0F, 0.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.0F, -28.0F, 13.0F, -0.5236F, 0.0F, 0.0F));
		PartDefinition tenticle50 = tenticle49.addOrReplaceChild("tenticle50", CubeListBuilder.create().texOffs(0, 35).mirror().addBox(-1.0F, -1.0F, 0.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, -0.7854F, 0.0F, 0.0F));
		PartDefinition tenticle51 = tenticle50.addOrReplaceChild("tenticle51", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r9 = tenticle51.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 17).mirror().addBox(-1.0F, -2.0F, 1.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.0F, -0.75F, 0.0F, 0.0F, 0.0F));
		PartDefinition tenticle52 = tenticle51.addOrReplaceChild("tenticle52", CubeListBuilder.create().texOffs(0, 9).mirror().addBox(-1.0F, -1.0F, 0.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).mirror()
				.addBox(-4.0F, 0.0F, 0.25F, 8.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition tenticle17 = moondreg.addOrReplaceChild("tenticle17", CubeListBuilder.create().texOffs(0, 43).addBox(-1.0F, -1.0F, -6.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.5F, -28.75F, -7.75F, 0.0F, 1.5708F, -0.48F));
		PartDefinition tenticle18 = tenticle17.addOrReplaceChild("tenticle18", CubeListBuilder.create().texOffs(0, 35).addBox(-1.0F, -1.0F, -6.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition tenticle19 = tenticle18.addOrReplaceChild("tenticle19", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r10 = tenticle19.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, -2.0F, -7.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 0.75F, 0.0F, 0.0F, 0.0F));
		PartDefinition tenticle20 = tenticle19.addOrReplaceChild("tenticle20",
				CubeListBuilder.create().texOffs(0, 9).addBox(-1.0F, -1.0F, -6.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.0F, 0.0F, -9.25F, 8.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition tenticle29 = moondreg.addOrReplaceChild("tenticle29", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(-1.0F, -1.0F, -6.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(13.5F, -28.75F, -7.75F, 0.0F, -1.5708F, 0.48F));
		PartDefinition tenticle30 = tenticle29.addOrReplaceChild("tenticle30", CubeListBuilder.create().texOffs(0, 35).mirror().addBox(-1.0F, -1.0F, -6.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition tenticle31 = tenticle30.addOrReplaceChild("tenticle31", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r11 = tenticle31.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 17).mirror().addBox(-1.0F, -2.0F, -7.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.0F, 0.75F, 0.0F, 0.0F, 0.0F));
		PartDefinition tenticle32 = tenticle31.addOrReplaceChild("tenticle32", CubeListBuilder.create().texOffs(0, 9).mirror().addBox(-1.0F, -1.0F, -6.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).mirror()
				.addBox(-4.0F, 0.0F, -9.25F, 8.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition tenticle21 = moondreg.addOrReplaceChild("tenticle21", CubeListBuilder.create().texOffs(0, 43).addBox(-1.0F, -1.0F, -6.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.5F, -28.75F, 10.75F, 0.0F, 1.5708F, -0.48F));
		PartDefinition tenticle22 = tenticle21.addOrReplaceChild("tenticle22", CubeListBuilder.create().texOffs(0, 35).addBox(-1.0F, -1.0F, -6.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition tenticle23 = tenticle22.addOrReplaceChild("tenticle23", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r12 = tenticle23.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, -2.0F, -7.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 0.75F, 0.0F, 0.0F, 0.0F));
		PartDefinition tenticle24 = tenticle23.addOrReplaceChild("tenticle24",
				CubeListBuilder.create().texOffs(0, 9).addBox(-1.0F, -1.0F, -6.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.0F, 0.0F, -9.25F, 8.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition tenticle37 = moondreg.addOrReplaceChild("tenticle37", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(-1.0F, -1.0F, -6.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(13.5F, -28.75F, 10.75F, 0.0F, -1.5708F, 0.48F));
		PartDefinition tenticle38 = tenticle37.addOrReplaceChild("tenticle38", CubeListBuilder.create().texOffs(0, 35).mirror().addBox(-1.0F, -1.0F, -6.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition tenticle39 = tenticle38.addOrReplaceChild("tenticle39", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r13 = tenticle39.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 17).mirror().addBox(-1.0F, -2.0F, -7.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.0F, 0.75F, 0.0F, 0.0F, 0.0F));
		PartDefinition tenticle40 = tenticle39.addOrReplaceChild("tenticle40", CubeListBuilder.create().texOffs(0, 9).mirror().addBox(-1.0F, -1.0F, -6.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).mirror()
				.addBox(-4.0F, 0.0F, -9.25F, 8.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition tenticle25 = moondreg.addOrReplaceChild("tenticle25", CubeListBuilder.create().texOffs(0, 43).addBox(-1.0F, -1.0F, -6.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-13.5F, -28.75F, 1.5F, 0.0F, 1.5708F, -0.48F));
		PartDefinition tenticle26 = tenticle25.addOrReplaceChild("tenticle26", CubeListBuilder.create().texOffs(0, 35).addBox(-1.0F, -1.0F, -6.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition tenticle27 = tenticle26.addOrReplaceChild("tenticle27", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r14 = tenticle27.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 17).addBox(-1.0F, -2.0F, -7.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 0.75F, 0.0F, 0.0F, 0.0F));
		PartDefinition tenticle28 = tenticle27.addOrReplaceChild("tenticle28",
				CubeListBuilder.create().texOffs(0, 9).addBox(-1.0F, -1.0F, -6.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-4.0F, 0.0F, -9.25F, 8.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition tenticle33 = moondreg.addOrReplaceChild("tenticle33", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(-1.0F, -1.0F, -6.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(13.5F, -28.75F, 1.5F, 0.0F, -1.5708F, 0.48F));
		PartDefinition tenticle34 = tenticle33.addOrReplaceChild("tenticle34", CubeListBuilder.create().texOffs(0, 35).mirror().addBox(-1.0F, -1.0F, -6.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition tenticle35 = tenticle34.addOrReplaceChild("tenticle35", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r15 = tenticle35.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 17).mirror().addBox(-1.0F, -2.0F, -7.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.0F, 0.75F, 0.0F, 0.0F, 0.0F));
		PartDefinition tenticle36 = tenticle35.addOrReplaceChild("tenticle36", CubeListBuilder.create().texOffs(0, 9).mirror().addBox(-1.0F, -1.0F, -6.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).mirror()
				.addBox(-4.0F, 0.0F, -9.25F, 8.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition tenticle13 = moondreg.addOrReplaceChild("tenticle13", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(-1.0F, -1.0F, -6.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(5.0F, -28.0F, -10.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition tenticle14 = tenticle13.addOrReplaceChild("tenticle14", CubeListBuilder.create().texOffs(0, 35).mirror().addBox(-1.0F, -1.0F, -6.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition tenticle15 = tenticle14.addOrReplaceChild("tenticle15", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r16 = tenticle15.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 17).mirror().addBox(-1.0F, -2.0F, -7.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.0F, 0.75F, 0.0F, 0.0F, 0.0F));
		PartDefinition tenticle16 = tenticle15.addOrReplaceChild("tenticle16", CubeListBuilder.create().texOffs(0, 9).mirror().addBox(-1.0F, -1.0F, -6.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).mirror()
				.addBox(-4.0F, 0.0F, -9.25F, 8.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, -0.3927F, 0.0F, 0.0F));
		PartDefinition tenticle5 = moondreg.addOrReplaceChild("tenticle5", CubeListBuilder.create().texOffs(0, 43).mirror().addBox(-1.0F, -1.0F, -6.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(11.0F, -28.0F, -10.0F, 0.5585F, -0.3378F, -0.2042F));
		PartDefinition tenticle6 = tenticle5.addOrReplaceChild("tenticle6", CubeListBuilder.create().texOffs(0, 35).mirror().addBox(-1.0F, -1.0F, -6.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, 0.7854F, 0.0F, 0.0F));
		PartDefinition tenticle7 = tenticle6.addOrReplaceChild("tenticle7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, 0.3927F, 0.0F, 0.0F));
		PartDefinition cube_r17 = tenticle7.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 17).mirror().addBox(-1.0F, -2.0F, -7.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false),
				PartPose.offsetAndRotation(0.0F, 1.0F, 0.75F, 0.0F, 0.0F, 0.0F));
		PartDefinition tenticle8 = tenticle7.addOrReplaceChild("tenticle8", CubeListBuilder.create().texOffs(0, 9).mirror().addBox(-1.0F, -1.0F, -6.25F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(0, 0).mirror()
				.addBox(-4.0F, 0.0F, -9.25F, 8.0F, 0.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, -6.0F, -0.3927F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		moondreg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}
