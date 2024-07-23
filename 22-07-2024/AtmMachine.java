class AtmMachine {
    String branch;
    String bankName;
    String typeOfAtm;
    int id;
    double checkBalance;

    
    public AtmMachine() {
        System.out.println("ATM Machine object is created");
    }

   
    public AtmMachine(String branch, String bankName, String typeOfAtm, int id, double checkBalance) {
        this.branch = branch;
        this.bankName = bankName;
        this.typeOfAtm = typeOfAtm;
        this.id = id;
        this.checkBalance = checkBalance;
    }

    
    public void withdrawCash() {
        System.out.println("Branch: " + this.branch);
        System.out.println("Bank Name: " + this.bankName);
        System.out.println("Type of ATM: " + this.typeOfAtm);
        System.out.println("ATM ID: " + this.id);
        System.out.println("Check Balance: " + this.checkBalance);
    }
}