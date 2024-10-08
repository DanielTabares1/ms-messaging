package com.daniel.ms_messaging.infrastructure.feignclient;

import com.daniel.ms_messaging.domain.exception.ResourceNotFoundException;
import feign.Response;
import feign.codec.ErrorDecoder;

public class CustomErrorDecoder implements ErrorDecoder {
    @Override
    public Exception decode(String s, Response response) {
        if (response.status() == 404) {
            return new ResourceNotFoundException("Resource not found for " + s);
        }
        return new Exception("Unknown error");
    }
}
