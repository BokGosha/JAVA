package ru.mirea.lab19;

public class BadINNException extends RuntimeException {
    public BadINNException(String errorMessage) {
        super(errorMessage);
    }
}
