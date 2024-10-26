package com.mysticarts.amazon.exception;

public class RatingsNotFoundException extends RuntimeException {
    public RatingsNotFoundException(String message) {
        super(message);
    }
}
