package me.stray.mmc.blocks;

import me.stray.mmc.MoreMinecraft;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockAcuCamo extends Block {
	
	public BlockAcuCamo(Material materialIn) {
		super(materialIn);
		this.setStepSound(soundTypeCloth);
		this.setCreativeTab(MoreMinecraft.tabWeapons);
	}

}
