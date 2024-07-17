 public static void increaseTemperature(){
				 System.out.println("increaseTemperature() started");
			if(isConnected == true){	       
				 if(currentTemperature <= maxTemperature){
					    currentTemperature= currentTemperature+1 ;
				System.out.println("The current temperature is "+ currentTemperature);		
				}else{
						System.out.println("Max Temperature Reached");
					 } 
			}else{
				System.out.println("Gubee... Ac na On Maadu....");
			}
				 	 System.out.println("increaseTemperature() ended");
				 return ;
				 }
	   