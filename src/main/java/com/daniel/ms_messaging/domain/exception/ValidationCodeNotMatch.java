package com.daniel.ms_messaging.domain.exception;

public class ValidationCodeNotMatch extends RuntimeException {
    public ValidationCodeNotMatch(String message) {
        super(message);
    }
}
