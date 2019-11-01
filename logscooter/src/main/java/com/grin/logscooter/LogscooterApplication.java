package com.grin.logscooter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@EnableGlobalMethodSecurity( securedEnabled = true )
public class LogscooterApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogscooterApplication.class, args);
	}

}
