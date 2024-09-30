package com.daniel.ms_messaging.domain.api;

import com.daniel.ms_messaging.domain.model.OrderReady;

public interface OrderReadyServicePort {
    OrderReady save(OrderReady orderReady);

    OrderReady getById(long orderId);

    boolean validateCode(OrderReady orderReady, String code);
}
