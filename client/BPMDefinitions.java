package net.minecraft.src;

public class BPMDefinitions {
	
	private static final int
		id_ironKnife = 20001,
		id_flintKnife = 20002,
		id_bonePickaxe = 20003,
		id_beefRib = 20004,
		id_cookedBeefRib = 20005,
		id_rib = 20006,
		id_deathClub = 20007,
		id_stoneHoeNew = 20008
		;
	
	private static final int
		id_meatCube = 2000
		;
		
	public static Item bonePickaxe;
	public static Item beefRib;
	public static Item cookedBeefRib;
	public static Item rib;
	public static Item stoneHoeNew;
	
	public static void addDefinitions() 
	{
		bonePickaxe = new BPMItemBonePickaxe(id_bonePickaxe - 256);
		beefRib = new BPMItemBeefRib(id_beefRib - 256);
		cookedBeefRib = new BPMItemCookedBeefRib(id_cookedBeefRib - 256);
		rib = new BPMItemRib(id_rib - 256);
		//SET HOE TO BONE!
		stoneHoeNew = ( new FCItemHoe( id_stoneHoeNew, EnumToolMaterial./*BONE*/BONE ) ).setUnlocalizedName( "hoeStone" );
	}
}
