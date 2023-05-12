package com.spring.factorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// AOP : 횡단 관심사 프레임 워크 처리

// 주된 관심사 : factorial 구하기
// 횡단관심사 : 누가 더 빠를까? 시간이 얼마나 걸리는지


public class FactMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		
		Calculator cal = (Calculator) ctx.getBean("rec");
		System.out.println("===================================");
		System.out.println("10 ! = "+cal.factorial(10));
		
		cal = (Calculator) ctx.getBean("forc");
		System.out.println("===================================");
		System.out.println("10 ! = "+cal.factorial(10));

	}

}