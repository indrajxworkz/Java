class Passport{
	static String cprloc;
	static int dcdrloc;
	static String firstName;
	static String lastName;
	static String dobirth;
	static String emailL;
	static boolean sameasEmail;
	static String loginIds;
	static String pwds;
	static String confirmpwds;
	static String hinQ;
	static String hinA;
	static String captchas;
	
public static boolean createPassport(String cprlocation,int dcdrlocation, String surname,String givenName,
String dob,String email,boolean isEmaiLoginSame,String loginId,
String pwd, String confirmpwd,String hintQuen,String hintAns,String captcha){
boolean isPassportDataCreated=false;
	 cprloc = cprlocation;
	 dcdrloc = dcdrlocation;
	 firstName = givenName ;
	 lastName = surname;
	 dobirth = dob;
	 emailL = email;
	 sameasEmail = isEmaiLoginSame;
	 loginIds = loginId;
	 pwds = pwd;
	 confirmpwds = confirmpwd;
	 hinQ = hintQuen;
	 hinA = hintAns;
	 captchas = captcha;
		
return isPassportDataCreated;


}
		public static void getPassportDetails(){
			
			System.out.println("The CPR Location is 			:  		" + cprloc );
		System.out.println("The Dcdr Location is 			:  		" + dcdrloc );
		System.out.println("The Surname  is 			:  		" + lastName );
		System.out.println("The Given Name  is 			:  		" + firstName );
		System.out.println("The Date of Birth is 			:  		" + dobirth );
		System.out.println("The email is 				:  		" + emailL );
		System.out.println("The given is sam as loginId is 		: 		" + sameasEmail);
		System.out.println("The Loginn ID is 			:  		" + loginIds );
		System.out.println("The Password is 			:  		" + pwds );
		System.out.println("The confrimed Pwd is 			:  		" + confirmpwds );
		System.out.println("The security hint question is		: 		" + hinQ );
		System.out.println("The security hint answer  is 		: 		" + hinA );
		System.out.println("The entred captcha code is 		:  		" + captchas );
		
		
		
		
		
		
		}



}