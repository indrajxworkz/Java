package com.mysticarts.bakery;

import com.mysticarts.bakery.dto.BakeryDto;
import com.mysticarts.bakery.dao.BakeryDao;

public class BakeryRunner {

    public static void main(String[] args) {

        BakeryDto bakeryDto = new BakeryDto();
        BakeryDao bakeryDao = new BakeryDao();



        BakeryDto bakeryDto1 = new BakeryDto();
        BakeryDto bakeryDto2 = new BakeryDto();
        BakeryDto bakeryDto3 = new BakeryDto();

        bakeryDto1.setItemId(1);
        bakeryDto1.setItemName("Corrisant");
        bakeryDto1.setItemPrice(55.00);
        bakeryDto1.setDiscount(10);
        bakeryDto1.setBuyerName("Sneha");

        bakeryDto2.setItemId(2);
        bakeryDto2.setItemName("Gateu(Cake)");
        bakeryDto2.setItemPrice(1590.00);
        bakeryDto2.setDiscount(12);
        bakeryDto2.setBuyerName("Haradatt");

        bakeryDto3.setItemId(3);
        bakeryDto3.setItemName("Ouef");
        bakeryDto3.setItemPrice(30.00);
        bakeryDto3.setDiscount(5);
        bakeryDto3.setBuyerName("Indraj N");


        bakeryDao.getBakeryItem(bakeryDto1);
        bakeryDao.getBakeryItem(bakeryDto2);
        bakeryDao.getBakeryItem(bakeryDto3);
    }
}
