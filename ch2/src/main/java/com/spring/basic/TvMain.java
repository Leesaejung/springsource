package com.spring.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TvMain {

	public static void main(String[] args) {
//		LgTV lgTV = new LgTV();
//		lgTV.turnOn();
//		lgTV.soundUp();
//		lgTV.soundDown();
//		lgTV.turnOff();
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		
		TV samsungTV = (TV)ctx.getBean("samsung"); // new 다음만 변경하면 됨
		samsungTV.powerOn();
		samsungTV.powerOff();
		samsungTV.volumeUp();
		samsungTV.volumeDown();

		TV samsungTV2 = (TV)ctx.getBean("samsung"); // new 다음만 변경하면 됨
		
		System.out.println(samsungTV == samsungTV2 ? "같음" : "다름");
	}

}
