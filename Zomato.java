class Zomato{

	
	public static double takeOrder(String foodName ){
	
		if(foodName == "Margherita Pizza"){
			Zav System.out.println("The price of "+foodName);	
			return 199.0;		
		}
		
		if(foodName == "Sweet Corn And Onion Pizza"){
			System.out.println("The price of "+foodName);
			return 299.00;
		}
		
		if(foodName == "Grilled Vegetable Delight Pizza"){	
			System.out.println("The price of "+foodName);
		return 309.55;
		}
		
		
		if(foodName == "Mushroom Artichokes Pizza"){	
			System.out.println("The price of "+foodName);		
		return 399.00;
		}	
		
		if(foodName == "Smoked Chicken Pizza"){
			System.out.println("The price of "+foodName);
		return 359.00;
		}
		
		if(foodName == "Pepperoni Pizza") {
			System.out.println("The price of "+foodName);
		return 369.00;
		}
		
		if(foodName == "Calabrese Original") {
			System.out.println("The price of "+foodName);
		return 425.00;
		}
		
		if(foodName == "Calabrese Chicken") {
			System.out.println("The price of "+foodName);
		return 460.00;
		}
		
		if(foodName == "Tomato Basil Pesto Pizza") {
			System.out.println("The price of "+foodName);
		return 370.00;
		}
		
		if(foodName == "SOHO Pizza") {
			System.out.println("The price of "+foodName);
		return 190.00;
		}
		
		if(foodName == "American Hottest Pizza - Spicy Pepperoni") {
			System.out.println("The price of "+foodName);
		return 725.00;
		}
		
		if(foodName == "Crispy corn chilli pepper") {
			System.out.println("The price of "+foodName);
		return 150.00;
		}
		
		if(foodName == "Padrino Pizza") {
			System.out.println("The price of "+foodName);
		return 330.00;
		}
		
	    if(foodName == "Spicy Grilled Chicken Pizza") {
			System.out.println("The price of "+foodName);
		return 459.00;
		}
		
		if(foodName == "Spicy Paneer Burger Salad Wrap") {
			System.out.println("The price of "+foodName);
		return 225.00;
		}
		
		if(foodName == "Combo Of 1 Veg And 1 Non-Veg Pizzas") {
			System.out.println("The price of "+foodName);
		return 425.00;
		}
		
		
		
		else{
			System.out.println(foodName + "is not found");
			
		}
		
		return 0.0;
	}

}