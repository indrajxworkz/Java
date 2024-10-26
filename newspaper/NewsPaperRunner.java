package com.xworkz.newspaper;

import com.xworkz.newspaper.dao.NewsPaperDao;
import com.xworkz.newspaper.dto.NewsPaperDto;

public class NewsPaperRunner {

    public static void main(String[] args) {

        NewsPaperDto dto = new NewsPaperDto();
        System.out.println("main started");
        dto.companyName="Times of India";
        dto.noOfPages=20;
        dto.language="English";

        NewsPaperDao newspaperDao =new NewsPaperDao();

        newspaperDao.createNewsPaper(dto);
        newspaperDao.getInfo();
        System.out.println("main ended");
    }
}
