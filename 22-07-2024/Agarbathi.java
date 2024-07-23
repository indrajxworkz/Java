class Agarbathi{


	String brandName;
	int noOfSticks;
	int id;
	String type;
	double price;
	

	public  Agarbathi(){
		System.out.println("pooja for god");
	
	}
	
	public  Agarbathi(String brandName, int noOfSticks, int id, String type, double price){
		this.brandName = brandName;
		this.noOfSticks = noOfSticks;
		this.id = id;
		this.type = type;
		this.price = price;
	}


	public void getAgarbathi(){
		System.out.println("the BrandName        : " + this.brandName);
		System.out.println("the Quantity         : " + this.noOfSticks);
		System.out.println("the ID               : " + this.id);
		System.out.println("the Type             : " + this.type);
		System.out.println("the Amount           : " + this.price);
		
	}
}