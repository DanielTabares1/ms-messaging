package com.daniel.ms_messaging.infrastructure.config;

import com.daniel.ms_messaging.domain.api.ISendSmsServicePort;
import com.daniel.ms_messaging.domain.spi.ISendSmsPersistencePort;
import com.daniel.ms_messaging.domain.usecase.SendSmsUseCase;
import com.daniel.ms_messaging.infrastructure.output.twilio.ITwilioUtil;
import com.daniel.ms_messaging.infrastructure.output.twilio.TwilioAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfig {

    private final ITwilioUtil twilioUtil;

    @Bean
    public ISendSmsPersistencePort sendSmsPersistencePort(){
        return new TwilioAdapter(twilioUtil);
    }

    @Bean
    public ISendSmsServicePort sendSmsServicePort(){
        return new SendSmsUseCase(sendSmsPersistencePort());
    }

}
