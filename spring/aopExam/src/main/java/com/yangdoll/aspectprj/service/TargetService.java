package com.yangdoll.aspectprj.service;

import org.springframework.stereotype.Component;

@Component
public class TargetService {
	public int targetMethod1() {
		System.out.println("targetMethod1의 실제 동작 비즈니스 로직입니다.");
		return 1;
	}
	
	public String targetMethod2() { 
		System.out.println("targetMethod2의 실제 동작 비즈니스 로직입니다.");
		return "타겟2";
	}
}
