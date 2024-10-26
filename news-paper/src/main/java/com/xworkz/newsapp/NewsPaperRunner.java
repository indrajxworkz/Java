package com.xworkz.newsapp;

import com.xworkz.newsapp.dao.NewsPaperDao;
import com.xworkz.newsapp.dao.NewsPaperDaoImpl;
import com.xworkz.newsapp.dto.NewsPaperDto;
import com.xworkz.newsapp.service.NewsPaperService;
import com.xworkz.newsapp.service.NewsPaperServiceImpl;

import java.util.Scanner;

public class NewsPaperRunner {
    public static void main(String[] args) {
        System.out.println("Main Method Started");
        System.out.println();

        Scanner scanner =new Scanner(System.in);
        NewsPaperService newsPaperService = new NewsPaperServiceImpl();

        for (int i = 0; i < 1; i++) {

            NewsPaperDto newsPaperDto = new NewsPaperDto();

            System.out.print("Enter the NewsPaper ID:");
            newsPaperDto.setId(scanner.nextInt());

            System.out.print("Enter the NewsPaper Name:");
            newsPaperDto.setName(scanner.next());

            System.out.print("Enter no of pages:");
            newsPaperDto.setNoOfPages(scanner.nextInt());

            System.out.print("Enter the NewsPaper Language:");
            newsPaperDto.setLang(scanner.next());

            System.out.print("Enter the NewsPaper Price:");
            newsPaperDto.setPrice(scanner.nextDouble());

            System.out.print("Enter the NewsPaper EditorName:");
            newsPaperDto.setEditorName(scanner.next());

            System.out.print("Enter the NewsPaper Date:");
            newsPaperDto.setDate(scanner.next());

            System.out.print("Enter no of articles:");
            newsPaperDto.setNoOfArticles(scanner.nextInt());


            newsPaperService.saveNewsPaper(newsPaperDto);
            System.out.println();

        }
        NewsPaperDto[] newsPaperDtos = newsPaperService.getAllNewsPaper();;
        System.out.println("Newspapers are :");
            for (NewsPaperDto newsPaperDto: newsPaperDtos){

            System.out.println(newsPaperDto);
        }
        newsPaperService.getNewsPaperByDate("12/10/24");
        System.out.println();

        newsPaperService.getNewsPaperByLang("kan");
        System.out.println();

        newsPaperService.getNewsPaperById(3);
        System.out.println();

        newsPaperService.getNumberOfPagesByLang("kan");
        System.out.println();

        newsPaperService.getDateById(2);
        System.out.println();

        newsPaperService.updateNoOfArticlesByDate(10,"12/10/24");
        System.out.println();

        newsPaperService.deleteNewsPaperById(1);
        System.out.println();

        newsPaperService.getPaperNameById(2);
        System.out.println();

        newsPaperService.getPaperNameByLang("kan");
        System.out.println();

        System.out.println("main method ended");
    }
}
