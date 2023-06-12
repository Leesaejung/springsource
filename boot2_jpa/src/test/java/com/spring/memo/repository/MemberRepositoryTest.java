package com.spring.memo.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.memo.entity.Member;

@SpringBootTest
public class MemberRepositoryTest {
	
	@Autowired
	private MemberRepository respository;
	
	@Test
	public void createMember() {

		Member member = Member.builder()
				.name("홍길동")
				.email("hong123@gmail.com")
				.password("hong123")
				.address("종로구")
				.build();
		
		Member newMember = respository.save(member);
		System.out.println(newMember);
		
	}
}
