package net.minecraft.src;

public class BPMDynamicLightIntegration
{
	private static boolean isDLIntalled = false;
	public static FCAddOn DLMain = null;
	
	public static final String DL = "Hiracho's Dynamic Lighting";
	
	public static void init() {
		try {
			if (FCAddOnHandler.isModInstalled(DL)) {
				DLMain = FCAddOnHandler.getModByName(DL);
			}
			
			if (DLMain != null) {
				isDLIntalled = true;
			}
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}
	
	public static boolean isDLInstalled() {
		return isDLIntalled;
	}

}