class Swiggy{

	//static String foodName  ;
 
	//ClassName.methodName
	
	public static double takeOrder(String foodName ){
	
		if(foodName == "Just Poori's"){
			System.out.println("The price of "+foodName);	
			return 99.0;		
		}
		
		if(foodName == "Full Rice Meal Thali"){
			System.out.println("The price of "+foodName);
			return 159.00;
		}
		
		if(foodName == "Mouth Watering Delicious Gulab Jamun("){	
			System.out.println("The price of "+foodName);
		return 78.55;
		}
		
		
		if(foodName == "Hot Badami Malai Milk"){	
			System.out.println("The price of "+foodName);		
		return 20.00;
		}	
		
		if(foodName == "Plain Dosa"){
			System.out.println("The price of "+foodName);
		return 59.00;
		}
		
		if(foodName == "Benne Masala Dosa 1 Pcs") {
			System.out.println("The price of "+foodName);
		return 69.00;
		}
		
		if(foodName == "Maharaja Combo Thali") {
			System.out.println("The price of "+foodName);
		return 200.00;
		}
		
		if(foodName == "Bhindi Dry Wali Thali") {
			System.out.println("The price of "+foodName);
		return 128.00;
		}
		
		if(foodName == "Yummylicious Aloo Tamatar Dry Masala Sabzi") {
			System.out.println("The price of "+foodName);
		return 118.00;
		}
		
		if(foodName == "Phulka's With Ghee") {
			System.out.println("The price of "+foodName);
		return 58.00;
		}
		
		if(foodName == "North Indian Combo Thali") {
			System.out.println("The price of "+foodName);
		return 160.00;
		}
		
		if(foodName == "Mast Aloo Paratha's ") {
			System.out.println("The price of "+foodName);
		return 118.00;
		}
		
		if(foodName == "Corn capsicum curry") {
			System.out.println("The price of "+foodName);
		return 110.00;
		}
		
	    if(foodName == "Plain Ghee Rice With Dal") {
			System.out.println("The price of "+foodName);
		return 118.00;
		}
		
		if(foodName == "Lucknow Express Wali Thali") {
			System.out.println("The price of "+foodName);
		return 218.00;
		}
		
		if(foodName == "Fried rice") {
			System.out.println("The price of "+foodName);
		return 150.00;
		}
		
		
		
		else{
			System.out.println(foodName + "is not found");
			
		}
		
		return 0.0;
	}

}


