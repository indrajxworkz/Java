package com.xworkz.newsapp.exception;

public class NoOfArticlesNotFoundException extends RuntimeException{
    public NoOfArticlesNotFoundException(String error)
    {
        System.out.println(error);
    }
}
