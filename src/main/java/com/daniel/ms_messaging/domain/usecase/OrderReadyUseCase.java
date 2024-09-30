package com.daniel.ms_messaging.domain.usecase;

import com.daniel.ms_messaging.domain.api.OrderReadyServicePort;
import com.daniel.ms_messaging.domain.exception.ErrorMessages;
import com.daniel.ms_messaging.domain.exception.OrderReadyNotFoundException;
import com.daniel.ms_messaging.domain.exception.ValidationCodeNotMatch;
import com.daniel.ms_messaging.domain.model.OrderReady;
import com.daniel.ms_messaging.domain.spi.OrderReadyPersitencePort;

import java.util.Objects;

public class OrderReadyUseCase implements OrderReadyServicePort {

    private final OrderReadyPersitencePort orderReadyPersitencePort;

    public OrderReadyUseCase(OrderReadyPersitencePort orderReadyPersitencePort) {
        this.orderReadyPersitencePort = orderReadyPersitencePort;
    }

    @Override
    public OrderReady save(OrderReady orderReady) {
        return orderReadyPersitencePort.save(orderReady);
    }

    @Override
    public OrderReady getById(long orderId) {
        return orderReadyPersitencePort.getById(orderId).orElseThrow(
                () -> new OrderReadyNotFoundException(ErrorMessages.ORDER_READY_NOT_FOUND.getMessage(orderId))
        );
    }

    @Override
    public boolean validateCode(OrderReady orderReady, String code) {
        if (! Objects.equals(orderReady.getValidationCode(), code)){
            throw new ValidationCodeNotMatch(ErrorMessages.VALIDATION_CODE_NOT_MATCH.getMessage());
        }
        return true;
    }
}
