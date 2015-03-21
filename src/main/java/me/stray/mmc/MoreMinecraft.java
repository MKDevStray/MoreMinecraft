package me.stray.mmc;

import me.stray.mmc.init.Blocks;
import me.stray.mmc.init.Items;
import me.stray.mmc.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.modid, name = Reference.modname, version = Reference.version)
public class MoreMinecraft {
	
	public static final MMCTab tabWeapons = new MMCTab("tabWeapons");
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Items.init();
		Items.register();
		Blocks.init();
		Blocks.register();
	}
	
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.registerRenders();

	}
	
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}

}
