package com.xworkz.amozonproducts.update.get.method;

import com.xworkz.amozonproducts.update.get.method.amazon.Amazon;
import com.xworkz.amozonproducts.update.get.method.amazon.AmazonImpl;
import com.xworkz.amozonproducts.update.get.method.products.Products;

import java.util.Scanner;

public class AmazonRunner {

    public static void main(String[] args) {

        Amazon amazon = new AmazonImpl();

        Scanner scanner = new Scanner(System.in);

        for (int index = 0; index < 2; index++) {
            Products products = new Products();

            System.out.println("Enter the Product Id : ");
            int pId = scanner.nextInt();
            products.setProductId(pId);

            System.out.println("Enter the Product Name : ");
            String pName = scanner.next();
            products.setProductName(pName);

            System.out.println("Enter the Product Price : ");
            double pPrice = scanner.nextDouble();
            products.setPrice(pPrice);

            System.out.println("Enter the Product Category : ");
            String pCategory = scanner.next();
            products.setCategory(pCategory);

            System.out.println("Enter the Product Ratings:  ");
            int pRatings = scanner.nextInt();
            products.setRatings(pRatings);

          boolean addedProduct =  amazon.addProduct(products);
            System.out.println(addedProduct);




        }

        amazon.getAllProduct();

        String getProductName = amazon.getProductNameById(4);
        System.out.println(getProductName);
       /* System.out.println(amazon.getProductNameById(2));*/

        String getCategory = amazon.getProductCategoryByName("Mouse");
        System.out.println(getCategory);

        double getPrice = amazon.getProductPriceByName("YogaMat");
        System.out.println(getPrice);

        double getRatings = amazon.getProductRatingsByName("Mouse");
        System.out.println(getRatings);

        amazon.updatePriceById(20.00,1);
        amazon.getAllProduct();

        amazon.updateRatingsByProductName("YogaMat", 5);
        amazon.getAllProduct();


    }




}
