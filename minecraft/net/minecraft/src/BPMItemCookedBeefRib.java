package net.minecraft.src;

public class BPMItemCookedBeefRib extends ItemFood 
{
	
	public BPMItemCookedBeefRib (int iItemID) 
	{
		super (iItemID, /*NORMAL VALUE IS 6*/-9, 0.25F, false, false);
		
    	SetIncineratedInCrucible();
    	setUnlocalizedName( "SuperBTWItemCookedCowRib" );
    	
    	maxStackSize = 1;
    	
    	this.setCreativeTab(CreativeTabs.tabFood);
		
	}
	
    public ItemStack onEaten(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        --par1ItemStack.stackSize;
        par3EntityPlayer.getFoodStats().addStats(this);
        par2World.playSoundAtEntity(par3EntityPlayer, "random.burp", 0.5F, par2World.rand.nextFloat() * 0.1F + 0.9F);
        this.onFoodEaten(par1ItemStack, par2World, par3EntityPlayer);
        
        return par1ItemStack;
        //return new ItemStack( SuperBTWDefinitions.cookedCowRibPartial, 1);
    }

}
