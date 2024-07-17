class TvOn {
	static boolean screenOn = true;
	
	public static void screenOn(){
	System.out.println("TV Started");
	if (screenOn == false){
		screenOn = true;
	System.out.println("The TV is ON ");
	
	}
	else 
		System.out.println("The TV is Off");
	}
	
	

}