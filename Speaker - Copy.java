class Speaker{
	static boolean btConnected = true;
	public static void btConnected(){
	
	System.out.println("btConnected started");
	if(btConnected == false){
		btConnected = true;
	System.out.println("Connection Established");
	
	}
	else 
		System.out.println("Connection not Established");
	}

}