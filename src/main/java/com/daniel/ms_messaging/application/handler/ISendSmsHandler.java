package com.daniel.ms_messaging.application.handler;

import com.daniel.ms_messaging.domain.model.OrderMessage;

public interface ISendSmsHandler {

    boolean sendSms(OrderMessage orderMessage);

}
