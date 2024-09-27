package com.daniel.ms_messaging.application.handler;

import com.daniel.ms_messaging.domain.api.ISendSmsServicePort;
import com.daniel.ms_messaging.domain.model.OrderMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SendSmsHandler implements ISendSmsHandler{

    private final ISendSmsServicePort smsServicePort;


    @Override
    public boolean sendSms(OrderMessage orderMessage) {
        return smsServicePort.sendSms(orderMessage);
    }
}

