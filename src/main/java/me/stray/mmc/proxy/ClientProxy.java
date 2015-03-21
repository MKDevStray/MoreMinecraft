package me.stray.mmc.proxy;

import me.stray.mmc.init.Blocks;
import me.stray.mmc.init.Items;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenders() {
		Items.registerRenders();
		Blocks.registerRenders();
		
	}

}
