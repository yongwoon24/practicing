package com.yangdoll.aspectprj.advice;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class PerformanceAdvice {
	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("======================");
		
		try {
			Object result = joinPoint.proceed();
			return result;
		} finally {
			System.out.println("----------------------");
		}
	}
	public void beforeAdv(Joinpoint joinpoint) {
		System.out.println("beforeAdv");
		
	}
}
