class TvOff {
	static boolean screenOff = true;
	
	public static void screenOff(){
	System.out.println("TV Started");
	if (screenOff == false){
		screenOff = true;
	System.out.println("The TV is OFF");
	
	}
	else 
		System.out.println("The TV is ON");
	}
	
	

}