package com.daniel.ms_messaging.infrastructure.output.twilio;

import com.daniel.ms_messaging.domain.model.OrderMessage;

public interface ITwilioUtil {
    public String sendSms(OrderMessage orderMessage);

}
