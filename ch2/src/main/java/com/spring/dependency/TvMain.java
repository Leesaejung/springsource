package com.spring.dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TvMain {
	//String str = "String"; // ==new와 같은 역할

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config2.xml");
		
		// 2번 방법 setter 를 사용한 멤버 변수 초기화
		TV tv = (TV)ctx.getBean("tv");
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	}
}
