package com.xworkz.newsapp.exception;

public class IdNotFoundException extends Exception{
    public IdNotFoundException(String error)
    {
        System.out.println(error);
    }
}
