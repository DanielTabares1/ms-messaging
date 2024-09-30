package com.daniel.ms_messaging.domain.model;

public class OrderMessage {
    private String clientPhoneNumber;
    private String restaurantName;
    private String orderValidationCode;
    private long orderId;


    public OrderMessage() {
    }

    public OrderMessage(String clientPhoneNumber, String restaurantName, String orderValidationCode, long orderId) {
        this.clientPhoneNumber = clientPhoneNumber;
        this.restaurantName = restaurantName;
        this.orderValidationCode = orderValidationCode;
    }


    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getClientPhoneNumber() {
        return clientPhoneNumber;
    }

    public void setClientPhoneNumber(String clientPhoneNumber) {
        this.clientPhoneNumber = clientPhoneNumber;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getOrderValidationCode() {
        return orderValidationCode;
    }

    public void setOrderValidationCode(String orderValidationCode) {
        this.orderValidationCode = orderValidationCode;
    }

    public String generateMessage() {
        return "Hey, you have a Ready order in the restaurant " +
                "'" + restaurantName + "'.\n" +
                "Please, give the following verification number to the cashier: " + orderValidationCode;
    }
}