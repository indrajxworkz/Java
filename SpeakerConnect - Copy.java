class SpeakerConnect{
	static boolean btNotConnected = true;
	
	public static void btNotConnected(){
	
	
	if(btNotConnected == false){
		btNotConnected = true;
	System.out.println("No Connection is Established");
	
	}
	else 
		System.out.println("Connection Established");
		
	System.out.println("btConnected ended");
	}

}