package com.xworkz.newspaper.dao;

import com.xworkz.newspaper.dto.NewsPaperDto;

public class NewsPaperDao {

    NewsPaperDto dto;

    public boolean createNewsPaper(NewsPaperDto dto){
        System.out.println("create started");
        boolean isCreated=false;
        if(null!=dto){
            this.dto=dto;
            isCreated=true;
        }else{
            System.out.println("Please provide valid details...");
        }
        System.out.println("create ended");
        return isCreated;
    }

    public void getInfo(){
        System.out.println("Fetching Details....");
        System.out.println("The Company name is :"+dto.companyName);
        System.out.println("The No of pages of Newspaper is :"+dto.noOfPages);
        System.out.println("The Language of the news paper is :"+dto.language);
    }
}
