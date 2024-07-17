class TextilesRunner{
	
	public static void main(String testiles[]){
		
		  boolean  cloth  = Textiles.addMaterial("Fratelli");
			System.out.println(cloth);
			
		   cloth  = Textiles.addMaterial("Damask");
			System.out.println(cloth);
			
			cloth  = Textiles.addMaterial("Woodland");
			System.out.println(cloth);
			
			cloth  = Textiles.addMaterial("Garbardine");
			System.out.println(cloth);
			
			cloth  = Textiles.addMaterial("Denim");
			System.out.println(cloth);
			
			cloth  = Textiles.addMaterial("Velvet");
			System.out.println(cloth);
			
			cloth  = Textiles.addMaterial("Chiffon");
			System.out.println(cloth);
			
			cloth  = Textiles.addMaterial("Poplin");
			System.out.println(cloth);
			
			cloth  = Textiles.addMaterial("Brocade");
			System.out.println(cloth);
			
			cloth  = Textiles.addMaterial("Cheviot");
			System.out.println(cloth);
			
			cloth  = Textiles.addMaterial("Tweed");
			System.out.println(cloth);
			
			cloth  = Textiles.addMaterial("Taffeta");
			System.out.println(cloth);
			
			cloth  = Textiles.addMaterial("Muslin");
			System.out.println(cloth);
			
			cloth  = Textiles.addMaterial("Flannel");
			System.out.println(cloth);
			
			
			
			  
			  Textiles.getAllmaterialNames();
			  
		boolean cloths =  Textiles.updatematerialName ("Muslin","Sotch");
			System.out.println(cloths);
			  
			  
			 Textiles.getAllmaterialNames();
			 
		 Textiles.deleteMaterialName("Velvet");
			
		 
		Textiles.getAllmaterialNames();
			  
			 
}

}