package kr.co.yangdoll.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class BoardAdvice {
	@Before("execution( public  * kr.co.yangdoll.service.*.*(..) )")
	public void beforeAdvice() {
		System.out.println("나는 Advice입니다.");
	}
}
