package com.xworkz.passportuser.update.get.method.passport;

import com.xworkz.passportuser.update.get.method.user.User;

public class PassportImpl implements Passport{

    User user[] = new User[2];
    int index;

    @Override
    public boolean addPassport(User user) {
        boolean isAddPassport = false;
        if(user != null){
            if (user.getUserName() != null){
                this.user[index] = user;
                index++;
                isAddPassport = true;
            }

        }
        return isAddPassport;
    }

    @Override
    public void getAllPassport() {
        System.out.println("Get all the user info : ");
        for (User user : user)
            System.out.println(user);
    }

    @Override
    public String getGenderByName(String name) {
        String isGetGenderByName = "";
        System.out.println("Get the Gender by Name:");
        for (User user1 : user){
            if (user1.getUserName().equals(name)){
                isGetGenderByName =  user1.getGender();
                break;

            } /*else System.out.println("Choose the gender");*/
        }
        return isGetGenderByName;
    }

    @Override
    public int getAgeByName(String name) {
        int age = 0;
        System.out.println("Get the Age by Name : ");
            for (User user1 : user){
                if (user1.getUserName().equals(name)){
                     age = user1.getUserAge();
                     break;
                }else System.out.println("enter the correct age");
            }

        return age;
    }

    @Override
    public String getNameById(int id) {
        String name = "";
        System.out.println("Get Name By Id : ");
        for (User user1 : user){
            if (user1.getUserId() == id){
                 name = user1.getUserName();
                break;
            }/*else System.out.println("Name is not found");*/
        }
        return name;
    }

    @Override
    public boolean updatePhoneNumberById(long mobileNumber, int id) {
        System.out.println("Update the Phone Number by Id");
        boolean isUpdatePhoneNumberById = false;
            for (User user1 : user){
                if (user1.getUserId() == id){
                 user1.setPhoneNumber(mobileNumber);
                 isUpdatePhoneNumberById = true;
                 break;
                }
            } if (isUpdatePhoneNumberById == false){
                System.out.println("not update the phone number");

            }else System.out.println("update the phone number");

        return isUpdatePhoneNumberById;
    }

    @Override
    public boolean updateAddressById(String address, int id) {
        System.out.println("Update Address By Id");
        boolean isUpdateAddressById = false ;
        for (User user1 : user){
            if (user1.getUserId() == id){
                user1.setUserAddress(address);
                isUpdateAddressById = true;
                break;
            }
        } if(isUpdateAddressById ==  false){
            System.out.println("address is not updted");

        } else System.out.println("address is updated");
        return isUpdateAddressById;
    }

    @Override
    public boolean updateAgeById(int age, int id) {
        System.out.println("Update the Age By Id");
        boolean isUpdateAgeById = false;
        for (User user1 : user){
            if (user1.getUserId() == id){
                user1.setUserAge(age);
                isUpdateAgeById = true;
                break;
            }
        }if (isUpdateAgeById == false){
            System.out.println("Age is not updated");
        }else System.out.println("Age is updated");

        return isUpdateAgeById;
    }
}
