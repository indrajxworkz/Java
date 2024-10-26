package com.xworkz.newsapp.exception;

public class NoOfPagesNotFoundException extends RuntimeException{
    public NoOfPagesNotFoundException(String error)
    {
        System.out.println(error);
    }
}
