class MyntraAccount {
    static String username;
    static String email;
    static String phoneNumber;
    static String fullName;
    static String password;
    static String address;

    public static boolean createMyntraAccount(String uname, String mail, String phone, String name, String pwd, String addr) {
        boolean isAccountCreated = false;
        boolean isUnameValid = false;
        boolean isEmailValid = false;
        boolean isPhoneValid = false;
        boolean isNameValid = false;
        boolean isPwdValid = false;
        boolean isAddressValid = false;

        if (uname != null ) {
            username = uname;
            isUnameValid = true;
        } else {
            System.out.println("Please provide a valid User Name");
        }

        if (mail != null ) {
            email = mail;
            isEmailValid = true;
        } else {
            System.out.println("Please provide a valid E-mail");
        }

        if (phone != null ) {
            phoneNumber = phone;
            isPhoneValid = true;
        } else {
            System.out.println("Please provide a valid Phone Number");
        }

        if (name != null ) {
            fullName = name;
            isNameValid = true;
        } else {
            System.out.println("Please provide a valid Full Name");
        }

        if (pwd != null ) {
            password = pwd;
            isPwdValid = true;
        } else {
            System.out.println("Please provide a valid Password");
        }

        if (addr != null ) {
            address = addr;
            isAddressValid = true;
        } else {
            System.out.println("Please provide a valid Address");
        }

        if (isUnameValid && isEmailValid && isPhoneValid && isNameValid && isPwdValid && isAddressValid) {
            isAccountCreated = true;
        }

        return isAccountCreated;
    }

    public static void getMyntraAccountDetails() {
        System.out.println("User Name: " + username);
        System.out.println("E-mail: " + email);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Full Name: " + fullName);
        System.out.println("Password: " + password);
        System.out.println("Address: " + address);
    }

    
}
