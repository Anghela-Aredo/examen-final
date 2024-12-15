package com.examen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RestProductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestProductosApplication.class, args);
	}

}
