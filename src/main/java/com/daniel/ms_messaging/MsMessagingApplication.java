package com.daniel.ms_messaging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsMessagingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsMessagingApplication.class, args);
	}

}
