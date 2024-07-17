class GoldShopRun{

	public static void main(String[] args){
	
	boolean isAdded = GoldShop.createGoldName("Necklace");
	System.out.println("The Chat added is :  " + isAdded);
	boolean priceAdded =GoldShop.addGoldPrice(400000.0);
	System.out.println("The Price of Necklace is : "+priceAdded );
	
	isAdded = GoldShop.createGoldName("Bracelet");
	System.out.println("The Chat added is :  " + isAdded);
	 priceAdded =GoldShop.addGoldPrice(80000.0);
	System.out.println("The Price of Bracelet  is : "+priceAdded );
	
	
	isAdded = GoldShop.createGoldName("Daimond Ring");
	System.out.println("The Chat added is :  " + isAdded);
	priceAdded =GoldShop.addGoldPrice(500000.0);
	System.out.println("The Price of Daimond Ring is : "+priceAdded );
	
	
	isAdded = GoldShop.createGoldName("Dabu");
	System.out.println("The Chat added is :  " + isAdded);
	priceAdded =GoldShop.addGoldPrice(480000.0);
	System.out.println("The Price of Dabu is : "+priceAdded );
	
	
	isAdded = GoldShop.createGoldName("Bangles");
	System.out.println("The Chat added is :  " + isAdded);
	priceAdded =GoldShop.addGoldPrice(20000.0);
	System.out.println("The Price of Bhel Puri is : "+priceAdded );
	
	
	
	isAdded = GoldShop.createGoldName("Gold Chain");
	System.out.println("The Chat added is :  " + isAdded);
	priceAdded =GoldShop.addGoldPrice(40.0);
	System.out.println("The Price of Gold Chain is : "+priceAdded );
	

	isAdded = GoldShop.createGoldName("Shoulder Bracelets");
	System.out.println("The Chat added is :  " + isAdded);
	priceAdded =GoldShop.addGoldPrice(40.0);
	System.out.println("The Price of Gold Chain is : "+priceAdded );
	
	
	GoldShop.getGoldNames();
	
	
	boolean goldUpdate = GoldShop.updateGoldName( "Gold Chain","Ear - Rings" );
	System.out.println(goldUpdate);



	GoldShop.getGoldNames();

	boolean delete = GoldShop.deleteGoldItem("papidi");
	System.out.println(delete);
	GoldShop.getGoldNames();
	
	}


}