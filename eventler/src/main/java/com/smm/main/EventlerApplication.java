package com.smm.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.smm.eventler")
public class EventlerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventlerApplication.class, args);
	}
}
