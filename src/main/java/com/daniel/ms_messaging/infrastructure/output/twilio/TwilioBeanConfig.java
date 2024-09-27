package com.daniel.ms_messaging.infrastructure.output.twilio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TwilioBeanConfig {

    @Bean
    public ITwilioUtil twilioUtil(){
        return new TwilioUtil();
    }
}
