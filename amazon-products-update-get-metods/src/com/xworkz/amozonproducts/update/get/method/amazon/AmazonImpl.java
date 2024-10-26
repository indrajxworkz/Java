package com.xworkz.amozonproducts.update.get.method.amazon;

import com.xworkz.amozonproducts.update.get.method.Exception.ProductIdNotFoundException;
import com.xworkz.amozonproducts.update.get.method.products.Products;

public class AmazonImpl implements Amazon {

    Products products[] = new Products[1];
    int index;


    @Override
    public boolean addProduct(Products products) {
        boolean isAddProduct = false;
        if (products != null) {
            if (products.getProductName() != null) {
                this.products[index] = products;
                index++;
                isAddProduct = true;

            }

        }
        return isAddProduct;
    }

    @Override
    public void getAllProduct() {
        System.out.println("Get all products details:");
        for (Products products : products)
            System.out.println(products);
    }

    @Override
    public String getProductNameById(int id)  {
        String itemname = "";
        System.out.println("Get the Product Name by Id : ");
        try {
            for (Products products1 : products) {
                if (products1.getProductId() == id) {
                    itemname = products1.getProductName();
                    break;
                } else System.out.println("id  not found");
            }
            if (itemname == "") {

                ProductIdNotFoundException productIdNotFoundException = new ProductIdNotFoundException("Product Id not Found ");
                throw productIdNotFoundException;

            }
        }catch (ProductIdNotFoundException productIdNotFoundException){
            productIdNotFoundException.printStackTrace();
        }

        return itemname;
    }

    @Override
    public String getProductCategoryByName(String name) {
        String itemCategory = "";
        System.out.println("Get the Product Category by Name : ");
        for(Products products1 : products){
            if (products1.getProductName().equals(name)){
               itemCategory = products1.getCategory();
               break;
            }else System.out.println("product category is not found");

        }
        return itemCategory;
    }

    @Override
    public double getProductPriceByName(String name) {
        double price = 0.0;
        System.out.println("Get the Product Price by Name:");
        for (Products products1 : products){
            if (products1.getProductName().equals(name)){
             price =  products1.getPrice();
            }
        }
        return price;
    }

    @Override
    public int getProductRatingsByName(String name) {
        int itemRatings = 0;
        System.out.println("Get the Product Ratings By Name : ");
        for (Products products1 : products){
            if (products1.getProductName().equals(name)){
             itemRatings =   products1.getRatings();
             break;
            }else System.out.println(" Product Ratings is not found");
        }
        return itemRatings;
    }

    @Override
    public boolean updatePriceById(double price, int id) throws ProductIdNotFoundException {
        System.out.println("Update Price By Id : ");
        boolean isUpdatePriceById = false;
        for (Products products1 : products){
            if (products1.getProductId() == id){
                 products1.setPrice(price);
                isUpdatePriceById = true;
                break;
            }
        }if (isUpdatePriceById == false){
            System.out.println("price is not updated");

        }else System.out.println("price is updated  ");

        return isUpdatePriceById;
    }

    @Override
    public boolean updateRatingsByProductName(String name, int ratings) {
        System.out.println("Update Ratings by Product  Name : ");
        boolean isUpdatesRatingsByProductName = false;
        for (Products products1 : products){
            if (products1.getProductName().equals(name)){
                products1.setRatings(ratings);
                isUpdatesRatingsByProductName = true;
                break;
            }
        }
        if (isUpdatesRatingsByProductName == false){
            System.out.println("ratings is not update");

        }else System.out.println("ratings is updates");

        return isUpdatesRatingsByProductName;
    }
}
