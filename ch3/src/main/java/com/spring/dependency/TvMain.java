package com.spring.dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TvMain {
	//String str = "String"; // ==new와 같은 역할

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		
//		TV tv = (TV)ctx.getBean("samsungTV");		@Component 로 생성 시 id는 클래스명 사용(앞자리는 소문자)
		TV tv = (TV)ctx.getBean("tv");	// @Component("tv")
		
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	}
}
