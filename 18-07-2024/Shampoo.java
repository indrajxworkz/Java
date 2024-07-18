class Shampoo{
			
	String brandName;
	int qty;
	int id;
	String type;
	double price;
	String mfgDate;
	String expDate;
			


		public  boolean createShampoo(String brandName ,int qty, int id, String type, 
				  double price, String mfgDate, String expDate ){
      		
			  boolean isShampooCreated = false;
			   if(brandName != null  && qty > 0 && id > 0 && type != null && price > 0.00 && mfgDate != null && expDate != null ){
			    
				this.brandName = brandName;
				this.qty = qty;
				this.id = id;
				this.type = type;
				this.price = price;
				this.mfgDate = mfgDate;
				this.expDate = expDate;	
				isShampooCreated = true ;
			   }
			   else{
				    System.out.println("Invalid Bill details provided.");
			   }
			  
				
		return isShampooCreated ;
	 }
			   
				
		
	 
	 public void display(){
			
		 System.out.println("Brand name        : " + this.brandName);
		System.out.println("Refernce id        : " + this.id);
		System.out.println("Qunatity           : " + this.qty);
		System.out.println("Type of shampoo    : " + this.type);
		System.out.println("Amount             : " + this.price);
		System.out.println("Manufacture Date   : " + this.mfgDate);
		System.out.println("Expiry Date        : " + this.expDate);
		
		 
	 }



}






	 
	 