class Volume{
	static int cuurentVolume;
	static int minVolume;
	static int maxVolume = 10;
	static boolean btConnected = true;
	static boolean btNotConnected = true;
	public static void increaseVolume(){
		System.out.println("increaseVolume started");
		 if(btConnected == false){
		btConnected = true;
			if(cuurentVolume < maxVolume){ //1
				cuurentVolume = cuurentVolume+1;
			System.out.println("The current volume is "+ cuurentVolume);
			}
		 }
			else{
				System.out.println("Maximum Volume");
				}
		
	System.out.println("increaseVolume ended");
	}

	public static void decreaseVolume(){
		System.out.println("decreaseVolume started");
		if(btNotConnected == false){
		btNotConnected = true;
			if(cuurentVolume > minVolume){
				cuurentVolume = cuurentVolume-1;
			System.out.println("The current volume is "+ cuurentVolume);
			}
		}
			else{
				System.out.println("Minimum Volume");
				}
		
	System.out.println("decreaseVolume ended");
	}
     
}