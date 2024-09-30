package com.daniel.ms_messaging.infrastructure.output.jpa.repository;

import com.daniel.ms_messaging.infrastructure.output.jpa.entity.OrderReadyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderReadyRepository extends JpaRepository<OrderReadyEntity, Long> {
}
