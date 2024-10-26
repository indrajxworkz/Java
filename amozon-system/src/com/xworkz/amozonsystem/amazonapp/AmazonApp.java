package com.xworkz.amozonsystem.amazonapp;

import com.xworkz.amozonsystem.products.ProductDetails;

public class AmazonApp {

    ProductDetails productDetails;

    public void products(ProductDetails productDetails){

        this.productDetails=productDetails;
        this.productDetails.details();
    }
}
