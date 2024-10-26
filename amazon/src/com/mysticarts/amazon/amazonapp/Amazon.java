package com.mysticarts.amazon.amazonapp;


import com.mysticarts.amazon.customer.Customer;

public interface Amazon {
    boolean addProducts( AmazonApp amazonApp);
    boolean addCustomer(Customer customer);
    void getAllDetailsOfCustomer();
    void getAllProductAvailable();
    String getProductsNameByCatogrey(String category);
    String getProNameByProId(int pro_id);
    double getPriceByProId(int pro_id);
    double getPriceByProName(String pro_name);
    int getProIdByName(String pro_name);
   int  getProIdByRating(double pro_Ratings );
   boolean updateProNameById(int pro_id,String pro_name);
   boolean updateProRatingsByName(String pro_name, double pro_Ratings);
   boolean upadtePriceByName(String  pro_name,double pro_price);







}
