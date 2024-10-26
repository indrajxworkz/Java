package com.mysticarts.amazon.impl;

import com.mysticarts.amazon.amazonapp.Amazon;
import com.mysticarts.amazon.amazonapp.AmazonApp;
import com.mysticarts.amazon.customer.Customer;
import com.mysticarts.amazon.exception.CatogeryNotFoundException;
import com.mysticarts.amazon.exception.ProductIdNotFoundException;
import com.mysticarts.amazon.exception.ProductNotFoundException;

public class AmazonImpl implements Amazon {
    Customer customer[] = new Customer[5];
    AmazonApp  amazonApp[] = new AmazonApp[10];
    int index;
    int index1;
    @Override
    public boolean addProducts( AmazonApp amazonApp) {
        boolean isAdded  = false;
        System.out.println("Product has been added");
        if (amazonApp != null){
            if (amazonApp.getPro_Name() != null){
                this.amazonApp[index] = amazonApp;
                index++;
                isAdded =true;
            }

        }
        return isAdded;
    }

    @Override
    public boolean addCustomer(Customer customer) {
        boolean isCusAdded = false;
        System.out.println("New Customer added");
        if (customer != null){
            if (customer.getCus_Name() != null){
                this.customer[index1] = customer;
                index1++;
                isCusAdded = true;
            }
        }
        return isCusAdded;
    }

    @Override
    public void getAllDetailsOfCustomer() {
        System.out.println("Data of customers  being accessed .........................................");
        for (Customer customer1 : customer){
            System.out.println(customer1);
            System.out.println("Data is being Displayed           ; )              ");
        }

    }

    @Override
    public void getAllProductAvailable() {
        System.out.println("Data of Product being accessed : ) ............................");
        for (AmazonApp amazonApp1 : amazonApp){
            System.out.println(amazonApp1);
            System.out.println("Data of Products is above              ;  )                 ");

        }

    }

    @Override
    public String getProductsNameByCatogrey(String category)throws CatogeryNotFoundException {
        String name = "";
        System.out.println("Accessing the Product Name  : )   ");
        try{
            for (AmazonApp amazonApp1 : amazonApp){
                if (amazonApp1.getPro_category().equals(category)){
                    name = amazonApp1.getPro_Name();
                    System.out.println(name);
                }
            }
            if (name == ""){
                CatogeryNotFoundException catogeryNotFoundException = new CatogeryNotFoundException("Can't find the Catogery : (");
                throw catogeryNotFoundException;
            }
        } catch (CatogeryNotFoundException catogeryNotFoundException) {
            catogeryNotFoundException.printStackTrace();
        }
        return name;
    }

    @Override
    public String getProNameByProId(int pro_id) throws ProductIdNotFoundException {
        String name1 = "";
        System.out.println("Accessing the Name        ; )       ");
        try {
            for (AmazonApp amazonApp1 : amazonApp){
                if (amazonApp1.getPro_Id() == pro_id){
                    name1 = amazonApp1.getPro_Name();
                    System.out.println(name1);
                }
            }
            if (name1 == ""){
                ProductIdNotFoundException productIdNotFoundException = new ProductIdNotFoundException("Given product is not found : (     ");
               throw  productIdNotFoundException;
            }

        } catch (ProductIdNotFoundException    productIdNotFoundException) {
            productIdNotFoundException.printStackTrace();
        }
        return name1;
    }

    @Override
    public double getPriceByProId(int pro_id)throws ProductIdNotFoundException {
      double  price  = 0.0;
        System.out.println("Checking the given details with the Database available    : )     ");
      try{
          for (AmazonApp amazonApp1 :  amazonApp){
              if (amazonApp1.getPro_Id() == pro_id){
                  price = amazonApp1.getPro_price();
                  System.out.println(price);
              }
          }
          if (price == 0.0 ){
              ProductIdNotFoundException productIdNotFoundException = new ProductIdNotFoundException("Given ID is not Valid ");
              throw productIdNotFoundException;
          }
      }catch (ProductIdNotFoundException productIdNotFoundException){
          productIdNotFoundException.printStackTrace();
      }
        return price;
    }

