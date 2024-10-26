package com.xworkz.amozonproducts.update.get.method.Exception;

public class ProductIdNotFoundException extends RuntimeException {
    public ProductIdNotFoundException(String message) {

        System.out.println("The product Id is not found  / Please enter the correct Id .......");
    }
}
