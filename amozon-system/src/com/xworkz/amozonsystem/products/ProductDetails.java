package com.xworkz.amozonsystem.products;

public class ProductDetails {

    public String productName;
    public double cost;
    public String type;
    public double rating;

    public void details(){
        System.out.println("Product Name       : " + this.productName);
        System.out.println("Product Cost       : " + this.cost);
        System.out.println("Product Category   : " + this.type);
        System.out.println("Rating             : " + this.rating);

    }
}
