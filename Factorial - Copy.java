class Factorial{


	public static int getFact(int factNum){
		System.out.println("Fact Method started");
		int f = 1;
		for (int num = 1;num<=factNum; num++){
		    f =  num*f;
			 
				
		}
		System.out.println("Fact Method ended");
	return f ;
	}
	
}