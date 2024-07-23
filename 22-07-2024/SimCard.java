class SimCard {
    String name;
    String plan;
    int id;
	
	public SimCard(){
		System.out.println("SimCard object is created");
	}

    public SimCard(String name, String plan, int id) {
        this.name = name;
        this.plan = plan;
        this.id = id;
    }

    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Plan: " + this.plan);
        System.out.println("ID: " + this.id);
    }
}