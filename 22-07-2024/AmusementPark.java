class AmusementPark {
    String name;
    String type;
    int parkId;
    int price;
    int noOfGames;

    public AmusementPark() {
        System.out.println("Creating an Amusement Park");
    }

  
    public AmusementPark(String name, String type, int parkId, int price, int noOfGames) {
        this.name = name;
        this.type = type;
        this.parkId = parkId;
        this.price = price;
        this.noOfGames = noOfGames;
    }

  
    public void Play() {
        System.out.println("Name: " + this.name);
        System.out.println("Type: " + this.type);
        System.out.println("Park ID: " + this.parkId);
        System.out.println("Price: " + this.price);
        System.out.println("Number of Games: " + this.noOfGames);
    }
}