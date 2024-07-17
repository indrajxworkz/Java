class MicrowaveOff {
	static boolean timerOff = true;
	
	public static void  timerOff(){
	System.out.println("Timer ended");
	if (timerOff == false){
		timerOff = true;
	System.out.println("The timer is OFF ");
	
	}
	else 
		System.out.println("The Timer is On");
	return ;
	}
	
	public static void getFeature(){
		String name="Onida";
		int price=43500;
		System.out.println("The name of the Oven is "+ name +" and the Price is "+ price);
		}

}