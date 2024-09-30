package com.daniel.ms_messaging.domain.spi;

import com.daniel.ms_messaging.domain.model.OrderReady;

import java.util.Optional;

public interface OrderReadyPersitencePort {
    OrderReady save(OrderReady orderReady);

    Optional<OrderReady> getById(long orderId);
}
