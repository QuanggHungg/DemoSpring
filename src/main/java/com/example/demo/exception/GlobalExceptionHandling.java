package com.example.demo.exception;

public class GlobalExceptionHandling {
    public static class NotFoundResource extends RuntimeException{
        public NotFoundResource(String message) {
            super(message);
        }
    }
}
