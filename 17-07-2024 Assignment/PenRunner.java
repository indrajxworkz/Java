class PenRunner{

// ref can be any varible tht shld be access by the java
	public static void main(String factory[]){
		
		// ClassName ref = new ClassName();
		Pen ref = new Pen();
		ref.name = "Reynolds";
		ref.id = 1;
		ref.color="blue";
		ref.price = 20.00;
		System.out.println("The brand Name is: " + ref.name);
		
		
		Pen ref1 = new Pen();
		ref1.name = "Parker";
		ref1.id = 2;
		ref1.color = "black";
		ref1.price = 500.00;
		System.out.println("The brand Name is: " +ref1.name);
	
	
	}



}

// Pen ref = new Pen(); wn object is created is stired in memory
// where the contents writen i Pen ClasSName IS stored in object