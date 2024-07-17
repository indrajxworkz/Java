class BrandShopRunner{

	public static void main(String brand[]){
		  boolean  wine  = BrandShop.addWineBrands("Fratelli");
			System.out.println(wine);
			
		    wine  = BrandShop.addWineBrands("Fratelli");
			System.out.println(wine);
			
			 wine  = BrandShop.addWineBrands("charosa");
			System.out.println(wine);
			
			wine  = BrandShop.addWineBrands("dia");
			System.out.println(wine);
			
			wine  = BrandShop.addWineBrands("red wine");
			System.out.println(wine);
			
			wine  = BrandShop.addWineBrands("blue wine");
			System.out.println(wine);
			
			wine  = BrandShop.addWineBrands("sula");
			System.out.println(wine);
			
			wine  = BrandShop.addWineBrands("york");
			System.out.println(wine);
			
			wine  = BrandShop.addWineBrands("Barefoot");
			System.out.println(wine);
			
			wine  = BrandShop.addWineBrands("bi banayan");
			System.out.println(wine);
			
			wine  = BrandShop.addWineBrands("manshion house");
			System.out.println(wine);
			
			wine  = BrandShop.addWineBrands("millor");
			System.out.println(wine);
			
			wine  = BrandShop.addWineBrands("Signature");
			System.out.println(wine);
			
			wine  = BrandShop.addWineBrands("Mordivi");
			System.out.println(wine);
			
			wine  = BrandShop.addWineBrands("rasa wine");
			System.out.println(wine);
			
			  
			  BrandShop.getAllBrands();
			  
		boolean wines =  BrandShop.updateWineBrand("millor","90 ml");
			System.out.println(wines);
  
			  BrandShop.getAllBrands();
			
	boolean winess =  BrandShop.deleteBrandName("90 ml");
			System.out.println(winess);			
			 
			  BrandShop.getAllBrands();
	
	}




}