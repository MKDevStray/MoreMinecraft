package me.stray.mmc;

import me.stray.mmc.init.Items;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MMCTab extends CreativeTabs {

	public MMCTab(String label) {
		super(label);
		this.setBackgroundImageName("weapons.png");
		
	}

	@Override
	public Item getTabIconItem() {
		
		return Items.m4a1;
	}

}
