class GoldShopRun{

	public static void main(String[] args){
	
	boolean isAdded = GoldShop.createGoldName("DahiPuri");
	System.out.println("The Chat added is :  " + isAdded);
	boolean priceAdded =GoldShop.createGoldPrice(40.0);
	System.out.println("The Price of Dahi Puri is : "+priceAdded );
	
	isAdded = GoldShop.createGoldName("SevPuri");
	System.out.println("The Chat added is :  " + isAdded);
	 priceAdded =GoldShop.createGoldPrice(40.0);
	System.out.println("The Price of SevPuri  is : "+priceAdded );
	
	
	isAdded = GoldShop.createGoldName("Masala Puri");
	ystem.out.println("The Chat added is :  " + isAdded);
	priceAdded =GoldShop.createGoldPrice(40.0);
	System.out.println("The Price of Masala Puri is : "+priceAdded );
	
	
	isAdded = GoldShop.createGoldName("Pani Puri");
	System.out.println("The Chat added is :  " + isAdded);
	priceAdded =GoldShop.createGoldPrice(40.0);
	System.out.println("The Price of Pani Puri is : "+priceAdded );
	
	
	isAdded = GoldShop.createGoldName("Bhel Puri");
	System.out.println("The Chat added is :  " + isAdded);
	priceAdded =GoldShop.createGoldPrice(40.0);
	System.out.println("The Price of Bhel Puri is : "+priceAdded );
	
	
	isAdded = GoldShop.createGoldName("Aloo tikki Puri");
	System.out.println("The Chat added is :  " + isAdded);
	priceAdded =GoldShop.createGoldPrice(40.0);
	System.out.println("The Price of Aloo tikki Puri is : "+priceAdded );
	
	
	GoldShop.getChatNames();
	
	
	boolean chatUpdate = GoldShop.updateChatName( "Masala Puri","Raj Kachori" );
	System.out.println(chatUpdate);
	GoldShop.getChatNames();
	
	}


}