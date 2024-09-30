package com.daniel.ms_messaging.domain.usecase;

import com.daniel.ms_messaging.domain.api.ISendSmsServicePort;
import com.daniel.ms_messaging.domain.model.OrderMessage;
import com.daniel.ms_messaging.domain.model.OrderReady;
import com.daniel.ms_messaging.domain.spi.ISendSmsPersistencePort;
import com.daniel.ms_messaging.domain.spi.OrderReadyPersitencePort;

public class SendSmsUseCase implements ISendSmsServicePort {
    private final ISendSmsPersistencePort sendSmsPersistencePort;
    private final OrderReadyPersitencePort orderReadyPersitencePort;

    public SendSmsUseCase(ISendSmsPersistencePort sendSmsPersistencePort, OrderReadyPersitencePort orderReadyPersitencePort) {
        this.sendSmsPersistencePort = sendSmsPersistencePort;
        this.orderReadyPersitencePort = orderReadyPersitencePort;
    }

    @Override
    public boolean sendSms(OrderMessage orderMessage) {
        orderReadyPersitencePort.save(
                new OrderReady(orderMessage.getOrderId(), orderMessage.getOrderValidationCode())
        );
        return sendSmsPersistencePort.sendSms(orderMessage);
    }
}
