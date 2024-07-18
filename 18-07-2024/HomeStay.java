class HomeStay {
    int areaInSft;
    String propertyName;
    String ownerName;
    int noOfRooms;

    public HomeStay(int areaInSft, String propertyName, String ownerName, int noOfRooms) {
        this.areaInSft = areaInSft;
        this.propertyName = propertyName;
        this.ownerName = ownerName;
        this.noOfRooms = noOfRooms;
    }

    public void enjoy() {
        System.out.println("Welcome to " + propertyName);
        System.out.println("Managed by " + ownerName);
        System.out.println("This homestay has " + noOfRooms + " rooms");
        System.out.println("It covers an area of " + areaInSft + " square feet");
        System.out.println("Enjoy your stay!");
    }
}
