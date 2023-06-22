package com.perficient.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan({"com.perficient.demo.controller","com.perficient.demo.utils","com.perficient.demo.service"})
@Configuration
public class SpringBootKafkaSamplePocApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootKafkaSamplePocApplication.class, args);
	}

}
