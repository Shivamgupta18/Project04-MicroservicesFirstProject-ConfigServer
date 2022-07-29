package com.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Project04MicroservicesFirstProjectConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Project04MicroservicesFirstProjectConfigServerApplication.class, args);
	}

}
