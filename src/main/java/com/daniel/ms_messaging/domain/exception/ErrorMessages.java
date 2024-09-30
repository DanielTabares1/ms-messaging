package com.daniel.ms_messaging.domain.exception;

public enum ErrorMessages {

    ORDER_READY_NOT_FOUND("Order ready not found with ID: %d"),
    VALIDATION_CODE_NOT_MATCH("The validation code is incorrect");

    private final String message;

    ErrorMessages(String message) {
        this.message = message;
    }

    public String getMessage(Object... args) {
        return String.format(message, args);
    }
}
