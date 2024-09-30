package com.daniel.ms_messaging.infrastructure.input.rest;

import com.daniel.ms_messaging.application.handler.IOrderReadyHandler;
import com.daniel.ms_messaging.application.handler.ISendSmsHandler;
import com.daniel.ms_messaging.domain.model.OrderMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/employee/sms")
public class SmsController {

    private final ISendSmsHandler sendSmsHandler;
    private final IOrderReadyHandler orderReadyHandler;

    @PostMapping
    public ResponseEntity<String> sendSms(@RequestBody OrderMessage orderMessage){
        sendSmsHandler.sendSms(orderMessage);
        return ResponseEntity.ok("SMS successfully sent with code: " + orderMessage.getOrderValidationCode());
    }
}
