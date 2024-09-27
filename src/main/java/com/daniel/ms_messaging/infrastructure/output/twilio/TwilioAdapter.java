package com.daniel.ms_messaging.infrastructure.output.twilio;

import com.daniel.ms_messaging.domain.model.OrderMessage;
import com.daniel.ms_messaging.domain.spi.ISendSmsPersistencePort;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TwilioAdapter implements ISendSmsPersistencePort {

    private final ITwilioUtil twilioUtil;

    @Override
    public boolean sendSms(OrderMessage orderMessage) {
        twilioUtil.sendSms(orderMessage);
        return true;
    }
}
