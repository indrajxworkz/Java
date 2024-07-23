class Pen {
    String name;
    double price;
    String color;
    int id;

    public Pen() {
        System.out.println("Pen object is created");
    }

    public Pen(String name, double price, String color, int id) {
        this.name = name;
        this.price = price;
        this.color = color;
        this.id = id;
    }

    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Price: " + this.price);
        System.out.println("Color: " + this.color);
        System.out.println("ID: " + this.id);
    }
}
