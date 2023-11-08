package com.jenkinsTest.jenkinsTest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class JenkinsTestApplicationTests {

	public static Logger log= Logger.getLogger(JenkinsTestApplicationTests.class.getName());
	@Test
	void contextLoads() {
		log.info("Text case executiong.....");
		assertEquals(true,true);

	}

}
