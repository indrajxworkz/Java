class Garden {
    String name;
    String place;
    int id;

   
    public Garden() {
        System.out.println("Garden is being initialized");
    }

    public Garden(String name, String place, int id) {
        this.name = name;
        this.place = place;
        this.id = id;
    }

    public void gettingFreshAir() {
        System.out.println("Garden Name: " + this.name);
        System.out.println("Location: " + this.place);
        System.out.println("ID: " + this.id);
        System.out.println("Nature fresh ");
    }
}