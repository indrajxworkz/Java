class Zepto{

	
	public static double takeOrder(String foodName ){
	
		if(foodName == "Chilli cheese toast"){
			System.out.println("The price of "+foodName);	
			return 125.00;		
		}
		
		if(foodName == "Rasmalai"){
			System.out.println("The price of "+foodName);
			return 95.00;
		}
		
		if(foodName == "Bread toast"){	
			System.out.println("The price of "+foodName);
		return 100.55;
		}
		
		
		if(foodName == "cheese toast"){	
			System.out.println("The price of "+foodName);		
		return 155.00;
		}	
		
		if(foodName == "Garlic bread"){
			System.out.println("The price of "+foodName);
		return 145.00;
		}
		
		if(foodName == "Shahi tukda") {
			System.out.println("The price of "+foodName);
		return 89.00;
		}
		
		if(foodName == "Four Cheese pizza") {
			System.out.println("The price of "+foodName);
		return 240.00;
		}
		
		if(foodName == "jamun") {
			System.out.println("The price of "+foodName);
		return 79.00;
		}
		
		if(foodName == "Allo parota") {
			System.out.println("The price of "+foodName);
		return 239.00;
		}
		
		if(foodName == "Garlic pesto pizza") {
			System.out.println("The price of "+foodName);
		return 166.00;
		}
		
		if(foodName == "Butterscotch toast combo") {
			System.out.println("The price of "+foodName);
		return 188.00;
		}
		
		if(foodName == "Garlic bread cheese dip") {
			System.out.println("The price of "+foodName);
		return 125.00;
		}
		
		if(foodName == "PLain maggi") {
			System.out.println("The price of "+foodName);
		return 79.00;
		}
		
	    if(foodName == "cheese maggi") {
			System.out.println("The price of "+foodName);
		return 99.00;
		}
		
		if(foodName == "Egg maggi") {
			System.out.println("The price of "+foodName);
		return 100.00;
		}
		
		if(foodName == "samosa") {
			System.out.println("The price of "+foodName);
		return 50.00;
		}
		
		
		
		else{
			System.out.println(foodName + "is not found");
			
		}
		
		return 0.0;
	}

}


