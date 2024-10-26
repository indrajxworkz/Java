package com.mysticarts.amazon;

import com.mysticarts.amazon.amazonapp.AmazonApp;
import com.mysticarts.amazon.customer.Customer;
import com.mysticarts.amazon.customer.Gender;
import com.mysticarts.amazon.impl.AmazonImpl;

public class Runner {
    public static void main(String[] args) {
        Object object[] = new Object[2];

        Customer customer = new Customer();
        customer.setCus_Id(18);
        object[0] = customer;

        customer.setCus_Id(1);
        customer.setCus_Name("Rahul");
        customer.setCus_Contact(9632245422L);
        customer.setGender(Gender.Male);
        customer.setCus_Address("RajajiNagar Bengaluru");

        Customer customer1 = new Customer();

        customer1.setCus_Id(2);
        customer1.setCus_Name("Sowmya ");
        customer1.setCus_Contact(96321258451L);
        customer1.setGender(Gender.Female);
        customer1.setCus_Address("Bhashyam Circle Bengaluru");
        object[1] = customer1;

        Customer customer2 = new Customer();
        customer2.setCus_Id(3);
        customer2.setCus_Name("Haradatt N");
        customer2.setCus_Contact(9874562145L);
        customer2.setGender(Gender.Male);
        customer2.setCus_Address("Nittuvalli , Davangere");

        Customer customer3 =new Customer();
        customer3.setCus_Id(4);
        customer3.setCus_Name("Bharadwaj");
        customer3.setCus_Contact(9875145212L);
        customer3.setGender(Gender.Male);
        customer3.setCus_Address("Deepanjali Nagar Bengaluru");

        Customer customer4 = new Customer();
        customer4.setCus_Id(5);
        customer4.setCus_Name("Nagaraja N");
        customer4.setCus_Contact(2165874523L);
        customer4.setGender(Gender.Male);
        customer4.setCus_Address("Nittuvalli Davnagere");


        AmazonApp amazonApp = new AmazonApp();
        amazonApp.setPro_Id(1);
        amazonApp.setPro_Name("Dell Inspiron 1300 i7 processor");
        amazonApp.setPro_brand("Dell");
        amazonApp.setPro_category("Laptop");
        amazonApp.setPro_price(59999.00);
        amazonApp.setPro_Ratings(4.90);


        AmazonApp amazonApp9 = new AmazonApp();
        amazonApp9.setPro_Id(10);
        amazonApp9.setPro_Name("i-Pad 7 Pro");
        amazonApp9.setPro_brand("Applr");
        amazonApp9.setPro_category("Pad & Tablets");
        amazonApp9.setPro_price(79999.00);
        amazonApp9.setPro_Ratings(4.00);


        AmazonApp amazonApp1 = new AmazonApp();
        amazonApp1.setPro_Id(2);
        amazonApp1.setPro_Name("i-Phone 18 Pro Max+");
        amazonApp1.setPro_brand("Apple");
        amazonApp1.setPro_category("Phone & Mobiles");
        amazonApp1.setPro_price(159999.00);
        amazonApp1.setPro_Ratings(4.90);


        AmazonApp amazonApp2 = new AmazonApp();
        amazonApp2.setPro_Id(3);
        amazonApp2.setPro_Name("Samsung Washing Machine");
        amazonApp2.setPro_brand("Samsung ");
        amazonApp2.setPro_category("Washing machine &  Laundry");
        amazonApp2.setPro_price(39999.00);
        amazonApp2.setPro_Ratings(4.88);

        AmazonApp amazonApp3 = new AmazonApp();
        amazonApp3.setPro_Id(4);
        amazonApp3.setPro_Name("i-Charger ");
        amazonApp3.setPro_brand("apple");
        amazonApp3.setPro_category("Electronics & Accessories");
        amazonApp3.setPro_price(1999.00);
        amazonApp3.setPro_Ratings(4.10);

        AmazonApp amazonApp4 = new AmazonApp();
        amazonApp4.setPro_Id(5);
        amazonApp4.setPro_Name("Noise N1 Tws EarBuds ");
        amazonApp4.setPro_brand("Noise ");
        amazonApp4.setPro_category("Smart Watches & Electronics ");
        amazonApp4.setPro_price(999.00);
        amazonApp4.setPro_Ratings(4.58);

        AmazonApp amazonApp5 = new AmazonApp();
        amazonApp5.setPro_Id(6);
        amazonApp5.setPro_Name("Phone Cooler");
        amazonApp5.setPro_brand("Snap Birds ");
        amazonApp5.setPro_category("Mobiles Accessories & Gaming ");
        amazonApp5.setPro_price(99.00);
        amazonApp5.setPro_Ratings(4.90);

        AmazonApp amazonApp6 = new AmazonApp();
        amazonApp6.setPro_Id(7);
        amazonApp6.setPro_Name("RG Gaming Headsets ");
        amazonApp6.setPro_brand("Red Gear ");
        amazonApp6.setPro_category("Gaming ");
        amazonApp6.setPro_price(999.00);
        amazonApp6.setPro_Ratings(4.99);

        AmazonApp amazonApp7 = new AmazonApp();
        amazonApp7.setPro_Id(8);
        amazonApp7.setPro_Name("Sony AmoLED TV 89inch ");
        amazonApp7.setPro_brand("Sony");
        amazonApp7.setPro_category("Television");
        amazonApp7.setPro_price(99999.00);
        amazonApp7.setPro_Ratings(4.92);

        AmazonApp amazonApp8 = new AmazonApp();
        amazonApp8.setPro_Id(9);
        amazonApp8.setPro_Name("Boat Home Theatres ");
        amazonApp8.setPro_brand("Boat");
        amazonApp8.setPro_category("Speakers ");
        amazonApp8.setPro_price(9999.00);
        amazonApp8.setPro_Ratings(3.80);

        AmazonImpl  amazon =new AmazonImpl();
        amazon.addCustomer(customer);
        amazon.addCustomer(customer1);
        amazon.addCustomer(customer2);
        amazon.addCustomer(customer3);
        amazon.addCustomer(customer4);


        amazon.addProducts(amazonApp);
        amazon.addProducts(amazonApp1);
        amazon.addProducts(amazonApp2);
        amazon.addProducts(amazonApp3);
        amazon.addProducts(amazonApp4);
        amazon.addProducts(amazonApp5);
        amazon.addProducts(amazonApp6);
        amazon.addProducts(amazonApp7);
        amazon.addProducts(amazonApp8);
        amazon.addProducts(amazonApp9);




        amazon.getAllDetailsOfCustomer();
        amazon.getAllProductAvailable();
        amazon.getPriceByProName("Phone Cooler");
        amazon.getProIdByName("i-Pad 7 Pro");
        amazon.getProductsNameByCatogrey("Laptop");
        amazon.getPriceByProId(6);
        amazon.getProIdByRating(4.99);
        amazon.getProNameByProId(8);
        amazon.updateProNameById(1,"Dell Inspiron 17 i9 Processor");
        amazon.updateProRatingsByName("i-Pad 7 Pro",4.99);
        amazon.upadtePriceByName("Sony AmoLED TV 89inch",112999.00);



    }
}
