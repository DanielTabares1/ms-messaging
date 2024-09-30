package com.daniel.ms_messaging.infrastructure.config;

import com.daniel.ms_messaging.domain.api.ISendSmsServicePort;
import com.daniel.ms_messaging.domain.api.OrderReadyServicePort;
import com.daniel.ms_messaging.domain.spi.ISendSmsPersistencePort;
import com.daniel.ms_messaging.domain.spi.OrderReadyPersitencePort;
import com.daniel.ms_messaging.domain.usecase.OrderReadyUseCase;
import com.daniel.ms_messaging.domain.usecase.SendSmsUseCase;
import com.daniel.ms_messaging.infrastructure.output.jpa.adapter.OrderReadyJpaAdapter;
import com.daniel.ms_messaging.infrastructure.output.jpa.mapper.IOrderReadyEntityMapper;
import com.daniel.ms_messaging.infrastructure.output.jpa.repository.OrderReadyRepository;
import com.daniel.ms_messaging.infrastructure.output.twilio.ITwilioUtil;
import com.daniel.ms_messaging.infrastructure.output.twilio.TwilioAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfig {

    private final ITwilioUtil twilioUtil;
    private final OrderReadyRepository orderReadyRepository;
    private final IOrderReadyEntityMapper orderReadyEntityMapper;

    @Bean
    public ISendSmsPersistencePort sendSmsPersistencePort() {
        return new TwilioAdapter(twilioUtil);
    }

    @Bean
    public ISendSmsServicePort sendSmsServicePort() {
        return new SendSmsUseCase(sendSmsPersistencePort(), orderReadyPersitencePort());
    }

    @Bean
    public OrderReadyPersitencePort orderReadyPersitencePort() {
        return new OrderReadyJpaAdapter(orderReadyRepository, orderReadyEntityMapper);
    }

    @Bean
    public OrderReadyServicePort orderReadyServicePort() {
        return new OrderReadyUseCase(orderReadyPersitencePort());
    }


}
