class Resort {
    String name;
    String type;
    int stayId;
    int price;
    int noOfRooms;
    boolean pool;
	
	public Resort(){
		System.out.println("Resort object is created");
	}

    public Resort(String name, String type, int stayId, int price, int noOfRooms, boolean pool) {
        this.name = name;
        this.type = type;
        this.stayId = stayId;
        this.price = price;
        this.noOfRooms = noOfRooms;
        this.pool = pool;
    }

    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Type: " + this.type);
        System.out.println("Stay ID: " + this.stayId);
        System.out.println("Price: " + this.price);
        System.out.println("No of Rooms: " + this.noOfRooms);
        System.out.println("Pool: " + this.pool);
    }
}
