class Garden{

   String name;
   String place;
   int id;

    public Garden(int id, String name, String place) {
        this.id = id;
        this.name = name;
        this.place = place;
       
    }

    public void display() {
        System.out.println("ID                    : " + id);
        System.out.println("Name of garden        : " + name);
        System.out.println("Nme of places         :"  + place);
       
    }
}
