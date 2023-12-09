package com.jenkinsTest.jenkinsTest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.logging.Logger;

@SpringBootTest
class JenkinsTestApplicationTests {

	public static Logger log= Logger.getLogger(JenkinsTestApplicationTests.class.getName());
	@Test
	public void contextLoads() {
		log.info("Text case execution.....");


	}

}
