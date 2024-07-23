class SunGlasses {
    String name;
    String type;
    int glassId;
    int price;
    boolean sighted;

	public SunGlasses(){
		System.out.println("SunGlasses object is created");
	}
	
	
    public SunGlasses(String name, String type, int glassId, int price, boolean sighted) {
        this.name = name;
        this.type = type;
        this.glassId = glassId;
        this.price = price;
        this.sighted = sighted;
    }

    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Type: " + this.type);
        System.out.println("Glass ID: " + this.glassId);
        System.out.println("Price: " + this.price);
        System.out.println("Sighted: " + this.sighted);
    }
}
