package com.xworkz.newsapp.exception;

public class NameNotFoundException extends RuntimeException{
    public NameNotFoundException(String error)
    {
        System.out.println(error);
    }
}
