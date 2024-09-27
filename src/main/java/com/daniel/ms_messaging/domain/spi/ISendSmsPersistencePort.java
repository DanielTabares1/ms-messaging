package com.daniel.ms_messaging.domain.spi;

import com.daniel.ms_messaging.domain.model.OrderMessage;

public interface ISendSmsPersistencePort {
    boolean sendSms(OrderMessage orderMessage);
}
