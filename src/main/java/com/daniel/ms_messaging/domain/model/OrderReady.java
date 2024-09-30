package com.daniel.ms_messaging.domain.model;

public class OrderReady {

    private long orderId;
    private String validationCode;

    public OrderReady(){}

    public OrderReady(long orderId, String validationCode) {
        this.orderId = orderId;
        this.validationCode = validationCode;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public String getValidationCode() {
        return validationCode;
    }

    public void setValidationCode(String validationCode) {
        this.validationCode = validationCode;
    }
}
