package net.minecraft.src;
//hi!
public class BPM extends FCAddOn
{
	

/**
 * @author EpicAaron29 (aaron on the discord)
 *
 */

	public static BPM instance = new BPM();
	
    private BPM() 
    {
        super("uwu~ you play BTW???", ";)", "");
    }

	@Override
	public void Initialize() 
	{
		
		FCAddOnHandler.LogMessage(this.getName() + " Version " + this.getVersionString() + " Getting Excited!!!");
		
    	BPMDefinitions.addDefinitions();
    	BPMRecipes.addRecipes();
		
    	FCAddOnHandler.LogMessage(this.getName() + " uwu~ you play BTW???");

	}

	public String GetLanguageFilePrefix()
	{
		return "SuperBTW";
	}

}