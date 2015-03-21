package me.stray.mmc.init;

import me.stray.mmc.Reference;
import me.stray.mmc.items.ItemM4;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Items {
	
	public static final String modid = Reference.modid;
	
	public static Item m4a1;
	
	
	
	public static void init() {
		m4a1 = new ItemM4().setUnlocalizedName("m4a1");
		
	}
	
	public static void register() {
		GameRegistry.registerItem(m4a1, m4a1.getUnlocalizedName().substring(5));
		
	}
	
	public static void registerRenders() {
		registerRender(m4a1);
		
	}
	
	public static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		
	}

}
