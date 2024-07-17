class FactRunner{

		public static void main(String fact[]){
		System.out.println("Main method started");
		  int factNumber=6;
		  int fNum = 3;
			int value = Factorial.getFact(factNumber);
			int value1 = (Factorial.getFact(factNumber)/Factorial.getFact(factNumber-fNum));
		
		System.out.println("The given number is : " + factNumber +" is "+ value);
		System.out.println("The given number is : " + factNumber +" is "+ value1);
		System.out.println("Main method ended");
		}
    
		
}