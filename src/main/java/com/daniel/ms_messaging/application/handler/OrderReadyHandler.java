package com.daniel.ms_messaging.application.handler;

import com.daniel.ms_messaging.domain.api.OrderReadyServicePort;
import com.daniel.ms_messaging.domain.model.OrderReady;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderReadyHandler implements IOrderReadyHandler{

    private final OrderReadyServicePort orderReadyServicePort;


    @Override
    public OrderReady save(OrderReady orderReady) {
        return orderReadyServicePort.save(orderReady);
    }

    @Override
    public OrderReady getById(long orderId) {
        return orderReadyServicePort.getById(orderId);
    }

    @Override
    public boolean validateCode(OrderReady orderReady, String code) {
       return orderReadyServicePort.validateCode(orderReady, code);
    }
}
