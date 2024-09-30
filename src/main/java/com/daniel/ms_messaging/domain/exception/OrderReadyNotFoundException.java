package com.daniel.ms_messaging.domain.exception;

public class OrderReadyNotFoundException extends RuntimeException{
    public OrderReadyNotFoundException(String message){
        super(message);
    }
}
