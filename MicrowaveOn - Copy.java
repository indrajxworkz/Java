class MicrowaveOn {
	static boolean timerOn = true;
	
	public static void timerOn(){
	System.out.println("Timer Started");
	if (timerOn == false){
		timerOn = true;
	System.out.println("The timer is ON ");
	
	}
	else 
		System.out.println("The Timer is Off");
	}
	
	

}