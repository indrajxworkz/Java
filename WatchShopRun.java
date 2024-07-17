class WatchShopRun{

	public static void main(String[] args){
	
	boolean isAdded = WatchShop.createWatchName("Rolex");
	System.out.println("The Chat added is :  " + isAdded);
	//boolean priceAdded =Watch.addWatchPrice(400000.0);
	//System.out.println("The Price of Rolex is : "+priceAdded );
	
	isAdded = WatchShop.createWatchName("G-Shock");
	System.out.println("The Chat added is :  " + isAdded);
	// priceAdded =Watch.addWatchPrice(80000.0);
	//System.out.println("The Price of G-Shock  is : "+priceAdded );
	
	
	isAdded = WatchShop.createWatchName("Casio");
	System.out.println("The Chat added is :  " + isAdded);
	//priceAdded =Watch.addWatchPrice(500000.0);
	//System.out.println("The Price of Casio is : "+priceAdded );
	
	
	isAdded = WatchShop.createWatchName("Sonata");
	System.out.println("The Chat added is :  " + isAdded);
	//priceAdded =Watch.addWatchPrice(480000.0);
	//System.out.println("The Price of Sonata is : "+priceAdded );
	
	
	isAdded = WatchShop.createWatchName("Rado");
	System.out.println("The Chat added is :  " + isAdded);
	//priceAdded =Watch.addWatchPrice(20000.0);
	//System.out.println("The Price of Rado is : "+priceAdded );
	
	
	
	isAdded = WatchShop.createWatchName("Bugati");
	System.out.println("The Chat added is :  " + isAdded);
	//priceAdded =Watch.addWatchPrice(40.0);
	//System.out.println("The Price of Bugati is : "+priceAdded );
	

	isAdded = WatchShop.createWatchName("Fast - Track");
	System.out.println("The Chat added is :  " + isAdded);
	//priceAdded =Watch.addWatchPrice(40.0);
	//System.out.println("The Price of Fast - Track is : "+priceAdded );
	
	
	WatchShop.getWatchNames();
	
	
	boolean Update = WatchShop.updateWatchName( "Fast - Track","Fossil" );
	System.out.println(Update);
	
	



	WatchShop.getWatchNames();
	
	WatchShop.deleteWatchName("Fast - Track");
	
	WatchShop.getWatchNames();

	
	}


}