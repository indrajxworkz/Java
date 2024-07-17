class MixerOn {
	static boolean screenOn = true;
	
	public static void mixOn(){
	System.out.println("mixOn Started");
	if (screenOn == false){
		screenOn = true;
	System.out.println("The Mixer is ON ");
	
	}
	else 
		System.out.println("The Mixer is Off");
	}
	
	

}