package com.opdevinit.gamesgatewayzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication()
@EnableDiscoveryClient
public class GamesGatewayZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(GamesGatewayZuulApplication.class, args);
	}

}