package com.spring.console;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.domain.MemberDTO;
import com.spring.service.MemberService;

public class MemberMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		
		MemberService service = (MemberService) ctx.getBean("member");
		
//		List<MemberDTO> list = service.getRows();
//		for(MemberDTO memberDTO : list) {
//			System.out.println(memberDTO);
//		}
		
		// 삽입
//		MemberDTO insert = new MemberDTO("umm123", "umm123", "엄하은", "여", "umm12@gmail.com");
//		System.out.println(service.insertMember(insert)?"성공":"실패");

/*
		// 수정
		MemberDTO updateDto = new MemberDTO();
		updateDto.setUserid("umm123");
		updateDto.setPassword("umm123");
		updateDto.setEmail("umm12@daum.com");
		System.out.println(service.updateMember(updateDto)?"수정 성공":"수정 실패");

*/
		// 삭제
//		System.out.println(service.deleteMember("umm123", "umm123")?"성공":"실패");
		
		// 특정 사람 조회
		System.out.println(service.getRow("kim1234!", "kim12345@"));

	}

}
