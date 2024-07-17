class AirConditoner {
		
		static boolean isConnected = true;
		
		
		public static void onOrOff(){
			System.out.println("ON or OFF started");
			if(isConnected == false){
			
			isConnected = true ;
			System.out.println("Air Conditioner is turned On");
			}else if(isConnected == true){
			
			isConnected = false;
			System.out.println("Air Conditioner Turned Off");
			}
		System.out.println("ON or OFF Ended");
		return;
		}
			
			


}