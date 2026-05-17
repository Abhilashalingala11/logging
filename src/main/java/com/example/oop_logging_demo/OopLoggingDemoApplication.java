package com.example.oop_logging_demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class OopLoggingDemoApplication {
	private static final Logger logger = LogManager.getLogger(OopLoggingDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(OopLoggingDemoApplication.class, args);
		{
			logger.info("🚀 Application started with Log4j2 and Java 17!");


		}
	}
}
