package com.xworkz.passportuser.update.get.method.passport;

import com.xworkz.passportuser.update.get.method.user.User;

public interface Passport {

    boolean addPassport(User user);

    void getAllPassport();
    String getGenderByName(String name);
    int getAgeByName(String  name);
    String getNameById(int id);

    boolean updatePhoneNumberById(long mobileNumber, int id);
    boolean updateAddressById(String address , int id);
    boolean updateAgeById(int age, int id);
}
