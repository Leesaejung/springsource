package com.spring.basic;

public class TvMain {

	public static void main(String[] args) {
//		LgTV lgTV = new LgTV();
//		lgTV.turnOn();
//		lgTV.soundUp();
//		lgTV.soundDown();
//		lgTV.turnOff();
		
		TV samsungTV = new SamsungTV(); // new 다음만 변경하면 됨
		samsungTV.powerOn();
		samsungTV.powerOff();
		samsungTV.volumeUp();
		samsungTV.volumeDown();

	}

}
