package com.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

// 횡단 관심사를 처리해줄 클래스
// 횡단 관심사를 언제 처리할 것인가?
// Before(메소드 호풀 전에), After returing(메소드 호출 이후에), After Throwing(메소드 예외 후 발생)
// After(메소드 호출 후 예외 발생 여부와 관계 없이), Around(메소드 호출 이전과 이후 모두 적용) -> 대중적

@Component("log")
@Aspect
public class LogAdvice {
	
	// execution() : 특정 메소드만을 advice를 함
	// * : 리턴 타입
	// com.spring.aop : 패키지명
	// Product : 클래스명
	// getInfo() : 메소드명
/*
	@Before(value = "execution(* com.spring.aop.Product.getInfo())")
	public void beforeLog() {
		System.out.println("[공통로그] 비즈니스 로직 수행 전 호출");
	} 
*/
	
/*
	// After(메소드 호출 후 예외 발생 여부와 관계 없이)
	@After(value = "execution(* com.spring.aop.Product.getInfo())")
	public void afterLog() {
		System.out.println("[공통로그] 비즈니스 로직 수행 후 호출(예외 발생 여부와 관계없이 무조건 실행)");
	}
*/
/*
	@AfterThrowing(value = "execution(* com.spring.aop.Product.getInfo())")
	public void afterThrowingLog() {
		System.out.println("[공통로그] 비즈니스 로직 수행 후 예외 발생 시 호출 됨");
	}
*/
/*
	@AfterReturning(value = "execution(* com.spring.aop.Product.getInfo())")
	public void afterReturning() {
		System.out.println("[공통로그] 비즈니스 로직 수행 후 예외 발생 없을 때만 호출 됨");
	}
*/
	@Around(value = "execution(* com.spring.aop.Product.getInfo())")
	public void aroundLog(ProceedingJoinPoint pjp) {
		System.out.println("[공통로그] 비즈니스 로직 수행 전 호출 됨");
			try {
				pjp.proceed(); // 처리 해야하는 메소드 호출됨
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("[공통로그] 비즈니스 로직 수행 후 호출 됨");
		
	}
	
}