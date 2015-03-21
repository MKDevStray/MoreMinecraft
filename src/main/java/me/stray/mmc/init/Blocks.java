package me.stray.mmc.init;

import me.stray.mmc.Reference;
import me.stray.mmc.blocks.BlockAcuCamo;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Blocks {
	
	public static String modid = Reference.modid;
	
	public static Block acu_camo_block;
	
	public static void init() {
		acu_camo_block = new BlockAcuCamo(Material.cloth).setUnlocalizedName("acu_camo_block");
		
	}
	
	public static void register() {
		GameRegistry.registerBlock(acu_camo_block, acu_camo_block.getUnlocalizedName().substring(5));
		
	}
	
	public static void registerRenders() {
		registerRender(acu_camo_block);
		
	}
	
	public static void registerRender(Block block) {
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		
	}

}
