// Date: 5/18/2012 11:45:03 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package twilightforest.client.model;

import java.util.BitSet;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.util.MathHelper;

import org.lwjgl.opengl.GL11;

import twilightforest.entity.passive.EntityTFQuestRam;



public class ModelTFQuestRam extends ModelBase
{
	//fields
	ModelRenderer frontbody;
	ModelRenderer rearbody;
	ModelRenderer leg1;
	ModelRenderer haunch1;
	ModelRenderer leg2;
	ModelRenderer haunch2;
	ModelRenderer leg3;
	ModelRenderer haunch3;
	ModelRenderer leg4;
	ModelRenderer haunch4;
	ModelRenderer neck;
	ModelRenderer nose;
	ModelRenderer head;

	ModelRenderer[] segments;
	BitSet segmentEnabled;
	
	int[] colorOrder = new int[] {0, 8, 7, 15, 14, 1, 4, 5, 13, 3, 9, 11, 10, 2, 6, 12};

	public ModelTFQuestRam()
	{
		textureWidth = 128;
		textureHeight = 128;
		setTextureOffset("head.head", 0, 70);
		setTextureOffset("head.horn1a", 0, 94);
		setTextureOffset("head.horn1b", 20, 96);
		setTextureOffset("head.horn1c", 34, 95);
		setTextureOffset("head.horn1d", 46, 98);
		setTextureOffset("head.horn1e", 58, 95);
		setTextureOffset("head.horn1f", 76, 95);
		setTextureOffset("head.horn1g", 88, 97);
		setTextureOffset("head.horn1a", 0, 94);
		setTextureOffset("head.horn1b", 20, 96);
		setTextureOffset("head.horn1c", 34, 95);
		setTextureOffset("head.horn1d", 46, 98);
		setTextureOffset("head.horn1e", 58, 95);
		setTextureOffset("head.horn1f", 76, 95);
		setTextureOffset("head.horn1g", 88, 97);

		frontbody = new ModelRenderer(this, 0, 0);
		frontbody.addBox(-9F, -7.5F, -15F, 18, 15, 15);
		frontbody.setRotationPoint(0F, -1F, 2F);

		rearbody = new ModelRenderer(this, 0, 30);
		rearbody.addBox(-9F, -7.5F, 0F, 18, 15, 15);
		rearbody.setRotationPoint(0F, -1F, 4F);

		
		leg1 = new ModelRenderer(this, 66, 0);
		leg1.addBox(-3F, 10F, -3F, 6, 12, 6);
		leg1.setRotationPoint(-6F, 2F, 13F);

		haunch1 = new ModelRenderer(this, 90, 0);
		haunch1.addBox(-3.5F, 0F, -6F, 7, 10, 10);
		haunch1.setRotationPoint(-6F, 2F, 13F);

		leg2 = new ModelRenderer(this, 66, 0);
		leg2.addBox(-3F, 10F, -3F, 6, 12, 6);
		leg2.setRotationPoint(6F, 2F, 13F);

		haunch2 = new ModelRenderer(this, 90, 0);
		haunch2.addBox(-3.5F, 0F, -6F, 7, 10, 10);
		haunch2.setRotationPoint(6F, 2F, 13F);

		leg3 = new ModelRenderer(this, 66, 18);
		leg3.addBox(-3F, 10F, -3F, 6, 13, 6);
		leg3.setRotationPoint(-6F, 1F, -8F);

		haunch3 = new ModelRenderer(this, 90, 20);
		haunch3.addBox(-3.5F, 0F, -4F, 7, 10, 7);
		haunch3.setRotationPoint(-6F, 1F, -8F);

		leg4 = new ModelRenderer(this, 66, 18);
		leg4.addBox(-3F, 10F, -3F, 6, 13, 6);
		leg4.setRotationPoint(6F, 1F, -8F);

		haunch4 = new ModelRenderer(this, 90, 20);
		haunch4.addBox(-3.5F, 0F, -4F, 7, 10, 7);
		haunch4.setRotationPoint(6F, 1F, -8F);

		neck = new ModelRenderer(this, 66, 37);
		neck.addBox(-5.5F, -8F, -8F, 11, 14, 12);
		neck.setRotationPoint(0F, -8F, -7F);

		setRotation(neck, 0.2617994F, 0F, 0F);

		head = new ModelRenderer(this, "head");
		head.setRotationPoint(0F, -13F, -5F);

		head.addBox("head", -6F, -4.5F, -15F, 12, 9, 15);
		head.addBox("horn1a", 5F, -9F, -7F, 4, 4, 6);
		head.addBox("horn1b", 7F, -8F, -2F, 3, 4, 4);
		head.addBox("horn1c", 8F, -6F, 0F, 3, 6, 3);
		head.addBox("horn1d", 9.5F, -2F, -2F, 3, 3, 3);
		head.addBox("horn1e", 11F, 0F, -7F, 3, 3, 6);
		head.addBox("horn1f", 12F, -4F, -9F, 3, 6, 3);
		head.addBox("horn1g", 13F, -6F, -7F, 3, 3, 4);
		head.addBox("horn1a", -9F, -9F, -7F, 4, 4, 6);
		head.addBox("horn1b", -10F, -8F, -2F, 3, 4, 4);
		head.addBox("horn1c", -11F, -6F, 0F, 3, 6, 3);
		head.addBox("horn1d", -12.5F, -2F, -2F, 3, 3, 3);
		head.addBox("horn1e", -14F, 0F, -7F, 3, 3, 6);
		head.addBox("horn1f", -15F, -4F, -9F, 3, 6, 3);
		head.addBox("horn1g", -16F, -6F, -7F, 3, 3, 4);

		nose = new ModelRenderer(this, 54, 73);
		nose.addBox(-5.5F, -5F, -13F, 11, 9, 12);
		nose.setRotationPoint(0F, -7F, -1F);
		nose.setTextureSize(128, 128);
		setRotation(nose, 0.5235988F, 0F, 0F);
		head.addChild(nose);
		
		segments = new ModelRenderer[16];
		segmentEnabled = new BitSet(16);
		for (int i = 0; i < 16; i++) {
			segments[i] = new ModelRenderer(this, 0, 104);
			segments[i].addBox(-9F, -7.5F, 0F, 18, 15, 2);
			segments[i].setRotationPoint(0F, -1F, 2F);
			
			//segmentEnabled[i] = false;
		}
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		frontbody.render(f5);
		rearbody.render(f5);
		leg1.render(f5);
		haunch1.render(f5);
		leg2.render(f5);
		haunch2.render(f5);
		leg3.render(f5);
		haunch3.render(f5);
		leg4.render(f5);
		haunch4.render(f5);
		neck.render(f5);
		//nose.render(f5);
		head.render(f5);
		
		for (int i = 0; i < 16; i++) {
			if (segmentEnabled.get(i)) {
	            float var4 = 1.0F;
	            GL11.glColor3f(var4 * EntitySheep.fleeceColorTable[i][0], var4 * EntitySheep.fleeceColorTable[i][1], var4 * EntitySheep.fleeceColorTable[i][2]);
				segments[i].render(f5);
				
			}
		}
		GL11.glColor3f(1.0F, 1.0F, 1.0F);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	/**
	 * Sets the models various rotation angles.
	 */
	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6)
	{
		this.head.rotateAngleX = par5 / (180F / (float)Math.PI);
		this.head.rotateAngleY = par4 / (180F / (float)Math.PI);

		this.neck.rotateAngleY = this.head.rotateAngleY;

		this.leg1.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2 * 0.5F;
		this.leg2.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2 * 0.5F;
		this.leg3.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2 * 0.5F;
		this.leg4.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2 * 0.5F;
		this.haunch1.rotateAngleX = this.leg1.rotateAngleX;
		this.haunch2.rotateAngleX = this.leg2.rotateAngleX;
		this.haunch3.rotateAngleX = this.leg3.rotateAngleX;
		this.haunch4.rotateAngleX = this.leg4.rotateAngleX;
	}

    /**
     * Used for easily adding entity-dependent animations. The second and third float params here are the same second
     * and third as in the setRotationAngles method.
     */
	@Override
	public void setLivingAnimations(EntityLivingBase par1EntityLiving, float par2, float par3, float partialTick) {
		EntityTFQuestRam ram = (EntityTFQuestRam)par1EntityLiving;
		
		// how many colors should we display?
		int count = ram.countColorsSet();
		
		this.rearbody.rotationPointZ = 2 + 2 * count;
		this.leg1.rotationPointZ = 11 + 2 * count;
		this.leg2.rotationPointZ = 11 + 2 * count;
		this.haunch1.rotationPointZ = 11 + 2 * count;
		this.haunch2.rotationPointZ = 11 + 2 * count;
		
		// set up the colors displayed in color order
		int segmentOffset = 2;
		for (int color : colorOrder) {
			if (ram.isColorPresent(color)) {
				segmentEnabled.set(color);
				segments[color].rotationPointZ = segmentOffset;
				
				segmentOffset += 2;
			}
			else {
				segmentEnabled.clear(color);
			}
		}
	}

	
	
}
