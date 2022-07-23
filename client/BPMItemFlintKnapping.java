package net.minecraft.src;

public class BPMItemFlintKnapping extends Item 
{

	public BPMItemFlintKnapping(int iItemID)
	{
		super(iItemID);
	    
		setUnlocalizedName( "SuperBTWItemFlintKnapping" );  

	    maxStackSize = 1;
	 
	    this.setMaxDamage(10); //amount of hits required
	}
	

    public int getMaxItemUseDuration(ItemStack par1ItemStack)
    {
    	//same as bow, not sure what this does... but it is essential!
        return 72000; 
    }
	
	public ItemStack onItemRightClick( ItemStack stack, World world, EntityPlayer player )
    {
    	player.setItemInUse( stack, getMaxItemUseDuration( stack ) );
    	
    	
    	return stack;
    }
	
    public EnumAction getItemUseAction(ItemStack par1ItemStack)
    {
        return EnumAction.bow;
    }
    
    public void onPlayerStoppedUsing( ItemStack itemStack, World world, EntityPlayer player, int iTicksInUseRemaining )
    {	
    	if (itemStack.getTagCompound() == null)
    	{
    		NBTTagCompound newTag = new NBTTagCompound();
    		itemStack.setTagCompound(newTag);
    		itemStack.getTagCompound().setInteger("badHits", 0);
    	}
    	int badHits = itemStack.getTagCompound().getInteger("badHits");
    	
    	int var6 = this.getMaxItemUseDuration(itemStack) - iTicksInUseRemaining;
    	
    	if (var6 < 4)
    	{
    		return;
    	}
    	
    	if (var6 < 20 || var6 > 35)
        {
        	badHits++;
        	
        	player.playSound( "random.bow", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F );
        	
        	itemStack.getTagCompound().setInteger("badHits", badHits);
            
            if (badHits > 3)
            {
        		itemStack.damageItem( 11, player );
        		FCUtilsItem.GivePlayerStackOrEject( player, new ItemStack(FCBetterThanWolves.fcItemStone, 1));
        		//if knapping breaks, you get stone back!
        		player.inventory.mainInventory[player.inventory.currentItem] = new ItemStack( FCBetterThanWolves.fcItemStone, 1);
            }
        }
    	else if (var6 > 20)
    	{
    		itemStack.damageItem( -1, player);
    		player.playSound( "fire.ignite", 1.0F, itemRand.nextFloat() * 0.4F + 0.8F );
    		if (itemStack.getItemDamage() <= 0)
    		{
        		FCUtilsItem.GivePlayerStackOrEject( player, new ItemStack(FCBetterThanWolves.fcItemStone, 1));
        		itemStack.damageItem( 11, player );
        		player.inventory.mainInventory[player.inventory.currentItem] = new ItemStack( BPMDefinitions.flintKnife, 1);
    		}
    	}
    	
    	
    	
    }
    
}
