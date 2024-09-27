package com.daniel.ms_messaging.domain.api;

import com.daniel.ms_messaging.domain.model.OrderMessage;

public interface ISendSmsServicePort {
    boolean sendSms(OrderMessage orderMessage);
}
