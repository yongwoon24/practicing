package com.mysite.yangdoll;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.apache.catalina.core.ApplicationContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.log4j.Log4j;

@SpringBootTest
public class ContextTest {
	@Autowired
	ApplicationContext applicationContext;
	
	@Test
	public void objTest() {
		assertNotNull(applicationContext);
	}
}
