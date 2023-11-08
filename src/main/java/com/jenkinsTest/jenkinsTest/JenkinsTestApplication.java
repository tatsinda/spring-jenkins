package com.jenkinsTest.jenkinsTest;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class JenkinsTestApplication {

	public static Logger log= Logger.getLogger(JenkinsTestApplication.class.getName());

	@PostConstruct
	public void init()
	{
		log.info("Application start ...");
	}
	public static void main(String[] args) {
		log.info("Application executed ...");

		SpringApplication.run(JenkinsTestApplication.class, args);
	}

}
