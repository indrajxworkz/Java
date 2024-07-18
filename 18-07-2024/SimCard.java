class SimCard{

   String name;
   String plan;
   int id;
 

    public SimCard(int id, String name, String place) {
        
		this.id = id;
        this.name = name;
        this.plan = plan;
       
    }

    public void display() {
        System.out.println("ID                    : " + id);
        System.out.println("Name of sim           : " + name);
        System.out.println("Nme of plan           :"  + plan);
       
    }
}