    @Override
    public double getPriceByProName(String pro_name)throws ProductNotFoundException {
       double price1 = 0.0;
        System.out.println("Fetching the details from data               : )            ");
       try{
           for (AmazonApp amazonApp1 : amazonApp){
               if (amazonApp1.getPro_Name().equals(pro_name)){
                   price1 = amazonApp1.getPro_price();
                   System.out.println(price1);
               }
           }
           if (price1 == 0.0){
               ProductNotFoundException productNotFoundException = new ProductNotFoundException("Given Name is not on the list  : (");
              throw  productNotFoundException;
           }
       }catch (ProductNotFoundException productNotFoundException ){
           productNotFoundException.printStackTrace();
       }
        return price1;
    }

    @Override
    public int getProIdByName(String pro_name)throws ProductNotFoundException  {
       int id = 0;
        System.out.println("Fetching the Name by given name            ; )              ");
        try{
            for (AmazonApp amazonApp1 : amazonApp){
                if (amazonApp1.getPro_Name().equals(pro_name) ){
                  id =  amazonApp1.getPro_Id();
                    System.out.println(id);

                }
            }
            if (id == 0){
                ProductNotFoundException productNotFoundException = new ProductNotFoundException("Given name is not in the database       : (    ");
                throw  productNotFoundException;
            }
        }catch (ProductNotFoundException productNotFoundException){
             productNotFoundException.printStackTrace();
        }
        return id;
    }

    @Override
    public int getProIdByRating(double pro_Ratings) throws ProductIdNotFoundException{
        int id1 = 0;
        try{
            for (AmazonApp amazonApp1 : amazonApp){
                if (amazonApp1.getPro_Ratings() == pro_Ratings){
                  id1 =   amazonApp1.getPro_Id();
                    System.out.println(id1);
                }
            }
            if (id1 == 0){
                ProductIdNotFoundException productIdNotFoundException = new ProductIdNotFoundException("Given ratings doesn't belong in the database  : (   ");
              throw  productIdNotFoundException;
            }
        }catch (ProductIdNotFoundException productIdNotFoundException){
            productIdNotFoundException.printStackTrace();
        }
        return id1;
    }

    @Override
    public boolean updateProNameById(int pro_id, String pro_name) throws ProductIdNotFoundException{
        boolean isNameUpdated = false;
        System.out.println("Fetching the details ");
        try{
            for (int i = 0; i < amazonApp.length; i++) {
                if (amazonApp[i].getPro_Id() == pro_id){
                    amazonApp[i].setPro_Name(pro_name);
                    isNameUpdated = true;
                }
                
            }
            if (isNameUpdated == false){
                ProductIdNotFoundException productIdNotFoundException = new ProductIdNotFoundException("Tha given Id id not found Hence No updates made       : (    ");
                throw  productIdNotFoundException;
            }
        }catch (ProductIdNotFoundException productIdNotFoundException){
             productIdNotFoundException.printStackTrace();
        }
        
        return isNameUpdated;
    }

    @Override
    public boolean updateProRatingsByName(String pro_name, double pro_Ratings) throws ProductNotFoundException {
      boolean isRateUpdated = false;
        try{
            for (int i = 0; i < amazonApp.length; i++) {
                if (amazonApp[i].getPro_Name().equals(pro_name)){
                    amazonApp[i].setPro_Ratings(pro_Ratings);
                    isRateUpdated = true;
                }

            }
            if (isRateUpdated == false){
                ProductNotFoundException productNotFoundException = new ProductNotFoundException("The Given Product is not available in Dtabase  :( "     );
              throw   productNotFoundException;
            }
        }catch (ProductNotFoundException productNotFoundException){
           productNotFoundException.printStackTrace();
        }
        return isRateUpdated;
    }

    @Override
    public boolean upadtePriceByName(String pro_name, double pro_price) {
        boolean isPriceUpdated = false;
        System.out.println("The data is being fetched    ; )   ");
        try{
            for (int i = 0; i < amazonApp.length; i++) {
                if (amazonApp[i].getPro_Name().equals(pro_name)){
                    amazonApp[i].setPro_price(pro_price);
                    isPriceUpdated = true;
                }

            }
            if (isPriceUpdated == false){
                ProductNotFoundException productNotFoundException = new ProductNotFoundException("The given name is not found hence no changes are made     : (       ");
                throw  productNotFoundException;
            }
        }catch (ProductNotFoundException productNotFoundException){
          productNotFoundException.printStackTrace();
        }
        return isPriceUpdated;
    }
}
