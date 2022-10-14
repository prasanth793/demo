package com.schindler.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class SchDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchDemoApplication.class, args);
	}

}
