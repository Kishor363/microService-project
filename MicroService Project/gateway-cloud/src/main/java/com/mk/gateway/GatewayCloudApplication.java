package com.mk.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewayCloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayCloudApplication.class, args);
	}

}
