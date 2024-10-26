package com.mysticarts.amazon;

import com.mysticarts.amazon.customer.Customer;

public class TestRunner {
    public static void main(String[] args) {
        Object object[] = new Object[2];
        Customer customer = new Customer();
        customer.setCus_Id(1);
        object[0] = customer;
        System.out.println(object[0]);
    }
}
