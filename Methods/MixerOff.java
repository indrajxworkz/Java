class MixerOff {
	static boolean mixerOff = true;
	
	public static void mixerOff(){
	System.out.println("mixerOff Started");
	if (mixerOff == false){
		mixerOff = true;
	System.out.println("The Mixer is OFF");
	
	}
	else 
		System.out.println("The Mixer is ON");
	}
	
	

}