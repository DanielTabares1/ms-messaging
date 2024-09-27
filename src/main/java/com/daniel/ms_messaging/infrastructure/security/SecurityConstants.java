package com.daniel.ms_messaging.infrastructure.security;

public final class SecurityConstants {

    private SecurityConstants() {
    }

    public static final String[] WHITE_LIST_URL = {
            "/api/v1/auth/**",
            "/api/swagger-ui/**",
            "/v3/api-docs/**",
            "/api/docs/**",
    };

    public static final String EMPLOYEE_API = "/api/v1/employee/**";

    public static final String EMPLOYEE_ROLE = "EMPLOYEE";


    public static final String ROLE_NAME_CLAIM = "roleName";

    public static final String AUTHORIZATION_HEADER = "Authorization";
    public static final String BEARER_PREFIX = "Bearer ";

    public static final String AUTHENTICATION_SCHEME = "Bearer ";

}
