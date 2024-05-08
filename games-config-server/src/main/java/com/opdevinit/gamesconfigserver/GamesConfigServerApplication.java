package com.opdevinit.gamesconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class GamesConfigServerApplication  {
	public static void main(String[] args) {
		SpringApplication.run(GamesConfigServerApplication.class, args);
	}


}
