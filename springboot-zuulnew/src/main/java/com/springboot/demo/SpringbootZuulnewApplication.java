package com.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringbootZuulnewApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootZuulnewApplication.class, args);
	}

}
