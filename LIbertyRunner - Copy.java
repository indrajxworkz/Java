class LibertyRunner{
	
	public static void main(String liberty[]){
		  boolean  shoes  = Liberty.addShoeBrands("Cathos");
			System.out.println(shoes);
			
		   shoes  = Liberty.addShoeBrands("Adidas");
			System.out.println(shoes);
			
			 shoes  = Liberty.addShoeBrands("PUMA");
			System.out.println(shoes);
			
			shoes  = Liberty.addShoeBrands("Skechers");
			System.out.println(shoes);
			
			shoes  = Liberty.addShoeBrands("Nike");
			System.out.println(shoes);
			
			shoes  = Liberty.addShoeBrands("Reebok");
			System.out.println(shoes);
			
			shoes  = Liberty.addShoeBrands("Bata");
			System.out.println(shoes);
			
			shoes  = Liberty.addShoeBrands("Converse");
			System.out.println(shoes);
			
			shoes  = Liberty.addShoeBrands("Fila");
			System.out.println(shoes);
			
			shoes  = Liberty.addShoeBrands("Vans");
			System.out.println(shoes);
			
			shoes  = Liberty.addShoeBrands("Woodland");
			System.out.println(shoes);
			
			shoes  = Liberty.addShoeBrands("New Balance");
			System.out.println(shoes);
			
			shoes  = Liberty.addShoeBrands("Red tape");
			System.out.println(shoes);
			
			shoes  = Liberty.addShoeBrands("cole haan ");
			System.out.println(shoes);
			
			shoes  = Liberty.addShoeBrands("Columbia");
			System.out.println(shoes);
			
			  
			  Liberty.getAllShoeBrands();
			  
		boolean shoe =  Liberty.updateShoeBrand("PUMA","Crocs");
			System.out.println(shoe);
			  
			  
			 Liberty.getAllShoeBrands();
			 Liberty.deleteMaterialName("Crocs");
			 Liberty.getAllShoeBrands();
			 
			  
			 
}
	
}