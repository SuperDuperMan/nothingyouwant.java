//any of these can be used to write into the nbt file

par1NBTTagCompound.setTag("Pos", this.newDoubleNBTList(new double[] {this.posX, this.posY + (double)this.ySize, this.posZ}));
par1NBTTagCompound.setTag("Motion", this.newDoubleNBTList(new double[] {this.motionX, this.motionY, this.motionZ}));                   par1NBTTagCompound.setTag("Rotation", this.newFloatNBTList(new float[] {this.rotationYaw, this.rotationPitch}));
par1NBTTagCompound.setFloat("FallDistance", this.fallDistance);
par1NBTTagCompound.setShort("Fire", (short)this.fire);
par1NBTTagCompound.setShort("Air", (short)this.getAir());
par1NBTTagCompound.setBoolean("OnGround", this.onGround);
par1NBTTagCompound.setInteger("Dimension", this.dimension);
par1NBTTagCompound.setBoolean("Invulnerable", this.invulnerable);
par1NBTTagCompound.setInteger("PortalCooldown", this.timeUntilPortal);
par1NBTTagCompound.setLong("UUIDMost", this.field_96093_i.getMostSignificantBits());
par1NBTTagCompound.setLong("UUIDLeast", this.field_96093_i.getLeastSignificantBits());
