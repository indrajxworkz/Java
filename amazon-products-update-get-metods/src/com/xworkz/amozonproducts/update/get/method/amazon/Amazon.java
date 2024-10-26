package com.xworkz.amozonproducts.update.get.method.amazon;

import com.xworkz.amozonproducts.update.get.method.products.Products;

public interface Amazon {

    boolean addProduct(Products products);

    void getAllProduct();

    String getProductNameById(int id);

    String getProductCategoryByName(String name);

    double getProductPriceByName(String name);

    int getProductRatingsByName(String name);

    boolean updatePriceById(double price, int id);

    boolean updateRatingsByProductName(String name, int ratings);
}
