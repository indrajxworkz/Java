class MyntraRunner{

public static void main(String[] cloth){

boolean myntraAccountCreated = MyntraAccount.createMyntraAccount("jane_doe", "jane@example.com", "0987654321", "Jane Doe", "securepassword", "456 Elm St");
        System.out.println("Myntra Account Created: " + myntraAccountCreated);
        if (myntraAccountCreated) {
            MyntraAccount.getMyntraAccountDetails();
        }
		}
}