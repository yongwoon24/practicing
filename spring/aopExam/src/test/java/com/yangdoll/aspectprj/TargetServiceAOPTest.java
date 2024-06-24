package com.yangdoll.aspectprj;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yangdoll.aspectprj.advice.PerformanceAdvice;
import com.yangdoll.aspectprj.service.TargetService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class TargetServiceAOPTest {
	
	@Autowired
	ApplicationContext context;
	
	@Autowired
	TargetService target;
	
	@Autowired
	PerformanceAdvice advice;
	
	@Test
	public void beanTest() {
		assertNotNull(context);
		assertNotNull(target);
	}
	
	@Test
	public void aopExec() {
		int result = target.targetMethod1();
		assertEquals(1, result);
	}
	
	@Test
	public void aopAroundExec() {
		String result = target.targetMethod2();
		assertEquals("타겟2", result);
	}
	@Test
	public void aopBeforeExec() {
		String result = target.targetMethod2();
		assertEquals("타겟2", result);
	}

}
