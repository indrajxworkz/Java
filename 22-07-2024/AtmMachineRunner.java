class AtmMachineRunner {
    public static void main(String[] args) {
       
        AtmMachine atm0 = new AtmMachine("Downtown", "Bank of America", "Drive-Thru", 1, 10000.50);
        atm0.withdrawCash();
        System.out.println();

        AtmMachine atm1 = new AtmMachine("City Center", "Chase Bank", "Walk-Up", 2, 8500.75);
        atm1.withdrawCash();
        System.out.println();

        AtmMachine atm2 = new AtmMachine("Uptown", "Wells Fargo", "Drive-Thru", 3, 12000.00);
        atm2.withdrawCash();
        System.out.println();

        AtmMachine atm3 = new AtmMachine("West End", "CitiBank", "Walk-Up", 4, 6000.25);
        atm3.withdrawCash();
        System.out.println();

        AtmMachine atm4 = new AtmMachine("East Side", "HSBC", "Drive-Thru", 5, 9500.60);
        atm4.withdrawCash();
        System.out.println();

        AtmMachine atm5 = new AtmMachine("North Square", "Barclays", "Walk-Up", 6, 7800.90);
        atm5.withdrawCash();
        System.out.println();

        AtmMachine atm6 = new AtmMachine("South Plaza", "Standard Chartered", "Drive-Thru", 7, 11000.80);
        atm6.withdrawCash();
        System.out.println();

        AtmMachine atm7 = new AtmMachine("Market Street", "TD Bank", "Walk-Up", 8, 5000.45);
        atm7.withdrawCash();
        System.out.println();

        AtmMachine atm8 = new AtmMachine("Central Park", "PNC Bank", "Drive-Thru", 9, 8900.30);
        atm8.withdrawCash();
        System.out.println();

        AtmMachine atm9 = new AtmMachine("Liberty Avenue", "Capital One", "Walk-Up", 10, 7200.15);
        atm9.withdrawCash();
        System.out.println();

        AtmMachine atm10 = new AtmMachine("Broadway", "Santander", "Drive-Thru", 11, 10050.20);
        atm10.withdrawCash();
        System.out.println();

        AtmMachine atm11 = new AtmMachine("Harbor Street", "Deutsche Bank", "Walk-Up", 12, 5400.55);
        atm11.withdrawCash();
        System.out.println();

        AtmMachine atm12 = new AtmMachine("Ocean Drive", "Bank of China", "Drive-Thru", 13, 9200.65);
        atm12.withdrawCash();
        System.out.println();

        AtmMachine atm13 = new AtmMachine("Sunset Boulevard", "BNP Paribas", "Walk-Up", 14, 8100.40);
        atm13.withdrawCash();
        System.out.println();

        AtmMachine atm14 = new AtmMachine("Riverside", "UBS", "Drive-Thru", 15, 7000.50);
        atm14.withdrawCash();
        System.out.println();
    }
}