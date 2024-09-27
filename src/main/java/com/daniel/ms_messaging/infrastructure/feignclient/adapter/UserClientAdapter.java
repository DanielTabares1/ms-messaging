package com.daniel.ms_messaging.infrastructure.feignclient.adapter;

import com.daniel.ms_messaging.application.dto.UserResponse;
import com.daniel.ms_messaging.domain.api.IUserClientPort;
import com.daniel.ms_messaging.infrastructure.feignclient.UserFeignClient;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserClientAdapter implements IUserClientPort {

    private final UserFeignClient userFeignClient;

    @Override
    public UserResponse getUserById(Long id) {
        return userFeignClient.getUserById(id);
    }

    @Override
    public UserResponse getUserByEmail(String email) {
        return userFeignClient.getUserByEmail(email);
    }
}
