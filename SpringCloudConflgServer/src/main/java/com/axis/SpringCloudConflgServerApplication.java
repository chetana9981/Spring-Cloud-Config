package com.axis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer
@SpringBootApplication
public class SpringCloudConflgServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConflgServerApplication.class, args);
	}

}
