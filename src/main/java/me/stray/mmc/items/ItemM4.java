package me.stray.mmc.items;

import me.stray.mmc.MoreMinecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemM4 extends Item {
	
	public ItemM4() {
		this.setCreativeTab(MoreMinecraft.tabWeapons);
		this.setMaxStackSize(1);
		this.setFull3D();
	}
	
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{


		//if(par3EntityPlayer.inventory.hasItem(ModMain.bullet)) {
			//if(par1ItemStack.getItemDamage() == 0) {
			//par1ItemStack.damageItem(59, par3EntityPlayer);
				
//			Entity entity = new EntityItem(par2World, par3EntityPlayer.posX + 0.3F, par3EntityPlayer.posY, par3EntityPlayer.posZ, new ItemStack(ModMain.bulletCasing));
			//par2World.spawnEntityInWorld(entity);
			//if(!par3EntityPlayer.capabilities.isCreativeMode) {
			//	par3EntityPlayer.inventory.consumeInventoryItem(ModMain.bullet);
			//}
			par2World.playSoundAtEntity(par3EntityPlayer, "mmc:m4shoot", 0.5F, 1.0F);
			//if (!par2World.isRemote)
			//{
			//	par2World.spawnEntityInWorld(new EntityBullet(par2World, par3EntityPlayer));


				//  retrn par1ItemStack;
			//}
			//}
		//}
		//else if(par3EntityPlayer instanceof EntityPlayer) {
			//par2World.playSoundAtEntity(par3EntityPlayer, "mi:noammo", 0.7F, 1.0F);
	//	}
		return par1ItemStack;
	}

}
