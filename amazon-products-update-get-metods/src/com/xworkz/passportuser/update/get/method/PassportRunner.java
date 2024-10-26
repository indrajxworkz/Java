package com.xworkz.passportuser.update.get.method;

import com.xworkz.passportuser.update.get.method.passport.Passport;
import com.xworkz.passportuser.update.get.method.passport.PassportImpl;
import com.xworkz.passportuser.update.get.method.user.User;

import java.util.Scanner;

public class PassportRunner {

    public static void main(String[] args) {

        Passport passport = new PassportImpl();

        Scanner scanner = new Scanner(System.in);

        for (int index = 0; index < 2; index++) {
            User user = new User();

            System.out.println("Enter the user id:");
            int uId = scanner.nextInt();
            user.setUserId(uId);

            System.out.println("Enter the user Name : ");
            String uName = scanner.next();
            user.setUserName(uName);

            System.out.println("Enter the user Age : ");
            int uAge = scanner.nextInt();
            user.setUserAge(uAge);

            System.out.println("Enter the user Address : ");
            String uAddress = scanner.next();
            user.setUserAddress(uAddress);

            System.out.println("Enter the user Gender : ");
            String uGender = scanner.next();
            user.setGender(uGender);

            System.out.println("Enter the user phone number: ");
            long pNum = scanner.nextLong();
            user.setPhoneNumber(pNum);

         boolean addedPassportdetails =   passport.addPassport(user);
            System.out.println(addedPassportdetails);


        }

        passport.getAllPassport();

      String getGender = passport.getGenderByName("Indraj");
        System.out.println(getGender);

        int getAge = passport.getAgeByName("SOWMYA");
        System.out.println(getAge);

        String getName = passport.getNameById(2);
        System.out.println(getName);

        passport.updatePhoneNumberById(8050832559l,2);
        passport.getAllPassport();

        passport.updateAddressById("Bng", 1);
        passport.getAllPassport();

        passport.updateAgeById(22,2);
        passport.getAllPassport();
    }
}
