package com.mysticarts.bakery.dao;

import com.mysticarts.bakery.dto.BakeryDto;

public class BakeryDao {
    BakeryDao bakeryDao;

//BakeryDao bakeryDao1 = new BakeryDao();

//BakeryDto bakeryDto1 = new BakeryDto();
//BakeryDto bakeryDto2 = new BakeryDto();
//BakeryDto bakeryDto3 = new BakeryDto();

    public void getBakeryItem(BakeryDto bakeryDto){

        int itemId = bakeryDto.getItemId();
        System.out.println(itemId);

        String itemName = bakeryDto.getItemName();
        System.out.println(itemName);

        double itemPrice = bakeryDto.getItemPrice();
        System.out.println(itemPrice);

        int discount = bakeryDto.getDiscount();
        System.out.println(discount);

        String buyerName = bakeryDto.getBuyerName();
        System.out.println(buyerName);
         this.bakeryDao = bakeryDao;







    }
}
