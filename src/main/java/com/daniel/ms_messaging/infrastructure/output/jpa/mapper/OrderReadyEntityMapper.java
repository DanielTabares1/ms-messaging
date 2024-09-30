package com.daniel.ms_messaging.infrastructure.output.jpa.mapper;

import com.daniel.ms_messaging.domain.model.OrderReady;
import com.daniel.ms_messaging.infrastructure.output.jpa.entity.OrderReadyEntity;
import org.springframework.stereotype.Component;

@Component
public class OrderReadyEntityMapper implements IOrderReadyEntityMapper{
    @Override
    public OrderReadyEntity toEntity(OrderReady orderReady) {
        return new OrderReadyEntity(orderReady.getOrderId(), orderReady.getValidationCode());
    }

    @Override
    public OrderReady toModel(OrderReadyEntity orderReadyEntity) {
        return new OrderReady(orderReadyEntity.getOrderId(), orderReadyEntity.getValidationCode());
    }
}
