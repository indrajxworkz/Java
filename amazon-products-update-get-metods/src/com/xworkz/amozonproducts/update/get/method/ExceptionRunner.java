package com.xworkz.amozonproducts.update.get.method;

import com.xworkz.amozonproducts.update.get.method.amazon.Amazon;
import com.xworkz.amozonproducts.update.get.method.amazon.AmazonImpl;
import com.xworkz.amozonproducts.update.get.method.products.Products;

public class ExceptionRunner {
    public static void main(String[] args) {
        Products products = new Products();
        products.setProductId(1);
        products.setProductName("iPhone 16 Pro Max");
        products.setCategory("Smart Phones");
        products.setRatings(4);
        products.setPrice(150000.00);

        Amazon amazon = new AmazonImpl();
        amazon.addProduct(products);
        amazon.getAllProduct();
        amazon.updatePriceById(180000.00,1);
        amazon.getAllProduct();
        amazon.getProductNameById(10);
        amazon.getAllProduct();

    }
}
