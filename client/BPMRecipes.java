package net.minecraft.src;

public class BPMRecipes extends FCRecipes
{
	public static final BPMRecipes instance = new BPMRecipes();
	
	private BPMRecipes() 
	{
	}

	private static final int m_iIgnoreMetadata = FCUtilsInventory.m_iIgnoreMetadata;

	public static void addRecipes() 
	{
		addFoodRecipes();
		addToolRecipes();
		addBlockRecipes();
	}
	
	public static void addToolRecipes() 
	{
		CraftingManager.getInstance().getRecipeList().add( new BPMRecipesLeatherCutting() );
		
		FCRecipes.AddShapelessRecipe(
				new ItemStack(BPMDefinitions.flintKnapping, 1,
				/* this number must match the value within GetProgressiveCraftingMaxDamage */10),
				new ItemStack[] { new ItemStack(Item.flint), new ItemStack(FCBetterThanWolves.fcItemStone) });
		
		FCRecipes.AddShapelessRecipe(new ItemStack(BPMDefinitions.bonePickaxe, 1), new ItemStack[] {
				new ItemStack(BPMDefinitions.rib), new ItemStack(Item.silk), new ItemStack(Item.stick) });
		FCRecipes.AddShapelessRecipe(new ItemStack(BPMDefinitions.bonePickaxe, 1),
				new ItemStack[] { new ItemStack(BPMDefinitions.rib),
						new ItemStack(FCBetterThanWolves.fcItemHempFibers), new ItemStack(Item.stick) });
		
		AddRecipe(new ItemStack(BPMDefinitions.stoneHoeNew, 1),
				new Object[] { "XI", "SI", " I", Character.valueOf('X'), FCBetterThanWolves.fcItemStone,
						Character.valueOf('I'), Item.stick, Character.valueOf('S'), Item.silk, });
		AddRecipe(new ItemStack(BPMDefinitions.stoneHoeNew, 1),
				new Object[] { "IX", "IS", "I ", Character.valueOf('X'), FCBetterThanWolves.fcItemStone,
						Character.valueOf('I'), Item.stick, Character.valueOf('S'), Item.silk, });
		AddRecipe(new ItemStack(BPMDefinitions.stoneHoeNew, 1),
				new Object[] { "XI ", " IS", " I ", Character.valueOf('X'), FCBetterThanWolves.fcItemStone,
						Character.valueOf('I'), Item.stick, Character.valueOf('S'), Item.silk, });
		AddRecipe(new ItemStack(BPMDefinitions.stoneHoeNew, 1),
				new Object[] { " IX", "SI ", " I ", Character.valueOf('X'), FCBetterThanWolves.fcItemStone,
						Character.valueOf('I'), Item.stick, Character.valueOf('S'), Item.silk, });
		AddRecipe(new ItemStack(BPMDefinitions.stoneHoeNew, 1),
				new Object[] { "XIS", " I ", " I ", Character.valueOf('X'), FCBetterThanWolves.fcItemStone,
						Character.valueOf('I'), Item.stick, Character.valueOf('S'), Item.silk, });
		
		FCRecipes.AddShapelessRecipe(new ItemStack(Item.plateLeather, 1),
				new ItemStack[] { new ItemStack(FCBetterThanWolves.fcItemLeatherCut),
						new ItemStack(FCBetterThanWolves.fcItemLeatherCut),
						new ItemStack(FCBetterThanWolves.fcItemLeatherCut),
						new ItemStack(FCBetterThanWolves.fcItemLeatherCut) });
		FCRecipes.AddShapelessRecipe(new ItemStack(Item.legsLeather, 1),
				new ItemStack[] { new ItemStack(FCBetterThanWolves.fcItemLeatherCut),
						new ItemStack(FCBetterThanWolves.fcItemLeatherCut),
						new ItemStack(FCBetterThanWolves.fcItemLeatherCut) });
		FCRecipes.AddShapelessRecipe(new ItemStack(Item.bootsLeather, 1),
				new ItemStack[] { new ItemStack(FCBetterThanWolves.fcItemLeatherCut),
						new ItemStack(FCBetterThanWolves.fcItemLeatherCut) });
		FCRecipes.AddShapelessRecipe(new ItemStack(Item.helmetLeather, 1),
				new ItemStack[] { new ItemStack(FCBetterThanWolves.fcItemLeatherCut) });
		
		FCRecipes.AddShapelessRecipe(new ItemStack(FCBetterThanWolves.fcItemArmorTannedChest, 1),
				new ItemStack[] { new ItemStack(FCBetterThanWolves.fcItemTannedLeatherCut),
						new ItemStack(FCBetterThanWolves.fcItemTannedLeatherCut),
						new ItemStack(FCBetterThanWolves.fcItemTannedLeatherCut),
						new ItemStack(FCBetterThanWolves.fcItemTannedLeatherCut) });	
		FCRecipes.AddShapelessRecipe(new ItemStack(FCBetterThanWolves.fcItemArmorTannedLeggings, 1),
				new ItemStack[] { new ItemStack(FCBetterThanWolves.fcItemTannedLeatherCut),
						new ItemStack(FCBetterThanWolves.fcItemTannedLeatherCut),
						new ItemStack(FCBetterThanWolves.fcItemTannedLeatherCut) });
		FCRecipes.AddShapelessRecipe(new ItemStack(FCBetterThanWolves.fcItemArmorTannedBoots, 1),
				new ItemStack[] { new ItemStack(FCBetterThanWolves.fcItemTannedLeatherCut),
						new ItemStack(FCBetterThanWolves.fcItemTannedLeatherCut) });
		FCRecipes.AddShapelessRecipe(new ItemStack(FCBetterThanWolves.fcItemArmorTannedHelm, 1),
				new ItemStack[] { new ItemStack(FCBetterThanWolves.fcItemTannedLeatherCut) });
		
		
		
	}
	
	public static void addFoodRecipes()
	{
		FurnaceRecipes.smelting().addSmelting(BPMDefinitions.beefRib.itemID,
				new ItemStack(BPMDefinitions.cookedBeefRib), 0);
		
		AddCauldronRecipe(new ItemStack(BPMDefinitions.cookedBeefRib, 1),
				new ItemStack[] { new ItemStack(BPMDefinitions.beefRib, 1), });
		
	}
	
	public static void addBlockRecipes() 
	{
		AddRecipe(new ItemStack(FCBetterThanWolves.fcBlockWorkbench, 1), new Object[] // ITS BACK BABY
		{ "###", "#X#", "###", '#', Block.planks, 'X', Item.ingotIron });
	}
	
	
}
