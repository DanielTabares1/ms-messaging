package com.daniel.ms_messaging.domain.api;

import com.daniel.ms_messaging.application.dto.UserResponse;

public interface IUserClientPort {
    UserResponse getUserById(Long id);

    UserResponse getUserByEmail(String email);
}
