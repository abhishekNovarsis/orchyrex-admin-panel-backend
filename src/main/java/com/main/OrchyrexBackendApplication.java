package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
//@SpringBootApplication
//@ComponentScan(basePackages = "com.main.config")
public class OrchyrexBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrchyrexBackendApplication.class, args);
	}

}
