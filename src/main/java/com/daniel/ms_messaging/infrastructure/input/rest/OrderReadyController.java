package com.daniel.ms_messaging.infrastructure.input.rest;

import com.daniel.ms_messaging.application.handler.IOrderReadyHandler;
import com.daniel.ms_messaging.domain.model.OrderReady;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/employee/order-ready")
@RequiredArgsConstructor
public class OrderReadyController {

    private final IOrderReadyHandler orderReadyHandler;

    @PostMapping("/validate-code")
    public boolean validateCode(@RequestParam long orderId, @RequestParam String validationCode) {
        OrderReady orderReady = orderReadyHandler.getById(orderId);
        return orderReadyHandler.validateCode(orderReady, validationCode);
    }

}
