package com.spring.factorial;

import org.springframework.stereotype.Component;

@Component("forc")
public class ForCalc implements Calculator {

	@Override
	public long factorial(long num) {
		// for문으로 팩토리얼 구하기
		
		int result = 1;
		
		for (int i = 1; i <= num; i++) {
			result *= i;
		}
		
		return result;
	}

}
