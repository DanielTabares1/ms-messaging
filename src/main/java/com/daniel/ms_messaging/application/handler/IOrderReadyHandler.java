package com.daniel.ms_messaging.application.handler;


import com.daniel.ms_messaging.domain.model.OrderReady;

public interface IOrderReadyHandler {
    OrderReady save(OrderReady orderReady);
    OrderReady getById(long orderId);
    boolean validateCode(OrderReady orderReady, String code);

}
