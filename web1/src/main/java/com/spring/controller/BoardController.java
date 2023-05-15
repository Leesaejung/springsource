package com.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.domain.BoardDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/board")
public class BoardController {
	
	//@RequestMapping(value="/read", method=RequestMethod.GET)
	@GetMapping("/read")
	public void readGet(HttpServletRequest req) {
		log.info("read 요청");
	}
	
	//@RequestMapping(value="/register", method=RequestMethod.GET)
	@GetMapping("/register")
	public void registerGet(HttpServletRequest req) {
		log.info("register 요청");
	}
	
	// Model == request.setAttribute()
	// RedirectAttributes : 
	// 1. addAttribute() -> 일회성으로 데이터를 전달(객체 상태로 값 전달 불가 - 주소줄에 따라가는 방식)
	// 2. addFlashAttribute() -> 일회성으로 데이터를 전달(session 을 사용함 - 객체 상태로 전달 가능 )
	
	// HttpSession
	
	// BoardDTO 만들기
	// read 이동
	
/*
	@PostMapping("/register")
	public String registerPost(BoardDTO dto, RedirectAttributes rttr) {
		log.info("register 요청"+ dto);
		
		// BoardDTO 값이 유지되려면 forward로 움직여야 함
		// BoardDTO 객체에 담긴 값을 read.jsp 에서 사용하고 싶다면?
		
		// http://localhost:8080/board/read?name=홍길동&password=12345&title=스프링&content=스프링프레임워크
//		rttr.addAttribute("name", dto.getName());
//		rttr.addAttribute("password", dto.getPassword());
//		rttr.addAttribute("title", dto.getTitle());
//		rttr.addAttribute("content", dto.getContent());
		
		// http://localhost:8080/board/read
		rttr.addFlashAttribute("BoardDTO", dto);
		
		return "redirect:/board/read";
	}
*/
	
	// @ModelAttribute("dto") : 괄호 부분은 생략 가능
	//							Model 객체 대신 사용
	//							도메인 객체에 담을 때 이름 지정 가능
	//	registerPost(BoardDTO dto)	:	jsp 페이지에서 값을 가져올 때 ${boardDTO.name}
	//	registerPost(@ModelAttribute("dto") BoardDTO dto) : jsp 페이지에서 값을 가져올 때 ${dto.name}
	
	@PostMapping("/register")
	public void registerPost(@ModelAttribute("dto") BoardDTO dto, RedirectAttributes rttr) {
		log.info("register 요청"+ dto);
		
		// BoardDTO 값이 유지되려면 forward로 움직여야 함
		

	}
	
	//@RequestMapping(value="/modify", method=RequestMethod.GET)
	@GetMapping("/modify")
	public void modifyGet(HttpServletRequest req) {
		log.info("modify 요청");
	}
	
	//@RequestMapping(value="/remove", method=RequestMethod.GET)
	@GetMapping("/remove")
	public void removeGet(HttpServletRequest req) {
		log.info("remove 요청");
	}
}
