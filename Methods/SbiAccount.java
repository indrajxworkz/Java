class SbiAccount{
	static double balance = 50000;
	public static double debit(double amount){
	System.out.println("Debit Started");
	//balance = balance - amount;
	//System.out.println("Debit ended");
	
	if(amount <= balance )
		balance = balance - amount;
	else
		System.out.println("Sorry Insufficient balance.........");
	System.out.println("Debit Ended");
	
		return balance;

	
	}
	public static double credit(double amount){
	System.out.println("Credit Started");
	if (amount > 0 )
		balance = balance + amount;
	else
		System.out.println("Sorry no balance");
	System.out.println("Credit Ended");
	return balance;
			}
	public static double getBalance(){
		
		System.out.println("The total amount u have is: "+ balance);
	return balance ;
	}

}
