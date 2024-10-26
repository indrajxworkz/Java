package com.xworkz.amozonsystem;

import com.xworkz.amozonsystem.amazonapp.AmazonApp;
import com.xworkz.amozonsystem.products.ProductDetails;

public class AmazonRunner {

    public static void main(String[] args) {

        AmazonApp app = new AmazonApp();


        ProductDetails product = new ProductDetails();
        product.productName="Echo Dot (4th Gen) with Clock";
        product.cost= 4499.0;
        product.type = "Electronics";
        product.rating= 4.6;


        app.products(product);

    }





}
