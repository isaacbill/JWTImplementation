package com.isaac.security.jwtImplmentation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.isaac.security.jwtImplmentation")
public class JwtImplmentationApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtImplmentationApplication.class, args);
	}

}
