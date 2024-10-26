package com.xworkz.newsapp.exception;

public class LanguageNotFoundException extends Exception{
    public LanguageNotFoundException(String error)
    {
        System.out.println(error);
    }
}
