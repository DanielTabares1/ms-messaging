package com.daniel.ms_messaging.infrastructure.output.jpa.mapper;

import com.daniel.ms_messaging.domain.model.OrderReady;
import com.daniel.ms_messaging.infrastructure.output.jpa.entity.OrderReadyEntity;

public interface IOrderReadyEntityMapper {
    OrderReadyEntity toEntity(OrderReady orderReady);
    OrderReady toModel(OrderReadyEntity orderReadyEntity);
}
