class AirConditioner{
static boolean isConnected=true;




		public static void onOrOff(){
		System.out.println("onOrOff Started");
		if(isConnected==false){
		isConnected=true;
		System.out.println("Airconditioner is on");
		}
		else if(isConnected==true){
		isConnected=false;
		System.out.println("Airconditionaer is off");
		}
		System.out.println("onOff Ended");
		return;
		}
		public static void getFeature(){
		String name="Samsung";
		double prise=53000.0;
		}
		}