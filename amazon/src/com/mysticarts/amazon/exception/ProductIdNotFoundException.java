package com.mysticarts.amazon.exception;

public class ProductIdNotFoundException extends RuntimeException {
    public ProductIdNotFoundException(String message) {
        super(message);
    }
}
