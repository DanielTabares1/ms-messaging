package com.daniel.ms_messaging.infrastructure.output.jpa.adapter;

import com.daniel.ms_messaging.domain.model.OrderReady;
import com.daniel.ms_messaging.domain.spi.OrderReadyPersitencePort;
import com.daniel.ms_messaging.infrastructure.output.jpa.entity.OrderReadyEntity;
import com.daniel.ms_messaging.infrastructure.output.jpa.mapper.IOrderReadyEntityMapper;
import com.daniel.ms_messaging.infrastructure.output.jpa.repository.OrderReadyRepository;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class OrderReadyJpaAdapter implements OrderReadyPersitencePort {

    private final OrderReadyRepository orderReadyRepository;
    private final IOrderReadyEntityMapper orderReadyEntityMapper;


    @Override
    public OrderReady save(OrderReady orderReady) {
        OrderReadyEntity orderReadyEntity = orderReadyEntityMapper.toEntity(orderReady);
        return orderReadyEntityMapper.toModel(orderReadyRepository.save(orderReadyEntity));
    }

    @Override
    public Optional<OrderReady> getById(long orderId) {
        return orderReadyRepository.findById(orderId).map(
                orderReadyEntityMapper::toModel
        );
    }
}
