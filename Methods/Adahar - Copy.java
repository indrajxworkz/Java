class Adahar{
	
	static String name ;
	static long num	;
	static String add ;
	static String dob ;
	static boolean validnum; 
	static String email ;
	static String state ;
	static String captha;	
	
	
	public static boolean createAdahar(String personName, long mobileNumber, 
	String address, String dateOfBirth, boolean isgivenNumbervalid, String captcha, String stateName, String personEmail){
	boolean createAdahar=false;
	
	name = personName;
	num	= mobileNumber;
	add = address;
	dob = dateOfBirth;
	validnum = isgivenNumbervalid;
	email = personEmail;
	state = stateName;
	captha = captcha;
	
	
	return createAdahar;
	
	}

	public static void getAdharDetails(){
			
		System.out.println("The Person Name  is 			:  		" + name );
		System.out.println("The Person Number is 			:  		" + num );
		System.out.println("The Address  is 			:  		" + add );
		System.out.println("The Date of Birth  is 			:  		" + dob );
		System.out.println("The  is number valid or not 		:  		" + validnum );
		System.out.println("The email is 				:  		" + email );
		System.out.println("The living state is 		: 		" + state);
		System.out.println("The entred captcha code is 		:  		" + captha);


}
}
