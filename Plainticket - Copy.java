class Plainticket{
	static boolean user ;
	static String name ;
	static long num ;
	static String mail ;
	static String dID ;
	static boolean validID ;
	static boolean emailvalid  ; 

	public static boolean createplainTicket
	(boolean isNewUser, String personName, long mobilenumber, 
	String email, String defenseid, boolean isIdvalid, boolean isemailvalid){
		boolean	createplainTicket = false ;
	
	 user = isNewUser;
	 name = personName;
	 num = mobilenumber;
	 mail = email;
	 dID = defenseid;
	 validID = isIdvalid;
	 emailvalid = isemailvalid ;
	 
	 
	 
	 return createplainTicket;
	}	 
	
	public static void getPlainticket(){
	
	System.out.println("Is the person a new user  : " + user);
	System.out.println("Name of the person    : "+ name);
	System.out.println("The contact details are  : " + num +"\n"+ mail);
	System.out.println("Defense Id for discount  : " + validID);
	System.out.println("Please confrim the email  : " + emailvalid );
	
	
	}
}