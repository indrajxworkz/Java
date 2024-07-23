class Shampoo {
    String brandName;
    int qty;
    int id;
    String type;
    double price;
    String mfgDate;
    String expDate;
	
	public Shampoo(){
		System.out.println("Shampoo object is created")
	}

    public Shampoo(String brandName, int qty, int id, String type, double price, String mfgDate, String expDate) {
        this.brandName = brandName;
        this.qty = qty;
        this.id = id;
        this.type = type;
        this.price = price;
        this.mfgDate = mfgDate;
        this.expDate = expDate;
    }

    public void displayDetails() {
        System.out.println("Brand Name: " + this.brandName);
        System.out.println("Quantity: " + this.qty + "ml");
        System.out.println("ID: " + this.id);
        System.out.println("Type: " + this.type);
        System.out.println("Price: $" + this.price);
        System.out.println("Manufacturing Date: " + this.mfgDate);
        System.out.println("Expiry Date: " + this.expDate);
    }
}