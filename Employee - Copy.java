class Employee{
  static String fullName;
  static int serialNumber;
  static int salary;
public static boolean account(String Name, int serialNo){
    boolean isCreatingAccount=false;
	fullName=Name;
	serialNumber=serialNo;
	return isCreatingAccount;
}
   public static void detailsofuser(){
   System.out.println("The name is "+fullName);
   System.out.println("The serialNumber"+serialNumber);
   
   }
   public static boolean account(String Name, int serialNo ,int empsal){
   boolean isCreatingAc=false;
	fullName=Name;
	serialNumber=serialNo;
	salary = empsal;
	return isCreatingAc;
}
   public static void detailsofapplied(){
   System.out.println("The name is "+fullName);
   System.out.println("The serialNumber"+serialNumber);
   System.out.println("The Salary"+salary);
}
}